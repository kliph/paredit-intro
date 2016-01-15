!SLIDE bullets transition=scrollUp
# Ewwwww
- **Slurp**: Bring an expression into the present form, maintaining
  the structure of the code
- **Barf**: Expel an expression from the present form, maintaining the
  structure of the code

!SLIDE transition=fade
# Slurp Forwards - \^⇧0
    @@@ clojure
    (foo (:bar |:baz) :quux :zot)

    (foo (:bar |:baz :quux) :zot)

!SLIDE transition=fade
# Slurp Backwards - \^⇧9
    @@@ clojure
    (foo :bar (:baz| :quux) :zot)

    (foo (:bar :baz| :quux) :zot)

!SLIDE transition=fade
# Barf Forwards - \^]
    @@@ clojure
    (foo (:bar |:baz :quux) :zot)

    (foo (:bar |:baz) :quux :zot)


!SLIDE transition=fade
# Barf Backwards - \^[
    @@@ clojure
    (foo (:bar |:baz :quux) :zot)

    (foo :bar (|:baz :quux) :zot)


!SLIDE bullets transition=scrollUp
# Keybindings!
Here are some sensible keybindings for Cursive

(Emacs gets them out of the box)

- Slurp Forwards: `^⇧0` or `C-)`
- Slurp Backwards: `^⇧9` or `C-(`
- Barf Forwards: `^]` or `C-]`
- Barf Backwards: `^[` or `C-[`

!SLIDE
# Setting up Cursive keybindings
![Cursive keybindings](https://cursive-ide.com/archive/441/Screen%20Shot%202014-10-01%20at%204.21.16%20PM.png)

!SLIDE bullets
# **Slurping** and **Barfing** work on a variety of datatypes
- Vectors
- Maps
- Strings

!SLIDE bullets transition=scrollUp
# Gotchas
- Deletion
- Getting out of structural editing mode

!SLIDE transition=fade
# Deletion is tricky
    @@@ clojure
    ("zot" q|uux)
    ("zot" |uux)

!SLIDE transition=fade
# Deletion is tricky
    @@@ clojure
    ("zot" quux)|
    ("zot" quux|)

!SLIDE transition=fade
# Deletion is tricky
    @@@ clojure
    ("zot"| quux)
    ("zot|" quux)
    ("zo|" quux)

!SLIDE transition=fade
# Deletion is tricky
    @@@ clojure
    ("zot" (|) quux)
    ("zot" | quux)

!SLIDE transition=scrollUp
# Turning off structural editing mode in Cursive
![cursive screenshot](https://cursive-ide.com/userguide/images/busy-ui.png)

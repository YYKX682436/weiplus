with open("C:/Users/15853/Documents/weip'lu's正式写功能\\app\\src\\main\\java\\com\\muchen\\weiplus\\features\\FakeVoiceDurationFeature.kt", "r", encoding="utf-8") as f:
    content = f.read()

old = """    private fun processVoiceTag(tag: Any, view: View) {
        val now = System.currentTimeMillis()
        val last = processedViews[view] ?: 0L
        if (now - last < 1000) return
        processedViews[view] = now
        mainHandler.postDelayed({
            try {
                val root = view.getMainContainerView() as? ViewGroup ?: (view as? ViewGroup)
                if (root != null) modifyDuration(root)
            } catch (e: Throwable) {
                module.log(Log.ERROR, TAG, "err: ${e.message}")
            }
        }, 150)
    }"""

new = """    private fun processVoiceTag(tag: Any, view: View) {
        val now = System.currentTimeMillis()
        val last = processedViews[view] ?: 0L
        if (now - last < 1000) {
            module.log(Log.DEBUG, TAG, "skip: too soon")
            return
        }
        processedViews[view] = now
        module.log(Log.INFO, TAG, "processVoiceTag: view=${"$"}{view.javaClass.name}")
        mainHandler.postDelayed({
            try {
                var root: ViewGroup? = null
                try {
                    val mcv = view.javaClass.getMethod("getMainContainerView").invoke(view)
                    module.log(Log.INFO, TAG, "getMainContainerView=${"$"}{mcv?.javaClass?.name ?: "null"}")
                    root = mcv as? ViewGroup
                } catch (e: Throwable) {
                    module.log(Log.ERROR, TAG, "getMCV fail: ${"$"}{e.message}")
                }
                if (root == null) root = view as? ViewGroup
                if (root != null) {
                    module.log(Log.INFO, TAG, "root childCount=${"$"}{root.childCount}")
                    modifyDuration(root)
                } else {
                    module.log(Log.WARN, TAG, "root is null")
                }
            } catch (e: Throwable) {
                module.log(Log.ERROR, TAG, "err: ${"$"}{e.message}")
            }
        }, 150)
    }"""

assert old in content, "old processVoiceTag not found!"
content = content.replace(old, new)

with open("C:/Users/15853/Documents/weip'lu's正式写功能\\app\\src\\main\\java\\com\\muchen\\weiplus\\features\\FakeVoiceDurationFeature.kt", "w", encoding="utf-8") as f:
    f.write(content)

print("OK")
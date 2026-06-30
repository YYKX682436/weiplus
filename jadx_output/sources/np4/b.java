package np4;

/* loaded from: classes10.dex */
public abstract class b {
    public static final java.lang.String a(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider) {
        if (recordConfigProvider == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TimelineEditorModelParser", "getFinderClickTabContextId by default:");
            return "";
        }
        java.lang.String string = recordConfigProvider.M.getString("key_click_tab_context_id", "");
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineEditorModelParser", "getFinderClickTabContextId by parse:" + string);
        kotlin.jvm.internal.o.d(string);
        return string;
    }

    public static final java.lang.String b(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider) {
        if (recordConfigProvider == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TimelineEditorModelParser", "getFinderContextId by default:");
            return "";
        }
        java.lang.String string = recordConfigProvider.M.getString("FINDER_CONTEXT_ID", "");
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineEditorModelParser", "getFinderContextId by parse:" + string);
        kotlin.jvm.internal.o.d(string);
        return string;
    }

    public static final java.lang.String c(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider) {
        if (recordConfigProvider == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TimelineEditorModelParser", "getSessionId by default:");
            return "";
        }
        java.lang.String string = recordConfigProvider.M.getString("FINDER_SESSION_ID", "");
        com.tencent.mars.xlog.Log.i("MicroMsg.TimelineEditorModelParser", "getSessionId by parse:" + string);
        kotlin.jvm.internal.o.d(string);
        return string;
    }
}

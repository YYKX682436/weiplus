package je4;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final je4.c f299317a = new je4.c();

    public final java.lang.String a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsMediaDir", "com.tencent.mm.plugin.sns.util.SnsFilePathUtil");
        java.lang.String str = com.tencent.mm.vfs.q7.c("draft") + '/';
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFilePathUtil", "create sns draft dir:" + str + " result:" + com.tencent.mm.vfs.w6.u(str));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsMediaDir", "com.tencent.mm.plugin.sns.util.SnsFilePathUtil");
        return str;
    }

    public final jz5.l b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsMediaPath", "com.tencent.mm.plugin.sns.util.SnsFilePathUtil");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String a17 = a();
        jz5.l lVar = new jz5.l(a17 + "video_" + currentTimeMillis + ".mp4", a17 + "thumb_" + currentTimeMillis + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsMediaPath", "com.tencent.mm.plugin.sns.util.SnsFilePathUtil");
        return lVar;
    }
}

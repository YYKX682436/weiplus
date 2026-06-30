package rq1;

/* loaded from: classes12.dex */
public class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f398771d;

    public n0(java.lang.String str) {
        this.f398771d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            com.tencent.mm.plugin.box.HotWordSearchUtilNative hotWordSearchUtilNative = com.tencent.mm.plugin.box.HotWordSearchUtilNative.INSTANCE;
            if (hotWordSearchUtilNative.updateWordBank(this.f398771d) == 0) {
                hotWordSearchUtilNative.generateBinaryWordLib();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Box.PluginBox", e17, "[updateWordBankRes]", new java.lang.Object[0]);
        }
    }
}

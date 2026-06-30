package mz4;

/* loaded from: classes12.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz4.j0 f333319d;

    public m0(mz4.j0 j0Var) {
        this.f333319d = j0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        mz4.j0 j0Var = this.f333319d;
        long j17 = j0Var.f333303k;
        if (j17 <= 0 || j0Var.f333301i <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Note.WXRTManager", "checkUpdateStorage not match to check favLocalId:%s editBeginTime:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j0Var.f333301i));
            return;
        }
        java.lang.String p17 = ((com.tencent.mm.plugin.wenote.ui.nativenote.NoteEditorUI) j0Var.f333300h).J1.p(false);
        boolean e17 = j0Var.e("checkUpdateStorageInner");
        com.tencent.mars.xlog.Log.i("MicroMsg.Note.WXRTManager", "checkUpdateStorage() called isSameHtmlContent:%b", java.lang.Boolean.valueOf(e17));
        if (e17) {
            return;
        }
        j0Var.f333302j = p17;
        if (j0Var.f333305m) {
            j0Var.m(p17, false);
        } else {
            j0Var.f333305m = true;
            j0Var.m(p17, true);
        }
    }
}

package wn4;

/* loaded from: classes11.dex */
public final class q implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final wn4.q f447561a = new wn4.q();

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        wn4.x xVar = wn4.x.f447571a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.ManualUpdaterProcessor", "hotPatchInstallSuccessDialog click " + z17);
        if (!z17 || k35.p.f303943a == null) {
            return;
        }
        com.tencent.mm.ui.vb.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }
}

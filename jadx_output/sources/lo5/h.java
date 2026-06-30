package lo5;

/* loaded from: classes14.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public lo5.a f320214a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f320215b;

    /* renamed from: c, reason: collision with root package name */
    public final lo5.m f320216c = new lo5.m(new lo5.c(this), new lo5.d(this));

    public static /* synthetic */ void b(lo5.h hVar, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        hVar.a(z17);
    }

    public final void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VoIPMPFloatCardController", "dismissFloatCard: ");
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f320215b;
        if (j0Var != null) {
            j0Var.dismiss();
        }
        this.f320215b = null;
        if (z17) {
            lo5.m mVar = this.f320216c;
            wu5.c cVar = mVar.f301222w;
            if (cVar != null) {
                cVar.cancel(false);
            }
            mVar.f301222w = null;
        }
        jq4.z0.c(this.f320216c, false, false, false, 3, null);
    }
}

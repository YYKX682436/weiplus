package xf2;

/* loaded from: classes8.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f454287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView f454289f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.ui.widget.dialog.k0 k0Var, java.lang.String str, com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView shellView) {
        super(1);
        this.f454287d = k0Var;
        this.f454288e = str;
        this.f454289f = shellView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        java.lang.String str = (java.lang.String) obj;
        this.f454287d.u();
        int i17 = com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView.f111617i;
        java.lang.String str2 = this.f454288e;
        if (str2 == null || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            bitmap = null;
        } else {
            android.graphics.Bitmap j07 = com.tencent.mm.sdk.platformtools.x.j0(str2, 140, 140, i65.a.g(com.tencent.mm.sdk.platformtools.x2.f193071a));
            int orientationInDegree = com.tencent.mm.compatible.util.Exif.fromFile(str2).getOrientationInDegree();
            if (orientationInDegree < 0) {
                orientationInDegree = 0;
            }
            bitmap = com.tencent.mm.sdk.platformtools.x.w0(j07, orientationInDegree);
        }
        android.graphics.Bitmap bitmap2 = bitmap;
        o25.q1 q1Var = (o25.q1) i95.n0.c(o25.q1.class);
        com.tencent.mm.plugin.finder.live.controller.screenshotshare.view.ShellView shellView = this.f454289f;
        ((r35.k1) q1Var).Ni(shellView.getContext(), str, bitmap2, shellView.getContext().getString(com.tencent.mm.R.string.f490551ya), 3, new xf2.k(str, shellView, str2)).show();
        return jz5.f0.f302826a;
    }
}

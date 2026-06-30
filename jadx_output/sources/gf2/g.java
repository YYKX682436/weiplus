package gf2;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f271280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f271281e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView f271282f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.p f271283g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.ui.widget.dialog.k0 k0Var, java.lang.String str, com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView, yz5.p pVar) {
        super(1);
        this.f271280d = k0Var;
        this.f271281e = str;
        this.f271282f = anchorMilestoneShareView;
        this.f271283g = pVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap;
        java.lang.String str = (java.lang.String) obj;
        this.f271280d.u();
        int i17 = com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView.f111571t;
        java.lang.String str2 = this.f271281e;
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
        com.tencent.mm.plugin.finder.live.controller.anchormilestoneshare.view.AnchorMilestoneShareView anchorMilestoneShareView = this.f271282f;
        ((r35.k1) q1Var).Ni(anchorMilestoneShareView.getContext(), str, bitmap2, anchorMilestoneShareView.getContext().getString(com.tencent.mm.R.string.f490551ya), 3, new gf2.f(str, anchorMilestoneShareView, str2, this.f271283g)).show();
        return jz5.f0.f302826a;
    }
}

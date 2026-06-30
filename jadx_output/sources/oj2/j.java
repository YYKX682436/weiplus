package oj2;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj2.l f345772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345773e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(oj2.l lVar, java.lang.String str) {
        super(0);
        this.f345772d = lVar;
        this.f345773e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        oj2.l lVar = this.f345772d;
        android.widget.ImageView anchorAudioCoverView = lVar.getAnchorAudioCoverView();
        if (anchorAudioCoverView != null) {
            anchorAudioCoverView.setVisibility(0);
        }
        java.lang.String str = this.f345773e;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (com.tencent.mm.vfs.w6.j(str == null ? "" : str)) {
                com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str != null ? str : "");
                java.lang.String str2 = a17.f213279f;
                if (str2 != null) {
                    java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
                    if (!str2.equals(l17)) {
                        a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                    }
                }
                java.io.InputStream D = com.tencent.mm.vfs.w6.D(a17, com.tencent.mm.vfs.a3.f212781a.m(a17, null));
                kotlin.jvm.internal.o.f(D, "openRead(...)");
                android.graphics.Bitmap O = com.tencent.mm.sdk.platformtools.x.O(D);
                android.widget.ImageView anchorAudioCoverView2 = lVar.getAnchorAudioCoverView();
                if (anchorAudioCoverView2 != null) {
                    anchorAudioCoverView2.setImageDrawable(new android.graphics.drawable.BitmapDrawable(lVar.getContext().getResources(), O));
                }
                lj2.t0 a07 = lVar.getPluginAbility().a0();
                kotlin.jvm.internal.o.d(O);
                a07.D(O);
                com.tencent.mars.xlog.Log.i(lVar.getTAG(), "liveCoverUrl:" + str + ", business(LiveCommonSlice::class.java).audioModeHolderBm:" + lVar.getPluginAbility().a0().f());
                return jz5.f0.f302826a;
            }
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            wo0.c a18 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.j0(str != null ? str : ""));
            a18.f447873d = new oj2.i(lVar);
            a18.f();
        }
        com.tencent.mars.xlog.Log.i(lVar.getTAG(), "liveCoverUrl:" + str + ", business(LiveCommonSlice::class.java).audioModeHolderBm:" + lVar.getPluginAbility().a0().f());
        return jz5.f0.f302826a;
    }
}

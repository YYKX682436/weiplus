package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class e implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f115480a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f115481b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f115482c;

    public e(android.view.View view, yz5.l lVar, kotlin.jvm.internal.h0 h0Var) {
        this.f115480a = view;
        this.f115481b = lVar;
        this.f115482c = h0Var;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap == null) {
            com.tencent.mm.plugin.finder.live.util.i iVar = com.tencent.mm.plugin.finder.live.util.i.f115540a;
            com.tencent.mars.xlog.Log.i("BlurAvatarUtil", "loadAvatarBlurBg resource is null!");
            yz5.l lVar = this.f115481b;
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.FALSE);
                return;
            }
            return;
        }
        zl2.r4 r4Var = zl2.r4.f473950a;
        android.view.View view = this.f115480a;
        com.tencent.mm.plugin.finder.live.util.d dVar = new com.tencent.mm.plugin.finder.live.util.d(this.f115482c, bitmap, this.f115481b);
        kotlin.jvm.internal.o.g(view, "view");
        int color = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_6);
        zl2.g3 g3Var = new zl2.g3(view, dVar);
        ((ku5.t0) ku5.t0.f312615d).g(new po0.d(bitmap, g3Var, 8.0f, color));
    }
}

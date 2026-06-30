package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class p2 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f182595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f182596e;

    public p2(com.tencent.mm.plugin.webview.luggage.q2 q2Var, android.widget.ImageView imageView, android.widget.ImageView imageView2) {
        this.f182595d = imageView;
        this.f182596e = imageView2;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        java.lang.String str = ((com.tencent.mm.ipcinvoker.type.IPCString) obj).f68406d;
        java.util.HashMap hashMap = com.tencent.mm.plugin.webview.ui.tools.a1.f183889a;
        final android.graphics.Bitmap s07 = com.tencent.mm.sdk.platformtools.x.s0(hy4.z.f286206a.a(str), true, r5.getWidth() * 0.1f);
        ku5.u0 u0Var = ku5.t0.f312615d;
        final android.widget.ImageView imageView = this.f182595d;
        final android.widget.ImageView imageView2 = this.f182596e;
        ((ku5.t0) u0Var).B(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.webview.luggage.p2$$a
            @Override // java.lang.Runnable
            public final void run() {
                imageView.setVisibility(8);
                android.widget.ImageView imageView3 = imageView2;
                imageView3.setImageBitmap(s07);
                imageView3.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
            }
        });
    }
}

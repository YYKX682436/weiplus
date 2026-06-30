package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class vb0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f114702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f114703e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dc0 f114704f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cm2.g0 f114705g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f114706h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vb0(android.graphics.Bitmap bitmap, android.widget.ImageView imageView, com.tencent.mm.plugin.finder.live.plugin.dc0 dc0Var, cm2.g0 g0Var, android.view.View view) {
        super(0);
        this.f114702d = bitmap;
        this.f114703e = imageView;
        this.f114704f = dc0Var;
        this.f114705g = g0Var;
        this.f114706h = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.dc0 dc0Var = this.f114704f;
        android.graphics.Bitmap bitmap = this.f114702d;
        if (bitmap != null) {
            this.f114703e.setImageBitmap(bitmap);
        } else {
            com.tencent.mars.xlog.Log.i(dc0Var.f112258h, "resource is null!");
        }
        android.view.View itemView = this.f114706h;
        kotlin.jvm.internal.o.f(itemView, "$itemView");
        android.graphics.Bitmap bitmap2 = this.f114702d;
        cm2.g0 g0Var = this.f114705g;
        boolean z17 = g0Var.f43346v.getBoolean(2);
        dc0Var.getClass();
        r45.qy1 qy1Var = g0Var.f43346v;
        java.lang.String string = qy1Var.getString(1);
        if (string == null || string.length() == 0) {
            bw5.mb0 P0 = zl2.r4.f473950a.P0(qy1Var);
            java.lang.String c17 = P0 != null ? P0.c() : null;
            dc0Var.d(c17 == null ? "" : c17, itemView, bitmap2, g0Var, z17);
        } else {
            mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
            java.lang.String string2 = qy1Var.getString(1);
            wo0.c a17 = d1Var.a(new mn2.q3(string2 != null ? string2 : "", com.tencent.mm.plugin.finder.storage.y90.f128356f));
            a17.f447873d = new com.tencent.mm.plugin.finder.live.plugin.bc0(itemView, dc0Var, g0Var, z17, bitmap2);
            a17.f();
        }
        return jz5.f0.f302826a;
    }
}

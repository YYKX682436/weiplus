package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f159019d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(android.content.Context context) {
        super(1);
        this.f159019d = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.res.AssetManager assets = (android.content.res.AssetManager) obj;
        kotlin.jvm.internal.o.g(assets, "assets");
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(this.f159019d.getFilesDir().getParent() + "/scan_goods/");
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.b3 b3Var = com.tencent.mm.vfs.a3.f212781a;
        com.tencent.mm.vfs.z2 m17 = b3Var.m(a17, null);
        if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
            com.tencent.mm.vfs.z2 m18 = b3Var.m(a17, m17);
            if (m18.a()) {
                m18.f213266a.r(m18.f213267b);
            }
        }
        return jz5.f0.f302826a;
    }
}

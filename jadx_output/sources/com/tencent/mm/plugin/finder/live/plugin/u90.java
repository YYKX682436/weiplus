package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class u90 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ea0 f114539d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f114540e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f114541f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f114542g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u90(com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var, so2.j5 j5Var, boolean z17, boolean z18) {
        super(0);
        this.f114539d = ea0Var;
        this.f114540e = j5Var;
        this.f114541f = z17;
        this.f114542g = z18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var = this.f114539d;
        java.lang.String str = ea0Var.f112390t;
        cm2.m0 m0Var = (cm2.m0) this.f114540e;
        java.lang.String string = m0Var.f43368v.getString(17);
        if (string == null) {
            string = "";
        }
        com.tencent.mars.xlog.Log.i(str, "shop report requestId bubbleClick, ".concat(string));
        mm2.c1 c1Var = (mm2.c1) ea0Var.P0(mm2.c1.class);
        java.lang.String string2 = m0Var.f43368v.getString(17);
        c1Var.y9(string2 != null ? string2 : "");
        ea0Var.A1(m0Var, this.f114541f, this.f114542g);
        return jz5.f0.f302826a;
    }
}

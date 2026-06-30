package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class o3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f113697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f113698e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f113699f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f113700g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var, boolean z17, boolean z18, boolean z19) {
        super(1);
        this.f113697d = v3Var;
        this.f113698e = z17;
        this.f113699f = z18;
        this.f113700g = z19;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", "set auto replay gen");
            com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f113697d;
            com.tencent.mm.plugin.finder.live.plugin.v3.v1(v3Var, this.f113698e, this.f113699f, this.f113700g, true, new com.tencent.mm.plugin.finder.live.plugin.n3(v3Var));
        }
        return jz5.f0.f302826a;
    }
}

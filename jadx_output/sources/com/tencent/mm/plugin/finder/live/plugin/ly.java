package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ly extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ty f113445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f113446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f113447f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.x71 f113448g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly(com.tencent.mm.plugin.finder.live.plugin.ty tyVar, int i17, int i18, r45.x71 x71Var) {
        super(0);
        this.f113445d = tyVar;
        this.f113446e = i17;
        this.f113447f = i18;
        this.f113448g = x71Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.ty tyVar = this.f113445d;
        if (tyVar.w0() == 0) {
            if (this.f113446e == 0 && this.f113447f == 0) {
                tyVar.y1(this.f113448g, false);
            } else {
                tyVar.x1();
            }
        }
        return jz5.f0.f302826a;
    }
}

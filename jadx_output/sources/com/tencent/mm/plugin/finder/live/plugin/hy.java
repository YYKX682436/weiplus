package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class hy extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ty f112875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f112876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f112877f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.x71 f112878g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy(com.tencent.mm.plugin.finder.live.plugin.ty tyVar, int i17, int i18, r45.x71 x71Var) {
        super(0);
        this.f112875d = tyVar;
        this.f112876e = i17;
        this.f112877f = i18;
        this.f112878g = x71Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.ty tyVar = this.f112875d;
        if (tyVar.w0() == 0) {
            if (this.f112876e == 0 && this.f112877f == 0) {
                tyVar.y1(this.f112878g, false);
            } else {
                tyVar.x1();
            }
        }
        return jz5.f0.f302826a;
    }
}

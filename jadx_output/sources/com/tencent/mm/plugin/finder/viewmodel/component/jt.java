package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class jt extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb2.a1 f134894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f134895e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f134896f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jt(bb2.a1 a1Var, long j17, boolean z17) {
        super(0);
        this.f134894d = a1Var;
        this.f134895e = j17;
        this.f134896f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bb2.a1 a1Var = this.f134894d;
        a1Var.getBulletManager().n(this.f134895e, this.f134896f, false);
        a1Var.setReuse(false);
        return jz5.f0.f302826a;
    }
}

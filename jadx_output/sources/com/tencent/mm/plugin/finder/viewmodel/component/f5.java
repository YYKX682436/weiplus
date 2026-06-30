package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class f5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC f134331d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134332e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f134333f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f134334g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC, java.lang.String str, int i17, long j17) {
        super(0);
        this.f134331d = finderBulletUIC;
        this.f134332e = str;
        this.f134333f = i17;
        this.f134334g = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bb2.w1 bulletManager;
        com.tencent.mm.plugin.finder.viewmodel.component.FinderBulletUIC finderBulletUIC = this.f134331d;
        bb2.a1 a1Var = finderBulletUIC.f133504q;
        if (a1Var != null && (bulletManager = a1Var.getBulletManager()) != null) {
            bb2.w1.k(bulletManager, this.f134332e, finderBulletUIC.a7(), this.f134333f, 0L, this.f134334g, 0L, false, 104, null);
        }
        return jz5.f0.f302826a;
    }
}

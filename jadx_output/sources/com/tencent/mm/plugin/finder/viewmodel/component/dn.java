package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class dn extends ym5.q3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f134151a = true;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.mn f134152b;

    public dn(com.tencent.mm.plugin.finder.viewmodel.component.mn mnVar) {
        this.f134152b = mnVar;
    }

    @Override // ym5.q3
    public void a(int i17) {
        if (!this.f134151a || i17 <= 0) {
            return;
        }
        this.f134151a = false;
    }

    @Override // ym5.q3
    public void b(int i17) {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.viewmodel.component.bn(this.f134152b));
    }

    @Override // ym5.q3
    public void c(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f134152b.V6(false);
    }

    @Override // ym5.q3
    public void d(int i17, rn5.a aVar, boolean z17) {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.finder.viewmodel.component.cn(this.f134152b));
    }

    @Override // ym5.q3
    public void e(ym5.s3 reason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        this.f134152b.V6(false);
    }
}

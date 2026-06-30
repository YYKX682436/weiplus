package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class v50 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.m1 f120038d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v50(yf2.m1 m1Var) {
        super(0);
        this.f120038d = m1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yf2.m1 m1Var = this.f120038d;
        return java.lang.Boolean.valueOf(m1Var != null ? ((mm2.c1) m1Var.business(mm2.c1.class)).l7() : false);
    }
}

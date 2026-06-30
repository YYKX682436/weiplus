package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class p20 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.e30 f119348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f119349e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p20(com.tencent.mm.plugin.finder.live.widget.e30 e30Var, android.os.Bundle bundle) {
        super(0);
        this.f119348d = e30Var;
        this.f119349e = bundle;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f119348d.f118211p.statusChange(qo0.b.M, this.f119349e);
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f135409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f135410e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f135411f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(com.tencent.mm.protocal.protobuf.FinderObject finderObject, long j17, boolean z17) {
        super(0);
        this.f135409d = finderObject;
        this.f135410e = j17;
        this.f135411f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return "feedId=" + pm0.v.u(this.f135409d.getId()) + " aid=" + this.f135410e + " hasComponent=" + this.f135411f;
    }
}

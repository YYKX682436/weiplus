package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class h7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k7 f116352d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(com.tencent.mm.plugin.finder.live.view.k7 k7Var) {
        super(1);
        this.f116352d = k7Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        java.util.List list = this.f116352d.K;
        return java.lang.Boolean.valueOf(list != null ? kz5.n0.O(list, str) : false);
    }
}

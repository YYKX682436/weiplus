package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p1 f121844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f121846f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p1 p1Var, java.lang.String str, r45.h32 h32Var) {
        super(2);
        this.f121844d = p1Var;
        this.f121845e = str;
        this.f121846f = h32Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Boolean) obj2).booleanValue();
        tx2.i0 q17 = this.f121844d.q();
        java.lang.String username = this.f121845e;
        kotlin.jvm.internal.o.f(username, "$username");
        r45.h32 noticeInfo = this.f121846f;
        kotlin.jvm.internal.o.f(noticeInfo, "$noticeInfo");
        q17.z(username, noticeInfo, null);
        return jz5.f0.f302826a;
    }
}

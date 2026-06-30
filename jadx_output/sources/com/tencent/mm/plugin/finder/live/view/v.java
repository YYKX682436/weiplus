package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k0 f116724d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.finder.live.view.k0 k0Var) {
        super(1);
        this.f116724d = k0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.String uId = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(uId, "uId");
        java.util.List Z6 = ((mm2.o4) this.f116724d.business(mm2.o4.class)).Z6();
        kotlin.jvm.internal.o.f(Z6, "<get-allLinkMicUserList>(...)");
        synchronized (Z6) {
            java.util.Iterator it = Z6.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                if (kotlin.jvm.internal.o.b(((km2.q) obj2).f309170a, uId)) {
                    break;
                }
            }
        }
        return (km2.q) obj2;
    }
}

package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes2.dex */
public final class ka0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.la0 f127061d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka0(com.tencent.mm.plugin.finder.storage.la0 la0Var) {
        super(0);
        this.f127061d = la0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderMixLocalItem_");
        com.tencent.mm.plugin.finder.storage.la0 la0Var = this.f127061d;
        sb6.append(la0Var.f127124a.getInteger(0));
        sb6.append('_');
        java.lang.String string = la0Var.f127124a.getString(1);
        if (string == null) {
            string = "";
        }
        sb6.append(string);
        return java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.w2.a(sb6.toString()).hashCode());
    }
}

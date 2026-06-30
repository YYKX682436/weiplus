package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class eu extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.iv f112466d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu(com.tencent.mm.plugin.finder.live.plugin.iv ivVar) {
        super(2);
        this.f112466d = ivVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        com.tencent.mm.plugin.finder.live.plugin.iv ivVar = this.f112466d;
        if (booleanValue) {
            qo0.c.a(ivVar.f113015q, qo0.b.f365339d2, null, 2, null);
            java.lang.String string = ivVar.B.getString(booleanValue2 ? com.tencent.mm.R.string.e7p : com.tencent.mm.R.string.e7n);
            kotlin.jvm.internal.o.d(string);
            db5.t7.makeText(ivVar.R0().getContext(), string, 0).show();
        } else {
            java.lang.String string2 = ivVar.B.getString(com.tencent.mm.R.string.e7a);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            java.lang.String string3 = ivVar.B.getString(booleanValue2 ? com.tencent.mm.R.string.e7i : com.tencent.mm.R.string.e7o);
            kotlin.jvm.internal.o.d(string3);
            db5.t7.makeText(ivVar.R0().getContext(), string2.concat(string3), 0).show();
        }
        return jz5.f0.f302826a;
    }
}

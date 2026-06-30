package kc5;

/* loaded from: classes3.dex */
public final class o implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f306570a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f306571b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kc5.s f306572c;

    public o(yz5.a aVar, yz5.a aVar2, kc5.s sVar) {
        this.f306570a = aVar;
        this.f306571b = aVar2;
        this.f306572c = sVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.util.List list = (java.util.List) this.f306570a.invoke();
        jz5.l lVar = (jz5.l) this.f306571b.invoke();
        boolean booleanValue = ((java.lang.Boolean) lVar.f302833d).booleanValue();
        int intValue = ((java.lang.Number) lVar.f302834e).intValue();
        kc5.s sVar = this.f306572c;
        kotlin.jvm.internal.o.d(str);
        return kc5.s.Bi(sVar, str, list, null, booleanValue, intValue, 4, null);
    }
}

package kc5;

/* loaded from: classes3.dex */
public final class p implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f306573a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kc5.s f306574b;

    public p(yz5.a aVar, kc5.s sVar) {
        this.f306573a = aVar;
        this.f306574b = sVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.util.List list = (java.util.List) this.f306573a.invoke();
        kc5.s sVar = this.f306574b;
        kotlin.jvm.internal.o.d(str);
        return kc5.s.Bi(sVar, str, list, null, false, 0, 28, null);
    }
}

package f26;

/* loaded from: classes7.dex */
public final class k0 implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f259183d;

    public k0(yz5.l lVar) {
        this.f259183d = lVar;
    }

    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        f26.o0 o0Var = (f26.o0) obj;
        kotlin.jvm.internal.o.d(o0Var);
        yz5.l lVar = this.f259183d;
        java.lang.String obj3 = lVar.invoke(o0Var).toString();
        f26.o0 o0Var2 = (f26.o0) obj2;
        kotlin.jvm.internal.o.d(o0Var2);
        return mz5.a.b(obj3, lVar.invoke(o0Var2).toString());
    }
}

package nc5;

/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f336231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f336232e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(yz5.l lVar, java.util.ArrayList arrayList) {
        super(1);
        this.f336231d = lVar;
        this.f336232e = arrayList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object first = ((android.util.Pair) this.f336232e.get(((java.lang.Number) obj).intValue())).first;
        kotlin.jvm.internal.o.f(first, "first");
        this.f336231d.invoke(first);
        return jz5.f0.f302826a;
    }
}

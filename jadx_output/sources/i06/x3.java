package i06;

/* loaded from: classes15.dex */
public final class x3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i06.y3 f286791d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(i06.y3 y3Var) {
        super(0);
        this.f286791d = y3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List upperBounds = this.f286791d.f286802d.getUpperBounds();
        kotlin.jvm.internal.o.f(upperBounds, "getUpperBounds(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(upperBounds, 10));
        java.util.Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            arrayList.add(new i06.w3((f26.o0) it.next(), null, 2, null));
        }
        return arrayList;
    }
}

package gc0;

/* loaded from: classes.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final gc0.b1 f270101d = new gc0.b1();

    public b1() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String finishData = (java.lang.String) obj;
        java.util.List chooseData = (java.util.List) obj2;
        kotlin.jvm.internal.o.g(finishData, "finishData");
        kotlin.jvm.internal.o.g(chooseData, "chooseData");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(chooseData, 10));
        java.util.Iterator it = chooseData.iterator();
        while (it.hasNext()) {
            arrayList.add(((r45.kl5) it.next()).getString(0));
        }
        java.util.Iterator it6 = arrayList.iterator();
        boolean z17 = true;
        while (it6.hasNext()) {
            java.lang.String str = (java.lang.String) it6.next();
            kotlin.jvm.internal.o.d(str);
            if (!r26.n0.B(finishData, str, false)) {
                z17 = false;
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}

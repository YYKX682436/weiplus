package gc0;

/* loaded from: classes.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final gc0.a1 f270088d = new gc0.a1();

    public a1() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        java.util.List finishData = (java.util.List) obj;
        java.util.List chooseData = (java.util.List) obj2;
        kotlin.jvm.internal.o.g(finishData, "finishData");
        kotlin.jvm.internal.o.g(chooseData, "chooseData");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(chooseData, 10));
        java.util.Iterator it = chooseData.iterator();
        while (true) {
            z17 = true;
            if (!it.hasNext()) {
                break;
            }
            arrayList.add(((r45.kl5) it.next()).getString(1));
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            if (!finishData.contains((java.lang.String) it6.next())) {
                z17 = false;
            }
        }
        return java.lang.Boolean.valueOf(z17);
    }
}

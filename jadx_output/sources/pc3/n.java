package pc3;

/* loaded from: classes7.dex */
public final /* synthetic */ class n extends kotlin.jvm.internal.m implements yz5.p {
    public n(java.lang.Object obj) {
        super(2, obj, pc3.t.class, "onBizPauseStateChange", "onBizPauseStateChange(Ljava/lang/String;Z)V", 0);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String p07 = (java.lang.String) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        kotlin.jvm.internal.o.g(p07, "p0");
        java.util.Collection values = ((pc3.t) this.receiver).f353402h.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj3 : values) {
            if (obj3 instanceof sc3.q1) {
                arrayList.add(obj3);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            sc3.q1 q1Var = (sc3.q1) it.next();
            synchronized (q1Var) {
                java.util.Set set = q1Var.f406526y0;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj4 : set) {
                    if (kotlin.jvm.internal.o.b(((sc3.l1) obj4).f406497a, p07)) {
                        arrayList2.add(obj4);
                    }
                }
                java.util.Iterator it6 = arrayList2.iterator();
                boolean z17 = false;
                while (it6.hasNext()) {
                    sc3.l1 l1Var = (sc3.l1) it6.next();
                    com.tencent.mars.xlog.Log.i(q1Var.Q, p07 + " changed to pause? " + booleanValue);
                    l1Var.f406498b = booleanValue;
                    z17 = true;
                }
                if (z17) {
                    q1Var.B1();
                }
            }
        }
        return jz5.f0.f302826a;
    }
}

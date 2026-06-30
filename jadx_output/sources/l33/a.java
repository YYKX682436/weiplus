package l33;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final l33.a f315426d = new l33.a();

    public a() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.util.List list = (java.util.List) obj2;
        kotlin.jvm.internal.o.g(list, "list");
        if (booleanValue) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj3 : list) {
                y53.m mVar = ((z53.i) obj3).F;
                if (mVar != null && mVar.field_accountType == 2) {
                    arrayList.add(obj3);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((z53.i) it.next()).field_sessionId);
            }
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Bi((java.lang.String) it6.next());
            }
            com.tencent.mars.xlog.Log.i("GameAccountManager", "gamelog.account, manage, delete gamelife conversation size = " + arrayList2.size());
        }
        return jz5.f0.f302826a;
    }
}

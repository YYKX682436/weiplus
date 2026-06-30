package cp4;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.r f220995d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(cp4.r rVar) {
        super(4);
        this.f220995d = rVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String key = (java.lang.String) obj2;
        int intValue2 = ((java.lang.Number) obj3).intValue();
        java.util.ArrayList arrayList = (java.util.ArrayList) obj4;
        kotlin.jvm.internal.o.g(key, "key");
        cp4.r rVar = this.f220995d;
        synchronized (rVar.f221072w) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callback key:");
            sb6.append(key);
            sb6.append(" ret:");
            sb6.append(intValue2);
            sb6.append(" size:");
            sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.EditorCaptionPlugin", sb6.toString());
            if (intValue2 != 0) {
                ((java.util.HashSet) rVar.f221069t.get(intValue)).add(key);
                if (((java.util.HashSet) rVar.f221069t.get(intValue)).size() >= ((java.util.HashMap) rVar.f221066q.get(intValue)).size()) {
                    int i17 = intValue2 == -2 ? com.tencent.mm.R.string.k87 : com.tencent.mm.R.string.f493449k84;
                    android.content.Context context = rVar.f221060h;
                    db5.t7.makeText(context, i65.a.r(context, i17), 0).show();
                    rVar.D().i(intValue, i65.a.r(rVar.f221060h, com.tencent.mm.R.string.k6k));
                    rVar.f221071v = true;
                }
            }
            rVar.E(intValue);
            rVar.G(intValue);
        }
        return jz5.f0.f302826a;
    }
}

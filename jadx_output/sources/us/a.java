package us;

@j95.b
/* loaded from: classes4.dex */
public class a extends i95.w implements vs.e {
    public java.util.List Ai() {
        java.util.Set<java.util.Map.Entry> entrySet = ((java.util.HashMap) g81.e.Ai().wi().f195018d).entrySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : entrySet) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) entry.getValue())) {
                arrayList.add((java.lang.String) entry.getKey());
            }
        }
        return arrayList;
    }

    public void Bi(java.lang.String str, int i17, java.lang.String str2) {
        g81.e.Ai().wi().D0(str, i17, str2);
    }

    public void wi(java.util.List list) {
        com.tencent.mm.storage.i wi6 = g81.e.Ai().wi();
        wi6.getClass();
        if (list == null || list.size() == 0) {
            return;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(java.lang.Thread.currentThread().getId());
        l75.k0 k0Var = wi6.f195019e;
        long F = k0Var.F(valueOf);
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            wi6.replace((dm.o) it.next());
        }
        k0Var.w(java.lang.Long.valueOf(F));
    }
}

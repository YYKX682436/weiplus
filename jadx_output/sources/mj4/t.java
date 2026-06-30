package mj4;

/* loaded from: classes11.dex */
public final class t implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        ai4.e eVar = (ai4.e) obj2;
        ai4.e eVar2 = (ai4.e) obj;
        return mz5.a.b(java.lang.Integer.valueOf(eVar.f5135b.size() > 0 ? ((mj4.k) ((mj4.h) eVar.f5135b.get(0))).f327067b.field_CreateTime : 0), java.lang.Integer.valueOf(eVar2.f5135b.size() > 0 ? ((mj4.k) ((mj4.h) eVar2.f5135b.get(0))).f327067b.field_CreateTime : 0));
    }
}

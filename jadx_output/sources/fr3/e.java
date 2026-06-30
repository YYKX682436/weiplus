package fr3;

/* loaded from: classes10.dex */
public final class e implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fr3.f f265791a;

    public e(fr3.f fVar) {
        this.f265791a = fVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar == null) {
            return null;
        }
        com.tencent.mars.xlog.Log.i("MVI_Model", "getInfrequentContact() called " + fVar.f70615a + ' ' + fVar.f70616b);
        int i17 = fVar.f70615a;
        fr3.f fVar2 = this.f265791a;
        if (i17 != 0 || fVar.f70616b != 0) {
            androidx.appcompat.app.AppCompatActivity activity = fVar2.getActivity();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
            e4Var.f211776c = fVar2.getString(com.tencent.mm.R.string.k2u);
            e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
            e4Var.c();
            return fVar;
        }
        r45.hh3 hh3Var = (r45.hh3) fVar.f70618d;
        if (hh3Var == null) {
            return fVar;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getInfrequentContact() rsp back ok lastContext:");
        java.lang.String str = fVar2.f265794f;
        int i19 = 0;
        sb6.append(!(str == null || r26.n0.N(str)));
        com.tencent.mars.xlog.Log.i("MVI_Model", sb6.toString());
        fVar2.f265794f = hh3Var.f376148e;
        java.util.LinkedList infrequent_contact_list = hh3Var.f376147d;
        kotlin.jvm.internal.o.f(infrequent_contact_list, "infrequent_contact_list");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(infrequent_contact_list, 10));
        java.util.Iterator it = infrequent_contact_list.iterator();
        while (it.hasNext()) {
            arrayList.add(((r45.qz3) it.next()).f384361d);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        kz5.n0.O0(arrayList, arrayList2);
        java.util.List d17 = g95.x.f269827a.d(kz5.c0.i(dm.i2.L, dm.i2.Q, dm.i2.T), arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(d17, 10));
        java.util.Iterator it6 = ((java.util.ArrayList) d17).iterator();
        while (it6.hasNext()) {
            arrayList3.add(java.lang.Long.valueOf(((com.tencent.mm.storage.l4) it6.next()).w0()));
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            java.lang.Object next = it7.next();
            int i27 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String str2 = (java.lang.String) next;
            kotlin.jvm.internal.o.d(str2);
            fr3.a aVar = new fr3.a(str2, 0L, null, 0L, 14, null);
            java.lang.Long l17 = (java.lang.Long) kz5.n0.a0(arrayList3, i19);
            if (l17 != null) {
                aVar.f265781b = l17.longValue();
            }
            arrayList4.add(aVar);
            i19 = i27;
        }
        kotlinx.coroutines.l.d(androidx.lifecycle.d1.a(fVar2), null, null, new fr3.d(fVar2, arrayList4, null), 3, null);
        return fVar;
    }
}

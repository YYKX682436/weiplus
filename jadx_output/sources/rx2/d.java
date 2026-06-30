package rx2;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public int f400968d;

    /* renamed from: e, reason: collision with root package name */
    public int f400969e;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f400965a = new java.util.HashMap(5);

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f400966b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f400967c = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f400970f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f400971g = new java.util.HashMap();

    public final void a(r45.gb4 gb4Var) {
        if (gb4Var != null) {
            java.util.HashMap hashMap = this.f400965a;
            java.lang.String string = gb4Var.getString(2);
            if (string == null) {
                string = "";
            }
            hashMap.put(string, gb4Var);
        }
    }

    public final void b(java.lang.String curDesc, android.text.Editable s17) {
        kotlin.jvm.internal.o.g(curDesc, "curDesc");
        kotlin.jvm.internal.o.g(s17, "s");
        java.util.ArrayList arrayList = this.f400966b;
        arrayList.clear();
        java.util.ArrayList arrayList2 = this.f400967c;
        arrayList2.clear();
        jz5.l i17 = hc2.x0.i(curDesc, this.f400965a, true, new rx2.c(s17));
        arrayList.addAll((java.util.Collection) i17.f302833d);
        arrayList2.addAll((java.util.Collection) i17.f302834e);
        kz5.h0.B(this.f400970f, new rx2.b(this));
    }

    public final java.util.ArrayList c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.f400966b;
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            r45.gb4 gb4Var = (r45.gb4) it.next();
            arrayList.add(gb4Var);
            java.util.ArrayList arrayList3 = (java.util.ArrayList) this.f400971g.get(gb4Var.getString(2));
            if (arrayList3 == null) {
                gb4Var.set(5, 5);
            } else if (arrayList3.size() > 0) {
                java.lang.Object remove = arrayList3.remove(0);
                kotlin.jvm.internal.o.f(remove, "removeAt(...)");
                gb4Var.set(5, java.lang.Integer.valueOf(((java.lang.Number) remove).intValue()));
            }
        }
        return arrayList2;
    }

    public final void d(int i17, java.lang.String nickname) {
        kotlin.jvm.internal.o.g(nickname, "nickname");
        this.f400968d++;
        if (i17 != 0) {
            this.f400969e++;
            this.f400970f.add(new jz5.l(nickname, java.lang.Integer.valueOf(i17)));
            java.util.HashMap hashMap = this.f400971g;
            java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(nickname);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
            }
            arrayList.add(java.lang.Integer.valueOf(i17));
            hashMap.put(nickname, arrayList);
        }
    }

    public final r45.gb4 e(com.tencent.mm.plugin.finder.assist.LocalFinderAtContactParcel localFinderAtContactParcel) {
        r45.gb4 gb4Var = new r45.gb4();
        gb4Var.set(0, localFinderAtContactParcel.f101985d);
        gb4Var.set(1, localFinderAtContactParcel.f101986e);
        gb4Var.set(2, localFinderAtContactParcel.f101987f);
        gb4Var.set(7, java.lang.Integer.valueOf(localFinderAtContactParcel.f101991m));
        byte[] bArr = localFinderAtContactParcel.f101988g;
        if (bArr != null) {
            try {
                com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo = new com.tencent.mm.protocal.protobuf.FinderAuthInfo();
                finderAuthInfo.parseFrom(bArr);
                gb4Var.set(3, finderAuthInfo);
            } catch (java.lang.Exception e17) {
                gb4Var.set(3, null);
                com.tencent.mars.xlog.Log.e("Finder.FinderAtManager", "transformToLocalFinderAtContact FinderAuthInfo parseFrom:%s", e17.getMessage());
            }
        }
        gb4Var.set(4, java.lang.Long.valueOf(localFinderAtContactParcel.f101989h));
        return gb4Var;
    }
}

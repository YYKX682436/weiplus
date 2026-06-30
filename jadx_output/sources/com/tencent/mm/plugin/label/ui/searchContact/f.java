package com.tencent.mm.plugin.label.ui.searchContact;

/* loaded from: classes.dex */
public final class f extends ym3.a implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f143358d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f143359e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.HashSet f143360f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.label.ui.searchContact.ContactDataItemList f143361g;

    /* renamed from: h, reason: collision with root package name */
    public o13.x f143362h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f143363i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f143364m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f143365n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f143366o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f143367p;

    public f(java.lang.String query, com.tencent.mm.sdk.platformtools.n3 handler) {
        kotlin.jvm.internal.o.g(query, "query");
        kotlin.jvm.internal.o.g(handler, "handler");
        this.f143358d = "";
        this.f143358d = query;
        this.f143359e = handler;
        this.f143360f = new java.util.HashSet();
        java.lang.Object l17 = gm0.j1.u().c().l(2, null);
        kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type kotlin.String");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f143363i = (java.lang.String) l17;
        this.f143364m = new java.util.ArrayList();
        this.f143365n = new java.util.ArrayList();
        this.f143366o = new java.util.ArrayList();
        this.f143367p = new java.util.ArrayList();
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Mvvm.ContactDataSource", "ftsResult = " + vVar);
        if (vVar == null) {
            return;
        }
        java.util.ArrayList arrayList = this.f143364m;
        arrayList.clear();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = this.f143366o;
        arrayList4.clear();
        java.util.ArrayList arrayList5 = this.f143365n;
        arrayList5.clear();
        java.util.ArrayList arrayList6 = this.f143367p;
        arrayList6.clear();
        java.util.List list = vVar.f351160e;
        if (list != null && list.size() == 0) {
            com.tencent.mm.plugin.label.ui.searchContact.ContactDataItemList contactDataItemList = this.f143361g;
            if (contactDataItemList != null) {
                com.tencent.mm.plugin.mvvmlist.MvvmList.w(contactDataItemList, arrayList, false, 2, null);
            }
            com.tencent.mm.plugin.label.ui.searchContact.ContactDataItemList contactDataItemList2 = this.f143361g;
            if (contactDataItemList2 != null) {
                contactDataItemList2.A = arrayList2;
            }
            com.tencent.mm.plugin.label.ui.searchContact.ContactDataItemList contactDataItemList3 = this.f143361g;
            if (contactDataItemList3 != null) {
                contactDataItemList3.B = arrayList3;
            }
            o13.x xVar = this.f143362h;
            if (xVar != null) {
                xVar.X2(vVar);
                return;
            }
            return;
        }
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList8 = new java.util.ArrayList();
        int i17 = 0;
        for (p13.y yVar : vVar.f351160e) {
            arrayList7.add(yVar.f351187e);
            arrayList8.add(yVar.f351187e);
            hashMap.put(yVar.f351187e, yVar);
            if (arrayList7.size() > 300) {
                java.util.HashMap hashMap2 = hashMap;
                i17 = e(arrayList7, arrayList2, vVar, i17, arrayList3, hashMap2);
                arrayList8 = arrayList8;
                hashMap = hashMap2;
                arrayList7 = arrayList7;
            }
        }
        java.util.ArrayList arrayList9 = arrayList8;
        java.util.HashMap hashMap3 = hashMap;
        java.util.ArrayList arrayList10 = arrayList7;
        if (arrayList10.size() > 0) {
            e(arrayList10, arrayList2, vVar, i17, arrayList3, hashMap3);
        }
        arrayList5.addAll(arrayList9);
        java.util.Iterator it = arrayList5.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (!arrayList4.contains(str)) {
                arrayList6.add(((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true).f2());
                if (arrayList6.size() >= 2) {
                    break;
                }
            }
        }
        com.tencent.mm.plugin.label.ui.searchContact.ContactDataItemList contactDataItemList4 = this.f143361g;
        if (contactDataItemList4 != null) {
            contactDataItemList4.A = arrayList2;
        }
        com.tencent.mm.plugin.label.ui.searchContact.ContactDataItemList contactDataItemList5 = this.f143361g;
        if (contactDataItemList5 != null) {
            contactDataItemList5.B = arrayList3;
        }
        o13.x xVar2 = this.f143362h;
        if (xVar2 != null) {
            xVar2.X2(vVar);
        }
    }

    @Override // ym3.a, ym3.f
    /* renamed from: c */
    public kotlinx.coroutines.flow.j a(v65.i scope, ym3.c request) {
        kotlin.jvm.internal.o.g(scope, "scope");
        kotlin.jvm.internal.o.g(request, "request");
        ym3.d dVar = new ym3.d(request);
        u26.k0 k0Var = new u26.k0();
        java.util.ArrayList arrayList = this.f143364m;
        int size = arrayList.size();
        int i17 = request.f463144b;
        if (i17 < size) {
            int size2 = arrayList.size();
            int i18 = request.f463145c + i17;
            if (size2 > i18) {
                dVar.f463148b = true;
            } else {
                i18 = arrayList.size();
            }
            while (i17 < i18) {
                dVar.f463149c.add(arrayList.get(i17));
                i17++;
            }
        }
        k0Var.e(dVar);
        return new kotlinx.coroutines.flow.r(k0Var);
    }

    public final void d(java.lang.String query) {
        kotlin.jvm.internal.o.g(query, "query");
        if (com.tencent.mm.sdk.platformtools.t8.K0(query)) {
            return;
        }
        java.util.HashSet hashSet = this.f143360f;
        if (hashSet != null) {
            hashSet.add(this.f143363i);
        }
        p13.u uVar = new p13.u();
        uVar.f351141c = query;
        uVar.f351145g = new int[]{131072, 131081};
        uVar.f351150l = r13.b.f368602d;
        uVar.f351148j = this.f143360f;
        uVar.f351151m = this;
        uVar.f351152n = this.f143359e;
        uVar.f351140b = 16;
        ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (r7.contains(r4.d1()) == true) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(java.util.ArrayList r10, java.util.List r11, p13.v r12, int r13, java.util.ArrayList r14, java.util.HashMap r15) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            c01.f r1 = c01.d9.b()
            com.tencent.mm.storage.e8 r1 = r1.q()
            r2 = 0
            java.lang.String[] r3 = new java.lang.String[r2]
            java.lang.Object[] r3 = r10.toArray(r3)
            java.lang.String[] r3 = (java.lang.String[]) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.tencent.mm.storage.k4 r1 = (com.tencent.mm.storage.k4) r1
            java.lang.String r5 = "@all.contact.android"
            r6 = 0
            android.database.Cursor r1 = r1.W(r3, r5, r6, r4)
            java.util.ArrayList r3 = r9.f143364m
            if (r1 == 0) goto L9a
            int r4 = r1.getCount()
            if (r4 <= 0) goto L9a
        L2e:
            boolean r4 = r1.moveToNext()
            if (r4 == 0) goto L97
            com.tencent.mm.storage.z3 r4 = new com.tencent.mm.storage.z3
            r4.<init>()
            r4.convertFrom(r1)
            com.tencent.mm.plugin.label.ui.searchContact.d r5 = new com.tencent.mm.plugin.label.ui.searchContact.d
            r5.<init>(r13)
            r5.f143354m = r4
            java.lang.String r7 = r4.d1()
            java.lang.Object r7 = r15.get(r7)
            p13.y r7 = (p13.y) r7
            r5.f143349e = r7
            java.lang.String r7 = r9.f143358d
            r5.f143355n = r7
            if (r12 == 0) goto L58
            p13.r r7 = r12.f351159d
            goto L59
        L58:
            r7 = r6
        L59:
            r5.f143356o = r7
            com.tencent.mm.storage.z3 r7 = r5.f143354m
            if (r7 == 0) goto L62
            r0.add(r7)
        L62:
            r3.add(r5)
            com.tencent.mm.plugin.label.ui.searchContact.ContactDataItemList r7 = r9.f143361g
            if (r7 == 0) goto L79
            java.util.List r7 = r7.A
            if (r7 == 0) goto L79
            java.lang.String r8 = r4.d1()
            boolean r7 = r7.contains(r8)
            r8 = 1
            if (r7 != r8) goto L79
            goto L7a
        L79:
            r8 = r2
        L7a:
            if (r8 == 0) goto L8b
            java.lang.String r7 = r4.d1()
            java.lang.String r8 = "getUsername(...)"
            kotlin.jvm.internal.o.f(r7, r8)
            r11.add(r7)
            r14.add(r5)
        L8b:
            int r13 = r13 + 1
            java.util.ArrayList r5 = r9.f143366o
            java.lang.String r4 = r4.d1()
            r5.add(r4)
            goto L2e
        L97:
            r1.close()
        L9a:
            com.tencent.mm.plugin.label.ui.searchContact.ContactDataItemList r11 = r9.f143361g
            if (r11 == 0) goto La2
            r12 = 2
            com.tencent.mm.plugin.mvvmlist.MvvmList.w(r11, r3, r2, r12, r6)
        La2:
            r10.clear()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.label.ui.searchContact.f.e(java.util.ArrayList, java.util.List, p13.v, int, java.util.ArrayList, java.util.HashMap):int");
    }

    @Override // ym3.f
    public int getPriority() {
        return 1;
    }

    @Override // ym3.f
    public void onCreate() {
        this.f143364m.clear();
        d(this.f143358d);
    }
}

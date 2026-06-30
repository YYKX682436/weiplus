package x51;

/* loaded from: classes11.dex */
public class d implements wu5.h {

    /* renamed from: i, reason: collision with root package name */
    public static final byte[] f451977i = new byte[0];

    /* renamed from: m, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f451978m = new x51.c(android.os.Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f451979d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f451980e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f451981f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f451982g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.i8 f451983h;

    public d(x51.a aVar) {
    }

    public final java.util.List a(int i17, java.util.List list) {
        if (list == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AddrBookSyncHelper", "sync address book failed, null info list");
            return new java.util.LinkedList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String[] strArr = (java.lang.String[]) it.next();
            if (strArr != null) {
                java.lang.String str = strArr[0];
                java.lang.String str2 = strArr[1];
                java.lang.String str3 = strArr[2];
                java.lang.String str4 = strArr[3];
                long E1 = com.tencent.mm.sdk.platformtools.t8.E1(strArr[4]);
                if (str3 != null) {
                    if (!str3.equals("")) {
                        java.lang.String g17 = i17 == 1 ? kk.k.g(str3.getBytes()) : "";
                        if (i17 == 0) {
                            java.lang.String a17 = o25.b.a(str3);
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                                java.lang.String g18 = kk.k.g(a17.getBytes());
                                if (!com.tencent.mars.xlog.Log.isDebug()) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.AddrBookSyncHelper", "convertAddr m:%s md5:%s", com.tencent.mm.sdk.platformtools.t8.G1(a17), g18);
                                }
                                g17 = g18;
                            }
                        }
                        r61.a aVar = new r61.a();
                        aVar.f392789e = str2;
                        aVar.f392790f = x51.k.b(str2);
                        aVar.f392791g = x51.k.a(str2);
                        aVar.f392787c = str;
                        aVar.f392800p = str4;
                        aVar.f392786b = g17;
                        aVar.f392785a = r61.a.d(g17);
                        aVar.N = E1;
                        aVar.f392804t = aVar.a();
                        if (i17 == 1) {
                            aVar.f392798n = str3;
                        }
                        if (i17 == 0) {
                            aVar.f392797m = str3;
                        }
                        aVar.f392796l = i17;
                        aVar.O = 1095798;
                        arrayList.add(aVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public final void b() {
        com.tencent.mm.sdk.platformtools.i8 i8Var = new com.tencent.mm.sdk.platformtools.i8("MicroMsg.AddrBookSyncHelper", "delete");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.Iterator it = this.f451980e.iterator();
        while (it.hasNext()) {
            linkedList.add(((java.lang.String[]) it.next())[2]);
        }
        ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
        android.database.Cursor f17 = m61.k.wi().f392819d.f("select addr_upload2.moblie , addr_upload2.md5 from addr_upload2 where addr_upload2.type = 0", null, 2);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        while (f17.moveToNext()) {
            arrayList2.add(new java.lang.String[]{f17.getString(0), f17.getString(1)});
        }
        f17.close();
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            java.lang.String[] strArr = (java.lang.String[]) it6.next();
            java.lang.String str = strArr[0];
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = strArr[1];
            if (str2 == null) {
                str2 = "";
            }
            if (!str.equals("") && !linkedList.contains(str)) {
                arrayList.add(str2);
            }
        }
        if (arrayList.size() > 0) {
            ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
            m61.k.wi().g(arrayList);
            r61.q0.d(arrayList);
        }
        i8Var.a("end");
        i8Var.b();
    }

    public final java.util.List c(java.util.List list, int i17, int i18) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        while (i17 < i18) {
            linkedList.add((r61.a) list.get(i17));
            i17++;
        }
        return linkedList;
    }

    @Override // wu5.h, wu5.g
    public java.lang.String getKey() {
        return "AddrBookSyncHelper_addrBookRead";
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.List c17;
        java.util.List c18;
        synchronized (f451977i) {
            java.util.HashSet hashSet = x51.e.f451989a;
            com.tencent.mm.sdk.platformtools.o4.L().putInt("ADDRBOOK_HAD_UPDATE_KEY", 1);
            com.tencent.mm.sdk.platformtools.i8 i8Var = new com.tencent.mm.sdk.platformtools.i8("MicroMsg.AddrBookSyncHelper", "sync addrBook");
            this.f451983h = i8Var;
            i8Var.a("sync begin");
            this.f451979d = new java.util.LinkedList();
            com.tencent.mars.xlog.Log.i("MicroMsg.AddrBookSyncHelper", "sync address book email size: " + this.f451979d.size());
            this.f451982g = a(1, this.f451979d);
            this.f451980e = o25.b.d(com.tencent.mm.sdk.platformtools.x2.f193071a);
            com.tencent.mars.xlog.Log.i("MicroMsg.AddrBookSyncHelper", "sync address book mobile size: " + this.f451980e.size());
            this.f451981f = a(0, this.f451980e);
            if (this.f451979d != null && this.f451982g.size() > 0) {
                int i17 = 0;
                while (i17 < this.f451982g.size()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AddrBookSyncHelper", "sync email index: " + i17);
                    int i18 = i17 + 100;
                    if (i18 < this.f451982g.size()) {
                        c18 = c(this.f451982g, i17, i18);
                    } else {
                        java.util.List list = this.f451982g;
                        c18 = c(list, i17, list.size());
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AddrBookSyncHelper", "sync email listToSync size: " + c18.size());
                    r61.q0.m(1, c18);
                    i17 = i18;
                }
            }
            java.util.List list2 = this.f451981f;
            if (list2 != null && list2.size() != 0) {
                int i19 = 0;
                while (i19 < this.f451981f.size()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AddrBookSyncHelper", "sync mobile index: " + i19);
                    if (!gm0.j1.a()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AddrBookSyncHelper", "account not ready, stop sync");
                        com.tencent.mm.sdk.platformtools.n3 n3Var = f451978m;
                        android.os.Message obtainMessage = n3Var.obtainMessage();
                        obtainMessage.obj = java.lang.Boolean.FALSE;
                        n3Var.sendMessage(obtainMessage);
                        return;
                    }
                    int i27 = i19 + 100;
                    if (i27 < this.f451981f.size()) {
                        c17 = c(this.f451981f, i19, i27);
                    } else {
                        java.util.List list3 = this.f451981f;
                        c17 = c(list3, i19, list3.size());
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.AddrBookSyncHelper", "sync mobile listToSync size: " + c17.size());
                    r61.q0.m(0, c17);
                    i19 = i27;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AddrBookSyncHelper", "sync ok");
                if (!gm0.j1.a()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AddrBookSyncHelper", "account not ready, exit");
                    com.tencent.mm.sdk.platformtools.n3 n3Var2 = f451978m;
                    android.os.Message obtainMessage2 = n3Var2.obtainMessage();
                    obtainMessage2.obj = java.lang.Boolean.FALSE;
                    n3Var2.sendMessage(obtainMessage2);
                    return;
                }
                b();
                java.lang.System.currentTimeMillis();
                this.f451983h.a("sync ok");
                this.f451983h.b();
                com.tencent.mm.sdk.platformtools.n3 n3Var3 = f451978m;
                android.os.Message obtainMessage3 = n3Var3.obtainMessage();
                obtainMessage3.obj = java.lang.Boolean.TRUE;
                n3Var3.sendMessage(obtainMessage3);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AddrBookSyncHelper", "mobile list null stop service");
            com.tencent.mm.sdk.platformtools.n3 n3Var4 = f451978m;
            android.os.Message obtainMessage4 = n3Var4.obtainMessage();
            obtainMessage4.obj = java.lang.Boolean.FALSE;
            n3Var4.sendMessage(obtainMessage4);
        }
    }
}

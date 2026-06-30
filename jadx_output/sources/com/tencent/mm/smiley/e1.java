package com.tencent.mm.smiley;

/* loaded from: classes12.dex */
public class e1 implements com.tencent.mm.feature.emoji.api.v6 {

    /* renamed from: f, reason: collision with root package name */
    public static com.tencent.mm.smiley.e1 f193239f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String f193240g = rr.s.f399149a.a() + "panel/";

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f193241a = "";

    /* renamed from: b, reason: collision with root package name */
    public boolean f193242b = false;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f193243c;

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f193244d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f193245e;

    public e1(android.content.Context context) {
        java.util.List synchronizedList = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f193243c = synchronizedList;
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        this.f193244d = sparseArray;
        synchronizedList.clear();
        sparseArray.clear();
        this.f193245e = com.tencent.mm.sdk.platformtools.m2.d();
    }

    public static com.tencent.mm.smiley.e1 b() {
        if (f193239f == null) {
            synchronized (com.tencent.mm.smiley.e1.class) {
                if (f193239f == null) {
                    f193239f = new com.tencent.mm.smiley.e1(com.tencent.mm.sdk.platformtools.x2.f193071a);
                }
            }
        }
        com.tencent.mm.smiley.e1 e1Var = f193239f;
        synchronized (e1Var) {
            if (!e1Var.f193242b) {
                if (!com.tencent.mm.sdk.platformtools.x2.n()) {
                    e1Var.e();
                } else if (gm0.j1.a()) {
                    e1Var.e();
                }
            }
        }
        return f193239f;
    }

    public boolean a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        synchronized (this.f193243c) {
            java.util.Iterator it = this.f193243c.iterator();
            while (it.hasNext()) {
                if (com.tencent.mm.sdk.platformtools.t8.D0(((com.tencent.mm.storage.emotion.SmileyPanelConfigInfo) it.next()).field_key, str)) {
                    return true;
                }
            }
            return false;
        }
    }

    public android.graphics.drawable.Drawable c(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        com.tencent.mm.storage.emotion.SmileyInfo f17 = com.tencent.mm.smiley.t1.a().f(str);
        if (f17 != null) {
            com.tencent.mm.smiley.t1 a17 = com.tencent.mm.smiley.t1.a();
            a17.getClass();
            int i17 = f17.field_position;
            return i17 >= 0 ? a17.c(i17) : a17.b(f17.field_fileName);
        }
        com.tencent.mm.smiley.g b17 = com.tencent.mm.smiley.g.b();
        com.tencent.mm.smiley.b2 c17 = com.tencent.mm.smiley.g.b().c(str);
        b17.getClass();
        boolean z17 = com.tencent.mm.smiley.q0.f193336d;
        com.tencent.mm.smiley.l0.f193307a.getClass();
        int i18 = com.tencent.mm.smiley.e.f193236b;
        return com.tencent.mm.smiley.d.f193233a.a(c17, true);
    }

    public java.lang.String d(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        com.tencent.mm.storage.emotion.SmileyInfo f17 = com.tencent.mm.smiley.t1.a().f(str);
        if (f17 == null) {
            return str;
        }
        java.lang.String str2 = this.f193245e;
        return (!str2.equals("zh_CN") || com.tencent.mm.sdk.platformtools.t8.K0(f17.field_cnValue)) ? ((str2.equals("zh_TW") || str2.equals("zh_HK")) && !com.tencent.mm.sdk.platformtools.t8.K0(f17.field_twValue)) ? f17.field_twValue : f17.field_enValue : f17.field_cnValue;
    }

    public synchronized void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MergerSmileyManager", "updateSmileyPanelInfo");
        this.f193243c.clear();
        this.f193241a = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().A();
        new java.util.ArrayList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = f193240g;
        sb6.append(str);
        sb6.append("config.conf");
        int d17 = rr.t.d(sb6.toString());
        int d18 = rr.t.d("assets:///panel/config.conf");
        final java.lang.String str2 = str + this.f193241a;
        final java.lang.String str3 = "assets:///panel/" + this.f193241a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MergerSmileyManager", "updateSmileyPanelInfo: local:%s, asset:%s", java.lang.Integer.valueOf(d17), java.lang.Integer.valueOf(d18));
        if (d17 > 0 && d17 >= d18 && com.tencent.mm.vfs.w6.j(str2)) {
            arrayList = rr.t.a(new com.tencent.mm.vfs.r6(str2));
            com.tencent.mars.xlog.Log.i("MicroMsg.MergerSmileyManager", "updateSmileyPanelInfo: localSize %s", java.lang.Integer.valueOf(arrayList.size()));
        }
        if (arrayList.size() <= 0) {
            arrayList = rr.t.a(new com.tencent.mm.vfs.r6(str3));
            if (arrayList.size() < 50) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MergerSmileyManager", "updateSmileyPanelInfo: from asset xml %s", java.lang.Integer.valueOf(arrayList.size()));
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MergerSmileyManager", "updateSmileyPanelInfo: %s", com.tencent.mm.vfs.w6.M("assets:///panel/" + this.f193241a));
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MergerSmileyManager", e17, "", new java.lang.Object[0]);
                }
            }
        }
        if (arrayList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MergerSmileyManager", "smiley panel list is null.");
        } else {
            java.util.Set keySet = com.tencent.mm.smiley.t1.a().f193392i.keySet();
            kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
            java.util.List S0 = kz5.n0.S0(keySet);
            int size = arrayList.size();
            int i17 = 0;
            for (int i18 = 0; i18 < size; i18++) {
                com.tencent.mm.storage.emotion.SmileyPanelConfigInfo smileyPanelConfigInfo = (com.tencent.mm.storage.emotion.SmileyPanelConfigInfo) arrayList.get(i18);
                java.lang.String str4 = smileyPanelConfigInfo.field_key;
                if (str4.matches("^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$")) {
                    java.lang.String str5 = new java.lang.String(android.util.Base64.decode(str4, 0));
                    smileyPanelConfigInfo.field_key = str5;
                    str4 = str5;
                }
                if (!str4.startsWith("[") || S0.contains(str4)) {
                    this.f193243c.add(smileyPanelConfigInfo);
                    this.f193244d.put(i17, smileyPanelConfigInfo);
                    i17++;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MergerSmileyManager", "no smiley info. key:%s", str4);
                }
            }
            if (!com.tencent.mm.vfs.w6.j(str2)) {
                ((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: com.tencent.mm.smiley.e1$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (com.tencent.mm.vfs.w6.u(com.tencent.mm.smiley.e1.f193240g)) {
                            com.tencent.mm.vfs.w6.c(str3, str2);
                        }
                    }
                });
            }
        }
        this.f193242b = true;
    }
}

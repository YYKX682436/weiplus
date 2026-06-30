package o72;

/* loaded from: classes8.dex */
public class i3 {

    /* renamed from: a, reason: collision with root package name */
    public final r45.qq0 f343360a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f343361b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashSet f343362c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f343363d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f343364e;

    public i3() {
        r45.qq0 qq0Var = new r45.qq0();
        this.f343360a = qq0Var;
        this.f343361b = new java.util.HashMap();
        this.f343362c = new java.util.HashSet();
        this.f343363d = true;
        this.f343364e = new java.util.LinkedList();
        try {
            qq0Var.parseFrom(com.tencent.mm.sdk.platformtools.t8.h((java.lang.String) gm0.j1.u().c().l(225283, "")));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FavTagSetMgr", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.w("MicroMsg.FavTagSetMgr", "init tag info set fail, %s", e17.getMessage());
            this.f343360a = new r45.qq0();
            java.util.Iterator it = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj().V7().iterator();
            while (it.hasNext()) {
                o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(((java.lang.Long) it.next()).longValue());
                if (F != null) {
                    for (java.lang.String str : F.field_tagProto.f385096e) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FavTagSetMgr", "recover tag from db:%s", str);
                        a(str);
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTagSetMgr", "tag:\n%s", this.f343360a.f384201d);
    }

    public void a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(str.hashCode());
        java.util.HashSet hashSet = this.f343362c;
        if (hashSet.contains(valueOf)) {
            return;
        }
        hashSet.add(java.lang.Integer.valueOf(str.hashCode()));
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            com.tencent.mm.sdk.platformtools.u3.h(new o72.f3(this, str));
        } else {
            b(str);
        }
    }

    public final void b(java.lang.String str) {
        r45.pq0 pq0Var;
        java.lang.String a17 = x51.k.a(str.toLowerCase());
        int i17 = 0;
        char charAt = (a17 == null || a17.length() <= 0) ? '#' : a17.charAt(0);
        r45.qq0 qq0Var = this.f343360a;
        java.util.Iterator it = qq0Var.f384201d.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                pq0Var = null;
                break;
            }
            pq0Var = (r45.pq0) it.next();
            int i19 = pq0Var.f383300d;
            if (i19 == charAt) {
                break;
            }
            if (i19 > charAt) {
                pq0Var = new r45.pq0();
                pq0Var.f383300d = charAt;
                qq0Var.f384201d.add(i18, pq0Var);
                break;
            }
            i18++;
        }
        if (pq0Var == null) {
            pq0Var = new r45.pq0();
            pq0Var.f383300d = charAt;
            qq0Var.f384201d.add(pq0Var);
        }
        java.util.Iterator it6 = pq0Var.f383301e.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            java.util.LinkedList linkedList = pq0Var.f383301e;
            if (!hasNext) {
                r45.oq0 oq0Var = new r45.oq0();
                oq0Var.f382438d = str;
                oq0Var.f382439e = a17;
                linkedList.add(oq0Var);
                d(str, true);
                i();
                return;
            }
            r45.oq0 oq0Var2 = (r45.oq0) it6.next();
            int compareTo = oq0Var2.f382439e.compareTo(a17);
            if (compareTo == 0) {
                compareTo = oq0Var2.f382438d.compareTo(str);
            }
            if (compareTo == 0) {
                return;
            }
            if (compareTo > 0) {
                r45.oq0 oq0Var3 = new r45.oq0();
                oq0Var3.f382438d = str;
                oq0Var3.f382439e = a17;
                linkedList.add(i17, oq0Var3);
                i();
                d(str, true);
                return;
            }
            i17++;
        }
    }

    public int c() {
        java.util.Iterator it = this.f343360a.f384201d.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            i17 += ((r45.pq0) it.next()).f383301e.size();
        }
        return i17;
    }

    public final void d(java.lang.String str, boolean z17) {
        for (java.lang.ref.WeakReference weakReference : this.f343361b.values()) {
            if (weakReference != null && weakReference.get() != null) {
                if (z17) {
                    ((o72.h3) weakReference.get()).getClass();
                } else {
                    ((o72.h3) weakReference.get()).getClass();
                }
            }
        }
    }

    public void e(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        this.f343362c.remove(java.lang.Integer.valueOf(str.hashCode()));
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            com.tencent.mm.sdk.platformtools.u3.h(new o72.g3(this, str));
        } else {
            h(str);
        }
    }

    public void f(o72.r2 r2Var) {
        if (r2Var == null) {
            return;
        }
        java.util.Iterator it = r2Var.field_tagProto.f385096e.iterator();
        while (it.hasNext()) {
            e((java.lang.String) it.next());
        }
    }

    public void g(java.util.Set set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            e((java.lang.String) it.next());
        }
    }

    public final void h(java.lang.String str) {
        r45.pq0 pq0Var;
        java.lang.String a17 = x51.k.a(str.toLowerCase());
        char charAt = (a17 == null || a17.length() <= 0) ? '#' : a17.charAt(0);
        r45.qq0 qq0Var = this.f343360a;
        java.util.Iterator it = qq0Var.f384201d.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                pq0Var = null;
                break;
            }
            pq0Var = (r45.pq0) it.next();
            int i18 = pq0Var.f383300d;
            if (i18 == charAt) {
                break;
            } else if (i18 > charAt) {
                return;
            } else {
                i17++;
            }
        }
        if (pq0Var == null) {
            return;
        }
        java.util.Iterator it6 = pq0Var.f383301e.iterator();
        int i19 = 0;
        while (it6.hasNext()) {
            r45.oq0 oq0Var = (r45.oq0) it6.next();
            int compareTo = oq0Var.f382439e.compareTo(a17);
            if (compareTo == 0) {
                compareTo = oq0Var.f382438d.compareTo(str);
            }
            if (compareTo == 0) {
                if (((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).pj().J5(oq0Var.f382438d)) {
                    return;
                }
                java.util.LinkedList linkedList = pq0Var.f383301e;
                linkedList.remove(i19);
                if (linkedList.isEmpty()) {
                    qq0Var.f384201d.remove(i17);
                }
                d(str, false);
                i();
                return;
            }
            if (compareTo > 0) {
                return;
            } else {
                i19++;
            }
        }
    }

    public void i() {
        byte[] bArr;
        try {
            bArr = this.f343360a.toByteArray();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FavTagSetMgr", e17, "", new java.lang.Object[0]);
            com.tencent.mars.xlog.Log.w("MicroMsg.FavTagSetMgr", "save tag info set fail, %s", e17.getMessage());
            bArr = null;
        }
        gm0.j1.e().j(new o72.e3(this, bArr));
        this.f343363d = true;
    }
}

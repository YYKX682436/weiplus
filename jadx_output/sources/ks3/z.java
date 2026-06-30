package ks3;

/* loaded from: classes8.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public long f311787a;

    /* renamed from: b, reason: collision with root package name */
    public final ks3.a0 f311788b;

    /* renamed from: d, reason: collision with root package name */
    public final int f311790d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final int f311791e = 2;

    /* renamed from: f, reason: collision with root package name */
    public int f311792f = 0;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f311789c = new java.util.ArrayList();

    public z(java.lang.String str) {
        this.f311788b = new ks3.a0(str);
    }

    public static char a(ks3.z zVar, java.lang.String str) {
        zVar.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return '~';
        }
        return str.charAt(0);
    }

    public void b(ks3.y yVar) {
        java.util.List list = this.f311789c;
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            if (((ks3.y) it.next()) == yVar) {
                return;
            }
        }
        ((java.util.ArrayList) list).add(yVar);
    }

    public void c(java.util.List list) {
        ks3.a0 a0Var = this.f311788b;
        java.util.LinkedList b17 = a0Var.b();
        if (b17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Plugin.MailAddrMgr", "addrs is null");
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ks3.u uVar = (ks3.u) it.next();
            if (uVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Plugin.MailAddrMgr", "addr is null");
            } else {
                int indexOf = b17.indexOf(new ks3.e1(uVar));
                if (indexOf != -1) {
                    ((ks3.e1) b17.get(indexOf)).f311752g++;
                }
            }
        }
        a0Var.c(b17);
    }

    public void d() {
        int i17 = this.f311792f;
        int i18 = this.f311790d;
        if (i17 == i18) {
            return;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (java.lang.System.currentTimeMillis() - this.f311787a <= 600000) {
            java.util.Iterator it = ((java.util.ArrayList) this.f311789c).iterator();
            while (it.hasNext()) {
                ((ks3.y) it.next()).a();
            }
        } else {
            this.f311792f = i18;
            this.f311787a = java.lang.System.currentTimeMillis();
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.x2.f193072b, new com.tencent.mm.ipcinvoker.type.IPCVoid(), js3.k.class, new ks3.x(this));
        }
    }

    public java.util.List e(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList b17 = this.f311788b.b();
        if (b17 != null) {
            arrayList.addAll(b17);
        }
        if (this.f311792f == 0) {
            d();
        }
        java.util.Collections.sort(arrayList, new ks3.v(this));
        if (str == null || str.length() == 0) {
            return arrayList;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ks3.u uVar = (ks3.u) it.next();
            if (uVar != null && (((str2 = uVar.f311750e) != null && str2.contains(str)) || (((str3 = uVar.f311753h) != null && str3.contains(str)) || ((str4 = uVar.f311751f) != null && str4.contains(str))))) {
                arrayList2.add(uVar);
            }
        }
        return arrayList2;
    }

    public void f(ks3.y yVar) {
        java.util.List list = this.f311789c;
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            ks3.y yVar2 = (ks3.y) it.next();
            if (yVar2 == yVar) {
                ((java.util.ArrayList) list).remove(yVar2);
                return;
            }
        }
    }

    public void finalize() {
        ((java.util.ArrayList) this.f311789c).clear();
    }
}

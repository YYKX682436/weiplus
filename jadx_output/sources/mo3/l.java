package mo3;

/* loaded from: classes9.dex */
public class l implements vg3.z4 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f330419d = new java.util.ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f330420a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f330421b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f330422c;

    public l(boolean z17) {
        this.f330420a = false;
        this.f330421b = false;
        this.f330422c = new java.util.LinkedList();
        this.f330420a = z17;
        this.f330421b = false;
        this.f330422c = new java.util.LinkedList();
    }

    @Override // vg3.z4
    public void a() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.addAll(this.f330422c);
        ((java.util.LinkedList) this.f330422c).clear();
        if (linkedList.size() == 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = f330419d;
        synchronized (list) {
            java.util.Iterator it = ((java.util.ArrayList) list).iterator();
            while (it.hasNext()) {
                arrayList.add((c01.v8) it.next());
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            c01.v8 v8Var = (c01.v8) it6.next();
            new com.tencent.mm.sdk.platformtools.n3(v8Var.getLooper()).post(new mo3.j(this, v8Var, linkedList));
        }
    }

    @Override // vg3.z4
    public void b(com.tencent.mm.storage.f9 f9Var, r45.j4 j4Var) {
        java.lang.String str;
        mm.w.e("newMsgSync");
        if (this.f330420a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SyncMessageNotifier", "mDummy is true, do nothing and return.");
            mm.w.f("dummy");
            return;
        }
        java.util.List list = f330419d;
        synchronized (list) {
            if (((java.util.ArrayList) list).isEmpty()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SyncMessageNotifier", "no notifiers, ignore");
                mm.w.f("noNotifier");
                return;
            }
            if (f9Var.A0() != 0 || f9Var.P0() == 4) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SyncMessageNotifier", "not new msg, ignore");
                mm.w.f("notNewMsg");
                return;
            }
            java.lang.String g17 = x51.j1.g(j4Var.f377558e);
            xg3.r0 hj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj();
            int indexOf = g17.indexOf("@");
            if (indexOf >= 0) {
                g17.substring(0, indexOf);
                str = g17.substring(indexOf);
            } else {
                str = "";
            }
            if (str == null) {
                str = "";
            }
            com.tencent.mm.storage.ja m07 = ((com.tencent.mm.storage.ka) hj6).m0(str);
            if (m07 != null) {
                if (!((m07.f195060d & 2) != 0)) {
                    mm.w.f("roleMute");
                    return;
                }
            }
            if (this.f330421b) {
                ((java.util.LinkedList) this.f330422c).add(f9Var);
                return;
            }
            this.f330421b = true;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            synchronized (list) {
                java.util.Iterator it = ((java.util.ArrayList) list).iterator();
                while (it.hasNext()) {
                    arrayList.add((c01.v8) it.next());
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                c01.v8 v8Var = (c01.v8) it6.next();
                new com.tencent.mm.sdk.platformtools.n3(v8Var.getLooper()).post(new mo3.k(this, j4Var, v8Var, f9Var));
            }
        }
    }
}

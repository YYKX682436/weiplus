package k14;

/* loaded from: classes11.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k14.x0 f303368d;

    public o0(k14.x0 x0Var) {
        this.f303368d = x0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        k14.x0 x0Var = this.f303368d;
        x0Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("tmessage");
        arrayList.add("officialaccounts");
        arrayList.add("filehelper");
        arrayList.add("helper_entry");
        arrayList.add(c01.z1.r());
        com.tencent.mm.storage.ja m07 = ((com.tencent.mm.storage.ka) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj()).m0("@t.qq.com");
        if (m07 != null) {
            arrayList.add(m07.f195058b);
        }
        arrayList.add("blogapp");
        android.database.Cursor A = Bi.A("@all.contact.without.chatroom", null, arrayList, null, false, false);
        if (A != null) {
            A.moveToFirst();
            while (!A.isAfterLast()) {
                com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
                z3Var.convertFrom(A);
                linkedList.add(z3Var.d1());
                A.moveToNext();
            }
            A.close();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.UnfamiliarContactEngine", "[getQuery] cost:%sms list size:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(linkedList.size()));
        if (x0Var.f303403b) {
            k14.w0 w0Var = new k14.w0(x0Var, x0Var.f303413l, x0Var.f303405d);
            x0Var.f303412k = w0Var;
            w0Var.f303398g = java.lang.System.currentTimeMillis();
            gm0.j1.d().a(292, w0Var);
            com.tencent.mm.autogen.events.GetSnsTagListEvent getSnsTagListEvent = new com.tencent.mm.autogen.events.GetSnsTagListEvent();
            getSnsTagListEvent.f54413g.f7532a = 3;
            getSnsTagListEvent.e();
        }
        if (x0Var.f303402a) {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                hashSet.add((java.lang.String) it.next());
            }
            long currentTimeMillis2 = java.lang.System.currentTimeMillis() - 15552000000L;
            com.tencent.mars.xlog.Log.i("MicroMsg.UnfamiliarContactEngine", "[getHalfYearNotChatInfo] timestamp:%s size:%s", java.lang.Long.valueOf(currentTimeMillis2), java.lang.Integer.valueOf(hashSet.size()));
            long currentTimeMillis3 = java.lang.System.currentTimeMillis();
            p13.u uVar = new p13.u();
            uVar.f351140b = 9;
            uVar.f351141c = java.lang.String.valueOf(currentTimeMillis2);
            uVar.f351151m = new k14.s0(x0Var, hashSet, currentTimeMillis2, currentTimeMillis3);
            uVar.f351152n = x0Var.f303406e;
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
        }
        if (x0Var.f303404c) {
            x0Var.a(linkedList, 0);
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        k14.r0 r0Var = new k14.r0(x0Var);
        x0Var.f303415n = r0Var;
        ((ku5.t0) u0Var).g(r0Var);
    }
}

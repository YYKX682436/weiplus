package ho1;

/* loaded from: classes5.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.a1 f282723d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f282724e;

    public j0(ho1.a1 a1Var, long j17) {
        this.f282723d = a1Var;
        this.f282724e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String e17;
        java.util.HashMap hashMap = new java.util.HashMap();
        android.database.Cursor y17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().y("@all.contact.android", null, kz5.n0.S0(c01.e2.i()), null, true, false);
        while (y17.moveToNext()) {
            try {
                com.tencent.mm.storage.z3 z3Var = new com.tencent.mm.storage.z3();
                z3Var.convertFrom(y17);
                java.lang.String d17 = z3Var.d1();
                kotlin.jvm.internal.o.f(d17, "getUsername(...)");
                hashMap.put(d17, z3Var);
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    vz5.b.a(y17, th6);
                    throw th7;
                }
            }
        }
        vz5.b.a(y17, null);
        ot5.g.c("ConversationQueryHelper", "contact map size = " + hashMap.size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor s17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().s(1, kn1.k.s(), "*", -1);
        while (s17.moveToNext()) {
            try {
                com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4();
                l4Var.convertFrom(s17);
                java.lang.String h17 = l4Var.h1();
                kotlin.jvm.internal.o.f(h17, "getUsername(...)");
                com.tencent.mm.storage.z3 z3Var2 = (com.tencent.mm.storage.z3) hashMap.get(l4Var.h1());
                if ((r26.n0.B(h17, ",", false) ? java.lang.Boolean.FALSE : (z3Var2 == null || !com.tencent.mm.storage.z3.D3(z3Var2.f1())) ? com.tencent.mm.storage.z3.X3(h17) ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE : java.lang.Boolean.FALSE).booleanValue()) {
                    arrayList.add(l4Var);
                }
            } catch (java.lang.Throwable th8) {
                try {
                    throw th8;
                } catch (java.lang.Throwable th9) {
                    vz5.b.a(s17, th8);
                    throw th9;
                }
            }
        }
        vz5.b.a(s17, null);
        ot5.g.c("ConversationQueryHelper", "Size of allConvList is " + arrayList.size());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.l4 l4Var2 = (com.tencent.mm.storage.l4) it.next();
            com.tencent.wechat.aff.affroam.r rVar = new com.tencent.wechat.aff.affroam.r();
            rVar.f215968d = l4Var2.h1();
            java.lang.String h18 = l4Var2.h1();
            kotlin.jvm.internal.o.f(h18, "getUsername(...)");
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            if (com.tencent.mm.storage.z3.R4(h18)) {
                ((sg3.a) v0Var).getClass();
                e17 = c01.a2.f(h18, h18);
                kotlin.jvm.internal.o.d(e17);
            } else {
                ((sg3.a) v0Var).getClass();
                e17 = c01.a2.e(h18);
                kotlin.jvm.internal.o.d(e17);
            }
            rVar.f215969e = e17;
            rVar.f215970f = l4Var2.w0();
            arrayList2.add(rVar);
        }
        com.tencent.wechat.aff.affroam.e0 e0Var = this.f282723d.f282623b;
        if (e0Var != null) {
            e0Var.x1(this.f282724e, arrayList2);
        }
    }
}

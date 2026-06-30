package xn1;

/* loaded from: classes12.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn1.h f455458d;

    public e(xn1.h hVar) {
        this.f455458d = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f455458d.d();
        if (this.f455458d.f455470s.size() != 0) {
            xn1.h hVar = this.f455458d;
            hVar.f455461g.a(hVar.f455470s, hVar, mn1.d.i().e().f309617i);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ConvChooseHelper", "backupSessionInfo is null or nill!");
        xn1.h hVar2 = this.f455458d;
        ln1.h hVar3 = hVar2.f455461g;
        hVar3.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupCalculator", "calculateChooseConversation start");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        android.database.Cursor s17 = ((com.tencent.mm.storage.m4) tn1.f.f().e().d()).s(1, kn1.k.s(), "*", -1);
        if (s17.getCount() == 0) {
            com.tencent.mm.sdk.platformtools.u3.h(new ln1.i(hVar3, hVar2, linkedList));
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupCalculator", "calculateChooseConversation empty conversation!");
            s17.close();
            return;
        }
        s17.moveToFirst();
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupCalculator", "calculateChooseConversation count[%d]", java.lang.Integer.valueOf(s17.getCount()));
        while (!hVar3.f319765a) {
            com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4();
            l4Var.convertFrom(s17);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(l4Var.h1())) {
                int j76 = ((com.tencent.mm.storage.g9) tn1.f.f().e().g()).j7(l4Var.h1());
                if (j76 > 0) {
                    if (com.tencent.mm.storage.z3.D3(((com.tencent.mm.storage.k4) c01.d9.b().q()).n(l4Var.h1(), true).f1())) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BackupCalculator", "calculateChooseConversation Biz conv:%s, msgCount[%d]", l4Var.h1(), java.lang.Integer.valueOf(j76));
                    } else {
                        kn1.i iVar = new kn1.i();
                        iVar.f309625d = l4Var.h1();
                        iVar.f309629h = j76;
                        iVar.f309626e = ((com.tencent.mm.storage.g9) tn1.f.f().e().g()).w3(l4Var.h1());
                        ((com.tencent.mm.storage.g9) tn1.f.f().e().g()).m5(l4Var.h1());
                        linkedList.add(iVar);
                    }
                }
            }
            if (!s17.moveToNext()) {
                s17.close();
                if (!hVar3.f319765a) {
                    ((ku5.t0) ku5.t0.f312615d).g(new ln1.k(hVar3, hVar2, linkedList));
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupCalculator", "calculateChooseConversation finish,size:%d, use time[%d]", java.lang.Integer.valueOf(linkedList.size()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.BackupCalculator", "calculateChooseConversation cancel.");
        s17.close();
    }
}

package z73;

/* loaded from: classes11.dex */
public class d extends z73.a {

    /* renamed from: p, reason: collision with root package name */
    public final oq1.p f470580p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f470581q;

    public d(java.util.List list, oq1.p pVar) {
        this.f470581q = list;
        this.f470580p = pVar;
        this.f470574n = 2;
        this.f470570g = "";
        this.f470569f = "";
        this.f470572i = "";
        this.f470575o = 0;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            oq1.r rVar = (oq1.r) it.next();
            r45.f35 f35Var = new r45.f35();
            f35Var.f373987d = rVar.f347369b;
            f35Var.f373988e = rVar.f347370c;
            f35Var.f373991h = "liteappconfig_" + rVar.f347368a;
            f35Var.f373993m = 2;
            f35Var.f373994n = rVar.f347371d;
            f35Var.f373992i = new java.util.LinkedList();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            f35Var.f373989f = linkedList;
            linkedList.addAll(z73.h.c());
            java.util.LinkedList linkedList2 = f35Var.f373989f;
            r45.e35 e35Var = new r45.e35();
            e35Var.f372968d = "package_id";
            e35Var.f372969e = "wechat-android";
            linkedList2.add(e35Var);
            this.f470573m.add(f35Var);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1821, 2);
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Tinker.NetSceneCheckLiteAppUpdate", "errType:%d errCode:%d errMsg:%s ", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<oq1.r> list = this.f470581q;
        if (i18 == 0 && i19 == 0) {
            java.util.Iterator it = ((r45.g35) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a).f374857h.iterator();
            while (it.hasNext()) {
                r45.g35 g35Var = (r45.g35) it.next();
                r45.j35 j35Var = g35Var.f374853d;
                oq1.q qVar = new oq1.q();
                if (j35Var != null) {
                    r45.bs5 bs5Var = j35Var.f377538i;
                    if (bs5Var != null) {
                        qVar.f347350e = bs5Var.f371025d;
                        qVar.f347349d = bs5Var.f371027f;
                        qVar.f347353h = bs5Var.f371032n;
                    } else {
                        java.util.LinkedList linkedList = j35Var.f377542p;
                        if (linkedList != null && linkedList.size() > 0) {
                            r45.bs5 bs5Var2 = (r45.bs5) linkedList.getFirst();
                            qVar.f347350e = bs5Var2.f371025d;
                            qVar.f347349d = bs5Var2.f371027f;
                            qVar.f347353h = bs5Var2.f371032n;
                        }
                    }
                    qVar.f347347b = java.lang.Integer.valueOf(j35Var.f377534e);
                    qVar.f347348c = java.lang.Integer.valueOf(j35Var.f377536g);
                    qVar.f347351f = j35Var.f377533d;
                    java.util.LinkedList linkedList2 = j35Var.f377540n;
                    if (linkedList2 != null) {
                        java.util.Iterator it6 = linkedList2.iterator();
                        while (it6.hasNext()) {
                            r45.h35 h35Var = (r45.h35) it6.next();
                            if ("signature_key".equals(h35Var.f375806d)) {
                                qVar.f347352g = h35Var.f375807e;
                            }
                        }
                    }
                }
                qVar.f347346a = g35Var.f374854e;
                qVar.f347354i = g35Var.f374858i;
                arrayList.add(qVar);
            }
        } else {
            for (oq1.r rVar : list) {
                oq1.q qVar2 = new oq1.q();
                qVar2.f347346a = rVar.f347368a;
                qVar2.f347354i = -1;
                arrayList.add(qVar2);
            }
        }
        if (list.size() > arrayList.size()) {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                hashSet.add(((oq1.q) it7.next()).f347346a);
            }
            for (oq1.r rVar2 : list) {
                if (!hashSet.contains(rVar2.f347368a)) {
                    oq1.q qVar3 = new oq1.q();
                    qVar3.f347346a = rVar2.f347368a;
                    qVar3.f347354i = -1;
                    arrayList.add(qVar3);
                }
            }
        }
        this.f470580p.a(arrayList);
        this.f470568e.onSceneEnd(i18, i19, str, this);
    }
}

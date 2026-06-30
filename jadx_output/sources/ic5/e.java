package ic5;

/* loaded from: classes9.dex */
public final class e {
    public e(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return "";
        }
        return b(f9Var) + (f9Var.T1() / 1000);
    }

    public final java.lang.String b(com.tencent.mm.storage.f9 msg) {
        java.lang.String id6;
        kotlin.jvm.internal.o.g(msg, "msg");
        r15.d c17 = c(msg);
        return (c17 == null || (id6 = c17.getId()) == null) ? "" : id6;
    }

    public final r15.d c(com.tencent.mm.storage.f9 f9Var) {
        r15.d dVar = null;
        if (f9Var == null) {
            return null;
        }
        java.lang.String Q0 = f9Var.Q0();
        java.lang.String msgIdTalker = tg3.l1.a(f9Var).toString();
        java.lang.String j17 = f9Var.j();
        int hashCode = j17 != null ? j17.hashCode() : 0;
        boolean z17 = Q0 == null || r26.n0.N(Q0);
        ic5.d dVar2 = ic5.d.f290436d;
        if (!z17) {
            kotlin.jvm.internal.o.d(Q0);
            java.util.Map map = (java.util.Map) ic5.f.f290438d.c(Q0, dVar2);
            ic5.c cVar = (ic5.c) map.get(msgIdTalker);
            if (cVar != null) {
                if (cVar.f290434a == hashCode) {
                    return cVar.f290435b;
                }
                map.remove(msgIdTalker);
            }
        }
        if (f9Var.P2()) {
            w15.h hVar = new w15.h();
            java.lang.String f27 = f9Var.f2();
            hVar.fromXml(f27 != null ? f27 : "");
            r15.b j18 = hVar.j();
            if (j18 != null) {
                dVar = j18.j();
            }
        } else if (f9Var.isVideo()) {
            wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
            java.lang.String z07 = f9Var.z0();
            ((vf0.y1) x1Var).getClass();
            t21.v2 h17 = t21.d3.h(z07);
            if (h17 == null) {
                wg3.j jVar = (wg3.j) i95.n0.c(wg3.j.class);
                long msgId = f9Var.getMsgId();
                java.lang.String Q02 = f9Var.Q0();
                kotlin.jvm.internal.o.f(Q02, "getTalker(...)");
                kc5.x xVar = (kc5.x) jVar;
                xVar.getClass();
                java.lang.String str = (java.lang.String) ((java.util.LinkedHashMap) xVar.f306590f).get(Q02 + msgId);
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaGroupMsgHelper", "getGroupInfoWithoutCheck: videoInfo is null: " + f9Var.getMsgId() + " - " + f9Var.z0() + " - " + com.tencent.mm.sdk.platformtools.t8.G1(str));
                if (str == null || r26.n0.N(str)) {
                    dVar = new r15.d();
                } else {
                    l15.c cVar2 = new l15.c();
                    cVar2.fromXml(str != null ? str : "");
                    r15.b l17 = cVar2.l();
                    if (l17 != null) {
                        dVar = l17.j();
                    }
                }
            } else {
                java.lang.String g17 = h17.g();
                l15.c cVar3 = new l15.c();
                cVar3.fromXml(g17 != null ? g17 : "");
                r15.b l18 = cVar3.l();
                if (l18 != null) {
                    dVar = l18.j();
                }
            }
        } else {
            java.lang.String j19 = f9Var.j();
            l15.c cVar4 = new l15.c();
            cVar4.fromXml(j19 != null ? j19 : "");
            r15.b l19 = cVar4.l();
            if (l19 != null) {
                dVar = l19.j();
            }
        }
        if (!(Q0 == null || r26.n0.N(Q0))) {
            kotlin.jvm.internal.o.d(Q0);
            ((java.util.Map) ic5.f.f290438d.c(Q0, dVar2)).put(msgIdTalker, new ic5.c(hashCode, dVar == null ? new r15.d() : dVar));
        }
        return dVar;
    }
}

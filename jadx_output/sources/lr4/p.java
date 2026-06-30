package lr4;

/* loaded from: classes11.dex */
public final class p extends qz5.l implements yz5.p {
    public p(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lr4.p(continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        lr4.p pVar = new lr4.p((kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        pVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        fr4.g0 g0Var = (fr4.g0) i95.n0.c(fr4.g0.class);
        kr4.m Bi = g0Var.Bi();
        java.lang.String Di = g0Var.Di();
        kr4.g y07 = Bi.y0("w1wsayhisessionholder@w1wmsg");
        p75.n0 n0Var = dm.wb.f240902w;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        p75.d dVar = dm.wb.f240904y;
        p75.m0 j17 = dVar.j(Di);
        p75.d dVar2 = dm.wb.D;
        p75.m c17 = j17.c(dVar2.i(1));
        linkedList2.add(dm.wb.A.u());
        p75.n0 n0Var2 = dm.wb.f240902w;
        p75.i0 g17 = n0Var2.g(linkedList);
        g17.f352657d = c17;
        g17.d(linkedList2);
        g17.b(linkedList3);
        p75.l0 a17 = g17.a();
        l75.k0 k0Var = Bi.f311517d;
        java.util.List k17 = a17.k(k0Var, kr4.g.class);
        if (!k17.isEmpty()) {
            kr4.k Ai = g0Var.Ai();
            java.util.ArrayList arrayList = (java.util.ArrayList) k17;
            java.lang.String field_talkerUserName = ((kr4.g) arrayList.get(0)).field_talkerUserName;
            kotlin.jvm.internal.o.f(field_talkerUserName, "field_talkerUserName");
            kr4.e y08 = Ai.y0(field_talkerUserName);
            ((kr4.g) arrayList.get(0)).Z = y08 != null ? y08.t0() : null;
            kr4.g gVar = (kr4.g) arrayList.get(0);
            com.tencent.mm.storage.z3 z3Var = ((kr4.g) arrayList.get(0)).Z;
            gVar.f311507x0 = z3Var != null ? z3Var.g2() : null;
        }
        if (!k17.isEmpty()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) k17;
            sb6.append(((kr4.g) arrayList2.get(0)).f311507x0);
            sb6.append(':');
            sb6.append(((kr4.g) arrayList2.get(0)).field_digest);
            str = sb6.toString();
        } else {
            str = "";
        }
        long j18 = k17.isEmpty() ^ true ? ((kr4.g) ((java.util.ArrayList) k17).get(0)).field_updateTime : 0L;
        y07.field_selfUserName = Di;
        p75.i0 h17 = n0Var2.h(dm.wb.f240905z.y());
        h17.f352657d = dVar.j(Di).c(dVar2.i(1));
        int m17 = h17.a().m(k0Var);
        com.tencent.mars.xlog.Log.i("W1wPersonalMsg.ConversationStorage", "[getGreetUnreadCount] w1wUsername=" + Di + " unreadCount=" + m17);
        y07.field_unReadCount = m17;
        y07.field_digest = str;
        y07.field_updateTime = j18;
        y07.field_placedFlag = 1000L;
        long j19 = y07.systemRowid;
        if (j19 < 0) {
            y07.field_talkerUserName = "w1wsayhisessionholder@w1wmsg";
            y07.t0();
            if (Bi.insert(y07)) {
                Bi.doNotify(y07.field_sessionId, 2, y07);
            }
        } else if (Bi.update(j19, y07, false)) {
            Bi.doNotify(y07.field_sessionId, 1, y07);
        }
        return jz5.f0.f302826a;
    }
}

package ze5;

/* loaded from: classes11.dex */
public final class c8 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ze5.j8 f471870d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(ze5.j8 j8Var) {
        super(4);
        this.f471870d = j8Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        ze5.b8 b8Var;
        long j17;
        v11.n0 n0Var;
        ze5.b8 b8Var2;
        long j18;
        android.view.View view = (android.view.View) obj;
        yb5.d chattingContext = (yb5.d) obj2;
        rd5.d msgData = (rd5.d) obj3;
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        kotlin.jvm.internal.o.g(msgData, "msgData");
        kotlin.jvm.internal.o.g((com.tencent.mm.ui.chatting.viewitems.g0) obj4, "<anonymous parameter 3>");
        af5.d1 d1Var = view instanceof af5.d1 ? (af5.d1) view : null;
        if (d1Var != null) {
            com.tencent.mm.storage.f9 f9Var = msgData.f394254d.f445300b;
            java.lang.String Q0 = f9Var.Q0();
            if (Q0 == null) {
                Q0 = "";
            }
            java.lang.String str = Q0;
            if5.b bVar = if5.b.f291265a;
            android.app.Activity g17 = chattingContext.g();
            kotlin.jvm.internal.o.f(g17, "getContext(...)");
            v11.e0 a17 = if5.a.f291264a.a(g17);
            int d17 = i65.a.d(g17, com.tencent.mm.R.color.f478520a84);
            float q17 = 14.0f * i65.a.q(g17);
            v11.i0 i0Var = new v11.i0(q17, q17, q17, q17, q17, q17, q17, q17, q17, q17);
            v11.j0 a18 = v11.j0.a(a17.f432363b, q17, d17, false, false, 0.0f, 0, 0, false, null, 508, null);
            v11.h0 h0Var = a17.f432364c;
            v11.h0 a19 = v11.h0.a(h0Var, v11.j0.a(h0Var.f432394a, q17, d17, false, false, 0.0f, 0, 0, false, null, 508, null), null, null, 0, 0, 30, null);
            v11.z a27 = v11.z.a(a17.f432366e, bVar.a(q17), bVar.a(q17), bVar.a(q17), bVar.a(q17), bVar.a(q17), bVar.a(q17), false, 0.0f, 192, null);
            v11.c0 c0Var = a17.f432367f;
            v11.c0 c0Var2 = new v11.c0(d17, c0Var.f432347b, c0Var.f432348c);
            v11.b0 a28 = v11.b0.a(a17.f432368g, d17, 0, false, false, false, false, i65.a.b(g17, (int) q17), 0, 0, 0, 0, 0, false, 8126, null);
            v11.w wVar = a17.f432369h;
            v11.w a29 = v11.w.a(wVar, v11.j0.a(wVar.f432473a, q17, d17, false, false, 0.0f, 0, 0, false, null, 508, null), null, q17, d17, 0.0f, 0, d17, 0, 0, 0, 0, 0, 0, 0, 16306, null);
            v11.d0 d0Var = new v11.d0(v11.j0.a(a17.f432370i.f432354a, q17, d17, false, false, 0.0f, 0, 0, false, null, 508, null));
            v11.g0 g0Var = a17.f432372k;
            v11.g0 a37 = v11.g0.a(g0Var, v11.j0.a(g0Var.f432377a, q17, d17, false, false, 0.0f, 0, 0, false, null, 508, null), v11.j0.a(g0Var.f432378b, q17, d17, false, false, 0.0f, 0, 0, false, null, 508, null), 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 65532, null);
            int b17 = i65.a.b(g17, 8);
            a17.f432374m.getClass();
            v11.e0 a38 = v11.e0.a(a17, i0Var, a18, a19, null, a27, c0Var2, a28, a29, d0Var, null, a37, null, new v11.f0(b17), 2568, null);
            dh0.j jVar = (dh0.j) i95.n0.c(dh0.j.class);
            v11.n0 k07 = ze5.j8.k0(this.f471870d, str, f9Var.I0());
            sb5.u2 u2Var = (sb5.u2) chattingContext.f460708c.a(sb5.u2.class);
            long I0 = f9Var.I0();
            java.lang.Object tag = d1Var.getTag(com.tencent.mm.R.id.vp8);
            java.lang.Long l17 = tag instanceof java.lang.Long ? (java.lang.Long) tag : null;
            if (l17 != null && l17.longValue() != I0) {
                if (u2Var != null) {
                    ((com.tencent.mm.ui.chatting.component.qp) u2Var).v0(l17.longValue());
                }
                if (u2Var != null) {
                    ((com.tencent.mm.ui.chatting.component.qp) u2Var).w0(l17.longValue());
                }
            }
            d1Var.setTag(com.tencent.mm.R.id.vp8, java.lang.Long.valueOf(I0));
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.x0.b(d1Var)) {
                b8Var = null;
                j17 = I0;
                d1Var.addOnAttachStateChangeListener(new ze5.z7(d1Var, I0, u2Var, d1Var));
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemMarkdownMvvm", "[THINKING_TRACE] doOnDetach: unregister callbacks, msgSvrId=%d", java.lang.Long.valueOf(I0));
                if (u2Var != null) {
                    ((com.tencent.mm.ui.chatting.component.qp) u2Var).v0(I0);
                }
                if (u2Var != null) {
                    ((com.tencent.mm.ui.chatting.component.qp) u2Var).w0(I0);
                }
                d1Var.setTag(com.tencent.mm.R.id.vp8, null);
                b8Var = null;
                j17 = I0;
            }
            v11.n0 n0Var2 = v11.n0.f432445d;
            if (k07 != n0Var2) {
                n0Var = n0Var2;
                b8Var2 = new ze5.b8(chattingContext, j17, this.f471870d, str, u2Var, jVar, a38);
            } else {
                n0Var = n0Var2;
                b8Var2 = b8Var;
            }
            if (u2Var != null) {
                j18 = j17;
                ze5.y7 y7Var = new ze5.y7(j18, d1Var, b8Var2);
                com.tencent.mm.ui.chatting.component.qp qpVar = (com.tencent.mm.ui.chatting.component.qp) u2Var;
                java.lang.Long valueOf = java.lang.Long.valueOf(j18);
                java.util.Map map = qpVar.f199798g;
                map.put(valueOf, y7Var);
                v11.n0 n07 = qpVar.n0(qpVar.f198580d.x(), j18);
                qpVar.f199799h.put(java.lang.Long.valueOf(j18), n07);
                y7Var.a(n07);
                com.tencent.mars.xlog.Log.i("MicroMsg.WeClawStream.ChattingComponent", "[THINKING_TRACE] registerThinkingStatusCallback: msgSvrId=%d, mapSize=%d, currentState=%s", java.lang.Long.valueOf(j18), java.lang.Integer.valueOf(map.size()), n07.name());
            } else {
                j18 = j17;
            }
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Long.valueOf(j18);
            objArr[1] = k07.name();
            objArr[2] = java.lang.Boolean.valueOf(b8Var2 != null);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemMarkdownMvvm", "[THINKING_TRACE] binder: msgSvrId=%d, thinkingState=%s, hasOnSwitch=%b", objArr);
            d1Var.setViewModel(new v11.m0(k07, k07 != n0Var ? b8Var2 : b8Var));
        }
        return jz5.f0.f302826a;
    }
}

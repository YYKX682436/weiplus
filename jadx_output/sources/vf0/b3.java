package vf0;

/* loaded from: classes12.dex */
public final class b3 extends jm0.g implements wf0.j1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).Zi(this);
    }

    @Override // jm0.g
    public void S6() {
        ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).mj(this);
    }

    @Override // wf0.j1
    public void l1(qi3.e0 event) {
        vf0.h3 h3Var;
        t21.v2 d17;
        zz.b hj6;
        kotlin.jvm.internal.o.g(event, "event");
        zf0.v0 v0Var = (zf0.v0) event.f363692b;
        if (v0Var == null || (h3Var = v0Var.f472563i) == null || !vf0.m3.j(event)) {
            return;
        }
        pt0.e0 e0Var = pt0.f0.f358209b1;
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = event.f363697g;
        java.lang.String a17 = msgIdTalker != null ? msgIdTalker.a() : null;
        com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker2 = event.f363697g;
        com.tencent.mm.storage.f9 k17 = e0Var.k(a17, msgIdTalker2 != null ? msgIdTalker2.f149480d : 0L);
        if (k17 == null || (d17 = vf0.m3.d(k17)) == null) {
            return;
        }
        ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).cj(k17, false);
        java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(k17, d17.d(), false);
        java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(k17, bm5.f0.f22571s, d17.d(), false);
        java.lang.String rj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(k17, bm5.f0.f22570r, d17.d(), false);
        if (com.tencent.mm.vfs.w6.j(rj6)) {
            java.lang.String f17 = d17.f();
            kotlin.jvm.internal.o.f(f17, "getImportPath(...)");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
                hj6 = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).hj(f17, rj6, tj6, k17.getType(), d17.f415015m, com.tencent.mm.vfs.w6.p(f17));
            } else if (com.tencent.mm.vfs.w6.j(tj6)) {
                java.lang.String p17 = com.tencent.mm.vfs.w6.p(tj6);
                a00.i iVar = (a00.i) i95.n0.c(a00.i.class);
                int type = k17.getType();
                y15.c n17 = h3Var.f436179f.n();
                hj6 = ((t02.e) iVar).bj(rj6, type, n17.getString(n17.f458922d + 18), null);
                com.tencent.mars.xlog.Log.i("MicroMsg.video.VideoSendFileOpFSC", "check video thumb dup, fileName = " + d17.d() + " result = " + ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).bj(tj6, k17.getType(), p17, null).f477691a);
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.video.VideoSendFileOpFSC", "import path and thumb path both not exist");
                hj6 = null;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("check video dup, fileName = ");
            sb6.append(d17.d());
            sb6.append(" result = ");
            sb6.append(hj6 != null ? hj6.toString() : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.video.VideoSendFileOpFSC", sb6.toString());
        }
        if (com.tencent.mm.vfs.w6.j(rj7)) {
            a00.i iVar2 = (a00.i) i95.n0.c(a00.i.class);
            int type2 = k17.getType();
            y15.c n18 = h3Var.f436179f.n();
            ((t02.e) iVar2).cj(rj7, type2, n18.getString(n18.f458922d + 21), null, new vf0.a3(d17));
        }
    }
}

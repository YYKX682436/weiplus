package dk5;

/* loaded from: classes9.dex */
public final class c2 extends android.os.AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public android.app.Dialog f234541a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f234542b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f234543c;

    /* renamed from: d, reason: collision with root package name */
    public int f234544d;

    /* renamed from: e, reason: collision with root package name */
    public int f234545e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f234546f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f234547g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f234548h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f234549i;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f234556p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.msg.MsgIdTalker f234557q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f234558r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f234559s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.concurrent.CountDownLatch f234560t;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f234563w;

    /* renamed from: j, reason: collision with root package name */
    public boolean f234550j = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f234551k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f234552l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f234553m = true;

    /* renamed from: n, reason: collision with root package name */
    public r45.uf6 f234554n = null;

    /* renamed from: o, reason: collision with root package name */
    public dk5.e2 f234555o = null;

    /* renamed from: u, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f234561u = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: v, reason: collision with root package name */
    public tg3.z0 f234562v = null;

    /* renamed from: x, reason: collision with root package name */
    public r45.xz6 f234564x = null;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f234565y = "";

    @Override // android.os.AsyncTask
    public java.lang.Object doInBackground(java.lang.Object[] objArr) {
        java.lang.String str = this.f234548h;
        kk.l lVar = t21.w2.f415056c;
        java.lang.String a17 = t21.c3.a(str);
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.o2.Ui();
        java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, a17, true);
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String str2 = this.f234546f;
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(str2);
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_c2c_video_retransmit_use_link_enable, bm5.h0.RepairerConfig_Media_C2CVideoReTransmitUseLink_Int, 0) == 1;
        com.tencent.mm.storage.f9 Li = h17 != null ? pt0.f0.Li(h17.h(), h17.f415016n) : null;
        if (this.f234553m) {
            if (this.f234560t != null) {
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", "recreateCompressVideoLatch await");
                    this.f234560t.await();
                    com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", "recreateCompressVideoLatch await done");
                } catch (java.lang.InterruptedException e17) {
                    throw new java.lang.RuntimeException(e17);
                }
            }
            tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
            bm5.f0 f0Var = bm5.f0.f22571s;
            com.tencent.mm.vfs.w6.d(((k90.b) u0Var).rj(Li, f0Var, this.f234546f, false), ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, f0Var, a17, true), z17);
            com.tencent.mm.vfs.w6.d(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(Li, this.f234546f, false), tj6, z17);
            if (h17 != null) {
                com.tencent.mm.autogen.events.WxFileIndexDirtyEvent wxFileIndexDirtyEvent = new com.tencent.mm.autogen.events.WxFileIndexDirtyEvent();
                long j17 = h17.f415016n;
                am.v20 v20Var = wxFileIndexDirtyEvent.f54994g;
                v20Var.f8167a = j17;
                java.lang.String str3 = h17.f415020r;
                if (str3 == null) {
                    str3 = "talker-ignore";
                }
                v20Var.f8168b = str3;
                wxFileIndexDirtyEvent.e();
            }
        } else {
            com.tencent.mm.vfs.w6.d(this.f234546f, ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f22571s, a17, true), z17);
            com.tencent.mm.vfs.w6.d(this.f234547g, tj6, z17);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgRetransmitUI", "CopyVideoTask ori[%s] status[%d] new[%s]", this.f234546f, java.lang.Integer.valueOf(h17 != null ? h17.f415011i : 0), a17);
        if (t21.d3.s() && h17 != null && !com.tencent.mm.sdk.platformtools.t8.K0(h17.S)) {
            java.lang.String str4 = h17.S;
            ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
            t21.v2 h18 = t21.d3.h(str4);
            boolean z18 = Li != null && Li.A0() == 1;
            if (h18 != null && (h18.f415011i == 199 || z18)) {
                this.f234563w = a17 + ya.b.ORIGIN;
                java.lang.String rj6 = Li != null ? ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(Li, bm5.f0.f22570r, h17.S, false) : ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f22570r, h17.S, false);
                tg3.u0 u0Var2 = (tg3.u0) i95.n0.c(tg3.u0.class);
                bm5.f0 f0Var2 = bm5.f0.f22570r;
                java.lang.String rj7 = ((k90.b) u0Var2).rj(null, f0Var2, this.f234563w, true);
                com.tencent.mm.vfs.w6.d(rj6, rj7, z17);
                if (!com.tencent.mm.vfs.w6.j(rj7)) {
                    ((c35.m) i95.n0.c(c35.m.class)).getClass();
                    this.f234563w = null;
                    return a17;
                }
                if ((Li == null || Li.z2()) && !com.tencent.mm.vfs.w6.j(rj7)) {
                    ((c35.m) i95.n0.c(c35.m.class)).getClass();
                    com.tencent.mm.vfs.w6.c(rj7, ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, f0Var2, a17, true));
                }
                java.lang.String rj8 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f22571s, a17, false);
                if (com.tencent.mm.vfs.w6.j(rj7) && !com.tencent.mm.vfs.w6.j(rj8)) {
                    com.tencent.mm.vfs.w6.c(rj7, rj8);
                }
                java.lang.String tj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(Li, h18.d(), false);
                if (!com.tencent.mm.vfs.w6.j(tj6) && com.tencent.mm.vfs.w6.j(tj7)) {
                    com.tencent.mm.vfs.w6.d(tj7, tj6, z17);
                }
                com.tencent.mm.autogen.events.WxFileIndexDirtyEvent wxFileIndexDirtyEvent2 = new com.tencent.mm.autogen.events.WxFileIndexDirtyEvent();
                long j18 = h17.f415016n;
                am.v20 v20Var2 = wxFileIndexDirtyEvent2.f54994g;
                v20Var2.f8167a = j18;
                java.lang.String str5 = h17.f415020r;
                v20Var2.f8168b = str5 != null ? str5 : "talker-ignore";
                wxFileIndexDirtyEvent2.e();
            }
        }
        tg3.u0 u0Var3 = (tg3.u0) i95.n0.c(tg3.u0.class);
        bm5.f0 f0Var3 = bm5.f0.f22571s;
        com.tencent.mm.vfs.w6.k(((k90.b) u0Var3).rj(null, f0Var3, a17, false));
        com.tencent.mm.vfs.w6.k(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, f0Var3, this.f234546f, false));
        return a17;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03bf  */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPostExecute(java.lang.Object r45) {
        /*
            Method dump skipped, instructions count: 1104
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk5.c2.onPostExecute(java.lang.Object):void");
    }
}

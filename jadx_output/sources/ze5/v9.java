package ze5;

/* loaded from: classes9.dex */
public class v9 implements com.tencent.mm.storage.a9, ze5.ma {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f472263d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f472264e;

    /* renamed from: f, reason: collision with root package name */
    public final int f472265f;

    /* renamed from: g, reason: collision with root package name */
    public final float f472266g;

    /* renamed from: h, reason: collision with root package name */
    public final wd5.b f472267h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.msgquote.model.MsgQuoteItem f472268i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f472269m;

    public v9(com.tencent.mm.storage.f9 f9Var, yb5.q qVar, yb5.a aVar) {
        r15.i iVar = null;
        this.f472263d = null;
        this.f472264e = false;
        this.f472265f = 0;
        this.f472266g = 0.0f;
        wd5.b bVar = new wd5.b();
        this.f472267h = bVar;
        this.f472269m = false;
        try {
            sb5.p2 p2Var = (sb5.p2) aVar.f460703a.f460708c.a(sb5.p2.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            if (f9Var.M2()) {
                ot0.q v17 = ot0.q.v(f9Var.U1());
                if (v17 != null && !android.text.TextUtils.isEmpty(v17.f348734z)) {
                    java.lang.String b17 = tv.a.b(v17.f348734z);
                    if (((com.tencent.mm.ui.chatting.component.jo) p2Var).f199315f) {
                        this.f472264e = com.tencent.mm.vfs.w6.j(b17);
                    } else {
                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                        this.f472263d = new java.lang.ref.WeakReference(m11.b1.Di().b3(b17, i65.a.g(context), context, com.tencent.mm.R.drawable.bzt));
                    }
                }
            } else {
                java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(f9Var, f9Var.z0(), false);
                if (((com.tencent.mm.ui.chatting.component.jo) p2Var).f199315f) {
                    this.f472264e = com.tencent.mm.vfs.w6.j(tj6);
                } else {
                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                    this.f472263d = new java.lang.ref.WeakReference(m11.b1.Di().b3(tj6, i65.a.g(context), context, com.tencent.mm.R.drawable.bzt));
                }
            }
            java.lang.String str = qVar.f460742a;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            str = str == null ? "" : str;
            t21.v2 h17 = t21.d3.h(f9Var.z0());
            if (f9Var.getType() == 43 && h17 != null) {
                this.f472265f = h17.f415011i;
            }
            bVar.f445094r = wd5.a.f445080g;
            r15.b bVar2 = new r15.b();
            if (h17 != null && h17.g() != null) {
                bVar2.fromXml(h17.g());
                r15.i n17 = bVar2.n();
                if (n17 != null && n17.l() > 0) {
                    iVar = bVar2.n();
                }
            }
            if (iVar != null) {
                bVar.k(iVar);
            }
            this.f472268i = lf5.g.c(bVar, str);
            this.f472269m = ((com.tencent.mm.ui.chatting.component.v4) ((sb5.b0) aVar.f460703a.f460708c.a(sb5.b0.class))).o0(f9Var);
            if (f9Var.A0() == 1 && j62.e.g().c(new com.tencent.mm.repairer.config.msgsend.RepairerConfigVideoSendTranscodeProgress()) == 1) {
                if (((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).aj(f9Var.z0())) {
                    this.f472266g = ((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).cj(new com.tencent.mm.plugin.msg.MsgIdTalker(f9Var.getMsgId(), f9Var.Q0()));
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingItemVideoMvvm", th6, "parse videoThumb err", new java.lang.Object[0]);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008b, code lost:
    
        if (r2 != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x002b, code lost:
    
        if (r2.get() != r3.get()) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    @Override // com.tencent.mm.storage.a9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean U(java.lang.Object r6) {
        /*
            r5 = this;
            ze5.v9 r6 = (ze5.v9) r6
            r0 = 0
            r1 = 1
            java.lang.ref.WeakReference r2 = r5.f472263d
            if (r2 != 0) goto Ld
            java.lang.ref.WeakReference r3 = r6.f472263d
            if (r3 != 0) goto Ld
            goto L2d
        Ld:
            if (r2 == 0) goto L2f
            java.lang.ref.WeakReference r3 = r6.f472263d
            if (r3 != 0) goto L14
            goto L2f
        L14:
            java.lang.Object r3 = r2.get()
            if (r3 == 0) goto L2f
            java.lang.ref.WeakReference r3 = r6.f472263d
            java.lang.Object r4 = r3.get()
            if (r4 != 0) goto L23
            goto L2f
        L23:
            java.lang.Object r2 = r2.get()
            java.lang.Object r3 = r3.get()
            if (r2 != r3) goto L2f
        L2d:
            r2 = r1
            goto L30
        L2f:
            r2 = r0
        L30:
            if (r2 == 0) goto La2
            boolean r2 = r6.f472264e
            boolean r3 = r5.f472264e
            if (r3 != r2) goto L3a
            r2 = r1
            goto L3b
        L3a:
            r2 = r0
        L3b:
            if (r2 == 0) goto La2
            int r2 = r5.f472265f
            int r3 = r6.f472265f
            if (r2 != r3) goto La2
            boolean r2 = r5.f472269m
            boolean r3 = r6.f472269m
            if (r2 != r3) goto La2
            wd5.b r2 = r5.f472267h
            r15.i r3 = r2.j()
            wd5.b r4 = r6.f472267h
            if (r3 != 0) goto L5a
            r15.i r3 = r4.j()
            if (r3 != 0) goto L5a
            goto L8d
        L5a:
            r15.i r3 = r2.j()
            if (r3 == 0) goto L8f
            r15.i r3 = r4.j()
            if (r3 != 0) goto L67
            goto L8f
        L67:
            r15.i r3 = r2.j()
            if (r3 == 0) goto L80
            r15.i r3 = r4.j()
            if (r3 == 0) goto L80
            r15.i r2 = r2.j()
            r15.i r3 = r4.j()
            boolean r2 = r2.compareContent(r3)
            goto L81
        L80:
            r2 = r0
        L81:
            com.tencent.mm.plugin.msgquote.model.MsgQuoteItem r3 = r5.f472268i
            com.tencent.mm.plugin.msgquote.model.MsgQuoteItem r4 = r6.f472268i
            boolean r3 = r3.a(r4)
            if (r3 == 0) goto L8f
            if (r2 == 0) goto L8f
        L8d:
            r2 = r1
            goto L90
        L8f:
            r2 = r0
        L90:
            if (r2 == 0) goto La2
            float r2 = r5.f472266g
            float r6 = r6.f472266g
            float r2 = r2 - r6
            float r6 = java.lang.Math.abs(r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 >= 0) goto La2
            r0 = r1
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.v9.U(java.lang.Object):boolean");
    }

    @Override // ze5.ma
    public wd5.b a() {
        return this.f472267h;
    }

    @Override // ze5.ma
    public com.tencent.mm.plugin.msgquote.model.MsgQuoteItem b() {
        return this.f472268i;
    }
}

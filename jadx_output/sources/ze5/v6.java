package ze5;

/* loaded from: classes9.dex */
public class v6 implements com.tencent.mm.storage.a9, ze5.ma {

    /* renamed from: d, reason: collision with root package name */
    public final int f472253d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.l f472254e;

    /* renamed from: f, reason: collision with root package name */
    public final wd5.b f472255f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f472256g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.msgquote.model.MsgQuoteItem f472257h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f472258i;

    public v6(com.tencent.mm.storage.f9 f9Var, yb5.q qVar, yb5.a aVar) {
        long j17;
        int i17;
        wd5.b bVar = new wd5.b();
        this.f472255f = bVar;
        boolean z17 = false;
        this.f472256g = false;
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b0 S1 = m11.b1.Di().S1(f9Var);
        if (S1 != null) {
            java.lang.Float f17 = (java.lang.Float) ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).ij().get(java.lang.String.format("%s_%s", f9Var.Q0(), java.lang.Long.valueOf(f9Var.getMsgId())));
            if (f17 != null) {
                i17 = java.lang.Math.round(f17.floatValue());
            } else {
                int i18 = S1.f322636d;
                int i19 = S1.f322635c;
                long j18 = S1.f322633a;
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = m11.w0.f322806a;
                if (concurrentHashMap.containsKey(java.lang.Long.valueOf(j18))) {
                    android.support.v4.media.f.a(concurrentHashMap.get(java.lang.Long.valueOf(S1.f322633a)));
                    throw null;
                }
                if (S1.j()) {
                    m11.b0 C1 = m11.b1.Di().C1(java.lang.Long.valueOf(S1.f322649q));
                    if (concurrentHashMap.containsKey(java.lang.Long.valueOf(S1.f322649q))) {
                        android.support.v4.media.f.a(concurrentHashMap.get(java.lang.Long.valueOf(S1.f322649q)));
                        throw null;
                    }
                    int i27 = C1.f322636d;
                    i19 = C1.f322635c;
                    i18 = i27;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ImgInfoLogic", "getUploadPercentage, %s, %s, %s", java.lang.Long.valueOf(S1.f322633a), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i18));
                if (i18 > 0) {
                    j17 = 100;
                    if (i19 < i18) {
                        j17 = (i19 * 100) / i18;
                    }
                } else {
                    j17 = 0;
                }
                i17 = (int) j17;
            }
            this.f472253d = i17;
        }
        this.f472254e = ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).hj(f9Var);
        bVar.f445094r = wd5.a.f445079f;
        r15.b bVar2 = new r15.b();
        if (f9Var.U1() != null) {
            bVar2.fromXml(f9Var.U1());
            r15.i n17 = bVar2.n();
            if (n17 != null && n17.l() > 0) {
                z17 = true;
            }
            if (z17) {
                bVar.k(bVar2.n());
            }
        }
        this.f472256g = ((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).mj(f9Var, S1 != null ? S1.f322639g : null);
        java.lang.String str = qVar.f460742a;
        this.f472257h = lf5.g.c(bVar, str == null ? "" : str);
        this.f472258i = ((com.tencent.mm.ui.chatting.component.v4) ((sb5.b0) aVar.f460703a.f460708c.a(sb5.b0.class))).o0(f9Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0062, code lost:
    
        if (r0 != false) goto L27;
     */
    @Override // com.tencent.mm.storage.a9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean U(java.lang.Object r6) {
        /*
            r5 = this;
            ze5.v6 r6 = (ze5.v6) r6
            boolean r0 = r6.f472256g
            boolean r1 = r5.f472256g
            r2 = 0
            if (r1 != r0) goto L70
            int r0 = r5.f472253d
            int r1 = r6.f472253d
            if (r0 != r1) goto L70
            jz5.l r0 = r5.f472254e
            java.lang.Object r0 = r0.f302833d
            java.lang.Integer r0 = (java.lang.Integer) r0
            jz5.l r1 = r6.f472254e
            java.lang.Object r1 = r1.f302833d
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L70
            wd5.b r0 = r5.f472255f
            r15.i r1 = r0.j()
            r3 = 1
            wd5.b r4 = r6.f472255f
            if (r1 != 0) goto L31
            r15.i r1 = r4.j()
            if (r1 != 0) goto L31
            goto L64
        L31:
            r15.i r1 = r0.j()
            if (r1 == 0) goto L66
            r15.i r1 = r4.j()
            if (r1 != 0) goto L3e
            goto L66
        L3e:
            r15.i r1 = r0.j()
            if (r1 == 0) goto L57
            r15.i r1 = r4.j()
            if (r1 == 0) goto L57
            r15.i r0 = r0.j()
            r15.i r1 = r4.j()
            boolean r0 = r0.compareContent(r1)
            goto L58
        L57:
            r0 = r2
        L58:
            com.tencent.mm.plugin.msgquote.model.MsgQuoteItem r1 = r5.f472257h
            com.tencent.mm.plugin.msgquote.model.MsgQuoteItem r4 = r6.f472257h
            boolean r1 = r1.a(r4)
            if (r1 == 0) goto L66
            if (r0 == 0) goto L66
        L64:
            r0 = r3
            goto L67
        L66:
            r0 = r2
        L67:
            if (r0 == 0) goto L70
            boolean r0 = r5.f472258i
            boolean r6 = r6.f472258i
            if (r0 != r6) goto L70
            r2 = r3
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.v6.U(java.lang.Object):boolean");
    }

    @Override // ze5.ma
    public wd5.b a() {
        return this.f472255f;
    }

    @Override // ze5.ma
    public com.tencent.mm.plugin.msgquote.model.MsgQuoteItem b() {
        return this.f472257h;
    }
}

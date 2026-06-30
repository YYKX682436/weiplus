package r35;

/* loaded from: classes11.dex */
public class e4 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f369084d;

    /* renamed from: f, reason: collision with root package name */
    public ns.h f369086f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Context f369087g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f369088h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMLimitedClearEditText f369089i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f369090m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.List f369091n;

    /* renamed from: o, reason: collision with root package name */
    public java.util.LinkedList f369092o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.LinkedList f369093p;

    /* renamed from: r, reason: collision with root package name */
    public java.util.Map f369095r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f369096s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f369097t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f369098u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f369099v;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.model.m3 f369102y;

    /* renamed from: z, reason: collision with root package name */
    public r45.dz3 f369103z;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f369085e = null;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f369094q = "";

    /* renamed from: w, reason: collision with root package name */
    public boolean f369100w = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f369101x = true;
    public boolean A = false;

    public e4(android.content.Context context, ns.h hVar) {
        this.f369087g = context;
        this.f369086f = hVar;
    }

    public final void a(int i17, int i18, java.lang.String str) {
        if (i17 == 4 && i18 == -22) {
            android.content.Context context = this.f369087g;
            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f489853dl), 1).show();
        } else if (i17 == 4 && i18 == -24 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            dp.a.makeText(this.f369087g, str, 1).show();
        } else {
            android.content.Context context2 = this.f369087g;
            dp.a.makeText(context2, context2.getString(com.tencent.mm.R.string.f489852dk), 1).show();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SendVerifyRequest", "dealFail.");
    }

    public final void b() {
        com.tencent.mm.pluginsdk.model.m3 m3Var = new com.tencent.mm.pluginsdk.model.m3(2, this.f369090m, this.f369092o, this.f369094q, "", this.f369095r, this.f369098u, this.f369091n);
        this.f369102y = m3Var;
        m3Var.S(this.f369100w);
        this.f369102y.U(this.f369096s, this.f369097t);
        this.f369102y.R(this.f369103z);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f369102y.Q(currentTimeMillis);
        com.tencent.mars.xlog.Log.i("MicroMsg.SendVerifyRequest", "SendVerifyRequest doScene: id=%d", java.lang.Long.valueOf(currentTimeMillis));
        gm0.j1.n().f273288b.g(this.f369102y);
    }

    public final void c() {
        java.util.LinkedList linkedList = this.f369093p;
        if (linkedList == null || linkedList.isEmpty()) {
            this.A = true;
            gm0.j1.n().f273288b.a(881, this);
            gm0.j1.n().f273288b.g(new l41.x((java.lang.String) this.f369090m.getFirst(), "", ""));
        } else {
            l41.f0 f0Var = new l41.f0((java.lang.String) this.f369090m.getFirst(), this.f369094q, (java.lang.String) this.f369093p.getFirst(), 0);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            f0Var.H(currentTimeMillis, null, null, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.SendVerifyRequest", "SendVerifyRequest doVerifyOpenIm clientMsgId=%d openImCustomInfo=%s openImAppId=%s descWordingId=%s", java.lang.Long.valueOf(currentTimeMillis), null, null, null);
            gm0.j1.n().f273288b.g(f0Var);
        }
    }

    public final void d() {
        gm0.j1.n().f273288b.a(30, this);
        gm0.j1.n().f273288b.a(243, this);
    }

    public final void e() {
        gm0.j1.n().f273288b.q(30, this);
        gm0.j1.n().f273288b.q(243, this);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = this.f369085e;
        if (j0Var != null) {
            j0Var.dismiss();
            this.f369085e = null;
        }
    }

    public void f(java.util.LinkedList linkedList, java.util.LinkedList linkedList2, java.util.LinkedList linkedList3) {
        iz5.a.g(null, linkedList.size() >= 1);
        iz5.a.g(null, linkedList2.size() >= 1);
        d();
        this.f369090m = linkedList;
        this.f369092o = linkedList2;
        this.f369093p = linkedList3;
        this.f369088h = android.view.View.inflate(this.f369087g, com.tencent.mm.R.layout.ckf, null);
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(this.f369099v == null);
        java.lang.String str = this.f369099v;
        objArr[1] = java.lang.Integer.valueOf(str != null ? str.length() : 0);
        objArr[2] = this.f369099v;
        com.tencent.mars.xlog.Log.i("MicroMsg.SendVerifyRequest", "verifyTip is null: %b, length : %d, value : [%s]", objArr);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f369099v)) {
            ((android.widget.TextView) this.f369088h.findViewById(com.tencent.mm.R.id.mmq)).setText(this.f369099v);
        }
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) this.f369088h.findViewById(com.tencent.mm.R.id.mmp);
        this.f369089i = mMLimitedClearEditText;
        mMLimitedClearEditText.setText((java.lang.String) null);
        r35.w3 w3Var = new r35.w3(this);
        r35.x3 x3Var = new r35.x3(this);
        android.content.Context context = this.f369087g;
        com.tencent.mm.ui.widget.dialog.j0 x17 = db5.e1.x(context, context.getString(com.tencent.mm.R.string.iip), null, this.f369088h, w3Var, x3Var);
        this.f369085e = x17;
        if (x17 == null) {
            e();
        }
        this.f369089i.post(new r35.y3(this));
    }

    public void g(java.util.List list, java.util.List list2) {
        this.f369101x = false;
        d();
        this.f369090m = new java.util.LinkedList(list);
        this.f369092o = new java.util.LinkedList(list2);
        if (list.size() == 1 && com.tencent.mm.storage.z3.m4((java.lang.String) this.f369090m.getFirst())) {
            c();
        } else {
            b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x01fa, code lost:
    
        if (((en.a) ((en.k) i95.n0.c(en.k.class))).Zi(r17.f369087g, r18, r19, r20) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fc, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x024d, code lost:
    
        if (((en.a) ((en.k) i95.n0.c(en.k.class))).Zi(r17.f369087g, r18, r19, r20) != false) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.modelbase.u0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSceneEnd(int r18, int r19, java.lang.String r20, com.tencent.mm.modelbase.m1 r21) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r35.e4.onSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.m1):void");
    }
}

package wh5;

/* loaded from: classes12.dex */
public final class s extends pf3.g implements uf3.a {
    public boolean A;
    public long B;
    public final java.util.Set C;
    public final pf3.a D;
    public final pf3.a E;
    public final pf3.a F;
    public final pf3.a G;

    /* renamed from: v, reason: collision with root package name */
    public em.n1 f446089v;

    /* renamed from: w, reason: collision with root package name */
    public lg3.a f446090w;

    /* renamed from: x, reason: collision with root package name */
    public vh5.a f446091x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f446092y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f446093z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(mf3.p apiCenter) {
        super(apiCenter, "MediaGallery.ChatLiveBottomBarLayer");
        kotlin.jvm.internal.o.g(apiCenter, "apiCenter");
        this.C = new java.util.LinkedHashSet();
        this.D = Z(this, "disabled", wh5.m.f446077d);
        this.E = Z(this, "translate", new wh5.r(this));
        this.F = Z(this, "normal", new wh5.o(this));
        this.G = Z(this, "normalHd", new wh5.n(this));
    }

    public static final void g0(wh5.s sVar, dg3.q qVar) {
        mf3.k kVar;
        dg3.m mVar;
        mf3.s sVar2 = sVar.f326110m;
        if (sVar2 == null || (kVar = sVar2.f326117a) == null || (mVar = (dg3.m) sVar.H(dg3.m.class)) == null) {
            return;
        }
        mVar.Z0(kVar, sVar.f353826s, qVar);
    }

    @Override // rf3.h
    public void D() {
        mf3.k kVar;
        e0();
        mf3.s sVar = this.f326110m;
        if (((sVar == null || (kVar = sVar.f326117a) == null) ? null : kVar.getLevel()) == mf3.w.f326128d) {
            S(this, this.F);
        } else {
            S(this, this.G);
        }
        a0();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void F() {
        mf3.k kVar;
        super.F();
        i0();
        a0();
        for (java.lang.String viewId : this.C) {
            vh5.a aVar = this.f446091x;
            if (aVar != null) {
                kotlin.jvm.internal.o.g(viewId, "viewId");
                ((g90.s) ((h90.v) i95.n0.c(h90.v.class))).Ui(aVar.f437200a, aVar.f437201b, 1, viewId);
            }
        }
        mf3.s sVar = this.f326110m;
        if (((sVar == null || (kVar = sVar.f326117a) == null) ? null : kVar.getLevel()) == mf3.w.f326128d) {
            vh5.a.f437199e = false;
        } else {
            vh5.a.f437199e = true;
        }
    }

    @Override // mf3.e
    public android.view.View J(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.ejk, (android.view.ViewGroup) null);
        this.f446089v = new em.n1(inflate);
        kotlin.jvm.internal.o.f(inflate, "getInflateRootView(...)");
        return inflate;
    }

    @Override // rf3.h
    public void b() {
        S(this, this.D);
    }

    @Override // pf3.g, pf3.h
    public void c() {
        if (this.f446092y) {
            return;
        }
        super.c();
    }

    @Override // pf3.g
    public void c0() {
        super.c0();
        b0();
    }

    @Override // pf3.g
    public void d0(boolean z17) {
        if (z17) {
            return;
        }
        for (java.lang.String viewId : this.C) {
            vh5.a aVar = this.f446091x;
            if (aVar != null) {
                kotlin.jvm.internal.o.g(viewId, "viewId");
                h90.v vVar = (h90.v) i95.n0.c(h90.v.class);
                ((g90.s) vVar).Vi(aVar.f437200a, aVar.f437201b, 1, viewId);
            }
        }
    }

    @Override // pf3.g
    public void f0() {
        if (this.f446092y) {
            return;
        }
        super.f0();
    }

    @Override // rf3.h
    public void h() {
        e0();
        S(this, this.E);
        a0();
    }

    public final boolean h0() {
        mf3.k kVar;
        vf3.a aVar;
        vf3.b T4;
        mf3.s sVar = this.f326110m;
        return (sVar == null || (kVar = sVar.f326117a) == null || (aVar = (vf3.a) H(vf3.a.class)) == null || (T4 = aVar.T4(kVar)) == null || T4.f436366b <= 0 || T4.f436368d <= 0 || T4.f436370f) ? false : true;
    }

    public final void i0() {
        mf3.k kVar;
        vf3.a aVar;
        vf3.f X6;
        mf3.s sVar = this.f326110m;
        if (sVar == null || (kVar = sVar.f326117a) == null || (aVar = (vf3.a) H(vf3.a.class)) == null || (X6 = ((vf3.i) aVar).X6(kVar)) == null) {
            return;
        }
        lg3.a aVar2 = this.f446090w;
        if (aVar2 != null) {
            ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar2).h(kVar, X6);
        }
        if (X6.f436389a == vf3.e.f436384n) {
            S(this, this.E);
        } else if (kVar.getLevel() == mf3.w.f326128d) {
            S(this, this.F);
        } else {
            S(this, this.G);
        }
    }

    public final void j0(android.view.View view, java.lang.String str, android.view.View.OnClickListener onClickListener) {
        wh5.p pVar = new wh5.p(this, str);
        kotlin.jvm.internal.o.g(view, "<this>");
        java.lang.String V = V(view);
        java.util.Map map = this.f353822q;
        if (map.containsKey(V)) {
            throw new java.lang.RuntimeException("register visibilityListener, duplicate id: " + V);
        }
        map.put(V, pVar);
        pf3.d.U(this, view, null, new wh5.q(onClickListener, view, this, str), 1, null);
    }

    public final void k0() {
        mf3.k kVar;
        vf3.a aVar;
        vf3.f X6;
        vf3.e eVar;
        mf3.s sVar = this.f326110m;
        if (sVar == null || (kVar = sVar.f326117a) == null || (aVar = (vf3.a) H(vf3.a.class)) == null || (X6 = ((vf3.i) aVar).X6(kVar)) == null || !((eVar = X6.f436389a) == vf3.e.f436378e || eVar == vf3.e.f436381h || eVar == vf3.e.f436384n)) {
            Q("isResourceNotReady, delay startPlay", new java.lang.Object[0]);
            this.f446093z = true;
        } else {
            uf3.c cVar = (uf3.c) g(uf3.c.class);
            if (cVar != null) {
                ((uf3.g) cVar).X();
            }
        }
    }

    public final void l0() {
        mf3.k kVar;
        mf3.s sVar = this.f326110m;
        if (sVar == null || (kVar = sVar.f326117a) == null || kVar.getLevel() != mf3.w.f326128d) {
            return;
        }
        Q("tryDownloadHD execute", new java.lang.Object[0]);
        kVar.f(mf3.w.f326129e);
        uf3.c cVar = (uf3.c) g(uf3.c.class);
        if (cVar != null) {
            ((uf3.g) cVar).V();
        }
    }

    @Override // uf3.a
    public void m(vf3.e state, vf3.f extraInfo) {
        vh5.a aVar;
        mf3.k kVar;
        lg3.a aVar2;
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(extraInfo, "extraInfo");
        mf3.s sVar = this.f326110m;
        java.lang.Object obj = sVar != null ? sVar.f326117a : null;
        wh5.v vVar = obj instanceof wh5.v ? (wh5.v) obj : null;
        if (vVar == null) {
            return;
        }
        if (vVar.f446098c == mf3.w.f326129e) {
            vf3.e eVar = extraInfo.f436389a;
            if (sVar != null && (kVar = sVar.f326117a) != null && (aVar2 = this.f446090w) != null) {
                ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar2).h(kVar, extraInfo);
            }
            if (eVar == vf3.e.f436380g) {
                a0();
            }
            if (eVar == vf3.e.f436383m) {
                S(this, this.F);
            }
            if (eVar == vf3.e.f436381h && (aVar = this.f446091x) != null) {
                android.app.Activity activity = aVar.f437200a;
                kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.gallery.ImageGalleryUI");
                com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = (com.tencent.mm.ui.chatting.gallery.ImageGalleryUI) activity;
                h90.v vVar2 = (h90.v) i95.n0.c(h90.v.class);
                android.app.Activity activity2 = aVar.f437200a;
                com.tencent.mm.storage.f9 f9Var = aVar.f437201b;
                ((g90.s) vVar2).ij(activity2, f9Var, 1, 0, vh5.a.f437198d, imageGalleryUI.d7(f9Var));
                h90.v vVar3 = (h90.v) i95.n0.c(h90.v.class);
                android.app.Activity activity3 = aVar.f437200a;
                com.tencent.mm.storage.f9 f9Var2 = aVar.f437201b;
                ((g90.s) vVar3).cj(activity3, f9Var2, 1, vh5.a.f437198d, imageGalleryUI.c7(f9Var2));
                vh5.a.f437199e = true;
            }
        }
        if (state == vf3.e.f436386p) {
            this.f446092y = true;
            c0();
        } else {
            this.f446092y = false;
            f0();
        }
        if (state == vf3.e.f436381h) {
            if (this.f446093z) {
                Q("startPlay after onLiveLoadSuccess", new java.lang.Object[0]);
                k0();
                this.f446093z = false;
            }
            if (this.A) {
                Q("tryDownloadHD after onLiveLoadSuccess", new java.lang.Object[0]);
                l0();
                this.A = false;
            }
        }
    }

    @Override // mf3.l
    public void onPause() {
        b0();
    }

    @Override // mf3.l
    public void onResume() {
        e0();
        a0();
    }

    @Override // pf3.g, mf3.l
    public void q(float f17) {
        super.q(f17);
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void t(mf3.s bindContext) {
        kotlin.jvm.internal.o.g(bindContext, "bindContext");
        super.t(bindContext);
        this.A = false;
        this.f446093z = false;
        vh5.a aVar = this.f446091x;
        if (aVar != null) {
            vh5.a.f437197c = 0;
        }
        mf3.s sVar = this.f326110m;
        java.lang.Object obj = sVar != null ? sVar.f326117a : null;
        wh5.v vVar = obj instanceof wh5.v ? (wh5.v) obj : null;
        if (vVar != null) {
            if (aVar != null) {
                com.tencent.mm.storage.f9 msgInfo = vVar.f446096a;
                kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
                aVar.f437201b = msgInfo;
            }
            lg3.a aVar2 = this.f446090w;
            if (aVar2 != null) {
                ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar2).h(vVar, new vf3.f(vf3.e.f436377d, null, 0, 0.0f, 14, null));
            }
        }
        i0();
    }

    @Override // pf3.g, mf3.e, mf3.l
    public void u(android.view.View parentView) {
        kotlin.jvm.internal.o.g(parentView, "parentView");
        super.u(parentView);
        android.content.Context K = K();
        android.app.Activity activity = K instanceof android.app.Activity ? (android.app.Activity) K : null;
        if (activity != null) {
            this.f446091x = new vh5.a(activity);
        }
        if (j62.e.g().c(new com.tencent.mm.repairer.config.msg_history_gallery.RepairerConfigMsgHistoryGalleryLocatePreviewEnabled()) == 1) {
            em.n1 n1Var = this.f446089v;
            if (n1Var == null) {
                kotlin.jvm.internal.o.o("rootVB");
                throw null;
            }
            n1Var.g().setImageResource(com.tencent.mm.R.raw.icons_gallery_filled);
        }
        em.n1 n1Var2 = this.f446089v;
        if (n1Var2 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        if (n1Var2.f254637i == null) {
            n1Var2.f254637i = (com.tencent.mm.plugin.media.view.ShrinkNestedLayout) n1Var2.f254629a.findViewById(com.tencent.mm.R.id.u9w);
        }
        n1Var2.f254637i.setPriority(0);
        em.n1 n1Var3 = this.f446089v;
        if (n1Var3 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        if (n1Var3.f254635g == null) {
            n1Var3.f254635g = (com.tencent.mm.plugin.media.view.ShrinkNestedLayout) n1Var3.f254629a.findViewById(com.tencent.mm.R.id.uzd);
        }
        n1Var3.f254635g.setPriority(1);
        em.n1 n1Var4 = this.f446089v;
        if (n1Var4 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        n1Var4.b().setPriority(0);
        em.n1 n1Var5 = this.f446089v;
        if (n1Var5 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        n1Var5.c().setPriority(1);
        em.n1 n1Var6 = this.f446089v;
        if (n1Var6 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        android.view.View b17 = n1Var6.b();
        kotlin.jvm.internal.o.f(b17, "getBtnHd(...)");
        pf3.d.W(this, b17, null, 1, null);
        j0(b17, "pic_video_full_image", new wh5.g(this));
        em.n1 n1Var7 = this.f446089v;
        if (n1Var7 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        this.f446090w = n1Var7.b();
        em.n1 n1Var8 = this.f446089v;
        if (n1Var8 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        android.view.View c17 = n1Var8.c();
        kotlin.jvm.internal.o.f(c17, "getBtnLive(...)");
        pf3.d.W(this, c17, null, 1, null);
        T(c17, new pf3.j(0, kg3.c.a(java.lang.Double.valueOf(1.5d)), 0, kg3.c.a(java.lang.Double.valueOf(1.5d))), new wh5.h(this));
        em.n1 n1Var9 = this.f446089v;
        if (n1Var9 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox f17 = n1Var9.f();
        kotlin.jvm.internal.o.f(f17, "getBtnShare(...)");
        f17.setPriority(0);
        f17.setShrinkListener(new wh5.l0(f17));
        pf3.d.W(this, f17, null, 1, null);
        j0(f17, "pic_video_forward", new wh5.i(this));
        em.n1 n1Var10 = this.f446089v;
        if (n1Var10 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox a17 = n1Var10.a();
        kotlin.jvm.internal.o.f(a17, "getBtnGrid(...)");
        a17.setPriority(1);
        a17.setShrinkListener(new wh5.l0(a17));
        pf3.d.W(this, a17, null, 1, null);
        j0(a17, "pic_video_wall", new wh5.j(this));
        em.n1 n1Var11 = this.f446089v;
        if (n1Var11 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox e17 = n1Var11.e();
        kotlin.jvm.internal.o.f(e17, "getBtnSave(...)");
        e17.setPriority(2);
        e17.setShrinkListener(new wh5.l0(e17));
        pf3.d.W(this, e17, null, 1, null);
        j0(e17, "pic_video_save", new wh5.k(this));
        em.n1 n1Var12 = this.f446089v;
        if (n1Var12 == null) {
            kotlin.jvm.internal.o.o("rootVB");
            throw null;
        }
        com.tencent.mm.plugin.media.view.ShrinkBox d17 = n1Var12.d();
        kotlin.jvm.internal.o.f(d17, "getBtnMore(...)");
        d17.setPriority(3);
        d17.setShrinkListener(new wh5.l0(d17));
        pf3.d.W(this, d17, null, 1, null);
        j0(d17, "pic_video_three_dot", new wh5.l(this));
    }

    @Override // uf3.a
    public void v(vf3.b bVar) {
        lg3.a aVar = this.f446090w;
        if (aVar != null) {
            ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar).g(bVar);
        }
        i0();
    }
}

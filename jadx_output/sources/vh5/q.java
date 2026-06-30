package vh5;

/* loaded from: classes12.dex */
public final class q implements mf3.l, u3.q {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f437230d;

    /* renamed from: e, reason: collision with root package name */
    public final mf3.u f437231e;

    /* renamed from: f, reason: collision with root package name */
    public int f437232f;

    /* renamed from: g, reason: collision with root package name */
    public mf3.n f437233g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f437234h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.media.view.OperationInterceptorLayout f437235i;

    /* renamed from: m, reason: collision with root package name */
    public vh5.g f437236m;

    /* renamed from: n, reason: collision with root package name */
    public final mf3.p f437237n;

    public q(android.view.View itemView, mf3.u mediaType) {
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(mediaType, "mediaType");
        this.f437230d = itemView;
        this.f437231e = mediaType;
        this.f437232f = -1;
        this.f437234h = "";
        android.content.Context context = itemView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f437237n = new mf3.p(context);
    }

    @Override // mf3.l
    public void F() {
        b();
        mf3.n nVar = this.f437233g;
        if (nVar != null) {
            nVar.F();
        }
    }

    @Override // u3.q
    public void a(u3.s sVar, float f17, float f18) {
        this.f437230d.setTranslationX(f17);
    }

    public final java.lang.String b() {
        java.lang.String hexString = java.lang.Integer.toHexString(hashCode());
        kotlin.jvm.internal.o.f(hexString, "toHexString(...)");
        return hexString;
    }

    public void c(int i17, vh5.o eventData) {
        mf3.j jVar;
        mf3.k kVar;
        kotlin.jvm.internal.o.g(eventData, "eventData");
        f06.d apiKClass = kotlin.jvm.internal.i0.a(vh5.p.class);
        mf3.p pVar = this.f437237n;
        pVar.getClass();
        kotlin.jvm.internal.o.g(apiKClass, "apiKClass");
        vh5.p pVar2 = (vh5.p) pVar.a(xz5.a.b(apiKClass));
        if (pVar2 != null) {
            wh5.k0 k0Var = (wh5.k0) pVar2;
            wh5.m0 m0Var = eventData instanceof wh5.m0 ? (wh5.m0) eventData : null;
            if (m0Var != null) {
                if (m0Var.f446078a) {
                    uf3.c cVar = (uf3.c) k0Var.g(uf3.c.class);
                    if (cVar != null) {
                        java.lang.String str = m0Var.f446079b;
                        if (str == null) {
                            str = "";
                        }
                        uf3.g gVar = (uf3.g) cVar;
                        mf3.s sVar = gVar.f326110m;
                        if (sVar != null && (kVar = sVar.f326117a) != null) {
                            gVar.Q("applyTranslateResult, path: ".concat(str), new java.lang.Object[0]);
                            vf3.a aVar = (vf3.a) gVar.H(vf3.a.class);
                            if (aVar != null) {
                                aVar.p1(kVar, str, gVar);
                            }
                            uf3.a aVar2 = (uf3.a) gVar.f326104d.a(uf3.a.class);
                            if (aVar2 != null) {
                                aVar2.h();
                            }
                        }
                    }
                } else {
                    uf3.c cVar2 = (uf3.c) k0Var.g(uf3.c.class);
                    if (cVar2 != null) {
                        uf3.g gVar2 = (uf3.g) cVar2;
                        uf3.a aVar3 = (uf3.a) gVar2.f326104d.a(uf3.a.class);
                        if (aVar3 != null) {
                            aVar3.D();
                        }
                        gVar2.V();
                    }
                }
            }
            wh5.j0 j0Var = eventData instanceof wh5.j0 ? (wh5.j0) eventData : null;
            if (j0Var != null) {
                if (j0Var.f446072a) {
                    uf3.a aVar4 = (uf3.a) k0Var.g(uf3.a.class);
                    if (aVar4 != null) {
                        aVar4.b();
                    }
                } else {
                    uf3.a aVar5 = (uf3.a) k0Var.g(uf3.a.class);
                    if (aVar5 != null) {
                        aVar5.D();
                    }
                }
            }
            wh5.i0 i0Var = eventData instanceof wh5.i0 ? (wh5.i0) eventData : null;
            if (i0Var != null) {
                uf3.c cVar3 = (uf3.c) k0Var.g(uf3.c.class);
                if (cVar3 != null) {
                    uf3.g gVar3 = (uf3.g) cVar3;
                    em.o1 o1Var = gVar3.f427184o;
                    if (o1Var == null) {
                        kotlin.jvm.internal.o.o("rootVB");
                        throw null;
                    }
                    com.tencent.mm.plugin.media.live.LiveSwitchableContainer f17 = o1Var.f();
                    kotlin.jvm.internal.o.f(f17, "getLiveSwitchableContainer(...)");
                    if (f17.getWidth() > f17.getHeight()) {
                        gVar3.W(false);
                    } else {
                        gVar3.R();
                    }
                }
                if (i0Var.f446070a || (jVar = (uf3.a) k0Var.g(uf3.a.class)) == null) {
                    return;
                }
                ((pf3.g) jVar).e0();
            }
        }
    }

    @Override // mf3.l
    public void i() {
        b();
        mf3.n nVar = this.f437233g;
        if (nVar != null) {
            nVar.i();
        }
    }

    @Override // mf3.l
    public mg3.b l() {
        mf3.n nVar = this.f437233g;
        if (nVar != null) {
            return nVar.l();
        }
        return null;
    }

    @Override // mf3.l
    public mg3.e o() {
        return this.f437236m;
    }

    @Override // mf3.l
    public void onPause() {
        b();
        mf3.n nVar = this.f437233g;
        if (nVar != null) {
            nVar.onPause();
        }
    }

    @Override // mf3.l
    public void onResume() {
        b();
        mf3.n nVar = this.f437233g;
        if (nVar != null) {
            nVar.onResume();
        }
    }

    @Override // mf3.l
    public void q(float f17) {
        mf3.n nVar = this.f437233g;
        if (nVar != null) {
            nVar.q(f17);
        }
    }

    @Override // mf3.l
    public void recycle() {
        b();
        mf3.n nVar = this.f437233g;
        if (nVar != null) {
            nVar.recycle();
        }
    }

    @Override // mf3.l
    public void t(mf3.s bindContext) {
        kotlin.jvm.internal.o.g(bindContext, "bindContext");
        this.f437232f = bindContext.f326118b;
        vh5.g gVar = this.f437236m;
        if (gVar != null) {
            gVar.f437212g = bindContext;
        }
        this.f437234h = bindContext.f326117a.getId();
        b();
        mf3.n nVar = this.f437233g;
        if (nVar != null) {
            nVar.t(bindContext);
        }
        android.view.View findViewById = this.f437230d.findViewById(com.tencent.mm.R.id.cra);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        int i17 = this.f437232f;
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.chatting.RepairerConfigMediaGalleryDebug()) == 1) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("【index】" + i17 + " \n");
            sb6.append("【holder】" + b() + "\n【mediaId】" + this.f437234h);
            textView.setText(sb6.toString());
        }
    }

    @Override // mf3.l
    public void u(android.view.View parentView) {
        mf3.n nVar;
        kotlin.jvm.internal.o.g(parentView, "parentView");
        if (this.f437233g == null) {
            f06.d a17 = kotlin.jvm.internal.i0.a(mf3.m.class);
            mf3.p pVar = this.f437237n;
            mf3.m mVar = (mf3.m) pVar.b(a17);
            lf3.j jVar = (lf3.j) pVar.b(kotlin.jvm.internal.i0.a(lf3.j.class));
            android.view.View view = this.f437230d;
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.shc);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            this.f437235i = (com.tencent.mm.plugin.media.view.OperationInterceptorLayout) findViewById;
            mf3.u uVar = this.f437231e;
            if (mVar != null) {
                android.content.Context context = view.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                nVar = mVar.O0(context, pVar, uVar);
            } else {
                nVar = null;
            }
            this.f437233g = nVar;
            if (nVar == null) {
                com.tencent.mars.xlog.Log.e("MediaGallery.LiveGalleryHolder", "createHolder error, factory: " + mVar + " mediaType: " + uVar);
            }
            mf3.n nVar2 = this.f437233g;
            if (nVar2 != null) {
                nVar2.p(b());
                com.tencent.mm.plugin.media.view.OperationInterceptorLayout operationInterceptorLayout = this.f437235i;
                if (operationInterceptorLayout == null) {
                    kotlin.jvm.internal.o.o("interceptorLayout");
                    throw null;
                }
                nVar2.u(operationInterceptorLayout);
                com.tencent.mm.plugin.media.view.OperationInterceptorLayout operationInterceptorLayout2 = this.f437235i;
                if (operationInterceptorLayout2 == null) {
                    kotlin.jvm.internal.o.o("interceptorLayout");
                    throw null;
                }
                operationInterceptorLayout2.setLayer(nVar2);
                com.tencent.mm.plugin.media.view.OperationInterceptorLayout operationInterceptorLayout3 = this.f437235i;
                if (operationInterceptorLayout3 == null) {
                    kotlin.jvm.internal.o.o("interceptorLayout");
                    throw null;
                }
                vh5.g gVar = new vh5.g(operationInterceptorLayout3, nVar2, jVar);
                f06.d api = kotlin.jvm.internal.i0.a(mf3.o.class);
                kotlin.jvm.internal.o.g(api, "api");
                pVar.d(xz5.a.b(api), gVar);
                this.f437236m = gVar;
            }
        }
    }
}

package mf3;

/* loaded from: classes12.dex */
public final class r extends mf3.a implements mf3.l, u3.q {
    public final android.view.View A;
    public final mf3.u B;
    public mf3.n C;
    public u3.u D;
    public java.lang.String E;
    public mf3.y F;
    public com.tencent.mm.plugin.media.view.OperationInterceptorLayout G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(android.view.View itemView, mf3.u mediaType) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(mediaType, "mediaType");
        this.A = itemView;
        this.B = mediaType;
        this.E = "";
    }

    @Override // mf3.l
    public void F() {
        z();
        mf3.n nVar = this.C;
        if (nVar != null) {
            nVar.F();
        }
    }

    @Override // u3.q
    public void a(u3.s sVar, float f17, float f18) {
        this.A.setTranslationX(f17);
    }

    @Override // mf3.l
    public void i() {
        z();
        mf3.n nVar = this.C;
        if (nVar != null) {
            nVar.i();
        }
    }

    @Override // mf3.l
    public mg3.b l() {
        mf3.n nVar = this.C;
        if (nVar != null) {
            return nVar.l();
        }
        return null;
    }

    @Override // mf3.l
    public mg3.e o() {
        return this.F;
    }

    @Override // mf3.l
    public void onPause() {
        z();
        mf3.n nVar = this.C;
        if (nVar != null) {
            nVar.onPause();
        }
    }

    @Override // mf3.l
    public void onResume() {
        z();
        mf3.n nVar = this.C;
        if (nVar != null) {
            nVar.onResume();
        }
    }

    @Override // mf3.l
    public void q(float f17) {
        mf3.n nVar = this.C;
        if (nVar != null) {
            nVar.q(f17);
        }
    }

    @Override // mf3.l
    public void recycle() {
        z();
        mf3.n nVar = this.C;
        if (nVar != null) {
            nVar.recycle();
        }
    }

    @Override // mf3.l
    public void t(mf3.s bindContext) {
        kotlin.jvm.internal.o.g(bindContext, "bindContext");
        this.E = bindContext.f326117a.getId();
        z();
        mf3.n nVar = this.C;
        if (nVar != null) {
            nVar.t(bindContext);
        }
    }

    @Override // mf3.l
    public void u(android.view.View parentView) {
        mf3.n nVar;
        kotlin.jvm.internal.o.g(parentView, "parentView");
        u3.v vVar = new u3.v();
        vVar.f424246i = 0.0f;
        vVar.a(0.8f);
        vVar.b(10000.0f);
        u3.r rVar = u3.s.f424217l;
        android.view.View itemView = this.A;
        u3.u uVar = new u3.u(itemView, rVar);
        uVar.f424236t = vVar;
        this.D = uVar;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        android.content.Context context = itemView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        mf3.p pVar = new mf3.p(context);
        if (this.C == null) {
            mf3.m mVar = (mf3.m) pVar.b(kotlin.jvm.internal.i0.a(mf3.m.class));
            android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.shc);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            this.G = (com.tencent.mm.plugin.media.view.OperationInterceptorLayout) findViewById;
            mf3.u uVar2 = this.B;
            if (mVar != null) {
                kotlin.jvm.internal.o.f(itemView, "itemView");
                android.content.Context context2 = itemView.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                nVar = mVar.O0(context2, pVar, uVar2);
            } else {
                nVar = null;
            }
            this.C = nVar;
            if (nVar == null) {
                com.tencent.mars.xlog.Log.e("MediaGallery.MediaBaseViewHolder", "create layerDelegate error, factory: " + mVar + " mediaType: " + uVar2);
            }
            mf3.n nVar2 = this.C;
            if (nVar2 != null) {
                nVar2.p(z());
                com.tencent.mm.plugin.media.view.OperationInterceptorLayout operationInterceptorLayout = this.G;
                if (operationInterceptorLayout == null) {
                    kotlin.jvm.internal.o.o("interceptorLayout");
                    throw null;
                }
                nVar2.u(operationInterceptorLayout);
                com.tencent.mm.plugin.media.view.OperationInterceptorLayout operationInterceptorLayout2 = this.G;
                if (operationInterceptorLayout2 == null) {
                    kotlin.jvm.internal.o.o("interceptorLayout");
                    throw null;
                }
                operationInterceptorLayout2.setLayer(nVar2);
                lf3.j jVar = (lf3.j) pVar.b(kotlin.jvm.internal.i0.a(lf3.j.class));
                com.tencent.mm.plugin.media.view.OperationInterceptorLayout operationInterceptorLayout3 = this.G;
                if (operationInterceptorLayout3 == null) {
                    kotlin.jvm.internal.o.o("interceptorLayout");
                    throw null;
                }
                this.F = new mf3.y(operationInterceptorLayout3, nVar2, jVar);
                f06.d api = kotlin.jvm.internal.i0.a(mf3.o.class);
                mf3.y yVar = this.F;
                kotlin.jvm.internal.o.d(yVar);
                kotlin.jvm.internal.o.g(api, "api");
                pVar.d(xz5.a.b(api), yVar);
            }
        }
    }

    public final java.lang.String z() {
        java.lang.String hexString = java.lang.Integer.toHexString(hashCode());
        kotlin.jvm.internal.o.f(hexString, "toHexString(...)");
        return hexString;
    }
}

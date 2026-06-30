package mm2;

/* loaded from: classes3.dex */
public final class f6 extends mm2.e {
    public static final mm2.x5 G1 = new mm2.x5(null);
    public java.lang.String A;
    public int A1;
    public boolean B;
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData B1;
    public java.lang.String C;
    public java.lang.String C1;
    public java.lang.String D;
    public final java.util.Map D1;
    public r45.nt2 E;
    public final java.util.Map E1;
    public r45.uv2 F;
    public r45.x42 F1;
    public long G;
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData H;
    public mm2.y5 I;

    /* renamed from: J, reason: collision with root package name */
    public r45.k74 f329031J;
    public r45.e56 K;
    public long L;
    public com.tencent.mm.protobuf.g M;
    public com.tencent.mm.protobuf.g N;
    public r45.dv1 P;
    public final java.util.HashMap Q;
    public final java.util.HashMap R;
    public r45.cp1 S;
    public boolean T;
    public java.lang.String U;
    public r45.eu0 V;
    public r45.k31 W;
    public dk2.vf X;
    public r45.j31 Y;
    public r45.c33 Z;

    /* renamed from: f, reason: collision with root package name */
    public boolean f329032f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f329033g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329034h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f329035i;

    /* renamed from: l1, reason: collision with root package name */
    public bw5.jj0 f329036l1;

    /* renamed from: m, reason: collision with root package name */
    public boolean f329037m;

    /* renamed from: n, reason: collision with root package name */
    public r45.dv1 f329038n;

    /* renamed from: o, reason: collision with root package name */
    public qm0.a f329039o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f329040p;

    /* renamed from: p0, reason: collision with root package name */
    public bw5.x7 f329041p0;

    /* renamed from: p1, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f329042p1;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.LinkedList f329043q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f329044r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f329045s;

    /* renamed from: t, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f329046t;

    /* renamed from: u, reason: collision with root package name */
    public int f329047u;

    /* renamed from: v, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329048v;

    /* renamed from: w, reason: collision with root package name */
    public so2.j5 f329049w;

    /* renamed from: x, reason: collision with root package name */
    public long f329050x;

    /* renamed from: x0, reason: collision with root package name */
    public r45.yv2 f329051x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f329052x1;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.ArrayList f329053y;

    /* renamed from: y0, reason: collision with root package name */
    public r45.a56 f329054y0;

    /* renamed from: y1, reason: collision with root package name */
    public boolean f329055y1;

    /* renamed from: z, reason: collision with root package name */
    public boolean f329056z;

    /* renamed from: z1, reason: collision with root package name */
    public java.util.List f329057z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f329034h = kotlinx.coroutines.flow.i3.a(java.lang.Boolean.FALSE);
        this.f329039o = new qm0.a(new java.util.LinkedList(), null);
        this.f329040p = true;
        this.f329043q = new java.util.LinkedList();
        this.f329044r = new java.util.ArrayList();
        this.f329045s = "";
        this.f329046t = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f329048v = kotlinx.coroutines.flow.i3.a(0L);
        this.f329053y = new java.util.ArrayList();
        this.A = "";
        this.H = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.Q = new java.util.HashMap();
        this.R = new java.util.HashMap();
        this.U = "";
        this.f329042p1 = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.B1 = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.C1 = "";
        this.D1 = new java.util.LinkedHashMap();
        this.E1 = new java.util.LinkedHashMap();
    }

    public final boolean N6() {
        return ((mm2.e1) business(mm2.e1.class)).a7() ? ((mm2.o2) business(mm2.o2.class)).f329305n : this.f329032f;
    }

    public final java.util.List O6() {
        java.util.List a17 = this.f329039o.a();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : a17) {
            if (obj instanceof cm2.k0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final boolean P6() {
        boolean z17;
        qm0.a aVar = this.f329039o;
        mm2.z5 z5Var = mm2.z5.f329606d;
        aVar.getClass();
        java.util.List list = aVar.f364680a;
        kotlin.jvm.internal.o.f(list, "list");
        synchronized (list) {
            if (!list.isEmpty()) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((java.lang.Boolean) z5Var.invoke(it.next())).booleanValue()) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
        }
        return z17;
    }

    public final r45.nt2 Q6() {
        return this.E;
    }

    public final void R6(android.content.Context context, ab0.v scene) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(scene, "scene");
        r45.cx5 cx5Var = ((l41.e0) scene).f315803g;
        if (cx5Var != null) {
            java.lang.String str = cx5Var.f371900d;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (!((str == null ? "" : str).length() > 0)) {
                dp.a.makeText(context, com.tencent.mm.R.string.e_7, 0).show();
                return;
            }
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().m(str);
            android.content.Intent intent = new android.content.Intent();
            qk.p.b(intent, cx5Var, 161);
            j45.l.j(context, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        }
    }

    public final void S6(qm0.a aVar) {
        jz5.f0 f0Var;
        so2.j5 j5Var;
        gk2.e eVar = this.f328963d;
        if (aVar == null || (j5Var = (so2.j5) aVar.d(mm2.c6.f328940d)) == null) {
            f0Var = null;
        } else {
            if (j5Var instanceof cm2.m0) {
                cm2.m0 m0Var = (cm2.m0) j5Var;
                ((mm2.h5) eVar.a(mm2.h5.class)).N6(new mm2.i7(m0Var.f43368v, null, 2, null));
                com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", "save recording product, id:" + m0Var.f43369w);
            } else if (j5Var instanceof cm2.i0) {
                mm2.h5 h5Var = (mm2.h5) eVar.a(mm2.h5.class);
                r45.hw0 hw0Var = ((cm2.i0) j5Var).f43354v;
                h5Var.N6(new mm2.i7(null, hw0Var, 1, null));
                com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", "save recording product, id:" + hw0Var.getLong(0));
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            ((mm2.h5) eVar.a(mm2.h5.class)).N6(null);
        }
    }

    public final void T6(boolean z17) {
        this.f329052x1 = z17;
        com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", "autoOpenShoppingList set to " + z17);
    }

    public final void U6(boolean z17) {
        if (z17 != this.f329032f) {
            com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", "bindShop:from " + this.f329032f + " to " + z17 + '!');
            if (z17) {
                e7(((mm2.c1) business(mm2.c1.class)).v7());
            }
        }
        if (((mm2.e1) business(mm2.e1.class)).a7()) {
            ((mm2.o2) business(mm2.o2.class)).O6(z17);
        } else {
            this.f329032f = z17;
        }
    }

    public final void V6(r45.cp1 cp1Var) {
        if (!kotlin.jvm.internal.o.b(cp1Var, this.S)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ecReponse ");
            sb6.append(pm0.b0.g(cp1Var == null ? "" : cp1Var));
            com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", sb6.toString());
        }
        this.S = cp1Var;
    }

    public final void W6(r45.eu0 eu0Var) {
        this.V = eu0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get flash sale config: entrance = ");
        r45.eu0 eu0Var2 = this.V;
        sb6.append(eu0Var2 != null ? java.lang.Integer.valueOf(eu0Var2.getInteger(2)) : null);
        sb6.append(", appId = ");
        r45.eu0 eu0Var3 = this.V;
        sb6.append(eu0Var3 != null ? eu0Var3.getString(0) : null);
        sb6.append(", path = ");
        r45.eu0 eu0Var4 = this.V;
        sb6.append(eu0Var4 != null ? eu0Var4.getString(1) : null);
        com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", sb6.toString());
    }

    public final void X6(dk2.vf vfVar) {
        this.X = vfVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get flash sale info: expireTime = ");
        dk2.vf vfVar2 = this.X;
        sb6.append(vfVar2 != null ? java.lang.Integer.valueOf(vfVar2.f234251b) : null);
        sb6.append(", cancle = ");
        dk2.vf vfVar3 = this.X;
        sb6.append(vfVar3 != null ? java.lang.Integer.valueOf(vfVar3.f234252c) : null);
        com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", sb6.toString());
    }

    public final void Y6(boolean z17) {
        this.f329055y1 = z17;
        com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", "ignoreNextUnpaidOrderHint set to " + z17);
    }

    public final void Z6(boolean z17) {
        this.f329040p = z17;
    }

    public final void a7(r45.dv1 dv1Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FinderLiveGetShopShelfResponse:");
        sb6.append(pm0.b0.g(dv1Var == null ? "" : dv1Var));
        com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", sb6.toString());
        this.f329038n = dv1Var;
    }

    public final void b7(r45.x42 x42Var) {
        this.F1 = x42Var;
    }

    public final void c7(so2.j5 j5Var) {
        r45.y23 y23Var;
        boolean z17 = this.f329037m;
        kotlinx.coroutines.flow.j2 j2Var = this.f329048v;
        r4 = null;
        java.lang.String str = null;
        if (!z17 && !this.f329035i && ((j5Var instanceof cm2.m0) || (j5Var instanceof cm2.k0))) {
            this.f329050x = 0L;
            this.f329049w = null;
            ((kotlinx.coroutines.flow.h3) j2Var).k(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", "shoppingAvailable false, reset promotingProduct");
            return;
        }
        if (j5Var instanceof cm2.m0) {
            if (zl2.q4.f473933a.E()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("promotingProduct ShelfProductInfo");
                cm2.m0 m0Var = (cm2.m0) j5Var;
                sb6.append(m0Var.f43370x);
                sb6.append('-');
                sb6.append(m0Var.f43369w);
                sb6.append(",showBox:");
                mm2.x5 x5Var = G1;
                java.util.LinkedList list = m0Var.f43368v.getList(28);
                kotlin.jvm.internal.o.f(list, "getShow_box_items(...)");
                sb6.append(x5Var.a(list));
                com.tencent.mm.sdk.platformtools.Log.c("MMFinder.LiveShopSlice", sb6.toString(), new java.lang.Object[0]);
            } else {
                com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", "promotingProduct ShelfProductInfo:" + ((cm2.m0) j5Var).f43369w);
            }
            cm2.m0 m0Var2 = (cm2.m0) j5Var;
            this.f329050x = m0Var2.f43385d;
            mm2.c1 c1Var = (mm2.c1) business(mm2.c1.class);
            if (m0Var2 != null && (y23Var = m0Var2.f43368v) != null) {
                str = y23Var.getString(17);
            }
            if (str == null) {
                str = "";
            }
            c1Var.y9(str);
            this.f329049w = j5Var;
        } else if (j5Var instanceof cm2.h0) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("promotingProduct ShopWindowAdItem:");
            cm2.h0 h0Var = (cm2.h0) j5Var;
            sb7.append(h0Var.getItemId());
            com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", sb7.toString());
            this.f329050x = h0Var.f43385d;
            this.f329049w = j5Var;
        } else if (j5Var instanceof cm2.k0) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("promotingProduct ShopCouponItem:");
            cm2.k0 k0Var = (cm2.k0) j5Var;
            sb8.append(k0Var.getItemId());
            com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", sb8.toString());
            this.f329050x = k0Var.f43385d;
            this.f329049w = j5Var;
        } else if (j5Var instanceof cm2.z) {
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("promotingProduct PromoteLiveWeComItem:");
            cm2.z zVar = (cm2.z) j5Var;
            sb9.append(zVar.getItemId());
            com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", sb9.toString());
            this.f329050x = zVar.f43385d;
            this.f329049w = j5Var;
        } else if (j5Var instanceof cm2.x) {
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("promotingProduct PromoteLiveMpArticleItem:");
            cm2.x xVar = (cm2.x) j5Var;
            sb10.append(xVar.getItemId());
            com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", sb10.toString());
            this.f329050x = xVar.f43385d;
            this.f329049w = j5Var;
        } else if (j5Var instanceof cm2.y) {
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder("promotingProduct PromoteLiveNoticeItem:");
            cm2.y yVar = (cm2.y) j5Var;
            sb11.append(yVar.getItemId());
            com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", sb11.toString());
            this.f329050x = yVar.f43385d;
            this.f329049w = j5Var;
        } else if (j5Var instanceof cm2.f0) {
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder("promotingProduct PromoteRedPacketItem:");
            cm2.f0 f0Var = (cm2.f0) j5Var;
            sb12.append(f0Var.getItemId());
            com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", sb12.toString());
            this.f329050x = f0Var.f43385d;
            this.f329049w = j5Var;
        } else if (j5Var instanceof cm2.v) {
            java.lang.StringBuilder sb13 = new java.lang.StringBuilder("promotingProduct PromoteH5HalfItem:");
            cm2.v vVar = (cm2.v) j5Var;
            sb13.append(vVar.getItemId());
            com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", sb13.toString());
            this.f329050x = vVar.f43385d;
            this.f329049w = j5Var;
        } else if (j5Var instanceof cm2.u) {
            java.lang.StringBuilder sb14 = new java.lang.StringBuilder("promotingProduct PromoteGameItem:");
            cm2.u uVar = (cm2.u) j5Var;
            sb14.append(uVar.getItemId());
            com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", sb14.toString());
            this.f329050x = uVar.f43385d;
            this.f329049w = j5Var;
        } else {
            java.lang.StringBuilder sb15 = new java.lang.StringBuilder("promotingProduct: invalid or null: ");
            sb15.append(j5Var == null);
            sb15.append(", type: ");
            boolean z18 = j5Var instanceof cm2.t;
            cm2.t tVar = z18 ? (cm2.t) j5Var : null;
            sb15.append(tVar != null ? java.lang.Integer.valueOf(tVar.f43392n) : null);
            com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", sb15.toString());
            cm2.t tVar2 = z18 ? (cm2.t) j5Var : null;
            this.f329050x = tVar2 != null ? tVar2.f43385d : 0L;
            this.f329049w = j5Var;
        }
        ((kotlinx.coroutines.flow.h3) j2Var).k(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", "promotingInfoId has update to:" + this.f329050x);
    }

    public final void d7(boolean z17) {
        if (z17 != this.f329035i) {
            com.tencent.mars.xlog.Log.i("MMFinder.LiveShopSlice", "shoppingAvailable:from " + this.f329035i + " to " + z17 + '!');
            if (z17) {
                e7(((mm2.c1) business(mm2.c1.class)).v7());
            }
        }
        ((kotlinx.coroutines.flow.h3) this.f329034h).k(java.lang.Boolean.valueOf(z17));
        this.f329035i = z17;
    }

    public final void e7(int i17) {
        if (this.S != null || this.T) {
            return;
        }
        this.T = true;
        kotlinx.coroutines.l.d(this.f328963d.f272475i, null, null, new mm2.e6(this, i17, null), 3, null);
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        this.f329047u = 0;
        this.f329039o.f364680a.clear();
        U6(false);
        this.f329033g = false;
        a7(null);
        c7(null);
        this.f329053y.clear();
        this.f329056z = false;
        this.A = "";
        this.G = 0L;
        this.L = 0L;
        V6(null);
        this.K = null;
        this.U = "";
        this.f329037m = false;
        this.M = null;
        this.N = null;
        this.F1 = null;
        this.f329040p = true;
        X6(null);
        this.f329042p1.postValue(null);
        T6(false);
        this.B1.postValue(null);
        this.C1 = "";
        ((java.util.LinkedHashMap) this.D1).clear();
        ((java.util.LinkedHashMap) this.E1).clear();
        this.P = null;
        this.C = null;
    }
}

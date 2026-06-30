package df2;

/* loaded from: classes3.dex */
public final class d8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f229947d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f229948e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f229949f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f229950g;

    /* renamed from: h, reason: collision with root package name */
    public int f229951h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.d42 f229952i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.ch1 f229953m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f229954n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(r45.d42 d42Var, r45.ch1 ch1Var, df2.s8 s8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f229952i = d42Var;
        this.f229953m = ch1Var;
        this.f229954n = s8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.d8(this.f229952i, this.f229953m, this.f229954n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.d8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String string;
        com.tencent.mm.view.MMPAGView mMPAGView;
        java.lang.Object c17;
        ug2.a aVar;
        java.lang.String str;
        java.lang.Object d17;
        ug2.a aVar2;
        com.tencent.mm.view.MMPAGView mMPAGView2;
        r45.q53 q53Var;
        java.lang.Object Lc;
        df2.s8 s8Var;
        ug2.a aVar3;
        r45.q53 q53Var2;
        pz5.a aVar4 = pz5.a.f359186d;
        int i17 = this.f229951h;
        r45.d42 d42Var = this.f229952i;
        df2.s8 s8Var2 = this.f229954n;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            am2.p.f8725c.a(d42Var);
            ug2.a aVar5 = new ug2.a(this.f229953m);
            java.lang.String str2 = (!s8Var2.U6() ? (string = d42Var.getString(0)) == null : (string = d42Var.getString(4)) == null) ? string : "";
            com.tencent.mars.xlog.Log.i(s8Var2.f231299m, "[onStatusFundingSuc] start download url:" + str2 + ", isLandscape:" + s8Var2.U6());
            boolean a17 = ae2.in.f3688a.a(ym5.f6.D1);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.view.MMPAGView mMPAGView3 = new com.tencent.mm.view.MMPAGView(context);
            ym5.l2 l2Var = ym5.l2.f463424a;
            ym5.j2[] j2VarArr = ym5.j2.f463392d;
            mMPAGView3.o(a17);
            if (a17) {
                rj.j c18 = nn2.d.f338671a.c();
                this.f229947d = aVar5;
                this.f229948e = str2;
                this.f229949f = mMPAGView3;
                this.f229951h = 1;
                mMPAGView = mMPAGView3;
                d17 = rj.j.d(c18, str2, null, this, 2, null);
                if (d17 == aVar4) {
                    return aVar4;
                }
                aVar = aVar5;
                str = str2;
                mMPAGView.setComposition((com.tencent.mm.rfx.RfxPagFile) d17);
            } else {
                mMPAGView = mMPAGView3;
                rj.j c19 = nn2.d.f338671a.c();
                this.f229947d = aVar5;
                this.f229948e = str2;
                this.f229949f = mMPAGView;
                this.f229951h = 2;
                c17 = rj.j.c(c19, str2, null, this, 2, null);
                if (c17 == aVar4) {
                    return aVar4;
                }
                aVar = aVar5;
                str = str2;
                mMPAGView.setComposition((org.libpag.PAGFile) c17);
            }
        } else if (i17 == 1) {
            com.tencent.mm.view.MMPAGView mMPAGView4 = (com.tencent.mm.view.MMPAGView) this.f229949f;
            str = (java.lang.String) this.f229948e;
            aVar = (ug2.a) this.f229947d;
            kotlin.ResultKt.throwOnFailure(obj);
            mMPAGView = mMPAGView4;
            d17 = obj;
            mMPAGView.setComposition((com.tencent.mm.rfx.RfxPagFile) d17);
        } else {
            if (i17 != 2) {
                if (i17 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r45.q53 q53Var3 = (r45.q53) this.f229950g;
                df2.s8 s8Var3 = (df2.s8) this.f229949f;
                com.tencent.mm.view.MMPAGView mMPAGView5 = (com.tencent.mm.view.MMPAGView) this.f229948e;
                aVar3 = (ug2.a) this.f229947d;
                kotlin.ResultKt.throwOnFailure(obj);
                mMPAGView2 = mMPAGView5;
                s8Var = s8Var3;
                q53Var2 = q53Var3;
                Lc = obj;
                jz5.o oVar = (jz5.o) Lc;
                boolean booleanValue = ((java.lang.Boolean) oVar.f302841d).booleanValue();
                java.lang.String str3 = (java.lang.String) oVar.f302842e;
                com.tencent.mars.xlog.Log.i(s8Var.f231299m, "music url:" + q53Var2.getString(0) + ", succ:" + booleanValue + ", path:" + str3);
                aVar2 = aVar3;
                ((com.tencent.mm.plugin.finder.live.util.j1) ((mm2.c1) s8Var2.business(mm2.c1.class)).f328806g).b(aVar2);
                s8Var2.f231298l1 = mMPAGView2.c();
                return jz5.f0.f302826a;
            }
            com.tencent.mm.view.MMPAGView mMPAGView6 = (com.tencent.mm.view.MMPAGView) this.f229949f;
            str = (java.lang.String) this.f229948e;
            aVar = (ug2.a) this.f229947d;
            kotlin.ResultKt.throwOnFailure(obj);
            mMPAGView = mMPAGView6;
            c17 = obj;
            mMPAGView.setComposition((org.libpag.PAGFile) c17);
        }
        aVar2 = aVar;
        mMPAGView2 = mMPAGView;
        aVar2.f427512b = new java.lang.Long(mMPAGView2.c());
        com.tencent.mars.xlog.Log.i(s8Var2.f231299m, "[onStatusFundingSuc] get duration suc, url = " + str + ", duration = " + aVar2.f427512b);
        r45.a8 a8Var = s8Var2.U6() ? (r45.a8) d42Var.getCustom(7) : (r45.a8) d42Var.getCustom(6);
        if (a8Var == null || (q53Var = (r45.q53) a8Var.getCustom(0)) == null) {
            aVar2 = aVar2;
        } else {
            java.lang.String string2 = q53Var.getString(0);
            if (!(string2 == null || string2.length() == 0)) {
                i95.m c27 = i95.n0.c(zy.u.class);
                kotlin.jvm.internal.o.f(c27, "getService(...)");
                zy.w p37 = zy.u.p3((zy.u) c27, null, 1, null);
                java.lang.String string3 = q53Var.getString(0);
                if (string3 == null) {
                    string3 = "";
                }
                this.f229947d = aVar2;
                this.f229948e = mMPAGView2;
                this.f229949f = s8Var2;
                this.f229950g = q53Var;
                this.f229951h = 3;
                Lc = zy.w.Lc(p37, string3, false, null, 0, 0, null, null, this, 126, null);
                if (Lc == aVar4) {
                    return aVar4;
                }
                s8Var = s8Var2;
                aVar3 = aVar2;
                q53Var2 = q53Var;
                jz5.o oVar2 = (jz5.o) Lc;
                boolean booleanValue2 = ((java.lang.Boolean) oVar2.f302841d).booleanValue();
                java.lang.String str32 = (java.lang.String) oVar2.f302842e;
                com.tencent.mars.xlog.Log.i(s8Var.f231299m, "music url:" + q53Var2.getString(0) + ", succ:" + booleanValue2 + ", path:" + str32);
                aVar2 = aVar3;
            }
        }
        ((com.tencent.mm.plugin.finder.live.util.j1) ((mm2.c1) s8Var2.business(mm2.c1.class)).f328806g).b(aVar2);
        s8Var2.f231298l1 = mMPAGView2.c();
        return jz5.f0.f302826a;
    }
}

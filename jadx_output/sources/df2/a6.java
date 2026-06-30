package df2;

/* loaded from: classes3.dex */
public final class a6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f229675d;

    /* renamed from: e, reason: collision with root package name */
    public int f229676e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f229677f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.d6 f229678g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f229679h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.MMSwitchBtn f229680i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f229681m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerView f229682n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(android.content.Context context, df2.d6 d6Var, boolean z17, com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn, java.util.ArrayList arrayList, com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f229677f = context;
        this.f229678g = d6Var;
        this.f229679h = z17;
        this.f229680i = mMSwitchBtn;
        this.f229681m = arrayList;
        this.f229682n = wxRecyclerView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.a6(this.f229677f, this.f229678g, this.f229679h, this.f229680i, this.f229681m, this.f229682n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.a6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17;
        boolean z17;
        java.lang.Object j17;
        com.tencent.mm.plugin.finder.assist.d9 d9Var;
        int i18;
        int i19;
        pz5.a aVar = pz5.a.f359186d;
        int i27 = this.f229676e;
        boolean z18 = this.f229679h;
        df2.d6 d6Var = this.f229678g;
        if (i27 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.assist.a9 a9Var = com.tencent.mm.plugin.finder.assist.d9.f102093f;
            android.content.Context context = this.f229677f;
            com.tencent.mm.plugin.finder.assist.d9 a17 = com.tencent.mm.plugin.finder.assist.a9.a(a9Var, context, context.getResources().getString(com.tencent.mm.R.string.f9y), 0L, null, 8, null);
            a17.a();
            this.f229675d = a17;
            this.f229676e = 1;
            d6Var.getClass();
            com.tencent.mars.xlog.Log.i("Finder.GestureEffectAnchorSettingController", "toggleGestureEffectSwitch " + z18);
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_ANCHOR_HAS_SWITCH_GESTURE_EFFECT_BOOLEAN_SYNC;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            c17.x(u3Var, bool);
            if (z18) {
                int i28 = (int) ((mm2.c1) d6Var.business(mm2.c1.class)).f328866q;
                java.util.regex.Pattern pattern = pm0.v.f356802a;
                i17 = i28 | 131072;
            } else {
                int i29 = (int) ((mm2.c1) d6Var.business(mm2.c1.class)).f328866q;
                java.util.regex.Pattern pattern2 = pm0.v.f356802a;
                i17 = i29 & (-131073);
            }
            if (((mm2.c1) d6Var.business(mm2.c1.class)).a8()) {
                kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
                rVar.k();
                kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
                dk2.xf P6 = d6Var.P6();
                if (P6 != null) {
                    df2.c6 c6Var = new df2.c6(d6Var, z18, c0Var, rVar);
                    z17 = z18;
                    dk2.xf.h(P6, ((mm2.e1) d6Var.business(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) d6Var.business(mm2.e1.class)).f328983m, i17, 131072L, 0, c6Var, 16, null);
                } else {
                    z17 = z18;
                }
                j17 = rVar.j();
            } else {
                com.tencent.mars.xlog.Log.i("Finder.GestureEffectAnchorSettingController", "toggleGestureEffectSwitch live is not started");
                ((mm2.c1) d6Var.business(mm2.c1.class)).p8(i17);
                z17 = z18;
                j17 = bool;
            }
            if (j17 == aVar) {
                return aVar;
            }
            d9Var = a17;
        } else {
            if (i27 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d9Var = (com.tencent.mm.plugin.finder.assist.d9) this.f229675d;
            kotlin.ResultKt.throwOnFailure(obj);
            j17 = obj;
            z17 = z18;
        }
        boolean booleanValue = ((java.lang.Boolean) j17).booleanValue();
        d9Var.b();
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f229680i;
        mMSwitchBtn.setEnabled(true);
        if (booleanValue) {
            df2.n5 n5Var = (df2.n5) d6Var.controller(df2.n5.class);
            if (n5Var != null) {
                n5Var.Z6(z17);
            }
            java.util.ArrayList arrayList = this.f229681m;
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((df2.s5) it.next()).f231291e = z17;
            }
            androidx.recyclerview.widget.f2 adapter = this.f229682n.getAdapter();
            if (adapter != null) {
                i18 = 0;
                adapter.notifyItemRangeChanged(0, arrayList.size());
            } else {
                i18 = 0;
            }
            if (z17) {
                df2.w5 w5Var = d6Var.f229945m;
                if (w5Var != null) {
                    w5Var.b();
                }
            } else {
                df2.w5 w5Var2 = d6Var.f229945m;
                if (w5Var2 != null) {
                    w5Var2.c();
                }
            }
        } else {
            i18 = 0;
            mMSwitchBtn.setCheck(!z17);
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        df2.n5 n5Var2 = (df2.n5) d6Var.controller(df2.n5.class);
        if (n5Var2 != null) {
            i19 = 1;
            if (n5Var2.f230834n) {
                i18 = 1;
            }
        } else {
            i19 = 1;
        }
        linkedHashMap.put("switch_type", new java.lang.Integer(i18));
        linkedHashMap.put("switch_stage", new java.lang.Integer(((mm2.c1) d6Var.business(mm2.c1.class)).a8() ? 2 : i19));
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Nj("live_anchor_gesture_features_switch", "view_clk", linkedHashMap);
        return jz5.f0.f302826a;
    }
}

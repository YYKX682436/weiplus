package st2;

/* loaded from: classes3.dex */
public final class e1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.dv1 f412273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412274e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(r45.dv1 dv1Var, st2.h1 h1Var) {
        super(0);
        this.f412273d = dv1Var;
        this.f412274e = h1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long j17;
        kotlinx.coroutines.r2 r2Var;
        r45.wv2 wv2Var = (r45.wv2) this.f412273d.getCustom(23);
        boolean z17 = false;
        st2.h1 h1Var = this.f412274e;
        if (wv2Var != null) {
            ut2.j5 k17 = h1Var.k();
            java.lang.String str = "finder_live_order_unpaid_tips_prefix_" + wv2Var.getString(3);
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("finder_live_order_unpaid_tips_mmkv");
            long j18 = M.getLong(str, -1L);
            long c17 = c01.id.c();
            java.lang.String str2 = k17.f430940h;
            com.tencent.mars.xlog.Log.i(str2, "try show bubble, last shown time = " + j18);
            if (j18 < 0) {
                gk2.e eVar = k17.f430938f;
                if (((mm2.f6) eVar.a(mm2.f6.class)).f329055y1) {
                    ((mm2.f6) eVar.a(mm2.f6.class)).Y6(false);
                    com.tencent.mars.xlog.Log.i(str2, "try show bubble, but ignored");
                } else {
                    kotlinx.coroutines.r2 r2Var2 = k17.E;
                    if (r2Var2 != null) {
                        kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
                    }
                    xt2.n nVar = k17.C;
                    if (nVar != null) {
                        nVar.dismiss();
                    }
                    kotlinx.coroutines.y0 y0Var = k17.f430939g;
                    if (y0Var != null) {
                        j17 = c17;
                        r2Var = kotlinx.coroutines.l.d(y0Var, null, null, new ut2.h5(M, str, c17, k17, wv2Var, null), 3, null);
                    } else {
                        j17 = c17;
                        r2Var = null;
                    }
                    k17.E = r2Var;
                }
            } else {
                j17 = c17;
            }
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310570c, null, new ut2.i5(M, j17, null), 2, null);
        }
        ut2.j5 k18 = h1Var.k();
        com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FLASH_SALE_TIPS_SHOWN_BOOLEAN_SYNC;
        boolean o17 = c18.o(u3Var, false);
        boolean z18 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3865r6).getValue()).r()).intValue() == 1;
        r45.k31 k31Var = ((mm2.f6) k18.f430938f.a(mm2.f6.class)).W;
        if (k31Var != null && k31Var.getInteger(0) == 1) {
            z17 = true;
        }
        if ((z17 && !o17) || z18) {
            xt2.n nVar2 = k18.D;
            if (nVar2 != null) {
                nVar2.dismiss();
            }
            android.view.ViewGroup viewGroup = k18.f430937e;
            android.content.Context context = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            xt2.n nVar3 = new xt2.n(context);
            android.widget.TextView textView = new android.widget.TextView(viewGroup.getContext());
            textView.setTextColor(viewGroup.getContext().getColor(com.tencent.mm.R.color.f478553an));
            textView.setText(viewGroup.getContext().getString(com.tencent.mm.R.string.lr9));
            textView.setTextSize(1, 14.0f);
            android.view.ViewGroup viewGroup2 = nVar3.f456897e;
            viewGroup2.removeAllViews();
            viewGroup2.addView(textView);
            k18.D = nVar3;
            android.view.View view = k18.f430936d.F;
            if (view != null) {
                nVar3.a(view);
                gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
            }
        }
        return jz5.f0.f302826a;
    }
}

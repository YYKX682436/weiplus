package com.tencent.mm.plugin.ting.uic;

/* loaded from: classes11.dex */
public final class j0 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f174762d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f174763e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.api.TingMemberShipSubscribeRequest f174764f;

    /* renamed from: g, reason: collision with root package name */
    public qk.ea f174765g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f174766h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.pigeon.ting.TingWecoinSubscribeResult f174767i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f174768m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f174769n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f174762d = jz5.h.b(com.tencent.mm.plugin.ting.uic.i0.f174761d);
    }

    public static final void O6(com.tencent.mm.plugin.ting.uic.j0 j0Var, com.tencent.mm.api.TingMemberShipSubscribeRequest tingMemberShipSubscribeRequest, qk.ea eaVar, yz5.l lVar) {
        j0Var.f174764f = tingMemberShipSubscribeRequest;
        j0Var.f174765g = eaVar;
        int ordinal = eaVar.f364094a.ordinal();
        com.tencent.pigeon.ting.TingWecoinSubscribeStatus tingWecoinSubscribeStatus = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? com.tencent.pigeon.ting.TingWecoinSubscribeStatus.NONE : com.tencent.pigeon.ting.TingWecoinSubscribeStatus.CANCEL : com.tencent.pigeon.ting.TingWecoinSubscribeStatus.FAIL : com.tencent.pigeon.ting.TingWecoinSubscribeStatus.SUCCEED;
        long ordinal2 = tingWecoinSubscribeStatus.ordinal();
        bw5.u80 u80Var = eaVar.f364097d;
        byte[] byteArray = u80Var != null ? u80Var.toByteArray() : null;
        bw5.r70 r70Var = eaVar.f364096c;
        com.tencent.pigeon.ting.TingWecoinSubscribeResult tingWecoinSubscribeResult = new com.tencent.pigeon.ting.TingWecoinSubscribeResult(ordinal2, byteArray, r70Var != null ? r70Var.toByteArray() : null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMembershipSubscribeResult isSubscribe: ");
        bw5.u80 u80Var2 = eaVar.f364097d;
        sb6.append(u80Var2 != null ? java.lang.Boolean.valueOf(u80Var2.f33800g) : null);
        sb6.append(", status: ");
        sb6.append(tingWecoinSubscribeStatus);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMembershipUIC", sb6.toString());
        boolean z17 = eaVar.f364098e;
        qk.ga gaVar = eaVar.f364094a;
        if (z17) {
            if (gaVar == qk.ga.f364135e) {
                j0Var.f174768m = true;
                j0Var.f174767i = tingWecoinSubscribeResult;
                j0Var.f174766h = lVar;
                return;
            } else {
                if (lVar != null) {
                    lVar.invoke(tingWecoinSubscribeResult);
                }
                j0Var.Q6();
                return;
            }
        }
        if (gaVar == qk.ga.f364135e) {
            if (tingMemberShipSubscribeRequest != null && tingMemberShipSubscribeRequest.f53213f) {
                gl4.z zVar = (gl4.z) ((jz5.n) j0Var.f174762d).getValue();
                android.app.Activity context = j0Var.getContext();
                bw5.r70 r70Var2 = eaVar.f364096c;
                zVar.getClass();
                kotlin.jvm.internal.o.g(context, "context");
                if (r70Var2 != null) {
                    android.widget.ImageView imageView = new android.widget.ImageView(context);
                    imageView.setImageResource(com.tencent.mm.R.raw.checkbox_selected);
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479723df);
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(dimensionPixelSize, dimensionPixelSize);
                    marginLayoutParams.topMargin = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479706d1);
                    marginLayoutParams.bottomMargin = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
                    imageView.setLayoutParams(marginLayoutParams);
                    gl4.z.c(zVar, context, r70Var2, null, imageView, null, 0, gl4.l.f272867d, gl4.m.f272868d, gl4.n.f272869d, null, 560, null);
                }
            }
        }
        j0Var.P6(tingMemberShipSubscribeRequest, eaVar);
        if (lVar != null) {
            lVar.invoke(tingWecoinSubscribeResult);
        }
        j0Var.Q6();
    }

    public final void P6(com.tencent.mm.api.TingMemberShipSubscribeRequest request, qk.ea eaVar) {
        qk.da daVar;
        if (request != null && request.f53215h == 2100) {
            eaVar.getClass();
            if (!(eaVar.f364094a == qk.ga.f364135e) || (daVar = eaVar.f364095b) == null) {
                return;
            }
            kotlin.jvm.internal.o.g(request, "request");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("buy_vip_session", request.f53214g);
            hashMap.put("open_type", java.lang.Integer.valueOf(daVar.f364086d));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("tyt_open_vip_succ", null, hashMap, 5, false);
        }
    }

    public final void Q6() {
        this.f174764f = null;
        this.f174765g = null;
        this.f174768m = false;
        this.f174763e = false;
        this.f174766h = null;
        this.f174767i = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMembershipUIC", "handleOnDestroy");
        Q6();
        this.f174769n = true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMembershipUIC", "handleOnResume needCheckMembershipStatus: " + this.f174768m + ", hasCheckMembershipStatus: " + this.f174763e);
        if (this.f174768m && !this.f174763e) {
            this.f174763e = true;
            gl4.z zVar = (gl4.z) ((jz5.n) this.f174762d).getValue();
            android.app.Activity context = getContext();
            com.tencent.mm.plugin.ting.uic.f0 f0Var = new com.tencent.mm.plugin.ting.uic.f0(this);
            zVar.getClass();
            kotlin.jvm.internal.o.g(context, "context");
            jm4.c2 c2Var = (jm4.c2) ((jz5.n) zVar.f272899a).getValue();
            if (c2Var != null) {
                gl4.c cVar = new gl4.c(true, false, zVar, context, f0Var);
                jm4.x1 x1Var = new jm4.x1();
                x1Var.f300446i = cVar;
                urgen.ur_0025.UR_B0D8.UR_2A8C(((jm4.d2) c2Var).getCppPointer(), true, x1Var);
            }
        }
    }
}

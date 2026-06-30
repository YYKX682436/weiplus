package com.tencent.mm.ui.widget.picker;

/* loaded from: classes11.dex */
public class h0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public y9.i f212273d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f212274e;

    /* renamed from: f, reason: collision with root package name */
    public int f212275f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.android.material.bottomsheet.BottomSheetBehavior f212276g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f212277h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f212278i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.picker.CustomTimePickerNew f212279m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.picker.g0 f212280n;

    public h0(android.content.Context context) {
        this.f212273d = new y9.i(context, 0);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.d0m, null);
        this.f212274e = inflate;
        this.f212277h = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.o7s);
        this.f212278i = (android.widget.LinearLayout) this.f212274e.findViewById(com.tencent.mm.R.id.o7t);
        this.f212279m = new com.tencent.mm.ui.widget.picker.CustomTimePickerNew(context);
        this.f212277h.removeAllViews();
        this.f212277h.setGravity(17);
        this.f212277h.addView(this.f212279m.getView(), new android.widget.LinearLayout.LayoutParams(-1, -1));
        ((android.widget.Button) this.f212274e.findViewById(com.tencent.mm.R.id.khs)).setOnClickListener(new com.tencent.mm.ui.widget.picker.d0(this));
        ((android.widget.Button) this.f212274e.findViewById(com.tencent.mm.R.id.b5i)).setOnClickListener(new com.tencent.mm.ui.widget.picker.e0(this));
        this.f212273d.setContentView(this.f212274e);
        this.f212275f = com.tencent.mm.ui.zk.a(context, com.tencent.wxmm.v2helper.EMethodSetPlayerPreCorrectCofOn);
        com.google.android.material.bottomsheet.BottomSheetBehavior A = com.google.android.material.bottomsheet.BottomSheetBehavior.A((android.view.View) this.f212274e.getParent());
        this.f212276g = A;
        if (A != null) {
            A.C(this.f212275f);
            this.f212276g.f44443p = false;
        }
        this.f212273d.setOnDismissListener(new com.tencent.mm.ui.widget.picker.f0(this));
    }

    public static void a(com.tencent.mm.ui.widget.picker.h0 h0Var, boolean z17, java.lang.Object obj) {
        com.tencent.mm.ui.widget.picker.g0 g0Var = h0Var.f212280n;
        if (g0Var != null) {
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.cd cdVar = (com.tencent.mm.plugin.webview.ui.tools.newjsapi.cd) g0Var;
            y9.i iVar = cdVar.f186017a.f212273d;
            if (iVar != null) {
                iVar.dismiss();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowDatePickerView", "time set hasSetResult=" + z17 + ", result=" + obj);
            nw4.k kVar = cdVar.f186018b;
            nw4.y2 y2Var = cdVar.f186019c;
            if (!z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShowDatePickerView", "time set cancel");
                kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":cancel", null);
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            kotlin.jvm.internal.o.d(obj);
            hashMap.put("selectTime", obj);
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }
}

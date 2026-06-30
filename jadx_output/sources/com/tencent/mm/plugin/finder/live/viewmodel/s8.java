package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class s8 extends com.tencent.mm.ui.component.UIComponent implements zy2.q8 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f117399d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ProgressBar f117400e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMSwitchBtn f117401f;

    /* renamed from: g, reason: collision with root package name */
    public long f117402g;

    /* renamed from: h, reason: collision with root package name */
    public long f117403h;

    /* renamed from: i, reason: collision with root package name */
    public int f117404i;

    /* renamed from: m, reason: collision with root package name */
    public int f117405m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f117406n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f117407o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.viewmodel.r4 f117408p;

    /* renamed from: q, reason: collision with root package name */
    public final yz5.l f117409q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f117405m = 1;
        this.f117409q = new com.tencent.mm.plugin.finder.live.viewmodel.r8(this, activity);
    }

    public final void O6() {
        if (this.f117405m != 1) {
            android.view.View view = this.f117399d;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorHonorRankSwitchUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorHonorRankSwitchUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView = this.f117407o;
            if (textView == null) {
                return;
            }
            textView.setVisibility(8);
            return;
        }
        android.view.View view2 = this.f117399d;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorHonorRankSwitchUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorHonorRankSwitchUIC", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView2 = this.f117407o;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        android.widget.TextView textView3 = this.f117407o;
        if (textView3 != null) {
            java.lang.String string = getContext().getString(com.tencent.mm.R.string.eis);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = getContext().getString(com.tencent.mm.R.string.nvz, string);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            android.text.SpannableString spannableString = new android.text.SpannableString(string2);
            int L = r26.n0.L(string2, string, 0, false, 6, null);
            if (L >= 0 && string.length() + L <= string2.length()) {
                spannableString.setSpan(new com.tencent.mm.plugin.finder.live.viewmodel.m8(this), L, string.length() + L, 33);
            }
            textView3.setText(spannableString);
            textView3.setHighlightColor(textView3.getContext().getResources().getColor(android.R.color.transparent));
            textView3.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f117401f;
        if (mMSwitchBtn != null) {
            java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_LIVE_VISITOR_HONOR_RANK_SWITCH_ENABLE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
            mMSwitchBtn.setCheck(((java.lang.Boolean) m17).booleanValue());
            mMSwitchBtn.setSwitchListener(new com.tencent.mm.plugin.finder.live.viewmodel.n8(this));
        }
    }

    public final void P6() {
        this.f117402g = getActivity().getIntent().getLongExtra("LIVE_ID", 0L);
        this.f117403h = getActivity().getIntent().getLongExtra("OBJECT_ID", 0L);
        this.f117404i = getIntent().getIntExtra("KEY_SOURCE", 0);
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_IS_FROM_SETTING", true);
        this.f117406n = booleanExtra;
        this.f117405m = (booleanExtra || this.f117404i == 2) ? g92.b.f269769e.k2().getInteger(4) : getIntent().getIntExtra("KEY_VISITOR_ROLE", 1);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f117399d = findViewById(com.tencent.mm.R.id.f485247h11);
        this.f117407o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485246h10);
        this.f117400e = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.imc);
        this.f117401f = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById(com.tencent.mm.R.id.nto);
        P6();
        O6();
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f117401f;
        if (mMSwitchBtn != null) {
            ym5.a1.h(mMSwitchBtn, new com.tencent.mm.plugin.finder.live.viewmodel.o8());
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (this.f117406n) {
            P6();
            O6();
        }
    }
}

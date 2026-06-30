package l94;

/* loaded from: classes4.dex */
public final class k extends l94.e {

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f317371h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup f317372i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.ViewGroup f317373j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.content.Context context) {
        super("WsFoldAdCardComponent", context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // l94.e
    public boolean g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShouldRegisterEventHandler", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShouldRegisterEventHandler", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardComponent");
        return true;
    }

    @Override // l94.e
    public void j(h94.a adInfo) {
        l94.e qVar;
        int e17;
        l94.e gVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardComponent");
        kotlin.jvm.internal.o.g(adInfo, "adInfo");
        r45.d43 b17 = adInfo.b();
        if (b17 == null) {
            com.tencent.mars.xlog.Log.i(h(), "the fold sns info is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardComponent");
            return;
        }
        switch (b17.f372081q) {
            case 1:
                qVar = new l94.q(f());
                break;
            case 2:
                qVar = new l94.e0(f());
                break;
            case 3:
            case 4:
            case 6:
            case 9:
                qVar = new l94.b0(f());
                break;
            case 5:
            case 7:
            case 8:
            default:
                com.tencent.mars.xlog.Log.e(h(), "the style is invalid");
                qVar = null;
                break;
            case 10:
            case 11:
            case 12:
                qVar = new l94.t(f(), b17.f372081q);
                break;
        }
        if (com.tencent.mm.ui.bk.C()) {
            r45.c43 c43Var = b17.f372086v;
            e17 = ca4.n0.e(c43Var != null ? c43Var.f371267e : null, 0);
        } else {
            r45.c43 c43Var2 = b17.f372086v;
            e17 = ca4.n0.e(c43Var2 != null ? c43Var2.f371266d : null, 0);
        }
        android.view.ViewGroup viewGroup = this.f317372i;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(e17);
        }
        if (qVar != null) {
            b(qVar, this.f317372i);
            qVar.c(adInfo);
        }
        switch (b17.f372081q) {
            case 10:
            case 11:
            case 12:
                gVar = new l94.g(f());
                break;
            default:
                gVar = new l94.i(f());
                break;
        }
        b(gVar, this.f317373j);
        android.view.ViewGroup viewGroup2 = this.f317371h;
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(new l94.j(b17, adInfo));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardComponent");
    }

    @Override // l94.e
    public android.view.View k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardComponent");
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(f());
        c44.a.l();
        if (frameLayout.getLayoutParams() == null) {
            c44.a.o();
            frameLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            layoutParams.width = -1;
            frameLayout.setLayoutParams(layoutParams);
        }
        c44.a.o();
        if (frameLayout.getLayoutParams() == null) {
            c44.a.o();
            frameLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
            layoutParams2.height = -2;
            frameLayout.setLayoutParams(layoutParams2);
        }
        frameLayout.setClipToOutline(true);
        frameLayout.setOutlineProvider(new al5.z1(c44.b.a(8)));
        frameLayout.setForeground(frameLayout.getContext().getDrawable(com.tencent.mm.R.drawable.f482237da4));
        this.f317371h = frameLayout;
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(frameLayout.getContext());
        frameLayout.addView(linearLayout);
        c44.a.l();
        if (linearLayout.getLayoutParams() == null) {
            c44.a.o();
            linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams3 = linearLayout.getLayoutParams();
            layoutParams3.width = -1;
            linearLayout.setLayoutParams(layoutParams3);
        }
        c44.a.o();
        if (linearLayout.getLayoutParams() == null) {
            c44.a.o();
            linearLayout.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams4 = linearLayout.getLayoutParams();
            layoutParams4.height = -2;
            linearLayout.setLayoutParams(layoutParams4);
        }
        c44.a.m();
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(i65.a.d(linearLayout.getContext(), com.tencent.mm.R.color.f478492d));
        int a17 = c44.b.a(8);
        linearLayout.setPadding(a17, a17, a17, a17);
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(linearLayout.getContext());
        linearLayout.addView(frameLayout2);
        frameLayout2.setId(com.tencent.mm.R.id.vpm);
        this.f317372i = frameLayout2;
        frameLayout2.setClipToOutline(true);
        frameLayout2.setOutlineProvider(new al5.z1(c44.b.a(4)));
        android.content.Context context = frameLayout2.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        jz5.l c17 = j94.b.c(context, 0, 0, 6, null);
        int intValue = ((java.lang.Number) c17.f302833d).intValue();
        int intValue2 = ((java.lang.Number) c17.f302834e).intValue();
        if (frameLayout2.getLayoutParams() == null) {
            c44.a.o();
            frameLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(intValue, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams5 = frameLayout2.getLayoutParams();
            layoutParams5.width = intValue;
            frameLayout2.setLayoutParams(layoutParams5);
        }
        if (frameLayout2.getLayoutParams() == null) {
            c44.a.o();
            frameLayout2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, intValue2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams6 = frameLayout2.getLayoutParams();
            layoutParams6.height = intValue2;
            frameLayout2.setLayoutParams(layoutParams6);
        }
        android.view.View view = new android.view.View(linearLayout.getContext());
        linearLayout.addView(view);
        c44.a.l();
        if (view.getLayoutParams() == null) {
            c44.a.o();
            view.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams7 = view.getLayoutParams();
            layoutParams7.width = -1;
            view.setLayoutParams(layoutParams7);
        }
        int a18 = c44.b.a(8);
        if (view.getLayoutParams() == null) {
            c44.a.o();
            view.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, a18));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams8 = view.getLayoutParams();
            layoutParams8.height = a18;
            view.setLayoutParams(layoutParams8);
        }
        android.widget.FrameLayout frameLayout3 = new android.widget.FrameLayout(linearLayout.getContext());
        linearLayout.addView(frameLayout3);
        this.f317373j = frameLayout3;
        c44.a.l();
        if (frameLayout3.getLayoutParams() == null) {
            c44.a.o();
            frameLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-1, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams9 = frameLayout3.getLayoutParams();
            layoutParams9.width = -1;
            frameLayout3.setLayoutParams(layoutParams9);
        }
        c44.a.o();
        if (frameLayout3.getLayoutParams() == null) {
            c44.a.o();
            frameLayout3.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams10 = frameLayout3.getLayoutParams();
            layoutParams10.height = -2;
            frameLayout3.setLayoutParams(layoutParams10);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBuildView", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardComponent");
        return frameLayout;
    }

    @Override // l94.e
    public void l(h94.a adInfo, l94.l eventData) {
        android.view.ViewGroup viewGroup;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onHandleViewEventData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardComponent");
        kotlin.jvm.internal.o.g(adInfo, "adInfo");
        kotlin.jvm.internal.o.g(eventData, "eventData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEventType", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventData");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEventType", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventData");
        l94.m mVar = l94.m.f317378d;
        l94.m mVar2 = eventData.f317374a;
        if (mVar2 == mVar) {
            android.view.ViewGroup viewGroup2 = this.f317371h;
            if (viewGroup2 != null) {
                viewGroup2.setPressed(false);
            }
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEventType", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventData");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEventType", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCompEventData");
            if (mVar2 == l94.m.f317379e && (viewGroup = this.f317371h) != null) {
                viewGroup.setPressed(true);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onHandleViewEventData", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdCardComponent");
    }
}

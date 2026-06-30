package vi1;

/* loaded from: classes7.dex */
public final class y1 extends vi1.f implements eb1.d {
    public final java.util.ArrayList A;
    public yz5.l B;
    public yz5.a C;
    public yz5.a D;
    public yz5.a E;
    public yz5.a F;
    public yz5.a G;
    public yz5.l H;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f437507y;

    /* renamed from: z, reason: collision with root package name */
    public vi1.l0 f437508z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(android.content.Context context, java.lang.String appId, xi1.g windowAndroid) {
        super(context, windowAndroid);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(windowAndroid, "windowAndroid");
        this.f437507y = appId;
        this.A = new java.util.ArrayList();
        this.B = vi1.p1.f437426d;
        this.C = vi1.s1.f437446d;
        this.D = vi1.r1.f437439d;
        this.E = vi1.t1.f437454d;
        this.F = vi1.q1.f437433d;
        this.G = vi1.u1.f437464d;
        this.H = vi1.v1.f437469d;
        this.f437315v = new vi1.m1(this);
        this.f437307n.setOnClickListener(new vi1.n1(this));
        this.f437311r.setOnClickListener(new vi1.o1(this));
        this.f437309p.setVisibility(0);
    }

    @Override // fl1.b2
    public boolean a() {
        return false;
    }

    @Override // eb1.d
    public si1.i0 b(com.tencent.mm.plugin.appbrand.y component, java.lang.String appId, vi1.j2 j2Var, com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem phoneItem, vi1.f0 f0Var) {
        xi1.g windowAndroid;
        kotlin.jvm.internal.o.g(component, "component");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(phoneItem, "phoneItem");
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = component.t3();
        if (t37 == null || (windowAndroid = t37.getWindowAndroid()) == null) {
            windowAndroid = component.getWindowAndroid();
            kotlin.jvm.internal.o.d(windowAndroid);
        }
        xi1.g gVar = windowAndroid;
        int measuredHeight = this.f437301e.getMeasuredHeight();
        int c17 = com.tencent.mm.plugin.appbrand.widget.input.l2.c(getContext()) + com.tencent.mm.ui.zk.a(getContext(), 150);
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new vi1.z3(context, measuredHeight < c17 ? c17 : measuredHeight, gVar, appId, j2Var, phoneItem, f0Var);
    }

    @Override // eb1.d
    public void f(boolean z17) {
        int i17 = z17 ? 0 : 8;
        android.widget.ImageView imageView = this.f437307n;
        imageView.setVisibility(i17);
        if (!z17) {
            imageView.setOnClickListener(null);
            return;
        }
        android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.raw.icon_info, b3.l.getColor(getContext(), com.tencent.mm.R.color.BW_0_Alpha_0_3));
        this.f437316w = e17;
        imageView.setVisibility(8);
        if (e17 != null) {
            imageView.setImageDrawable(this.f437316w);
            imageView.setVisibility(0);
        }
        imageView.setContentDescription(getContext().getString(com.tencent.mm.R.string.f490304r9));
        imageView.setOnClickListener(new vi1.x1(this));
    }

    @Override // si1.k0
    public si1.j0 h(com.tencent.mm.plugin.appbrand.jsapi.l component, java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.r1 r1Var) {
        xi1.g windowAndroid;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37;
        kotlin.jvm.internal.o.g(component, "component");
        com.tencent.mm.plugin.appbrand.y yVar = component instanceof com.tencent.mm.plugin.appbrand.y ? (com.tencent.mm.plugin.appbrand.y) component : null;
        if (yVar == null || (t37 = yVar.t3()) == null || (windowAndroid = t37.getWindowAndroid()) == null) {
            windowAndroid = component.getWindowAndroid();
            kotlin.jvm.internal.o.d(windowAndroid);
        }
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        fl1.z1 z1Var = new fl1.z1(r1Var, str, context, this.f437301e.getMeasuredHeight(), windowAndroid);
        z1Var.k(this.f437317x);
        return z1Var;
    }

    @Override // si1.i0
    public void r(com.tencent.mm.plugin.appbrand.jsapi.l component) {
        kotlin.jvm.internal.o.g(component, "component");
        c(this.f437317x);
        i(component).c(this);
    }

    @Override // eb1.d
    public void setDialogApplyWording(java.lang.String wording) {
        kotlin.jvm.internal.o.g(wording, "wording");
        android.widget.TextView textView = this.f437308o;
        textView.setText(wording);
        textView.setVisibility(r26.n0.N(wording) ? 8 : 0);
    }

    @Override // eb1.d
    public void setDialogRequestDesc(java.lang.String wording) {
        kotlin.jvm.internal.o.g(wording, "wording");
        this.f437305i.setText(wording);
    }

    @Override // eb1.d
    public void setDialogSubDesc(java.lang.String desc) {
        kotlin.jvm.internal.o.g(desc, "desc");
        android.widget.TextView textView = this.f437306m;
        textView.setVisibility(0);
        textView.setText(desc);
    }

    @Override // eb1.d
    public void setOnAccept(yz5.l lVar) {
        kotlin.jvm.internal.o.g(lVar, "<set-?>");
        this.B = lVar;
    }

    @Override // eb1.d
    public void setOnAddPhoneNumber(yz5.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<set-?>");
        this.F = aVar;
    }

    @Override // eb1.d
    public void setOnCancel(yz5.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<set-?>");
        this.D = aVar;
    }

    @Override // eb1.d
    public void setOnDeny(yz5.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<set-?>");
        this.C = aVar;
    }

    @Override // eb1.d
    public void setOnExplain(yz5.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<set-?>");
        this.E = aVar;
    }

    @Override // eb1.d
    public void setOnManagePhoneNumber(yz5.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<set-?>");
        this.G = aVar;
    }

    @Override // eb1.d
    public void setOnPhoneItemSelect(yz5.l lVar) {
        kotlin.jvm.internal.o.g(lVar, "<set-?>");
        this.H = lVar;
    }

    @Override // eb1.d
    public void setPhoneItems(java.util.ArrayList value) {
        kotlin.jvm.internal.o.g(value, "value");
        java.util.ArrayList arrayList = this.A;
        arrayList.clear();
        arrayList.addAll(value);
        ik1.h0.b(new vi1.w1(this));
    }
}

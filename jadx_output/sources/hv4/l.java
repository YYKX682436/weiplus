package hv4;

/* loaded from: classes8.dex */
public final class l extends androidx.appcompat.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public final r45.ck6 f285308f;

    /* renamed from: g, reason: collision with root package name */
    public final hv4.a f285309g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f285310h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f285311i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f285312m;

    /* renamed from: n, reason: collision with root package name */
    public hv4.n f285313n;

    /* renamed from: o, reason: collision with root package name */
    public hv4.o f285314o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f285315p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context, r45.ck6 homeContext, hv4.a listener) {
        super(context, com.tencent.mm.R.style.f494553pz);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(homeContext, "homeContext");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f285308f = homeContext;
        this.f285309g = listener;
        this.f285310h = "MicroMsg.WebSearch.TagSearchDialog";
    }

    public final void D(r45.sn3 shareContent, android.graphics.Bitmap bitmap, java.lang.String str) {
        kotlin.jvm.internal.o.g(shareContent, "shareContent");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSearchShare BusinessType:");
        sb6.append(shareContent.f385856d.f379953g);
        sb6.append(" SubType:");
        sb6.append(shareContent.f385856d.f379954h);
        sb6.append(" BrandFeed:");
        sb6.append(shareContent.f385857e != null);
        sb6.append(" WeappFeed:");
        sb6.append(shareContent.f385859g != null);
        sb6.append(" WeappProfile:");
        sb6.append(shareContent.f385860h != null);
        sb6.append(" BrandProfile:");
        sb6.append(shareContent.f385858f != null);
        sb6.append(" FinderFeed:");
        sb6.append(shareContent.f385862m != null);
        sb6.append(" FinderProfile:");
        sb6.append(shareContent.f385861i != null);
        sb6.append(" Emoticon:");
        sb6.append(shareContent.f385863n != null);
        com.tencent.mars.xlog.Log.i(this.f285310h, sb6.toString());
        pm0.v.X(new hv4.g(this, shareContent, bitmap, str));
    }

    public final void E(r45.sn3 shareContent, java.lang.String str) {
        kotlin.jvm.internal.o.g(shareContent, "shareContent");
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f285315p;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        this.f285309g.b(shareContent);
        dismiss();
        com.tencent.mm.autogen.mmdata.rpt.WCTopicSearchShareActionReportStruct wCTopicSearchShareActionReportStruct = new com.tencent.mm.autogen.mmdata.rpt.WCTopicSearchShareActionReportStruct();
        wCTopicSearchShareActionReportStruct.f62169e = c01.id.e();
        wCTopicSearchShareActionReportStruct.f62168d = 2L;
        wCTopicSearchShareActionReportStruct.f62170f = 2L;
        if (str == null) {
            str = "";
        }
        wCTopicSearchShareActionReportStruct.f62171g = wCTopicSearchShareActionReportStruct.b("ResultQuery", str, true);
        r45.ck6 ck6Var = this.f285308f;
        wCTopicSearchShareActionReportStruct.f62172h = com.tencent.mm.storage.z3.R4(ck6Var.f371630o) ? 2L : 1L;
        wCTopicSearchShareActionReportStruct.f62173i = wCTopicSearchShareActionReportStruct.b("ShareSceneId", ck6Var.f371630o, true);
        java.lang.String str2 = shareContent.f385856d.f379950d;
        if (str2 == null) {
            str2 = "";
        }
        wCTopicSearchShareActionReportStruct.f62174j = wCTopicSearchShareActionReportStruct.b("ShareSessionId", str2, true);
        java.lang.String str3 = shareContent.f385856d.f379951e;
        if (str3 == null) {
            str3 = "";
        }
        wCTopicSearchShareActionReportStruct.f62175k = wCTopicSearchShareActionReportStruct.b("ShareSearchId", str3, true);
        java.lang.String str4 = shareContent.f385856d.f379952f;
        if (str4 == null) {
            str4 = "";
        }
        wCTopicSearchShareActionReportStruct.f62176l = wCTopicSearchShareActionReportStruct.b("ShareRequestId", str4, true);
        java.lang.String str5 = shareContent.f385856d.f379955i;
        wCTopicSearchShareActionReportStruct.f62177m = wCTopicSearchShareActionReportStruct.b("ShareDocId", str5 != null ? str5 : "", true);
        r45.lx5 lx5Var = shareContent.f385856d;
        wCTopicSearchShareActionReportStruct.f62179o = lx5Var.f379954h;
        wCTopicSearchShareActionReportStruct.f62178n = lx5Var.f379953g;
        wCTopicSearchShareActionReportStruct.k();
        su4.k3.m(wCTopicSearchShareActionReportStruct);
    }

    public final void F(java.lang.String id6) {
        kotlin.jvm.internal.o.g(id6, "id");
        if (this.f285315p == null) {
            this.f285315p = com.tencent.mm.ui.widget.dialog.u3.f(getContext(), getContext().getString(com.tencent.mm.R.string.ggc), true, 0, new hv4.h(this));
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f285315p;
        if (u3Var == null || u3Var.isShowing()) {
            return;
        }
        u3Var.show();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        android.view.View findViewById;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator rotation;
        android.view.ViewPropertyAnimator duration;
        android.widget.TextView textView;
        if (!this.f285312m) {
            dismiss();
            return;
        }
        android.view.View view = this.f285311i;
        if (view != null && (textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.odf)) != null) {
            textView.setText(com.tencent.mm.R.string.jo6);
        }
        android.view.View view2 = this.f285311i;
        if (view2 != null && (findViewById = view2.findViewById(com.tencent.mm.R.id.f483758bz2)) != null && (animate = findViewById.animate()) != null && (rotation = animate.rotation(0.0f)) != null && (duration = rotation.setDuration(200L)) != null) {
            duration.start();
        }
        hv4.o oVar = this.f285314o;
        if (oVar != null) {
            oVar.f285329g.animate().translationX(i65.a.B(oVar.H())).setDuration(300L).start();
        }
        this.f285312m = false;
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(67108864);
        }
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setDimAmount(0.5f);
        }
        android.view.Window window4 = getWindow();
        if (window4 != null) {
            window4.setWindowAnimations(com.tencent.mm.R.style.f494075dq);
        }
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.cxl, (android.view.ViewGroup) null);
        setContentView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
        inflate.findViewById(com.tencent.mm.R.id.f484220df2).setOnTouchListener(new hv4.c(this));
        inflate.findViewById(com.tencent.mm.R.id.f483758bz2).setOnClickListener(new hv4.d(this));
        ((android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.meb)).setOnClickListener(new hv4.e(inflate));
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.odf)).setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479850gz) * i65.a.m(getContext()));
        this.f285313n = new hv4.n(this, this.f285308f, this.f285309g, inflate);
        setOnDismissListener(new hv4.f(this));
        setCancelable(true);
        this.f285311i = inflate;
    }
}

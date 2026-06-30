package kl2;

/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f308758a;

    /* renamed from: b, reason: collision with root package name */
    public final jl2.a f308759b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f308760c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f308761d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f308762e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f308763f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMSwitchBtn f308764g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f308765h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.f82 f308766i;

    /* renamed from: j, reason: collision with root package name */
    public final kl2.g f308767j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f308768k;

    public e0(android.content.Context context, jl2.a service, android.view.View rootView, r45.f82 dataInfo, yz5.a hideForNextPanel, yz5.a reOpen, yz5.l parentOption) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(service, "service");
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(dataInfo, "dataInfo");
        kotlin.jvm.internal.o.g(hideForNextPanel, "hideForNextPanel");
        kotlin.jvm.internal.o.g(reOpen, "reOpen");
        kotlin.jvm.internal.o.g(parentOption, "parentOption");
        this.f308758a = context;
        this.f308759b = service;
        this.f308760c = hideForNextPanel;
        this.f308761d = reOpen;
        this.f308762e = parentOption;
        this.f308767j = new kl2.g(context, service, new kl2.z(this), new kl2.a0(this));
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.oax);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
        this.f308763f = viewGroup;
        viewGroup.setOnClickListener(new kl2.w(this));
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.m1l);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = (com.tencent.mm.ui.widget.MMSwitchBtn) findViewById2;
        this.f308764g = mMSwitchBtn;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.oap);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.f308765h = textView;
        b(mMSwitchBtn.f211363x);
        mMSwitchBtn.setSwitchListener(new kl2.x(this));
        this.f308766i = dataInfo;
        r45.ql1 ql1Var = (r45.ql1) dataInfo.getCustom(2);
        if (ql1Var != null) {
            if (ql1Var.getInteger(0) == 1) {
                mMSwitchBtn.setCheck(true);
                viewGroup.setVisibility(0);
                textView.setText(context.getResources().getString(com.tencent.mm.R.string.ebm, java.lang.Long.valueOf(ql1Var.getLong(1))));
            } else {
                mMSwitchBtn.setCheck(false);
                viewGroup.setVisibility(8);
            }
        }
        this.f308768k = jz5.h.b(new kl2.d0(this));
    }

    public static final void a(kl2.e0 e0Var, boolean z17) {
        r45.ql1 ql1Var;
        r45.f82 f82Var = e0Var.f308766i;
        if (f82Var != null && (ql1Var = (r45.ql1) f82Var.getCustom(2)) != null) {
            ql1Var.set(0, java.lang.Integer.valueOf(z17 ? 1 : 0));
            e0Var.f308763f.setVisibility(z17 ? 0 : 8);
            e0Var.f308765h.setText(e0Var.f308758a.getResources().getString(com.tencent.mm.R.string.ebm, java.lang.Long.valueOf(ql1Var.getLong(1))));
            ((il2.r) e0Var.f308759b).u1(ql1Var, true);
        }
        e0Var.b(z17);
    }

    public final void b(boolean z17) {
        android.content.Context context = this.f308758a;
        java.lang.String string = context.getString(com.tencent.mm.R.string.ebk);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = this.f308764g;
        if (z17) {
            if (mMSwitchBtn != null) {
                mMSwitchBtn.setContentDescription(context.getString(com.tencent.mm.R.string.efy, string));
                return;
            } else {
                kotlin.jvm.internal.o.o("switchBtn");
                throw null;
            }
        }
        if (mMSwitchBtn != null) {
            mMSwitchBtn.setContentDescription(context.getString(com.tencent.mm.R.string.efx, string));
        } else {
            kotlin.jvm.internal.o.o("switchBtn");
            throw null;
        }
    }
}

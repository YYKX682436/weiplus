package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class f3 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f124539a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.qt2 f124540b;

    /* renamed from: c, reason: collision with root package name */
    public final vb2.f0 f124541c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f124542d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f124543e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f124544f;

    public f3(android.view.View header, androidx.appcompat.app.AppCompatActivity activity, r45.qt2 contextObj) {
        kotlin.jvm.internal.o.g(header, "header");
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.f124539a = activity;
        this.f124540b = contextObj;
        vb2.f0 a17 = vb2.f0.a(header);
        this.f124541c = a17;
        androidx.constraintlayout.widget.ConstraintLayout profileRedpackLayout = a17.T0;
        kotlin.jvm.internal.o.f(profileRedpackLayout, "profileRedpackLayout");
        this.f124542d = profileRedpackLayout;
        android.widget.TextView profileRedpackTxt = a17.V0;
        kotlin.jvm.internal.o.f(profileRedpackTxt, "profileRedpackTxt");
        this.f124543e = profileRedpackTxt;
        this.f124544f = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.a3(this));
    }

    public static final void a(com.tencent.mm.plugin.finder.profile.widget.f3 f3Var, int i17) {
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        androidx.appcompat.app.AppCompatActivity context = f3Var.f124539a;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.b6.d(b6Var, nyVar != null ? nyVar.V6() : null, "red_packet_make", i17, null, false, null, 56, null);
    }
}

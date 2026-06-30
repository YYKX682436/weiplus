package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class w1 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f124807a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.xk f124808b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.z1 f124809c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124810d;

    public w1(ya2.b2 b2Var, r45.xk xkVar, com.tencent.mm.plugin.finder.profile.widget.z1 z1Var, java.lang.String str) {
        this.f124807a = b2Var;
        this.f124808b = xkVar;
        this.f124809c = z1Var;
        this.f124810d = str;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
            ya2.b2 b2Var = this.f124807a;
            java.lang.String D0 = b2Var != null ? b2Var.D0() : "";
            r45.xk xkVar = this.f124808b;
            java.lang.String string = xkVar.getString(0);
            java.lang.String str = string != null ? string : "";
            com.tencent.mm.plugin.finder.profile.widget.z1 z1Var = this.f124809c;
            androidx.appcompat.app.AppCompatActivity activity = z1Var.f124841a;
            kotlin.jvm.internal.o.g(activity, "activity");
            o3Var.Ak(3, D0, str, "", ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6());
            com.tencent.mm.plugin.finder.report.t2.f125363a.a(z1Var.f124841a, this.f124810d, false, xkVar.getString(6), xkVar.getString(0), z1Var.f124841a.getIntent().getLongExtra("finder_from_feed_id", 0L));
        }
    }
}

package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes4.dex */
public class q implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f189039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189040b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189041c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.a5 f189042d;

    public q(android.os.Bundle bundle, java.lang.String str, java.lang.String str2, com.tencent.mm.pluginsdk.model.app.a5 a5Var) {
        this.f189039a = bundle;
        this.f189040b = str;
        this.f189041c = str2;
        this.f189042d = a5Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.pluginsdk.model.app.w.a(this.f189039a, 0, 0, "", 0, this.f189040b);
        java.lang.String str2 = this.f189041c;
        if ("wx073f4a4daff0abe8".equalsIgnoreCase(str2)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15413, 3, "", "");
        }
        com.tencent.mm.pluginsdk.model.app.w.A(str2, false);
        com.tencent.mm.pluginsdk.model.app.a5 a5Var = this.f189042d;
        if (a5Var != null) {
            a5Var.a(false, true);
        }
    }
}

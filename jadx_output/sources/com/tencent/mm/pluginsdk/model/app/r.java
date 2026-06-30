package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes4.dex */
public class r implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f189048a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189049b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189050c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f189051d;

    public r(android.os.Bundle bundle, java.lang.String str, java.lang.String str2, java.lang.Runnable runnable) {
        this.f189048a = bundle;
        this.f189049b = str;
        this.f189050c = str2;
        this.f189051d = runnable;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.pluginsdk.model.app.w.a(this.f189048a, 0, 1, "", 1, this.f189049b);
        java.lang.String str2 = this.f189050c;
        if ("wx073f4a4daff0abe8".equalsIgnoreCase(str2)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15413, 2, "", "");
        }
        com.tencent.mm.pluginsdk.model.app.w.A(str2, true);
        this.f189051d.run();
    }
}

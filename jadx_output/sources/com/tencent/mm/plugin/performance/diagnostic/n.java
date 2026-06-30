package com.tencent.mm.plugin.performance.diagnostic;

/* loaded from: classes12.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI f152944d;

    public n(com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI diagnosticSettingsUI) {
        this.f152944d = diagnosticSettingsUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/performance/diagnostic/DiagnosticSettingsUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (ih.d.d().b("OpenglLeak") != null) {
            yj0.a.h(this, "com/tencent/mm/plugin/performance/diagnostic/DiagnosticSettingsUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        li.d dVar = new li.d(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.matrix.openglleak.hook.OpenGLHook.getInstance().setJavaStackDump(true);
        com.tencent.matrix.openglleak.hook.OpenGLHook.getInstance().setNativeStackDump(true);
        dVar.c((android.app.Application) com.tencent.mm.sdk.platformtools.x2.f193071a, new com.tencent.mm.plugin.performance.diagnostic.l(this));
        dVar.e();
        ih.d.d().f291470a.add(dVar);
        ni.i iVar = new ni.i(900000L);
        iVar.f337181g = new com.tencent.mm.plugin.performance.diagnostic.m(this);
        iVar.a((android.app.Application) this.f152944d.getApplicationContext());
        yj0.a.h(this, "com/tencent/mm/plugin/performance/diagnostic/DiagnosticSettingsUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

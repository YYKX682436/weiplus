package com.tencent.mm.plugin.performance.diagnostic;

/* loaded from: classes8.dex */
public class w implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI f152953a;

    public w(com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI diagnosticSettingsUI) {
        this.f152953a = diagnosticSettingsUI;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        if (z17) {
            com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI diagnosticSettingsUI = this.f152953a;
            diagnosticSettingsUI.y.setChecked(false);
            diagnosticSettingsUI.z.setChecked(false);
            diagnosticSettingsUI.A.setChecked(false);
        }
    }
}

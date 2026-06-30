package com.tencent.mm.plugin.performance.diagnostic;

/* loaded from: classes8.dex */
public class s implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI f152949a;

    public s(com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI diagnosticSettingsUI) {
        this.f152949a = diagnosticSettingsUI;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        if (z17) {
            com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI diagnosticSettingsUI = this.f152949a;
            diagnosticSettingsUI.f.setChecked(false);
            diagnosticSettingsUI.g.setChecked(false);
            diagnosticSettingsUI.h.setChecked(false);
        }
    }
}

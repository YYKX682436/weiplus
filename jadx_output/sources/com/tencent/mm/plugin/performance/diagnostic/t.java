package com.tencent.mm.plugin.performance.diagnostic;

/* loaded from: classes8.dex */
public class t implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI f152950a;

    public t(com.tencent.mm.plugin.performance.diagnostic.DiagnosticSettingsUI diagnosticSettingsUI) {
        this.f152950a = diagnosticSettingsUI;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        if (z17) {
            this.f152950a.B.setChecked(false);
        }
    }
}

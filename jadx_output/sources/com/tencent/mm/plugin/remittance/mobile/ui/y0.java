package com.tencent.mm.plugin.remittance.mobile.ui;

/* loaded from: classes.dex */
public class y0 extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    public y0(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        root(com.tencent.mm.R.id.joh).disable(com.tencent.mm.R.id.joh);
        focusFirst(com.tencent.mm.R.id.jol);
    }
}

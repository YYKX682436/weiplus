package com.tencent.mm.plugin.voip.ui;

@db5.a(3)
/* loaded from: classes11.dex */
public class MMSuperAlert extends com.tencent.mm.hellhoundlib.activities.HellActivity {
    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return (getAssets() == null || com.tencent.mm.sdk.platformtools.x2.f193075e == null) ? super.getResources() : com.tencent.mm.sdk.platformtools.x2.f193075e;
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.tencent.mm.R.layout.c1k);
        new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.voip.ui.j(this, getIntent().getIntExtra("MMSuperAlert_msg", 0), getIntent().getIntExtra("MMSuperAlert_title", 0), getIntent().getBooleanExtra("MMSuperAlert_cancelable", true)), 50L);
    }
}

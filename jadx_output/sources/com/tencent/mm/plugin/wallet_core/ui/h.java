package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes3.dex */
public class h extends com.tencent.mm.ui.base.preference.Preference {
    public h(com.tencent.mm.plugin.wallet_core.ui.k kVar, android.content.Context context) {
        super(context);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        if (this.f197772f != null) {
            view.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.g(this));
        }
    }
}

package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class u extends com.tencent.mm.ui.base.preference.Preference {
    public u(com.tencent.mm.plugin.wallet_core.ui.l lVar, android.content.Context context) {
        super(context);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        if (this.f197772f != null) {
            view.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.t(this));
        }
    }
}

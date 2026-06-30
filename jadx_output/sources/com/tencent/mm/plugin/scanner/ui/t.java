package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes9.dex */
public class t extends com.tencent.mm.ui.base.preference.Preference {
    public android.view.View L;

    public t(android.content.Context context) {
        super(context);
        this.L = null;
        this.G = com.tencent.mm.R.layout.f489364ca5;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View p(android.view.View view, android.view.ViewGroup viewGroup) {
        if (this.L == null) {
            this.L = u(viewGroup);
        }
        super.t(this.L);
        return this.L;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
    }
}

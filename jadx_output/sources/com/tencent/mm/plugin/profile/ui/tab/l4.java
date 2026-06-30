package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes9.dex */
public final class l4 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.s4 f154406d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f154407e;

    public l4(com.tencent.mm.plugin.profile.ui.tab.s4 s4Var, java.lang.CharSequence charSequence) {
        this.f154406d = s4Var;
        this.f154407e = charSequence;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f154406d.B(this.f154407e);
    }
}

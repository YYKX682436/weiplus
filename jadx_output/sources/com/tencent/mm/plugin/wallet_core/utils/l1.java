package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes3.dex */
public class l1 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f180923a;

    public l1(android.view.View view) {
        this.f180923a = view;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        android.view.View view = this.f180923a;
        if (view != null) {
            view.setEnabled(z17);
        }
    }
}

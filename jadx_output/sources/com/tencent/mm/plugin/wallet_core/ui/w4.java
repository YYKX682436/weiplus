package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes5.dex */
public class w4 implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.Button f180762a;

    public w4(android.widget.Button button) {
        this.f180762a = button;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        android.widget.Button button = this.f180762a;
        if (z17) {
            button.setEnabled(true);
            button.setClickable(true);
        } else {
            button.setEnabled(false);
            button.setClickable(false);
        }
    }
}

package com.tencent.mm.plugin.wallet_core.ui.view;

/* loaded from: classes9.dex */
public class SwitchPhoneItemGroupView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f180695d;

    /* renamed from: e, reason: collision with root package name */
    public gt4.s f180696e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View.OnClickListener f180697f;

    public SwitchPhoneItemGroupView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f180695d = new java.util.ArrayList();
        this.f180697f = new gt4.r(this);
    }

    public void a(com.tencent.mm.plugin.wallet_core.ui.view.SwitchPhoneItemView switchPhoneItemView, int i17) {
        addView(switchPhoneItemView, i17);
        this.f180695d.add(switchPhoneItemView);
        switchPhoneItemView.setOnClickListener(this.f180697f);
    }

    public void setOnItemSelectListener(gt4.s sVar) {
        this.f180696e = sVar;
    }

    public SwitchPhoneItemGroupView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f180695d = new java.util.ArrayList();
        this.f180697f = new gt4.r(this);
    }
}

package com.tencent.mm.ui.statusbar;

/* loaded from: classes8.dex */
public class DrawStatusBarPreference extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: d, reason: collision with root package name */
    public vj5.h f209863d = null;

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return 0;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getStatusBarColor() {
        return com.tencent.mm.ui.uk.b(getResources().getColor(com.tencent.mm.R.color.amv), getActionbarColor());
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity
    public void initSwipeBack() {
        super.initSwipeBack();
        if (getSwipeBackLayout() == null || getSwipeBackLayout().getChildCount() <= 0) {
            return;
        }
        android.view.View childAt = getSwipeBackLayout().getChildAt(0);
        getSwipeBackLayout().removeView(childAt);
        vj5.h hVar = new vj5.h(this);
        this.f209863d = hVar;
        hVar.addView(childAt, new android.widget.FrameLayout.LayoutParams(-1, -1));
        getSwipeBackLayout().addView(this.f209863d);
        getSwipeBackLayout().setContentView(this.f209863d);
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        return false;
    }
}

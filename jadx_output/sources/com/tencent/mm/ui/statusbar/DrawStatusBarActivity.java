package com.tencent.mm.ui.statusbar;

/* loaded from: classes7.dex */
public abstract class DrawStatusBarActivity extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public vj5.h f209862d = null;

    @Override // com.tencent.mm.ui.MMActivity
    public int getStatusBarColor() {
        return getActionbarColor();
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
        this.f209862d = hVar;
        hVar.addView(childAt, new android.widget.FrameLayout.LayoutParams(-1, -1));
        getSwipeBackLayout().addView(this.f209862d);
        getSwipeBackLayout().setContentView(this.f209862d);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setActionbarColor(int i17) {
        super.setActionbarColor(i17);
        if (getWindow() != null) {
            vj5.a.a(getContentView(), getWindow().getStatusBarColor(), vj5.o.h(getWindow()));
        }
    }
}

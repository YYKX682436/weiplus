package ym5;

/* loaded from: classes14.dex */
public class f5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f463298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.SmileySubGrid f463299e;

    public f5(com.tencent.mm.view.SmileySubGrid smileySubGrid, android.view.View view) {
        this.f463299e = smileySubGrid;
        this.f463298d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.view.SmileySubGrid smileySubGrid = this.f463299e;
        com.tencent.mm.view.popview.AbstractPopView abstractPopView = smileySubGrid.f213473o;
        if (abstractPopView != null) {
            abstractPopView.setVisibility(0);
            smileySubGrid.f213473o.d(this.f463298d);
            android.view.WindowManager windowManager = smileySubGrid.f213472n;
            com.tencent.mm.view.popview.AbstractPopView abstractPopView2 = smileySubGrid.f213473o;
            windowManager.updateViewLayout(abstractPopView2, abstractPopView2.getWindowLayoutParams());
        }
    }
}

package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes14.dex */
public class h2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallFuncButton f142850d;

    public h2(com.tencent.mm.plugin.ipcall.ui.IPCallFuncButton iPCallFuncButton) {
        this.f142850d = iPCallFuncButton;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallFuncButton$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.ipcall.ui.IPCallFuncButton iPCallFuncButton = this.f142850d;
        if (!iPCallFuncButton.f142629o) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/ipcall/ui/IPCallFuncButton$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (motionEvent.getAction() == 0) {
            if (iPCallFuncButton.f142627m) {
                if (iPCallFuncButton.f142628n) {
                    iPCallFuncButton.f142621d.setImageDrawable(iPCallFuncButton.f142623f);
                    iPCallFuncButton.f142628n = false;
                } else {
                    iPCallFuncButton.f142621d.setImageDrawable(iPCallFuncButton.f142624g);
                    iPCallFuncButton.f142628n = true;
                }
                com.tencent.mm.plugin.ipcall.ui.i2 i2Var = iPCallFuncButton.f142630p;
                if (i2Var != null) {
                    i2Var.a(iPCallFuncButton.f142628n);
                }
            } else {
                android.graphics.drawable.Drawable drawable = iPCallFuncButton.f142624g;
                if (drawable != null) {
                    iPCallFuncButton.f142621d.setImageDrawable(drawable);
                }
            }
        } else if ((motionEvent.getAction() == 3 || motionEvent.getAction() == 1) && !iPCallFuncButton.f142627m) {
            android.graphics.drawable.Drawable drawable2 = iPCallFuncButton.f142623f;
            if (drawable2 != null) {
                iPCallFuncButton.f142621d.setImageDrawable(drawable2);
            }
            com.tencent.mm.plugin.ipcall.ui.i2 i2Var2 = iPCallFuncButton.f142630p;
            if (i2Var2 != null) {
                i2Var2.a(false);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/ipcall/ui/IPCallFuncButton$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

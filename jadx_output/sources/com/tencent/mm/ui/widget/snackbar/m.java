package com.tencent.mm.ui.widget.snackbar;

/* loaded from: classes10.dex */
public class m implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.snackbar.n f212481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.snackbar.SnackContainer f212482e;

    public m(com.tencent.mm.ui.widget.snackbar.SnackContainer snackContainer, com.tencent.mm.ui.widget.snackbar.n nVar) {
        this.f212482e = snackContainer;
        this.f212481d = nVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/snackbar/SnackContainer$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 4) {
            com.tencent.mm.ui.widget.snackbar.SnackContainer snackContainer = this.f212482e;
            snackContainer.removeCallbacks(snackContainer.f212461f);
            com.tencent.mm.ui.widget.snackbar.h hVar = this.f212481d.f212487e;
            if (hVar != null) {
                com.tencent.mm.ui.widget.snackbar.j.f212477a = false;
                hVar.onHide();
            }
            snackContainer.startAnimation(snackContainer.f212460e);
            java.util.Queue queue = snackContainer.f212459d;
            if (!queue.isEmpty()) {
                ((java.util.LinkedList) queue).clear();
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/widget/snackbar/SnackContainer$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}

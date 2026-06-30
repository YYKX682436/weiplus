package com.tencent.mm.ui.widget.snackbar;

/* loaded from: classes10.dex */
public class e implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.snackbar.i f212466d;

    public e(com.tencent.mm.ui.widget.snackbar.i iVar) {
        this.f212466d = iVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/snackbar/SnackBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (com.tencent.mm.ui.widget.snackbar.j.f212477a) {
            com.tencent.mm.ui.widget.snackbar.i iVar = this.f212466d;
            if (!iVar.f212472a.f212459d.isEmpty()) {
                com.tencent.mm.ui.widget.snackbar.j.f212477a = false;
                iVar.f212475d.postDelayed(new com.tencent.mm.ui.widget.snackbar.d(this), 100L);
            }
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/widget/snackbar/SnackBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}

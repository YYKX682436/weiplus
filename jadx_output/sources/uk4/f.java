package uk4;

/* loaded from: classes8.dex */
public final class f implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.base.view.TingBaseHalfDialog f428545d;

    public f(com.tencent.mm.plugin.ting.base.view.TingBaseHalfDialog tingBaseHalfDialog) {
        this.f428545d = tingBaseHalfDialog;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ting/base/view/TingBaseHalfDialog$initContentView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int i17 = com.tencent.mm.plugin.ting.base.view.TingBaseHalfDialog.f174665r;
        this.f428545d.cancel();
        yj0.a.i(true, this, "com/tencent/mm/plugin/ting/base/view/TingBaseHalfDialog$initContentView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}

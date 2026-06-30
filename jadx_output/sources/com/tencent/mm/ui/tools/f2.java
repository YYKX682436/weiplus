package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class f2 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.b4 f210396d;

    public f2(com.tencent.mm.ui.tools.CropImageNewUI cropImageNewUI, com.tencent.mm.sdk.platformtools.b4 b4Var) {
        this.f210396d = b4Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/CropImageNewUI$18", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f210396d;
        if (action == 0) {
            b4Var.c(200L, 200L);
        } else if (action == 1) {
            b4Var.d();
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/tools/CropImageNewUI$18", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

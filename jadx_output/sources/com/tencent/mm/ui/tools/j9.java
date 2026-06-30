package com.tencent.mm.ui.tools;

/* loaded from: classes.dex */
public class j9 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShareImageRedirectUI f210517d;

    public j9(com.tencent.mm.ui.tools.ShareImageRedirectUI shareImageRedirectUI) {
        this.f210517d = shareImageRedirectUI;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/ShareImageRedirectUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.ui.tools.ShareImageRedirectUI shareImageRedirectUI = this.f210517d;
        dp.a.makeText(shareImageRedirectUI, com.tencent.mm.R.string.j4c, 1).show();
        shareImageRedirectUI.finish();
        yj0.a.i(false, this, "com/tencent/mm/ui/tools/ShareImageRedirectUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

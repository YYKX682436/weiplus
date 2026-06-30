package eh5;

/* loaded from: classes10.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh5.y f252976d;

    public x(eh5.y yVar) {
        this.f252976d = yVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eh5.y yVar = this.f252976d;
        if (!yVar.f252984p) {
            yVar.f252984p = false;
            return;
        }
        if (yVar.f252985q) {
            yVar.f252985q = false;
            yVar.f252984p = false;
            yVar.dismiss();
            return;
        }
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout = yVar.f252982n;
        if (roundCornerFrameLayout == null) {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
        int height = roundCornerFrameLayout.getHeight();
        if (height <= 0) {
            com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout2 = yVar.f252982n;
            if (roundCornerFrameLayout2 != null) {
                roundCornerFrameLayout2.post(new eh5.u(yVar));
                return;
            } else {
                kotlin.jvm.internal.o.o("contentContainer");
                throw null;
            }
        }
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout3 = yVar.f252982n;
        if (roundCornerFrameLayout3 == null) {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
        roundCornerFrameLayout3.setTranslationY(height * (-1.0f));
        android.view.View view = yVar.f252981m;
        if (view == null) {
            kotlin.jvm.internal.o.o("contentDimMask");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/immersive/ImmersiveHeaderHalfScreenBaseDialog$show$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/immersive/ImmersiveHeaderHalfScreenBaseDialog$show$1", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        com.tencent.mm.ui.widget.RoundCornerFrameLayout roundCornerFrameLayout4 = yVar.f252982n;
        if (roundCornerFrameLayout4 == null) {
            kotlin.jvm.internal.o.o("contentContainer");
            throw null;
        }
        roundCornerFrameLayout4.animate().setDuration(yVar.f252979h).setInterpolator(new y3.b()).translationY(0.0f).setUpdateListener(new eh5.v(yVar)).withEndAction(new eh5.w(yVar)).start();
        android.view.View view2 = yVar.f252981m;
        if (view2 != null) {
            view2.animate().setDuration(yVar.f252979h).alpha(1.0f).start();
        } else {
            kotlin.jvm.internal.o.o("contentDimMask");
            throw null;
        }
    }
}

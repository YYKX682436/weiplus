package sf4;

/* loaded from: classes4.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf4.p f407528d;

    public m(sf4.p pVar) {
        this.f407528d = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sf4.p pVar = this.f407528d;
        int b17 = i65.a.b(pVar.f407548a.getContext(), 112);
        android.view.View inflate = android.view.LayoutInflater.from(pVar.f407548a.getContext()).inflate(com.tencent.mm.R.layout.f489547cx3, (android.view.ViewGroup) pVar.f407548a, false);
        pVar.f407554g = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.npp);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        ((android.widget.ImageView) findViewById).setImageDrawable(com.tencent.mm.ui.uk.e(pVar.f407548a.getContext(), com.tencent.mm.R.raw.close_icon_nor, -1));
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, b17);
        layoutParams.addRule(12, 1);
        pVar.f407548a.addView(inflate, layoutParams);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/story/ui/view/gallery/GalleryScrollUpCheck$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        inflate.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/story/ui/view/gallery/GalleryScrollUpCheck$2", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        inflate.animate().alpha(1.0f).start();
        pVar.f407549b.b1(0, b17, null);
        pVar.f407551d = true;
    }
}

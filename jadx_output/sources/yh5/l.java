package yh5;

/* loaded from: classes3.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yh5.p f462437d;

    public l(yh5.p pVar) {
        this.f462437d = pVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        c01.f8 f8Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/media/clean/CleanSourceLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("CleanSourceLayer", "jumpChat click");
        android.os.Bundle bundle = this.f462437d.f462442w;
        if (bundle != null && (f8Var = (c01.f8) i95.n0.c(c01.f8.class)) != null) {
            ((yv1.b1) f8Var).Ai(view.getContext(), bundle);
        }
        yj0.a.h(this, "com/tencent/mm/ui/media/clean/CleanSourceLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

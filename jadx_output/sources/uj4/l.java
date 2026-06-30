package uj4;

/* loaded from: classes.dex */
public final class l implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f428440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f428441e;

    public l(android.view.ViewGroup viewGroup, android.widget.LinearLayout linearLayout) {
        this.f428440d = viewGroup;
        this.f428441e = linearLayout;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardLikeEducationUIC$tryShowEducation$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            this.f428440d.removeView(this.f428441e);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/textstatus/ui/card/TextStatusCardLikeEducationUIC$tryShowEducation$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}

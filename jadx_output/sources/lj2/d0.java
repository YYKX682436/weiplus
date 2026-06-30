package lj2;

/* loaded from: classes3.dex */
public final class d0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lj2.i0 f318850d;

    public d0(lj2.i0 i0Var) {
        this.f318850d = i0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayBubbleDetainment$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lj2.i0 i0Var = this.f318850d;
        i0Var.f318866c.invoke();
        i0Var.f318872i = true;
        i0Var.f318868e.dismiss();
        android.content.Context context = i0Var.f318864a;
        db5.t7.i(context, context.getResources().getString(com.tencent.mm.R.string.mme), com.tencent.mm.R.raw.icons_filled_done);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLivePayBubbleDetainment$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

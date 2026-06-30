package mh2;

/* loaded from: classes10.dex */
public final class n1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.r1 f326425d;

    public n1(mh2.r1 r1Var) {
        this.f326425d = r1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/ktv/view/KtvNoSingerWidget$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        mh2.r1 r1Var = this.f326425d;
        if (r1Var.f326448d.a0().H()) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.nqk), 0).show();
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ktv/view/KtvNoSingerWidget$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            r1Var.f326447c.d(true);
            r1Var.f326447c.i();
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ktv/view/KtvNoSingerWidget$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}

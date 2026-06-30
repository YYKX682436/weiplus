package mh2;

/* loaded from: classes10.dex */
public final class t0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mh2.f1 f326460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326461e;

    public t0(mh2.f1 f1Var, java.lang.String str) {
        this.f326460d = f1Var;
        this.f326461e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/ktv/view/KTVSingingWidget$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = view.getContext();
        androidx.appcompat.app.AppCompatActivity appCompatActivity = context instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context : null;
        if (appCompatActivity != null) {
            androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(appCompatActivity).a(pl2.x.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            pl2.x xVar = (pl2.x) a17;
            if (xVar.f356683f) {
                xVar.f356687m.f356678h = 3;
                pl2.s sVar = xVar.f356684g;
                if (sVar != null) {
                    pl2.s.e(sVar, 0L, null, 3, null);
                }
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ktv/view/KTVSingingWidget$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        mh2.f1 f1Var = this.f326460d;
        f1Var.k(2);
        f1Var.f326328c.j(fn2.u1.f264413h, this.f326461e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/ktv/view/KTVSingingWidget$onBind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

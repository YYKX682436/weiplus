package df2;

/* loaded from: classes3.dex */
public final class tk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pl f231452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f231453e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f231454f;

    public tk(df2.pl plVar, kotlin.jvm.internal.c0 c0Var, com.tencent.mm.ui.widget.dialog.k0 k0Var) {
        this.f231452d = plVar;
        this.f231453e = c0Var;
        this.f231454f = k0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomTextController$delCustomText$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.pl plVar = this.f231452d;
        com.tencent.mars.xlog.Log.i(plVar.f231087m, "[delCustomText] ok click");
        this.f231453e.f310112d = true;
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null) {
            com.tencent.mm.plugin.finder.live.util.y.f(k0Var, null, null, new df2.sk(plVar, null), 3, null);
        }
        this.f231454f.u();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomTextController$delCustomText$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

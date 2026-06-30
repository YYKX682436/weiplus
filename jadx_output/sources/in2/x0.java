package in2;

/* loaded from: classes8.dex */
public final class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.yg f292930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in2.a1 f292931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f292932f;

    public x0(dk2.yg ygVar, in2.a1 a1Var, int i17) {
        this.f292930d = ygVar;
        this.f292931e = a1Var;
        this.f292932f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapter$onBindSingSongHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dk2.yg songItem = this.f292930d;
        int i17 = songItem.f234395c;
        int i18 = this.f292932f;
        in2.a1 a1Var = this.f292931e;
        if (i17 == 4) {
            a1Var.z(i18, songItem);
        } else {
            a1Var.getClass();
            kotlin.jvm.internal.o.g(songItem, "songItem");
            com.tencent.mars.xlog.Log.i(a1Var.f292796f, songItem.f234393a + ", MUSIC_PLAY}");
            yz5.p pVar = a1Var.f292799i;
            if (pVar != null) {
                pVar.invoke(java.lang.Integer.valueOf(i18), songItem);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapter$onBindSingSongHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

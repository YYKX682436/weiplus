package na2;

/* loaded from: classes2.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ na2.k f335961d;

    public g(na2.k kVar) {
        this.f335961d = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/activity/postplay/uic/FinderPostPlayHeaderUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        na2.k kVar = this.f335961d;
        kVar.getClass();
        qs2.e eVar = new qs2.e(1, 112, 31);
        eVar.f366262d = kVar.f335972p;
        eVar.f366263e = kVar.f335973q;
        eVar.f366273o = kVar.f335971o;
        java.lang.String str = kVar.f335974r;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        eVar.f366274p = str;
        androidx.appcompat.app.AppCompatActivity context = kVar.getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        eVar.f366264f = nyVar != null ? nyVar.V6().getInteger(7) : 0;
        androidx.appcompat.app.AppCompatActivity activity = kVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        na2.f fVar = (na2.f) pf5.z.f353948a.a(activity).e(na2.f.class);
        if (fVar != null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderPostPlayNewHeaderUIC", "onPostBtnClick: delegate to FinderPostPlayAudioExtractorUIC");
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = fVar.f335957d;
            if (finderItem == null || !((qd2.g) ((jz5.n) fVar.f335960g).getValue()).e(fVar.getActivity())) {
                fVar.O6(eVar);
            } else {
                com.tencent.mars.xlog.Log.i("Finder.FinderPostPlayAudioExtractorUIC", "tryPostWithAudio: waiting audio download, sourceFeedId=".concat(pm0.v.u(finderItem.getFeedObject().getId())));
                fVar.f335959f = eVar;
            }
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderPostPlayNewHeaderUIC", "onPostBtnClick: audio UIC missing, fallback to plain post, sourceFeedId=".concat(pm0.v.u(kVar.f335972p)));
            i95.m c17 = i95.n0.c(w40.e.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            w40.e.Df((w40.e) c17, kVar.getActivity(), eVar, null, 4, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/activity/postplay/uic/FinderPostPlayHeaderUIC$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

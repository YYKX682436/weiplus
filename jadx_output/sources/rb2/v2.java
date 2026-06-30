package rb2;

/* loaded from: classes2.dex */
public final class v2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f393799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f393800e;

    public v2(java.util.LinkedList linkedList, in5.s0 s0Var) {
        this.f393799d = linkedList;
        this.f393800e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshRealNameRecommendAvatarLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.LinkedList linkedList = this.f393799d;
        com.tencent.mars.xlog.Log.i("Finder.FinderCommentConvert", "click recommendAvatarLayout:%d", java.lang.Integer.valueOf(linkedList.size()));
        android.content.Context context = this.f393800e.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.v6 v6Var = (com.tencent.mm.plugin.finder.viewmodel.component.v6) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.v6.class);
        v6Var.getClass();
        if (v6Var.f136212d == null) {
            v6Var.P6();
        }
        com.tencent.mm.plugin.finder.view.FinderLikeDrawer finderLikeDrawer = v6Var.f136212d;
        if (finderLikeDrawer != null) {
            finderLikeDrawer.v(null, null, null, 0, "", linkedList);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshRealNameRecommendAvatarLayout$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

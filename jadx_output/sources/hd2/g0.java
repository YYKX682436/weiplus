package hd2;

/* loaded from: classes2.dex */
public final class g0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment f280475d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f280476e;

    public g0(com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment finderProfileCardFragment, android.content.Context context) {
        this.f280475d = finderProfileCardFragment;
        this.f280476e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$initPostBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f280475d.getClass();
        android.content.Context context = this.f280476e;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        zy2.m8 m8Var = (zy2.m8) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.m8.class);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("POST_BTN_CLICK_SCENE_KEY", 2);
        ((im2.p4) m8Var).R6(intent);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$initPostBtn$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

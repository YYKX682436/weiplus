package hd2;

/* loaded from: classes.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.cr6 f280481d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment f280482e;

    public i0(r45.cr6 cr6Var, com.tencent.mm.plugin.finder.feed.ui.fragment.FinderProfileCardFragment finderProfileCardFragment) {
        this.f280481d = cr6Var;
        this.f280482e = finderProfileCardFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$needCompleteAccountUi$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.cr6 cr6Var = this.f280481d;
        if (cr6Var == null || (str = cr6Var.getString(3)) == null) {
            str = "";
        }
        if (str.length() > 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            j45.l.n(this.f280482e.getActivity(), "webview", ".ui.tools.WebViewUI", intent, 31121);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$needCompleteAccountUi$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

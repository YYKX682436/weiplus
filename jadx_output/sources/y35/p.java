package y35;

/* loaded from: classes11.dex */
public class p implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y35.r f459230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.preference.FMessageListView f459231e;

    public p(com.tencent.mm.pluginsdk.ui.preference.FMessageListView fMessageListView, y35.r rVar) {
        this.f459231e = fMessageListView;
        this.f459230d = rVar;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/preference/FMessageListView$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.pluginsdk.ui.preference.FMessageListView fMessageListView = this.f459231e;
        db5.e1.f(fMessageListView.getContext(), null, new java.lang.String[]{fMessageListView.getContext().getString(com.tencent.mm.R.string.b1i)}, null, null, new y35.o(this));
        yj0.a.i(true, this, "com/tencent/mm/pluginsdk/ui/preference/FMessageListView$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}

package tj5;

/* loaded from: classes2.dex */
public class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.search.FTSSearchView f419856d;

    public u(com.tencent.mm.ui.search.FTSSearchView fTSSearchView) {
        this.f419856d = fTSSearchView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/search/FTSSearchView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tj5.w wVar = this.f419856d.f209844p;
        if (wVar != null) {
            wVar.onClickBackBtn(view);
        }
        yj0.a.h(this, "com/tencent/mm/ui/search/FTSSearchView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

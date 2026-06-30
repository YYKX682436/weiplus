package tj5;

/* loaded from: classes8.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.search.FTSEditTextView f419845d;

    public j(com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView) {
        this.f419845d = fTSEditTextView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/search/FTSEditTextView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = view.getId() == com.tencent.mm.R.id.nvv ? 0 : view.getId() == com.tencent.mm.R.id.nvz ? 1 : view.getId() == com.tencent.mm.R.id.f487211nw3 ? 2 : -1;
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView = this.f419845d;
        tj5.n nVar = fTSEditTextView.E;
        if (nVar != null && i17 >= 0) {
            nVar.o3(i17, (tj5.x) ((java.util.ArrayList) fTSEditTextView.f209817h).get(i17));
        }
        yj0.a.h(this, "com/tencent/mm/ui/search/FTSEditTextView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

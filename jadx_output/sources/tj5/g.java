package tj5;

/* loaded from: classes8.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.search.FTSEditTextView f419842d;

    public g(com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView) {
        this.f419842d = fTSEditTextView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/search/FTSEditTextView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.search.FTSEditTextView fTSEditTextView = this.f419842d;
        tj5.l lVar = fTSEditTextView.B;
        if (lVar != null) {
            lVar.Y3(fTSEditTextView.f209831y);
        }
        yj0.a.h(this, "com/tencent/mm/ui/search/FTSEditTextView$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

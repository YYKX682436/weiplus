package db5;

/* loaded from: classes15.dex */
public class b4 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.MMListPopupWindow f228293d;

    public b4(com.tencent.mm.ui.base.MMListPopupWindow mMListPopupWindow, db5.w3 w3Var) {
        this.f228293d = mMListPopupWindow;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMListPopupWindow$PopupScrollListener", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        db5.y3 y3Var = this.f228293d.f197479i;
        yj0.a.h(this, "com/tencent/mm/ui/base/MMListPopupWindow$PopupScrollListener", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/MMListPopupWindow$PopupScrollListener", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 1) {
            com.tencent.mm.ui.base.MMListPopupWindow mMListPopupWindow = this.f228293d;
            if (!(mMListPopupWindow.f197477g.getInputMethodMode() == 2) && mMListPopupWindow.f197477g.getContentView() != null) {
                android.os.Handler handler = mMListPopupWindow.f197489s;
                db5.d4 d4Var = mMListPopupWindow.f197471a;
                handler.removeCallbacks(d4Var);
                d4Var.run();
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/MMListPopupWindow$PopupScrollListener", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}

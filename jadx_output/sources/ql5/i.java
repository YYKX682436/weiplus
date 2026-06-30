package ql5;

/* loaded from: classes3.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f364611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.listview.PullDownListView f364612e;

    public i(com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView, android.view.View view) {
        this.f364612e = pullDownListView;
        this.f364611d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.listview.PullDownListView pullDownListView = this.f364612e;
        if (pullDownListView.f212166v != null) {
            pullDownListView.f212158p = -r1.getWidth();
            pullDownListView.f212161q = pullDownListView.f212166v.getHeight();
            android.view.View view = pullDownListView.f212166v;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/widget/listview/PullDownListView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/widget/listview/PullDownListView$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f364611d.bringToFront();
    }
}

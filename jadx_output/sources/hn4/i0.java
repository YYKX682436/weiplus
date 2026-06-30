package hn4;

/* loaded from: classes15.dex */
public class i0 implements in4.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hn4.j0 f282576a;

    public i0(hn4.j0 j0Var) {
        this.f282576a = j0Var;
    }

    @Override // in4.a0
    public void a() {
        hn4.j0 j0Var = this.f282576a;
        android.view.View view = j0Var.f282582b.C1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$13$1", "onSucc", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$13$1", "onSucc", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = j0Var.f282582b.B1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$13$1", "onSucc", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$13$1", "onSucc", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // in4.a0
    public void onDismiss() {
        this.f282576a.f282582b.f175126J.k();
    }
}

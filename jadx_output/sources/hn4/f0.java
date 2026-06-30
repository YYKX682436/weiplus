package hn4;

/* loaded from: classes15.dex */
public class f0 implements in4.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hn4.g0 f282568a;

    public f0(hn4.g0 g0Var) {
        this.f282568a = g0Var;
    }

    @Override // in4.a0
    public void a() {
        hn4.g0 g0Var = this.f282568a;
        android.view.View view = g0Var.f282570b.C1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$11$1", "onSucc", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$11$1", "onSucc", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = g0Var.f282570b.B1;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$11$1", "onSucc", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/topstory/ui/video/list/TopStoryListVideoUI$11$1", "onSucc", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // in4.a0
    public void onDismiss() {
        this.f282568a.f282570b.f175126J.k();
    }
}

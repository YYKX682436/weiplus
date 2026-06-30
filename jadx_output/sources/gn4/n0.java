package gn4;

/* loaded from: classes15.dex */
public class n0 implements in4.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gn4.o0 f273642a;

    public n0(gn4.o0 o0Var) {
        this.f273642a = o0Var;
    }

    @Override // in4.a0
    public void a() {
        android.view.View view = this.f273642a.f273645b.f175162u;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$18$1", "onSucc", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/topstory/ui/video/fs/TopStoryFSVideoUI$18$1", "onSucc", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // in4.a0
    public void onDismiss() {
        gn4.o0 o0Var = this.f273642a;
        o0Var.f273645b.I.k();
        android.view.View decorView = o0Var.f273645b.getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 2 | 4096 | 4);
    }
}

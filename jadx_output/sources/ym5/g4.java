package ym5;

/* loaded from: classes10.dex */
public final class g4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.RefreshLoadMoreLayout f463342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f463343e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout, int i17) {
        super(0);
        this.f463342d = refreshLoadMoreLayout;
        this.f463343e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById;
        android.widget.TextView textView;
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = this.f463342d;
        android.view.View view = refreshLoadMoreLayout.f213435x;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishLoadMore$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishLoadMore$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = refreshLoadMoreLayout.f213435x;
        if (view2 != null && (textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.ili)) != null) {
            textView.setText(com.tencent.mm.R.string.f490468vx);
        }
        android.view.View view3 = refreshLoadMoreLayout.f213435x;
        if (view3 != null && (findViewById = view3.findViewById(com.tencent.mm.R.id.ilg)) != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishLoadMore$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/view/RefreshLoadMoreLayout$onFinishLoadMore$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ym5.s3 s3Var = new ym5.s3(-1);
        s3Var.f463523h = this.f463343e;
        ym5.q3 actionCallback = refreshLoadMoreLayout.getActionCallback();
        if (actionCallback != null) {
            actionCallback.c(s3Var);
        }
        return jz5.f0.f302826a;
    }
}

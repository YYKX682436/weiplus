package yf2;

/* loaded from: classes.dex */
public final class h2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.i2 f461710d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(yf2.i2 i2Var) {
        super(0);
        this.f461710d = i2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f461710d.f461722r;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLiveTopicCoverController$showEdit$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLiveTopicCoverController$showEdit$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f302826a;
    }
}

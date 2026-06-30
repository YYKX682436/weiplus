package mx0;

/* loaded from: classes.dex */
public final class t2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx0.v2 f332346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f332347e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(mx0.v2 v2Var, int i17) {
        super(0);
        this.f332346d = v2Var;
        this.f332347e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f332346d.f332391e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(this.f332347e));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/OpenAlbumPlugin$setVisibility$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/OpenAlbumPlugin$setVisibility$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f302826a;
    }
}

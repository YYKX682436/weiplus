package vg2;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.c f436464d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(vg2.c cVar) {
        super(0);
        this.f436464d = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f436464d.f436485c;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/BaseGiftWidget$adjustWidget$4", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/gift/widget/BaseGiftWidget$adjustWidget$4", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return jz5.f0.f302826a;
    }
}

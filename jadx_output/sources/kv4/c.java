package kv4;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f312689d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.view.View view) {
        super(0);
        this.f312689d = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f312689d.findViewById(com.tencent.mm.R.id.f485080tz4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/websearch/teach/base/box/FTSGlobalTeachHotSearchTitleViewHolder$refreshBtn$2", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/websearch/teach/base/box/FTSGlobalTeachHotSearchTitleViewHolder$refreshBtn$2", "invoke", "()Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = findViewById.findViewById(com.tencent.mm.R.id.uxs);
        if (findViewById2 != null) {
            pv4.b.d(findViewById2, 18.0f);
        }
        if (findViewById2 != null) {
            pv4.b.c(findViewById2, 18.0f);
        }
        return findViewById;
    }
}

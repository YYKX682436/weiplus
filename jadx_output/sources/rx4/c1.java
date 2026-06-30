package rx4;

/* loaded from: classes.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.h2 f401120d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(rx4.h2 h2Var) {
        super(0);
        this.f401120d = h2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rx4.h2 h2Var = this.f401120d;
        android.view.View findViewById = h2Var.findViewById(com.tencent.mm.R.id.vbs);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSTeachViewUIC$fillHotspotAndDrama$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSTeachViewUIC$fillHotspotAndDrama$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        h2Var.z7();
        return jz5.f0.f302826a;
    }
}

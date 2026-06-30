package v14;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v14.y f432589d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(v14.y yVar) {
        super(0);
        this.f432589d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        v14.y yVar = this.f432589d;
        yVar.getClass();
        java.lang.Object l17 = gm0.j1.u().c().l(5, null);
        java.lang.String str = l17 instanceof java.lang.String ? (java.lang.String) l17 : null;
        android.content.Intent intent = new android.content.Intent(yVar.getContext(), (java.lang.Class<?>) com.tencent.mm.ui.container.MMCommonActivity.class);
        pf5.j0.a(intent, com.tencent.mm.plugin.setting.ui.setting.hb.class);
        lk5.s.e(intent, true);
        intent.putExtra("BINDED_EMAIL", str);
        pf5.j0.a(intent, com.tencent.mm.plugin.setting.ui.setting.k8.class);
        android.app.Activity context = yVar.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(1);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/uic/SettingsUserInfoStatusUIC", "handleEmailVerifiedSuccess", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        return jz5.f0.f302826a;
    }
}

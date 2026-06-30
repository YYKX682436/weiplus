package z83;

/* loaded from: classes5.dex */
public final class c0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegSuccessUI f470734d;

    public c0(com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegSuccessUI kidsWatchRegSuccessUI) {
        this.f470734d = kidsWatchRegSuccessUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegSuccessUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object[] objArr = new java.lang.Object[1];
        com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegSuccessUI kidsWatchRegSuccessUI = this.f470734d;
        java.lang.String str = kidsWatchRegSuccessUI.f143179f;
        if (str == null) {
            kotlin.jvm.internal.o.o("openId");
            throw null;
        }
        objArr[0] = str;
        java.lang.String format = java.lang.String.format("/pages/home/home.html?scene=register&openid=%s", java.util.Arrays.copyOf(objArr, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchRegSuccessUI", "goWebUIBtn, path:".concat(format));
        a93.a aVar = a93.a.f2429a;
        androidx.appcompat.app.AppCompatActivity context = kidsWatchRegSuccessUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        aVar.a(context, "", true);
        androidx.appcompat.app.AppCompatActivity context2 = kidsWatchRegSuccessUI.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        aVar.b(context2, "wxaaff6b96fc2cd3c6", format, bb1.d.CTRL_INDEX, "2");
        yj0.a.h(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegSuccessUI$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

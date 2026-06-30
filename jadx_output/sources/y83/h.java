package y83;

/* loaded from: classes14.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginCardChooseUI f459988d;

    public h(com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginCardChooseUI kidsWatchLoginCardChooseUI) {
        this.f459988d = kidsWatchLoginCardChooseUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginCardChooseUI$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("KidsWatchLoginCardChooseUI", "click switch count button");
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginCardChooseUI kidsWatchLoginCardChooseUI = this.f459988d;
        java.lang.String str = kidsWatchLoginCardChooseUI.f143112d;
        if (str == null) {
            kotlin.jvm.internal.o.o("loginUrl");
            throw null;
        }
        intent.putExtra("intent.key.login.url", str);
        intent.putExtra("intent.key.device.name", kidsWatchLoginCardChooseUI.f143113e);
        intent.putExtra("intent.key.ok.session.list", kidsWatchLoginCardChooseUI.f143114f);
        intent.putExtra("intent.key.ok.reg.btn", kidsWatchLoginCardChooseUI.f143115g);
        intent.putExtra("intent.key.kids.cnt", kidsWatchLoginCardChooseUI.f143116h);
        intent.putExtra("intent.key.enter.login.first", 2);
        intent.putExtra("intent.key.need.show.syncmsg.btn", kidsWatchLoginCardChooseUI.f143117i);
        intent.setFlags(268435456);
        intent.setClass(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirst.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginCardChooseUI$initView$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginCardChooseUI$initView$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginCardChooseUI$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

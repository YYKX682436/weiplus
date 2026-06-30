package y83;

/* loaded from: classes14.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirst f459993d;

    public m(com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirst kidsWatchLoginFirst) {
        this.f459993d = kidsWatchLoginFirst;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirst$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchLoginFirst", "login button clicked");
        v83.b bVar = v83.b.f434080d;
        com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirst kidsWatchLoginFirst = this.f459993d;
        kidsWatchLoginFirst.f143126m = bVar;
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = kidsWatchLoginFirst.f143120d;
        if (str == null) {
            kotlin.jvm.internal.o.o("loginUrl");
            throw null;
        }
        intent.putExtra("intent.key.login.url", str);
        intent.putExtra("intent.key.device.name", kidsWatchLoginFirst.f143121e);
        intent.putExtra("intent.key.ok.session.list", kidsWatchLoginFirst.f143122f);
        intent.putExtra("intent.key.kids.cnt", kidsWatchLoginFirst.f143124h);
        intent.putExtra("intent.key.need.show.syncmsg.btn", kidsWatchLoginFirst.f143125i);
        intent.setFlags(268435456);
        intent.setClass(kidsWatchLoginFirst, com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirstChooseSceneUI.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirst$initView$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirst$initView$2", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirst$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package y83;

/* loaded from: classes14.dex */
public final class n implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirst f459994d;

    public n(com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirst kidsWatchLoginFirst) {
        this.f459994d = kidsWatchLoginFirst;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reg button clicked, isShowRegBtn:");
        com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirst kidsWatchLoginFirst = this.f459994d;
        sb6.append(kidsWatchLoginFirst.f143123g);
        com.tencent.mars.xlog.Log.i("MicroMsg.KidsWatchLoginFirst", sb6.toString());
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = kidsWatchLoginFirst.f143120d;
        if (str == null) {
            kotlin.jvm.internal.o.o("loginUrl");
            throw null;
        }
        intent.putExtra("intent.key.login.url", str);
        intent.putExtra("intent.key.device.name", kidsWatchLoginFirst.f143121e);
        intent.setFlags(268435456);
        intent.setClass(kidsWatchLoginFirst, com.tencent.mm.plugin.kidswatch.ui.reg.KidsWatchRegGetInfoUI.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirst$initView$3$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/kidswatch/ui/login/KidsWatchLoginFirst$initView$3$1", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        kidsWatchLoginFirst.f143126m = v83.b.f434081e;
        x83.g gVar = x83.g.f452568a;
        x83.c cVar = x83.c.f452552e;
        java.lang.String str2 = kidsWatchLoginFirst.f143120d;
        if (str2 != null) {
            gVar.a(cVar, str2, x83.e.f452562e, x83.d.f452557f, kidsWatchLoginFirst.f143124h, 0);
        } else {
            kotlin.jvm.internal.o.o("loginUrl");
            throw null;
        }
    }
}

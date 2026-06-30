package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class pb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.tb f161433d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(com.tencent.mm.plugin.setting.ui.setting.tb tbVar) {
        super(0);
        this.f161433d = tbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.setting.ui.setting.tb tbVar = this.f161433d;
        android.app.Activity context = tbVar.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.setting.ui.setting.hb hbVar = (com.tencent.mm.plugin.setting.ui.setting.hb) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.setting.ui.setting.hb.class);
        java.lang.String str = tbVar.f161570d;
        if (str == null) {
            str = "";
        }
        hbVar.getClass();
        hbVar.X6();
        android.content.Intent intent = new android.content.Intent(hbVar.getContext(), (java.lang.Class<?>) com.tencent.mm.ui.container.MMCommonActivity.class);
        intent.putExtra("change_bind_email", str);
        pf5.j0.a(intent, com.tencent.mm.plugin.setting.ui.setting.nb.class);
        pf5.j0.a(intent, com.tencent.mm.plugin.setting.ui.setting.hb.class);
        lk5.s.e(intent, true);
        android.app.Activity context2 = hbVar.getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsEmailCgiUIC", "changeEmailAddress", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context2, "com/tencent/mm/plugin/setting/ui/setting/SettingsEmailCgiUIC", "changeEmailAddress", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f302826a;
    }
}

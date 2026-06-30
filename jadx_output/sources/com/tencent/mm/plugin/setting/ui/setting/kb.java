package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class kb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.nb f161234d;

    public kb(com.tencent.mm.plugin.setting.ui.setting.nb nbVar) {
        this.f161234d = nbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsEmailEditUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.setting.ui.setting.nb nbVar = this.f161234d;
        if (com.tencent.mm.sdk.platformtools.t8.Y0(nbVar.T6().a().getText().toString())) {
            android.app.Activity context = nbVar.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.setting.ui.setting.hb.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ((com.tencent.mm.plugin.setting.ui.setting.hb) a17).W6(r26.n0.u0(nbVar.T6().a().getText().toString()).toString(), true);
        } else {
            nbVar.U6(nbVar.getString(com.tencent.mm.R.string.oh6));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsEmailEditUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

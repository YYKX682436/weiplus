package vw3;

/* loaded from: classes.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f441006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.CDNGroupKeyConfigUI f441007e;

    public k(android.widget.EditText editText, com.tencent.mm.plugin.repairer.ui.CDNGroupKeyConfigUI cDNGroupKeyConfigUI) {
        this.f441006d = editText;
        this.f441007e = cDNGroupKeyConfigUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/CDNGroupKeyConfigUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.text.Editable text = this.f441006d.getText();
        kotlin.jvm.internal.o.f(text, "getText(...)");
        com.tencent.mm.platformtools.Test$CDN.cdnSingleSignGroupKey = r26.n0.u0(text).toString();
        com.tencent.mm.plugin.repairer.ui.CDNGroupKeyConfigUI cDNGroupKeyConfigUI = this.f441007e;
        cDNGroupKeyConfigUI.d.edit().putString("cdnSingleSignGroupKey", com.tencent.mm.platformtools.Test$CDN.cdnSingleSignGroupKey).apply();
        dp.a.makeText((android.content.Context) cDNGroupKeyConfigUI, com.tencent.mm.R.string.f490480w9, 0).show();
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/CDNGroupKeyConfigUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

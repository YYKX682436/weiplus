package ts3;

/* loaded from: classes.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f421685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421686e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.readerapp.ui.ReaderAppUI f421687f;

    public n(com.tencent.mm.plugin.readerapp.ui.ReaderAppUI readerAppUI, org.json.JSONObject jSONObject, java.lang.String str) {
        this.f421687f = readerAppUI;
        this.f421685d = jSONObject;
        this.f421686e = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.readerapp.ui.ReaderAppUI readerAppUI = this.f421687f;
        readerAppUI.f155061i = 22;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15413, 22, "", "", "", "", "", 0, 0, readerAppUI.f155062m, this.f421685d.toString().replaceAll(",", ";"));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f421686e);
        intent.putExtra("geta8key_scene", 79);
        j45.l.j(readerAppUI, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

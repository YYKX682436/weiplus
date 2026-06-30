package os3;

/* loaded from: classes.dex */
public class i3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.PrepareBindXMailUI f348108d;

    public i3(com.tencent.mm.plugin.qqmail.ui.PrepareBindXMailUI prepareBindXMailUI) {
        this.f348108d = prepareBindXMailUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/PrepareBindXMailUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.qqmail.ui.PrepareBindXMailUI prepareBindXMailUI = this.f348108d;
        intent.putExtra("rawUrl", prepareBindXMailUI.f154923o);
        intent.putExtra("hardcode_jspermission", com.tencent.mm.protocal.JsapiPermissionWrapper.f192178h);
        intent.putExtra("hardcode_general_ctrl", com.tencent.mm.protocal.GeneralControlWrapper.f192175e);
        j45.l.n(prepareBindXMailUI, "webview", ".ui.tools.WebViewUI", intent, com.tencent.mm.plugin.appbrand.jsapi.audio.c0.CTRL_INDEX);
        yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/PrepareBindXMailUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

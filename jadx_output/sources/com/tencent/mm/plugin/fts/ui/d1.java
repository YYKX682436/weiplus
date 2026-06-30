package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes8.dex */
public class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI f138038d;

    public d1(com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI) {
        this.f138038d = fTSBaseVoiceSearchUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.fts.ui.FTSBaseVoiceSearchUI fTSBaseVoiceSearchUI = this.f138038d;
        androidx.appcompat.app.AppCompatActivity context = fTSBaseVoiceSearchUI.getContext();
        java.lang.String query = fTSBaseVoiceSearchUI.b7();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(query, "query");
        java.lang.String str = "https://search.weixin.qq.com/cgi-bin/newsearchweb/userclientjump?scene=3&path=page%2Fsearch%2Ffeedback&feedbackType=4&taskId=bfmVV8tHh7c9dPgSFL38kZ&tplId=B9deHvCoSNg4K7MWHPhFEb&clientType=2048&subType=4&query=" + java.net.URLEncoder.encode(query, com.tencent.mapsdk.internal.rv.f51270c) + "&relatedWords=" + java.net.URLEncoder.encode(com.tencent.mm.plugin.fts.ui.c3.f138031b, com.tencent.mapsdk.internal.rv.f51270c);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSBaseVoiceSearchUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

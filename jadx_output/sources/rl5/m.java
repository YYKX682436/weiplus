package rl5;

/* loaded from: classes8.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f397327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rl5.r f397328e;

    public m(rl5.r rVar, android.view.View view) {
        this.f397328e = rVar;
        this.f397327d = view;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/menu/MMPopupMenu$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rl5.r rVar = this.f397328e;
        db5.q4 q4Var = rVar.f397353w;
        if (q4Var != null) {
            com.tencent.mm.plugin.fts.ui.z2 z2Var = (com.tencent.mm.plugin.fts.ui.z2) q4Var;
            android.content.Context context = z2Var.f138394a.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.lang.String query = z2Var.f138395b;
            kotlin.jvm.internal.o.g(query, "query");
            java.lang.String str = "https://search.weixin.qq.com/cgi-bin/newsearchweb/userclientjump?scene=3&path=page%2Fsearch%2Ffeedback&feedbackType=4&taskId=bfmVV8tHh7c9dPgSFL38kZ&tplId=B9deHvCoSNg4K7MWHPhFEb&clientType=2048&subType=4&query=" + java.net.URLEncoder.encode(query, com.tencent.mapsdk.internal.rv.f51270c) + "&relatedWords=" + java.net.URLEncoder.encode(com.tencent.mm.plugin.fts.ui.c3.f138031b, com.tencent.mapsdk.internal.rv.f51270c);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        }
        rVar.f397343n.dismiss();
        yj0.a.h(this, "com/tencent/mm/ui/widget/menu/MMPopupMenu$9", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

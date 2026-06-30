package dy;

/* loaded from: classes5.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dy.d f244523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f244524e;

    public b(dy.d dVar, android.content.Context context) {
        this.f244523d = dVar;
        this.f244524e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/chatbot/flutter/platformview/scenes/ChatbotMapSceneView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dy.d dVar = this.f244523d;
        java.lang.String b17 = dVar.b();
        if (b17 == null) {
            b17 = "n/a";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatbotMapSceneView", "map tapped itemId=" + dVar.f244530d.f224672d + " coords=" + b17);
        android.widget.Toast.makeText(this.f244524e, "map tapped: ".concat(b17), 0).show();
        yj0.a.h(this, "com/tencent/mm/feature/chatbot/flutter/platformview/scenes/ChatbotMapSceneView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

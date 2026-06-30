package yx;

/* loaded from: classes3.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f467003d;

    public a0(android.content.Context context) {
        this.f467003d = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/chatbot/brand/ui/ChatBotBrandScreenKt$ChatBotBrandScreen$2$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.MMActivity b17 = ly.g.b(this.f467003d);
        if (b17 != null) {
            b17.finish();
        }
        yj0.a.h(this, "com/tencent/mm/feature/chatbot/brand/ui/ChatBotBrandScreenKt$ChatBotBrandScreen$2$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

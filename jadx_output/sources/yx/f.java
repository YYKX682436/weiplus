package yx;

/* loaded from: classes3.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.chatbot.brand.ui.CBTBrandLiveActivity f467015d;

    public f(com.tencent.mm.feature.chatbot.brand.ui.CBTBrandLiveActivity cBTBrandLiveActivity) {
        this.f467015d = cBTBrandLiveActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/chatbot/brand/ui/CBTBrandLiveActivity$setView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f467015d.finish();
        yj0.a.h(this, "com/tencent/mm/feature/chatbot/brand/ui/CBTBrandLiveActivity$setView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

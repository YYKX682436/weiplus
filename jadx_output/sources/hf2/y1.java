package hf2;

/* loaded from: classes10.dex */
public final class y1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.b2 f281211d;

    public y1(hf2.b2 b2Var) {
        this.f281211d = b2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerTextOptionWidget$show$2$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hf2.b2 b2Var = this.f281211d;
        b2Var.f("custom_close", true);
        b2Var.f281006a.f7().c("custom_close", null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerTextOptionWidget$show$2$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

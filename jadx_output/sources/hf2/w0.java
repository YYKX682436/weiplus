package hf2;

/* loaded from: classes10.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.y0 f281179d;

    public w0(hf2.y0 y0Var) {
        this.f281179d = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerMaasWidget$showMaasTextInput$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hf2.y0 y0Var = this.f281179d;
        y0Var.c(y0Var.f281205f);
        com.tencent.mm.plugin.finder.live.util.y.o(y0Var.f281200a, null, null, new hf2.v0(y0Var, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerMaasWidget$showMaasTextInput$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

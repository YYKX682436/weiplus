package hf2;

/* loaded from: classes5.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.x f281080d;

    public i(hf2.x xVar) {
        this.f281080d = xVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerController$prepareContainer$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i(this.f281080d.f281181m, "onClick");
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/anchorsticker/LiveAnchorStickerController$prepareContainer$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

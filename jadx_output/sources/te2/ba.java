package te2;

/* loaded from: classes5.dex */
public final class ba implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.fa f417905d;

    public ba(te2.fa faVar) {
        this.f417905d = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        te2.fa faVar = this.f417905d;
        int c17 = com.tencent.mm.ui.bl.c(faVar.f418008d.getContext());
        com.tencent.mars.xlog.Log.i(faVar.f418012h, "navigationBarHeight:" + c17);
        android.view.ViewGroup.LayoutParams layoutParams = faVar.f418008d.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += c17;
    }
}

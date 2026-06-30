package re5;

/* loaded from: classes12.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re5.d0 f394605d;

    public z(re5.d0 d0Var) {
        this.f394605d = d0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/uic/video/LocalVideoPlayerOperationLayer$attach$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fg3.p pVar = (fg3.p) this.f394605d.g(fg3.p.class);
        if (pVar != null) {
            ((fg3.v) pVar).b0();
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/uic/video/LocalVideoPlayerOperationLayer$attach$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

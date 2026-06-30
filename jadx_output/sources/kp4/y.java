package kp4;

/* loaded from: classes5.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kp4.z f311157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp4.b0 f311158e;

    public y(kp4.z zVar, kp4.b0 b0Var) {
        this.f311157d = zVar;
        this.f311158e = b0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/thumb/MediaThumbAdapter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kp4.z zVar = this.f311157d;
        int i17 = zVar.f311164g;
        zVar.f311164g = this.f311158e.getAdapterPosition();
        java.lang.String str = zVar.f311163f;
        if (i17 != zVar.f311164g) {
            zVar.notifyItemChanged(i17);
            zVar.notifyItemChanged(zVar.f311164g);
            ((kp4.q0) zVar.f311162e).a((bg0.y) zVar.f311161d.get(zVar.f311164g), zVar.f311164g);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/thumb/MediaThumbAdapter$onCreateViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package kv4;

/* loaded from: classes12.dex */
public final class e implements jv4.n {

    /* renamed from: a, reason: collision with root package name */
    public final kv4.g f312694a;

    /* renamed from: b, reason: collision with root package name */
    public final jv4.m f312695b;

    public e(kv4.g gapSize) {
        kotlin.jvm.internal.o.g(gapSize, "gapSize");
        this.f312694a = gapSize;
        this.f312695b = jv4.m.f302255u;
    }

    @Override // jv4.n
    public void c(androidx.recyclerview.widget.k3 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View view = ((qv4.s0) holder).itemView;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kv4.g gVar = this.f312694a;
        if (layoutParams == null) {
            view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, gVar.f312700a));
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams2.height = gVar.f312700a;
        view.setLayoutParams(layoutParams2);
    }

    @Override // jv4.n
    public jv4.m getType() {
        return this.f312695b;
    }

    @Override // nv4.g
    public java.lang.String v() {
        return "gap-" + this.f312694a.f312700a;
    }

    @Override // nv4.g
    public void w() {
    }
}

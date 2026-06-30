package m31;

/* loaded from: classes9.dex */
public final class x0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m31.q0 f323231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m31.y0 f323232e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f323233f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.k3 f323234g;

    public x0(m31.q0 q0Var, m31.y0 y0Var, int i17, androidx.recyclerview.widget.k3 k3Var) {
        this.f323231d = q0Var;
        this.f323232e = y0Var;
        this.f323233f = i17;
        this.f323234g = k3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$ItemAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        m31.q0 q0Var = this.f323231d;
        ((m31.z0) q0Var).f323242e = !((m31.z0) q0Var).f323242e;
        m31.y0 y0Var = this.f323232e;
        int i17 = this.f323233f;
        y0Var.x(i17, ((m31.z0) q0Var).f323242e, true, (m31.s0) this.f323234g, (m31.q0) y0Var.f323237d.get(i17));
        yj0.a.h(this, "com/tencent/mm/msgsubscription/ui/SubscribeMsgRequestDialog$ItemAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package oi4;

/* loaded from: classes11.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kj4.c f345636e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ oi4.j f345637f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f345638g;

    public h(java.lang.String str, kj4.c cVar, oi4.j jVar, in5.s0 s0Var) {
        this.f345635d = str;
        this.f345636e = cVar;
        this.f345637f = jVar;
        this.f345638g = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/convert/like/LikeItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        si4.a G = ai4.m0.f5173a.G();
        java.lang.String statusId = this.f345635d;
        kotlin.jvm.internal.o.f(statusId, "$statusId");
        mj4.h t17 = G.t(statusId);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("item onClick ");
        sb6.append(statusId);
        sb6.append(", ");
        sb6.append(this.f345636e.f308454d.field_LikeId);
        sb6.append(", exist=");
        sb6.append(t17 != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.LikeItemConvert", sb6.toString());
        oi4.j jVar = this.f345637f;
        if (t17 != null) {
            java.lang.String a17 = en1.a.a();
            kotlin.jvm.internal.o.f(a17, "username(...)");
            jVar.n(a17, t17, null);
        } else {
            android.content.Context context = this.f345638g.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            jVar.p(context, statusId, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/convert/like/LikeItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

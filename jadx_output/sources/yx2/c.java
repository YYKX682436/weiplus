package yx2;

/* loaded from: classes8.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f467832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f467833e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yx2.f f467834f;

    public c(com.tencent.mm.protocal.protobuf.FinderObject finderObject, ya2.b2 b2Var, yx2.f fVar) {
        this.f467832d = finderObject;
        this.f467833e = b2Var;
        this.f467834f = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String w07;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f467832d;
        r45.f1 b17 = hc2.g0.b(finderObject);
        if (b17 == null || (w07 = b17.getString(0)) == null) {
            ya2.b2 b2Var = this.f467833e;
            w07 = b2Var != null ? b2Var.w0() : finderObject.getNickname();
        }
        yx2.f fVar = this.f467834f;
        android.widget.TextView textView = fVar.f467843b;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = fVar.f467843b.getContext();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, w07));
    }
}

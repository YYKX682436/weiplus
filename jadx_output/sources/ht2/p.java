package ht2;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.r6 f284880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ht2.y0 f284881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f284882f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(zy2.r6 r6Var, ht2.y0 y0Var, yz5.l lVar) {
        super(2);
        this.f284880d = r6Var;
        this.f284881e = y0Var;
        this.f284882f = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.widget.TextView textView = (android.widget.TextView) obj;
        com.tencent.mm.ui.widget.imageview.WeImageView floatIv = (com.tencent.mm.ui.widget.imageview.WeImageView) obj2;
        kotlin.jvm.internal.o.g(floatIv, "floatIv");
        if (textView != null) {
            textView.setAlpha(0.0f);
        }
        zy2.r6 r6Var = this.f284880d;
        r6Var.getClass();
        this.f284881e.Di(floatIv, r6Var);
        this.f284882f.invoke(uw2.h0.f(uw2.h0.f431674a, floatIv, 1.4f, r6Var.f477559j, true, 0.0f, 0L, 0L, 0L, 240, null));
        return jz5.f0.f302826a;
    }
}

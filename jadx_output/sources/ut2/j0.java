package ut2;

/* loaded from: classes3.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.k0 f430928d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(ut2.k0 k0Var) {
        super(0);
        this.f430928d = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = (android.widget.TextView) this.f430928d.f430958b.findViewById(com.tencent.mm.R.id.p3m);
        kotlin.jvm.internal.o.d(textView);
        java.lang.Float dpSize = java.lang.Float.valueOf(14.0f);
        kotlin.jvm.internal.o.g(dpSize, "dpSize");
        textView.setTextSize(1, ((dpSize.floatValue() * 1.0f) * j65.f.g()) / 400);
        return textView;
    }
}

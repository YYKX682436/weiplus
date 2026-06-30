package tj3;

/* loaded from: classes8.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tj3.i0 f419811d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(tj3.i0 i0Var) {
        super(0);
        this.f419811d = i0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = (android.widget.TextView) this.f419811d.findViewById(com.tencent.mm.R.id.a__);
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        textView.setVisibility(z65.c.a() ? 0 : 8);
        return textView;
    }
}

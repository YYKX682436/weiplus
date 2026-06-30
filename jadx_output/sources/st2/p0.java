package st2;

/* loaded from: classes3.dex */
public final class p0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412412d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(st2.h1 h1Var) {
        super(0);
        this.f412412d = h1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        st2.h1 h1Var = this.f412412d;
        android.widget.TextView textView = (android.widget.TextView) h1Var.f412333d.findViewById(com.tencent.mm.R.id.flu);
        textView.setOnClickListener(h1Var);
        return textView;
    }
}

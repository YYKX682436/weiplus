package vg2;

/* loaded from: classes3.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.r1 f436530d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(vg2.r1 r1Var) {
        super(0);
        this.f436530d = r1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        vg2.r1 r1Var = this.f436530d;
        android.widget.TextView textView = (android.widget.TextView) r1Var.f436564e.findViewById(com.tencent.mm.R.id.cou);
        textView.setOnClickListener(new vg2.i1(r1Var, textView));
        return textView;
    }
}

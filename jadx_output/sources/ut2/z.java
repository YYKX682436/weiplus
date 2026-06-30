package ut2;

/* loaded from: classes3.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.k0 f431165d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ut2.k0 k0Var) {
        super(0);
        this.f431165d = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = (android.widget.TextView) this.f431165d.f430958b.findViewById(com.tencent.mm.R.id.uwx);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        return textView;
    }
}

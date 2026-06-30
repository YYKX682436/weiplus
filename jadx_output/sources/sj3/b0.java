package sj3;

/* loaded from: classes4.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.a1 f408438d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(sj3.a1 a1Var) {
        super(0);
        this.f408438d = a1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View inflate = this.f408438d.f408393d.getLayoutInflater().inflate(com.tencent.mm.R.layout.f489312c34, (android.view.ViewGroup) null, false);
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.widget.RelativeLayout");
        return (android.widget.RelativeLayout) inflate;
    }
}

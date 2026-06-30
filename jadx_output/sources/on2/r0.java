package on2;

/* loaded from: classes3.dex */
public final class r0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on2.v0 f346999d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(on2.v0 v0Var) {
        super(0);
        this.f346999d = v0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = (android.widget.TextView) this.f346999d.findViewById(com.tencent.mm.R.id.f8b);
        d92.f fVar = d92.f.f227470a;
        android.content.Context context = textView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        d92.f.a(fVar, context, textView, 14.0f, 0.0f, 8, null);
        return textView;
    }
}

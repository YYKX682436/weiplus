package ut2;

/* loaded from: classes2.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f430915d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(android.view.View view) {
        super(0);
        this.f430915d = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f430915d;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.l7n);
        d92.f fVar = d92.f.f227470a;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        d92.f.a(fVar, context, textView, 10.0f, 0.0f, 8, null);
        return textView;
    }
}

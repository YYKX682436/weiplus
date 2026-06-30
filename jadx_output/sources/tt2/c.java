package tt2;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f421842d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.view.View view) {
        super(0);
        this.f421842d = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f421842d;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.l7n);
        d92.f fVar = d92.f.f227470a;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        d92.f.a(fVar, context, textView, 10.0f, 0.0f, 8, null);
        return textView;
    }
}

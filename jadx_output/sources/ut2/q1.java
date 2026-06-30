package ut2;

/* loaded from: classes.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f431054d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(android.view.View view) {
        super(0);
        this.f431054d = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f431054d.findViewById(com.tencent.mm.R.id.rra);
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        textView.setTextSize(1, 12.0f);
        com.tencent.mm.ui.fk.a(textView);
        kotlin.jvm.internal.o.f(findViewById, "apply(...)");
        return (android.widget.TextView) findViewById;
    }
}

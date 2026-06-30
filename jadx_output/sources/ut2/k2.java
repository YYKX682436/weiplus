package ut2;

/* loaded from: classes3.dex */
public final class k2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f430975d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(android.view.View view) {
        super(0);
        this.f430975d = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = (android.widget.TextView) this.f430975d.findViewById(com.tencent.mm.R.id.l7o);
        textView.setTextSize(1, 12.0f);
        return textView;
    }
}

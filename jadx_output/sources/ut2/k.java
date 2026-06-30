package ut2;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f430956d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(android.view.View view) {
        super(0);
        this.f430956d = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = (android.widget.TextView) this.f430956d.findViewById(com.tencent.mm.R.id.uv8);
        textView.setTextSize(1, 14.0f);
        return textView;
    }
}

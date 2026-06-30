package ut2;

/* loaded from: classes3.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f430816d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(android.view.View view) {
        super(0);
        this.f430816d = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = (android.widget.TextView) this.f430816d.findViewById(com.tencent.mm.R.id.r0c);
        textView.setTextSize(1, 14.0f);
        textView.post(new d92.b(new d92.c(textView, true)));
        return textView;
    }
}

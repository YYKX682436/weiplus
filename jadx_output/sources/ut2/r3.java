package ut2;

/* loaded from: classes3.dex */
public final class r3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f431063d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(android.view.View view) {
        super(0);
        this.f431063d = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = (android.widget.TextView) this.f431063d.findViewById(com.tencent.mm.R.id.f486435s14);
        textView.setTextSize(1, 14.0f);
        zl2.r4.c3(zl2.r4.f473950a, textView, 0, 0, 6, null);
        return textView;
    }
}

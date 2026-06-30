package ut2;

/* loaded from: classes3.dex */
public final class q3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f431056d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(android.view.View view) {
        super(0);
        this.f431056d = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = (android.widget.TextView) this.f431056d.findViewById(com.tencent.mm.R.id.uum);
        textView.setTextSize(1, 14.0f);
        zl2.r4.c3(zl2.r4.f473950a, textView, 0, 0, 6, null);
        return textView;
    }
}

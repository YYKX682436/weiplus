package rt1;

/* loaded from: classes7.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rt1.l f399425d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(rt1.l lVar) {
        super(0);
        this.f399425d = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        for (int i17 = 0; i17 < 7; i17++) {
            android.widget.TextView[] textViewArr = this.f399425d.f399449f;
            if (textViewArr == null) {
                kotlin.jvm.internal.o.o("charViews");
                throw null;
            }
            android.widget.TextView textView = textViewArr[i17];
            kotlin.jvm.internal.o.d(textView);
            java.lang.CharSequence text = textView.getText();
            if (text == null || text.length() == 0) {
                return java.lang.Boolean.FALSE;
            }
        }
        return java.lang.Boolean.TRUE;
    }
}

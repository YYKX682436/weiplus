package ej4;

/* loaded from: classes4.dex */
public final class v extends ej4.r {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f253383d;

    /* renamed from: e, reason: collision with root package name */
    public final bi4.d f253384e;

    /* renamed from: f, reason: collision with root package name */
    public final bi4.c f253385f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.String userName, android.widget.TextView iconTV, bi4.d iconType, bi4.c iconScene) {
        super(iconTV, userName, null, 4, null);
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(iconTV, "iconTV");
        kotlin.jvm.internal.o.g(iconType, "iconType");
        kotlin.jvm.internal.o.g(iconScene, "iconScene");
        this.f253383d = userName;
        this.f253384e = iconType;
        this.f253385f = iconScene;
        b();
    }

    @Override // ej4.r
    public void b() {
        java.lang.Object obj = a().get();
        android.widget.TextView textView = obj instanceof android.widget.TextView ? (android.widget.TextView) obj : null;
        if (textView == null) {
            return;
        }
        if (this.f253385f == bi4.c.SNS_FEED) {
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, kotlinx.coroutines.q1.f310568a, null, new ej4.u(textView, this, null), 2, null);
            return;
        }
        java.lang.CharSequence O = bk4.i.a().O(textView, this.f253374a, textView.getText(), i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 20), this.f253384e, this.f253385f);
        if (O == null || kotlin.jvm.internal.o.b(textView.getText(), O)) {
            return;
        }
        textView.setText(O);
    }
}

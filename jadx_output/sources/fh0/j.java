package fh0;

/* loaded from: classes5.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f262529d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(java.lang.String str) {
        super(0);
        this.f262529d = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fh0.a aVar = fh0.k.f262531b;
        if (aVar != null) {
            java.lang.String text = this.f262529d;
            kotlin.jvm.internal.o.g(text, "text");
            android.widget.TextView textView = aVar.f262510f;
            if (text.length() == 0) {
                text = "waiting...";
            }
            textView.setText(text);
        }
        return jz5.f0.f302826a;
    }
}

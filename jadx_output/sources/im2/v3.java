package im2;

/* loaded from: classes.dex */
public final class v3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f292581d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f292581d = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = (android.widget.TextView) this.f292581d.findViewById(com.tencent.mm.R.id.fex);
        kotlin.jvm.internal.o.d(textView);
        com.tencent.mm.ui.fk.a(textView);
        return textView;
    }
}

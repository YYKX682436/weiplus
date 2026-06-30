package la5;

/* loaded from: classes.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final la5.r f317638d = new la5.r();

    public r() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(((android.widget.TextView) it.findViewById(com.tencent.mm.R.id.obn)).getText().toString().length() == 0);
    }
}

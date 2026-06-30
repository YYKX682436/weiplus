package d92;

/* loaded from: classes.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final d92.o0 f227497d = new d92.o0();

    public o0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        kotlin.jvm.internal.o.g(view, "view");
        java.lang.String string = view.getContext().getString(com.tencent.mm.R.string.e59, ((android.widget.EditText) view.findViewById(com.tencent.mm.R.id.icr)).getText());
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}

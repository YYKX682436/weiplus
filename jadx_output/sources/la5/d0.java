package la5;

/* loaded from: classes.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ la5.l0 f317611d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(la5.l0 l0Var) {
        super(1);
        this.f317611d = l0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String obj2 = ((android.widget.TextView) it.findViewById(com.tencent.mm.R.id.obn)).getText().toString();
        android.view.View findViewById = it.findViewById(com.tencent.mm.R.id.f486060k10);
        la5.l0 l0Var = this.f317611d;
        java.lang.String string = l0Var.getString(com.tencent.mm.R.string.f489815cj);
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = obj2;
        objArr[1] = findViewById.getVisibility() == 0 ? l0Var.getString(com.tencent.mm.R.string.blb) : "";
        java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(objArr, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }
}

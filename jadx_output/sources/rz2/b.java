package rz2;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rz2.e f401797d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(rz2.e eVar) {
        super(1);
        this.f401797d = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        rz2.e eVar = this.f401797d;
        java.lang.String str = eVar.f401800d;
        boolean z18 = it instanceof android.widget.TextView;
        android.widget.TextView textView = z18 ? (android.widget.TextView) it : null;
        if (kotlin.jvm.internal.o.b(str, java.lang.String.valueOf(textView != null ? textView.getText() : null))) {
            z17 = false;
        } else {
            android.widget.TextView textView2 = z18 ? (android.widget.TextView) it : null;
            eVar.f401800d = java.lang.String.valueOf(textView2 != null ? textView2.getText() : null);
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}

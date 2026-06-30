package or4;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or4.e f347698d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(or4.e eVar) {
        super(1);
        this.f347698d = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.CharSequence text = ((android.widget.TextView) it.findViewById(com.tencent.mm.R.id.ivz)).getText();
        if (((android.widget.ImageView) it.findViewById(com.tencent.mm.R.id.ivy)).getVisibility() != 0) {
            return java.lang.String.valueOf(text);
        }
        return ((java.lang.Object) text) + ',' + this.f347698d.getString(com.tencent.mm.R.string.kr6);
    }
}

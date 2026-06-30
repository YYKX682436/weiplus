package n14;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n14.g f334146d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n14.g gVar) {
        super(1);
        this.f334146d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object tag = ((android.widget.TextView) it.findViewById(com.tencent.mm.R.id.ojr)).getTag(com.tencent.mm.R.id.mnv);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        int intValue = num != null ? num.intValue() : -1;
        n14.g gVar = this.f334146d;
        if (intValue == 1) {
            java.lang.String string = gVar.getContext().getString(com.tencent.mm.R.string.f489845dd);
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        if (intValue != 2) {
            return ((android.widget.TextView) it.findViewById(com.tencent.mm.R.id.ojw)).getText().toString();
        }
        java.lang.String string2 = gVar.getContext().getString(com.tencent.mm.R.string.boc);
        kotlin.jvm.internal.o.d(string2);
        return string2;
    }
}

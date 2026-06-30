package ht3;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht3.g f284945d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ht3.g gVar) {
        super(1);
        this.f284945d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object tag = it.getTag(com.tencent.mm.R.id.e7e);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        int intValue = num != null ? num.intValue() : 0;
        java.lang.Object tag2 = it.getTag(com.tencent.mm.R.id.e5x);
        java.lang.Boolean bool = tag2 instanceof java.lang.Boolean ? (java.lang.Boolean) tag2 : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        ht3.g gVar = this.f284945d;
        if (booleanValue) {
            java.lang.String string = gVar.getContext().getString(com.tencent.mm.R.string.f1k, java.lang.Integer.valueOf(intValue));
            kotlin.jvm.internal.o.d(string);
            return string;
        }
        java.lang.String string2 = gVar.getContext().getString(com.tencent.mm.R.string.f5y);
        kotlin.jvm.internal.o.d(string2);
        return string2;
    }
}

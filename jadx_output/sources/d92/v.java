package d92;

/* loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f227511d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(android.content.Context context) {
        super(1);
        this.f227511d = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        kotlin.jvm.internal.o.g(view, "view");
        e92.a aVar = e92.b.f250347d;
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.rl_);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        android.content.Context context = this.f227511d;
        if (num == null) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.mqa);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return string;
        }
        long intValue = num.intValue() / 60;
        long intValue2 = num.intValue() % 60;
        if (intValue == 0) {
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.mqc, java.lang.Long.valueOf(intValue2));
            kotlin.jvm.internal.o.d(string2);
            return string2;
        }
        java.lang.String string3 = context.getString(com.tencent.mm.R.string.mqb, java.lang.Long.valueOf(intValue), java.lang.Long.valueOf(intValue2));
        kotlin.jvm.internal.o.d(string3);
        return string3;
    }
}

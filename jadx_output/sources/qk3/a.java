package qk3;

/* loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk3.c f364436d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qk3.c cVar) {
        super(1);
        this.f364436d = cVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String obj2 = ((android.widget.TextView) it.findViewById(com.tencent.mm.R.id.jvj)).getText().toString();
        java.lang.String obj3 = ((android.widget.TextView) it.findViewById(com.tencent.mm.R.id.jvl)).getText().toString();
        java.lang.Object tag = it.getTag(com.tencent.mm.R.id.jxl);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        int intValue = num != null ? num.intValue() : 0;
        qk3.c cVar = this.f364436d;
        java.lang.String format = java.lang.String.format(cVar.getString(com.tencent.mm.R.string.h3g), java.util.Arrays.copyOf(new java.lang.Object[]{cVar.O6(intValue), obj3, obj2}, 3));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }
}

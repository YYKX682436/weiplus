package ht3;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht3.l f284953d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ht3.l lVar) {
        super(1);
        this.f284953d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.String r17 = i65.a.r(this.f284953d.getActivity(), com.tencent.mm.R.string.g_);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        java.lang.String format = java.lang.String.format(r17, java.util.Arrays.copyOf(new java.lang.Object[]{it.getTag(com.tencent.mm.R.id.f482773nl)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }
}

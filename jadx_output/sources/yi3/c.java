package yi3;

/* loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yi3.d f462599d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yi3.d dVar) {
        super(1);
        this.f462599d = dVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object parent = it.getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        java.lang.String format = java.lang.String.format(this.f462599d.getString(com.tencent.mm.R.string.f492582h13), java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.String.valueOf(view != null ? view.getTag(com.tencent.mm.R.id.nwv) : null)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }
}

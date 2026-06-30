package o4;

/* loaded from: classes5.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final o4.i f342812d = new o4.i();

    public i() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        kotlin.jvm.internal.o.g(view, "view");
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.p29);
        if (tag instanceof o4.g) {
            return (o4.g) tag;
        }
        return null;
    }
}

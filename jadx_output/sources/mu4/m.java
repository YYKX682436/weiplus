package mu4;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final mu4.m f331433d = new mu4.m();

    public m() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (!(obj instanceof java.lang.String)) {
            return obj instanceof java.lang.Number ? ((java.lang.Number) obj).toString() : "null";
        }
        return "'" + obj + '\'';
    }
}

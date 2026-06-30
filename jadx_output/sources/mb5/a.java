package mb5;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f325492b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Set f325493a;

    static {
        java.util.Set e17 = kz5.p1.e(486539313, 318767153, 39, 23, 13, 33);
        if (j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigDiffVideo()) == 0) {
            e17.add(43);
        }
        if (j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigDiffImg()) == 0) {
            e17.add(3);
        }
        f325492b = e17;
    }

    public a(java.util.Set noCompareSet) {
        kotlin.jvm.internal.o.g(noCompareSet, "noCompareSet");
        this.f325493a = noCompareSet;
    }

    public java.lang.String toString() {
        return this.f325493a.toString();
    }
}

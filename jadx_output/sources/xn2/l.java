package xn2;

/* loaded from: classes.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final xn2.l f455524d = new xn2.l();

    public l() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        long longValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.N7).getValue()).r()).longValue();
        if (longValue < 0 || longValue > 100) {
            longValue = 30;
        }
        return java.lang.Float.valueOf(((float) longValue) / 100.0f);
    }
}

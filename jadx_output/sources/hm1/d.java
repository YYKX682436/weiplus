package hm1;

/* loaded from: classes7.dex */
public final class d implements gg.d {
    public static final hm1.d INSTANCE = new hm1.d();

    private d() {
    }

    public static final hm1.d getInstance() {
        return INSTANCE;
    }

    @Override // gg.d
    public hm1.c createClientProxy() {
        return new hm1.c();
    }
}

package dc;

/* loaded from: classes16.dex */
public enum q {
    OBJECT(2, 0),
    /* JADX INFO: Fake field, exist only in values array */
    BOOLEAN(4, 1),
    CHAR(5, 2),
    /* JADX INFO: Fake field, exist only in values array */
    FLOAT(6, 4),
    /* JADX INFO: Fake field, exist only in values array */
    DOUBLE(7, 8),
    BYTE(8, 1),
    /* JADX INFO: Fake field, exist only in values array */
    SHORT(9, 2),
    /* JADX INFO: Fake field, exist only in values array */
    INT(10, 4),
    /* JADX INFO: Fake field, exist only in values array */
    LONG(11, 8);


    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Map f228670i;

    /* renamed from: d, reason: collision with root package name */
    public final int f228672d;

    /* renamed from: e, reason: collision with root package name */
    public final int f228673e;

    static {
        int i17 = cc.h0.f40380a;
        f228670i = new java.util.HashMap();
        for (dc.q qVar : values()) {
            ((java.util.HashMap) f228670i).put(java.lang.Integer.valueOf(qVar.f228672d), qVar);
        }
    }

    q(int i17, int i18) {
        this.f228672d = i17;
        this.f228673e = i18;
    }

    public static dc.q a(int i17) {
        return (dc.q) ((java.util.HashMap) f228670i).get(java.lang.Integer.valueOf(i17));
    }
}

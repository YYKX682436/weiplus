package zi;

/* loaded from: classes15.dex */
public enum c {
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT(2, 0),
    /* JADX INFO: Fake field, exist only in values array */
    BOOLEAN(4, 1),
    /* JADX INFO: Fake field, exist only in values array */
    CHAR(5, 2),
    /* JADX INFO: Fake field, exist only in values array */
    FLOAT(6, 4),
    /* JADX INFO: Fake field, exist only in values array */
    DOUBLE(7, 8),
    /* JADX INFO: Fake field, exist only in values array */
    BYTE(8, 1),
    /* JADX INFO: Fake field, exist only in values array */
    SHORT(9, 2),
    /* JADX INFO: Fake field, exist only in values array */
    INT(10, 4),
    /* JADX INFO: Fake field, exist only in values array */
    LONG(11, 8);


    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f473077f = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final int f473079d;

    /* renamed from: e, reason: collision with root package name */
    public final int f473080e;

    static {
        for (zi.c cVar : values()) {
            ((java.util.HashMap) f473077f).put(java.lang.Integer.valueOf(cVar.f473079d), cVar);
        }
    }

    c(int i17, int i18) {
        this.f473079d = i17;
        this.f473080e = i18;
    }

    public static zi.c a(int i17) {
        return (zi.c) ((java.util.HashMap) f473077f).get(java.lang.Integer.valueOf(i17));
    }
}

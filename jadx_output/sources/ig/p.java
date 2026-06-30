package ig;

/* loaded from: classes16.dex */
public enum p implements com.google.protobuf.p6 {
    RECOMMEND(1),
    TEMPLATE(2),
    NOT_FOUND(3),
    OTHERS(100);


    /* renamed from: d, reason: collision with root package name */
    public final int f291285d;

    static {
        values();
    }

    p(int i17) {
        this.f291285d = i17;
    }

    public static ig.p a(int i17) {
        if (i17 == 1) {
            return RECOMMEND;
        }
        if (i17 == 2) {
            return TEMPLATE;
        }
        if (i17 == 3) {
            return NOT_FOUND;
        }
        if (i17 != 100) {
            return null;
        }
        return OTHERS;
    }

    @Override // com.google.protobuf.p6
    public final int getNumber() {
        return this.f291285d;
    }
}

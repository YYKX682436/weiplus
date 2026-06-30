package i16;

/* loaded from: classes15.dex */
public enum g implements p16.w {
    BYTE(0, 0),
    CHAR(1, 1),
    SHORT(2, 2),
    INT(3, 3),
    LONG(4, 4),
    FLOAT(5, 5),
    DOUBLE(6, 6),
    BOOLEAN(7, 7),
    STRING(8, 8),
    CLASS(9, 9),
    ENUM(10, 10),
    ANNOTATION(11, 11),
    ARRAY(12, 12);


    /* renamed from: d, reason: collision with root package name */
    public final int f287450d;

    g(int i17, int i18) {
        this.f287450d = i18;
    }

    public static i16.g a(int i17) {
        switch (i17) {
            case 0:
                return BYTE;
            case 1:
                return CHAR;
            case 2:
                return SHORT;
            case 3:
                return INT;
            case 4:
                return LONG;
            case 5:
                return FLOAT;
            case 6:
                return DOUBLE;
            case 7:
                return BOOLEAN;
            case 8:
                return STRING;
            case 9:
                return CLASS;
            case 10:
                return ENUM;
            case 11:
                return ANNOTATION;
            case 12:
                return ARRAY;
            default:
                return null;
        }
    }

    @Override // p16.w
    public final int getNumber() {
        return this.f287450d;
    }
}

package i16;

/* loaded from: classes15.dex */
public enum n implements p16.w {
    CLASS(0, 0),
    INTERFACE(1, 1),
    ENUM_CLASS(2, 2),
    /* JADX INFO: Fake field, exist only in values array */
    ENUM_ENTRY(3, 3),
    ANNOTATION_CLASS(4, 4),
    /* JADX INFO: Fake field, exist only in values array */
    OBJECT(5, 5),
    COMPANION_OBJECT(6, 6);


    /* renamed from: d, reason: collision with root package name */
    public final int f287622d;

    n(int i17, int i18) {
        this.f287622d = i18;
    }

    @Override // p16.w
    public final int getNumber() {
        return this.f287622d;
    }
}

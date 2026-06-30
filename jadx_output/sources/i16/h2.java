package i16;

/* loaded from: classes16.dex */
public enum h2 implements p16.w {
    /* JADX INFO: Fake field, exist only in values array */
    INTERNAL(0, 0),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE(1, 1),
    /* JADX INFO: Fake field, exist only in values array */
    PROTECTED(2, 2),
    /* JADX INFO: Fake field, exist only in values array */
    PUBLIC(3, 3),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE_TO_THIS(4, 4),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL(5, 5);


    /* renamed from: d, reason: collision with root package name */
    public final int f287492d;

    h2(int i17, int i18) {
        this.f287492d = i18;
    }

    @Override // p16.w
    public final int getNumber() {
        return this.f287492d;
    }
}

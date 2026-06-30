package i16;

/* loaded from: classes16.dex */
public enum i1 implements p16.w {
    IN(0, 0),
    OUT(1, 1),
    INV(2, 2),
    STAR(3, 3);


    /* renamed from: d, reason: collision with root package name */
    public final int f287521d;

    i1(int i17, int i18) {
        this.f287521d = i18;
    }

    @Override // p16.w
    public final int getNumber() {
        return this.f287521d;
    }
}

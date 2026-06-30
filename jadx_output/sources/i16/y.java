package i16;

/* loaded from: classes16.dex */
public enum y implements p16.w {
    AT_MOST_ONCE(0, 0),
    EXACTLY_ONCE(1, 1),
    AT_LEAST_ONCE(2, 2);


    /* renamed from: d, reason: collision with root package name */
    public final int f287814d;

    y(int i17, int i18) {
        this.f287814d = i18;
    }

    @Override // p16.w
    public final int getNumber() {
        return this.f287814d;
    }
}

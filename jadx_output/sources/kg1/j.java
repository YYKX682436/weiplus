package kg1;

/* loaded from: classes5.dex */
public abstract class j implements kg1.g {

    /* renamed from: a, reason: collision with root package name */
    public final int f307702a;

    /* renamed from: b, reason: collision with root package name */
    public final int f307703b;

    /* renamed from: c, reason: collision with root package name */
    public final int f307704c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f307705d;

    public j(int i17, int i18, int i19, java.lang.String str) {
        this.f307702a = i17;
        this.f307703b = i18;
        this.f307704c = i19;
        this.f307705d = str;
    }

    @Override // kg1.g
    public java.lang.String a() {
        return this.f307705d;
    }

    @Override // kg1.g
    public int b() {
        return this.f307703b;
    }

    @Override // kg1.g
    public int c() {
        return this.f307704c;
    }

    @Override // kg1.g
    public int getType() {
        return this.f307702a;
    }
}

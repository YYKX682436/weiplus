package o51;

/* loaded from: classes15.dex */
public class d implements p51.b {

    /* renamed from: a, reason: collision with root package name */
    public int f343087a;

    /* renamed from: b, reason: collision with root package name */
    public int f343088b;

    /* renamed from: c, reason: collision with root package name */
    public p51.a f343089c;

    public d(int i17, int i18, p51.a aVar) {
        this.f343089c = aVar;
        if (aVar == null) {
            this.f343089c = new o51.c(this);
        }
        this.f343087a = i17;
        this.f343088b = i18;
    }

    @Override // p51.b
    public java.lang.String a(int i17) {
        java.lang.Integer item = getItem(i17);
        return this.f343089c.a(item == null ? "" : item.toString());
    }

    @Override // p51.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public java.lang.Integer getItem(int i17) {
        if (i17 < 0 || i17 >= getItemsCount()) {
            return null;
        }
        return java.lang.Integer.valueOf(this.f343087a + i17);
    }

    public int c() {
        return this.f343088b;
    }

    public int d() {
        return this.f343087a;
    }

    @Override // p51.b
    public int getItemsCount() {
        return (this.f343088b - this.f343087a) + 1;
    }

    public d(int i17, int i18) {
        this.f343089c = new o51.c(this);
        this.f343087a = i17;
        this.f343088b = i18;
    }
}

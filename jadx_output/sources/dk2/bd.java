package dk2;

/* loaded from: classes3.dex */
public final class bd {

    /* renamed from: a, reason: collision with root package name */
    public int f233257a;

    /* renamed from: b, reason: collision with root package name */
    public int f233258b;

    /* renamed from: c, reason: collision with root package name */
    public int f233259c;

    /* renamed from: d, reason: collision with root package name */
    public int f233260d;

    public bd(int i17, int i18, int i19, int i27) {
        this.f233257a = i17;
        this.f233258b = i18;
        this.f233259c = i19;
        this.f233260d = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.bd)) {
            return false;
        }
        dk2.bd bdVar = (dk2.bd) obj;
        return this.f233257a == bdVar.f233257a && this.f233258b == bdVar.f233258b && this.f233259c == bdVar.f233259c && this.f233260d == bdVar.f233260d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f233257a) * 31) + java.lang.Integer.hashCode(this.f233258b)) * 31) + java.lang.Integer.hashCode(this.f233259c)) * 31) + java.lang.Integer.hashCode(this.f233260d);
    }

    public java.lang.String toString() {
        return "VideoQuality(encResEnum=" + this.f233257a + ", capFps=" + this.f233258b + ", encBR=" + this.f233259c + ", encBRMin=" + this.f233260d + ')';
    }
}

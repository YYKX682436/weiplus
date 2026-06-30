package xu4;

/* loaded from: classes8.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f457292a;

    /* renamed from: b, reason: collision with root package name */
    public final int f457293b;

    /* renamed from: c, reason: collision with root package name */
    public final int f457294c;

    /* renamed from: d, reason: collision with root package name */
    public final int f457295d;

    /* renamed from: e, reason: collision with root package name */
    public final int f457296e;

    public m(java.lang.String content, int i17, int i18, int i19, int i27) {
        kotlin.jvm.internal.o.g(content, "content");
        this.f457292a = content;
        this.f457293b = i17;
        this.f457294c = i18;
        this.f457295d = i19;
        this.f457296e = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu4.m)) {
            return false;
        }
        xu4.m mVar = (xu4.m) obj;
        return kotlin.jvm.internal.o.b(this.f457292a, mVar.f457292a) && this.f457293b == mVar.f457293b && this.f457294c == mVar.f457294c && this.f457295d == mVar.f457295d && this.f457296e == mVar.f457296e;
    }

    public int hashCode() {
        return (((((((this.f457292a.hashCode() * 31) + java.lang.Integer.hashCode(this.f457293b)) * 31) + java.lang.Integer.hashCode(this.f457294c)) * 31) + java.lang.Integer.hashCode(this.f457295d)) * 31) + java.lang.Integer.hashCode(this.f457296e);
    }

    public java.lang.String toString() {
        return "WeTypeEmojiSearchTipsData(content=" + this.f457292a + ", interval=" + this.f457293b + ", maxCount=" + this.f457294c + ", aliveTime=" + this.f457295d + ", exitCondition=" + this.f457296e + ')';
    }
}

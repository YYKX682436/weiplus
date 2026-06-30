package i22;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f288010a;

    /* renamed from: b, reason: collision with root package name */
    public int f288011b;

    /* renamed from: c, reason: collision with root package name */
    public final int f288012c;

    public q(int i17, int i18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        i17 = (i27 & 1) != 0 ? -1 : i17;
        i18 = (i27 & 2) != 0 ? -1 : i18;
        i19 = (i27 & 4) != 0 ? -1 : i19;
        this.f288010a = i17;
        this.f288011b = i18;
        this.f288012c = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i22.q)) {
            return false;
        }
        i22.q qVar = (i22.q) obj;
        return this.f288010a == qVar.f288010a && this.f288011b == qVar.f288011b && this.f288012c == qVar.f288012c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f288010a) * 31) + java.lang.Integer.hashCode(this.f288011b)) * 31) + java.lang.Integer.hashCode(this.f288012c);
    }

    public java.lang.String toString() {
        return "EmojiStoreV3EmotionRecRange(startPos=" + this.f288010a + ", endPos=" + this.f288011b + ", reportScene=" + this.f288012c + ')';
    }
}

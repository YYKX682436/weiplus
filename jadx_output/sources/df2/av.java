package df2;

/* loaded from: classes3.dex */
public final class av {

    /* renamed from: a, reason: collision with root package name */
    public long f229753a;

    /* renamed from: b, reason: collision with root package name */
    public int f229754b;

    public av(long j17, int i17, long j18, int i18) {
        this.f229753a = j18;
        this.f229754b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df2.av)) {
            return false;
        }
        df2.av avVar = (df2.av) obj;
        avVar.getClass();
        return this.f229753a == avVar.f229753a && this.f229754b == avVar.f229754b;
    }

    public int hashCode() {
        return (((((java.lang.Long.hashCode(0L) * 31) + java.lang.Integer.hashCode(0)) * 31) + java.lang.Long.hashCode(this.f229753a)) * 31) + java.lang.Integer.hashCode(this.f229754b);
    }

    public java.lang.String toString() {
        return "VisibleModifyInfo(lastChangeToVisibleTimeStamp=0, fastChangeToVisibleTimes=0, lastChangeToInvisibleTimes=" + this.f229753a + ", fastChangeToInvisibleTimes=" + this.f229754b + ')';
    }
}

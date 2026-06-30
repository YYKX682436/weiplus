package kn0;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f309502a;

    public d(int i17, int i18, kotlin.jvm.internal.i iVar) {
        this.f309502a = (i18 & 1) != 0 ? 0 : i17;
    }

    public final int a() {
        return this.f309502a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kn0.d) && this.f309502a == ((kn0.d) obj).f309502a;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f309502a);
    }

    public java.lang.String toString() {
        return "LiveConfig(micWaveThresHolder=" + this.f309502a + ')';
    }
}

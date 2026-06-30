package vx3;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final vx3.d f441270a;

    /* renamed from: b, reason: collision with root package name */
    public final int f441271b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f441272c;

    public c(vx3.d soundType, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(soundType, "soundType");
        this.f441270a = soundType;
        this.f441271b = i17;
        this.f441272c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx3.c)) {
            return false;
        }
        vx3.c cVar = (vx3.c) obj;
        return this.f441270a == cVar.f441270a && this.f441271b == cVar.f441271b && this.f441272c == cVar.f441272c;
    }

    public int hashCode() {
        return (((this.f441270a.hashCode() * 31) + java.lang.Integer.hashCode(this.f441271b)) * 31) + java.lang.Boolean.hashCode(this.f441272c);
    }

    public java.lang.String toString() {
        return "RingtonePlayInfo(soundType=" + this.f441270a + ", streamType=" + this.f441271b + ", isLoop=" + this.f441272c + ')';
    }
}

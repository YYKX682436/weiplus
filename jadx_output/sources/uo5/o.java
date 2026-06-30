package uo5;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f429737a;

    /* renamed from: b, reason: collision with root package name */
    public final long f429738b;

    public o(int i17, int i18, long j17, int i19) {
        this.f429737a = i18;
        this.f429738b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo5.o)) {
            return false;
        }
        uo5.o oVar = (uo5.o) obj;
        oVar.getClass();
        return this.f429737a == oVar.f429737a && this.f429738b == oVar.f429738b;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(0) * 31) + java.lang.Integer.hashCode(this.f429737a)) * 31) + java.lang.Long.hashCode(this.f429738b)) * 31) + java.lang.Integer.hashCode(0);
    }

    public java.lang.String toString() {
        return "QueueInputResult(offset=0, size=" + this.f429737a + ", pts=" + this.f429738b + ", flag=0)";
    }
}

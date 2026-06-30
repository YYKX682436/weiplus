package tl5;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final tl5.j f420344a;

    /* renamed from: b, reason: collision with root package name */
    public final int f420345b;

    /* renamed from: c, reason: collision with root package name */
    public final int f420346c;

    public e(tl5.j snapshot, int i17, int i18) {
        kotlin.jvm.internal.o.g(snapshot, "snapshot");
        this.f420344a = snapshot;
        this.f420345b = i17;
        this.f420346c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tl5.e)) {
            return false;
        }
        tl5.e eVar = (tl5.e) obj;
        return kotlin.jvm.internal.o.b(this.f420344a, eVar.f420344a) && this.f420345b == eVar.f420345b && this.f420346c == eVar.f420346c;
    }

    public int hashCode() {
        return (((this.f420344a.hashCode() * 31) + java.lang.Integer.hashCode(this.f420345b)) * 31) + java.lang.Integer.hashCode(this.f420346c);
    }

    public java.lang.String toString() {
        return "ItemWrapper(snapshot=" + this.f420344a + ", spanGroupIndex=" + this.f420345b + ", spanIndex=" + this.f420346c + ')';
    }
}

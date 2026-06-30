package iq0;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final iq0.b f293642e = new iq0.b(null);

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f293643f = new java.util.LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f293644a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f293645b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f293646c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f293647d;

    public c(java.lang.String str, java.lang.String str2, boolean z17, kotlin.jvm.internal.i iVar) {
        this.f293644a = str;
        this.f293645b = str2;
        this.f293646c = z17;
        this.f293647d = str + str2;
    }

    public boolean equals(java.lang.Object obj) {
        return kotlin.jvm.internal.o.b(this.f293647d, obj != null ? obj.toString() : null);
    }

    public int hashCode() {
        return this.f293647d.hashCode();
    }

    public java.lang.String toString() {
        return this.f293647d;
    }
}

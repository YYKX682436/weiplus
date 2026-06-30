package oc2;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f344189a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f344190b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f344191c;

    /* renamed from: d, reason: collision with root package name */
    public oc2.f f344192d = oc2.f.f344166e;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.jb f344193e;

    /* renamed from: f, reason: collision with root package name */
    public r45.f03 f344194f;

    public h(int i17, boolean z17, boolean z18) {
        this.f344189a = i17;
        this.f344190b = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc2.h)) {
            return false;
        }
        oc2.h hVar = (oc2.h) obj;
        return this.f344189a == hVar.f344189a && this.f344190b == hVar.f344190b;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f344189a) * 31) + java.lang.Boolean.hashCode(false)) * 31) + java.lang.Boolean.hashCode(this.f344190b);
    }

    public java.lang.String toString() {
        return "RenderParam(maxSize=" + this.f344189a + ", isShort=false, dropOverSizeRedDot=" + this.f344190b + ')';
    }
}

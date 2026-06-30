package cs2;

/* loaded from: classes2.dex */
public final class p extends dn.o implements java.lang.Comparable {

    /* renamed from: d2, reason: collision with root package name */
    public final ek4.b f222087d2;

    /* renamed from: e2, reason: collision with root package name */
    public final mn2.g4 f222088e2;

    /* renamed from: f2, reason: collision with root package name */
    public long f222089f2;

    /* renamed from: g2, reason: collision with root package name */
    public cs2.o f222090g2;

    /* renamed from: h2, reason: collision with root package name */
    public int f222091h2;

    /* renamed from: i2, reason: collision with root package name */
    public final java.lang.String f222092i2;

    /* renamed from: j2, reason: collision with root package name */
    public final java.lang.String f222093j2;

    /* renamed from: k2, reason: collision with root package name */
    public int f222094k2;

    /* renamed from: l2, reason: collision with root package name */
    public cs2.n f222095l2;

    static {
        new cs2.m(null);
    }

    public p(ek4.b taskContext, mn2.g4 video) {
        kotlin.jvm.internal.o.g(taskContext, "taskContext");
        kotlin.jvm.internal.o.g(video, "video");
        this.f222087d2 = taskContext;
        this.f222088e2 = video;
        this.f222090g2 = cs2.o.f222084e;
        this.f222092i2 = video.n();
        java.lang.String string = video.f330002e.getString(9);
        this.f222093j2 = string == null ? "" : string;
        this.f222095l2 = cs2.n.f222079d;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        cs2.p other = (cs2.p) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.i(other.f222091h2, this.f222091h2);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof cs2.p)) {
            return false;
        }
        cs2.p pVar = (cs2.p) obj;
        return kotlin.jvm.internal.o.b(this.f222092i2, pVar.f222092i2) && this.f222095l2 == pVar.f222095l2;
    }

    public int hashCode() {
        return this.f222092i2.hashCode();
    }

    public final java.lang.String k() {
        java.lang.String str = this.X1;
        if (str != null) {
            return str;
        }
        com.tencent.mm.plugin.finder.storage.y90 y90Var = com.tencent.mm.plugin.finder.storage.y90.f128355e;
        return "xV0";
    }

    @Override // dn.o
    public java.lang.String toString() {
        int i17 = this.field_requestVideoFormat;
        java.lang.String str = "";
        java.lang.String str2 = i17 == 1 ? "H264" : i17 == 2 ? "H265" : "";
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        sb6.append(this.f222090g2);
        sb6.append("] ");
        sb6.append(this.f222094k2);
        sb6.append('_');
        java.lang.String mediaId = this.f222092i2;
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        if (!(mediaId.length() == 0)) {
            if (mediaId.length() <= 13) {
                str = mediaId;
            } else {
                int length = mediaId.length();
                if (length > 24) {
                    length = 24;
                }
                str = mediaId.substring(13, length);
                kotlin.jvm.internal.o.f(str, "substring(...)");
            }
        }
        sb6.append(str);
        sb6.append(' ');
        sb6.append(pm0.v.u(this.f222089f2));
        sb6.append(' ');
        sb6.append(str2);
        sb6.append(" percent=");
        sb6.append(this.V1);
        sb6.append("% minSize=");
        sb6.append(this.f241805x);
        sb6.append(" weight=");
        sb6.append(this.f222091h2);
        return sb6.toString();
    }
}

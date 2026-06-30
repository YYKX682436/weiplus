package ec2;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f250952a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f250953b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f250954c;

    /* renamed from: d, reason: collision with root package name */
    public final int f250955d;

    /* renamed from: e, reason: collision with root package name */
    public final long f250956e;

    /* renamed from: f, reason: collision with root package name */
    public final int f250957f;

    public c(int i17, boolean z17, boolean z18, int i18, long j17, int i19, int i27, kotlin.jvm.internal.i iVar) {
        i17 = (i27 & 1) != 0 ? 0 : i17;
        z17 = (i27 & 2) != 0 ? false : z17;
        z18 = (i27 & 4) != 0 ? false : z18;
        i18 = (i27 & 8) != 0 ? 0 : i18;
        j17 = (i27 & 16) != 0 ? 0L : j17;
        i19 = (i27 & 32) != 0 ? 0 : i19;
        this.f250952a = i17;
        this.f250953b = z17;
        this.f250954c = z18;
        this.f250955d = i18;
        this.f250956e = j17;
        this.f250957f = i19;
    }

    public final int a() {
        return this.f250955d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec2.c)) {
            return false;
        }
        ec2.c cVar = (ec2.c) obj;
        return this.f250952a == cVar.f250952a && this.f250953b == cVar.f250953b && this.f250954c == cVar.f250954c && this.f250955d == cVar.f250955d && this.f250956e == cVar.f250956e && this.f250957f == cVar.f250957f;
    }

    public int hashCode() {
        return (((((((((java.lang.Integer.hashCode(this.f250952a) * 31) + java.lang.Boolean.hashCode(this.f250953b)) * 31) + java.lang.Boolean.hashCode(this.f250954c)) * 31) + java.lang.Integer.hashCode(this.f250955d)) * 31) + java.lang.Long.hashCode(this.f250956e)) * 31) + java.lang.Integer.hashCode(this.f250957f);
    }

    public java.lang.String toString() {
        return "FinderFeedFlowExtra(clickAvatarType=" + this.f250952a + ", isLiving=" + this.f250953b + ", ifFsPlayer=" + this.f250954c + ", clickCommentReason=" + this.f250955d + ", commentId=" + this.f250956e + ", columnId=" + this.f250957f + ')';
    }
}

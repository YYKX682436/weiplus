package com.tencent.mm.vfs;

/* loaded from: classes10.dex */
public final class n3 extends com.tencent.mm.vfs.u {

    /* renamed from: b, reason: collision with root package name */
    public final long f213081b;

    /* renamed from: c, reason: collision with root package name */
    public final long f213082c;

    /* renamed from: d, reason: collision with root package name */
    public final long f213083d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(long j17, long j18, long j19) {
        super(3);
        com.tencent.mm.vfs.v vVar = com.tencent.mm.vfs.v.f213212e;
        this.f213081b = j17;
        this.f213082c = j18;
        this.f213083d = j19;
    }

    @Override // com.tencent.mm.vfs.u
    public java.util.Map b(java.lang.String name, java.lang.String dir) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(dir, "dir");
        return kz5.c1.k(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, name), new jz5.l(com.tencent.tinker.loader.shareutil.SharePatchInfo.OAT_DIR, dir), new jz5.l("target", java.lang.String.valueOf(this.f213081b)), new jz5.l("threshold", java.lang.String.valueOf(this.f213082c)), new jz5.l("expire", java.lang.String.valueOf(this.f213083d)));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.vfs.n3)) {
            return false;
        }
        com.tencent.mm.vfs.n3 n3Var = (com.tencent.mm.vfs.n3) obj;
        return this.f213081b == n3Var.f213081b && this.f213082c == n3Var.f213082c && this.f213083d == n3Var.f213083d;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f213081b) * 31) + java.lang.Long.hashCode(this.f213082c)) * 31) + java.lang.Long.hashCode(this.f213083d);
    }

    public java.lang.String toString() {
        return "Lru(targetSize=" + this.f213081b + ", threshold=" + this.f213082c + ", expireTime=" + this.f213083d + ')';
    }
}

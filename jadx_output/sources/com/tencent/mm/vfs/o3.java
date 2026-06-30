package com.tencent.mm.vfs;

/* loaded from: classes10.dex */
public final class o3 extends com.tencent.mm.vfs.u {

    /* renamed from: b, reason: collision with root package name */
    public final long f213106b;

    /* renamed from: c, reason: collision with root package name */
    public final long f213107c;

    /* renamed from: d, reason: collision with root package name */
    public final long f213108d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(long j17, long j18, long j19) {
        super(1);
        com.tencent.mm.vfs.v vVar = com.tencent.mm.vfs.v.f213212e;
        this.f213106b = j17;
        this.f213107c = j18;
        this.f213108d = j19;
    }

    @Override // com.tencent.mm.vfs.u
    public java.util.Map b(java.lang.String name, java.lang.String dir) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(dir, "dir");
        return kz5.c1.k(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, name), new jz5.l(com.tencent.tinker.loader.shareutil.SharePatchInfo.OAT_DIR, dir), new jz5.l("target", java.lang.String.valueOf(this.f213106b)), new jz5.l("threshold", java.lang.String.valueOf(this.f213107c)), new jz5.l("expire", java.lang.String.valueOf(this.f213108d)));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.vfs.o3)) {
            return false;
        }
        com.tencent.mm.vfs.o3 o3Var = (com.tencent.mm.vfs.o3) obj;
        return this.f213106b == o3Var.f213106b && this.f213107c == o3Var.f213107c && this.f213108d == o3Var.f213108d;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f213106b) * 31) + java.lang.Long.hashCode(this.f213107c)) * 31) + java.lang.Long.hashCode(this.f213108d);
    }

    public java.lang.String toString() {
        return "LruExpire(targetSize=" + this.f213106b + ", threshold=" + this.f213107c + ", expireTime=" + this.f213108d + ')';
    }
}

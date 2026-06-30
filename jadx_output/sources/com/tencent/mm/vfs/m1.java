package com.tencent.mm.vfs;

/* loaded from: classes10.dex */
public final class m1 extends com.tencent.mm.vfs.u {

    /* renamed from: b, reason: collision with root package name */
    public final long f213070b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(long j17) {
        super(2);
        com.tencent.mm.vfs.v vVar = com.tencent.mm.vfs.v.f213212e;
        this.f213070b = j17;
    }

    @Override // com.tencent.mm.vfs.u
    public java.util.Map b(java.lang.String name, java.lang.String dir) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(dir, "dir");
        return kz5.c1.k(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, name), new jz5.l(com.tencent.tinker.loader.shareutil.SharePatchInfo.OAT_DIR, dir), new jz5.l("expire", java.lang.String.valueOf(this.f213070b)));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.vfs.m1) && this.f213070b == ((com.tencent.mm.vfs.m1) obj).f213070b;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f213070b);
    }

    public java.lang.String toString() {
        return "Expire(expireTime=" + this.f213070b + ')';
    }
}

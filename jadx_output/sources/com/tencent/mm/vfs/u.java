package com.tencent.mm.vfs;

/* loaded from: classes10.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f213190a;

    public u(int i17) {
        this.f213190a = i17;
    }

    public yz5.l a() {
        return null;
    }

    public java.util.Map b(java.lang.String name, java.lang.String dir) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(dir, "dir");
        return kz5.c1.k(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, name), new jz5.l(com.tencent.tinker.loader.shareutil.SharePatchInfo.OAT_DIR, dir));
    }
}

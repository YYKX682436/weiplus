package oo1;

/* loaded from: classes12.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.Object a(final java.lang.String str, final long j17, final long j18, kotlin.coroutines.Continuation continuation) {
        android.database.Cursor B;
        final com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        java.lang.String X8 = cj6.X8(str);
        int i17 = 0;
        if (cj6.Da(X8)) {
            B = ot0.c3.l().c("getAllMediaMsgFromMsgTable", new yz5.a() { // from class: com.tencent.mm.storage.g9$$u0
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    return ot0.z2.f348822a.k(com.tencent.mm.storage.g9.this.f193989r, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, str, j17, j18, java.util.Arrays.asList(3, 43, 62, 44, 49));
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$v0
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    com.tencent.mm.storage.g9 g9Var = com.tencent.mm.storage.g9.this;
                    g9Var.getClass();
                    java.lang.System.currentTimeMillis();
                    android.database.Cursor B2 = g9Var.f193989r.B("select * from message where talker=? AND createTime>=" + j17 + " AND createTime<=" + j18 + " AND (type IN (3,43,62,44) OR type & 65535 = 49)", new java.lang.String[]{str});
                    java.lang.System.currentTimeMillis();
                    return B2;
                }
            });
        } else if (cj6.Pb(X8)) {
            B = ot0.z2.f348822a.k(cj6.f193989r, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, str, j17, j18, java.util.Arrays.asList(3, 43, 62, 44, 49));
        } else {
            java.lang.System.currentTimeMillis();
            B = cj6.f193989r.B("select * from message where talker=? AND createTime>=" + j17 + " AND createTime<=" + j18 + " AND (type IN (3,43,62,44) OR type & 65535 = 49)", new java.lang.String[]{str});
            java.lang.System.currentTimeMillis();
        }
        if (B != null) {
            while (B.moveToNext()) {
                try {
                    com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                    f9Var.convertFrom(B);
                    do1.b a17 = co1.d.f43762a.a(f9Var.getType());
                    if (a17 != null) {
                        i17++;
                        if (a17.a(f9Var, j18)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.BackupConvCalcV2", "Find a modified media, count=" + i17 + ", talker=" + str + ", msgType=" + f9Var.getType() + ", createTime=" + f9Var.getCreateTime());
                            java.lang.Long l17 = new java.lang.Long(f9Var.getCreateTime());
                            vz5.b.a(B, null);
                            return l17;
                        }
                    }
                } finally {
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupConvCalcV2", "[getConvMediaTimeMap] Query completed. Process item count=" + i17);
            vz5.b.a(B, null);
        }
        return new java.lang.Long(j18);
    }
}

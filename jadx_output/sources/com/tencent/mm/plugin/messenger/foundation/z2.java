package com.tencent.mm.plugin.messenger.foundation;

/* loaded from: classes11.dex */
public class z2 implements a25.u {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.messenger.foundation.v2 f148769b = new com.tencent.mm.plugin.messenger.foundation.v2(null);

    /* renamed from: a, reason: collision with root package name */
    public vg3.z4 f148770a;

    public void a(java.lang.Object obj, int i17, int i18, r45.b50 b50Var, byte[] bArr, boolean z17, r45.cx4 cx4Var) {
        vg3.w4 w4Var = (vg3.w4) vg3.v4.f436761a.get(java.lang.Integer.valueOf(b50Var.f370530d));
        if (w4Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SyncDoCmdExtensions", "SyncDoCmdExtension for cmd id [%s] is null.", java.lang.Integer.valueOf(b50Var.f370530d));
            return;
        }
        try {
            mm.w.e("SyncDoCmd");
            w4Var.a(obj, b50Var, i17, bArr, z17, cx4Var, this.f148770a);
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SyncDoCmdExtensions", "docmd: parse protobuf error, " + e17.getMessage());
            throw new java.lang.RuntimeException("docmd: parse protobuf error");
        }
    }
}

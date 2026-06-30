package com.tencent.mm.sdk.platformtools;

/* loaded from: classes7.dex */
public class v3 extends com.tencent.mm.sdk.platformtools.o {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.o4 f193037f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(com.tencent.mm.sdk.platformtools.o4 slotRecorder, long j17) {
        super(j17, 0, 2, null);
        kotlin.jvm.internal.o.g(slotRecorder, "slotRecorder");
        this.f193037f = slotRecorder;
    }

    public static /* synthetic */ int p(com.tencent.mm.sdk.platformtools.v3 v3Var, java.lang.String str, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeInt");
        }
        if ((i18 & 2) != 0) {
            i17 = 0;
        }
        return v3Var.o(str, i17);
    }

    public static /* synthetic */ long r(com.tencent.mm.sdk.platformtools.v3 v3Var, java.lang.String str, long j17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeLong");
        }
        if ((i17 & 2) != 0) {
            j17 = 0;
        }
        return v3Var.q(str, j17);
    }

    public static /* synthetic */ java.lang.String t(com.tencent.mm.sdk.platformtools.v3 v3Var, java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeString");
        }
        if ((i17 & 2) != 0) {
            str2 = "";
        }
        return v3Var.s(str, str2);
    }

    @Override // com.tencent.mm.sdk.platformtools.o
    public void b(long j17, java.lang.Object obj) {
        com.tencent.mm.sdk.platformtools.o4 slot = (com.tencent.mm.sdk.platformtools.o4) obj;
        kotlin.jvm.internal.o.g(slot, "slot");
        if (slot.g() > 0) {
            slot.clear();
        }
    }

    @Override // com.tencent.mm.sdk.platformtools.o
    public boolean c(java.lang.Object obj, java.lang.String key) {
        com.tencent.mm.sdk.platformtools.o4 slot = (com.tencent.mm.sdk.platformtools.o4) obj;
        kotlin.jvm.internal.o.g(slot, "slot");
        kotlin.jvm.internal.o.g(key, "key");
        return slot.f(key);
    }

    @Override // com.tencent.mm.sdk.platformtools.o
    public java.lang.Object g(java.lang.String slotKey, long j17) {
        kotlin.jvm.internal.o.g(slotKey, "slotKey");
        return com.tencent.mm.sdk.platformtools.o4.N(slotKey, 2, null);
    }

    @Override // com.tencent.mm.sdk.platformtools.o
    public void j(java.lang.String slotKey, long j17) {
        kotlin.jvm.internal.o.g(slotKey, "slotKey");
        this.f193037f.putLong(slotKey, j17);
    }

    @Override // com.tencent.mm.sdk.platformtools.o
    public boolean l(java.lang.String slotKey, long j17) {
        kotlin.jvm.internal.o.g(slotKey, "slotKey");
        return this.f193037f.getLong(slotKey, 0L) == j17;
    }

    public final boolean m(java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) d(key);
        if (o4Var != null) {
            return o4Var.f(key);
        }
        return false;
    }

    public final boolean n(java.lang.String key, boolean z17) {
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) d(key);
        return o4Var != null ? o4Var.i(key, z17) : z17;
    }

    public final int o(java.lang.String key, int i17) {
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) d(key);
        return o4Var != null ? o4Var.o(key, i17) : i17;
    }

    public final long q(java.lang.String key, long j17) {
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) d(key);
        return o4Var != null ? o4Var.p(key) : j17;
    }

    public final java.lang.String s(java.lang.String key, java.lang.String str) {
        java.lang.String u17;
        kotlin.jvm.internal.o.g(key, "key");
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) d(key);
        return (o4Var == null || (u17 = o4Var.u(key, str)) == null) ? str : u17;
    }
}

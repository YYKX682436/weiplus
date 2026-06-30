package ot5;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final ot5.h f348877a = new ot5.h();

    public final boolean a(java.lang.String str, java.lang.String str2, java.lang.String tag, boolean z17) {
        byte[] bytes;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        kotlin.jvm.internal.o.g(tag, "tag");
        byte[] bArr4 = null;
        boolean z18 = false;
        if (str2 != null) {
            try {
                bytes = str2.getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
            } catch (java.lang.Exception unused) {
            }
        } else {
            bytes = null;
        }
        com.tencent.mm.protobuf.g b17 = com.tencent.mm.protobuf.g.b(bytes);
        b17.f(16);
        java.lang.String b18 = ot5.e.b(b17.g());
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.K0(str) || kotlin.jvm.internal.o.b(str, b18);
        try {
        } catch (java.lang.Exception unused2) {
            z18 = z19;
        }
        if (z19) {
            com.tencent.mars.xlog.Log.i(tag, "checkDeviceUUID, deviceUUId[" + str + "], localDeviceUUId[" + b18 + ']');
            return z19;
        }
        if (str != null) {
            bArr = str.getBytes(r26.c.f368865a);
            kotlin.jvm.internal.o.f(bArr, "getBytes(...)");
        } else {
            bArr = null;
        }
        byte[] decode = android.util.Base64.decode(bArr, 0);
        kotlin.jvm.internal.o.f(decode, "decode(...)");
        java.nio.charset.Charset charset = r26.c.f368865a;
        java.lang.String str3 = new java.lang.String(decode, charset);
        if (str2 != null) {
            bArr2 = str2.getBytes(charset);
            kotlin.jvm.internal.o.f(bArr2, "getBytes(...)");
        } else {
            bArr2 = null;
        }
        com.tencent.mm.protobuf.g b19 = com.tencent.mm.protobuf.g.b(bArr2);
        b19.f(16);
        byte[] bArr5 = b19.f192156a;
        kotlin.jvm.internal.o.f(bArr5, "getBytes(...)");
        java.lang.String str4 = new java.lang.String(bArr5, charset);
        boolean z27 = com.tencent.mm.sdk.platformtools.t8.K0(str3) || kotlin.jvm.internal.o.b(str3, str4);
        if (!z27) {
            try {
                str4 = android.util.Base64.encodeToString(b17.g(), 2);
                kotlin.jvm.internal.o.f(str4, "encodeToString(...)");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !kotlin.jvm.internal.o.b(str, str4)) {
                    z27 = false;
                }
                z27 = true;
            } catch (java.lang.Exception unused3) {
                z18 = z27;
            }
        }
        if (!z27 && z17 && str != null) {
            if (str2 != null) {
                bArr3 = str2.getBytes(charset);
                kotlin.jvm.internal.o.f(bArr3, "getBytes(...)");
            } else {
                bArr3 = null;
            }
            str4 = android.util.Base64.encodeToString(bArr3, 0);
            kotlin.jvm.internal.o.f(str4, "encodeToString(...)");
            if (str.length() > 0) {
                java.lang.String substring = str.substring(0, java.lang.Math.max(0, str.length() - 10));
                kotlin.jvm.internal.o.f(substring, "substring(...)");
                if (r26.n0.B(str4, substring, false)) {
                    z27 = true;
                }
            }
            z27 = false;
        }
        if (z27) {
            z18 = z27;
        } else {
            if (str2 != null) {
                bArr4 = str2.getBytes(charset);
                kotlin.jvm.internal.o.f(bArr4, "getBytes(...)");
            }
            com.tencent.mm.protobuf.g b27 = com.tencent.mm.protobuf.g.b(bArr4);
            b27.f(16);
            str4 = com.tencent.mm.sdk.platformtools.t8.l(b27.f192156a);
            kotlin.jvm.internal.o.f(str4, "encodeHexString(...)");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                if (kotlin.jvm.internal.o.b(str, str4)) {
                    z18 = true;
                }
            }
        }
        com.tencent.mars.xlog.Log.i(tag, "checkDeviceID, deviceId[" + str + "], localDeviceId[" + str4 + "], ret: " + z18);
        return z18;
    }
}

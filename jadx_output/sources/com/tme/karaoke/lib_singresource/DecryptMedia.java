package com.tme.karaoke.lib_singresource;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001J!\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0082 ¨\u0006\t"}, d2 = {"Lcom/tme/karaoke/lib_singresource/DecryptMedia;", "", "", "fileOffset", "Ljava/nio/ByteBuffer;", "buffer", "", "len", "decrypt_native", "lib_singresource_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class DecryptMedia {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f220661d;

    /* renamed from: a, reason: collision with root package name */
    public final yz5.l f220662a;

    /* renamed from: b, reason: collision with root package name */
    public java.nio.ByteBuffer f220663b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f220664c;

    static {
        try {
            if (f220661d) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("singdecrypt");
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tme/karaoke/lib_singresource/DecryptMedia", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            com.tencent.cso.CsoLoader.e((java.lang.String) arrayList.get(0));
            yj0.a.f(obj, "com/tme/karaoke/lib_singresource/DecryptMedia", "<clinit>", "()V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
            f220661d = true;
        } catch (java.lang.Throwable th6) {
            th6.toString();
        }
    }

    public DecryptMedia(yz5.l lVar, int i17, kotlin.jvm.internal.i iVar) {
        this.f220662a = (i17 & 1) != 0 ? null : lVar;
    }

    private final native int decrypt_native(long fileOffset, java.nio.ByteBuffer buffer, int len);

    public final int a(long j17, byte[] buffer, int i17) {
        kotlin.jvm.internal.o.g(buffer, "buffer");
        if (!f220661d) {
            i17 = -1000;
        } else if (i17 == 0) {
            i17 = 0;
        } else {
            if (this.f220663b == null) {
                this.f220663b = java.nio.ByteBuffer.allocateDirect(i17);
            }
            java.nio.ByteBuffer byteBuffer = this.f220663b;
            if (byteBuffer == null) {
                byteBuffer = java.nio.ByteBuffer.allocateDirect(i17);
            }
            int i18 = i17;
            while (i18 > 0) {
                byteBuffer.clear();
                int min = java.lang.Math.min(java.lang.Math.min(i17, byteBuffer.limit()), i18);
                int i19 = i17 - i18;
                byteBuffer.put(buffer, i19, min);
                int decrypt_native = decrypt_native((i17 + j17) - i18, byteBuffer, min);
                if (decrypt_native < 0) {
                    return decrypt_native;
                }
                byteBuffer.flip();
                byteBuffer.get(buffer, i19, min);
                i18 -= min;
            }
        }
        synchronized (com.tme.karaoke.lib_singresource.DecryptMedia.class) {
            if (!this.f220664c) {
                this.f220664c = true;
                yz5.l lVar = this.f220662a;
                if (lVar != null) {
                    jz5.l[] lVarArr = new jz5.l[2];
                    lVarArr[0] = new jz5.l(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, i17 >= 0 ? "0" : java.lang.String.valueOf(i17));
                    lVarArr[1] = new jz5.l("type", "decryptMedia");
                    lVar.invoke(kz5.c1.k(lVarArr));
                }
            }
        }
        return i17;
    }
}

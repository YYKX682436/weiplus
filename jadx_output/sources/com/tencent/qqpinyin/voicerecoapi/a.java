package com.tencent.qqpinyin.voicerecoapi;

/* loaded from: classes14.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f215258a = null;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f215259b = null;

    /* renamed from: c, reason: collision with root package name */
    public long f215260c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f215261d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.qqpinyin.voicerecoapi.TRSpeexNative f215262e = new com.tencent.qqpinyin.voicerecoapi.TRSpeexNative();

    public byte[] a(byte[] bArr, int i17, int i18) {
        long j17 = this.f215261d;
        if (j17 == 0) {
            throw new com.tencent.qqpinyin.voicerecoapi.b(-102);
        }
        if (bArr == null || bArr.length == 0) {
            throw new com.tencent.qqpinyin.voicerecoapi.b(-104);
        }
        int nativeTRSpeexDecode = this.f215262e.nativeTRSpeexDecode(j17, bArr, i17, i18, this.f215259b);
        if (nativeTRSpeexDecode < 0) {
            throw new com.tencent.qqpinyin.voicerecoapi.b(nativeTRSpeexDecode);
        }
        if (nativeTRSpeexDecode == 0) {
            return null;
        }
        byte[] bArr2 = new byte[nativeTRSpeexDecode];
        java.lang.System.arraycopy(this.f215259b, 0, bArr2, 0, nativeTRSpeexDecode);
        return bArr2;
    }

    public int b() {
        if (this.f215261d != 0) {
            return -103;
        }
        long nativeTRSpeexDecodeInit = this.f215262e.nativeTRSpeexDecodeInit();
        if (nativeTRSpeexDecodeInit == -1) {
            return (int) nativeTRSpeexDecodeInit;
        }
        this.f215261d = nativeTRSpeexDecodeInit;
        this.f215259b = new byte[30000];
        return 0;
    }

    public int c() {
        long j17 = this.f215261d;
        if (j17 == 0) {
            return -102;
        }
        this.f215259b = null;
        int nativeTRSpeexDecodeRelease = this.f215262e.nativeTRSpeexDecodeRelease(j17);
        this.f215261d = 0L;
        return nativeTRSpeexDecodeRelease;
    }

    public byte[] d(byte[] bArr, int i17, int i18) {
        long j17 = this.f215260c;
        if (j17 == 0) {
            throw new com.tencent.qqpinyin.voicerecoapi.b(-102);
        }
        if (bArr == null || bArr.length == 0) {
            throw new com.tencent.qqpinyin.voicerecoapi.b(-104);
        }
        int nativeTRSpeexEncode = this.f215262e.nativeTRSpeexEncode(j17, bArr, i17, i18, this.f215258a);
        if (nativeTRSpeexEncode < 0) {
            throw new com.tencent.qqpinyin.voicerecoapi.b(nativeTRSpeexEncode);
        }
        if (nativeTRSpeexEncode == 0) {
            return null;
        }
        byte[] bArr2 = new byte[nativeTRSpeexEncode];
        java.lang.System.arraycopy(this.f215258a, 0, bArr2, 0, nativeTRSpeexEncode);
        return bArr2;
    }

    public int e() {
        if (this.f215260c != 0) {
            return -103;
        }
        long nativeTRSpeexInit = this.f215262e.nativeTRSpeexInit();
        if (nativeTRSpeexInit == -1) {
            return (int) nativeTRSpeexInit;
        }
        this.f215260c = nativeTRSpeexInit;
        this.f215258a = new byte[com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL];
        return 0;
    }

    public int f() {
        long j17 = this.f215260c;
        if (j17 == 0) {
            return -102;
        }
        this.f215258a = null;
        int nativeTRSpeexRelease = this.f215262e.nativeTRSpeexRelease(j17);
        this.f215260c = 0L;
        return nativeTRSpeexRelease;
    }
}

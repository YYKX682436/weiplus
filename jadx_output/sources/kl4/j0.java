package kl4;

/* loaded from: classes15.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl4.k0 f308920d;

    public j0(kl4.k0 k0Var) {
        this.f308920d = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kl4.k0 k0Var = this.f308920d;
        if (k0Var.f308929d == null) {
            com.tencent.mars.xlog.Log.i(k0Var.f308948z, "writeToAudioTrack audioTrack is null");
            return;
        }
        try {
            if (k0Var.f308938p == null) {
                k0Var.f308938p = kl4.k0.a(k0Var);
                k0Var.f308939q = 0;
            }
            byte[] bArr = k0Var.f308938p;
            if (bArr != null) {
                if ((!(bArr.length == 0)) && !k0Var.f308936n) {
                    int i17 = k0Var.f308942t;
                    int i18 = i17 / 3;
                    int length = bArr.length;
                    int i19 = k0Var.f308939q;
                    int i27 = length - i19;
                    if (i27 > i18) {
                        android.media.AudioTrack audioTrack = k0Var.f308929d;
                        r12 = audioTrack != null ? audioTrack.write(bArr, i19, i18, 1) : -1;
                        if (r12 > 0) {
                            k0Var.f308939q += r12;
                            return;
                        }
                        return;
                    }
                    if (i27 <= 0) {
                        r12 = 0;
                    } else if (k0Var.f308937o) {
                        byte[] bArr2 = new byte[i17];
                        for (int i28 = 0; i28 < i17; i28++) {
                            bArr2[i28] = 0;
                        }
                        int i29 = k0Var.f308939q;
                        kz5.v.l(bArr, bArr2, 0, i29, i29 + i27, 2, null);
                        android.media.AudioTrack audioTrack2 = k0Var.f308929d;
                        if (audioTrack2 != null) {
                            r12 = audioTrack2.write(bArr2, 0, k0Var.f308942t, 1);
                        }
                    } else {
                        android.media.AudioTrack audioTrack3 = k0Var.f308929d;
                        if (audioTrack3 != null) {
                            r12 = audioTrack3.write(bArr, i19, i27, 1);
                        }
                    }
                    com.tencent.mars.xlog.Log.i(k0Var.f308948z, "writeToAudioTrack: " + r12 + " bytes, buffer remaining: " + i27 + ", bufferHasMore: " + k0Var.f308937o);
                    if (r12 >= 0) {
                        k0Var.f308939q = 0;
                        k0Var.f308938p = null;
                    }
                    if (k0Var.f308937o) {
                        return;
                    }
                    k0Var.f();
                    return;
                }
            }
            if (k0Var.f308937o || !((java.util.ArrayList) k0Var.f308930e).isEmpty() || k0Var.f308936n) {
                return;
            }
            k0Var.e(kl4.b0.f308888h);
        } catch (java.lang.Exception e17) {
            rk4.k5.d(k0Var.f308948z, "AudioTrack write exception: " + e17.getMessage());
        }
    }
}

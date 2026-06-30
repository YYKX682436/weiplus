package kl4;

/* loaded from: classes15.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kl4.k0 f308894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f308895e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f308896f;

    public c0(kl4.k0 k0Var, byte[] bArr, boolean z17) {
        this.f308894d = k0Var;
        this.f308895e = bArr;
        this.f308896f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f308896f;
        byte[] bArr = this.f308895e;
        kl4.k0 k0Var = this.f308894d;
        k0Var.f308931f.lock();
        try {
            java.lang.String str = k0Var.f308948z;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("enqueueBuffer playbackHeadPosition: ");
            android.media.AudioTrack audioTrack = k0Var.f308929d;
            sb6.append(audioTrack != null ? java.lang.Integer.valueOf(audioTrack.getPlaybackHeadPosition()) : null);
            sb6.append(", buffer: ");
            sb6.append(bArr.length);
            sb6.append(", hasMore: ");
            sb6.append(z17);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            if (!(bArr.length == 0)) {
                ((java.util.ArrayList) k0Var.f308930e).add(bArr);
                com.tencent.mars.xlog.Log.i(k0Var.f308948z, "enqueueBuffer " + bArr.length + ' ' + z17);
            }
            k0Var.f308937o = z17;
            if (z17) {
                int length = k0Var.f308941s + bArr.length;
                k0Var.f308941s = length;
                if (length > k0Var.f308940r) {
                    k0Var.f308932g.signalAll();
                    k0Var.f308941s = 0;
                }
            } else {
                k0Var.f308932g.signalAll();
                k0Var.f308941s = 0;
            }
            k0Var.f308931f.unlock();
        } catch (java.lang.Throwable th6) {
            k0Var.f308931f.unlock();
            throw th6;
        }
    }
}

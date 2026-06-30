package ph3;

/* loaded from: classes14.dex */
public class a extends ph3.i {

    /* renamed from: w, reason: collision with root package name */
    public android.media.AudioTrack f354381w;

    /* renamed from: x, reason: collision with root package name */
    public int f354382x;

    /* renamed from: y, reason: collision with root package name */
    public int f354383y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f354384z;

    public a(ph3.h hVar, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        super(hVar, n3Var);
        this.f354384z = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d5  */
    @Override // ph3.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean h(wo.i1 r30) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ph3.a.h(wo.i1):boolean");
    }

    @Override // ph3.i
    public void j(wo.i1 i1Var, android.media.MediaFormat mediaFormat) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioTrackDataSource", "%s on output format changed: %s", i(), mediaFormat);
        if (mediaFormat.containsKey("sample-rate")) {
            this.f354383y = mediaFormat.getInteger("sample-rate");
        }
    }

    @Override // ph3.i
    public void k() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioTrackDataSource", "%s on pause", i());
        android.media.AudioTrack audioTrack = this.f354381w;
        if (audioTrack == null || audioTrack.getState() != 1) {
            return;
        }
        this.f354381w.pause();
    }

    @Override // ph3.i
    public boolean n(long j17, long j18, wo.i1 i1Var, java.nio.ByteBuffer byteBuffer, int i17, android.media.MediaCodec.BufferInfo bufferInfo) {
        boolean z17;
        i();
        int i18 = this.f354401a;
        if (!(i18 == 3 || i18 == 5 || i18 == 7)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioTrackDataSource", "%s it no need process buffer now state %d", i(), java.lang.Integer.valueOf(this.f354401a));
            return false;
        }
        if (this.f354381w == null) {
            java.lang.String i19 = i();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(v());
            if (this.f354382x == 0) {
                this.f354382x = this.f354409i.getInteger("channel-count");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AudioTrackDataSource", "%s init audio track, sampleRate:%s, channels:%s", i19, valueOf, java.lang.Integer.valueOf(this.f354382x));
            if (this.f354382x == 0) {
                this.f354382x = this.f354409i.getInteger("channel-count");
            }
            int i27 = this.f354382x == 1 ? 4 : 12;
            to.e eVar = new to.e(3, v(), i27, 2, android.media.AudioTrack.getMinBufferSize(v(), i27, 2), 1);
            this.f354381w = eVar;
            if (eVar.getState() != 1) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AudioTrackDataSource", "%s can not create audio track [%d]", i(), java.lang.Integer.valueOf(this.f354381w.getState()));
                this.f354381w.release();
                this.f354381w = null;
                z17 = false;
            } else {
                x(this.f354384z);
                z17 = true;
            }
            if (!z17) {
                return false;
            }
        }
        int i28 = this.f354401a;
        if ((i28 == 3 || i28 == 5 || i28 == 6) && (this.f354381w.getPlayState() == 2 || this.f354381w.getPlayState() == 1)) {
            w();
        }
        if ((this.f354401a == 4) && this.f354381w.getPlayState() == 3) {
            k();
        }
        try {
            this.f354402b.f354391f = bufferInfo.presentationTimeUs;
            int i29 = bufferInfo.size;
            byte[] bArr = new byte[i29];
            byteBuffer.get(bArr);
            byteBuffer.clear();
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            android.os.SystemClock.elapsedRealtime();
            if (i29 > 0) {
                this.f354381w.write(bArr, 0, i29);
            }
            i();
            long j19 = this.f354402b.f354391f;
            android.os.SystemClock.elapsedRealtime();
            i1Var.s(i17, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AudioTrackDataSource", "%s audio release output buffer error %s", i(), e17.toString());
        }
        return true;
    }

    @Override // ph3.i
    public void o() {
        try {
            android.media.AudioTrack audioTrack = this.f354381w;
            if (audioTrack != null) {
                audioTrack.flush();
                this.f354381w.release();
            }
        } catch (java.lang.Exception unused) {
        }
        super.o();
    }

    @Override // ph3.i
    public java.lang.String u() {
        return "audio";
    }

    public final int v() {
        if (this.f354383y == 0) {
            this.f354383y = this.f354409i.getInteger("sample-rate");
        }
        return this.f354383y;
    }

    public void w() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioTrackDataSource", "%s on start", i());
        android.media.AudioTrack audioTrack = this.f354381w;
        if (audioTrack == null || audioTrack.getState() != 1) {
            return;
        }
        this.f354381w.play();
    }

    public void x(boolean z17) {
        if (this.f354381w == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AudioTrackDataSource", "%s set mute[%b] but audio track is null", i(), java.lang.Boolean.valueOf(z17));
            this.f354384z = z17;
            return;
        }
        if (fp.h.a(21)) {
            i();
            if (z17) {
                this.f354381w.setStereoVolume(0.0f, 0.0f);
                return;
            } else {
                this.f354381w.setStereoVolume(1.0f, 1.0f);
                return;
            }
        }
        i();
        if (z17) {
            this.f354381w.setVolume(0.0f);
        } else {
            this.f354381w.setVolume(1.0f);
        }
    }
}

package pl;

/* loaded from: classes13.dex */
public class b extends pl.a {

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Thread f356567p;

    @Override // pl.a
    public void b() {
        android.media.AudioTrack audioTrack = this.f356555a;
        if (audioTrack != null) {
            int state = audioTrack.getState();
            int playState = audioTrack.getPlayState();
            if (state == 1 && playState == 3) {
                try {
                    audioTrack.pause();
                    int playbackHeadPosition = audioTrack.getPlaybackHeadPosition();
                    this.f356564j = playbackHeadPosition;
                    java.lang.Object[] objArr = {java.lang.Integer.valueOf(playbackHeadPosition)};
                    int i17 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioPcmStaticPlayComponent", "pause startPos :%d", objArr);
                    java.lang.Thread thread = this.f356567p;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (java.lang.Exception e17) {
                    int i18 = rl.b.f397143a;
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioPcmStaticPlayComponent", e17, "pause", new java.lang.Object[0]);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ca  */
    @Override // pl.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(byte[] r15) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.b.c(byte[]):void");
    }

    @Override // pl.a
    public void d() {
        long j17;
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(pl.a.f356553n.get()), java.lang.Integer.valueOf(pl.a.f356552m.get())};
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioPcmStaticPlayComponent", "playFlush play_count:%d, fail_count:%d", objArr);
        if (this.f356555a != null) {
            ol.j jVar = this.f356563i;
            if (jVar != null) {
                ((ll.d) jVar).v();
            }
            android.media.AudioTrack audioTrack = this.f356555a;
            if (audioTrack.getState() == 2) {
                byte[] bArr = this.f356556b;
                if (audioTrack.write(bArr, 0, bArr.length) <= 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioPcmStaticPlayComponent", "AudioTrack write fail, should write length:%d", java.lang.Integer.valueOf(this.f356556b.length));
                    ((ll.d) this.f356563i).m(708);
                    return;
                }
            }
            if (audioTrack.getState() == 1) {
                audioTrack.reloadStaticData();
                h(this.f356561g);
                audioTrack.play();
                this.f356567p = java.lang.Thread.currentThread();
                try {
                    long j18 = this.f356562h.f282021d;
                    if (j18 <= 0) {
                        j17 = 2000;
                    } else {
                        j17 = j18 + (j18 < 1000 ? 240L : 120L);
                    }
                    java.lang.Thread.sleep(j17);
                } catch (java.lang.Exception unused) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioPcmStaticPlayComponent", "play Thread.sleep", null);
                }
            }
        }
    }

    @Override // pl.a
    public void f() {
        super.f();
        e();
        this.f356567p = null;
    }

    @Override // pl.a
    public void g() {
        long j17;
        android.media.AudioTrack audioTrack = this.f356555a;
        if (audioTrack == null || audioTrack.getState() != 1) {
            return;
        }
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioPcmStaticPlayComponent", "resume", null);
        ol.j jVar = this.f356563i;
        if (jVar != null) {
            ((ll.d) jVar).v();
        }
        try {
            float f17 = this.f356566l;
            audioTrack.setStereoVolume(f17, f17);
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioPcmStaticPlayComponent", e17, "setStereoVolume", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioPcmStaticPlayComponent", "play startPos:%d", java.lang.Integer.valueOf(this.f356564j));
        audioTrack.setPlaybackHeadPosition(this.f356564j);
        audioTrack.play();
        try {
            long j18 = this.f356562h.f282021d;
            if (j18 <= 0) {
                j17 = 2000;
            } else {
                j17 = j18 + (j18 < 1000 ? 240L : 120L);
            }
            java.lang.Thread.sleep(j17);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Mix.AudioPcmStaticPlayComponent", "play Thread.sleep", null);
        }
    }
}

package wo4;

/* loaded from: classes10.dex */
public final class g extends fs0.f {
    public final android.media.MediaFormat A;
    public volatile int B;
    public volatile int C;
    public long D;
    public long E;
    public long F;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f448261u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.ArrayList f448262v;

    /* renamed from: w, reason: collision with root package name */
    public volatile int f448263w;

    /* renamed from: x, reason: collision with root package name */
    public volatile int f448264x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f448265y;

    /* renamed from: z, reason: collision with root package name */
    public final android.os.HandlerThread f448266z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.util.List materials) {
        super(null, "background", -1L, -1L, null, null);
        java.util.Iterator it;
        kotlin.jvm.internal.o.g(materials, "materials");
        this.f448261u = materials;
        this.f448262v = new java.util.ArrayList();
        this.B = 1;
        this.C = 44100;
        this.D = 23L;
        this.E = -1L;
        java.util.Iterator it6 = materials.iterator();
        int i17 = 0;
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.tencent.mm.plugin.vlog.model.p0 p0Var = (com.tencent.mm.plugin.vlog.model.p0) next;
            if (p0Var instanceof com.tencent.mm.plugin.vlog.model.p1) {
                hs0.a aVar = new hs0.a(p0Var.f175710c);
                android.media.MediaFormat mediaFormat = aVar.f284552f;
                if (mediaFormat != null && mediaFormat.containsKey("frame-rate")) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "index:" + i17 + ", material:" + p0Var.f175710c + ", audioFps:" + mediaFormat.getInteger("frame-rate"));
                }
                com.tencent.mm.plugin.vlog.model.p1 p1Var = (com.tencent.mm.plugin.vlog.model.p1) p0Var;
                long j17 = p1Var.f175711d;
                it = it6;
                long j18 = (p0Var.f175709b - p0Var.f175708a) + j17;
                fs0.f hVar = fp.h.a(23) ? new fs0.h(aVar, "background", j17, j18, null, null) : new fs0.l(aVar, "background", j17, j18, null, null);
                hVar.f266215e = new wo4.b(this, i17, p0Var);
                hVar.f266216f = new wo4.c(this, i17, p0Var, hVar, aVar);
                this.f448262v.add(new wo4.d(i17, p1Var, hVar, aVar, j17, j18));
                com.tencent.mars.xlog.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "add video decoder, index:" + i17 + ", material:" + p0Var.f175710c + ", start:" + j17 + ',' + p0Var.f175708a + ", end:" + j18 + ',' + p0Var.f175709b);
            } else {
                it = it6;
            }
            it6 = it;
            i17 = i18;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "init finish, decoderList:" + this.f448262v.size());
        if (!this.f448262v.isEmpty()) {
            this.B = ((wo4.d) this.f448262v.get(0)).f448252c.a();
            this.C = ((wo4.d) this.f448262v.get(0)).f448252c.b();
            this.D = 23L;
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "init currentChannelCount:" + this.B + ", currentSampleRate:" + this.C + ", currentAudioFrameInterval:" + this.D);
        }
        int i19 = pu5.i.f358473b;
        android.os.HandlerThread a17 = pu5.f.a("VLogAudioBackgroundDecoder_sendVideoFrameDataThread", 5);
        this.f448266z = a17;
        a17.start();
        this.f448265y = new com.tencent.mm.sdk.platformtools.n3(a17.getLooper());
        android.media.MediaFormat mediaFormat2 = new android.media.MediaFormat();
        mediaFormat2.setString("mime", "audio/mp4a-latm");
        mediaFormat2.setInteger("aac-profile", 2);
        mediaFormat2.setInteger("sample-rate", 44100);
        mediaFormat2.setInteger("channel-count", 1);
        mediaFormat2.setInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, 64000);
        mediaFormat2.setInteger("max-input-size", 16384);
        this.A = mediaFormat2;
        this.f448263w = 0;
        this.f448264x = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "init finish, defaultMediaFormat:" + mediaFormat2);
    }

    @Override // fs0.f
    public int a() {
        return this.B;
    }

    @Override // fs0.f
    public int b() {
        return this.C;
    }

    @Override // fs0.f
    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "startDecoder: " + this.f448262v.size());
        if (!this.f448262v.isEmpty()) {
            this.F = 0L;
            this.f448264x = 0;
            this.f448263w = 0;
            com.tencent.mm.plugin.vlog.model.p0 p0Var = (com.tencent.mm.plugin.vlog.model.p0) this.f448261u.get(0);
            if (p0Var instanceof com.tencent.mm.plugin.vlog.model.n0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "firstMaterial is image, startTime:" + p0Var.f175708a + ", endTime:" + p0Var.f175709b);
                f(p0Var);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finish process first image material, index:");
                sb6.append(this.f448263w);
                com.tencent.mars.xlog.Log.i("MicroMsg.VLogAudioBackgroundDecoder", sb6.toString());
                g(this.f448264x, p0Var, null, null);
                return;
            }
            hs0.a aVar = ((wo4.d) this.f448262v.get(0)).f448253d;
            if (aVar.f284552f != null && aVar.f284550d >= 0) {
                this.B = ((wo4.d) this.f448262v.get(0)).f448252c.a();
                this.C = ((wo4.d) this.f448262v.get(0)).f448252c.b();
                this.E = -1L;
                ((wo4.d) this.f448262v.get(0)).f448252c.d();
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "first video not have audio:" + ((wo4.d) this.f448262v.get(0)).f448251b.f175710c);
            f(((wo4.d) this.f448262v.get(0)).f448251b);
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "finish process first mute video material");
            g(this.f448264x, ((wo4.d) this.f448262v.get(0)).f448251b, ((wo4.d) this.f448262v.get(0)).f448252c, ((wo4.d) this.f448262v.get(0)).f448253d);
        }
    }

    @Override // fs0.f
    public void e() {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.VLogAudioBackgroundDecoder", "stopDecoder, decoderStop:" + this.f266220j, new java.lang.Object[0]);
        if (!this.f266220j) {
            java.util.Iterator it = this.f448262v.iterator();
            while (it.hasNext()) {
                ((wo4.d) it.next()).f448252c.e();
            }
            this.f448262v.clear();
        }
        this.f448266z.quitSafely();
        this.f448263w = 0;
        this.f448264x = 0;
    }

    public final void f(com.tencent.mm.plugin.vlog.model.p0 p0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "dumpFakeMaterialDecodeData, currentChannelCount:" + this.B + ", currentSampleRate:" + this.C + ", currentAudioFrameInterval:" + this.D);
        long j17 = p0Var.f175708a;
        long j18 = p0Var.f175709b;
        long j19 = this.D;
        if (j19 <= 0) {
            throw new java.lang.IllegalArgumentException("Step must be positive, was: " + j19 + '.');
        }
        long b17 = sz5.b.b(j17, j18, j19);
        if (j17 > b17) {
            return;
        }
        while (true) {
            this.f448265y.post(new wo4.e(this));
            if (j17 == b17) {
                return;
            } else {
                j17 += j19;
            }
        }
    }

    public final void g(int i17, com.tencent.mm.plugin.vlog.model.p0 p0Var, fs0.f fVar, hs0.a aVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "videoDecodeEnd, index:" + i17 + ", material:" + p0Var.f175710c + ", currentPts:" + this.F);
        if (fVar != null) {
            try {
                fVar.e();
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "videoDecodeEnd release decoder and extractor error");
            }
        }
        if (aVar != null) {
            aVar.d();
        }
        int i18 = i17 + 1;
        if (i18 >= this.f448261u.size()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "finish decode all material");
            yz5.a aVar2 = this.f266216f;
            if (aVar2 != null) {
                return;
            }
            return;
        }
        com.tencent.mm.plugin.vlog.model.p0 p0Var2 = (com.tencent.mm.plugin.vlog.model.p0) this.f448261u.get(i18);
        this.f448264x = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "nextMaterial:" + p0Var2.f175710c);
        java.lang.Object obj = null;
        if (!(p0Var2 instanceof com.tencent.mm.plugin.vlog.model.p1)) {
            if (!(p0Var2 instanceof com.tencent.mm.plugin.vlog.model.n0)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "cannot find next material");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "next material is image, startTime:" + p0Var2.f175708a + ", endTime:" + p0Var2.f175709b);
            f(p0Var2);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finish process image material, index:");
            sb6.append(this.f448263w);
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogAudioBackgroundDecoder", sb6.toString());
            g(this.f448264x, p0Var2, null, null);
            return;
        }
        java.util.Iterator it = this.f448262v.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((wo4.d) next).f448250a == i18) {
                obj = next;
                break;
            }
        }
        wo4.d dVar = (wo4.d) obj;
        if (dVar != null) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("find start next decoder index:");
            sb7.append(i18);
            sb7.append(", hasAudio:");
            hs0.a aVar3 = dVar.f448253d;
            sb7.append(aVar3.f284552f != null && aVar3.f284550d >= 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogAudioBackgroundDecoder", sb7.toString());
            hs0.a aVar4 = dVar.f448253d;
            if (aVar4.f284552f != null && aVar4.f284550d >= 0) {
                this.B = dVar.f448252c.a();
                this.C = dVar.f448252c.b();
                this.E = -1L;
                dVar.f448252c.d();
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "next material not have audio: " + dVar.f448251b.f175710c);
                f(dVar.f448251b);
                com.tencent.mars.xlog.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "finish process mute video material, index:" + this.f448263w);
                g(this.f448264x, dVar.f448251b, dVar.f448252c, dVar.f448253d);
            }
        }
        this.f448263w = i18;
    }
}

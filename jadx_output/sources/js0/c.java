package js0;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f301459a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f301460b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f301461c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.p f301462d;

    /* renamed from: e, reason: collision with root package name */
    public final nl.d f301463e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f301464f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f301465g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f301466h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f301467i;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f301468j;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f301469k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f301470l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f301471m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Object f301472n;

    /* renamed from: o, reason: collision with root package name */
    public int f301473o;

    /* renamed from: p, reason: collision with root package name */
    public int f301474p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f301475q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f301476r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.Runnable f301477s;

    /* renamed from: t, reason: collision with root package name */
    public int f301478t;

    public c(int i17, int i18, boolean z17, boolean z18, yz5.a frameMix, yz5.p frameMixEnd) {
        kotlin.jvm.internal.o.g(frameMix, "frameMix");
        kotlin.jvm.internal.o.g(frameMixEnd, "frameMixEnd");
        this.f301459a = z17;
        this.f301460b = z18;
        this.f301461c = frameMix;
        this.f301462d = frameMixEnd;
        nl.d dVar = new nl.d();
        this.f301463e = dVar;
        this.f301464f = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f301465g = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f301466h = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f301470l = "MicroMsg.AudioMixCodec";
        this.f301471m = new java.lang.Object();
        this.f301472n = new java.lang.Object();
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioMixCodec", "init AudioMixCodec, sampleRate:" + i17 + ", channels:" + i18 + ", mixBackground:" + z17 + ", mixMusic:" + z18);
        int i19 = i18 * 2048;
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), 2};
        int i27 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioSyncMixController", "init, outSample:%d, outChannel:%d, outBitDepth:%d", objArr);
        dVar.f338138a = i17;
        dVar.f338139b = i18;
        dVar.f338140c = 2;
        dVar.f338141d = i19;
        if (i19 <= 0) {
            dVar.f338141d = ((((i17 * i18) * 16) * 20) / 8) / 1000;
        }
        this.f301477s = new js0.a(this);
    }

    public static final void a(js0.c cVar) {
        boolean z17;
        java.util.List pcmDataList = cVar.f301466h;
        kotlin.jvm.internal.o.f(pcmDataList, "pcmDataList");
        synchronized (pcmDataList) {
            cVar.f301466h.clear();
            com.tencent.mars.xlog.Log.i(cVar.f301470l, "getAudioData, background:" + cVar.f301464f.size() + ", music:" + cVar.f301465g.size());
            if (cVar.f301459a && cVar.f301464f.size() > 0) {
                hl.e eVar = (hl.e) cVar.f301464f.get(0);
                byte[] pcmData = eVar.f282038f;
                kotlin.jvm.internal.o.f(pcmData, "pcmData");
                int length = pcmData.length;
                int i17 = 0;
                while (true) {
                    if (i17 >= length) {
                        z17 = false;
                        break;
                    }
                    if (pcmData[i17] != 0) {
                        z17 = true;
                        break;
                    }
                    i17++;
                }
                if ((!z17) && (!cVar.f301459a || cVar.f301460b)) {
                    com.tencent.mars.xlog.Log.i(cVar.f301470l, "getAudioData background data zero");
                    cVar.f301464f.remove(eVar);
                }
                cVar.f301466h.add(eVar);
                cVar.f301464f.remove(eVar);
            }
            if (cVar.f301460b && cVar.f301465g.size() > 0) {
                hl.e eVar2 = (hl.e) cVar.f301465g.get(0);
                cVar.f301466h.add(eVar2);
                cVar.f301465g.remove(eVar2);
            }
            java.lang.String str = cVar.f301470l;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append("get audio data num ");
            int i18 = cVar.f301478t;
            cVar.f301478t = i18 + 1;
            sb6.append(i18);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
        }
    }

    public static final void b(js0.c cVar) {
        java.util.List pcmDataList = cVar.f301466h;
        kotlin.jvm.internal.o.f(pcmDataList, "pcmDataList");
        synchronized (pcmDataList) {
            com.tencent.mars.xlog.Log.i(cVar.f301470l, "the mix thread running mix " + cVar.f301478t + " pcmDataListSize: " + cVar.f301466h.size() + ", mixBackground:" + cVar.f301459a + ", mixMusic:" + cVar.f301460b);
            if (cVar.f301466h.size() > 0) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.addAll(cVar.f301466h);
                byte[] a17 = cVar.f301463e.a(arrayList);
                if (a17 != null) {
                    boolean z18 = cVar.f301460b;
                    long j17 = 0;
                    if (z18) {
                        java.util.List<hl.e> pcmDataList2 = cVar.f301466h;
                        kotlin.jvm.internal.o.f(pcmDataList2, "pcmDataList");
                        synchronized (pcmDataList2) {
                            for (hl.e eVar : pcmDataList2) {
                                if (kotlin.jvm.internal.o.b(eVar.f282033a, "music")) {
                                    j17 = eVar.f282037e;
                                    com.tencent.mars.xlog.Log.i(cVar.f301470l, "get pts from music: " + j17);
                                }
                            }
                        }
                        com.tencent.mars.xlog.Log.i(cVar.f301470l, "mix finish pcm frame size: " + a17.length + ", pts:" + j17 + ", cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                        cVar.f301462d.invoke(a17, java.lang.Long.valueOf(j17));
                    } else {
                        if (cVar.f301459a && !z18) {
                            java.util.List<hl.e> pcmDataList3 = cVar.f301466h;
                            kotlin.jvm.internal.o.f(pcmDataList3, "pcmDataList");
                            synchronized (pcmDataList3) {
                                for (hl.e eVar2 : pcmDataList3) {
                                    if (kotlin.jvm.internal.o.b(eVar2.f282033a, "background")) {
                                        j17 = eVar2.f282037e;
                                        com.tencent.mars.xlog.Log.i(cVar.f301470l, "get pts from background: " + j17);
                                    }
                                }
                            }
                        }
                        com.tencent.mars.xlog.Log.i(cVar.f301470l, "mix finish pcm frame size: " + a17.length + ", pts:" + j17 + ", cost:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                        cVar.f301462d.invoke(a17, java.lang.Long.valueOf(j17));
                    }
                }
            }
        }
    }

    public final boolean c(byte[] pcmData, java.lang.String audioId, long j17, int i17, int i18) {
        kotlin.jvm.internal.o.g(pcmData, "pcmData");
        kotlin.jvm.internal.o.g(audioId, "audioId");
        synchronized (this.f301471m) {
            try {
                com.tencent.mars.xlog.Log.i(this.f301470l, "pcmData len:" + pcmData.length + ", audioId:" + audioId + ", sampleRate:" + i17 + ", channelCount:" + i18 + ", pts:" + j17);
                hl.e eVar = new hl.e();
                eVar.f282033a = audioId;
                eVar.f282038f = pcmData;
                eVar.f282034b = i17;
                eVar.f282035c = i18;
                eVar.f282037e = j17;
                if (kotlin.jvm.internal.o.b(audioId, "background")) {
                    com.tencent.mars.xlog.Log.i(this.f301470l, "input the background data num = " + this.f301464f.size());
                    this.f301464f.add(eVar);
                    java.lang.String str = this.f301470l;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("input background data:");
                    int i19 = this.f301473o;
                    this.f301473o = i19 + 1;
                    sb6.append(i19);
                    com.tencent.mars.xlog.Log.i(str, sb6.toString());
                } else if (kotlin.jvm.internal.o.b(audioId, "music")) {
                    com.tencent.mars.xlog.Log.i(this.f301470l, "input the music data num = " + this.f301465g.size());
                    this.f301465g.add(eVar);
                    java.lang.String str2 = this.f301470l;
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("input music data:");
                    int i27 = this.f301474p;
                    this.f301474p = i27 + 1;
                    sb7.append(i27);
                    com.tencent.mars.xlog.Log.i(str2, sb7.toString());
                }
                boolean z17 = this.f301460b;
                try {
                    if (z17 && this.f301459a) {
                        if (this.f301465g.size() >= 1 && this.f301464f.size() >= 1) {
                            com.tencent.mars.xlog.Log.i(this.f301470l, "notify mix");
                            this.f301471m.notifyAll();
                        }
                    } else if ((z17 || this.f301459a) && (this.f301465g.size() >= 1 || this.f301464f.size() >= 1)) {
                        com.tencent.mars.xlog.Log.i(this.f301470l, "notify mix");
                        this.f301471m.notifyAll();
                    }
                } catch (java.lang.Exception unused) {
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(this.f301470l, e17, "", new java.lang.Object[0]);
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxPcmFrameMixFailed");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 24L, 1L);
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        if (r4.f301475q != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0064, code lost:
    
        if (r4.f301476r != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "inputEnd, audioId:"
            java.lang.String r1 = "audioId"
            kotlin.jvm.internal.o.g(r5, r1)
            java.lang.Object r1 = r4.f301471m
            monitor-enter(r1)
            java.lang.String r2 = r4.f301470l     // Catch: java.lang.Throwable -> L79
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L79
            r3.append(r5)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = ", mixBackground:"
            r3.append(r0)     // Catch: java.lang.Throwable -> L79
            boolean r0 = r4.f301459a     // Catch: java.lang.Throwable -> L79
            r3.append(r0)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = ", mixMusic:"
            r3.append(r0)     // Catch: java.lang.Throwable -> L79
            boolean r0 = r4.f301460b     // Catch: java.lang.Throwable -> L79
            r3.append(r0)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L79
            com.tencent.mars.xlog.Log.i(r2, r0)     // Catch: java.lang.Throwable -> L79
            java.lang.String r0 = "background"
            boolean r0 = kotlin.jvm.internal.o.b(r5, r0)     // Catch: java.lang.Throwable -> L79
            r2 = 1
            if (r0 == 0) goto L3a
            r4.f301475q = r2     // Catch: java.lang.Throwable -> L79
        L3a:
            java.lang.String r0 = "music"
            boolean r5 = kotlin.jvm.internal.o.b(r5, r0)     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L44
            r4.f301476r = r2     // Catch: java.lang.Throwable -> L79
        L44:
            boolean r5 = r4.f301459a     // Catch: java.lang.Throwable -> L79
            r0 = 0
            if (r5 == 0) goto L56
            boolean r3 = r4.f301460b     // Catch: java.lang.Throwable -> L79
            if (r3 == 0) goto L56
            boolean r5 = r4.f301476r     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L67
            boolean r5 = r4.f301475q     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L67
            goto L5c
        L56:
            if (r5 == 0) goto L5e
            boolean r5 = r4.f301475q     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L5e
        L5c:
            r0 = r2
            goto L67
        L5e:
            boolean r5 = r4.f301460b     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L67
            boolean r5 = r4.f301476r     // Catch: java.lang.Throwable -> L79
            if (r5 == 0) goto L67
            goto L5c
        L67:
            if (r0 == 0) goto L77
            r4.f301469k = r2     // Catch: java.lang.Exception -> L77 java.lang.Throwable -> L79
            java.lang.String r5 = r4.f301470l     // Catch: java.lang.Exception -> L77 java.lang.Throwable -> L79
            java.lang.String r0 = "notify mix"
            com.tencent.mars.xlog.Log.i(r5, r0)     // Catch: java.lang.Exception -> L77 java.lang.Throwable -> L79
            java.lang.Object r5 = r4.f301471m     // Catch: java.lang.Exception -> L77 java.lang.Throwable -> L79
            r5.notifyAll()     // Catch: java.lang.Exception -> L77 java.lang.Throwable -> L79
        L77:
            monitor-exit(r1)
            return
        L79:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: js0.c.d(java.lang.String):void");
    }
}

package ih2;

/* loaded from: classes10.dex */
public final class e implements hh2.a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f291558a;

    /* renamed from: b, reason: collision with root package name */
    public final ny5.a f291559b = new ny5.e(ih2.d.f291557d);

    /* renamed from: c, reason: collision with root package name */
    public ny5.c f291560c = ny5.c.reverbRecordingStudio;

    /* renamed from: d, reason: collision with root package name */
    public final lh2.a f291561d = new lh2.a("tme_reverb_temp.pcm");

    /* renamed from: e, reason: collision with root package name */
    public hh2.b f291562e;

    @Override // hh2.a
    public void a(hh2.b callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f291562e = callback;
    }

    @Override // hh2.a
    public boolean b(om2.m type) {
        kotlin.jvm.internal.o.g(type, "type");
        this.f291560c = d(type);
        if (!this.f291558a) {
            return false;
        }
        boolean a17 = ((ny5.e) this.f291559b).a(d(type));
        com.tencent.mars.xlog.Log.i("KTVReverbTMECore", "setReverbId type: " + type + " res: " + a17);
        return a17;
    }

    @Override // hh2.a
    public void c(com.tencent.trtc.TRTCCloudDef.TRTCAudioFrame audioFrame) {
        boolean z17;
        boolean z18;
        boolean z19;
        int init;
        kotlin.jvm.internal.o.g(audioFrame, "audioFrame");
        boolean z27 = this.f291558a;
        ny5.a aVar = this.f291559b;
        if (!z27) {
            int i17 = audioFrame.sampleRate;
            int i18 = audioFrame.channel;
            ny5.e eVar = (ny5.e) aVar;
            eVar.getClass();
            com.tme.karaoke.lib_singreverb.ReverbNativeBridge.Companion.getClass();
            z19 = com.tme.karaoke.lib_singreverb.ReverbNativeBridge.loadRet;
            if (z19) {
                init = eVar.f341481b.init(i17, i18);
                yz5.l lVar = eVar.f341480a;
                if (lVar != null) {
                    lVar.invoke(kz5.c1.k(new jz5.l(com.tencent.tmassistantsdk.openSDK.OpenSDKTool4Assistant.EXTRA_ERROR_CODE, java.lang.String.valueOf(init)), new jz5.l("type", "reverb")));
                }
            } else {
                init = -1000;
            }
            com.tencent.mars.xlog.Log.i("KTVReverbTMECore", "init  res: " + init + " setRes: " + eVar.a(this.f291560c));
            this.f291558a = true;
            hh2.b bVar = this.f291562e;
            if (bVar != null) {
                ((dh2.v) bVar).f232465a.f232475o = init;
                com.tencent.mars.xlog.Log.i("KTVSongPlayManager", "onReverbInitResult: " + init);
            }
            if (init != 0) {
                pm0.z.b(xy2.b.f458155b, "tmeReverbInitError", false, null, null, false, false, new ih2.c(init, audioFrame), 60, null);
            }
        }
        if (this.f291558a) {
            byte[] data = audioFrame.data;
            kotlin.jvm.internal.o.f(data, "data");
            int length = audioFrame.data.length;
            ny5.e eVar2 = (ny5.e) aVar;
            eVar2.getClass();
            com.tme.karaoke.lib_singreverb.ReverbNativeBridge.Companion.getClass();
            z17 = com.tme.karaoke.lib_singreverb.ReverbNativeBridge.loadRet;
            if (z17) {
                java.nio.ByteBuffer tempBuffer = eVar2.f341482c;
                if (tempBuffer == null) {
                    tempBuffer = java.nio.ByteBuffer.allocateDirect(length);
                }
                eVar2.f341482c = tempBuffer;
                kotlin.jvm.internal.o.f(tempBuffer, "tempBuffer");
                int i19 = length;
                while (i19 > 0) {
                    tempBuffer.clear();
                    int min = java.lang.Math.min(java.lang.Math.min(length, tempBuffer.limit()), i19);
                    int i27 = length - i19;
                    tempBuffer.put(data, i27, min);
                    if (eVar2.f341481b.voicePreProcess(tempBuffer, min) < 0) {
                        break;
                    }
                    tempBuffer.flip();
                    tempBuffer.get(data, i27, min);
                    i19 -= min;
                }
            }
            byte[] data2 = audioFrame.data;
            kotlin.jvm.internal.o.f(data2, "data");
            int length2 = audioFrame.data.length;
            eVar2.getClass();
            com.tme.karaoke.lib_singreverb.ReverbNativeBridge.Companion.getClass();
            z18 = com.tme.karaoke.lib_singreverb.ReverbNativeBridge.loadRet;
            if (z18) {
                java.nio.ByteBuffer tempBuffer2 = eVar2.f341483d;
                if (tempBuffer2 == null) {
                    tempBuffer2 = java.nio.ByteBuffer.allocateDirect(length2);
                }
                eVar2.f341483d = tempBuffer2;
                kotlin.jvm.internal.o.f(tempBuffer2, "tempBuffer");
                int i28 = length2;
                while (i28 > 0) {
                    tempBuffer2.clear();
                    int min2 = java.lang.Math.min(java.lang.Math.min(length2, tempBuffer2.limit()), i28);
                    int i29 = length2 - i28;
                    tempBuffer2.put(data2, i29, min2);
                    if (eVar2.f341481b.voicePostProcess(tempBuffer2, min2) < 0) {
                        break;
                    }
                    tempBuffer2.flip();
                    tempBuffer2.get(data2, i29, min2);
                    i28 -= min2;
                }
            }
            byte[] data3 = audioFrame.data;
            kotlin.jvm.internal.o.f(data3, "data");
            this.f291561d.b(data3, audioFrame.data.length);
        }
    }

    public final ny5.c d(om2.m mVar) {
        int i17 = mVar.f346356d;
        om2.m mVar2 = om2.m.f346347g;
        if (i17 == 15) {
            return ny5.c.reverbSinger;
        }
        om2.m mVar3 = om2.m.f346347g;
        if (i17 == 9) {
            return ny5.c.reverbTheater;
        }
        om2.m mVar4 = om2.m.f346347g;
        if (i17 == 10) {
            return ny5.c.reverChurch;
        }
        om2.m mVar5 = om2.m.f346347g;
        if (i17 == 11) {
            return ny5.c.reverbConcertHall;
        }
        om2.m mVar6 = om2.m.f346347g;
        if (i17 == 12) {
            return ny5.c.reverbPianoRoom;
        }
        om2.m mVar7 = om2.m.f346347g;
        if (i17 == 13) {
            return ny5.c.reverbOriginalSound;
        }
        om2.m mVar8 = om2.m.f346347g;
        return i17 == 14 ? ny5.c.reverbCD : ny5.c.reverbRecordingStudio;
    }
}

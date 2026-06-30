package wo;

/* loaded from: classes14.dex */
public class y0 {
    public boolean a(java.lang.String str, wo.u uVar, wo.e eVar, wo.c cVar, wo.o oVar, wo.o1 o1Var, wo.x1 x1Var, wo.z0 z0Var, wo.h1 h1Var, wo.u1 u1Var, wo.g1 g1Var, wo.b bVar, wo.g1 g1Var2) {
        java.lang.String str2;
        java.lang.Exception exc;
        wo.c cVar2;
        wo.o oVar2;
        boolean z17;
        wo.x1 x1Var2;
        try {
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "deviceinfoconfig", null);
            try {
                if (d17 == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.DeviceInfoParser", "hy: null device config");
                    return false;
                }
                if (d17.get(".deviceinfoconfig.voip.cpu.armv7") != null) {
                    uVar.f447804b = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.cpu.armv7"), 0);
                    uVar.f447803a = true;
                }
                if (d17.get(".deviceinfoconfig.voip.cpu.armv6") != null) {
                    uVar.f447805c = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.cpu.armv6"), 0);
                    uVar.f447803a = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.num") != null) {
                    eVar.f447656a = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.num"), 0);
                    eVar.f447657b = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.surface") != null) {
                    eVar.f447658c = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.surface"), 0);
                    eVar.f447659d = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.format") != null) {
                    eVar.f447662g = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.format"), 0);
                    eVar.f447663h = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.autofloatcamera") != null) {
                    eVar.f447660e = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.autofloatcamera"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.manufloat") != null) {
                    eVar.f447661f = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.manufloat"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.back.enable") != null) {
                    eVar.f447666k.f447643a = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.back.enable"), 0);
                    eVar.f447667l = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.back.fps") != null) {
                    eVar.f447666k.f447644b = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.back.fps"), 0);
                    eVar.f447667l = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.back.orien") != null) {
                    eVar.f447666k.f447645c = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.back.orien"), 0);
                    eVar.f447667l = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.back.rotate") != null) {
                    eVar.f447666k.f447646d = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.back.rotate"), 0);
                    eVar.f447667l = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.back.isleft") != null) {
                    eVar.f447666k.f447647e = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.back.isleft"), 0);
                    eVar.f447667l = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.back.width") != null) {
                    eVar.f447666k.f447648f = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.back.width"), 0);
                    eVar.f447667l = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.back.height") != null) {
                    eVar.f447666k.f447649g = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.back.height"), 0);
                    eVar.f447667l = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.front.enable") != null) {
                    eVar.f447664i.f447643a = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.front.enable"), 0);
                    eVar.f447665j = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.front.fps") != null) {
                    eVar.f447664i.f447644b = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.front.fps"), 0);
                    eVar.f447665j = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.front.orien") != null) {
                    eVar.f447664i.f447645c = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.front.orien"), 0);
                    eVar.f447665j = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.front.rotate") != null) {
                    eVar.f447664i.f447646d = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.front.rotate"), 0);
                    eVar.f447665j = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.front.isleft") != null) {
                    eVar.f447664i.f447647e = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.front.isleft"), 0);
                    eVar.f447665j = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.front.width") != null) {
                    eVar.f447664i.f447648f = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.front.width"), 0);
                    eVar.f447665j = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.front.height") != null) {
                    eVar.f447664i.f447649g = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.front.height"), 0);
                    eVar.f447665j = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.videorecord.frotate") != null) {
                    eVar.f447669n = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.videorecord.frotate"), 0);
                    eVar.f447668m = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.videorecord.forientation") != null) {
                    eVar.f447670o = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.videorecord.forientation"), 0);
                    eVar.f447668m = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.videorecord.brotate") != null) {
                    eVar.f447671p = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.videorecord.brotate"), 0);
                    eVar.f447668m = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.videorecord.borientation") != null) {
                    eVar.f447672q = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.videorecord.borientation"), 0);
                    eVar.f447668m = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.videorecord.num") != null) {
                    eVar.f447673r = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.videorecord.num"), 0);
                    eVar.f447674s = true;
                    eVar.f447668m = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.videorecord.api20") != null) {
                    eVar.f447676u = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.videorecord.api20"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.setframerate") != null) {
                    eVar.f447675t = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.setframerate"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.scannerFocusThreshold") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.scannerFocusThreshold"), 0);
                    eVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.camera.scannerImageQuality") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.scannerImageQuality"), 0);
                    eVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.camera.autoFocusTimeInterval") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.autoFocusTimeInterval"), 0);
                    eVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.camera.focusType") != null) {
                    eVar.H = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.focusType"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.videorecord.num") != null) {
                    eVar.f447673r = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.videorecord.num"), 0);
                    eVar.f447674s = true;
                    eVar.f447668m = true;
                }
                if (d17.get(".deviceinfoconfig.voip.camera.videorecord.api20") != null) {
                    eVar.f447676u = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.videorecord.api20"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.setframerate") != null) {
                    eVar.f447675t = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.setframerate"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.useFixFPSMode") != null) {
                    eVar.f447677v = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.useFixFPSMode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.useRangeFPSMode") != null) {
                    eVar.f447678w = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.useRangeFPSMode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.setYUV420SPFormat") != null) {
                    eVar.f447679x = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.setYUV420SPFormat"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.useMeteringMode") != null) {
                    eVar.f447680y = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.useMeteringMode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.useContinueVideoFocusMode") != null) {
                    eVar.f447681z = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.useContinueVideoFocusMode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.mUsestabilizationsupported") != null) {
                    eVar.A = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.mUsestabilizationsupported"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.sightCameraID") != null) {
                    eVar.B = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.sightCameraID"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.needEnhance") != null) {
                    eVar.C = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.needEnhance"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.support480enc") != null) {
                    eVar.D = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.support480enc"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.supportHWenc") != null) {
                    eVar.E = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.supportHWenc"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.voipBeauty") != null) {
                    eVar.I = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.voipBeauty"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.voipBeautyWhite") != null) {
                    eVar.f447655J = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.voipBeautyWhite"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.enable720cap") != null) {
                    eVar.F = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.enable720cap"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.mEnc720pCfg") != null) {
                    eVar.G = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.mEnc720pCfg"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.stFilter") != null) {
                    eVar.K = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.stFilter"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.stFilteroff") != null) {
                    eVar.L = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.stFilteroff"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.fpsMin") != null) {
                    eVar.M = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.fpsMin"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.fpsMax") != null) {
                    eVar.N = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.fpsMax"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.autoRotate") != null) {
                    eVar.O = com.tencent.mm.sdk.platformtools.t8.y((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.autoRotate"), false);
                }
                if (d17.get(".deviceinfoconfig.voip.camera.sharpenFilter") != null) {
                    eVar.P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.camera.sharpenFilter"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.streamtype") != null) {
                    cVar2 = cVar;
                    cVar2.f447591b = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.streamtype"), 0);
                    cVar2.f447589a = true;
                } else {
                    cVar2 = cVar;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.smode") != null) {
                    cVar2.f447593c = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.smode"), 0);
                    cVar2.f447589a = true;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.omode") != null) {
                    cVar2.f447595d = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.omode"), 0);
                    cVar2.f447589a = true;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.ospeaker") != null) {
                    cVar2.f447597e = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.ospeaker"), 0);
                    cVar2.f447589a = true;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.operating") != null) {
                    cVar2.f447599f = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.operating"), 0);
                    cVar2.f447589a = true;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.moperating") != null) {
                    cVar2.f447601g = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.moperating"), 0);
                    cVar2.f447589a = true;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mstreamtype") != null) {
                    cVar2.f447603h = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mstreamtype"), 0);
                    cVar2.f447589a = true;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.recordmode") != null) {
                    cVar2.f447605i = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.recordmode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.playenddelay") != null) {
                    cVar2.f447607j = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.playenddelay"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.aecmode") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.aecmode"), 0);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.nsmode") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.nsmode"), 0);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.volummode") != null) {
                    cVar2.f447609k = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.volummode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.sourcemode") != null) {
                    cVar2.A = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.sourcemode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.micmode") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.micmode"), 0);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.speakerMode") != null) {
                    cVar2.B = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.speakerMode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.phoneMode") != null) {
                    cVar2.C = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.phoneMode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.deviceinfo.voipstreamType") != null) {
                    cVar2.D = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.deviceinfo.voipstreamType"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.speakerstreamtype") != null) {
                    cVar2.E = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.speakerstreamtype"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.phonestreamtype") != null) {
                    cVar2.F = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.phonestreamtype"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.ringphonestream") != null) {
                    cVar2.H = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.ringphonestream"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.ringphonemode") != null) {
                    cVar2.I = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.ringphonemode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.ringspeakerstream") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.ringspeakerstream"), 0);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.ringspeakermode") != null) {
                    cVar2.f447588J = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.ringspeakermode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.aecmodenew") != null) {
                    cVar2.K = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.aecmodenew"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.nsmodenew") != null) {
                    cVar2.L = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.nsmodenew"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.nsModeNewMulti") != null) {
                    cVar2.M = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.nsModeNewMulti"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.voipfullbandcfg") != null) {
                    cVar2.N = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.voipfullbandcfg"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agcmodenew") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agcmodenew"), 0);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agcmode") != null) {
                    cVar2.O = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agcmode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agctargetdb") != null) {
                    cVar2.P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agctargetdb"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agcgaindb") != null) {
                    cVar2.Q = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agcgaindb"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agcspkgaindb") != null) {
                    cVar2.T = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agcspkgaindb"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agcphngaindb") != null) {
                    cVar2.U = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agcphngaindb"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agchdsgaindb") != null) {
                    cVar2.V = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agchdsgaindb"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.playvolvoip") != null) {
                    cVar2.W = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.playvolvoip"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.playvolmt") != null) {
                    cVar2.X = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.playvolmt"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agcflag") != null) {
                    cVar2.R = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agcflag"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agclimiter") != null) {
                    cVar2.S = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agclimiter"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agcCompRatio") != null) {
                    cVar2.Y = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agcCompRatio"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agcDnGainThr") != null) {
                    cVar2.Z = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agcDnGainThr"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.waveAgcMode") != null) {
                    cVar2.f447590a0 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.waveAgcMode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.waveAgcSpkGain") != null) {
                    cVar2.f447592b0 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.waveAgcSpkGain"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.waveAgcPhnGain") != null) {
                    cVar2.f447594c0 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.waveAgcPhnGain"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.waveAgcHeadsetGain") != null) {
                    cVar2.f447596d0 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.waveAgcHeadsetGain"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.waveAgcCRatio") != null) {
                    cVar2.f447600f0 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.waveAgcCRatio"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.waveAgcDnTHR") != null) {
                    cVar2.f447602g0 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.waveAgcDnTHR"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.waveAgcTarget") != null) {
                    cVar2.f447598e0 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.waveAgcTarget"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.waveAgcBase") != null) {
                    cVar2.f447604h0 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.waveAgcBase"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.waveAgcGainTHR") != null) {
                    cVar2.f447606i0 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.waveAgcGainTHR"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.waveAgcDampTHR") != null) {
                    cVar2.f447608j0 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.waveAgcDampTHR"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.waveAgcDamper") != null) {
                    cVar2.f447610k0 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.waveAgcDamper"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.inputvolumescale") != null) {
                    cVar2.f447611l = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.inputvolumescale"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.outputvolumescale") != null) {
                    cVar2.f447613m = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.outputvolumescale"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.inputvolumescaleforspeaker") != null) {
                    cVar2.f447615n = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.inputvolumescaleforspeaker"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.outputvolumescaleforspeaker") != null) {
                    cVar2.f447617o = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.outputvolumescaleforspeaker"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.ehanceheadsetec") != null) {
                    cVar2.f447631v = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.ehanceheadsetec"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.setecmodelevelforheadset") != null) {
                    cVar2.f447633w = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.setecmodelevelforheadset"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.setecmodelevelforspeaker") != null) {
                    cVar2.f447635x = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.setecmodelevelforspeaker"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.enablespeakerenhanceec") != null) {
                    cVar2.f447637y = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.enablespeakerenhanceec"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.enablerectimer") != null) {
                    cVar2.f447612l0 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.enablerectimer"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.enablePlayTimer") != null) {
                    cVar2.f447614m0 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.enablePlayTimer"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof0") != null) {
                    cVar2.f447618o0[0] = (short) com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof0"), 0);
                    cVar2.f447616n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof1") != null) {
                    cVar2.f447618o0[1] = (short) com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof1"), 0);
                    cVar2.f447616n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof2") != null) {
                    cVar2.f447618o0[2] = (short) com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof2"), 0);
                    cVar2.f447616n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof3") != null) {
                    cVar2.f447618o0[3] = (short) com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof3"), 0);
                    cVar2.f447616n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof4") != null) {
                    cVar2.f447618o0[4] = (short) com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof4"), 0);
                    cVar2.f447616n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof5") != null) {
                    cVar2.f447618o0[5] = (short) com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof5"), 0);
                    cVar2.f447616n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof6") != null) {
                    cVar2.f447618o0[6] = (short) com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof6"), 0);
                    cVar2.f447616n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof7") != null) {
                    cVar2.f447618o0[7] = (short) com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof7"), 0);
                    cVar2.f447616n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof8") != null) {
                    cVar2.f447618o0[8] = (short) com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof8"), 0);
                    cVar2.f447616n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof9") != null) {
                    cVar2.f447618o0[9] = (short) com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof9"), 0);
                    cVar2.f447616n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof10") != null) {
                    cVar2.f447618o0[10] = (short) com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof10"), 0);
                    cVar2.f447616n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof11") != null) {
                    cVar2.f447618o0[11] = (short) com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof11"), 0);
                    cVar2.f447616n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof12") != null) {
                    cVar2.f447618o0[12] = (short) com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof12"), 0);
                    cVar2.f447616n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof13") != null) {
                    cVar2.f447618o0[13] = (short) com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof13"), 0);
                    cVar2.f447616n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctcof.cof14") != null) {
                    cVar2.f447618o0[14] = (short) com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctcof.cof14"), 0);
                    cVar2.f447616n0 = 1;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.correctoff") != null && com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.correctoff"), 0) == 1) {
                    cVar2.f447616n0 = 0;
                }
                if (d17.get(".deviceinfoconfig.voip.audio.outputvolumegainforphone") != null) {
                    cVar2.f447619p = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.outputvolumegainforphone"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.outputvolumegainforspeaker") != null) {
                    cVar2.f447621q = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.outputvolumegainforspeaker"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.noisegatestrength.cof0") != null) {
                    cVar2.f447620p0[0] = (short) com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.noisegatestrength.cof0"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.noisegatestrength.cof1") != null) {
                    cVar2.f447620p0[1] = (short) com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.noisegatestrength.cof1"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agcrxflag") != null) {
                    cVar2.f447638y0 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agcrxflag"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agcrxtargetdb") != null) {
                    cVar2.f447640z0 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agcrxtargetdb"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agcrxgaindb") != null) {
                    cVar2.A0 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agcrxgaindb"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.agcrxlimiter") != null) {
                    cVar2.B0 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.agcrxlimiter"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.spkecenable") != null) {
                    cVar2.f447622q0 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.spkecenable"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.enableXnoiseSup") != null) {
                    cVar2.f447639z = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.enableXnoiseSup"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.playenddelay") != null) {
                    cVar2.f447607j = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.playenddelay"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dFlag") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dFlag"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dAzim1") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dAzim1"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dAzim2") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dAzim2"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dAzim3") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dAzim3"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dAzim4") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dAzim4"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dAzim5") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dAzim5"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dAzim6") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dAzim6"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dAzim7") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dAzim7"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dAzim8") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dAzim8"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dElvl1") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dElvl1"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dElvl2") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dElvl2"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dElvl3") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dElvl3"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dElvl4") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dElvl4"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dElvl5") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dElvl5"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dElvl6") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dElvl6"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dElvl7") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dElvl7"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dElvl8") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dElvl8"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.forbiddenUseSco") != null) {
                    cVar2.f447623r = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.forbidSco"), -1);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.audioForbiddenStrategy") != null) {
                    cVar2.f447625s = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.audioForbiddenStrategy"), -1);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.audioForbiddenRefreshTime") != null) {
                    cVar2.f447627t = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.audioForbiddenRefreshTime"), -1);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.audioForbiddenRequestTimes") != null) {
                    cVar2.f447629u = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.audioForbiddenRequestTimes"), -1);
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dPhi") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dPhi"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dTheta1") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dTheta1"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.audio.mt3dTheta2") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.audio.mt3dTheta2"), -1);
                    cVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.ipcall.speakermode") != null) {
                    cVar2.f447626s0 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.ipcall.speakermode"), 0);
                    cVar2.f447624r0 = true;
                }
                if (d17.get(".deviceinfoconfig.voip.ipcall.phonemode") != null) {
                    cVar2.f447628t0 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.ipcall.phonemode"), 0);
                    cVar2.f447624r0 = true;
                }
                if (d17.get(".deviceinfoconfig.voip.ipcall.sourcemode") != null) {
                    cVar2.f447630u0 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.ipcall.sourcemode"), 0);
                    cVar2.f447624r0 = true;
                }
                if (d17.get(".deviceinfoconfig.voip.ipcall.streamtype") != null) {
                    cVar2.f447632v0 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.ipcall.streamtype"), 0);
                    cVar2.f447624r0 = true;
                }
                if (d17.get(".deviceinfoconfig.voip.ipcall.speakerstreamtype") != null) {
                    cVar2.f447634w0 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.ipcall.speakerstreamtype"), 0);
                    cVar2.f447624r0 = true;
                }
                if (d17.get(".deviceinfoconfig.voip.ipcall.phonestreamtype") != null) {
                    cVar2.f447636x0 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.ipcall.phonestreamtype"), 0);
                    cVar2.f447624r0 = true;
                }
                if (d17.get(".deviceinfoconfig.voip.common.js") != null) {
                    oVar.getClass();
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.js"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.js") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.js"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.stopbluetoothbr") != null) {
                    oVar2 = oVar;
                    oVar2.f447743a = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.stopbluetoothbr"), 0);
                } else {
                    oVar2 = oVar;
                }
                if (d17.get(".deviceinfoconfig.voip.common.stopbluetoothbu") != null) {
                    oVar2.f447744b = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.stopbluetoothbu"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.setbluetoothscoon") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.setbluetoothscoon"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.startbluetoothsco") != null) {
                    oVar2.f447745c = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.startbluetoothsco"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.voicesearchfastmode") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.voicesearchfastmode"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.pcmreadmode") != null) {
                    oVar2.f447747e = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.pcmreadmode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.pcmbufferrate") != null) {
                    oVar2.f447746d = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.pcmbufferrate"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.app") != null) {
                    oVar2.f447748f = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.app"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.deviceinfo.voipapp") != null) {
                    oVar2.f447760r = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.deviceinfo.voipapp"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.deviceinfo.voipappns") != null) {
                    oVar2.f447761s = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.deviceinfo.voipappns"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.deviceinfo.voipappaec") != null) {
                    oVar2.f447762t = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.deviceinfo.voipappaec"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.deviceinfo.voipappagc") != null) {
                    oVar2.f447763u = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.deviceinfo.voipappagc"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.voipnewrenderer") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.voipnewrenderer"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.voipUseRemovePreviewCallback") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.voipUseRemovePreviewCallback"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.voipForceUseEncodeMode") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.voipForceUseEncodeMode"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.voipFaceBeautyUseHighRank") != null) {
                    oVar2.f447767y = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.voipFaceBeautyUseHighRank"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.voipUseCameraApi2") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.voipUseCameraApi2"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.voipUseNewCameraModular") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.voipUseNewCameraModular"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.voipgpurgb2yuv") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.voipgpurgb2yuv"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.voipgpucrop") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.voipgpucrop"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.groupRs") != null) {
                    oVar2.f447759q = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.groupRs"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.vmfd") != null) {
                    oVar2.f447749g = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.vmfd"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.htcvoicemode") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.htcvoicemode"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.samsungvoicemode") != null) {
                    oVar2.f447750h = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.samsungvoicemode"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.speexbufferrate") != null) {
                    oVar2.f447751i = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.speexbufferrate"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.linespe") != null) {
                    oVar2.f447752j = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.linespe"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.fixspan") != null) {
                    oVar2.f447758p = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.fixspan"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.extvideo") != null) {
                    oVar2.f447753k = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.extvideo"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.extvideosam") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.extvideosam"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.sysvideodegree") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.sysvideodegree"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.mmnotify") != null) {
                    oVar2.f447755m = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.mmnotify"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.extsharevcard") != null) {
                    oVar2.f447754l = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.extsharevcard"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.audioformat") != null) {
                    oVar2.f447756n = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.audioformat"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.qrcam") != null) {
                    oVar2.f447757o = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.qrcam"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.sysvideofdegree") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.sysvideofdegree"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.audioformat") != null) {
                    oVar2.f447756n = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.audioformat"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.qrcam") != null) {
                    oVar2.f447757o = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.qrcam"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.common.base") != null) {
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.packageinfo") != null) {
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.classloader") != null) {
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.resources") != null) {
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.sysvideofp") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.sysvideofp"), 0);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.extstoragedir") != null) {
                    oVar2.f447768z = (java.lang.String) d17.get(".deviceinfoconfig.voip.common.extstoragedir");
                }
                if (d17.get(".deviceinfoconfig.voip.common.extpubdir") != null) {
                    oVar2.A = (java.lang.String) d17.get(".deviceinfoconfig.voip.common.extpubdir");
                }
                if (d17.get(".deviceinfoconfig.voip.common.extdatadir") != null) {
                    oVar2.B = (java.lang.String) d17.get(".deviceinfoconfig.voip.common.extdatadir");
                }
                if (d17.get(".deviceinfoconfig.voip.common.extrootdir") != null) {
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.extstoragestate") != null) {
                    oVar2.C = (java.lang.String) d17.get(".deviceinfoconfig.voip.common.extstoragestate");
                }
                if (d17.get(".deviceinfoconfig.voip.common.extcachedir") != null) {
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.extvideoplayer") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.extvideoplayer"), -1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.loadDrawable") != null) {
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.loadXmlResourceParser") != null) {
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.sensorNearFar") != null && 1 == com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.sensorNearFar"), 0)) {
                    int i17 = com.tencent.mm.sdk.platformtools.SensorController.f192428p;
                }
                if (d17.get(".deviceinfoconfig.voip.common.sensorNearFarDivideRatio") != null) {
                    com.tencent.mm.sdk.platformtools.SensorController.f192427o = com.tencent.mm.sdk.platformtools.t8.F((java.lang.String) d17.get(".deviceinfoconfig.voip.common.sensorNearFarDivideRatio"), 0.0d);
                }
                if (d17.get(".deviceinfoconfig.voip.common.sightFullType") != null) {
                    oVar2.D = (java.lang.String) d17.get(".deviceinfoconfig.voip.common.sightFullType");
                }
                if (d17.get(".deviceinfoconfig.voip.common.slyTextureView") != null) {
                    oVar2.E = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.slyTextureView"), -1);
                }
                if (d17.get(".deviceinfoconfig.voip.common.checkSightDraftMd5") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.checkSightDraftMd5"), 1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.swipeBackConfig") != null) {
                    int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.swipeBackConfig"), 1);
                    oVar.getClass();
                    ep.a.b(P == 1);
                }
                if (d17.get(".deviceinfoconfig.voip.common.canDecodeWebp") != null) {
                    oVar2.F = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.canDecodeWebp"), 1);
                }
                if (d17.get(".deviceinfoconfig.voip.common.isScanZoom") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.isScanZoom"), -1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.scanMaxZoomDivideRatio") != null) {
                    com.tencent.mm.sdk.platformtools.t8.F((java.lang.String) d17.get(".deviceinfoconfig.voip.common.scanMaxZoomDivideRatio"), -1.0d);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.notificationSetMode") != null) {
                    oVar2.G = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.notificationSetMode"), -1);
                }
                if (d17.get(".deviceinfoconfig.voip.common.hevcTransCodeMediaCodec") != null) {
                    oVar2.H = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.hevcTransCodeMediaCodec"), -1);
                }
                if (d17.get(".deviceinfoconfig.voip.common.videoSupportHevcDecode") != null) {
                    oVar2.I = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.videoSupportHevcDecode"), -1);
                }
                if (d17.get(".deviceinfoconfig.voip.common.checkOnPauseWindowsFocus") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.checkOnPauseWindowsFocus"), 1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.vcodec1MaxEncRes") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.vcodec1MaxEncRes"), -1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.vcodec2MaxEncRes") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.vcodec2MaxEncRes"), -1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.hw264MaxEncRes") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.hw264MaxEncRes"), -1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.hw265MaxEncRes") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.hw265MaxEncRes"), -1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.vcodec1MixMaxEncRes") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.vcodec1MixMaxEncRes"), -1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.vcodec1MaxDecRes") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.vcodec1MaxDecRes"), -1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.vcodec2MaxDecRes") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.vcodec2MaxDecRes"), -1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.hw264MaxDecRes") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.hw264MaxDecRes"), -1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.hw265MaxDecRes") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.hw265MaxDecRes"), -1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.common.vcodec1MaxDecRes") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.common.vcodec1MixMaxDecRes"), -1);
                    oVar.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.mediaRecorder.useThisInfo") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.mediaRecorder.useThisInfo"), 0);
                    o1Var.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.mediaRecorder.width") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.mediaRecorder.width"), 0);
                    o1Var.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.mediaRecorder.height") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.mediaRecorder.height"), 0);
                    o1Var.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.mediaRecorder.frameRate") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.mediaRecorder.frameRate"), 0);
                    o1Var.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.mediaRecorder.encodingBitRate") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.mediaRecorder.encodingBitRate"), 0);
                    o1Var.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.mediaRecorder.useSystem") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.mediaRecorder.useSystem"), 0);
                    o1Var.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.mediaRecorder.yuv420SPSeek") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.mediaRecorder.yuv420SPSeek"), 0);
                    o1Var.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.mediaRecorder.useMediaCodecEncodeAAC") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.mediaRecorder.useMediaCodecEncodeAAC"), 0);
                    o1Var.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.mediaRecorder.AACSampleRate") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.mediaRecorder.AACSampleRate"), 0);
                    o1Var.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.mediaRecorder.useTextureViewForCamera") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.mediaRecorder.useTextureViewForCamera"), 0);
                    o1Var.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.mediaRecorder.useFDWithFileSize") != null) {
                    o1Var.f447770a = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.mediaRecorder.useFDWithFileSize"), 0);
                }
                if (d17.get(".deviceinfoconfig.voip.webview.notifythread") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.webview.notifythread"), 0);
                    x1Var.getClass();
                }
                if (d17.get(".deviceinfoconfig.voip.webview.forceUseSysWebView") != null) {
                    if (com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.voip.webview.forceUseSysWebView"), 0) == 1) {
                        x1Var2 = x1Var;
                        z17 = true;
                    } else {
                        z17 = false;
                        x1Var2 = x1Var;
                    }
                    x1Var2.f447866a = z17;
                    com.tencent.mars.xlog.Log.i("MicroMsg.DeviceInfoParser", "save forceusesystemwebview = %b", java.lang.Boolean.valueOf(z17));
                    com.tencent.mm.sdk.platformtools.x2.b().getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).edit().putBoolean("tbs_force_user_sys_webview", x1Var2.f447866a).commit();
                }
                oVar.a();
                int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.fingerprint.forceFingerprintStatus"), 0);
                int P3 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.fingerprint.supportExportEntrance"), 0);
                com.tencent.mars.xlog.Log.i("MicroMsg.DeviceInfoParser", "hy: got fingerprint force status: %d", java.lang.Integer.valueOf(P2));
                if (z0Var != null) {
                    z0Var.b(P2);
                    z0Var.a(P3);
                }
                int P4 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.soter.isSupport"), 0);
                com.tencent.mars.xlog.Log.i("MicroMsg.DeviceInfoParser", "hy: get soter status: %d", java.lang.Integer.valueOf(P4));
                if (u1Var != null) {
                    u1Var.b(P4 >= 1);
                    u1Var.a(P4);
                }
                if (P2 == 11 && P3 == 11 && u1Var != null) {
                    z0Var.b(1);
                    z0Var.a(1);
                    u1Var.b(true);
                    u1Var.a(1);
                    com.tencent.mars.xlog.Log.i("MicroMsg.DeviceInfoParser", "py: hw patch is available now!");
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.DeviceInfoParser", "lm: got PublicNum: %s", (java.lang.String) d17.get(".deviceinfoconfig.freeWifi.operations.bizUserName"));
                java.util.Map d18 = com.tencent.mm.sdk.platformtools.aa.d(str, "manufacturerName", null);
                com.tencent.mars.xlog.Log.i("MicroMsg.DeviceInfoParser", "lm: got manufacturerNameMaps: %s", d18);
                if (h1Var != null) {
                    h1Var.a(d18);
                }
                int P5 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.style.swipback"), 0);
                com.tencent.mars.xlog.Log.i("MicroMsg.DeviceInfoParser", "lm: got swipback: %d", java.lang.Integer.valueOf(P5));
                if (h1Var != null) {
                    h1Var.b(P5);
                }
                int P6 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.game.isLimit"), 0);
                java.lang.String str3 = (java.lang.String) d17.get(".deviceinfoconfig.game.limitPrompt");
                com.tencent.mars.xlog.Log.i("MicroMsg.DeviceInfoParser", "lm: get game status: %d,gamePrompt:%s", java.lang.Integer.valueOf(P6), str3);
                if (bVar != null) {
                    bVar.a(P6 == 1);
                    bVar.b(str3);
                }
                if (d17.get(".deviceinfoconfig.appbrand.enableV8Lite") != null) {
                    wo.a.f447585a = com.tencent.mm.sdk.platformtools.t8.y((java.lang.String) d17.get(".deviceinfoconfig.appbrand.enableV8Lite"), false);
                }
                if (d17.get(".deviceinfoconfig.debug.multitalkSdkApply") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.debug.multitalkSdkApply"), 0);
                }
                if (d17.get(".deviceinfoconfig.debug.screenPcCastDebug") != null) {
                    oVar2.f447764v = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.debug.screenPcCastDebug"), 0);
                }
                if (d17.get(".deviceinfoconfig.debug.screenPcCastUseAsyncCodec") != null) {
                    oVar2.f447765w = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.debug.screenPcCastUseAsyncCodec"), 0);
                }
                if (d17.get(".deviceinfoconfig.debug.screenCast2PcRenderUseAsyncCodec") != null) {
                    oVar2.f447766x = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.debug.screenCast2PcRenderUseAsyncCodec"), 0);
                }
                if (d17.get(".deviceinfoconfig.debug.screenCast2PcDebugIgnoreScan") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.debug.screenCast2PcDebugIgnoreScan"), 0);
                }
                if (d17.get(".deviceinfoconfig.debug.blackBoardProjectDebug") != null) {
                    com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.debug.blackBoardProjectDebug"), 0);
                }
                int P7 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.recordertype"), -1);
                int P8 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.needRotateEachFrame"), -1);
                int P9 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.enableHighResolutionRecord"), -1);
                int P10 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.landscapeRecordModeEnable"), -1);
                int P11 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.transcodeDecoderType"), -1);
                int P12 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.mediaPlayerType"), -1);
                int P13 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.strategyMask"), -1);
                int P14 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.recorderOption"), -1);
                int P15 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.useMetering"), -1);
                int P16 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.transcodeEncoderType"), -1);
                int P17 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.checkSendVideoBitrate"), -1);
                int P18 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.cpuCrop"), -1);
                int P19 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.storyRecorderType"), -1);
                int P20 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.backgroundRemux"), -1);
                int P21 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.emojiPreviewSize"), -1);
                try {
                    int P22 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.emojiStickerSampleSize"), -1);
                    int P23 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.emojiUseSmallModel"), -1);
                    int P24 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.emojiUseGpuSegment"), -1);
                    int P25 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.c2cRemuxUseSoftEncode"), -1);
                    int P26 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.snsRemuxUseSoftEncode"), -1);
                    int P27 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.takePhotoAlignType"), -1);
                    int P28 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.nativeToThumb"), -1);
                    int P29 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.HWQPCfg"), -1);
                    int P30 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.useCameraApi2"), -1);
                    int P31 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.fullFuncApi2"), -1);
                    int P32 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.camera2UseRecordStream"), -1);
                    int P33 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.vendorCameraEffectSupported"), -1);
                    int P34 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.useImageStreamCapture"), -1);
                    int P35 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.useRenderScriptCropImage"), -1);
                    int P36 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.isVendorDebugModeSupported"), -1);
                    int P37 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.captureHwHevcEncodeEnable"), -1);
                    int P38 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.captureSwHevcEncodeEnable"), -1);
                    int P39 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.remuxHwHevcEncodeEnable"), -1);
                    int P40 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".deviceinfoconfig.mmsight.remuxSwHevcEncodeEnable"), -1);
                    if (g1Var != null) {
                        g1Var.f447687a = P7;
                        g1Var.f447688b = P8;
                        g1Var.f447689c = P9;
                        g1Var.f447690d = P10;
                        g1Var.f447691e = P11;
                        g1Var.f447692f = P12;
                        g1Var.f447693g = P13;
                        g1Var.f447694h = P14;
                        g1Var.f447695i = P15;
                        g1Var.f447696j = P16;
                        g1Var.f447697k = P17;
                        g1Var.f447700n = P21;
                        g1Var.f447701o = P22;
                        g1Var.f447702p = P23;
                        g1Var.f447703q = P24;
                        g1Var.f447711y = P25;
                        g1Var.f447712z = P26;
                        g1Var.B = P27;
                        g1Var.C = P28;
                        g1Var.A = P29;
                        g1Var.f447704r = P30;
                        g1Var.f447706t = P31;
                        g1Var.f447705s = P32;
                        g1Var.f447707u = P33;
                        g1Var.f447708v = P34;
                        g1Var.f447709w = P35;
                        g1Var.f447710x = P36;
                        g1Var.D = P37;
                        g1Var.E = P38;
                        g1Var.F = P39;
                        g1Var.G = P40;
                        str2 = "MicroMsg.DeviceInfoParser";
                        try {
                            com.tencent.mars.xlog.Log.i(str2, "get mmSightRecorderInfo: %s", g1Var.toString());
                        } catch (java.lang.Exception e17) {
                            e = e17;
                            exc = e;
                            com.tencent.mars.xlog.Log.printErrStackTrace(str2, exc, "", new java.lang.Object[0]);
                            return false;
                        }
                    } else {
                        str2 = "MicroMsg.DeviceInfoParser";
                    }
                    if (g1Var2 == null) {
                        return true;
                    }
                    g1Var2.f447687a = P19;
                    g1Var2.f447688b = P8;
                    g1Var2.f447689c = P9;
                    g1Var2.f447690d = P10;
                    g1Var2.f447691e = P11;
                    g1Var2.f447692f = P12;
                    g1Var2.f447693g = P13;
                    g1Var2.f447694h = P14;
                    g1Var2.f447695i = P15;
                    g1Var2.f447696j = P16;
                    g1Var2.f447697k = P17;
                    g1Var2.f447698l = P18;
                    g1Var2.f447699m = P20;
                    com.tencent.mars.xlog.Log.i(str2, "get mmStoryRecorderInfo: %s", g1Var2.toString());
                    return true;
                } catch (java.lang.Exception e18) {
                    e = e18;
                    str2 = "MicroMsg.DeviceInfoParser";
                }
            } catch (java.lang.Exception e19) {
                exc = e19;
                str2 = "MicroMsg.DeviceInfoParser";
                com.tencent.mars.xlog.Log.printErrStackTrace(str2, exc, "", new java.lang.Object[0]);
                return false;
            }
        } catch (java.lang.Exception e27) {
            e = e27;
            str2 = "MicroMsg.DeviceInfoParser";
        }
    }
}

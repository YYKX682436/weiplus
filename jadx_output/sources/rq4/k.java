package rq4;

/* loaded from: classes14.dex */
public final class k implements oq4.a {
    public void a(int i17) {
        sq4.b bVar;
        sq4.b bVar2;
        rq4.j jVar;
        rq4.j jVar2;
        rq4.j jVar3;
        rq4.j jVar4;
        switch (i17) {
            case 16:
                rq4.c cVar = qq4.c.f365987a;
                if (cVar != null) {
                    if (cVar.f398942d) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.VoIPCameraParamsReport", "camera start preview error");
                        long j17 = gq4.v.wi().f365983q;
                        java.util.HashMap hashMap = cVar.f398941c;
                        sq4.b bVar3 = (sq4.b) hashMap.get("StartPreviewError");
                        if (bVar3 != null) {
                            bVar3.b();
                        } else {
                            bVar3 = new sq4.b();
                            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            bVar3.d(java.lang.System.currentTimeMillis() - j17);
                            bVar3.f411373a = "StartPreviewError";
                        }
                        hashMap.put("StartPreviewError", bVar3);
                    }
                    cVar.f398942d = true;
                    long j18 = gq4.v.wi().f365983q;
                    java.util.HashMap hashMap2 = cVar.f398940b;
                    sq4.b bVar4 = (sq4.b) hashMap2.get("StartPreview");
                    if (bVar4 != null) {
                        bVar4.b();
                    } else {
                        bVar4 = new sq4.b();
                        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        bVar4.d(java.lang.System.currentTimeMillis() - j18);
                        bVar4.f411373a = "StartPreview";
                    }
                    hashMap2.put("StartPreview", bVar4);
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoIPCameraParamsReport", "start preview");
                    return;
                }
                return;
            case 17:
                rq4.c cVar2 = qq4.c.f365987a;
                if (cVar2 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoIPCameraParamsReport", "stop preview");
                    if (!cVar2.f398942d) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.VoIPCameraParamsReport", "camera stop preview error");
                        long j19 = gq4.v.wi().f365983q;
                        java.util.HashMap hashMap3 = cVar2.f398941c;
                        sq4.b bVar5 = (sq4.b) hashMap3.get("StopPreviewError");
                        if (bVar5 != null) {
                            bVar5.b();
                        } else {
                            bVar5 = new sq4.b();
                            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                            bVar5.d(java.lang.System.currentTimeMillis() - j19);
                            bVar5.f411373a = "StopPreviewError";
                        }
                        hashMap3.put("StopPreviewError", bVar5);
                    }
                    cVar2.f398942d = false;
                    java.util.HashMap hashMap4 = cVar2.f398940b;
                    sq4.b bVar6 = (sq4.b) hashMap4.get("StartPreview");
                    if (bVar6 != null) {
                        bVar6.b();
                    }
                    long j27 = gq4.v.wi().f365983q;
                    sq4.b bVar7 = (sq4.b) hashMap4.get("StopPreview");
                    if (bVar7 != null) {
                        bVar7.b();
                    } else {
                        bVar7 = new sq4.b();
                        boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        bVar7.d(java.lang.System.currentTimeMillis() - j27);
                        bVar7.f411373a = "StopPreview";
                    }
                    hashMap4.put("StopPreview", bVar7);
                    return;
                }
                return;
            case 18:
                rq4.c cVar3 = qq4.c.f365987a;
                if (cVar3 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoIPCameraParamsReport", "cameraInit");
                    long j28 = gq4.v.wi().f365983q;
                    java.util.HashMap hashMap5 = cVar3.f398940b;
                    sq4.b bVar8 = (sq4.b) hashMap5.get("InitCamera");
                    if (bVar8 == null) {
                        bVar8 = new sq4.b();
                    }
                    boolean z28 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    bVar8.d(java.lang.System.currentTimeMillis() - j28);
                    bVar8.f411373a = "InitCamera";
                    hashMap5.put("InitCamera", bVar8);
                    if (cVar3.f398943e == null) {
                        cVar3.f398943e = "InitCamera";
                        return;
                    }
                    return;
                }
                return;
            case 19:
                rq4.c cVar4 = qq4.c.f365987a;
                if (cVar4 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoIPCameraParamsReport", "switchCamera");
                    java.util.HashMap hashMap6 = cVar4.f398940b;
                    sq4.b bVar9 = (sq4.b) hashMap6.get(cVar4.f398943e);
                    if (bVar9 != null) {
                        bVar9.b();
                    }
                    long j29 = gq4.v.wi().f365983q;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SwitchCamera_");
                    rq4.a aVar = cVar4.f398939a;
                    sb6.append(aVar != null ? java.lang.Integer.valueOf(aVar.f398934a) : null);
                    java.lang.String sb7 = sb6.toString();
                    sq4.b bVar10 = (sq4.b) hashMap6.get(sb7);
                    if (bVar10 == null) {
                        bVar10 = new sq4.b();
                    }
                    boolean z29 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    bVar10.d(java.lang.System.currentTimeMillis() - j29);
                    bVar10.f(sb7);
                    bVar10.f411382j = "SwitchCamera";
                    rq4.a aVar2 = cVar4.f398939a;
                    bVar10.f411379g = java.lang.String.valueOf(aVar2 != null ? java.lang.Integer.valueOf(aVar2.f398934a) : null);
                    hashMap6.put(sb7, bVar10);
                    cVar4.f398943e = sb7;
                    cVar4.f398946h = sb7;
                    return;
                }
                return;
            case 20:
            default:
                return;
            case 21:
                rq4.c cVar5 = qq4.c.f365987a;
                if (cVar5 == null || (bVar = (sq4.b) cVar5.f398940b.get("StartPreview")) == null) {
                    return;
                }
                long j37 = bVar.f411380h;
                long j38 = cVar5.f398950l;
                boolean z37 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                long currentTimeMillis = j38 + (java.lang.System.currentTimeMillis() - j37);
                cVar5.f398950l = currentTimeMillis;
                cVar5.f398950l = currentTimeMillis / 2;
                com.tencent.mars.xlog.Log.i("MicroMsg.VoIPCameraParamsReport", "start preview end cost " + cVar5.f398950l);
                return;
            case 22:
                rq4.c cVar6 = qq4.c.f365987a;
                if (cVar6 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoIPCameraParamsReport", "releaseCamera");
                    long j39 = gq4.v.wi().f365983q;
                    java.util.HashMap hashMap7 = cVar6.f398940b;
                    sq4.b bVar11 = (sq4.b) hashMap7.get("ReleaseCamera");
                    if (bVar11 != null) {
                        bVar11.b();
                    } else {
                        bVar11 = new sq4.b();
                        boolean z38 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        bVar11.d(java.lang.System.currentTimeMillis() - j39);
                        bVar11.f411373a = "ReleaseCamera";
                    }
                    hashMap7.put("ReleaseCamera", bVar11);
                    return;
                }
                return;
            case 23:
                rq4.e eVar = qq4.c.f365988b;
                if (eVar != null) {
                    long j47 = gq4.v.wi().f365983q;
                    java.util.HashMap hashMap8 = eVar.f398961a;
                    sq4.b bVar12 = (sq4.b) hashMap8.get("EnterFullscreen");
                    if (bVar12 == null) {
                        bVar12 = new sq4.b();
                    }
                    sq4.b bVar13 = (sq4.b) hashMap8.get("EnterMiniScreen");
                    if (bVar13 != null) {
                        bVar13.b();
                    }
                    bVar12.f411373a = "EnterFullscreen";
                    boolean z39 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    bVar12.d(java.lang.System.currentTimeMillis() - j47);
                    hashMap8.put("EnterFullscreen", bVar12);
                    eVar.f398963c = "EnterFullscreen";
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoIPOpReport", "enterFullscreen");
                    return;
                }
                return;
            case 24:
                rq4.e eVar2 = qq4.c.f365988b;
                if (eVar2 != null) {
                    long j48 = gq4.v.wi().f365983q;
                    java.util.HashMap hashMap9 = eVar2.f398961a;
                    sq4.b bVar14 = (sq4.b) hashMap9.get("EnterMiniScreen");
                    if (bVar14 == null) {
                        bVar14 = new sq4.b();
                    }
                    sq4.b bVar15 = (sq4.b) hashMap9.get("EnterFullscreen");
                    if (bVar15 != null) {
                        bVar15.b();
                    }
                    bVar14.f411373a = "EnterMiniScreen";
                    boolean z47 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    bVar14.d(java.lang.System.currentTimeMillis() - j48);
                    hashMap9.put("EnterMiniScreen", bVar14);
                    eVar2.f398963c = "EnterMiniScreen";
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoIPOpReport", "enterMiniScreen");
                    return;
                }
                return;
            case 25:
                rq4.e eVar3 = qq4.c.f365988b;
                if (eVar3 != null) {
                    int i18 = gq4.v.wi().f365969c;
                    long j49 = gq4.v.wi().f365983q;
                    java.lang.String str = "RotateDevice_" + i18;
                    java.util.HashMap hashMap10 = eVar3.f398961a;
                    sq4.b bVar16 = (sq4.b) hashMap10.get(str);
                    if (bVar16 == null) {
                        bVar16 = new sq4.b();
                    }
                    java.lang.String str2 = eVar3.f398962b;
                    if (str2 != null && (bVar2 = (sq4.b) hashMap10.get(str2)) != null) {
                        bVar2.b();
                    }
                    bVar16.f(str);
                    boolean z48 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    bVar16.d(java.lang.System.currentTimeMillis() - j49);
                    bVar16.g(java.lang.String.valueOf(i18));
                    hashMap10.put(str, bVar16);
                    eVar3.f398962b = str;
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoIPOpReport", "rotate device " + i18);
                    return;
                }
                return;
            case 26:
                gq4.v.wi().getClass();
                rq4.j jVar5 = qq4.c.f365990d;
                if (jVar5 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderReport", "onDecodeModeChanged toSoft:true");
                    long j57 = gq4.v.wi().f365983q;
                    java.util.HashMap hashMap11 = jVar5.f398989b;
                    sq4.b bVar17 = (sq4.b) hashMap11.get("DecodeChangeHard");
                    if (bVar17 != null) {
                        bVar17.b();
                    }
                    sq4.b bVar18 = (sq4.b) hashMap11.get("DecodeChangeSoft");
                    if (bVar18 == null) {
                        bVar18 = new sq4.b();
                    }
                    boolean z49 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    bVar18.d(java.lang.System.currentTimeMillis() - j57);
                    bVar18.f411373a = "DecodeChangeSoft";
                    hashMap11.put("DecodeChangeSoft", bVar18);
                    return;
                }
                return;
            case 27:
                android.util.Size size = gq4.v.wi().f365981o;
                if (size == null || (jVar = qq4.c.f365990d) == null) {
                    return;
                }
                jVar.l(size, true);
                return;
            case 28:
                android.util.Size size2 = gq4.v.wi().f365981o;
                if (size2 == null || (jVar2 = qq4.c.f365990d) == null) {
                    return;
                }
                jVar2.k(size2, true);
                return;
            case 29:
                int i19 = gq4.v.wi().f365969c;
                rq4.j jVar6 = qq4.c.f365990d;
                if (jVar6 != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.VoIPRenderReport", "isLocal : trueonRenderRotateChanged " + i19);
                    long j58 = gq4.v.wi().f365983q;
                    java.lang.String str3 = "DrawLocalRotateChange" + i19;
                    java.lang.String str4 = jVar6.f398995h;
                    java.util.HashMap hashMap12 = jVar6.f398989b;
                    sq4.b bVar19 = (sq4.b) hashMap12.get(str3);
                    if (bVar19 == null) {
                        bVar19 = new sq4.b();
                    }
                    sq4.b bVar20 = (sq4.b) hashMap12.get(str4);
                    if (bVar20 != null) {
                        bVar20.b();
                        hashMap12.put(str3, bVar20);
                    }
                    boolean z57 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    bVar19.d(java.lang.System.currentTimeMillis() - j58);
                    bVar19.f(str3);
                    bVar19.g(java.lang.String.valueOf(i19));
                    hashMap12.put(str3, bVar19);
                    jVar6.f399000m.add(java.lang.Integer.valueOf(i19));
                    jVar6.f398995h = str3;
                    return;
                }
                return;
            case 30:
                android.util.Size size3 = gq4.v.wi().f365982p;
                if (size3 == null || (jVar3 = qq4.c.f365990d) == null) {
                    return;
                }
                jVar3.l(size3, false);
                return;
            case 31:
                android.util.Size size4 = gq4.v.wi().f365982p;
                if (size4 == null || (jVar4 = qq4.c.f365990d) == null) {
                    return;
                }
                jVar4.k(size4, false);
                return;
        }
    }
}

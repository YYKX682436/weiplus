package d11;

/* loaded from: classes10.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final d11.w[] f225654a;

    static {
        f225654a = r0;
        d11.w[] wVarArr = {new d11.w(0, 120, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_WIDTH, com.tencent.tavkit.component.TAVPlayer.VIDEO_PLAYER_HEIGHT, 30, 1200000, 1200000), new d11.w(120, 300, com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1, 640, 24, 544000, 544000)};
    }

    public static boolean a() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.chatting.RepairerConfigVideoAlign()) == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0003, code lost:
    
        if (r2.length <= 0) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int b(d11.w[] r2, com.tencent.mm.modelcontrol.VideoTransPara r3, com.tencent.mm.modelcontrol.VideoTransPara r4) {
        /*
            r1 = this;
            if (r2 == 0) goto L5
            int r0 = r2.length     // Catch: java.lang.Exception -> Ld
            if (r0 > 0) goto L7
        L5:
            d11.w[] r2 = d11.a.f225654a     // Catch: java.lang.Exception -> Ld
        L7:
            int r0 = r2.length     // Catch: java.lang.Exception -> Ld
            int r2 = r1.c(r0, r2, r3, r4)     // Catch: java.lang.Exception -> Ld
            goto L26
        Ld:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "do calc bitrate error: "
            r3.<init>(r4)
            java.lang.String r2 = r2.toString()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "MicroMsg.BitrateCalculator"
            com.tencent.mars.xlog.Log.e(r3, r2)
            r2 = 0
        L26:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d11.a.b(d11.w[], com.tencent.mm.modelcontrol.VideoTransPara, com.tencent.mm.modelcontrol.VideoTransPara):int");
    }

    public final int c(int i17, d11.w[] wVarArr, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara, com.tencent.mm.modelcontrol.VideoTransPara videoTransPara2) {
        int i18;
        int i19;
        int i27;
        int i28;
        int i29;
        int i37;
        videoTransPara2.f71191d = videoTransPara.f71191d;
        videoTransPara2.f71192e = videoTransPara.f71192e;
        videoTransPara2.f71193f = videoTransPara.f71193f;
        videoTransPara2.f71194g = videoTransPara.f71194g;
        int i38 = videoTransPara.f71195h;
        videoTransPara2.f71195h = i38;
        int i39 = videoTransPara.f71191d;
        int i47 = videoTransPara.f71192e;
        boolean z17 = i39 > i47;
        int i48 = z17 ? i39 : i47;
        if (z17) {
            i39 = i47;
        }
        int i49 = videoTransPara.f71195h;
        int i57 = wVarArr[i17 - 1].f225702e;
        d11.w[] wVarArr2 = f225654a;
        if (i38 >= i57 && i38 >= wVarArr2[1].f225702e) {
            return 0;
        }
        for (int i58 = 0; i58 < i17; i58++) {
            d11.w wVar = wVarArr[i58];
            if (i49 >= wVar.f225701d && i49 < (i28 = wVar.f225702e)) {
                int i59 = wVar.f225703f;
                int i66 = wVar.f225704g;
                if (i48 > i59 || i39 > i66) {
                    int i67 = i48 * i66;
                    int i68 = i39 * i59;
                    if (i67 > i68) {
                        i37 = i68 / i48;
                        i29 = i59;
                    } else {
                        i29 = i67 / i39;
                        i37 = i66;
                    }
                    i48 = ((i29 + 8) >> 4) << 4;
                    i39 = ((i37 + 8) >> 4) << 4;
                }
                videoTransPara2.f71191d = z17 ? i48 : i39;
                if (!z17) {
                    i39 = i48;
                }
                videoTransPara2.f71192e = i39;
                int i69 = videoTransPara2.f71193f;
                int i76 = wVar.f225705h;
                if (i69 > i76) {
                    i69 = i76;
                }
                videoTransPara2.f71193f = i69;
                int i77 = wVar.f225706i;
                int i78 = wVar.f225707m;
                int i79 = videoTransPara2.f71195h;
                int sqrt = (int) ((((((((i77 * i28) + (i78 * i79)) - (i77 * i79)) - (i78 * r15)) / (i28 - r15)) * java.lang.Math.sqrt(((r3 * i39) * 1.0d) / (i59 * i66))) * (videoTransPara2.f71193f + 10)) / 40.0d);
                videoTransPara2.f71194g = sqrt;
                return sqrt;
            }
        }
        for (int i86 = 0; i86 < 2; i86++) {
            d11.w wVar2 = wVarArr2[i86];
            if (i49 >= wVar2.f225701d && i49 < (i18 = wVar2.f225702e)) {
                int i87 = wVar2.f225703f;
                int i88 = wVar2.f225704g;
                if (i48 > i87 || i39 > i88) {
                    int i89 = i48 * i88;
                    int i96 = i39 * i87;
                    if (i89 > i96) {
                        i27 = i96 / i48;
                        i19 = i87;
                    } else {
                        i19 = i89 / i39;
                        i27 = i88;
                    }
                    i48 = ((i19 + 8) >> 4) << 4;
                    i39 = ((i27 + 8) >> 4) << 4;
                }
                videoTransPara2.f71191d = z17 ? i48 : i39;
                if (!z17) {
                    i39 = i48;
                }
                videoTransPara2.f71192e = i39;
                int i97 = videoTransPara2.f71193f;
                int i98 = wVar2.f225705h;
                if (i97 > i98) {
                    i97 = i98;
                }
                videoTransPara2.f71193f = i97;
                int i99 = wVar2.f225706i;
                int i100 = wVar2.f225707m;
                int i101 = videoTransPara2.f71195h;
                int sqrt2 = (int) ((((((((i99 * i18) + (i100 * i101)) - (i99 * i101)) - (i100 * r5)) / (i18 - r5)) * java.lang.Math.sqrt(((r7 * i39) * 1.0d) / (i87 * i88))) * (videoTransPara2.f71193f + 10)) / 40.0d);
                videoTransPara2.f71194g = sqrt2;
                return sqrt2;
            }
        }
        return 0;
    }
}

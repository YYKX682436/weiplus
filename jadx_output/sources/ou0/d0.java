package ou0;

/* loaded from: classes5.dex */
public abstract class d0 {
    public static final java.util.Map a(com.tencent.mm.modelcontrol.VideoTransPara videoTransPara) {
        int i17;
        kotlin.jvm.internal.o.g(videoTransPara, "<this>");
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("FPS", java.lang.String.valueOf(videoTransPara.f71193f));
        lVarArr[1] = new jz5.l("Width", java.lang.String.valueOf(videoTransPara.f71191d));
        lVarArr[2] = new jz5.l("Height", java.lang.String.valueOf(videoTransPara.f71192e));
        lVarArr[3] = new jz5.l("VideoBitrate", java.lang.String.valueOf(videoTransPara.f71194g));
        lVarArr[4] = new jz5.l("AudioBitrate", java.lang.String.valueOf(videoTransPara.f71198n));
        int i18 = videoTransPara.f71197m;
        if (i18 <= 0) {
            i17 = 90;
        } else {
            int i19 = videoTransPara.f71193f;
            if (i19 <= 0) {
                i19 = 30;
            }
            i17 = i18 * i19;
        }
        lVarArr[5] = new jz5.l("GOP", java.lang.String.valueOf(i17));
        lVarArr[6] = new jz5.l("CodecID", videoTransPara.A == 1 ? "HEVC" : "H264");
        lVarArr[7] = new jz5.l("Duration", java.lang.String.valueOf(videoTransPara.f71195h));
        return kotlin.jvm.internal.m0.c(kz5.c1.k(lVarArr));
    }

    public static final com.tencent.mm.modelcontrol.VideoTransPara b(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, long j17, boolean z17) {
        kotlin.jvm.internal.o.g(recordConfigProvider, "<this>");
        m40.k0 k0Var = (m40.k0) i95.n0.c(m40.k0.class);
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = recordConfigProvider.f155676n;
        if (videoTransPara == null) {
            if (z17) {
                ((c61.p7) k0Var).getClass();
                videoTransPara = com.tencent.mm.plugin.finder.storage.t70.f127590a.K2();
            } else {
                ((c61.p7) k0Var).getClass();
                videoTransPara = com.tencent.mm.plugin.finder.storage.t70.f127590a.L2();
            }
        }
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara2 = new com.tencent.mm.modelcontrol.VideoTransPara(videoTransPara);
        videoTransPara2.f71195h = (int) (j17 / 1000);
        m40.k0 k0Var2 = (m40.k0) i95.n0.c(m40.k0.class);
        float ij6 = (float) ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).ij();
        k0Var2.getClass();
        videoTransPara2.C = (int) ((ij6 / (1048576 * 1.0f)) * 0.38f);
        return videoTransPara2;
    }
}

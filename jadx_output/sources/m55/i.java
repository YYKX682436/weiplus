package m55;

/* loaded from: classes10.dex */
public final class i extends m55.b {
    @Override // m55.b
    public java.lang.Object d(og3.d dVar, og3.e eVar, kotlin.coroutines.Continuation continuation) {
        int i17;
        boolean z17 = true;
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(((com.tencent.mm.plugin.mediabasic.data.MediaSingleInfo) kz5.n0.X(dVar.f345159a)).f148610e, true);
        if (d17 != null) {
            int i18 = d17.f162384c;
            int i19 = d17.f162385d;
            int i27 = d17.f162395n;
            if (i27 != 90 && i27 != 270) {
                z17 = false;
            }
            if (z17) {
                i17 = i18;
                i18 = i19;
            } else {
                i17 = i19;
            }
            if (i18 > i17) {
                com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = eVar.f345161a;
                int i28 = videoTransPara.f71192e;
                if (i18 <= i28) {
                    i28 = i18;
                }
                int i29 = (i19 * i28) / i18;
                videoTransPara.f71191d = i28;
                videoTransPara.f71192e = i29;
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoNotCropRemuxChain", "VideoNotCropRemuxChain make size:" + i28 + ' ' + i29);
            } else {
                com.tencent.mm.modelcontrol.VideoTransPara videoTransPara2 = eVar.f345161a;
                int i37 = videoTransPara2.f71192e;
                if (i17 <= i37) {
                    i37 = i17;
                }
                int i38 = (i18 * i37) / i17;
                videoTransPara2.f71191d = i38;
                videoTransPara2.f71192e = i37;
                com.tencent.mars.xlog.Log.i("MicroMsg.VideoNotCropRemuxChain", "VideoNotCropRemuxChain make size:" + i38 + ' ' + i37);
            }
        }
        return new com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo(og3.h.f345166f, 0, null, null, 12, null);
    }
}

package vf0;

@j95.b
/* loaded from: classes10.dex */
public final class n1 extends i95.w implements c35.n {
    public int Ai(java.lang.String inputPath, java.lang.String outputPath, com.tencent.mm.modelvideo.APIVideoTransPara videoParam, boolean z17) {
        kotlin.jvm.internal.o.g(inputPath, "inputPath");
        kotlin.jvm.internal.o.g(outputPath, "outputPath");
        kotlin.jvm.internal.o.g(videoParam, "videoParam");
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = new com.tencent.mm.modelcontrol.VideoTransPara();
        videoTransPara.f71191d = videoParam.f71625d;
        videoTransPara.f71192e = videoParam.f71626e;
        videoTransPara.f71193f = videoParam.f71627f;
        videoTransPara.f71194g = videoParam.f71628g;
        videoTransPara.f71195h = videoParam.f71629h;
        videoTransPara.f71197m = videoParam.f71631m;
        videoTransPara.f71198n = videoParam.f71632n;
        videoTransPara.f71199o = videoParam.f71633o;
        videoTransPara.f71201q = videoParam.f71635q;
        videoTransPara.f71202r = videoParam.f71636r;
        videoTransPara.f71203s = videoParam.f71637s;
        videoTransPara.f71204t = videoParam.f71638t;
        videoTransPara.f71205u = videoParam.f71639u;
        videoTransPara.f71206v = videoParam.f71640v;
        videoTransPara.f71207w = videoParam.f71641w;
        videoTransPara.f71208x = videoParam.f71642x;
        videoTransPara.f71209y = videoParam.f71643y;
        videoTransPara.f71210z = videoParam.f71644z;
        videoTransPara.A = videoParam.A;
        videoTransPara.B = videoParam.B;
        videoTransPara.C = videoParam.C;
        videoTransPara.D = videoParam.D;
        videoTransPara.E = videoParam.E;
        videoTransPara.F = videoParam.F;
        videoTransPara.G = videoParam.G;
        videoTransPara.H = videoParam.H;
        videoTransPara.I = videoParam.I;
        videoTransPara.f71200p = videoParam.f71634p;
        videoTransPara.f71190J = videoParam.f71624J;
        videoTransPara.K = videoParam.K;
        videoTransPara.f71196i = videoParam.f71630i;
        return com.tencent.mm.pluginsdk.model.f3.b(inputPath, outputPath, videoTransPara, z17, null);
    }

    public c35.p Bi(java.lang.String inputPath, java.lang.String outputPath, com.tencent.mm.modelcontrol.VideoTransPara videoParam, boolean z17, boolean z18, long j17, d11.n nVar, java.lang.String str) {
        kotlin.jvm.internal.o.g(inputPath, "inputPath");
        kotlin.jvm.internal.o.g(outputPath, "outputPath");
        kotlin.jvm.internal.o.g(videoParam, "videoParam");
        return com.tencent.mm.pluginsdk.model.f3.c(inputPath, outputPath, videoParam, z17, z18, j17, nVar, str);
    }

    public boolean wi(int i17, int i18) {
        return com.tencent.mm.pluginsdk.model.j0.a(i17, i18);
    }
}

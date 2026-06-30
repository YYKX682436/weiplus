package yr2;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr2.k f464682d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(yr2.k kVar) {
        super(0);
        this.f464682d = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yr2.g gVar = yr2.k.X;
        ((vf0.s1) ((wf0.o1) i95.n0.c(wf0.o1.class))).getClass();
        yr2.k.Y = d11.s.Di(4);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[updatePreloadInfo]\nisSupportH265=");
        sb6.append(yr2.k.Y);
        sb6.append("\nisSupportH266=");
        yr2.k kVar = this.f464682d;
        sb6.append(kVar.f464703t);
        sb6.append("\n[prev:next]Count=");
        sb6.append(kVar.f464685b);
        sb6.append(':');
        sb6.append(kVar.f464686c);
        sb6.append("\nmaxPreloadPercent=");
        sb6.append(kVar.f464687d);
        sb6.append("\nmaxPreloadBitRate=");
        sb6.append(kVar.f464694k);
        sb6.append(", maxPreloadBytes=");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.f0(kVar.f464688e));
        sb6.append("\nmaxPreloadTaskCount=");
        sb6.append(kVar.f464689f);
        sb6.append("\n[preload:play]ConcurrentCount=");
        sb6.append(kVar.f464690g);
        sb6.append(':');
        sb6.append(kVar.f464691h);
        sb6.append("\n[startPreloadSecs:startPreloadPercent]=");
        sb6.append(kVar.f464693j);
        sb6.append(':');
        sb6.append(kVar.f464692i);
        sb6.append("\nisOpenMultiBitRateDownload=");
        sb6.append(kVar.f464702s);
        sb6.append("\nhotFeed=");
        sb6.append(kVar.f464699p.size());
        sb6.append("\nmegaVideo[prev:next]Count=");
        sb6.append(kVar.f464697n);
        sb6.append(':');
        sb6.append(kVar.f464698o);
        sb6.append("\nmegaVideoMaxBitrate=");
        sb6.append(kVar.f464696m);
        sb6.append("\nhotMegaVideoMediaSet=");
        sb6.append(kVar.f464700q.size());
        sb6.append("\nminBufferLength=");
        sb6.append(kVar.f464708y);
        sb6.append("\nmaxBufferLength=");
        sb6.append(kVar.f464709z);
        sb6.append("\nminCurrentFeedBufferLength=");
        sb6.append(kVar.A);
        sb6.append("\ncanPreCreatedPlayer=");
        sb6.append(kVar.B);
        sb6.append("\nlsBufferSize=");
        sb6.append(kVar.F);
        sb6.append("\nlsSendSocketBufferSize=");
        sb6.append(kVar.G);
        sb6.append("\ntcpRecvBufferSize=");
        sb6.append(kVar.H);
        sb6.append("\nlast_feed_info_count=");
        sb6.append(kVar.K);
        sb6.append("\nnext_feed_info_count=");
        sb6.append(kVar.L);
        sb6.append("\nflow_view_preload=");
        sb6.append(kVar.N);
        sb6.append('\n');
        com.tencent.mars.xlog.Log.i("Finder.MediaPreloadModel", sb6.toString());
        return jz5.f0.f302826a;
    }
}

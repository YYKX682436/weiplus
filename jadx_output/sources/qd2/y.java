package qd2;

/* loaded from: classes2.dex */
public class y implements cw2.eb {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f361851d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderObject f361852e;

    /* renamed from: f, reason: collision with root package name */
    public final int f361853f;

    /* renamed from: g, reason: collision with root package name */
    public final int f361854g;

    public y(android.content.Context context, com.tencent.mm.protocal.protobuf.FinderObject finderObject, int i17, int i18) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        this.f361851d = context;
        this.f361852e = finderObject;
        this.f361853f = i17;
        this.f361854g = i18;
    }

    @Override // cw2.eb
    public void H(mn2.j4 video) {
        kotlin.jvm.internal.o.g(video, "video");
        com.tencent.mars.xlog.Log.i("FinderOpenRedPacketEditPageHelper", "onStartDownload");
    }

    @Override // cw2.eb
    public void K(int i17, int i18, mn2.j4 video, boolean z17) {
        kotlin.jvm.internal.o.g(video, "video");
        com.tencent.mars.xlog.Log.i("FinderOpenRedPacketEditPageHelper", "onMoovReadyDownload offset:" + i17 + " total:" + i18 + " moovFirstDownloaded:" + z17);
    }

    @Override // cw2.eb
    public void c(int i17, int i18, mn2.j4 video) {
        kotlin.jvm.internal.o.g(video, "video");
        com.tencent.mars.xlog.Log.i("FinderOpenRedPacketEditPageHelper", "onProgressDownload offset:" + i17 + " total:" + i18);
    }

    @Override // cw2.eb
    public void k(java.lang.String mediaId, int i17, int i18) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        com.tencent.mars.xlog.Log.i("FinderOpenRedPacketEditPageHelper", "onStopDownload mediaId:" + mediaId + " offset:" + i17 + " length:" + i18);
    }

    @Override // cw2.eb
    public void q(int i17, mn2.j4 video, dn.h hVar) {
        kotlin.jvm.internal.o.g(video, "video");
        java.lang.String path = video.getPath();
        qd2.d0 d0Var = qd2.d0.f361714a;
        boolean a17 = d0Var.a(path);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFinishDownload ret:");
        sb6.append(i17);
        sb6.append(" mediaId:");
        sb6.append(hVar != null ? hVar.f241766a : null);
        sb6.append(" videoPath:");
        sb6.append(path);
        sb6.append(" isFileLegal:");
        sb6.append(a17);
        sb6.append(" feedId:");
        sb6.append(pm0.v.u(this.f361852e.getId()));
        com.tencent.mars.xlog.Log.i("FinderOpenRedPacketEditPageHelper", sb6.toString());
        if (i17 == 0 && a17) {
            d0Var.c(this.f361851d, this.f361852e, path, this.f361853f, this.f361854g);
        } else {
            d0Var.b(this.f361851d, true);
        }
    }

    @Override // cw2.eb
    public void z(mn2.j4 video, dn.o oVar, dn.h hVar) {
        kotlin.jvm.internal.o.g(video, "video");
        com.tencent.mars.xlog.Log.i("FinderOpenRedPacketEditPageHelper", "onStopDownload");
    }
}

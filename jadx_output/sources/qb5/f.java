package qb5;

/* loaded from: classes3.dex */
public class f implements fk4.t {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f361332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lo.n f361333e;

    public f(qb5.g gVar, com.tencent.mm.storage.f9 f9Var, lo.n nVar) {
        this.f361332d = f9Var;
        this.f361333e = nVar;
    }

    @Override // fk4.t
    public void a(java.lang.Long l17, long j17, long j18, boolean z17) {
        lo.n nVar;
        if (l17 == null || !z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileCompat", "onDownloadProgress, it's not origin video task, return");
            return;
        }
        if (com.tencent.mm.ui.chatting.gallery.l.f201163a.a(l17.longValue()) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileCompat", "onFinishDownload, downloader is null, ignore it");
        } else if (l17.longValue() == this.f361332d.getMsgId() && j18 > 0 && (nVar = this.f361333e) != null) {
            ((vv1.l) nVar).f440422a.b((int) j17, (int) j18);
        }
    }

    @Override // fk4.t
    public void b(java.lang.Long l17, long j17, long j18, boolean z17) {
        if (l17 == null || !z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileCompat", "onDataAvailable, it's not origin video task, return");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileCompat", "onDataAvailable msgId:%d", l17);
        }
    }

    @Override // fk4.t
    public void c(java.lang.Long l17, int i17, boolean z17) {
        if (l17 == null || !z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileCompat", "onFinishDownload, it's not origin video task, return");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileCompat", "onFinishDownload msgId:%d", l17);
        fk4.k d17 = com.tencent.mm.ui.chatting.gallery.l.f201163a.d(l17.longValue());
        if (d17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileCompat", "onFinishDownload, downloader is null, ignore it");
            return;
        }
        d17.f263624l = null;
        lo.n nVar = this.f361333e;
        if (nVar != null) {
            ((vv1.l) nVar).a(i17, "", d17.n());
        }
    }

    @Override // fk4.t
    public void d(java.lang.Long l17, boolean z17) {
        if (l17 == null || !z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileCompat", "onStopDownload, it's not origin video task, return");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileCompat", "onStopDownload msgId:%d", l17);
        fk4.k d17 = com.tencent.mm.ui.chatting.gallery.l.f201163a.d(l17.longValue());
        if (d17 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileCompat", "onFinishDownload, downloader is null, ignore it");
        } else {
            d17.f263624l = null;
        }
    }

    @Override // fk4.t
    public void e(java.lang.Long l17, long j17, long j18, boolean z17) {
        if (l17 == null || !z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileCompat", "onMoovReady, it's not origin video task, return");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileCompat", "onMoovReady msgId:%d", l17);
        }
    }

    @Override // fk4.t
    public void g(java.lang.Long l17, boolean z17) {
        if (l17 == null || !z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileCompat", "onStartDownload, it's not origin video task, return");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileCompat", "onStartDownload msgId:%d", l17);
        }
    }
}

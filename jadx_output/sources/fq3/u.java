package fq3;

/* loaded from: classes12.dex */
public class u extends tq3.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f265560d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f265561e;

    public u(fq3.w wVar, com.tencent.mm.storage.f9 f9Var, java.lang.ref.WeakReference weakReference) {
        this.f265560d = f9Var;
        this.f265561e = weakReference;
    }

    @Override // tq3.a
    public java.lang.String a() {
        return "Priority.onC2CImgScrollTask";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.f9 f9Var = this.f265560d;
        long createTime = f9Var.getCreateTime();
        fq3.n nVar = (fq3.n) i95.n0.c(fq3.n.class);
        nVar.requireAccountInitialized();
        if (createTime <= nVar.f265528m) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.PriorityService", "onC2CImgScroll time condition not support %s", k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, f9Var.getCreateTime() / 1000));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Priority.PriorityService", "C2CImgScrollTask Start To Auto Download %d MsgId %d", 32, java.lang.Long.valueOf(f9Var.getMsgId()));
        java.lang.ref.WeakReference weakReference = this.f265561e;
        if (weakReference.get() != null) {
            fq3.n nVar2 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar2.requireAccountInitialized();
            r45.rc c17 = nVar2.f265530o.c(f9Var.getMsgId());
            if (c17 != null && c17.f384715m == 1) {
                kq3.i.f(c17, f9Var);
            }
            ((java.lang.Runnable) weakReference.get()).run();
        }
        fq3.n nVar3 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar3.requireAccountInitialized();
        nVar3.f265537v.getClass();
        fq3.n nVar4 = (fq3.n) i95.n0.c(fq3.n.class);
        nVar4.requireAccountInitialized();
        r45.rc c18 = nVar4.f265530o.c(f9Var.getMsgId());
        if (c18 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Priority.C2CMsgAutoDownloadImgLogic", "This Image Sender is Me");
        } else if (c18.f384715m == 1) {
            fq3.n nVar5 = (fq3.n) i95.n0.c(fq3.n.class);
            nVar5.requireAccountInitialized();
            nVar5.f265530o.g(f9Var.getMsgId(), 32, 2);
        }
    }
}

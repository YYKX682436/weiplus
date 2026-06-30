package xq;

/* loaded from: classes15.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xq.m f455978d;

    public g(xq.m mVar) {
        this.f455978d = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xq.m mVar = this.f455978d;
        if (mVar.f456000l) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiAnimViewHolder", "delay: recycle");
        mVar.b();
        xq.f fVar = mVar.f456006r;
        if (fVar != null) {
            xq.n nVar = ((xq.o) fVar).f456008a.f456011c;
            nVar.getClass();
            nVar.f456007a.remove(mVar);
        }
    }
}

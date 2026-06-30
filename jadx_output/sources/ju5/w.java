package ju5;

/* loaded from: classes15.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju5.y f302163d;

    public w(ju5.y yVar) {
        this.f302163d = yVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        gu5.d dVar = this.f302163d.f302167c.f302173h;
        if (dVar != null) {
            pe4.g gVar = (pe4.g) dVar;
            gVar.getClass();
            com.tencent.mars.xlog.Log.w("MicroMsg.SoterControllerFingerprint", "hy: mp user trying failed");
            pe4.m mVar = gVar.f353701a;
            if (mVar.f353717a.f394523e.booleanValue()) {
                re4.d0 d0Var = mVar.f353718b;
                d0Var.f394526a = com.tencent.thumbplayer.tmediacodec.codec.CodecError.RELEASEOUTPUTBUFFER_ILLEGAL;
                android.os.Handler handler = mVar.f353720d;
                if (handler != null) {
                    handler.obtainMessage(7, d0Var).sendToTarget();
                    return;
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
                    return;
                }
            }
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jis);
            if (!mVar.f353717a.f394522d.booleanValue()) {
                if (mVar.f353713o == null) {
                    mVar.f353713o = pe4.m.h(mVar.f353711m.getContext(), -1L);
                }
                if (mVar.f353714p == null) {
                    mVar.f353714p = pe4.m.h(mVar.f353711m.getContext(), -1L);
                }
                mVar.f353713o.setAnimationListener(new pe4.k(mVar, string));
                mVar.f353712n.startAnimation(mVar.f353713o);
                mVar.f353711m.startAnimation(mVar.f353714p);
            }
            mVar.f353715q.postDelayed(new pe4.f(gVar), 500L);
        }
    }
}

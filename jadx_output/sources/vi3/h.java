package vi3;

/* loaded from: classes12.dex */
public class h implements c01.y8 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi3.f f437594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vi3.k f437595e;

    public h(vi3.k kVar, vi3.f fVar) {
        this.f437595e = kVar;
        this.f437594d = fVar;
    }

    @Override // c01.y8
    public void a0() {
        vi3.k kVar = this.f437595e;
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgSynchronizeServer", "receive onNotifyUserStatusChange, needWaitExtLoginCallback[%b], isWebWXOnline:[%b]", java.lang.Boolean.valueOf(kVar.f437605d), java.lang.Boolean.valueOf(gm0.j1.b().t()));
        if (kVar.f437605d && gm0.j1.b().t()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgSynchronizeServer", "onNotifyUserStatusChange need send msgSynchronize appMsg.");
            c01.d9.b().G(this);
            kVar.f437605d = false;
            kVar.c(this.f437594d, false);
        }
    }
}

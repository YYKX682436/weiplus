package qe;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe.m f361955d;

    public h(qe.m mVar) {
        this.f361955d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((com.tencent.mm.weapp_core.WsBinding) ((jz5.n) this.f361955d.f361974a).getValue()).suspend();
    }
}

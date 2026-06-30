package wc5;

/* loaded from: classes10.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.q f444547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f444548e;

    public d(wc5.q qVar, int i17) {
        this.f444547d = qVar;
        this.f444548e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wc5.q qVar = this.f444547d;
        ((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) qVar.X6()).v7(true);
        wc5.q.T6(qVar, this.f444548e);
    }
}

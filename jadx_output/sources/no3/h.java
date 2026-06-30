package no3;

/* loaded from: classes11.dex */
public class h extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ no3.i f338760a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(no3.i iVar, android.os.Looper looper) {
        super(looper);
        this.f338760a = iVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        cp.e.c("NotificationObserver", new no3.g(this, message.getData().getString("com.tencent.mm.notification.observer")), 500L);
    }
}

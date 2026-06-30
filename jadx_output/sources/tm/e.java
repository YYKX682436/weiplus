package tm;

/* loaded from: classes14.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.UINotifyEvent f420424d;

    public e(tm.g gVar, com.tencent.mm.autogen.events.UINotifyEvent uINotifyEvent) {
        this.f420424d = uINotifyEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BroadcastController", "summerdiz handleEventOOB publish uiEvent");
        this.f420424d.e();
    }
}

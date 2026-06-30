package tm;

/* loaded from: classes14.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.UINotifyEvent f420423d;

    public d(tm.g gVar, com.tencent.mm.autogen.events.UINotifyEvent uINotifyEvent) {
        this.f420423d = uINotifyEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f420423d.e();
    }
}

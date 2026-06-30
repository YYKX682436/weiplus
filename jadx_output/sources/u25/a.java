package u25;

/* loaded from: classes8.dex */
public abstract class a implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public int f424132d = 0;

    public abstract com.tencent.mm.sdk.event.IEvent a(java.lang.String str);

    public abstract l75.s0 b();

    public void c() {
        l75.s0 b17;
        if (this.f424132d == 0 && (b17 = b()) != null) {
            b17.add(this);
        }
        this.f424132d++;
    }

    public void d() {
        l75.s0 b17;
        int i17 = this.f424132d;
        if (i17 == 0) {
            return;
        }
        int i18 = i17 - 1;
        this.f424132d = i18;
        if (i18 != 0 || (b17 = b()) == null) {
            return;
        }
        b17.remove(this);
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        com.tencent.mm.autogen.events.MStorageNotifyEvent mStorageNotifyEvent = new com.tencent.mm.autogen.events.MStorageNotifyEvent();
        mStorageNotifyEvent.f54489g.f7351a = a(str);
        mStorageNotifyEvent.e();
    }
}

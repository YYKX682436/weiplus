package zn1;

/* loaded from: classes11.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f474474d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.mmaoa.UsbAttachIntentUI f474475e;

    public t(android.content.Intent intent, com.tencent.mm.plugin.backup.mmaoa.UsbAttachIntentUI usbAttachIntentUI) {
        this.f474474d = intent;
        this.f474475e = usbAttachIntentUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlinx.coroutines.l.f(null, new zn1.s(this.f474474d, this.f474475e, null), 1, null);
    }
}

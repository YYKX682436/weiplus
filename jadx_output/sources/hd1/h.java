package hd1;

/* loaded from: classes7.dex */
public final class h extends hd1.b {

    /* renamed from: g, reason: collision with root package name */
    public int f280400g;

    /* renamed from: h, reason: collision with root package name */
    public final android.nfc.NfcAdapter.ReaderCallback f280401h;

    /* renamed from: i, reason: collision with root package name */
    public volatile android.nfc.Tag f280402i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String appId, com.tencent.mm.plugin.appbrand.utils.m2 activityProvider) {
        super(appId, activityProvider);
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(activityProvider, "activityProvider");
        this.f280400g = 15;
        this.f280401h = new hd1.g(this);
    }
}

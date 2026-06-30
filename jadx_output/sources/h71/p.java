package h71;

/* loaded from: classes15.dex */
public class p extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI f279406a;

    public p(com.tencent.mm.plugin.account.security.ui.MySafeDeviceListUI mySafeDeviceListUI) {
        this.f279406a = mySafeDeviceListUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        ((com.tencent.mm.ui.base.preference.h0) this.f279406a.f73210d).notifyDataSetChanged();
    }
}

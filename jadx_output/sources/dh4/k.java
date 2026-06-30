package dh4;

/* loaded from: classes11.dex */
public class k extends com.tencent.mm.network.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dh4.l f232539d;

    public k(dh4.l lVar) {
        this.f232539d = lVar;
    }

    @Override // com.tencent.mm.network.s0
    public void onNetworkChange(int i17) {
        if (i17 != 4) {
            return;
        }
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new dh4.j(this));
    }
}

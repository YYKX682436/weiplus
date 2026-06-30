package sz4;

/* loaded from: classes12.dex */
public class d extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sz4.e f414188a;

    public d(sz4.e eVar) {
        this.f414188a = eVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        sz4.e eVar = this.f414188a;
        if (eVar.E.f296134r) {
            eVar.F.removeMessages(4096);
            return;
        }
        eVar.D.setText(" " + ((java.lang.String) c31.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, eVar.E.f296160u)).toString());
        sendEmptyMessageDelayed(4096, 500L);
    }
}

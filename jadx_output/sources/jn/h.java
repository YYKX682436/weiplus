package jn;

/* loaded from: classes11.dex */
public class h extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jn.j f300467a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(jn.j jVar, java.lang.String str) {
        super(str);
        this.f300467a = jVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        com.tencent.mars.xlog.Log.i("MicroMsg.openIm.OpenImMigrateService", "handleMessage running, %s", java.lang.Integer.valueOf(this.f300467a.f300470b.size()));
        if (this.f300467a.f300470b.isEmpty()) {
            return;
        }
        this.f300467a.f300469a = ((ku5.t0) ku5.t0.f312615d).h(this.f300467a.f300474f, "migrate_tag");
    }
}

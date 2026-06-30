package nq0;

/* loaded from: classes7.dex */
public final class m implements jc3.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nq0.p f338936d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f338937e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ iq0.d f338938f;

    public m(nq0.p pVar, java.lang.String str, iq0.d dVar) {
        this.f338936d = pVar;
        this.f338937e = str;
        this.f338938f = dVar;
    }

    @Override // jc3.l0
    public void i1() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f338936d.f338943e;
        java.lang.String str = this.f338937e;
        if (((jc3.i0) concurrentHashMap.remove(str)) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicCardStarterFeatureService", "preload biz destroy, bizName: " + str);
        }
        yz5.a aVar = this.f338938f.f293651d;
        if (aVar != null) {
            aVar.invoke();
        }
    }
}

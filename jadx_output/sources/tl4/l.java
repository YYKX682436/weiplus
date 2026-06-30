package tl4;

/* loaded from: classes11.dex */
public final class l extends com.tencent.unit_rc.BaseObject implements jm4.m2, jm4.b2 {

    /* renamed from: d, reason: collision with root package name */
    public final bw5.eq0 f420320d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.unit_rc.WeakPtr f420321e;

    /* renamed from: f, reason: collision with root package name */
    public int f420322f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.jq0 f420323g;

    public l(bw5.eq0 appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f420320d = appId;
        this.f420322f = -1;
    }

    public final void a(b66.g gVar) {
        java.lang.String str = "attachPlayApp playApp: %s, appId: " + this.f420320d;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(gVar != null ? gVar.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingPlayAppNotificationModule", str, objArr);
        this.f420321e = new com.tencent.unit_rc.WeakPtr(gVar);
    }
}

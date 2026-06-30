package lx;

/* loaded from: classes4.dex */
public final class l5 implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lx.m5 f321857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f321858b;

    public l5(lx.m5 m5Var, yz5.l lVar) {
        this.f321857a = m5Var;
        this.f321858b = lVar;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public final boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        java.lang.String obj2;
        lx.m5.a(this.f321857a);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizPublishPlugin", "openRedPacketCoverLiteApp onDispatch: actionName=" + str + ", data=" + obj);
        boolean b17 = kotlin.jvm.internal.o.b(str, "RedEnvelopeCoverSelector/select");
        java.lang.String str2 = "";
        yz5.l lVar = this.f321858b;
        if (!b17) {
            if (!kotlin.jvm.internal.o.b(str, "RedEnvelopeCoverSelector/close")) {
                return false;
            }
            lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl("")));
            return false;
        }
        if (obj instanceof org.json.JSONObject) {
            str2 = obj.toString();
        } else if (obj instanceof java.lang.String) {
            kotlin.jvm.internal.o.d(obj);
            str2 = (java.lang.String) obj;
        } else if (obj != null && (obj2 = obj.toString()) != null) {
            str2 = obj2;
        }
        lVar.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(str2)));
        return false;
    }
}

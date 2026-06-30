package gx;

/* loaded from: classes7.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx.e f276172d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(gx.e eVar) {
        super(2);
        this.f276172d = eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.String str2 = (java.lang.String) obj2;
        boolean z17 = false;
        if (str != null) {
            if (str.length() > 0) {
                z17 = true;
            }
        }
        gx.e eVar = this.f276172d;
        if (z17) {
            eVar.s().invoke(eVar.h(1, str));
        } else {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, str2);
            if (yw.h1.f466343l > 0) {
                cx.w0 w0Var = (cx.w0) eVar.f317890a;
                if (w0Var != null) {
                    gx.c cVar = new gx.c(eVar, hashMap, str2);
                    ax.t tVar = w0Var.f224479x;
                    tVar.getClass();
                    tVar.n("getBrandServiceJumpPaths", null, new ax.n(cVar));
                }
            } else {
                eVar.s().invoke(eVar.l(hashMap));
            }
        }
        return jz5.f0.f302826a;
    }
}

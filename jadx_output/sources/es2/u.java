package es2;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ es2.h0 f256408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f256409e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f256410f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f256411g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(es2.h0 h0Var, java.lang.String str, boolean z17, java.lang.String str2) {
        super(0);
        this.f256408d = h0Var;
        this.f256409e = str;
        this.f256410f = z17;
        this.f256411g = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        es2.h0 h0Var = this.f256408d;
        java.util.HashMap hashMap = h0Var.f256371d;
        java.lang.String mediaId = this.f256409e;
        cs2.p pVar = (cs2.p) hashMap.remove(mediaId);
        java.util.LinkedList linkedList = h0Var.f256372e;
        java.lang.String str = h0Var.f256375h;
        java.lang.String str2 = this.f256411g;
        boolean z17 = this.f256410f;
        if (pVar == null) {
            if (z17) {
                ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
                t21.o2.Di().h(mediaId, null);
                ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(mediaId);
            }
            cs2.p pVar2 = (cs2.p) kz5.n0.Z((java.util.LinkedList) h0Var.j("cancelWaitingTask", new es2.w(h0Var, mediaId)));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[cancel] ");
            sb6.append(str2);
            sb6.append(" [");
            sb6.append(pVar2);
            sb6.append("] ");
            sb6.append(pVar2 != null ? java.lang.Long.valueOf(pVar2.f222089f2) : null);
            sb6.append(" from waitingList waiting:");
            sb6.append(linkedList.size());
            sb6.append('.');
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            return pVar2;
        }
        if (z17 || !kotlin.jvm.internal.o.b(mediaId, h0Var.f256373f)) {
            ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Di().j(mediaId, new es2.t(h0Var, str2, pVar, mediaId));
            com.tencent.mars.xlog.Log.i(str, "[cancel] " + str2 + " [" + pVar + "] from loadingMap, " + z17 + ' ' + pVar.f222089f2 + " waiting:" + linkedList.size());
            return pVar;
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[cancel] ");
        sb7.append(str2);
        sb7.append(" [");
        sb7.append(pVar);
        sb7.append("] is not ignore Playing[");
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        if (mediaId.length() == 0) {
            mediaId = "";
        } else if (mediaId.length() > 13) {
            int length = mediaId.length();
            if (length > 24) {
                length = 24;
            }
            mediaId = mediaId.substring(13, length);
            kotlin.jvm.internal.o.f(mediaId, "substring(...)");
        }
        sb7.append(mediaId);
        sb7.append("], but you plan to cancel it. just return");
        com.tencent.mars.xlog.Log.w(str, sb7.toString());
        return pVar;
    }
}

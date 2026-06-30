package eq1;

/* loaded from: classes8.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s40.t0 f255797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f255798e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(s40.t0 t0Var, java.lang.String str) {
        super(1);
        this.f255797d = t0Var;
        this.f255798e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) obj;
        if ((finderObject != null ? finderObject.getLiveInfo() : null) != null) {
            r45.nw1 liveInfo = finderObject.getLiveInfo();
            kotlin.jvm.internal.o.d(liveInfo);
            if (liveInfo.getLong(0) != 0) {
                i95.m c17 = i95.n0.c(s40.w0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                r45.nw1 liveInfo2 = finderObject.getLiveInfo();
                kotlin.jvm.internal.o.d(liveInfo2);
                long j17 = liveInfo2.getLong(0);
                s40.t0 t0Var = this.f255797d;
                qs5.d dVar = qs5.d.f366426e;
                java.lang.String str = this.f255798e;
                kotlin.jvm.internal.o.d(str);
                s40.w0.u9((s40.w0) c17, j17, false, null, t0Var, 3, str, null, null, 192, null);
                return jz5.f0.f302826a;
            }
        }
        eq1.h hVar = eq1.h.f255812a;
        com.tencent.mars.xlog.Log.i("BizChatUtil", "cgi get finderObject fail!");
        this.f255797d.onLiveStatusCallback(0L, 1, new r45.l71());
        return jz5.f0.f302826a;
    }
}

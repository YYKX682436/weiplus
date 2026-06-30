package ko0;

/* loaded from: classes4.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.o f309866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f309867e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(jz5.o oVar, kotlin.jvm.internal.c0 c0Var) {
        super(1);
        this.f309866d = oVar;
        this.f309867e = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject nameAndHash = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(nameAndHash, "nameAndHash");
        java.lang.String str = ((java.lang.String) this.f309866d.f302843f) + '/' + nameAndHash.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
        if (!com.tencent.mm.vfs.w6.j(str)) {
            this.f309867e.f310112d = false;
            com.tencent.mars.xlog.Log.e("LiveMakeupUtil", "#checkAndMakeToReady childFile:" + str + " is not exist");
        }
        return jz5.f0.f302826a;
    }
}

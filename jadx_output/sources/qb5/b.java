package qb5;

/* loaded from: classes9.dex */
public class b implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lo.l f361326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f361327f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361328g;

    public b(qb5.g gVar, java.lang.String str, lo.l lVar, long j17, java.lang.String str2) {
        this.f361325d = str;
        this.f361326e = lVar;
        this.f361327f = j17;
        this.f361328g = str2;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileCompat", "downloadAppAttachDirect errType:%d errCode:%d, errMsg:%s type:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.getType()));
        if (m1Var.getType() != 221) {
            return;
        }
        bt3.l0 l0Var = (bt3.l0) m1Var;
        java.lang.String L = l0Var.L();
        java.lang.String str2 = this.f361325d;
        if (!str2.equals(L)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChooseMsgFileCompat", "media:%s is not equal targetMedia:%s", str2, l0Var.L());
            return;
        }
        c01.d9.e().q(com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_BOOL_VIDEO_ENABLE_MEDIA_CODEC_RELEASE_OUTPUT_BUFFER_WITH_TIMESTAMP, this);
        lo.l lVar = this.f361326e;
        if (i17 == 0 && i18 == 0) {
            int i19 = l0Var.f24325t;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileCompat", "downloadAppAttachDirect retCode:%d", java.lang.Integer.valueOf(i19));
            if (i19 >= 0 || lVar == null) {
                return;
            }
            lVar.b(i19, "");
            return;
        }
        com.tencent.mm.pluginsdk.model.app.d g17 = com.tencent.mm.pluginsdk.model.app.k0.g(str2, this.f361327f, this.f361328g);
        if (g17 == null || g17.field_status != 102) {
            if (lVar != null) {
                lVar.b(-1, str);
            }
        } else if (lVar != null) {
            lVar.b(1, str);
        }
    }
}

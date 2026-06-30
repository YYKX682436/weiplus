package un;

/* loaded from: classes11.dex */
public final class a1 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ un.g1 f429235d;

    public a1(un.g1 g1Var) {
        this.f429235d = g1Var;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(buff, "buff");
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        if (i17 == -21005) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectWxChatRoomAddMemberUIC", "ERR_CNDCOM_MEDIA_IS_UPLOADING cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
            return 0;
        }
        un.g1 g1Var = this.f429235d;
        if (hVar == null || hVar.field_retCode != 0) {
            if (hVar != null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SelectWxChatRoomAddMemberUIC", "cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
                g1Var.W6(hVar.field_retCode, "cdn ret error", "");
                return 0;
            }
            if (i17 == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SelectWxChatRoomAddMemberUIC", "on process, cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
                return 0;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.SelectWxChatRoomAddMemberUIC", "start error!; cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s]", str, java.lang.Integer.valueOf(i17), gVar, hVar);
            g1Var.W6(0, "cdn start error", "");
            return 0;
        }
        un.t0 t0Var = (un.t0) g1Var.f429271v.get(str);
        if (t0Var == null || !t0Var.f429328b) {
            g1Var.f429264o = hVar;
            g1Var.f429261i = false;
        } else {
            g1Var.f429268s = hVar;
            g1Var.f429265p = false;
        }
        kotlin.jvm.internal.o.d(t0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectWxChatRoomAddMemberUIC", "sceneResult.field_retCode == 0 cdntra cdnCallback clientid:%s startRet:%d proginfo:[%s] res:[%s] result:%s", str, java.lang.Integer.valueOf(i17), gVar, hVar, java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.h(t0Var.f429327a)));
        g1Var.X6();
        a14.a a17 = a14.a.a();
        long a18 = c01.id.a();
        long j17 = a17.f587f;
        if (a18 > j17) {
            a17.f582a.f60372s = a18 - j17;
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String mediaId, byte[] inbuf) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(inbuf, "inbuf");
        return new byte[0];
    }
}

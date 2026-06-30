package ye5;

/* loaded from: classes9.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rd5.d f461281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yb5.d f461282e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(rd5.d dVar, yb5.d dVar2) {
        super(1);
        this.f461281d = dVar;
        this.f461282e = dVar2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String string;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.storage.f9 f9Var = this.f461281d.f394254d.f445300b;
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.v2 g17 = t21.o2.Ui().g(f9Var.z0());
        if (g17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingItemMediaGroupItem", "onUploadingBtnClick, videoInfo is null, imgPath: " + f9Var.z0() + ", skip");
        } else {
            int i17 = g17.f415011i;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemMediaGroupItem", "onUploadingBtnClick, videoStatus: " + i17);
            if (booleanValue) {
                if (i17 == 112) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemMediaGroupItem", "onUploadingBtnClick, video comes from PC, pause recv");
                    t21.d3.y(f9Var.z0());
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemMediaGroupItem", "onUploadingBtnClick, pause sending video");
                    t21.d3.z(f9Var.z0());
                    com.tencent.mm.autogen.events.SendMsgFailEvent sendMsgFailEvent = new com.tencent.mm.autogen.events.SendMsgFailEvent();
                    sendMsgFailEvent.f54753g.f7461a = f9Var;
                    sendMsgFailEvent.e();
                }
            } else if (i17 == 113) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemMediaGroupItem", "onUploadingBtnClick, video comes from PC, restart recv");
                if (!c01.d9.b().E()) {
                    db5.t7.k(this.f461282e.g(), this.f461282e.f460717l.getContentView());
                } else if (com.tencent.mm.network.y2.a(this.f461282e.g())) {
                    wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
                    java.lang.String d17 = g17.d();
                    ((vf0.y1) x1Var).getClass();
                    t21.d3.L(d17);
                } else {
                    db5.e1.n(this.f461282e.g(), com.tencent.mm.R.string.k77, com.tencent.mm.R.string.f490573yv, new ye5.p(g17), ye5.q.f461279d);
                }
            } else if (g17.k()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemMediaGroupItem", "onUploadingBtnClick, video comes from gallery illegal");
                switch (i17) {
                    case 140:
                        string = this.f461282e.g().getString(com.tencent.mm.R.string.f493444k74);
                        break;
                    case 141:
                        string = this.f461282e.g().getString(com.tencent.mm.R.string.k76);
                        break;
                    case com.tencent.thumbplayer.api.TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS /* 142 */:
                        string = this.f461282e.g().getString(com.tencent.mm.R.string.f493445k75);
                        break;
                    default:
                        string = this.f461282e.g().getString(com.tencent.mm.R.string.f493445k75);
                        break;
                }
                kotlin.jvm.internal.o.d(string);
                db5.e1.s(this.f461282e.g(), string, this.f461282e.g().getString(com.tencent.mm.R.string.jz9));
            } else {
                f9Var.unsetOmittedFailResend();
                ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), f9Var, true);
                if (c01.id.a() - f9Var.getCreateTime() >= 432000000) {
                    com.tencent.mm.pluginsdk.model.app.k0.Q(this.f461282e, f9Var, i17 == 198 ? com.tencent.mm.R.string.f490489wi : com.tencent.mm.R.string.f490490wj);
                } else if (i17 == 198) {
                    t21.d3.C(f9Var.z0());
                } else {
                    wf0.x1 x1Var2 = (wf0.x1) i95.n0.c(wf0.x1.class);
                    java.lang.String z07 = f9Var.z0();
                    ((vf0.y1) x1Var2).getClass();
                    t21.d3.M(z07);
                    ((ku5.t0) ku5.t0.f312615d).g(new ye5.r(f9Var));
                }
            }
        }
        return jz5.f0.f302826a;
    }
}

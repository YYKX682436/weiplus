package mv2;

/* loaded from: classes10.dex */
public class b extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.yj0 f331544f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f331545g;

    /* renamed from: h, reason: collision with root package name */
    public final int f331546h;

    public /* synthetic */ b(com.tencent.mm.plugin.finder.storage.yj0 yj0Var, com.tencent.mm.protobuf.g gVar, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(yj0Var, (i18 & 2) != 0 ? null : gVar, (i18 & 4) != 0 ? 0 : i17);
    }

    @Override // fp0.d
    public void a() {
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var = this.f331544f;
        r45.et0 et0Var = yj0Var.field_actionInfo;
        bq.m mVar = new bq.m(yj0Var, et0Var != null ? (r45.qt2) et0Var.getCustom(7) : null, null, this.f331545g, this.f331546h);
        long a17 = c01.id.a() - (yj0Var.y0() * 1000);
        if (yj0Var.field_tryCount >= 2 || a17 >= 1200000) {
            com.tencent.mars.xlog.Log.i("Finder.ActionTask", "make fail tryNext " + yj0Var.t0() + " tryCount " + yj0Var.field_tryCount + " createTime: " + yj0Var.y0());
            yj0Var.field_state = -1;
            ((c61.l7) i95.n0.c(c61.l7.class)).Ij().L0(yj0Var.field_localCommentId, yj0Var, true);
            b(fp0.u.f265290f);
            return;
        }
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.U8).getValue()).r()).booleanValue()) {
            e(4, com.tencent.liteav.TXLiteAVCode.ERR_BGM_INVALID_URL, "评论发表失败测试", null);
            return;
        }
        yj0Var.field_tryCount++;
        com.tencent.mars.xlog.Log.i("Finder.ActionTask", "doAction " + yj0Var + ' ' + yj0Var + ".field_tryCount");
        ((c61.l7) i95.n0.c(c61.l7.class)).Ij().L0(yj0Var.field_localCommentId, yj0Var, false);
        mVar.l().q(new mv2.a(this));
    }

    @Override // fp0.d
    public java.lang.String d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var = this.f331544f;
        sb6.append(yj0Var.field_actionType);
        sb6.append('_');
        sb6.append(yj0Var.field_feedId);
        sb6.append('_');
        sb6.append(yj0Var.field_localCommentId);
        return sb6.toString();
    }

    public void e(int i17, int i18, java.lang.String str, r45.ty0 ty0Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd ");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(i18);
        sb6.append(", ");
        sb6.append(str);
        sb6.append(", ");
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var = this.f331544f;
        sb6.append(yj0Var.field_localCommentId);
        com.tencent.mars.xlog.Log.i("Finder.ActionTask", sb6.toString());
        if (i17 == 0 && i18 == 0) {
            ((c61.l7) i95.n0.c(c61.l7.class)).Ij().J0(yj0Var.field_localCommentId);
            b(fp0.u.f265290f);
            return;
        }
        if (i17 == 4 && (i18 == -5002 || i18 == -5001 || i18 == -4007 || i18 == -4006)) {
            yj0Var.field_failedFlag = 2;
            java.lang.String str2 = "";
            if (i17 == 4 && (i18 == -4007 || i18 == -4006)) {
                if (str == null) {
                    str = "";
                }
                str2 = str;
            }
            yj0Var.f128395p1 = str2;
            yj0Var.field_state = -1;
            ((c61.l7) i95.n0.c(c61.l7.class)).Ij().J0(yj0Var.field_localCommentId);
            com.tencent.mm.plugin.finder.storage.l Ij = ((c61.l7) i95.n0.c(c61.l7.class)).Ij();
            long j17 = yj0Var.field_feedId;
            long t07 = yj0Var.t0();
            long j18 = yj0Var.field_localCommentId;
            l75.e0 e0Var = com.tencent.mm.plugin.finder.storage.wj0.N;
            Ij.D0(j17, t07, j18, com.tencent.mm.plugin.finder.storage.wj0.R, yj0Var);
        } else {
            if (i17 >= 4) {
                yj0Var.field_state = -1;
                if (i18 == -4010) {
                    yj0Var.field_failedFlag = 1;
                }
            } else {
                yj0Var.field_postTime = c01.id.a();
            }
            ((c61.l7) i95.n0.c(c61.l7.class)).Ij().L0(yj0Var.field_localCommentId, yj0Var, false);
        }
        b(fp0.u.f265291g);
    }

    public b(com.tencent.mm.plugin.finder.storage.yj0 action, com.tencent.mm.protobuf.g gVar, int i17) {
        kotlin.jvm.internal.o.g(action, "action");
        this.f331544f = action;
        this.f331545g = gVar;
        this.f331546h = i17;
    }
}

package db2;

/* loaded from: classes2.dex */
public final class f5 extends az2.u implements zy2.jc {

    /* renamed from: g, reason: collision with root package name */
    public final int f227971g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f227972h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f227973i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(java.lang.String userName, r45.h32 noticeInfo, int i17, r45.qt2 qt2Var, java.util.LinkedList linkedList, r45.t32 t32Var, java.lang.String str, java.lang.Integer num, java.lang.String str2, long j17, int i18, kotlin.jvm.internal.i iVar) {
        super(qt2Var);
        java.util.LinkedList linkedList2 = (i18 & 16) != 0 ? null : linkedList;
        r45.t32 t32Var2 = (i18 & 32) != 0 ? null : t32Var;
        java.lang.String str3 = (i18 & 64) != 0 ? null : str;
        java.lang.Integer num2 = (i18 & 128) != 0 ? 0 : num;
        java.lang.String str4 = (i18 & 256) == 0 ? str2 : null;
        long j18 = (i18 & 512) != 0 ? 0L : j17;
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(noticeInfo, "noticeInfo");
        this.f227971g = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findercreatelivenotice";
        lVar.f70667d = 6653;
        r45.g01 g01Var = new r45.g01();
        g01Var.set(2, userName);
        g01Var.set(3, noticeInfo);
        g01Var.set(4, java.lang.Integer.valueOf(i17));
        g01Var.set(8, str3);
        g01Var.set(11, str4);
        g01Var.set(12, java.lang.Long.valueOf(j18));
        g01Var.set(9, java.lang.Integer.valueOf(num2 != null ? num2.intValue() : 0));
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        g01Var.set(10, java.lang.Integer.valueOf(ml2.j0.f327583i.f328295e0.f327692d));
        if (linkedList2 != null) {
            g01Var.set(6, linkedList2);
        }
        if (t32Var2 != null) {
            g01Var.set(7, t32Var2);
        }
        g01Var.set(1, db2.t4.f228171a.b(6653, qt2Var));
        r45.kv0 kv0Var = (r45.kv0) g01Var.getCustom(1);
        if (kv0Var != null) {
            kv0Var.set(1, java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(7) : 0));
        }
        r45.h01 h01Var = new r45.h01();
        lVar.f70664a = g01Var;
        lVar.f70665b = h01Var;
        this.f227972h = lVar.a();
        com.tencent.mars.xlog.Log.i("Finder.NetSceneCreateLiveNotice", "NetSceneCreateLiveNotice init: userName=" + userName + ", startTime=" + noticeInfo.getInteger(0) + " ,opType=" + i17 + ", notice_starttime_type=" + noticeInfo.getInteger(20) + ", sourceScene=" + g01Var.getInteger(10));
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("Finder.NetSceneCreateLiveNotice", "onCgiEnd: errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f227973i;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f227973i = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f227972h;
        if (oVar != null) {
            return dispatch(sVar, oVar, this);
        }
        kotlin.jvm.internal.o.o("rr");
        throw null;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6653;
    }
}

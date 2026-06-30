package db2;

/* loaded from: classes.dex */
public final class y1 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f228241t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(long j17, long j18, com.tencent.mm.protobuf.g liveCookies, java.lang.String finderUsername, java.lang.String nonce_id, java.lang.String dislikeId) {
        super(null, null, 3, null);
        kotlin.jvm.internal.o.g(liveCookies, "liveCookies");
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(nonce_id, "nonce_id");
        kotlin.jvm.internal.o.g(dislikeId, "dislikeId");
        this.f228241t = "Finder.CgiFinderLiveDislikeBanner";
        r45.yo1 yo1Var = new r45.yo1();
        yo1Var.set(1, db2.t4.f228171a.a(4268));
        yo1Var.set(4, java.lang.Long.valueOf(j17));
        yo1Var.set(5, java.lang.Long.valueOf(j18));
        yo1Var.set(3, liveCookies);
        yo1Var.set(2, finderUsername);
        yo1Var.set(6, dislikeId);
        yo1Var.set(7, nonce_id);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = yo1Var;
        r45.zo1 zo1Var = new r45.zo1();
        zo1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) zo1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = zo1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivedislikebanner";
        lVar.f70667d = 4268;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLiveDislikeBanner", "init feedId:" + j17 + ", liveId:" + j18 + ", finderUsername:" + finderUsername + ", liveCookies size:" + liveCookies.f192156a.length + ", dislikeId:" + dislikeId);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.zo1 resp = (r45.zo1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mars.xlog.Log.i(this.f228241t, "ljd [onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }
}

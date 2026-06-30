package pk2;

/* loaded from: classes3.dex */
public final class b2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f355568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f355569e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f355570f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f355571g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f355572h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.j32 f355573i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.c32 f355574m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(xg2.h hVar, kotlin.coroutines.Continuation continuation, java.lang.String str, com.tencent.mm.ui.MMActivity mMActivity, kotlinx.coroutines.y0 y0Var, boolean z17, r45.j32 j32Var, r45.c32 c32Var) {
        super(2, continuation);
        this.f355568d = hVar;
        this.f355569e = str;
        this.f355570f = mMActivity;
        this.f355571g = y0Var;
        this.f355572h = z17;
        this.f355573i = j32Var;
        this.f355574m = c32Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pk2.b2(this.f355568d, continuation, this.f355569e, this.f355570f, this.f355571g, this.f355572h, this.f355573i, this.f355574m);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pk2.b2 b2Var = (pk2.b2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.ui.MMActivity mMActivity;
        java.lang.String str2;
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.j01 j01Var = (r45.j01) ((xg2.i) this.f355568d).f454393b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createNotice: cgi success, source=");
        java.lang.String str3 = this.f355569e;
        sb6.append(str3);
        sb6.append(", username=");
        com.tencent.mm.ui.MMActivity mMActivity2 = this.f355570f;
        sb6.append(xy2.c.e(mMActivity2));
        com.tencent.mars.xlog.Log.i("AnchorMoreLiveNoticeOption", sb6.toString());
        ya2.b2 b17 = ya2.h.f460484a.b(xy2.c.e(mMActivity2));
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (b17 != null) {
            com.tencent.mm.protocal.protobuf.FinderContact i17 = ya2.d.i(b17);
            i95.m c17 = i95.n0.c(c61.ub.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.ub ubVar = (c61.ub) c17;
            com.tencent.mm.ui.MMActivity mMActivity3 = this.f355570f;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_IS_FROM_LIVE", true);
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_SELECT_UNSPECIFIC_NOTICE", true);
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_CREATE_SESSION_ID", pk2.l2.f355939n);
            boolean z17 = this.f355572h;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
            pk2.z1 z1Var = new pk2.z1(mMActivity2, this.f355573i, this.f355574m, z17);
            str = "AnchorMoreLiveNoticeOption";
            mMActivity = mMActivity2;
            str2 = ", username=";
            c61.ub.A3(ubVar, mMActivity3, intent, i17, 0, true, valueOf, null, false, j01Var, z1Var, 192, null);
            f0Var = f0Var2;
        } else {
            str = "AnchorMoreLiveNoticeOption";
            mMActivity = mMActivity2;
            str2 = ", username=";
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e(str, "createNotice: finder contact is null, source=" + str3 + str2 + xy2.c.e(mMActivity));
        }
        return f0Var2;
    }
}

package id2;

/* loaded from: classes3.dex */
public final class g2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f290584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f290585e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f290586f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(xg2.h hVar, kotlin.coroutines.Continuation continuation, id2.u3 u3Var, kotlinx.coroutines.y0 y0Var) {
        super(2, continuation);
        this.f290584d = hVar;
        this.f290585e = u3Var;
        this.f290586f = y0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new id2.g2(this.f290584d, continuation, this.f290585e, this.f290586f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        id2.g2 g2Var = (id2.g2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        g2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.j01 j01Var = (r45.j01) ((xg2.i) this.f290584d).f454393b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("createNotice: cgi success, username=");
        id2.u3 u3Var = this.f290585e;
        sb6.append(xy2.c.e(u3Var.getContext()));
        com.tencent.mars.xlog.Log.i("AnchorMoreLiveNoticeOption", sb6.toString());
        ya2.b2 b17 = ya2.h.f460484a.b(xy2.c.e(u3Var.getContext()));
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (b17 != null) {
            com.tencent.mm.protocal.protobuf.FinderContact i17 = ya2.d.i(b17);
            i95.m c17 = i95.n0.c(c61.ub.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.app.Activity context = u3Var.getContext();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_IS_FROM_PROFILE", true);
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_SELECT_UNSPECIFIC_NOTICE", true);
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_CREATE_SESSION_ID", pk2.l2.f355939n);
            str = "AnchorMoreLiveNoticeOption";
            c61.ub.A3((c61.ub) c17, context, intent, i17, 0, true, java.lang.Boolean.FALSE, null, false, j01Var, id2.e2.f290547a, 192, null);
            f0Var = f0Var2;
        } else {
            str = "AnchorMoreLiveNoticeOption";
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e(str, "createNotice: finder contact is null, username=" + xy2.c.e(u3Var.getContext()));
        }
        return f0Var2;
    }
}

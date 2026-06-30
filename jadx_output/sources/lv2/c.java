package lv2;

/* loaded from: classes10.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f321501d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f321502e;

    /* renamed from: f, reason: collision with root package name */
    public int f321503f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.ic0 f321504g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f321505h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ dm.pd f321506i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(bw5.ic0 ic0Var, java.lang.ref.WeakReference weakReference, dm.pd pdVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f321504g = ic0Var;
        this.f321505h = weakReference;
        this.f321506i = pdVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lv2.c(this.f321504g, this.f321505h, this.f321506i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((lv2.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Object c17;
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        bw5.v70 d17;
        bw5.v70 d18;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f321503f;
        jz5.f0 f0Var = jz5.f0.f302826a;
        java.lang.ref.WeakReference weakReference = this.f321505h;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            bw5.ic0 ic0Var = this.f321504g;
            str = ic0Var.hasFieldNumber(1) ? ic0Var.f28524e : "";
            if (str != null) {
                if (!(str.length() == 0)) {
                    com.tencent.mm.ui.widget.dialog.u3 e17 = kv2.h.f312662a.e(weakReference);
                    qk.j8 j8Var = (qk.j8) i95.n0.c(qk.j8.class);
                    this.f321501d = str;
                    this.f321502e = e17;
                    this.f321503f = 1;
                    rk4.l4 l4Var = (rk4.l4) j8Var;
                    l4Var.getClass();
                    c17 = kotlinx.coroutines.a4.c(5000L, new rk4.k4(l4Var, str, str, null), this);
                    if (c17 == aVar) {
                        return aVar;
                    }
                    u3Var = e17;
                }
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.TingMentionTingItemRouteHandler", "listenId is empty");
            kv2.h.f312662a.f(weakReference, com.tencent.mm.R.string.jyt);
            return f0Var;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        u3Var = (com.tencent.mm.ui.widget.dialog.u3) this.f321502e;
        str = (java.lang.String) this.f321501d;
        kotlin.ResultKt.throwOnFailure(obj);
        c17 = obj;
        bw5.lp0 lp0Var = (bw5.lp0) c17;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleJumpTingItemPage, listenId ");
        sb6.append((lp0Var == null || (d18 = lp0Var.d()) == null) ? null : d18.getListenId());
        sb6.append(", title:");
        sb6.append((lp0Var == null || (d17 = lp0Var.d()) == null) ? null : d17.getTitle());
        sb6.append(", commentId:");
        dm.pd pdVar = this.f321506i;
        sb6.append(pdVar.field_commentId);
        sb6.append(", mentionSubtype:");
        sb6.append(pdVar.field_mentionSubtype);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMentionTingItemRouteHandler", sb6.toString());
        if (lp0Var == null) {
            kv2.h.f312662a.f(weakReference, com.tencent.mm.R.string.lg7);
            com.tencent.mars.xlog.Log.w("MicroMsg.TingMentionTingItemRouteHandler", "tingItem is null");
            return f0Var;
        }
        bw5.v70 d19 = lp0Var.d();
        if (!kotlin.jvm.internal.o.b(d19 != null ? d19.getListenId() : null, str)) {
            kv2.h.f312662a.f(weakReference, com.tencent.mm.R.string.lg7);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("listenId not equal, listenId:");
            sb7.append(str);
            sb7.append(", tingItemId:");
            bw5.v70 d27 = lp0Var.d();
            sb7.append(d27 != null ? d27.getListenId() : null);
            com.tencent.mars.xlog.Log.w("MicroMsg.TingMentionTingItemRouteHandler", sb7.toString());
            return f0Var;
        }
        il4.e eVar = new il4.e(null, 0, 0, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554431, null);
        kv2.h hVar = kv2.h.f312662a;
        int i18 = pdVar.field_mentionSubtype;
        if ((i18 > 2000 && i18 < 2999) || i18 == 1002 || i18 == 1004) {
            eVar.f292118o = java.lang.String.valueOf(pdVar.field_commentId);
        }
        android.content.Context context = (android.app.Activity) weakReference.get();
        bw5.ar0 ar0Var = bw5.ar0.TingScene_FinderMsgList;
        eVar.f292106c = 1609;
        o40.e eVar2 = (o40.e) i95.n0.c(o40.e.class);
        if (il4.l.g(lp0Var.d().f34189e)) {
            eVar2.getClass();
            bw5.x40 x40Var = new bw5.x40();
            x40Var.f34956f = lp0Var.d();
            x40Var.f34959i[3] = true;
            if (context == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            kotlin.jvm.internal.o.d(context);
            ((wy2.g) eVar2).Bi(context, x40Var.toByteArray(), kz5.c1.l(new jz5.l("needLoadMore", java.lang.Boolean.FALSE), new jz5.l("refCommentId", new java.lang.Long(pdVar.field_commentId))));
        } else {
            qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            if (context == null) {
                context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            }
            android.content.Context context2 = context;
            kotlin.jvm.internal.o.d(context2);
            qk.f9.b(aj6, context2, true, lp0Var, eVar, null, null, ar0Var, null, 176, null);
        }
        return f0Var;
    }
}

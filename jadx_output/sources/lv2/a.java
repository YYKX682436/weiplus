package lv2;

/* loaded from: classes10.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f321495d;

    /* renamed from: e, reason: collision with root package name */
    public int f321496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.ic0 f321497f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f321498g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dm.pd f321499h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(bw5.ic0 ic0Var, java.lang.ref.WeakReference weakReference, dm.pd pdVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f321497f = ic0Var;
        this.f321498g = weakReference;
        this.f321499h = pdVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lv2.a(this.f321497f, this.f321498g, this.f321499h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((lv2.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object c17;
        com.tencent.mm.ui.widget.dialog.u3 u3Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f321496e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        java.lang.ref.WeakReference weakReference = this.f321498g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            bw5.ic0 ic0Var = this.f321497f;
            java.lang.String str = ic0Var.hasFieldNumber(4) ? ic0Var.f28525f : "";
            if (str != null) {
                if (!(str.length() == 0)) {
                    com.tencent.mm.ui.widget.dialog.u3 e17 = kv2.h.f312662a.e(weakReference);
                    qk.j8 j8Var = (qk.j8) i95.n0.c(qk.j8.class);
                    this.f321495d = e17;
                    this.f321496e = 1;
                    rk4.l4 l4Var = (rk4.l4) j8Var;
                    l4Var.getClass();
                    c17 = kotlinx.coroutines.a4.c(5000L, new rk4.j4(l4Var, str, null), this);
                    if (c17 == aVar) {
                        return aVar;
                    }
                    u3Var = e17;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TingMentionCategoryRouteHandler", "categoryId is empty");
            return f0Var;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        u3Var = (com.tencent.mm.ui.widget.dialog.u3) this.f321495d;
        kotlin.ResultKt.throwOnFailure(obj);
        c17 = obj;
        bw5.o50 o50Var = (bw5.o50) c17;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (o50Var == null) {
            kv2.h.f312662a.f(weakReference, com.tencent.mm.R.string.lg7);
            return f0Var;
        }
        kv2.h hVar = kv2.h.f312662a;
        if ((o50Var.f30964n == 3) && o50Var.W) {
            hVar.f(weakReference, com.tencent.mm.R.string.lg6);
            return f0Var;
        }
        int i18 = o50Var.f30964n;
        if ((i18 == 2 || i18 == 8 || i18 == 9) && o50Var.W) {
            hVar.f(weakReference, com.tencent.mm.R.string.lg8);
            return f0Var;
        }
        int i19 = o50Var.f30964n;
        if ((i19 == 2 || i19 == 8 || i19 == 9) && !o50Var.K && !o50Var.f30966p) {
            hVar.f(weakReference, com.tencent.mm.R.string.lg9);
            return f0Var;
        }
        il4.e eVar = new il4.e(null, 0, 0, false, null, null, 0, 0, false, false, null, null, null, null, null, null, false, false, null, null, false, null, false, null, false, 33554431, null);
        dm.pd mention = this.f321499h;
        kotlin.jvm.internal.o.g(mention, "mention");
        int i27 = mention.field_mentionSubtype;
        if ((i27 > 2000 && i27 < 2999) || i27 == 1002 || i27 == 1004) {
            eVar.f292118o = java.lang.String.valueOf(mention.field_commentId);
        }
        bw5.ar0 ar0Var = bw5.ar0.TingScene_FinderMsgList;
        eVar.f292106c = 1609;
        android.content.Context context = (android.app.Activity) weakReference.get();
        qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        android.content.Context context2 = context;
        kotlin.jvm.internal.o.d(context2);
        ((rk4.k8) aj6).o(context2, o50Var, ar0Var, eVar, null);
        return f0Var;
    }
}

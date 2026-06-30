package vh0;

/* loaded from: classes14.dex */
public final class v2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f436982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f436983e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f436984f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f436985g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f436986h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f436987i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ vh0.f3 f436988m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ vh0.i1 f436989n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ vh0.d1 f436990o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(android.content.Context context, java.util.List list, java.lang.String str, int i17, java.lang.String str2, vh0.f3 f3Var, vh0.i1 i1Var, vh0.d1 d1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f436983e = context;
        this.f436984f = list;
        this.f436985g = str;
        this.f436986h = i17;
        this.f436987i = str2;
        this.f436988m = f3Var;
        this.f436989n = i1Var;
        this.f436990o = d1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vh0.v2(this.f436983e, this.f436984f, this.f436985g, this.f436986h, this.f436987i, this.f436988m, this.f436989n, this.f436990o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vh0.v2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar;
        ai0.i[] iVarArr;
        pz5.a aVar2;
        java.lang.String str;
        java.lang.Object j17;
        vh0.v2 v2Var;
        pz5.a aVar3 = pz5.a.f359186d;
        int i17 = this.f436982d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ai0.g gVar = new ai0.g(this.f436983e, this.f436984f, this.f436985g, this.f436986h, this.f436987i);
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            this.f436982d = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            android.content.Context context = (android.content.Context) gVar.f5078a.get();
            if (context == null) {
                rVar.resumeWith(kotlin.Result.m521constructorimpl(bool));
                aVar = aVar3;
            } else {
                gVar.f5079b = false;
                com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(context, 1, 0);
                android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e0i, (android.view.ViewGroup) null, false);
                android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.oqh);
                android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.olw);
                boolean p17 = r26.i0.p("HK", c01.e2.s(), true);
                textView.setText(context.getString(p17 ? com.tencent.mm.R.string.n6t : com.tencent.mm.R.string.n6s));
                java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) gVar.f5062f;
                com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo iYuanBaoAgreement$AgreementInfo = (com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo) linkedHashMap.get(2);
                java.lang.String string = context.getString(p17 ? com.tencent.mm.R.string.n6v : com.tencent.mm.R.string.n6u);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo iYuanBaoAgreement$AgreementInfo2 = (com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo) linkedHashMap.get(1);
                java.lang.String string2 = context.getString(p17 ? com.tencent.mm.R.string.n6q : com.tencent.mm.R.string.n6p);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                java.lang.String string3 = context.getString(p17 ? com.tencent.mm.R.string.n6n : com.tencent.mm.R.string.n6m, string, string2);
                kotlin.jvm.internal.o.f(string3, "getString(...)");
                vh0.n1 n1Var = (vh0.n1) i95.n0.c(vh0.n1.class);
                ai0.i[] iVarArr2 = {new ai0.i(string, new ai0.e(iYuanBaoAgreement$AgreementInfo, context, n1Var, gVar), com.tencent.mm.R.color.f479311vr, 0, 8, null), new ai0.i(string2, new ai0.f(iYuanBaoAgreement$AgreementInfo2, context, n1Var, gVar), com.tencent.mm.R.color.f479311vr, 0, 8, null)};
                android.text.Spannable newSpannable = android.text.Spannable.Factory.getInstance().newSpannable(string3);
                int i18 = 0;
                while (i18 < 2) {
                    ai0.i iVar = iVarArr2[i18];
                    int L = r26.n0.L(string3, iVar.f5068a, 0, false, 6, null);
                    if (L >= 0) {
                        iVarArr = iVarArr2;
                        str = string3;
                        aVar2 = aVar3;
                        newSpannable.setSpan(new ai0.a(context.getColor(iVar.f5070c), context.getColor(com.tencent.mm.R.color.BW_0_Alpha_0_1), false, new ai0.j(iVar)), L, iVar.f5068a.length() + L, iVar.f5071d);
                    } else {
                        iVarArr = iVarArr2;
                        aVar2 = aVar3;
                        str = string3;
                    }
                    i18++;
                    iVarArr2 = iVarArr;
                    string3 = str;
                    aVar3 = aVar2;
                }
                aVar = aVar3;
                kotlin.jvm.internal.o.d(newSpannable);
                textView2.setText(newSpannable);
                textView2.setMovementMethod(new zh0.d());
                z2Var.m(context.getString(com.tencent.mm.R.string.n6o), context.getString(com.tencent.mm.R.string.n6l));
                z2Var.n(1);
                z2Var.o(0);
                ai0.b bVar = new ai0.b(gVar, z2Var, rVar);
                ai0.c cVar = new ai0.c(gVar, z2Var, rVar);
                z2Var.D = bVar;
                z2Var.E = cVar;
                z2Var.j(inflate);
                com.tencent.mars.xlog.Log.i("MicroMsg.PrivacyAgreementDialog", "gonna show dialog for " + gVar.f5059c + ", " + gVar.f5060d + ", " + gVar.f5061e);
                z2Var.w(new ai0.d(gVar));
                z2Var.l(new ai0.k(gVar, z2Var.f212054J, rVar, bool));
                z2Var.C();
                rVar.m(new ai0.l(z2Var));
            }
            j17 = rVar.j();
            pz5.a aVar4 = pz5.a.f359186d;
            pz5.a aVar5 = aVar;
            if (j17 == aVar5) {
                return aVar5;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            j17 = obj;
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatBotRoutineService", "[+] privacy tos dialog was shown, ret:" + bool2);
        if (kotlin.jvm.internal.o.b(bool2, java.lang.Boolean.TRUE)) {
            v2Var = this;
            kotlinx.coroutines.l.d(v2Var.f436988m.f436858e, null, null, new vh0.u2(v2Var.f436990o, v2Var.f436985g, v2Var.f436984f, null), 3, null);
        } else {
            v2Var = this;
        }
        vh0.i1 i1Var = v2Var.f436989n;
        if (i1Var != null) {
            i1Var.onResult(bool2);
        }
        return jz5.f0.f302826a;
    }
}

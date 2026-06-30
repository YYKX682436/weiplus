package sc2;

/* loaded from: classes2.dex */
public final class q3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f406163d;

    /* renamed from: e, reason: collision with root package name */
    public int f406164e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sc2.u3 f406165f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f406166g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.wf6 f406167h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.MMPAGView f406168i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(sc2.u3 u3Var, int i17, r45.wf6 wf6Var, com.tencent.mm.view.MMPAGView mMPAGView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f406165f = u3Var;
        this.f406166g = i17;
        this.f406167h = wf6Var;
        this.f406168i = mMPAGView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sc2.q3(this.f406165f, this.f406166g, this.f406167h, this.f406168i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sc2.q3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.Object h17;
        java.lang.String str3;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f406164e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        int i18 = this.f406166g;
        com.tencent.mm.view.MMPAGView mMPAGView = this.f406168i;
        sc2.u3 u3Var = this.f406165f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.Object a07 = kz5.n0.a0(u3Var.B, i18);
            r45.wf6 wf6Var = this.f406167h;
            r45.v35 v35Var = (r45.v35) wf6Var.getCustom(44);
            if (kotlin.jvm.internal.o.b(a07, v35Var != null ? v35Var.getString(0) : null) || i18 > u3Var.B.size()) {
                java.lang.String str4 = u3Var.f406279w;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("index ");
                sb6.append(i18);
                sb6.append(' ');
                r45.v35 v35Var2 = (r45.v35) wf6Var.getCustom(44);
                sb6.append(v35Var2 != null ? v35Var2.getString(0) : null);
                sb6.append(" has loading finish or null");
                com.tencent.mars.xlog.Log.i(str4, sb6.toString());
                return f0Var;
            }
            java.util.List list = u3Var.B;
            r45.v35 v35Var3 = (r45.v35) wf6Var.getCustom(44);
            if (v35Var3 == null || (str = v35Var3.getString(0)) == null) {
                str = "";
            }
            list.set(i18, str);
            r45.v35 v35Var4 = (r45.v35) wf6Var.getCustom(44);
            if (v35Var4 == null || (str2 = v35Var4.getString(0)) == null) {
                str2 = "";
            }
            if (mMPAGView.getUseRfx()) {
                rj.j a17 = nn2.d.f338671a.a();
                java.lang.String str5 = u3Var.f406279w;
                this.f406163d = str2;
                this.f406164e = 1;
                h17 = ((b51.m) a17).j(str2, str5, this);
                if (h17 == aVar) {
                    return aVar;
                }
            } else {
                rj.j a18 = nn2.d.f338671a.a();
                java.lang.String str6 = u3Var.f406279w;
                this.f406163d = str2;
                this.f406164e = 2;
                h17 = ((b51.m) a18).h(str2, str6, this);
                if (h17 == aVar) {
                    return aVar;
                }
            }
            str3 = str2;
            obj = h17;
        } else {
            if (i17 != 1 && i17 != 2) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (java.lang.String) this.f406163d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i(u3Var.f406279w, str3 + " loading finish. " + obj);
        if (obj != null) {
            if (mMPAGView.getUseRfx()) {
                mMPAGView.setComposition(obj instanceof com.tencent.mm.rfx.RfxPagFile ? (com.tencent.mm.rfx.RfxPagFile) obj : null);
            } else {
                mMPAGView.setComposition(obj instanceof org.libpag.PAGFile ? (org.libpag.PAGFile) obj : null);
            }
            if (mMPAGView.c() / 1000 != 0) {
                mMPAGView.setProgress(u3Var.f406282z / r0);
                u3Var.D.set(i18, new java.lang.Double(mMPAGView.getProgress()));
                mMPAGView.d();
            }
        }
        return f0Var;
    }
}

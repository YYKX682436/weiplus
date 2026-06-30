package gc0;

/* loaded from: classes5.dex */
public final class u1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.FlowLayout f270295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f270296e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f270297f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f270298g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gc0.b0 f270299h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f270300i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(com.tencent.mm.ui.base.FlowLayout flowLayout, java.util.List list, gc0.p2 p2Var, boolean z17, gc0.b0 b0Var, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f270295d = flowLayout;
        this.f270296e = list;
        this.f270297f = p2Var;
        this.f270298g = z17;
        this.f270299h = b0Var;
        this.f270300i = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gc0.u1(this.f270295d, this.f270296e, this.f270297f, this.f270298g, this.f270299h, this.f270300i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        gc0.u1 u1Var = (gc0.u1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        u1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.ui.base.FlowLayout flowLayout = this.f270295d;
        android.content.Context context = flowLayout.getContext();
        java.util.Iterator it = this.f270296e.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            z17 = this.f270298g;
            if (!hasNext) {
                break;
            }
            r45.kl5 kl5Var = (r45.kl5) it.next();
            java.lang.String string = kl5Var.getString(1);
            if (string != null && (true ^ r26.n0.N(string))) {
                kotlin.jvm.internal.o.d(context);
                android.view.View O6 = gc0.p2.O6(this.f270297f, context, string);
                if (O6 != null) {
                    gc0.p2 p2Var = this.f270297f;
                    O6.setOnClickListener(new gc0.t1(this.f270300i, string, p2Var, kl5Var, O6));
                    flowLayout.addView(O6);
                    p2Var.f270248m.a(kl5Var, O6, 2, this.f270299h.f270099a);
                }
                if (z17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.RecommendRemarkUIC", "initRecommendRemark phone:" + string + " phonenotshow for reachPhoneLimit:" + z17);
                }
            }
        }
        if (flowLayout.getChildCount() <= 0 || z17) {
            flowLayout.setVisibility(8);
        } else {
            flowLayout.setVisibility(0);
        }
        return jz5.f0.f302826a;
    }
}

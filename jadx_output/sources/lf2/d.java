package lf2;

/* loaded from: classes10.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lf2.s f318280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f318281e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(lf2.s sVar, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f318280d = sVar;
        this.f318281e = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lf2.d(this.f318280d, this.f318281e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        lf2.d dVar = (lf2.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        lf2.s sVar = this.f318280d;
        boolean z17 = this.f318281e == 2;
        gk2.e eVar = sVar.H;
        boolean z18 = z17 && !((om2.e) eVar.a(om2.e.class)).f346296o;
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn = sVar.V;
        if (mMSwitchBtn == null) {
            kotlin.jvm.internal.o.o("earSwitch");
            throw null;
        }
        mMSwitchBtn.setEnabled(z17);
        com.tencent.mm.ui.widget.MMSwitchBtn mMSwitchBtn2 = sVar.V;
        if (mMSwitchBtn2 == null) {
            kotlin.jvm.internal.o.o("earSwitch");
            throw null;
        }
        mMSwitchBtn2.setCheck(z18);
        ((kotlinx.coroutines.flow.h3) ((om2.e) eVar.a(om2.e.class)).f346295n).k(java.lang.Boolean.valueOf(z18));
        return jz5.f0.f302826a;
    }
}

package im2;

/* loaded from: classes2.dex */
public final class w2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f292593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f292594e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f292595f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(im2.z3 z3Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f292594e = z3Var;
        this.f292595f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new im2.w2(this.f292594e, this.f292595f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((im2.w2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object b17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f292593d;
        im2.z3 z3Var = this.f292594e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            new qx2.g(z3Var.getContext());
            qx2.g gVar = new qx2.g(z3Var.getContext());
            java.lang.String string = z3Var.getContext().getResources().getString(com.tencent.mm.R.string.f491463d55);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.String string2 = z3Var.getContext().getResources().getString(com.tencent.mm.R.string.f491464d56);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            qx2.a aVar2 = new qx2.a(string, string2, "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/BsB5Jid0M6gtMOz8");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.String string3 = z3Var.getContext().getResources().getString(com.tencent.mm.R.string.d57);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            arrayList.add(new qx2.a(string3, null, null, 6, null));
            java.lang.String string4 = z3Var.getContext().getResources().getString(com.tencent.mm.R.string.d58);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            arrayList.add(new qx2.a(string4, null, null, 6, null));
            this.f292593d = 1;
            b17 = gVar.b(aVar2, arrayList, this);
            if (b17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            b17 = obj;
        }
        boolean booleanValue = ((java.lang.Boolean) b17).booleanValue();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!booleanValue) {
            return f0Var;
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_PRE_SALE_ANCHOR_LICENSE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        z3Var.v7(true);
        im2.z3.q7(z3Var, this.f292595f);
        return f0Var;
    }
}

package wq2;

/* loaded from: classes2.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f448507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wq2.h f448508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f448509f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.modelbase.f fVar, wq2.h hVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f448507d = fVar;
        this.f448508e = hVar;
        this.f448509f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wq2.a(this.f448507d, this.f448508e, this.f448509f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        wq2.a aVar = (wq2.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        aVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#loadDataWithCgi cgi end. errType=");
        com.tencent.mm.modelbase.f fVar = this.f448507d;
        sb6.append(fVar.f70615a);
        sb6.append(", errCode=");
        sb6.append(fVar.f70616b);
        sb6.append(", errMsg=");
        sb6.append(fVar.f70617c);
        sb6.append(", themeId=");
        wq2.h hVar = this.f448508e;
        sb6.append(hVar.f448535g);
        com.tencent.mars.xlog.Log.i("Finder.LiveSpecialFragmentViewCallback", sb6.toString());
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.yz2 yz2Var = (r45.yz2) fVar.f70618d;
            hVar.f448532d = yz2Var;
            hVar.a(yz2Var, this.f448509f);
            hVar.f448537i.R6(((r45.yz2) fVar.f70618d).f391533w * 1000);
        }
        if (((r45.yz2) fVar.f70618d).getBaseResponse().f376959d == -101) {
            r45.du5 du5Var = ((r45.yz2) fVar.f70618d).getBaseResponse().f376960e;
            java.lang.String str = du5Var != null ? du5Var.f372756d : null;
            if (str == null) {
                str = "";
            }
            if (str.length() == 0) {
                str = ((com.tencent.mm.ui.MMActivity) hVar.f448529a).getResources().getString(com.tencent.mm.R.string.m9h);
                kotlin.jvm.internal.o.f(str, "getString(...)");
            }
            com.tencent.mars.xlog.Log.i("Finder.LiveSpecialFragmentViewCallback", "loadDataWithCgi: theme is disable, finish activity, toastMsg=".concat(str));
            db5.t7.makeText(hVar.f448529a, str, 0).show();
            hVar.f448529a.finish();
        }
        return jz5.f0.f302826a;
    }
}

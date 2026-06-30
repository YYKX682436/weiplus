package th5;

/* loaded from: classes.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f419479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ th5.z0 f419480e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f419481f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f419482g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(th5.z0 z0Var, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f419480e = z0Var;
        this.f419481f = str;
        this.f419482g = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new th5.y0(this.f419480e, this.f419481f, this.f419482g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((th5.y0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f419479d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            th5.x0 x0Var = new th5.x0(this.f419481f, this.f419482g, null);
            this.f419479d = 1;
            obj = kotlinx.coroutines.l.g(p0Var, x0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        aq.s0 s0Var = (aq.s0) obj;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (s0Var == null) {
            return f0Var;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("exportAsLivePhoto result: rsp=");
        boolean z17 = s0Var.f12960a;
        sb6.append(z17);
        sb6.append(" errCode=");
        sb6.append(s0Var.f12961b);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPhotoSaveComponent", sb6.toString());
        th5.z0 z0Var = this.f419480e;
        if (z17) {
            androidx.appcompat.app.AppCompatActivity activity = z0Var.getActivity();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(activity);
            e4Var.d(com.tencent.mm.R.string.ncn);
            e4Var.b(com.tencent.mm.R.raw.icons_filled_done);
            e4Var.c();
        } else {
            androidx.appcompat.app.AppCompatActivity activity2 = z0Var.getActivity();
            int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(activity2);
            e4Var2.f211776c = z0Var.getActivity().getString(com.tencent.mm.R.string.og6);
            e4Var2.c();
        }
        return f0Var;
    }
}

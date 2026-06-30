package df2;

/* loaded from: classes.dex */
public final class q3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f231130d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.u3 f231131e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(xg2.h hVar, kotlin.coroutines.Continuation continuation, df2.u3 u3Var) {
        super(2, continuation);
        this.f231130d = hVar;
        this.f231131e = u3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.q3(this.f231130d, continuation, this.f231131e);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.q3 q3Var = (df2.q3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        q3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f231130d).f454381b;
        rm0.j jVar = aVar2.f454379a;
        int i17 = jVar != null ? jVar.f397425f : -1;
        if (jVar == null || (str = jVar.getMessage()) == null) {
            str = "";
        }
        rm0.j jVar2 = aVar2.f454379a;
        com.tencent.mars.xlog.Log.i("FinderLiveSetMicTopicController", "modifyMicTopic fail, errCode: " + i17 + " errType: " + (jVar2 != null ? jVar2.f397424e : -1) + " errMsg: " + str);
        boolean z17 = str.length() == 0;
        df2.u3 u3Var = this.f231131e;
        if (z17) {
            str = u3Var.O6().getResources().getString(com.tencent.mm.R.string.p0r);
            kotlin.jvm.internal.o.f(str, "getString(...)");
        }
        android.content.Context O6 = u3Var.O6();
        int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(O6);
        e4Var.f211776c = str;
        e4Var.b(com.tencent.mm.R.raw.exclamation_mark_circle_regular);
        e4Var.c();
        return jz5.f0.f302826a;
    }
}

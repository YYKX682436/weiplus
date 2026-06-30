package df2;

/* loaded from: classes3.dex */
public final class r3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f231217d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.u3 f231218e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231219f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(xg2.h hVar, kotlin.coroutines.Continuation continuation, df2.u3 u3Var, java.lang.String str) {
        super(2, continuation);
        this.f231217d = hVar;
        this.f231218e = u3Var;
        this.f231219f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.r3(this.f231217d, continuation, this.f231218e, this.f231219f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.r3 r3Var = (df2.r3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        r3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.m02 m02Var = (r45.m02) ((xg2.i) this.f231217d).f454393b;
        com.tencent.mars.xlog.Log.i("FinderLiveSetMicTopicController", "modifyMicTopic success");
        java.util.LinkedList list = m02Var.getList(1);
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                boolean z17 = false;
                if (((r45.ix0) obj2).getInteger(0) == 25) {
                    z17 = true;
                }
                if (z17) {
                    break;
                }
            }
            r45.ix0 ix0Var = (r45.ix0) obj2;
            if (ix0Var != null) {
                com.tencent.mars.xlog.Log.i("FinderLiveSetMicTopicController", "modifyMicTopic result: " + ix0Var.getInteger(1) + " msg: " + ix0Var.getString(2));
            }
        }
        df2.u3 u3Var = this.f231218e;
        xh2.e eVar = (xh2.e) ((mm2.y2) u3Var.business(mm2.y2.class)).B.getValue();
        if (eVar == null || (str = eVar.f454543a) == null) {
            str = "";
        }
        ((mm2.y2) u3Var.business(mm2.y2.class)).B.setValue(new xh2.e(str, this.f231219f, (eVar != null ? eVar.f454545c : -1L) + 1));
        android.content.Context O6 = u3Var.O6();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(O6);
        e4Var.d(com.tencent.mm.R.string.nve);
        e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
        e4Var.c();
        return jz5.f0.f302826a;
    }
}

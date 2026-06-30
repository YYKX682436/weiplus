package ej4;

/* loaded from: classes4.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f253380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f253381e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ej4.v f253382f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.widget.TextView textView, ej4.v vVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f253381e = textView;
        this.f253382f = vVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ej4.u(this.f253381e, this.f253382f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ej4.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f253380d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            bk4.f a17 = bk4.i.a();
            android.widget.TextView textView = this.f253381e;
            ej4.v vVar = this.f253382f;
            java.lang.CharSequence O = a17.O(textView, vVar.f253374a, textView.getText(), i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 20), vVar.f253384e, vVar.f253385f);
            if (O != null) {
                android.widget.TextView textView2 = this.f253381e;
                if (!kotlin.jvm.internal.o.b(textView2.getText(), O)) {
                    if (O instanceof android.text.Spannable) {
                        fe0.k4 k4Var = (fe0.k4) i95.n0.c(fe0.k4.class);
                        java.lang.String userName = vVar.f253383d;
                        ((ee0.n4) k4Var).getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cacheSnsNickSpan", "com.tencent.mm.feature.sns.SnsFeatureService");
                        kotlin.jvm.internal.o.g(userName, "userName");
                        java.util.HashMap hashMap = nd4.f.f336478a;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("put", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineSpanPool");
                        nd4.f.f336478a.put(userName.concat("-1"), (android.text.Spannable) O);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("put", "com.tencent.mm.plugin.sns.ui.item.improve.recycle.TimelineSpanPool");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cacheSnsNickSpan", "com.tencent.mm.feature.sns.SnsFeatureService");
                    }
                    kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                    kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
                    ej4.t tVar = new ej4.t(textView2, vVar, O, null);
                    this.f253380d = 1;
                    if (kotlinx.coroutines.l.g(g3Var, tVar, this) == aVar) {
                        return aVar;
                    }
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}

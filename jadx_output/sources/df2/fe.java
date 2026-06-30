package df2;

/* loaded from: classes3.dex */
public final class fe extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vm1 f230136e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.qe f230137f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe(r45.vm1 vm1Var, df2.qe qeVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230136e = vm1Var;
        this.f230137f = qeVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.fe(this.f230136e, this.f230137f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.fe) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230135d;
        r45.vm1 vm1Var = this.f230136e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str2 = "beginDownload url: " + vm1Var.getString(2);
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("LiveButtonChangeController", str2, null);
            if (ae2.in.f3688a.a(ym5.f6.f463319p1)) {
                rj.j b17 = nn2.d.f338671a.b();
                java.lang.String string = vm1Var.getString(2);
                str = string != null ? string : "";
                this.f230135d = 1;
                obj = ((b51.m) b17).j(str, "LiveButtonChangeController", this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                rj.j b18 = nn2.d.f338671a.b();
                java.lang.String string2 = vm1Var.getString(2);
                str = string2 != null ? string2 : "";
                this.f230135d = 2;
                obj = ((b51.m) b18).h(str, "LiveButtonChangeController", this);
                if (obj == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1 && i17 != 2) {
                if (i17 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                java.lang.String str3 = "download url: " + vm1Var.getString(2) + ", delay: " + vm1Var.getInteger(3) + ", canPlayTime: " + (vm1Var.getInteger(3) + c01.id.c());
                int i19 = rl.b.f397143a;
                com.tencent.mars.xlog.Log.i("LiveButtonChangeController", str3, null);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (obj != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            df2.ee eeVar = new df2.ee(this.f230137f, vm1Var, obj, null);
            this.f230135d = 3;
            if (kotlinx.coroutines.l.g(g3Var, eeVar, this) == aVar) {
                return aVar;
            }
            java.lang.String str32 = "download url: " + vm1Var.getString(2) + ", delay: " + vm1Var.getInteger(3) + ", canPlayTime: " + (vm1Var.getInteger(3) + c01.id.c());
            int i192 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("LiveButtonChangeController", str32, null);
        }
        return jz5.f0.f302826a;
    }
}

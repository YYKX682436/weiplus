package vd0;

/* loaded from: classes8.dex */
public final class e3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f435397d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vd0.l3 f435398e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435399f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f435400g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(androidx.appcompat.app.AppCompatActivity appCompatActivity, vd0.l3 l3Var, java.lang.String str, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f435397d = appCompatActivity;
        this.f435398e = l3Var;
        this.f435399f = str;
        this.f435400g = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vd0.e3(this.f435397d, this.f435398e, this.f435399f, this.f435400g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vd0.e3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f435397d;
        androidx.lifecycle.n b17 = appCompatActivity.mo133getLifecycle().b();
        androidx.lifecycle.n nVar = androidx.lifecycle.n.DESTROYED;
        jz5.f0 f0Var = jz5.f0.f302826a;
        final int i17 = this.f435400g;
        final java.lang.String str = this.f435399f;
        final vd0.l3 l3Var = this.f435398e;
        if (b17 == nVar) {
            vd0.l3.Bi(l3Var, str, new java.lang.Integer(i17));
            return f0Var;
        }
        appCompatActivity.mo133getLifecycle().a(new androidx.lifecycle.f() { // from class: com.tencent.mm.feature.setting.SettingSearchFeatureService$bindLifecycleOnMain$2$1
            @Override // androidx.lifecycle.f, androidx.lifecycle.h
            public void onDestroy(androidx.lifecycle.y owner) {
                kotlin.jvm.internal.o.g(owner, "owner");
                vd0.l3.Bi(vd0.l3.this, str, java.lang.Integer.valueOf(i17));
                owner.mo133getLifecycle().c(this);
            }
        });
        return f0Var;
    }
}

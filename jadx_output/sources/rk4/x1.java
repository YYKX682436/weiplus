package rk4;

/* loaded from: classes.dex */
public final class x1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f397067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397068e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f397069f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(java.lang.String str, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f397068e = str;
        this.f397069f = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk4.x1(this.f397068e, this.f397069f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.x1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f397067d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rk4.u6 u6Var = rk4.k8.f396788r;
            al4.a aVar2 = rk4.k8.f396790t;
            if (aVar2 != null) {
                this.f397067d = 1;
                ((com.tencent.mm.plugin.ting.TingFlutterActivity) aVar2).c7(this);
                if (f0Var == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("goToProfile userName: ");
        java.lang.String str = this.f397068e;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", sb6.toString());
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null) {
            com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", "goToProfile contact is null");
            return f0Var;
        }
        if (!n17.r2()) {
            com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", "goToProfile user is not contact");
            return f0Var;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", str);
        j45.l.j(this.f397069f, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        return f0Var;
    }
}

package vm1;

/* loaded from: classes10.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f437980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437981e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f437982f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(java.lang.String str, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f437981e = str;
        this.f437982f = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vm1.a0(this.f437981e, this.f437982f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vm1.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f437980d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            um1.a aVar2 = mm1.b0.f328635i;
            um1.a aVar3 = mm1.b0.f328635i;
            if (aVar3 != null) {
                this.f437980d = 1;
                ((com.tencent.mm.plugin.audio.BizAudioFlutterActivity) aVar3).a7(this);
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
        java.lang.String str = this.f437981e;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", sb6.toString());
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null) {
            com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "goToProfile contact is null");
            return f0Var;
        }
        if (!n17.r2()) {
            com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", "goToProfile user is not contact");
            return f0Var;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", str);
        j45.l.j(this.f437982f, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        return f0Var;
    }
}

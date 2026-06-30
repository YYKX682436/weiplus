package rk4;

/* loaded from: classes.dex */
public final class y1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f397092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397093e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f397094f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f397095g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f397096h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(java.lang.String str, long j17, java.lang.String str2, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f397093e = str;
        this.f397094f = j17;
        this.f397095g = str2;
        this.f397096h = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk4.y1(this.f397093e, this.f397094f, this.f397095g, this.f397096h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.y1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f397092d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rk4.u6 u6Var = rk4.k8.f396788r;
            al4.a aVar2 = rk4.k8.f396790t;
            if (aVar2 != null) {
                this.f397092d = 1;
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
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", this.f397093e);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("Contact_Scene", (int) this.f397094f);
        intent.putExtra("Contact_Scene_Note", this.f397095g);
        j45.l.j(this.f397096h, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        return f0Var;
    }
}

package vm1;

/* loaded from: classes10.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f437984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437985e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f437986f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437987g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f437988h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.lang.String str, long j17, java.lang.String str2, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f437985e = str;
        this.f437986f = j17;
        this.f437987g = str2;
        this.f437988h = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vm1.b0(this.f437985e, this.f437986f, this.f437987g, this.f437988h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vm1.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f437984d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            um1.a aVar2 = mm1.b0.f328635i;
            um1.a aVar3 = mm1.b0.f328635i;
            if (aVar3 != null) {
                this.f437984d = 1;
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
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", this.f437985e);
        intent.putExtra("force_get_contact", true);
        intent.putExtra("key_use_new_contact_profile", true);
        intent.putExtra("Contact_Scene", (int) this.f437986f);
        intent.putExtra("Contact_Scene_Note", this.f437987g);
        j45.l.j(this.f437988h, com.google.android.gms.common.Scopes.PROFILE, ".ui.ContactInfoUI", intent, null);
        return f0Var;
    }
}

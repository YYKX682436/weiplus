package q61;

/* loaded from: classes4.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f360231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360232e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f360233f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q61.d f360234g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String str, byte[] bArr, q61.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f360232e = str;
        this.f360233f = bArr;
        this.f360234g = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new q61.a(this.f360232e, this.f360233f, this.f360234g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((q61.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f360231d;
        q61.d dVar = this.f360234g;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                q61.c cVar = q61.c.f360240a;
                java.lang.String str = this.f360232e;
                byte[] bArr = this.f360233f;
                this.f360231d = 1;
                obj = q61.c.a(cVar, str, bArr, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            jz5.l lVar = (jz5.l) obj;
            if (dVar != null) {
                ((com.tencent.mm.plugin.account.ui.LoginFastSwitchUI$$b) dVar).a(((java.lang.Boolean) lVar.f302833d).booleanValue(), (r45.pd4) lVar.f302834e);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CheckLoginQRCodeCGI", "checkLoginQRCode error: " + e17.getMessage());
            if (dVar != null) {
                ((com.tencent.mm.plugin.account.ui.LoginFastSwitchUI$$b) dVar).a(false, null);
            }
        }
        return jz5.f0.f302826a;
    }
}

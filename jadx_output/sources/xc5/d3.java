package xc5;

/* loaded from: classes12.dex */
public final class d3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f453419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xf0.i f453420e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc5.e3 f453421f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f453422g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mf3.k f453423h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gg3.c f453424i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f453425m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(xf0.i iVar, xc5.e3 e3Var, java.lang.String str, mf3.k kVar, gg3.c cVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453420e = iVar;
        this.f453421f = e3Var;
        this.f453422g = str;
        this.f453423h = kVar;
        this.f453424i = cVar;
        this.f453425m = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xc5.d3(this.f453420e, this.f453421f, this.f453422g, this.f453423h, this.f453424i, this.f453425m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xc5.d3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        xf0.j jVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f453419d;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                xf0.s a17 = xf0.s.f454216f.a();
                xf0.i iVar = this.f453420e;
                this.f453419d = 1;
                obj = a17.T6(iVar, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            jVar = (xf0.j) obj;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryVideoStateManager", "downloadMsgVideo exception: " + e17.getMessage());
            jVar = null;
        }
        xc5.e3 e3Var = this.f453421f;
        java.util.HashSet Z6 = e3Var.Z6();
        java.lang.String str = this.f453422g;
        Z6.remove(str);
        if ((jVar != null ? jVar.f454192a : null) == xf0.k.f454194d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryVideoStateManager", "download video success. mediaId: " + str);
            e3Var.Y6(this.f453423h, this.f453424i, this.f453425m);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryVideoStateManager", "download video failed. mediaId: " + str + ", result: " + jVar);
            e3Var.f453440h.remove(str);
            jg3.b.X6(this.f453421f, this.f453423h, gg3.d.f271734f, this.f453424i, null, 4, null);
        }
        return jz5.f0.f302826a;
    }
}

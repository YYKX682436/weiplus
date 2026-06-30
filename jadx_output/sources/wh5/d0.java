package wh5;

/* loaded from: classes12.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l70.d f446044d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l70.d f446045e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mf3.k f446046f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wh5.g0 f446047g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wh5.v f446048h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(l70.d dVar, l70.d dVar2, mf3.k kVar, wh5.g0 g0Var, wh5.v vVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f446044d = dVar;
        this.f446045e = dVar2;
        this.f446046f = kVar;
        this.f446047g = g0Var;
        this.f446048h = vVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wh5.d0(this.f446044d, this.f446045e, this.f446046f, this.f446047g, this.f446048h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wh5.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        l70.d dVar = this.f446044d;
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(dVar.f316805f);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        boolean F = !m17.a() ? false : m17.f213266a.F(m17.f213267b);
        jz5.f0 f0Var = jz5.f0.f302826a;
        wh5.g0 g0Var = this.f446047g;
        if (F) {
            l70.d dVar2 = this.f446045e;
            com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(dVar2.f316805f);
            java.lang.String str2 = a18.f213279f;
            if (str2 != null) {
                java.lang.String l18 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l18)) {
                    a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l18, a18.f213280g, a18.f213281h);
                }
            }
            com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a18, null);
            if (m18.a() ? m18.f213266a.F(m18.f213267b) : false) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("live res already exists. mediaId: ");
                mf3.k kVar = this.f446046f;
                sb6.append(kVar.getId());
                sb6.append(" videoPath: ");
                sb6.append(dVar.f316805f);
                sb6.append(" imagePath: ");
                sb6.append(dVar2.f316805f);
                com.tencent.mars.xlog.Log.i("MediaGallery.ChatLiveStateManager", sb6.toString());
                wh5.g0.b7(g0Var, kVar, dVar.f316805f);
                vf3.i.Z6(this.f446047g, this.f446046f, vf3.e.f436378e, null, null, null, 14, null);
                return f0Var;
            }
        }
        vf3.i.Z6(this.f446047g, this.f446046f, vf3.e.f436380g, null, null, null, 14, null);
        l70.d dVar3 = this.f446044d;
        l70.d dVar4 = this.f446045e;
        g0Var.getClass();
        wh5.v vVar = this.f446048h;
        v65.i.b(g0Var.f436401f, null, new wh5.f0(g0Var, vVar, dVar4, dVar3, vVar.getId(), null), 1, null);
        return f0Var;
    }
}

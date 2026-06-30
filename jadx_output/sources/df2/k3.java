package df2;

/* loaded from: classes5.dex */
public final class k3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f230552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.p3 f230553e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(df2.p3 p3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230553e = p3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.k3(this.f230553e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.k3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f230552d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            vl2.s sVar = vl2.s.f437868a;
            vl2.h hVar = vl2.h.f437825n;
            this.f230552d = 1;
            obj = sVar.b(hVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.wechat.aff.udr.x xVar = (com.tencent.wechat.aff.udr.x) obj;
        if (xVar != null) {
            java.lang.String c17 = xVar.c();
            if (c17 == null) {
                c17 = "";
            }
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(c17));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("load file, dir size: ");
            java.lang.String[] D = r6Var.D();
            sb6.append(D != null ? new java.lang.Integer(D.length) : null);
            com.tencent.mars.xlog.Log.i("FinderLiveRenderController", sb6.toString());
            if (r6Var.y()) {
                java.lang.String[] D2 = r6Var.D();
                if (D2 != null && D2.length == 0) {
                    java.lang.String path = xVar.getPath();
                    kotlin.jvm.internal.o.f(path, "getPath(...)");
                    java.lang.String c18 = xVar.c();
                    if (c18 == null) {
                        c18 = "";
                    }
                    wl2.e.a(path, c18);
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("unZip file size: ");
                    java.lang.String[] D3 = r6Var.D();
                    sb7.append(D3 != null ? new java.lang.Integer(D3.length) : null);
                    com.tencent.mars.xlog.Log.i("FinderLiveRenderController", sb7.toString());
                }
            }
            java.lang.String c19 = xVar.c();
            this.f230553e.f231030n = c19 != null ? c19 : "";
        }
        return jz5.f0.f302826a;
    }
}

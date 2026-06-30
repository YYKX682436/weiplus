package jn2;

/* loaded from: classes8.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f300589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.r1 f300590e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.z22 f300591f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f300592g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f300593h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(jn2.r1 r1Var, r45.z22 z22Var, java.lang.String str, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f300590e = r1Var;
        this.f300591f = z22Var;
        this.f300592g = str;
        this.f300593h = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jn2.e1(this.f300590e, this.f300591f, this.f300592g, this.f300593h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((jn2.e1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f300589d;
        jn2.r1 r1Var = this.f300590e;
        try {
            if (i17 == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                sf2.x xVar = r1Var.I;
                java.util.List c17 = kz5.b0.c(this.f300591f);
                this.f300589d = 1;
                obj = xVar.b7(c17, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
            java.lang.String str = this.f300592g;
            if (booleanValue) {
                com.tencent.mars.xlog.Log.i(r1Var.f300682J, "deleteNewSong success: " + str);
                jn2.z1 z1Var = r1Var.f300686x0;
                int i18 = this.f300593h;
                if (z1Var != null && (arrayList2 = z1Var.f300769h) != null) {
                }
                jn2.z1 z1Var2 = r1Var.f300686x0;
                if (z1Var2 != null) {
                    z1Var2.notifyItemRemoved(i18);
                }
                jn2.z1 z1Var3 = r1Var.f300686x0;
                int size = (z1Var3 == null || (arrayList = z1Var3.f300769h) == null) ? 0 : arrayList.size();
                r1Var.k(size);
                if (size == 0) {
                    r1Var.d(false);
                }
            } else {
                com.tencent.mars.xlog.Log.e(r1Var.f300682J, "deleteNewSong failed: " + str);
                db5.t7.m(r1Var.f118183e, "删除失败，请稍后再试");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(r1Var.f300682J, "deleteNewSong exception: " + e17.getMessage());
            db5.t7.m(r1Var.f118183e, "删除失败，请稍后再试");
        }
        return jz5.f0.f302826a;
    }
}

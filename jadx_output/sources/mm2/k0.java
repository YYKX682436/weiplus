package mm2;

/* loaded from: classes3.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f329187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.nn1 f329188e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm2.l0 f329189f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(r45.nn1 nn1Var, mm2.l0 l0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f329188e = nn1Var;
        this.f329189f = l0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mm2.k0(this.f329188e, this.f329189f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mm2.k0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f329187d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            r45.i30 i30Var = (r45.i30) this.f329188e.getCustom(4);
            java.lang.String N6 = this.f329189f.N6(i30Var);
            if ((N6 == null || N6.length() == 0) || i30Var == null) {
                com.tencent.mars.xlog.Log.e("LiveCheerAnimationSlice", "checkPreload return, getPagPath error : " + N6 + " resource: " + i30Var);
                return f0Var;
            }
            java.lang.String e17 = kk.k.e(N6);
            if (com.tencent.mm.vfs.w6.j(N6)) {
                if (kotlin.jvm.internal.o.b(i30Var.getString(1), e17)) {
                    com.tencent.mars.xlog.Log.e("LiveCheerAnimationSlice", "checkPreload return, file exists : " + N6 + " tempMd5: " + e17);
                    return f0Var;
                }
                com.tencent.mars.xlog.Log.e("LiveCheerAnimationSlice", "checkPreload file not valid, tempMd5: " + e17);
                com.tencent.mm.vfs.w6.h(N6);
            }
            wh2.l lVar = wh2.l.f445955a;
            java.lang.String string = i30Var.getString(0);
            if (string == null) {
                string = "";
            }
            this.f329187d = 1;
            obj = lVar.a(string, N6, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mars.xlog.Log.i("LiveCheerAnimationSlice", "checkPreload result: " + ((wh2.i) obj));
        return f0Var;
    }
}

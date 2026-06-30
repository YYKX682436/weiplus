package mx3;

/* loaded from: classes10.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f332541d;

    /* renamed from: e, reason: collision with root package name */
    public int f332542e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vx3.c f332543f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332544g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f332545h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(vx3.c cVar, java.lang.String str, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332543f = cVar;
        this.f332544g = str;
        this.f332545h = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx3.d0(this.f332543f, this.f332544g, this.f332545h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx3.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        vx3.c cVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332542e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            vx3.c cVar2 = this.f332543f;
            if (cVar2 != null) {
                int ordinal = cVar2.f441270a.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        mx3.f0 f0Var = mx3.f0.f332548a;
                        java.lang.String str = mx3.f0.f332553f;
                        f0Var.d(str);
                        dk4.a aVar2 = new dk4.a("voip_ending_sound", f0Var.d(str), "", 0, 0);
                        aVar2.f234468e = true;
                        return new vx3.i(aVar2, 0L, com.tencent.wcdb.core.Database.DictDefaultMatchValue);
                    }
                    if (ordinal == 2) {
                        mx3.f0 f0Var2 = mx3.f0.f332548a;
                        f0Var2.d(mx3.f0.f332553f);
                        dk4.a aVar3 = new dk4.a("voip_bad_net_sound", f0Var2.d(mx3.f0.f332555h), "", 0, 0);
                        aVar3.f234468e = true;
                        return new vx3.i(aVar3, 0L, com.tencent.wcdb.core.Database.DictDefaultMatchValue);
                    }
                    if (ordinal != 3) {
                        throw new jz5.j();
                    }
                    mx3.f0 f0Var3 = mx3.f0.f332548a;
                    f0Var3.d(mx3.f0.f332553f);
                    dk4.a aVar4 = new dk4.a("voip_close_sound", f0Var3.d(mx3.f0.f332554g), "", 0, 0);
                    aVar4.f234468e = true;
                    aVar4.f234475l = false;
                    return new vx3.i(aVar4, 0L, com.tencent.wcdb.core.Database.DictDefaultMatchValue);
                }
                java.lang.String str2 = this.f332544g;
                if (str2 != null) {
                    boolean z17 = this.f332545h;
                    if (!z17) {
                        if (!(str2.length() == 0)) {
                            if (kotlin.jvm.internal.o.b(str2, c01.z1.r())) {
                                str2 = "";
                            }
                            return mx3.i0.j(str2);
                        }
                    }
                    this.f332541d = cVar2;
                    this.f332542e = 1;
                    java.lang.Object b17 = mx3.f0.b(str2, z17, this);
                    if (b17 == aVar) {
                        return aVar;
                    }
                    cVar = cVar2;
                    obj = b17;
                }
            }
            return vx3.l.E.b();
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cVar = (vx3.c) this.f332541d;
        kotlin.ResultKt.throwOnFailure(obj);
        vx3.i iVar = (vx3.i) obj;
        dk4.a aVar5 = iVar.f441284a;
        if (aVar5 != null) {
            aVar5.f234475l = cVar.f441272c;
        }
        mx3.f0.f332551d.postValue(iVar);
        return obj;
    }
}

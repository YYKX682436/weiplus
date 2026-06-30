package g43;

/* loaded from: classes5.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f268782d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g43.x f268783e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo f268784f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f268785g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f268786h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(g43.x xVar, com.tencent.mm.plugin.game.autogen.chatroom.AdminInfo adminInfo, java.lang.String str, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268783e = xVar;
        this.f268784f = adminInfo;
        this.f268785g = str;
        this.f268786h = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new g43.t(this.f268783e, this.f268784f, this.f268785g, this.f268786h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g43.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f268782d;
        boolean z17 = this.f268786h;
        g43.x xVar = this.f268783e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = xVar.f268797g;
            java.util.LinkedList<java.lang.String> admin_username_list = this.f268784f.admin_username_list;
            kotlin.jvm.internal.o.f(admin_username_list, "admin_username_list");
            for (java.lang.String str2 : admin_username_list) {
                if (!xVar.f268799i.contains(str2)) {
                    xVar.f268799i.add(str2);
                }
            }
            java.util.ArrayList arrayList = xVar.f268799i;
            java.lang.String str3 = this.f268785g;
            if (!arrayList.contains(str3)) {
                xVar.f268799i.add(str3);
            }
            if (str == null) {
                g43.x.N6(xVar, null, z17);
                return jz5.f0.f302826a;
            }
            g43.m mVar = g43.m.f268766d;
            this.f268782d = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            ((s33.d) ((u33.g) i95.n0.c(u33.g.class))).wi(str, new g43.c(str, rVar));
            obj = rVar.j();
            pz5.a aVar2 = pz5.a.f359186d;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        g43.x.N6(xVar, (w33.e) obj, z17);
        return jz5.f0.f302826a;
    }
}

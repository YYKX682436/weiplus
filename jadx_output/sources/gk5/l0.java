package gk5;

/* loaded from: classes9.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f272679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272680e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f272681f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f272682g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f272683h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gk5.r0 f272684i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wework.api.IWWAPI.WWAppType f272685m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(java.lang.String str, boolean z17, long j17, java.lang.String str2, gk5.r0 r0Var, com.tencent.wework.api.IWWAPI.WWAppType wWAppType, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f272680e = str;
        this.f272681f = z17;
        this.f272682g = j17;
        this.f272683h = str2;
        this.f272684i = r0Var;
        this.f272685m = wWAppType;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gk5.l0(this.f272680e, this.f272681f, this.f272682g, this.f272683h, this.f272684i, this.f272685m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gk5.l0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f272679d;
        gk5.r0 r0Var = this.f272684i;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            oc0.b bVar = new oc0.b();
            java.lang.String str = this.f272680e;
            kotlin.jvm.internal.o.g(str, "<set-?>");
            bVar.f344126e = str;
            boolean z17 = this.f272681f;
            bVar.f344129h = z17;
            if (!z17) {
                bVar.f344124c = this.f272682g;
                bVar.f344125d = this.f272683h;
            }
            ((zs3.z) ((mc0.k) i95.n0.c(mc0.k.class))).getClass();
            bVar.f344128g = new bt3.g0();
            ym5.a1.f(new gk5.i0(r0Var));
            mc0.k kVar = (mc0.k) i95.n0.c(mc0.k.class);
            this.f272679d = 1;
            obj = ((zs3.z) kVar).hj(bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        oc0.c cVar = (oc0.c) obj;
        ym5.a1.f(new gk5.j0(r0Var));
        if (cVar.f344131a == oc0.d.f344133d) {
            try {
                r45.w43 w43Var = new r45.w43();
                w43Var.f388872d = java.lang.String.valueOf(c01.id.c());
                w43Var.f388873e = 49;
                java.lang.String str2 = cVar.f344132b;
                java.nio.charset.Charset forName = java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c);
                kotlin.jvm.internal.o.f(forName, "forName(...)");
                byte[] bytes = str2.getBytes(forName);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                w43Var.f388874f = new com.tencent.mm.protobuf.g(bytes, 0, bytes.length);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(w43Var);
                ((dk5.s5) tg3.t1.a()).wi(r0Var.getActivity(), com.tencent.mm.ui.chatting.hd.c(this.f272685m), arrayList, new gk5.k0(r0Var));
            } catch (java.lang.Exception e17) {
                r0Var.V6();
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ForwardNoteToWeWorkUIC", e17, "record_attach_upload_xml", new java.lang.Object[0]);
            }
        } else {
            r0Var.V6();
        }
        return jz5.f0.f302826a;
    }
}

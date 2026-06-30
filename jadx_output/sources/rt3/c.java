package rt3;

/* loaded from: classes5.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f399523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rt3.e f399524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f399525f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(rt3.e eVar, com.tencent.mm.protobuf.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f399524e = eVar;
        this.f399525f = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rt3.c(this.f399524e, this.f399525f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rt3.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object c17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f399523d;
        int i18 = 1;
        vt3.p pVar = null;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rt3.j jVar = rt3.j.f399540a;
            this.f399524e.getClass();
            boolean b17 = kotlin.jvm.internal.o.b(bm5.o1.f22719a.d(new com.tencent.mm.repairer.config.mjpublisher.shoot_composing.RepairerConfigFinderCamTemplateListType()), 1);
            this.f399523d = 1;
            c17 = jVar.c(b17, null, this.f399525f, this);
            if (c17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            c17 = obj;
        }
        r45.z51 z51Var = (r45.z51) c17;
        if (z51Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GetCameraTemplateGgi", "getFavTemplateListRep is null");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedList<r45.rz6> linkedList = z51Var.f391723d;
        if (linkedList != null) {
            for (r45.rz6 rz6Var : linkedList) {
                r45.xy6 xy6Var = rz6Var.f385330q;
                int i19 = xy6Var != null ? xy6Var.f390601f : 0;
                if (i19 < 0 || i19 <= 2008004) {
                    r45.b70 b70Var = rz6Var.f385323g;
                    if (b70Var != null) {
                        java.lang.String id6 = rz6Var.f385320d;
                        kotlin.jvm.internal.o.f(id6, "id");
                        java.lang.String title = b70Var.f370582d;
                        kotlin.jvm.internal.o.f(title, "title");
                        java.lang.String tmpl_desc_url = b70Var.f370587i;
                        kotlin.jvm.internal.o.f(tmpl_desc_url, "tmpl_desc_url");
                        long j17 = b70Var.f370588m;
                        java.lang.String preview_covel_url = b70Var.f370585g;
                        kotlin.jvm.internal.o.f(preview_covel_url, "preview_covel_url");
                        r45.ol0 ol0Var = rz6Var.f385331r;
                        com.tencent.mm.protobuf.g gVar = rz6Var.f385334u;
                        boolean z17 = rz6Var.f385326m.f372414e == i18 ? i18 : 0;
                        r45.dv0 dv0Var = rz6Var.f385336w;
                        java.lang.String str = dv0Var != null ? dv0Var.f372767d : null;
                        java.lang.String str2 = str == null ? "" : str;
                        java.lang.String str3 = dv0Var != null ? dv0Var.f372768e : null;
                        java.lang.String str4 = str3 == null ? "" : str3;
                        r45.xs xsVar = rz6Var.f385324h;
                        int i27 = xsVar != null ? xsVar.f390367e : 0;
                        java.lang.String ai_model_type = rz6Var.f385335v;
                        kotlin.jvm.internal.o.f(ai_model_type, "ai_model_type");
                        boolean z18 = ai_model_type.length() > 0;
                        java.lang.String guide_wording = b70Var.F;
                        kotlin.jvm.internal.o.f(guide_wording, "guide_wording");
                        pVar = new vt3.p(null, id6, title, tmpl_desc_url, j17, preview_covel_url, ol0Var, gVar, z17, str2, str4, i27, z18, guide_wording, b70Var.G, rz6Var.f385330q, b70Var, rz6Var.f385337x, 1, null);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GetCameraTemplateGgi", "getFavTemplateListRep >> filtered id:" + rz6Var.f385320d + ", minSDKVersion:" + i19 + " currentSDKVersion:2008004");
                }
                if (pVar != null) {
                    arrayList.add(pVar);
                }
                i18 = 1;
                pVar = null;
            }
        }
        return new rt3.a(arrayList, z51Var.f391725f, z51Var.f391726g, z51Var.f391724e, null, null, true);
    }
}

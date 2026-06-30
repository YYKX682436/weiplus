package mx0;

/* loaded from: classes5.dex */
public final class u7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f332380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332381f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(java.lang.String str, float f17, com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332379d = str;
        this.f332380e = f17;
        this.f332381f = shootComposingPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.u7(this.f332379d, this.f332380e, this.f332381f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx0.u7 u7Var = (mx0.u7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        u7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        mx0.ja templateUIPlugin;
        xx0.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332381f;
        templateUIPlugin = shootComposingPluginLayout.getTemplateUIPlugin();
        templateUIPlugin.getClass();
        java.lang.String templateId = this.f332379d;
        kotlin.jvm.internal.o.g(templateId, "templateId");
        mx0.t9 t9Var = templateUIPlugin.f332080i;
        t9Var.getClass();
        mx0.q9 q9Var = t9Var.f332360h;
        boolean b17 = kotlin.jvm.internal.o.b(q9Var != null ? q9Var.f332269a : null, templateId);
        float f17 = this.f332380e;
        if (b17) {
            t9Var.f332360h = new mx0.q9(templateId, (int) (100 * f17));
            java.util.Iterator it = t9Var.f332358f.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (kotlin.jvm.internal.o.b(((vt3.p) it.next()).f440020b, templateId)) {
                    break;
                }
                i17++;
            }
            if (i17 >= 0) {
                t9Var.notifyItemChanged(t9Var.z(i17), mx0.r9.f332294d);
            }
        }
        xx0.n nVar = shootComposingPluginLayout.K1;
        if (nVar != null) {
            kotlin.jvm.internal.o.g(templateId, "templateId");
            xx0.c a17 = nVar.a();
            if (a17 != null && (f0Var = a17.f457864g) != null) {
                java.util.Iterator it6 = ((java.util.LinkedHashMap) f0Var.f457899h).values().iterator();
                while (it6.hasNext()) {
                    xx0.d0 d0Var = ((xx0.e0) it6.next()).f457888a;
                    d0Var.getClass();
                    xx0.t tVar = d0Var.f457881i;
                    tVar.getClass();
                    xx0.u uVar = tVar.f457942h;
                    if (kotlin.jvm.internal.o.b(uVar != null ? uVar.f457945a : null, templateId)) {
                        tVar.f457942h = new xx0.u(templateId, java.lang.Integer.valueOf((int) (100 * f17)));
                        java.util.Iterator it7 = ((java.util.ArrayList) tVar.f457941g).iterator();
                        int i18 = 0;
                        while (true) {
                            if (!it7.hasNext()) {
                                i18 = -1;
                                break;
                            }
                            if (kotlin.jvm.internal.o.b(((vt3.p) it7.next()).f440020b, templateId)) {
                                break;
                            }
                            i18++;
                        }
                        if (i18 >= 0) {
                            tVar.notifyItemChanged(i18, 0);
                        }
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}

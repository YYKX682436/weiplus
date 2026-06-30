package t01;

/* loaded from: classes11.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t01.m f414396d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(t01.m mVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f414396d = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new t01.j(this.f414396d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        t01.j jVar = (t01.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        jVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        t01.i iVar = t01.m.f414399d;
        int o17 = t01.i.a(iVar).o("BizPhotoMeTabEduRedDotState", 0);
        boolean vj6 = ((ox.g) t01.i.b(iVar)).vj();
        t01.m mVar = this.f414396d;
        if (vj6 && o17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "add edu red dot");
            if (mVar.Ni() || mVar.Di()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "hasFinderAccount or hasBizAccount, addMeTabPhotoEduRed");
                mVar.wi();
            } else if (!mVar.Ri() && ((ox.g) t01.i.b(iVar)).Ni()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "no photo account and can register, addMeTabPhotoEduRed");
                mVar.wi();
            }
        } else {
            boolean z17 = true;
            if (o17 == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "check edu red dot");
                mVar.getClass();
                com.tencent.mm.plugin.finder.extension.reddot.jb L0 = t01.i.c(iVar).L0("FinderMyTab");
                r45.vs2 vs2Var = L0 != null ? L0.field_ctrInfo : null;
                if (vs2Var == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "ctrlInfo is null, set state to added and disposed");
                    t01.i.a(iVar).A("BizPhotoMeTabEduRedDotState", 2);
                } else {
                    java.lang.String str = vs2Var.f388503x;
                    if ((str == null || r26.i0.y(str, "BizPhotoLocal_", false)) ? false : true) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "not edu red dot, set state to added and disposed");
                        t01.i.a(iVar).A("BizPhotoMeTabEduRedDotState", 2);
                    } else if (((ox.g) t01.i.b(iVar)).vj()) {
                        if (!mVar.Ni() && !mVar.Di()) {
                            z17 = false;
                        }
                        if (z17 || (!mVar.Ri() && ((ox.g) t01.i.b(iVar)).Ni())) {
                            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(mVar.Ui());
                            kotlin.jvm.internal.o.f(string, "getString(...)");
                            java.util.LinkedList show_infos = vs2Var.f388489g;
                            kotlin.jvm.internal.o.f(show_infos, "show_infos");
                            r45.f03 f03Var = (r45.f03) kz5.n0.Z(show_infos);
                            if (!kotlin.jvm.internal.o.b(f03Var != null ? f03Var.f373889f : null, string)) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "red dot title changed, re-add red dot");
                                t01.i.c(iVar).N("FinderMyTab");
                                mVar.wi();
                            }
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "no biz or finder account, and has photo account or cannot register, dispose red dot");
                            t01.i.c(iVar).N("FinderMyTab");
                            if (mVar.Ri()) {
                                t01.i.a(iVar).A("BizPhotoMeTabEduRedDotState", 2);
                            } else {
                                t01.i.a(iVar).A("BizPhotoMeTabEduRedDotState", 0);
                            }
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "shouldShowPhotoWorks is false, dispose red dot and set state to none");
                        t01.i.c(iVar).N("FinderMyTab");
                        t01.i.a(iVar).A("BizPhotoMeTabEduRedDotState", 0);
                    }
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.BizPersonalFinderRedDot", "no need to check edu red dot, redDotState: " + o17);
            }
        }
        return jz5.f0.f302826a;
    }
}

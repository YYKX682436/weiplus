package qf2;

/* loaded from: classes.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f362635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.q f362636e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.v0 f362637f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f362638g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(xg2.h hVar, kotlin.coroutines.Continuation continuation, km2.q qVar, qf2.v0 v0Var, yz5.a aVar) {
        super(2, continuation);
        this.f362635d = hVar;
        this.f362636e = qVar;
        this.f362637f = v0Var;
        this.f362638g = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.x(this.f362635d, continuation, this.f362636e, this.f362637f, this.f362638g);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qf2.x xVar = (qf2.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        xVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        rm0.j jVar = ((xg2.a) ((xg2.b) this.f362635d).f454381b).f454379a;
        if (jVar == null || (str = jVar.f397426g) == null) {
            str = "";
        }
        int i17 = jVar != null ? jVar.f397425f : 0;
        int i18 = jVar != null ? jVar.f397424e : 0;
        com.tencent.mars.xlog.Log.i("AnchorMicTRTCController", "apply pk response fail, errCode: " + i17 + " errMsg: " + str + " errType: " + i18);
        km2.q qVar = this.f362636e;
        if (qVar != null) {
            qVar.f309181l = 0;
        }
        if (str.length() == 0) {
            str = null;
        }
        qf2.v0 v0Var = this.f362637f;
        switch (i17) {
            case -200075:
                android.content.Context O6 = v0Var.O6();
                if (str == null) {
                    str = v0Var.O6().getResources().getString(com.tencent.mm.R.string.dmc);
                    kotlin.jvm.internal.o.f(str, "getString(...)");
                }
                db5.t7.makeText(O6, str, 0).show();
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(ml2.q2.f327833t, v0Var.O6().getResources().getString(com.tencent.mm.R.string.dmc), -1, -1);
                break;
            case -200074:
            default:
                android.content.Context O62 = v0Var.O6();
                if (str == null) {
                    str = v0Var.O6().getResources().getString(com.tencent.mm.R.string.dux);
                    kotlin.jvm.internal.o.f(str, "getString(...)");
                }
                db5.t7.makeText(O62, str, 0).show();
                long j17 = ((mm2.e1) v0Var.business(mm2.e1.class)).f328988r.getLong(0);
                com.tencent.mars.xlog.Log.i("FinderLiveMicWatcher", "onAnchorApplyMicPkFail errCode: " + i17 + " errType: " + i18 + " liveId: " + j17);
                pm0.z.b(xy2.b.f458155b, "micpk_anchorApplyMicFail", false, null, null, false, false, new dk2.pa(i17, i18, j17), 60, null);
                break;
            case -200073:
                android.content.Context O63 = v0Var.O6();
                if (str == null) {
                    str = v0Var.O6().getResources().getString(com.tencent.mm.R.string.dmb);
                    kotlin.jvm.internal.o.f(str, "getString(...)");
                }
                db5.t7.makeText(O63, str, 0).show();
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(ml2.q2.f327833t, v0Var.O6().getResources().getString(com.tencent.mm.R.string.dmb), -1, -1);
                break;
            case -200072:
                android.content.Context O64 = v0Var.O6();
                if (str == null) {
                    str = v0Var.O6().getResources().getString(com.tencent.mm.R.string.dmd);
                    kotlin.jvm.internal.o.f(str, "getString(...)");
                }
                db5.t7.makeText(O64, str, 0).show();
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(ml2.q2.f327833t, v0Var.O6().getResources().getString(com.tencent.mm.R.string.dmd), -1, -1);
                break;
            case -200071:
                android.content.Context O65 = v0Var.O6();
                if (str == null) {
                    str = v0Var.O6().getResources().getString(com.tencent.mm.R.string.dmf);
                    kotlin.jvm.internal.o.f(str, "getString(...)");
                }
                db5.t7.makeText(O65, str, 0).show();
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(ml2.q2.f327833t, v0Var.O6().getResources().getString(com.tencent.mm.R.string.dmf), -1, -1);
                break;
            case -200070:
                android.content.Context O66 = v0Var.O6();
                if (str == null) {
                    str = v0Var.O6().getResources().getString(com.tencent.mm.R.string.dme);
                    kotlin.jvm.internal.o.f(str, "getString(...)");
                }
                db5.t7.makeText(O66, str, 0).show();
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(ml2.q2.f327833t, v0Var.O6().getResources().getString(com.tencent.mm.R.string.dme), -1, -1);
                break;
        }
        yz5.a aVar2 = this.f362638g;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return jz5.f0.f302826a;
    }
}

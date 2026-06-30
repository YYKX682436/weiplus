package lj2;

/* loaded from: classes10.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f318827d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f318828e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lj2.d f318829f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.String str, lj2.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f318828e = str;
        this.f318829f = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lj2.c(this.f318828e, this.f318829f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((lj2.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        vl2.h hVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f318827d;
        lj2.d dVar = this.f318829f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str = this.f318828e;
            switch (str.hashCode()) {
                case -1236483807:
                    if (str.equals("finder_live_pk_result_win_streak.pag")) {
                        hVar = vl2.h.V;
                        break;
                    }
                    hVar = null;
                    break;
                case -1186992732:
                    if (str.equals("finder_live_pk_result_draw.pag")) {
                        hVar = vl2.h.R;
                        break;
                    }
                    hVar = null;
                    break;
                case -1001225868:
                    if (str.equals("finder_live_pk_result_draw_en.pag")) {
                        hVar = vl2.h.S;
                        break;
                    }
                    hVar = null;
                    break;
                case 42444364:
                    if (str.equals("finder_live_pk_result_win_en.pag")) {
                        hVar = vl2.h.U;
                        break;
                    }
                    hVar = null;
                    break;
                case 2029041612:
                    if (str.equals("finder_live_pk_result_win.pag")) {
                        hVar = vl2.h.T;
                        break;
                    }
                    hVar = null;
                    break;
                case 2078908631:
                    if (str.equals("finder_live_pk_result_win_streak_en.pag")) {
                        hVar = vl2.h.W;
                        break;
                    }
                    hVar = null;
                    break;
                default:
                    hVar = null;
                    break;
            }
            if (hVar != null) {
                vl2.s sVar = vl2.s.f437868a;
                com.tencent.mm.view.MMPAGView mMPAGView = dVar.f318847j;
                this.f318827d = 1;
                if (sVar.d(hVar, mMPAGView, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        if (dVar.f318847j.getVisibility() == 0) {
            dVar.f318847j.g();
            dVar.f318847j.d();
        }
        return jz5.f0.f302826a;
    }
}

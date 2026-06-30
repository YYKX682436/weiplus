package df2;

/* loaded from: classes10.dex */
public final class et extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f230082d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et(df2.lt ltVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230082d = ltVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.et(this.f230082d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.et etVar = (df2.et) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        etVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        r45.bm1 bm1Var;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            df2.lt ltVar = this.f230082d;
            synchronized (ltVar.f230713u) {
                try {
                    if (ltVar.f230717y.size() > 0) {
                        int i17 = ltVar.f230712t + 1;
                        ltVar.f230712t = i17;
                        com.tencent.mm.view.RecyclerHorizontalViewPager recyclerHorizontalViewPager = ltVar.f230706n;
                        if (recyclerHorizontalViewPager != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList.add(java.lang.Integer.valueOf(i17));
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(recyclerHorizontalViewPager, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$startJob$1$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "smoothScrollToPosition", "(I)V");
                            recyclerHorizontalViewPager.c1(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(recyclerHorizontalViewPager, "com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$startJob$1$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "smoothScrollToPosition", "(I)V");
                        }
                        java.util.ArrayList arrayList2 = ltVar.f230717y;
                        ltVar.f230710r = (in5.c) arrayList2.get(ltVar.f230712t % arrayList2.size());
                        java.lang.String str = df2.lt.W;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loop index ");
                        sb6.append(ltVar.f230712t);
                        sb6.append(", wording: ");
                        in5.c cVar = ltVar.f230710r;
                        java.lang.Integer num = null;
                        dk2.h hVar = cVar instanceof dk2.h ? (dk2.h) cVar : null;
                        sb6.append((hVar == null || (finderJumpInfo = hVar.f233541d) == null) ? null : finderJumpInfo.getWording());
                        sb6.append(", time: ");
                        in5.c cVar2 = ltVar.f230710r;
                        dk2.h hVar2 = cVar2 instanceof dk2.h ? (dk2.h) cVar2 : null;
                        if (hVar2 != null && (bm1Var = hVar2.f233545h) != null) {
                            num = new java.lang.Integer(bm1Var.getInteger(17));
                        }
                        sb6.append(num);
                        com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", sb6.toString());
                    }
                } finally {
                }
            }
        } catch (java.lang.Throwable unused) {
            java.lang.String str2 = df2.lt.W;
            com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "smoothScroll crash");
        }
        return jz5.f0.f302826a;
    }
}

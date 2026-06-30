package df2;

/* loaded from: classes10.dex */
public final class sr extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f231366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.h f231367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231368f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sr(df2.lt ltVar, dk2.h hVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231366d = ltVar;
        this.f231367e = hVar;
        this.f231368f = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.sr(this.f231366d, this.f231367e, this.f231368f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.sr srVar = (df2.sr) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        srVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String str = df2.lt.W;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("remove, currentTitle: ");
        in5.c cVar = this.f231366d.f230710r;
        java.lang.String str2 = null;
        dk2.h hVar = cVar instanceof dk2.h ? (dk2.h) cVar : null;
        if (hVar != null && (finderJumpInfo = hVar.f233541d) != null) {
            str2 = finderJumpInfo.getWording();
        }
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", sb6.toString());
        df2.lt ltVar = this.f231366d;
        dk2.h hVar2 = this.f231367e;
        java.lang.String dislikeBannerId = this.f231368f;
        synchronized (ltVar.f230713u) {
            if (ltVar.f230717y.size() > 0) {
                java.util.ArrayList arrayList = ltVar.f230717y;
                if (kotlin.jvm.internal.o.b(hVar2, arrayList.get(ltVar.f230712t % arrayList.size()))) {
                    java.util.ArrayList arrayList2 = ltVar.f230717y;
                    arrayList2.remove(ltVar.f230712t % arrayList2.size());
                    com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "after remove dataList size: " + ltVar.f230717y.size());
                    com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = ltVar.f230707o;
                    if (wxRecyclerAdapter != null) {
                        wxRecyclerAdapter.notifyItemRemoved(ltVar.f230712t);
                    }
                }
            }
        }
        rl2.f fVar = (rl2.f) ((jz5.n) ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).f67001y).getValue();
        fVar.getClass();
        kotlin.jvm.internal.o.g(dislikeBannerId, "dislikeBannerId");
        if (!android.text.TextUtils.isEmpty(dislikeBannerId)) {
            synchronized (fVar) {
                ce2.f fVar2 = new ce2.f();
                fVar2.field_dislikeBannerId = dislikeBannerId;
                fVar2.field_timestamp = java.lang.System.currentTimeMillis();
                boolean replace = fVar.replace(fVar2);
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveDislikeBannerStorage", "recordDislikeBanner dislikeBannerId:%s ret:%b", dislikeBannerId, java.lang.Boolean.valueOf(replace));
                if (replace && !fVar.f397195f.contains(dislikeBannerId)) {
                    fVar.f397195f.add(dislikeBannerId);
                }
            }
        }
        if (this.f231366d.f230717y.size() <= 0) {
            com.tencent.mm.view.RecyclerHorizontalViewPager recyclerHorizontalViewPager = this.f231366d.f230706n;
            if (recyclerHorizontalViewPager != null) {
                recyclerHorizontalViewPager.setVisibility(8);
            }
            df2.lt ltVar2 = this.f231366d;
            ltVar2.f230709q = true;
            com.tencent.mm.view.RecyclerHorizontalViewPager recyclerHorizontalViewPager2 = ltVar2.f230706n;
            if (recyclerHorizontalViewPager2 != null) {
                recyclerHorizontalViewPager2.setFrozeTouch(false);
            }
            com.tencent.mars.xlog.Log.i("Finder.LivePromoteBannerController", "only one banner gone banner plugin");
        } else {
            this.f231366d.x7();
        }
        return jz5.f0.f302826a;
    }
}

package sp2;

/* loaded from: classes2.dex */
public final class p3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f411182d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sp2.x3 f411183e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f411184f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.recyclerview.WxRecyclerAdapter f411185g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(sp2.x3 x3Var, androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f411183e = x3Var;
        this.f411184f = recyclerView;
        this.f411185g = wxRecyclerAdapter;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sp2.p3(this.f411183e, this.f411184f, this.f411185g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sp2.p3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f411182d;
        boolean z17 = false;
        sp2.x3 x3Var = this.f411183e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = x3Var.f411280n.iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) it.next()).intValue();
                for (bq2.b bVar : sp2.n3.f411116a.c(this.f411184f, this.f411185g, kz5.c0.d(new java.lang.Integer(intValue)))) {
                    if (sp2.x3.O6(x3Var, intValue, bVar)) {
                        sp2.x3.Q6(x3Var, intValue, bVar);
                        if (!arrayList.contains(bVar)) {
                            arrayList.add(bVar);
                        }
                        if (!arrayList2.contains(new java.lang.Integer(intValue))) {
                            arrayList2.add(new java.lang.Integer(intValue));
                        }
                    }
                }
            }
            com.tencent.mars.xlog.Log.i(x3Var.f411273d, "handleLoopMsg requestSize: " + arrayList2.size() + " objectSize: " + arrayList.size());
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            sp2.o3 o3Var = new sp2.o3(arrayList2, arrayList, x3Var, null);
            this.f411182d = 1;
            if (kotlinx.coroutines.l.g(p0Var, o3Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        int T6 = x3Var.T6();
        androidx.appcompat.app.AppCompatActivity activity = x3Var.getActivity();
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) activity : null;
        if (mMFinderUI != null && mMFinderUI.isPaused()) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i(x3Var.f411273d, "handleLoopMsg next refreshInterval: " + T6 + " isPagePaused: " + z17);
        if (T6 > 0 && !z17) {
            x3Var.f411282p.sendEmptyMessageDelayed(1, T6 * 1000);
        }
        return jz5.f0.f302826a;
    }
}

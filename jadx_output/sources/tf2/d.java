package tf2;

/* loaded from: classes3.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tf2.k f418912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f418913e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(tf2.k kVar, kotlin.jvm.internal.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418912d = kVar;
        this.f418913e = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new tf2.d(this.f418912d, this.f418913e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((tf2.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.view.ViewGroup viewGroup;
        android.view.View view;
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        zi2.w wVar = (zi2.w) this.f418912d.R6(zi2.w.class);
        if (wVar != null) {
            km2.q qVar = (km2.q) this.f418913e.f310123d;
            if (qVar == null || (str = qVar.f309170a) == null) {
                str = "";
            }
            sj2.m y17 = wVar.y1(str);
            if (y17 != null && (viewGroup = y17.getGiftRootView()) != null) {
                view = viewGroup.findViewById(com.tencent.mm.R.id.ezw);
                if (view == null && viewGroup != null) {
                    return new tf2.e(view.getLeft() + (view.getWidth() / 2), viewGroup.getTop() + (viewGroup.getHeight() / 2));
                }
            }
        }
        viewGroup = null;
        view = null;
        return view == null ? null : null;
    }
}

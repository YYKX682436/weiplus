package ee5;

/* loaded from: classes9.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.y0 f252076d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f252077e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(ee5.y0 y0Var, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f252076d = y0Var;
        this.f252077e = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ee5.w0(this.f252076d, this.f252077e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ee5.w0 w0Var = (ee5.w0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        w0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ee5.y0 y0Var = this.f252076d;
        androidx.appcompat.app.AppCompatActivity activity = y0Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String str = ((ee5.e3) pf5.z.f353948a.a(activity).a(ee5.e3.class)).f251870f;
        q40.e eVar = y0Var.f252093r;
        if (eVar != null) {
            ((com.tencent.mm.plugin.finder.ui.conv.FinderConvSearchFeedFragment) eVar).y0(str, this.f252077e);
        }
        return jz5.f0.f302826a;
    }
}

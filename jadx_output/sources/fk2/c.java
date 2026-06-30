package fk2;

/* loaded from: classes3.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f263319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView f263320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f263321f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f263322g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.s f263323h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f263324i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f263325m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView finderLiveFoldTextView, java.lang.CharSequence charSequence, kotlin.jvm.internal.h0 h0Var, yz5.s sVar, int i17, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f263320e = finderLiveFoldTextView;
        this.f263321f = charSequence;
        this.f263322g = h0Var;
        this.f263323h = sVar;
        this.f263324i = i17;
        this.f263325m = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        fk2.c cVar = new fk2.c(this.f263320e, this.f263321f, this.f263322g, this.f263323h, this.f263324i, this.f263325m, continuation);
        cVar.f263319d = obj;
        return cVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fk2.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean h17 = kotlinx.coroutines.z0.h((kotlinx.coroutines.y0) this.f263319d);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!h17) {
            return f0Var;
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView finderLiveFoldTextView = this.f263320e;
        int lineCount = finderLiveFoldTextView.getLineCount();
        kotlin.jvm.internal.h0 h0Var = this.f263322g;
        if (lineCount <= 1 || !kotlin.jvm.internal.o.b(finderLiveFoldTextView.a(), this.f263321f)) {
            java.lang.Object obj2 = h0Var.f310123d;
            ((android.view.ViewGroup) obj2).setPadding(0, ((android.view.ViewGroup) obj2).getPaddingTop(), ((android.view.ViewGroup) h0Var.f310123d).getPaddingRight(), ((android.view.ViewGroup) h0Var.f310123d).getPaddingBottom());
        } else {
            java.lang.Object obj3 = h0Var.f310123d;
            ((android.view.ViewGroup) obj3).setPadding(0, ((android.view.ViewGroup) obj3).getPaddingTop(), 0, ((android.view.ViewGroup) h0Var.f310123d).getPaddingBottom());
            finderLiveFoldTextView.setSpacingAdd(5);
            yz5.s sVar = this.f263323h;
            com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView finderLiveFoldTextView2 = this.f263320e;
            sVar.v(finderLiveFoldTextView2, this.f263321f, new java.lang.Integer(finderLiveFoldTextView2.getLineCount()), new java.lang.Integer(this.f263324i), java.lang.Boolean.valueOf(this.f263325m));
        }
        return f0Var;
    }
}

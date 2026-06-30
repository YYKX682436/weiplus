package fk2;

/* loaded from: classes3.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f263303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView f263304e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f263305f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f263306g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f263307h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f263308i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView finderLiveFoldTextView, java.lang.CharSequence charSequence, android.view.ViewGroup viewGroup, int i17, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f263304e = finderLiveFoldTextView;
        this.f263305f = charSequence;
        this.f263306g = viewGroup;
        this.f263307h = i17;
        this.f263308i = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        fk2.a1 a1Var = new fk2.a1(this.f263304e, this.f263305f, this.f263306g, this.f263307h, this.f263308i, continuation);
        a1Var.f263303d = obj;
        return a1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fk2.a1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean h17 = kotlinx.coroutines.z0.h((kotlinx.coroutines.y0) this.f263303d);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!h17) {
            return f0Var;
        }
        com.tencent.mm.plugin.finder.live.view.FinderLiveFoldTextView finderLiveFoldTextView = this.f263304e;
        int lineCount = finderLiveFoldTextView.getLineCount();
        android.view.ViewGroup viewGroup = this.f263306g;
        if (lineCount <= 1 || !kotlin.jvm.internal.o.b(finderLiveFoldTextView.a(), this.f263305f)) {
            viewGroup.setPadding(0, viewGroup.getPaddingTop(), viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
        } else {
            viewGroup.setPadding(0, viewGroup.getPaddingTop(), 0, viewGroup.getPaddingBottom());
            finderLiveFoldTextView.setSpacingAdd(5);
            fk2.c1 c1Var = fk2.d1.f263344m;
            java.lang.CharSequence charSequence = this.f263305f;
            int lineCount2 = finderLiveFoldTextView.getLineCount();
            int i17 = this.f263307h;
            boolean z17 = this.f263308i;
            if (i17 > 0) {
                finderLiveFoldTextView.o(charSequence, 5, i17, z17, new fk2.b1(lineCount2), true, true);
            } else {
                finderLiveFoldTextView.b(c1Var.b(charSequence, lineCount2));
            }
        }
        return f0Var;
    }
}

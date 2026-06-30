package fk2;

/* loaded from: classes3.dex */
public final class e3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f263366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.h1 f263367e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f263368f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f263369g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(bm2.h1 h1Var, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f263367e = h1Var;
        this.f263368f = h0Var;
        this.f263369g = h0Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        fk2.e3 e3Var = new fk2.e3(this.f263367e, this.f263368f, this.f263369g, continuation);
        e3Var.f263366d = obj;
        return e3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fk2.e3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean h17 = kotlinx.coroutines.z0.h((kotlinx.coroutines.y0) this.f263366d);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!h17) {
            return f0Var;
        }
        bm2.h1 h1Var = this.f263367e;
        int lineCount = h1Var.f21927e.getLineCount();
        kotlin.jvm.internal.h0 h0Var = this.f263369g;
        if (lineCount > 1) {
            java.lang.CharSequence a17 = h1Var.f21927e.a();
            kotlin.jvm.internal.h0 h0Var2 = this.f263368f;
            if (kotlin.jvm.internal.o.b(a17, h0Var2.f310123d)) {
                java.lang.Object obj2 = h0Var.f310123d;
                ((android.widget.RelativeLayout) obj2).setPadding(0, ((android.widget.RelativeLayout) obj2).getPaddingTop(), 0, ((android.widget.RelativeLayout) h0Var.f310123d).getPaddingBottom());
                h1Var.f21927e.setSpacingAdd(5);
                android.text.SpannableStringBuilder valueOf = android.text.SpannableStringBuilder.valueOf((java.lang.CharSequence) h0Var2.f310123d);
                valueOf.setSpan(new android.text.style.LeadingMarginSpan.Standard(0, com.tencent.mm.ui.zk.a(com.tencent.mm.sdk.platformtools.x2.f193071a, 6)), 0, ((com.tencent.mm.pluginsdk.ui.span.f0) h0Var2.f310123d).length(), 33);
                h1Var.f21927e.b(valueOf);
                return f0Var;
            }
        }
        java.lang.Object obj3 = h0Var.f310123d;
        ((android.widget.RelativeLayout) obj3).setPadding(0, ((android.widget.RelativeLayout) obj3).getPaddingTop(), ((android.widget.RelativeLayout) h0Var.f310123d).getPaddingRight(), ((android.widget.RelativeLayout) h0Var.f310123d).getPaddingBottom());
        return f0Var;
    }
}

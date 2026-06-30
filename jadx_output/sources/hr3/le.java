package hr3;

/* loaded from: classes5.dex */
public final class le extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f283769d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f283770e;

    /* renamed from: f, reason: collision with root package name */
    public int f283771f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f283772g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f283773h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f283774i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f283775m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.a f283776n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r45.dz3 f283777o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public le(boolean z17, hr3.pf pfVar, android.widget.TextView textView, java.lang.String str, yz5.a aVar, r45.dz3 dz3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f283772g = z17;
        this.f283773h = pfVar;
        this.f283774i = textView;
        this.f283775m = str;
        this.f283776n = aVar;
        this.f283777o = dz3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hr3.le(this.f283772g, this.f283773h, this.f283774i, this.f283775m, this.f283776n, this.f283777o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hr3.le) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.jvm.internal.h0 h0Var;
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f283771f;
        android.graphics.drawable.BitmapDrawable bitmapDrawable = null;
        hr3.pf pfVar = this.f283773h;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            hr3.ge geVar = new hr3.ge(h0Var2, pfVar, this.f283777o, null);
            this.f283769d = "";
            this.f283770e = h0Var2;
            this.f283771f = 1;
            if (kotlinx.coroutines.l.g(p0Var, geVar, this) == aVar) {
                return aVar;
            }
            h0Var = h0Var2;
            str = "";
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (kotlin.jvm.internal.h0) this.f283770e;
            str = (java.lang.String) this.f283769d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean z17 = this.f283772g;
        android.widget.TextView textView = this.f283774i;
        if (z17) {
            java.lang.CharSequence charSequence = (java.lang.CharSequence) h0Var.f310123d;
            if (!(charSequence == null || r26.n0.N(charSequence))) {
                java.lang.String str2 = (java.lang.String) h0Var.f310123d;
                if (pfVar.W6()) {
                    if (!(str2 == null || r26.n0.N(str2)) && com.tencent.mm.vfs.w6.j(str2)) {
                        bitmapDrawable = new android.graphics.drawable.BitmapDrawable(pfVar.getResources(), com.tencent.mm.sdk.platformtools.j.a(str2, i65.a.g(pfVar.getActivity())));
                    }
                }
                if (bitmapDrawable != null) {
                    int textSize = (int) textView.getTextSize();
                    bitmapDrawable.setBounds(0, 0, textSize, textSize);
                    textView.append("  ");
                    android.text.SpannableString spannableString = new android.text.SpannableString(" ");
                    spannableString.setSpan(new al5.w(bitmapDrawable, 1), 0, spannableString.length(), 33);
                    spannableString.setSpan(new hr3.he(pfVar, h0Var), 0, spannableString.length(), 33);
                    textView.append(spannableString);
                    str = (java.lang.String) h0Var.f310123d;
                }
            }
        }
        com.tencent.mm.pluginsdk.ui.span.f0 f0Var = new com.tencent.mm.pluginsdk.ui.span.f0(pfVar.getString(com.tencent.mm.R.string.la6));
        f0Var.c(new hr3.ae(pfVar, this.f283775m, str != null ? str : "", this.f283776n), 0, f0Var.length(), 17);
        textView.append(" ");
        textView.append(f0Var);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setOnLongClickListener(new hr3.ke(pfVar, textView));
        return jz5.f0.f302826a;
    }
}

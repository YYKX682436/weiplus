package so2;

/* loaded from: classes2.dex */
public final class i6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.m6 f410425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f410426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f410427f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410428g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f410429h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f410430i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f410431m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f410432n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ r45.bm2 f410433o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f410434p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f410435q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f410436r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(so2.m6 m6Var, android.widget.TextView textView, android.content.Context context, java.lang.String str, boolean z17, int i17, int i18, boolean z18, r45.bm2 bm2Var, int i19, boolean z19, int i27, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f410425d = m6Var;
        this.f410426e = textView;
        this.f410427f = context;
        this.f410428g = str;
        this.f410429h = z17;
        this.f410430i = i17;
        this.f410431m = i18;
        this.f410432n = z18;
        this.f410433o = bm2Var;
        this.f410434p = i19;
        this.f410435q = z19;
        this.f410436r = i27;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new so2.i6(this.f410425d, this.f410426e, this.f410427f, this.f410428g, this.f410429h, this.f410430i, this.f410431m, this.f410432n, this.f410433o, this.f410434p, this.f410435q, this.f410436r, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        so2.i6 i6Var = (so2.i6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        i6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        android.text.SpannableStringBuilder spannableStringBuilder;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.CharSequence charSequence;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        so2.m6 m6Var = this.f410425d;
        android.widget.TextView textView = this.f410426e;
        android.content.Context context = this.f410427f;
        java.lang.String str7 = this.f410428g;
        boolean z17 = this.f410429h;
        int i17 = this.f410430i;
        boolean z18 = this.f410432n;
        int i18 = this.f410431m;
        int i19 = (i18 <= 0 || !z18) ? 0 : i18;
        r45.bm2 bm2Var = this.f410433o;
        java.lang.Object T6 = m6Var.T6(textView, context, str7, z17, i17, i19, so2.m6.N6(m6Var, bm2Var), this.f410432n, this.f410434p, this.f410435q, this.f410436r);
        android.content.Context context2 = this.f410427f;
        boolean z19 = this.f410429h;
        so2.m6 m6Var2 = this.f410425d;
        m6Var2.getClass();
        boolean z27 = T6 instanceof java.lang.String;
        android.widget.TextView textView2 = this.f410426e;
        java.lang.String str8 = this.f410428g;
        if (z27) {
            i95.m c17 = i95.n0.c(zy2.s6.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            android.text.SpannableStringBuilder Ne = zy2.s6.Ne((zy2.s6) c17, (i18 <= 0 || !z18) ? 0 : i18, str8 + ' ' + T6, context2, z19, 0, 0, false, 112, null);
            com.tencent.mars.xlog.Log.i("Finder.SyncGetImageModel", "String type match prefixText:" + str8 + ' ' + T6 + " recommendDesc:" + ((java.lang.Object) Ne) + " pos:" + m6Var2.f410487g + " hashCode:" + m6Var2.hashCode());
            textView2.setText(Ne);
        } else if (T6 instanceof android.text.SpannableString) {
            if (bm2Var == null) {
                i95.m c18 = i95.n0.c(zy2.s6.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                zy2.s6 s6Var = (zy2.s6) c18;
                int i27 = (i18 <= 0 || !z18) ? 0 : i18;
                android.text.SpannableStringBuilder append = new android.text.SpannableStringBuilder(str8).append(' ').append((java.lang.CharSequence) T6);
                kotlin.jvm.internal.o.f(append, "append(...)");
                str4 = " pos:";
                str5 = " hashCode:";
                str6 = "Finder.SyncGetImageModel";
                charSequence = zy2.s6.J7(s6Var, i27, append, context2, z19, 0, 0, false, 112, null);
            } else {
                str4 = " pos:";
                str5 = " hashCode:";
                str6 = "Finder.SyncGetImageModel";
                charSequence = (java.lang.CharSequence) T6;
            }
            com.tencent.mars.xlog.Log.i(str6, "SpannableString type match " + ((java.lang.Object) charSequence) + str4 + m6Var2.f410487g + str5 + m6Var2.hashCode());
            textView2.setText(charSequence);
        } else if (T6 instanceof android.text.SpannableStringBuilder) {
            if (bm2Var == null) {
                i95.m c19 = i95.n0.c(zy2.s6.class);
                kotlin.jvm.internal.o.f(c19, "getService(...)");
                zy2.s6 s6Var2 = (zy2.s6) c19;
                int i28 = (i18 <= 0 || !z18) ? 0 : i18;
                android.text.SpannableStringBuilder append2 = new android.text.SpannableStringBuilder(str8).append(' ').append((java.lang.CharSequence) T6);
                kotlin.jvm.internal.o.f(append2, "append(...)");
                str = "Finder.SyncGetImageModel";
                str2 = " pos:";
                str3 = " hashCode:";
                spannableStringBuilder = zy2.s6.J7(s6Var2, i28, append2, context2, z19, 0, 0, false, 112, null);
            } else {
                str = "Finder.SyncGetImageModel";
                str2 = " pos:";
                str3 = " hashCode:";
                spannableStringBuilder = (android.text.SpannableStringBuilder) T6;
            }
            com.tencent.mars.xlog.Log.i(str, "SpannableStringBuilder type match " + ((java.lang.Object) spannableStringBuilder) + str2 + m6Var2.f410487g + str3 + m6Var2.hashCode());
            textView2.setText(spannableStringBuilder);
        } else {
            com.tencent.mars.xlog.Log.w("Finder.SyncGetImageModel", "desc type match nothing !" + T6 + " pos:" + m6Var2.f410487g + " hashCode:" + m6Var2.hashCode());
        }
        return jz5.f0.f302826a;
    }
}

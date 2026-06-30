package so2;

/* loaded from: classes2.dex */
public final class j6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.m6 f410444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f410445e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f410446f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f410447g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f410448h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f410449i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.bm2 f410450m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(so2.m6 m6Var, android.widget.TextView textView, android.content.Context context, java.lang.String str, boolean z17, int i17, r45.bm2 bm2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f410444d = m6Var;
        this.f410445e = textView;
        this.f410446f = context;
        this.f410447g = str;
        this.f410448h = z17;
        this.f410449i = i17;
        this.f410450m = bm2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new so2.j6(this.f410444d, this.f410445e, this.f410446f, this.f410447g, this.f410448h, this.f410449i, this.f410450m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        so2.j6 j6Var = (so2.j6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        so2.m6 m6Var = this.f410444d;
        android.widget.TextView textView = this.f410445e;
        android.content.Context context = this.f410446f;
        java.lang.String str2 = this.f410447g;
        boolean z17 = this.f410448h;
        int i17 = this.f410449i;
        r45.bm2 bm2Var = this.f410450m;
        java.lang.Object T6 = m6Var.T6(textView, context, str2, z17, i17, 0, so2.m6.N6(m6Var, bm2Var), false, 3, false, 0);
        android.content.Context context2 = this.f410446f;
        boolean z18 = this.f410448h;
        so2.m6 m6Var2 = this.f410444d;
        m6Var2.getClass();
        boolean z19 = T6 instanceof java.lang.String;
        android.widget.TextView textView2 = this.f410445e;
        if (z19) {
            i95.m c17 = i95.n0.c(zy2.s6.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str3 = this.f410447g;
            sb6.append(str3);
            sb6.append(T6);
            java.lang.CharSequence Ne = zy2.s6.Ne((zy2.s6) c17, 0, sb6.toString(), context2, z18, m6Var2.f410485e, 0, false, 96, null);
            com.tencent.mars.xlog.Log.i("Finder.SyncGetImageModel", "setDefaultDrawerText String type match prefixText:" + str3 + ' ' + T6 + " recommendDesc:" + ((java.lang.Object) Ne) + " hashCode:" + m6Var2.hashCode());
            if (!z18) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(str3);
                if (bm2Var == null || (str = bm2Var.getString(3)) == null) {
                    str = "";
                }
                sb7.append(str);
                Ne = sb7.toString();
            }
            textView2.setText(Ne);
        } else if (T6 instanceof android.text.SpannableStringBuilder) {
            com.tencent.mars.xlog.Log.i("Finder.SyncGetImageModel", "setDefaultDrawerText SpannableStringBuilder type match " + T6 + " hashCode:" + m6Var2.hashCode());
            textView2.setText((java.lang.CharSequence) T6);
        } else {
            com.tencent.mars.xlog.Log.w("Finder.SyncGetImageModel", "setDefaultDrawerText desc type match nothing !" + T6 + " hashCode:" + m6Var2.hashCode());
        }
        return jz5.f0.f302826a;
    }
}

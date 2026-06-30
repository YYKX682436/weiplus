package sg3;

/* loaded from: classes4.dex */
public class q implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407983a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407984b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407985c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f407987e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sg3.r f407988f;

    public q(sg3.r rVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.content.Context context) {
        this.f407988f = rVar;
        this.f407983a = str;
        this.f407984b = str2;
        this.f407985c = str3;
        this.f407986d = str4;
        this.f407987e = context;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        if (z17) {
            java.lang.String str2 = this.f407983a;
            if (com.tencent.mm.storage.z3.m4(str2)) {
                com.tencent.mm.autogen.mmdata.rpt.OpenIMSucceedContactLogStruct openIMSucceedContactLogStruct = new com.tencent.mm.autogen.mmdata.rpt.OpenIMSucceedContactLogStruct();
                openIMSucceedContactLogStruct.p(this.f407984b);
                openIMSucceedContactLogStruct.f59797f = 1L;
                java.lang.String str3 = this.f407985c;
                openIMSucceedContactLogStruct.q(str3);
                openIMSucceedContactLogStruct.f59798g = 1L;
                openIMSucceedContactLogStruct.f59800i = 2L;
                openIMSucceedContactLogStruct.k();
                ((za0.k) ((ab0.b0) i95.n0.c(ab0.b0.class))).getClass();
                l41.h0 h0Var = new l41.h0(str2, this.f407986d, 0);
                sg3.r rVar = this.f407988f;
                rVar.f407990n = h0Var;
                ((l41.h0) rVar.f407990n).f315825h = str3;
                gm0.j1.d().g((com.tencent.mm.modelbase.m1) rVar.f407990n);
                android.content.Context context = this.f407987e;
                rVar.f407989m = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), this.f407987e.getString(com.tencent.mm.R.string.hfj), true, true, new sg3.p(this));
            }
        }
    }
}

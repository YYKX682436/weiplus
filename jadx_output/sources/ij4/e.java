package ij4;

/* loaded from: classes11.dex */
public final class e implements bi4.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ij4.h f291718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ij4.d f291719b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f291720c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout f291721d;

    public e(ij4.h hVar, ij4.d dVar, in5.s0 s0Var, android.widget.RelativeLayout relativeLayout) {
        this.f291718a = hVar;
        this.f291719b = dVar;
        this.f291720c = s0Var;
        this.f291721d = relativeLayout;
    }

    @Override // bi4.m0
    public final void a(int i17, java.lang.Object obj) {
        bi4.m0 m0Var = this.f291718a.f291726e;
        if (m0Var != null) {
            m0Var.a(i17, obj);
        }
        if (i17 == 2 && kotlin.jvm.internal.o.b(obj, java.lang.Boolean.TRUE) && !kotlin.jvm.internal.o.b(((mj4.k) this.f291719b.f291717d).o(), en1.a.a())) {
            android.content.Context context = this.f291720c.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC textStatusCardFeedUIC = (com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC.class);
            if (textStatusCardFeedUIC != null) {
                textStatusCardFeedUIC.T6(this.f291721d, 0, 0, false);
            }
        }
    }
}

package xp1;

/* loaded from: classes12.dex */
public class k implements com.tencent.mm.ui.widget.dialog.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l34.b f455893a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f455894b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f455895c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f455896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u1 f455897e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ae0.f f455898f;

    public k(l34.b bVar, android.content.Context context, boolean z17, int i17, java.lang.String str, com.tencent.mm.ui.widget.dialog.u1 u1Var, ae0.f fVar) {
        this.f455893a = bVar;
        this.f455894b = context;
        this.f455895c = z17;
        this.f455896d = str;
        this.f455897e = u1Var;
        this.f455898f = fVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.v1
    public void a(boolean z17, java.lang.String str, boolean z18) {
        boolean z19 = this.f455895c;
        java.lang.String str2 = this.f455896d;
        if (z17) {
            this.f455893a.c(this.f455894b);
            if (z19) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(15783, 2, 0, str2);
            }
        } else {
            xp1.d.b(this.f455897e, 2, str2, z19);
        }
        this.f455898f.a(z18, str2, 2);
    }
}

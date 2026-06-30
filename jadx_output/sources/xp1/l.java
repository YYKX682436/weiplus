package xp1;

/* loaded from: classes12.dex */
public class l implements com.tencent.mm.ui.widget.dialog.v1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f455899a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f455900b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ae0.e f455901c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u1 f455902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f455903e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ae0.f f455904f;

    public l(android.content.Context context, int i17, java.lang.String str, ae0.e eVar, com.tencent.mm.ui.widget.dialog.u1 u1Var, boolean z17, ae0.f fVar) {
        this.f455899a = context;
        this.f455900b = str;
        this.f455901c = eVar;
        this.f455902d = u1Var;
        this.f455903e = z17;
        this.f455904f = fVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.v1
    public void a(boolean z17, java.lang.String str, boolean z18) {
        java.lang.String str2 = this.f455900b;
        if (z17) {
            xp1.d.a(this.f455899a, false, 4, str2, this.f455901c);
        } else {
            xp1.d.b(this.f455902d, 4, str2, this.f455903e);
        }
        this.f455904f.a(z18, str2, 4);
    }
}

package s24;

/* loaded from: classes.dex */
public abstract class f extends a24.i implements com.tencent.mm.plugin.newtips.model.a {

    /* renamed from: g, reason: collision with root package name */
    public android.content.Intent f402359g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f402360h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f402361i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f402362m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f402363n;

    /* renamed from: o, reason: collision with root package name */
    public final float f402364o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f402360h = "";
        this.f402361i = new android.view.View(getContext());
        this.f402362m = true;
        this.f402363n = "";
        this.f402364o = 1.0f;
    }

    /* renamed from: A7 */
    public java.lang.String getF161873p() {
        return this.f402360h;
    }

    /* renamed from: B7 */
    public android.view.View getF161874q() {
        return this.f402361i;
    }

    public java.lang.String C7() {
        return this.f402363n;
    }

    /* renamed from: D7 */
    public java.lang.Integer getF161877t() {
        return null;
    }

    /* renamed from: E7 */
    public java.lang.Integer getF161875r() {
        return null;
    }

    /* renamed from: F7 */
    public java.lang.Integer getF161876s() {
        return null;
    }

    public void G7(android.content.Context context, android.content.Intent intent) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        pf5.j0.a(intent, com.tencent.mm.plugin.setting.ui.setting_new.uic.h.class);
    }

    public void H7(android.view.View view) {
        this.f402361i = view;
    }

    public void I7(java.lang.Integer num) {
    }

    public void J7(java.lang.Integer num) {
    }

    public void K7(java.lang.Integer num) {
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean T1(boolean z17, r45.pm6 pm6Var) {
        return true;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean W5() {
        return false;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean Y3(boolean z17) {
        if (z17) {
            J7(java.lang.Integer.valueOf(com.tencent.mm.R.string.f490501wv));
            K7(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.asx));
        } else {
            I7(null);
            K7(null);
            J7(null);
        }
        w7();
        return true;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean Z3(boolean z17, r45.pm6 pm6Var) {
        return true;
    }

    @Override // a24.i
    public int Z6() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public void c1(boolean z17, com.tencent.mm.plugin.newtips.model.r rVar) {
    }

    @Override // a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public void e5(com.tencent.mm.plugin.newtips.model.r rVar, boolean z17) {
        ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).getClass();
        com.tencent.mm.plugin.newtips.model.i.b(this, rVar, z17);
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public java.lang.String getPath() {
        return getF161873p();
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public android.view.View h() {
        if (getF161874q() == null) {
            H7(new android.view.View(getContext()));
        }
        return getF161874q();
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean o0(boolean z17) {
        ((ua0.o) ((va0.m) i95.n0.c(va0.m.class))).getClass();
        return com.tencent.mm.plugin.newtips.model.i.l(z17, this);
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean q3(boolean z17, r45.pm6 pm6Var) {
        return true;
    }

    @Override // com.tencent.mm.plugin.newtips.model.a
    public boolean u6(boolean z17, r45.pm6 pm6Var) {
        return true;
    }

    public float x7() {
        return this.f402364o;
    }

    public boolean y(boolean z17) {
        if (z17) {
            I7(java.lang.Integer.valueOf(com.tencent.mm.R.drawable.b8i));
            return true;
        }
        I7(null);
        K7(null);
        J7(null);
        return true;
    }

    public java.lang.Integer y7() {
        return null;
    }

    public boolean z7() {
        return this.f402362m;
    }
}

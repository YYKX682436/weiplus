package pk2;

/* loaded from: classes3.dex */
public final class h2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f355807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.j32 f355808e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.c32 f355809f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f355810g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ zy2.ic f355811h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(com.tencent.mm.ui.MMActivity mMActivity, r45.j32 j32Var, r45.c32 c32Var, boolean z17, zy2.ic icVar) {
        super(0);
        this.f355807d = mMActivity;
        this.f355808e = j32Var;
        this.f355809f = c32Var;
        this.f355810g = z17;
        this.f355811h = icVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        pk2.l2.f355938m.a(this.f355807d, this.f355808e, "showNoticeListWidget", this.f355809f, this.f355810g);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = ((com.tencent.mm.plugin.finder.profile.widget.s4) this.f355811h).f124757k;
        if (z2Var != null) {
            z2Var.B();
        }
        return jz5.f0.f302826a;
    }
}

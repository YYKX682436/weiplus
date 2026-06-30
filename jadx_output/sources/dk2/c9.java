package dk2;

/* loaded from: classes3.dex */
public final class c9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f233286d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.x4 f233287e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f233288f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f233289g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f233290h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(android.content.Context context, dk2.x4 x4Var, kotlin.jvm.internal.h0 h0Var, android.content.Intent intent, boolean z17) {
        super(0);
        this.f233286d = context;
        this.f233287e = x4Var;
        this.f233288f = h0Var;
        this.f233289g = intent;
        this.f233290h = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dk2.r9.f234025a.k(this.f233286d, this.f233287e, (r16 & 4) != 0 ? "" : (java.lang.String) this.f233288f.f310123d, (r16 & 8) != 0 ? "" : null, (r16 & 16) != 0 ? null : this.f233289g, (r16 & 32) != 0 ? false : this.f233290h);
        return jz5.f0.f302826a;
    }
}

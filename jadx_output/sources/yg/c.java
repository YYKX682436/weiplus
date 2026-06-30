package yg;

/* loaded from: classes7.dex */
public final class c extends hh.f {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yg.b f462030g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f462031h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f462032i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f462033j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j17, yg.b bVar, int i17, int i18, boolean z17) {
        super(j17, null, true);
        this.f462030g = bVar;
        this.f462031h = i17;
        this.f462032i = i18;
        this.f462033j = z17;
    }

    @Override // hh.f
    public java.lang.Object a() {
        yg.b bVar = this.f462030g;
        bVar.f462025a.m(new yg.c$$a(bVar, this.f462031h, this.f462032i, this.f462033j, this));
        return null;
    }
}

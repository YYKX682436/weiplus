package tc3;

/* loaded from: classes7.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tc3.u f417185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417186e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417187f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417188g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(tc3.u uVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(0);
        this.f417185d = uVar;
        this.f417186e = str;
        this.f417187f = str2;
        this.f417188g = str3;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String ih6 = this.f417185d.f417251e.ih(this.f417186e, this.f417187f, this.f417188g);
        kotlin.jvm.internal.o.f(ih6, "invokeSync(...)");
        return ih6;
    }
}

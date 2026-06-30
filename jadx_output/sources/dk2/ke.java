package dk2;

/* loaded from: classes3.dex */
public final class ke extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.vg f233703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f233704e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f233705f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f233706g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233707h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke(dk2.vg vgVar, kotlin.jvm.internal.h0 h0Var, boolean z17, yz5.a aVar, java.lang.String str) {
        super(3);
        this.f233703d = vgVar;
        this.f233704e = h0Var;
        this.f233705f = z17;
        this.f233706g = aVar;
        this.f233707h = str;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str = (java.lang.String) obj2;
        bw5.gq0 gq0Var = (bw5.gq0) obj3;
        if (((java.lang.Boolean) obj).booleanValue()) {
            dk2.vg vgVar = this.f233703d;
            vgVar.f234254a.set(7, gq0Var != null ? gq0Var.getUrl() : null);
            java.lang.String string = vgVar.f234254a.getString(7);
            this.f233704e.f310123d = string;
            dk2.ef.f233372a.L(this.f233705f, vgVar, this.f233706g, string);
        } else {
            com.tencent.mars.xlog.Log.w("Finder.FinderLiveService", "fetch song url for listenId " + this.f233707h + " failed. ErrorMsg " + str);
        }
        return jz5.f0.f302826a;
    }
}

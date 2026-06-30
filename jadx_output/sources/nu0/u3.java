package nu0;

/* loaded from: classes5.dex */
public final class u3 implements com.tencent.maas.imagestudio.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f340110a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f340111b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f340112c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f340113d;

    public u3(yz5.a aVar, nu0.b4 b4Var, int i17, int i18) {
        this.f340110a = aVar;
        this.f340111b = b4Var;
        this.f340112c = i17;
        this.f340113d = i18;
    }

    @Override // com.tencent.maas.imagestudio.h
    public final void a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            yz5.a aVar = this.f340110a;
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        this.f340111b.D7(this.f340112c);
        com.tencent.mars.xlog.Log.e("ImageComp.MainComposingUIC", "[switchScene] position:" + this.f340113d + " err:" + str);
    }
}

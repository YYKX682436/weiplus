package nu0;

/* loaded from: classes5.dex */
public final class j implements com.tencent.maas.imagestudio.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f339974a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nu0.p f339975b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f339976c;

    public j(yz5.a aVar, nu0.p pVar, java.lang.String str) {
        this.f339974a = aVar;
        this.f339975b = pVar;
        this.f339976c = str;
    }

    @Override // com.tencent.maas.imagestudio.h
    public final void a(java.lang.String str) {
        yz5.a aVar = this.f339974a;
        if (aVar != null) {
            aVar.invoke();
        }
        if (str == null || str.length() == 0) {
            return;
        }
        this.f339975b.q7().f7(this.f339976c);
    }
}

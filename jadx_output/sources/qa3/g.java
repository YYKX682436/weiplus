package qa3;

/* loaded from: classes15.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qa3.f f361046e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String str, qa3.f fVar) {
        super(1);
        this.f361045d = str;
        this.f361046e = fVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String url = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(url, "url");
        if (url.length() == 0) {
            com.tencent.mm.plugin.lite.logic.g1.s().l(this.f361045d, true, 2, 0L, null, this.f361046e);
        } else {
            oq1.q qVar = new oq1.q();
            qVar.f347346a = this.f361045d;
            qVar.f347349d = url;
            com.tencent.mm.plugin.lite.logic.c1.INSTANCE.b(qVar, "debug", null, null, this.f361046e);
        }
        return jz5.f0.f302826a;
    }
}

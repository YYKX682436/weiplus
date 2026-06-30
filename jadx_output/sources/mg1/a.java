package mg1;

/* loaded from: classes7.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326203d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String str) {
        super(1);
        this.f326203d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.luggage.sdk.processes.s it = (com.tencent.luggage.sdk.processes.s) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return new com.tencent.mm.plugin.appbrand.language.AppBrandOnLanguageChangeIPCMessage(it.f47684a, this.f326203d);
    }
}

package zd3;

/* loaded from: classes7.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471616d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f471617e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zd3.k f471618f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.String str, int i17, zd3.k kVar) {
        super(2);
        this.f471616d = str;
        this.f471617e = i17;
        this.f471618f = kVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.view.Surface surface = (android.view.Surface) obj;
        org.json.JSONObject updatedExtraData = (org.json.JSONObject) obj2;
        kotlin.jvm.internal.o.g(surface, "surface");
        kotlin.jvm.internal.o.g(updatedExtraData, "updatedExtraData");
        updatedExtraData.put("type", this.f471616d);
        com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData(ve3.u.f436107f, this.f471617e, this.f471616d, updatedExtraData.toString(), surface), xd3.e.class, new zd3.h(this.f471618f));
        return jz5.f0.f302826a;
    }
}

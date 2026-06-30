package t62;

/* loaded from: classes12.dex */
public class b extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f415997h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi f415998i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi extControlProviderOpenApi, long j17, android.database.Cursor cursor, boolean z17, java.lang.String[] strArr) {
        super(j17, cursor, z17);
        this.f415998i = extControlProviderOpenApi;
        this.f415997h = strArr;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        com.tencent.mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi extControlProviderOpenApi = this.f415998i;
        java.lang.String d17 = com.tencent.mm.pluginsdk.model.app.j1.d(extControlProviderOpenApi.f99869s, extControlProviderOpenApi.d());
        if (u46.l.e(d17)) {
            d17 = "";
        }
        gm0.j1.n().f273288b.g(new s62.a(extControlProviderOpenApi.f99875g, extControlProviderOpenApi.d(), d17, new t62.a(this, d17)));
        return null;
    }
}

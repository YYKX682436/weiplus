package zd3;

/* loaded from: classes7.dex */
public final class d implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zd3.f f471603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f471605f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471606g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471607h;

    public d(zd3.f fVar, java.lang.String str, int i17, java.lang.String str2, java.lang.String str3) {
        this.f471603d = fVar;
        this.f471604e = str;
        this.f471605f = i17;
        this.f471606g = str2;
        this.f471607h = str3;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalCallbackData iPCMBExternalCallbackData = (com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalCallbackData) obj;
        int i17 = iPCMBExternalCallbackData.f148159d;
        zd3.f fVar = this.f471603d;
        if (i17 != 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("prepareResourceForExternalTexture check environment failed: ");
            java.lang.String str = iPCMBExternalCallbackData.f148160e;
            sb6.append(str);
            rk0.c.b("MB_External_surface", sb6.toString(), new java.lang.Object[0]);
            fVar.s().invoke(fVar.h(6, str));
            return;
        }
        int i18 = this.f471605f;
        java.lang.String type = this.f471606g;
        kotlin.jvm.internal.o.f(type, "$type");
        java.lang.String str2 = this.f471607h;
        fVar.getClass();
        com.tencent.mm.ipcinvoker.extension.l.a(this.f471604e, new com.tencent.mm.plugin.magicbrush.texture.IPCMBExternalInputData(ve3.u.f436105d, i18, type, str2, null, 16, null), xd3.e.class, new zd3.e(fVar));
    }
}

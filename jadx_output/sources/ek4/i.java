package ek4;

/* loaded from: classes12.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.s f253651d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253652e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253653f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ek4.s sVar, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f253651d = sVar;
        this.f253652e = str;
        this.f253653f = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dn.n nVar;
        ek4.s sVar = this.f253651d;
        java.util.HashMap hashMap = sVar.f253685a;
        java.lang.String str = this.f253652e;
        dn.o oVar = (dn.o) hashMap.get(str);
        if (oVar != null && (nVar = oVar.f241815c2) != null) {
            ek4.s.a(sVar);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callback by CdnTaskController onM3U8Ready mediaId:");
            sb6.append(str);
            sb6.append(" m3u8:");
            java.lang.String str2 = this.f253653f;
            sb6.append(str2);
            com.tencent.mars.xlog.Log.i("MicroMsg.TP.CdnTaskController", sb6.toString());
            nVar.onM3U8Ready(str, str2);
        }
        return jz5.f0.f302826a;
    }
}

package ek4;

/* loaded from: classes12.dex */
public final class k implements sx.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.s f253659d;

    public k(ek4.s sVar) {
        this.f253659d = sVar;
    }

    @Override // sx.z
    public int a(java.lang.String str, dn.g gVar, dn.h hVar) {
        ek4.s sVar = this.f253659d;
        ek4.s.a(sVar);
        if (str == null || !sVar.f253685a.containsKey(str)) {
            return 0;
        }
        pm0.v.O("MicroMsg.Cdn.ThreadName", new ek4.g(sVar, str, gVar, hVar, str));
        return 1;
    }

    @Override // sx.z
    public int b(java.lang.String str, int i17, int i18) {
        ek4.s.a(this.f253659d);
        return 0;
    }

    @Override // sx.z
    public int c(java.lang.String str, int i17, int i18) {
        ek4.s sVar = this.f253659d;
        ek4.s.a(sVar);
        if (str == null || !sVar.f253685a.containsKey(str)) {
            return 0;
        }
        pm0.v.O("MicroMsg.Cdn.ThreadName", new ek4.h(sVar, str, i17, i18));
        return 1;
    }

    @Override // sx.z
    public int d(java.lang.String str, int i17, int i18, com.tencent.mars.cdn.CdnManager.VideoInfo info) {
        kotlin.jvm.internal.o.g(info, "info");
        ek4.s sVar = this.f253659d;
        ek4.s.a(sVar);
        if (str == null || !sVar.f253685a.containsKey(str)) {
            return 0;
        }
        pm0.v.O("MicroMsg.Cdn.ThreadName", new ek4.j(sVar, str, i17, i18, info));
        return 1;
    }

    @Override // sx.z
    public int onM3U8Ready(java.lang.String str, java.lang.String str2) {
        ek4.s sVar = this.f253659d;
        ek4.s.a(sVar);
        if (str == null || !sVar.f253685a.containsKey(str)) {
            return 0;
        }
        pm0.v.O("MicroMsg.Cdn.ThreadName", new ek4.i(sVar, str, str2));
        return 1;
    }
}

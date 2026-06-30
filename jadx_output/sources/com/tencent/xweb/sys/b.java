package com.tencent.xweb.sys;

/* loaded from: classes13.dex */
public class b implements tx5.c {

    /* renamed from: a, reason: collision with root package name */
    public final y4.a f220545a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.xweb.sys.a f220546b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.xweb.sys.r f220547c;

    public b(y4.a aVar) {
        this.f220545a = aVar;
    }

    @Override // tx5.c
    public tx5.b getCookieManager() {
        com.tencent.xweb.sys.a aVar = this.f220546b;
        if (aVar != null) {
            return aVar;
        }
        y4.a aVar2 = this.f220545a;
        if (aVar2 == null) {
            return null;
        }
        z4.t tVar = (z4.t) aVar2;
        if (!z4.e0.f470065g.b()) {
            throw z4.e0.a();
        }
        com.tencent.xweb.sys.a aVar3 = new com.tencent.xweb.sys.a(tVar.f470074a.getCookieManager());
        this.f220546b = aVar3;
        return aVar3;
    }

    @Override // tx5.c
    public tx5.e getWebStorage() {
        com.tencent.xweb.sys.r rVar = this.f220547c;
        if (rVar != null) {
            return rVar;
        }
        y4.a aVar = this.f220545a;
        if (aVar == null) {
            return null;
        }
        z4.t tVar = (z4.t) aVar;
        if (!z4.e0.f470065g.b()) {
            throw z4.e0.a();
        }
        com.tencent.xweb.sys.r rVar2 = new com.tencent.xweb.sys.r(tVar.f470074a.getWebStorage());
        this.f220547c = rVar2;
        return rVar2;
    }
}

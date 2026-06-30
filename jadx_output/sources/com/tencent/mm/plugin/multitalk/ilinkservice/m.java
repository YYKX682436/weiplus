package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes8.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f149695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f149697f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.c f149698g;

    public m(com.tencent.mm.plugin.multitalk.ilinkservice.c cVar, int i17, java.lang.String str, byte[] bArr) {
        this.f149698g = cVar;
        this.f149695d = i17;
        this.f149696e = str;
        this.f149697f = bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.tencent.mm.plugin.multitalk.ilinkservice.c cVar = this.f149698g;
        if (cVar.f149514a != null) {
            int i18 = this.f149695d;
            java.lang.String str = this.f149696e;
            if (i18 == 2) {
                i17 = org.chromium.net.NetError.ERR_CERT_COMMON_NAME_INVALID;
            } else if (i18 == 3) {
                i17 = org.chromium.net.NetError.ERR_CACHE_MISS;
            } else if (i18 == 4) {
                i17 = -500;
            } else if (i18 == 5) {
                i17 = org.chromium.net.NetError.ERR_INVALID_URL;
            } else if (i18 == 15) {
                i17 = org.chromium.net.NetError.ERR_DISALLOWED_URL_SCHEME;
            } else if (i18 != 16) {
                switch (i18) {
                    case 8:
                        i17 = -600;
                        break;
                    case 9:
                        i17 = -1000;
                        break;
                    case 10:
                        i17 = -1100;
                        break;
                    case 11:
                        i17 = -1300;
                        byte[] bArr = this.f149697f;
                        if (bArr != 0 && bArr.length > 0) {
                            str = bArr;
                            break;
                        }
                        break;
                    default:
                        i17 = i18;
                        break;
                }
            } else {
                i17 = -100;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "onErr errorcode:%d, errType:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            cVar.f149514a.F(i17, str);
        }
    }
}

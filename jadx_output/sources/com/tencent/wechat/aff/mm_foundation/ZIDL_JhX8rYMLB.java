package com.tencent.wechat.aff.mm_foundation;

/* loaded from: classes.dex */
class ZIDL_JhX8rYMLB extends com.tencent.wechat.zidl2.ZidlBaseBridge {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.mm_foundation.d f217396a;

    public byte[] ZIDL_A(byte[] bArr) {
        com.tencent.wechat.aff.mm_foundation.d dVar = this.f217396a;
        java.lang.String str = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        ((e50.w) dVar).getClass();
        java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj(str, "");
        return (aj6 != null ? aj6 : "").getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    public byte[] ZIDL_B(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        java.lang.Object h17;
        java.lang.String str;
        com.tencent.wechat.aff.mm_foundation.d dVar = this.f217396a;
        java.lang.String str2 = new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str3 = new java.lang.String(bArr2, java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str4 = new java.lang.String(bArr3, java.nio.charset.StandardCharsets.UTF_8);
        ((e50.w) dVar).getClass();
        if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
            if (str3.length() > 0) {
                bm5.o1 o1Var = bm5.o1.f22719a;
                java.lang.String aj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj(str2, str4);
                java.lang.String str5 = aj6 != null ? aj6 : "";
                com.tencent.mars.xlog.Log.i("MicroMsg.FlutterEngineService", "safeDefaultValue: " + str3 + ", " + str5);
                java.util.List f07 = r26.n0.f0(str3, new java.lang.String[]{"_"}, false, 0, 6, null);
                java.lang.String str6 = (java.lang.String) f07.get(f07.size() - 1);
                java.lang.Object obj = str5;
                switch (str6.hashCode()) {
                    case -1808118735:
                        str6.equals("String");
                        obj = str5;
                        break;
                    case 73679:
                        obj = str5;
                        if (str6.equals("Int")) {
                            if (!kotlin.jvm.internal.o.b(str5, "false")) {
                                if (!kotlin.jvm.internal.o.b(str5, "true")) {
                                    h17 = r26.h0.h(str5);
                                    if (h17 == null) {
                                        h17 = 0;
                                    }
                                    obj = h17;
                                    break;
                                } else {
                                    obj = 1;
                                    break;
                                }
                            } else {
                                obj = 0;
                                break;
                            }
                        }
                        break;
                    case 2374300:
                        obj = str5;
                        if (str6.equals("Long")) {
                            h17 = r26.h0.j(str5);
                            if (h17 == null) {
                                h17 = 0L;
                            }
                            obj = h17;
                            break;
                        }
                        break;
                    case 67973692:
                        obj = str5;
                        if (str6.equals("Float")) {
                            h17 = r26.g0.f(str5);
                            if (h17 == null) {
                                h17 = java.lang.Float.valueOf(0.0f);
                            }
                            obj = h17;
                            break;
                        }
                        break;
                }
                str = o1Var.c(str3, obj).toString();
                return str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
            }
        } else {
            java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
        }
        java.lang.String aj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).aj(str2, str4);
        str = "";
        if (aj7 != null) {
            str = aj7;
        }
        return str.getBytes(java.nio.charset.StandardCharsets.UTF_8);
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        this.f217396a = (com.tencent.wechat.aff.mm_foundation.d) obj;
    }
}

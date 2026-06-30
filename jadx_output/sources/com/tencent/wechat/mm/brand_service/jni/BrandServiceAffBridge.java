package com.tencent.wechat.mm.brand_service.jni;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0005H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\b\u0010\n\u001a\u00020\bH\u0007J\b\u0010\u000b\u001a\u00020\bH\u0007J\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0007J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fR$\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/tencent/wechat/mm/brand_service/jni/BrandServiceAffBridge;", "", "", "hello", "sayHello", "Lcom/tencent/wechat/mm/brand_service/j;", "callJava", "getUserAgent", "", "getResortContext", "doDataMigrate", "doNotiDataMigrate", "", "msgId", "getResortCardContext", "Lfw5/a;", "cb", "Ljz5/f0;", "setCallBack", "callback", "Lfw5/a;", "getCallback", "()Lfw5/a;", "setCallback", "(Lfw5/a;)V", "<init>", "()V", "plugin-brandecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class BrandServiceAffBridge {
    public static final com.tencent.wechat.mm.brand_service.jni.BrandServiceAffBridge INSTANCE = new com.tencent.wechat.mm.brand_service.jni.BrandServiceAffBridge();
    private static fw5.a callback;

    private BrandServiceAffBridge() {
    }

    public static final com.tencent.wechat.mm.brand_service.j callJava(com.tencent.wechat.mm.brand_service.j hello) {
        kotlin.jvm.internal.o.g(hello, "hello");
        com.tencent.wechat.mm.brand_service.j jVar = new com.tencent.wechat.mm.brand_service.j();
        jVar.f218975f = "use_from_java";
        return jVar;
    }

    public static final byte[] doDataMigrate() {
        com.tencent.wechat.mm.brand_service.k a17;
        if (callback != null) {
            try {
                a17 = qw.d.f367055a.a();
                if (a17.f218998d.size() == 0) {
                    jx3.f.INSTANCE.w(2053L, 23L, 1L);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BrandServiceAffC2JHandler", th6, "onDataMigrate failed.", new java.lang.Object[0]);
                jx3.f.INSTANCE.w(2053L, 118L, 1L);
                zv.q qVar = zv.q.f476079a;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("markBrandServiceDataMigrateCrash key:");
                java.lang.String str = zv.m.f476028a;
                sb6.append(str);
                com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsFlutterHelper", sb6.toString());
                zv.q.f476083e = java.lang.Boolean.TRUE;
                y02.v0 a18 = y02.x0.f458634d.a();
                if (a18 != null) {
                    a18.G(bw5.d5.EcsBrandEntryStatusCheck, 6);
                }
                ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) zv.q.f476080b).getValue()).G(str, true);
                throw th6;
            }
        } else {
            a17 = com.tencent.wechat.mm.brand_service.k.f218997h;
        }
        byte[] byteArray = a17.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static final byte[] doNotiDataMigrate() {
        byte[] byteArray = com.tencent.wechat.mm.brand_service.k.f218997h.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static final byte[] getResortCardContext(long msgId) {
        com.tencent.wechat.mm.biz.j1 j1Var;
        if (callback != null) {
            j1Var = new com.tencent.wechat.mm.biz.j1();
            com.tencent.wechat.mm.biz.o3 o3Var = new com.tencent.wechat.mm.biz.o3();
            java.lang.String valueOf = java.lang.String.valueOf(msgId);
            r01.z1 z1Var = r01.z1.f368282g;
            zv.m0 m0Var = zv.m0.f476029a;
            kotlin.jvm.internal.o.g(valueOf, "<this>");
            o3Var.f218429d = z1Var.o("totalExpCount_" + valueOf + '}', 0);
            boolean[] zArr = o3Var.f218432g;
            zArr[1] = true;
            o3Var.f218430e = (int) z1Var.q(m0Var.b(valueOf), 0L);
            zArr[2] = true;
            o3Var.f218431f = z1Var.o("minExpIndex_" + valueOf + '}', 0);
            zArr[3] = true;
            j1Var.f218216d = o3Var;
            j1Var.f218217e[1] = true;
        } else {
            j1Var = com.tencent.wechat.mm.biz.j1.f218215f;
        }
        byte[] byteArray = j1Var.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static final byte[] getResortContext() {
        com.tencent.wechat.mm.biz.l1 l1Var;
        java.lang.Long j17;
        if (callback != null) {
            l1Var = new com.tencent.wechat.mm.biz.l1();
            com.tencent.mm.pluginsdk.model.e eVar = com.tencent.mm.pluginsdk.model.e.f189277a;
            l1Var.f218265g = eVar.b();
            boolean[] zArr = l1Var.f218277v;
            zArr[4] = true;
            l1Var.f218266h = eVar.e();
            zArr[5] = true;
            java.lang.String str = zv.m0.f476034f;
            if (str == null) {
                str = "";
            }
            l1Var.f218264f = str;
            zArr[3] = true;
            l1Var.f218263e = ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).l();
            zArr[2] = true;
            long j18 = 0;
            if (zv.m0.f476038j) {
                l1Var.f218267i = 7;
                zArr[6] = true;
                l1Var.f218268m = zv.m0.f476046r;
                zArr[7] = true;
                l1Var.f218262d = 0L;
                zArr[1] = true;
            } else {
                l1Var.f218267i = 0;
                zArr[6] = true;
                if (!zv.m0.f476042n && (j17 = r26.h0.j(zv.m0.f476041m)) != null) {
                    j18 = j17.longValue();
                }
                l1Var.f218262d = j18;
                zArr[1] = true;
            }
        } else {
            l1Var = com.tencent.wechat.mm.biz.l1.f218261w;
        }
        byte[] byteArray = l1Var.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public static final java.lang.String getUserAgent() {
        if (callback == null) {
            return "";
        }
        java.lang.String a17 = ik1.l0.a(com.tencent.mm.sdk.platformtools.x2.f193071a, hy4.w.f286200f.a(), lu4.m.f321441d.a());
        kotlin.jvm.internal.o.d(a17);
        return a17;
    }

    public static final java.lang.String sayHello(java.lang.String hello) {
        kotlin.jvm.internal.o.g(hello, "hello");
        return "hello from java ".concat(hello);
    }

    public final fw5.a getCallback() {
        return callback;
    }

    public final void setCallBack(fw5.a cb6) {
        kotlin.jvm.internal.o.g(cb6, "cb");
        callback = cb6;
    }

    public final void setCallback(fw5.a aVar) {
        callback = aVar;
    }
}

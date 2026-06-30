package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes9.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.pluginsdk.model.app.a1 f188800a = new com.tencent.mm.pluginsdk.model.app.a1();

    public static final java.lang.String a(com.tencent.mm.storage.f9 msg) {
        z05.c cVar;
        kotlin.jvm.internal.o.g(msg, "msg");
        l15.c cVar2 = new l15.c();
        java.lang.String U1 = msg.U1();
        if (U1 == null) {
            U1 = "";
        }
        cVar2.fromXml(U1);
        v05.b k17 = cVar2.k();
        if (k17 == null || (cVar = (z05.c) k17.getCustom(k17.f432315e + 64)) == null) {
            return null;
        }
        return cVar.l();
    }

    public static final int[] b(java.lang.String imageConf) {
        kotlin.jvm.internal.o.g(imageConf, "imageConf");
        try {
            return f188800a.c(new cl0.g(imageConf).optString("ratioType"));
        } catch (cl0.f e17) {
            com.tencent.mars.xlog.Log.e("AppMsgUtilForW1w", e17.getMessage());
            return new int[]{480, 480};
        }
    }

    public final int[] c(java.lang.String ratioType) {
        kotlin.jvm.internal.o.g(ratioType, "ratioType");
        int hashCode = ratioType.hashCode();
        if (hashCode != 48936) {
            if (hashCode != 50861) {
                if (hashCode == 51821 && ratioType.equals("4:3")) {
                    return new int[]{640, 480};
                }
            } else if (ratioType.equals("3:4")) {
                return new int[]{480, 640};
            }
        } else if (ratioType.equals("1:1")) {
            return new int[]{480, 480};
        }
        return new int[]{480, 480};
    }
}

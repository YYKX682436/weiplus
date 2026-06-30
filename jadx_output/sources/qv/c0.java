package qv;

@j95.b
/* loaded from: classes7.dex */
public final class c0 extends jm0.o implements bc0.i {

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Map f366840m;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        final r25.h hVar = r25.h.f368863a;
        hashMap.put("weixin://dl/openWxa", new r25.i(hVar) { // from class: qv.a0
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
            
                if ((r0.length() > 0) != false) goto L11;
             */
            @Override // r25.i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean a(bc0.e r9, android.content.Context r10, android.net.Uri r11, bc0.g r12, bc0.h r13) {
                /*
                    Method dump skipped, instructions count: 426
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: qv.a0.a(bc0.e, android.content.Context, android.net.Uri, bc0.g, bc0.h):boolean");
            }
        });
        final r25.c cVar = r25.c.f368856a;
        hashMap.put("weixin://dl/openLiteApp", new r25.i(cVar) { // from class: qv.b0
            /* JADX WARN: Code restructure failed: missing block: B:29:0x00ac, code lost:
            
                if (r0 != null) goto L44;
             */
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
            
                if ((r7.length() > 0) != false) goto L11;
             */
            @Override // r25.i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean a(bc0.e r7, android.content.Context r8, android.net.Uri r9, bc0.g r10, bc0.h r11) {
                /*
                    Method dump skipped, instructions count: 277
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: qv.b0.a(bc0.e, android.content.Context, android.net.Uri, bc0.g, bc0.h):boolean");
            }
        });
        f366840m = hashMap;
    }

    public boolean Zi(java.lang.String str) {
        android.net.Uri parse = str != null ? android.net.Uri.parse(str) : null;
        if (parse == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DeepLinkService", "canHandleDeepLink: false, uri parse failed, uriStr: " + str);
            return false;
        }
        java.lang.String aj6 = aj(parse);
        if (aj6 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DeepLinkService", "canHandleDeepLink: false, uriPrefix decode failed, uriStr: " + str + ", uri: " + parse);
            return false;
        }
        r25.i iVar = (r25.i) ((java.util.HashMap) f366840m).get(aj6);
        if (iVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.DeepLinkService", "canHandleDeepLink: false, handler not found, uriStr: " + str + ", uri: " + parse + ", uriPrefix: " + aj6);
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.DeepLinkService", "canHandleDeepLink: true, uriStr: " + str + ", uri: " + parse + ", uriPrefix: " + aj6 + ", handler: " + iVar);
        return true;
    }

    public final java.lang.String aj(android.net.Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme() + "://" + uri.getHost() + uri.getPath();
    }

    public boolean bj(android.content.Context context, java.lang.String str, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(context, "context");
        if (str == null) {
            return false;
        }
        return bundle == null ? o25.z.m(context, str) : o25.z.n(context, str, null, 0, bundle, o45.cg.a(), new byte[0], null);
    }
}

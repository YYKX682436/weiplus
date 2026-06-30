package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class dy implements c50.u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.viewmodel.component.dy f134172a = new com.tencent.mm.plugin.finder.viewmodel.component.dy();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f134173b = new java.util.concurrent.ConcurrentHashMap();

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        if (r5 == r7) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.tencent.mm.plugin.finder.viewmodel.component.dy r5, java.lang.String r6, kotlin.coroutines.Continuation r7) {
        /*
            r5.getClass()
            boolean r0 = r7 instanceof com.tencent.mm.plugin.finder.viewmodel.component.ux
            if (r0 == 0) goto L16
            r0 = r7
            com.tencent.mm.plugin.finder.viewmodel.component.ux r0 = (com.tencent.mm.plugin.finder.viewmodel.component.ux) r0
            int r1 = r0.f136186g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f136186g = r1
            goto L1b
        L16:
            com.tencent.mm.plugin.finder.viewmodel.component.ux r0 = new com.tencent.mm.plugin.finder.viewmodel.component.ux
            r0.<init>(r5, r7)
        L1b:
            java.lang.Object r5 = r0.f136184e
            pz5.a r7 = pz5.a.f359186d
            int r1 = r0.f136186g
            r2 = 5
            r3 = 1
            if (r1 == 0) goto L37
            if (r1 != r3) goto L2f
            java.lang.Object r6 = r0.f136183d
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.throwOnFailure(r5)
            goto L62
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.ResultKt.throwOnFailure(r5)
            r45.is2 r5 = new r45.is2
            r5.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r5.set(r3, r1)
            boolean r1 = com.tencent.mm.storage.z3.S3(r6)
            if (r1 == 0) goto L4e
            r1 = r6
            goto L4f
        L4e:
            r1 = 0
        L4f:
            r4 = 3
            r5.set(r4, r1)
            com.tencent.mm.modelbase.i r5 = r5.d()
            r0.f136183d = r6
            r0.f136186g = r3
            java.lang.Object r5 = rm0.h.b(r5, r0)
            if (r5 != r7) goto L62
            goto L91
        L62:
            com.tencent.mm.modelbase.f r5 = (com.tencent.mm.modelbase.f) r5
            com.tencent.mm.plugin.finder.viewmodel.component.tx r7 = new com.tencent.mm.plugin.finder.viewmodel.component.tx
            boolean r0 = r5.b()
            com.tencent.mm.protobuf.f r1 = r5.f70618d
            r45.js2 r1 = (r45.js2) r1
            int r1 = r1.getInteger(r2)
            if (r1 != r3) goto L75
            goto L76
        L75:
            r3 = 0
        L76:
            com.tencent.mm.protobuf.f r1 = r5.f70618d
            r45.js2 r1 = (r45.js2) r1
            r2 = 6
            java.lang.String r1 = r1.getString(r2)
            if (r1 != 0) goto L83
            java.lang.String r1 = ""
        L83:
            r7.<init>(r6, r0, r3, r1)
            boolean r5 = r5.b()
            if (r5 == 0) goto L91
            java.util.concurrent.ConcurrentHashMap r5 = com.tencent.mm.plugin.finder.viewmodel.component.dy.f134173b
            r5.put(r6, r7)
        L91:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.dy.a(com.tencent.mm.plugin.finder.viewmodel.component.dy, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public boolean b() {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.T1.r()).intValue() == 1;
    }

    public boolean c(android.content.Context context, java.lang.String username, int i17, yz5.a passCall) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(passCall, "passCall");
        if (!b()) {
            com.tencent.mars.xlog.Log.i("Finder.PublishSecurityCheck", "[safeVerify] it's not in black list. username=".concat(username));
            passCall.invoke();
            return false;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.tx txVar = (com.tencent.mm.plugin.finder.viewmodel.component.tx) f134173b.get(username);
        if (txVar != null) {
            com.tencent.mars.xlog.Log.i("Finder.PublishSecurityCheck", "[safeVerify] ret=" + txVar);
            if (txVar.f136065c) {
                pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.zx(txVar, context, i17));
                return true;
            }
            passCall.invoke();
            return false;
        }
        com.tencent.mars.xlog.Log.i("Finder.PublishSecurityCheck", "[safeVerify] checkVerifyFromServer. username=".concat(username));
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(um3.b.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        pf5.e.launch$default((pf5.e) a17, null, null, new com.tencent.mm.plugin.finder.viewmodel.component.cy(username, context, i17, passCall, null), 3, null);
        return true;
    }
}

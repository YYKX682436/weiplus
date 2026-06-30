package tg4;

/* loaded from: classes7.dex */
public abstract class a extends tg4.c {
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d6  */
    @Override // tg4.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(org.json.JSONObject r12, com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer r13, int r14) {
        /*
            r11 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.o.g(r12, r0)
            java.lang.String r0 = "rootView"
            kotlin.jvm.internal.o.g(r13, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "invokeImpl:data:"
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r1 = ",viewId:"
            r0.append(r1)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.MBBaseInsertCoverViewJsApi"
            com.tencent.mars.xlog.Log.i(r1, r0)
            wq0.a r0 = r13.getF68675e()
            if (r0 != 0) goto L39
            java.lang.String r12 = "rootView.getCustomViewContainer() is null"
            com.tencent.mars.xlog.Log.w(r1, r12)
            java.lang.String r12 = "fail:cover view is null"
            r11.v(r12)
            return
        L39:
            wq0.a r0 = r13.getF68675e()
            kotlin.jvm.internal.o.d(r0)
            com.tencent.mm.plugin.appbrand.page.ha r0 = r0.p(r14)
            r2 = 0
            if (r0 == 0) goto L49
            r0 = 1
            goto L4a
        L49:
            r0 = r2
        L4a:
            if (r0 == 0) goto L64
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "already exist:"
            r12.<init>(r13)
            r12.append(r14)
            java.lang.String r12 = r12.toString()
            com.tencent.mars.xlog.Log.w(r1, r12)
            java.lang.String r12 = "view already exist"
            r11.v(r12)
            return
        L64:
            android.content.Context r0 = r13.getContext()
            java.lang.String r3 = "getContext(...)"
            kotlin.jvm.internal.o.f(r0, r3)
            android.view.View r0 = r11.x(r0, r12, r14)
            java.lang.String r3 = "parentId"
            int r3 = r12.optInt(r3, r2)
            wq0.a r4 = r13.getF68675e()     // Catch: org.json.JSONException -> L9b
            kotlin.jvm.internal.o.d(r4)     // Catch: org.json.JSONException -> L9b
            float[] r8 = r11.u(r12)     // Catch: org.json.JSONException -> L9b
            java.lang.String r13 = "hide"
            boolean r13 = r12.getBoolean(r13)     // Catch: org.json.JSONException -> L90
            if (r13 == 0) goto L8e
            r13 = 4
            goto L91
        L8e:
            r9 = r2
            goto L92
        L90:
            r13 = -1
        L91:
            r9 = r13
        L92:
            r10 = 0
            r5 = r0
            r6 = r14
            r7 = r3
            boolean r2 = r4.e(r5, r6, r7, r8, r9, r10)     // Catch: org.json.JSONException -> L9b
            goto La0
        L9b:
            java.lang.String r13 = "addView fail"
            com.tencent.mars.xlog.Log.e(r1, r13)
        La0:
            if (r2 == 0) goto Ld6
            boolean r12 = r11.y(r14, r0, r12)
            if (r12 == 0) goto Lae
            java.lang.String r13 = ""
            r11.v(r13)
            goto Lb3
        Lae:
            java.lang.String r13 = "fail:onInsertView error"
            r11.v(r13)
        Lb3:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "insert view parentId:"
            r13.<init>(r0)
            r13.append(r3)
            java.lang.String r0 = ", viewId:"
            r13.append(r0)
            r13.append(r14)
            java.lang.String r14 = ", result:"
            r13.append(r14)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            com.tencent.mars.xlog.Log.i(r1, r12)
            return
        Ld6:
            java.lang.String r12 = "fail:insertView error"
            r11.v(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tg4.a.w(org.json.JSONObject, com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer, int):void");
    }

    public android.view.View x(android.content.Context context, org.json.JSONObject data, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        throw new java.lang.IllegalStateException("inflateView must be inflated." + this);
    }

    public boolean y(int i17, android.view.View view, org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(data, "data");
        return true;
    }
}

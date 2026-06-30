package com.tencent.mm.plugin.wenote.multitask;

/* loaded from: classes12.dex */
public final class h {
    public h(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0281  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r23, r45.w60 r24, boolean r25, int r26, java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.wenote.multitask.h.a(java.lang.String, r45.w60, boolean, int, java.lang.String):void");
    }

    public final android.os.Bundle b(java.lang.String str) {
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.util.Iterator<java.lang.String> keys = jSONObject.keys();
            kotlin.jvm.internal.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                kotlin.jvm.internal.o.e(next, "null cannot be cast to non-null type kotlin.String");
                java.lang.String str2 = next;
                bundle.putString(str2, jSONObject.getString(str2));
            }
            return bundle;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NoteMultiTaskUIC", e17, "jsonToBundle", new java.lang.Object[0]);
            return null;
        }
    }
}

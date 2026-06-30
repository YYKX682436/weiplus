package t00;

/* loaded from: classes9.dex */
public final class w implements t00.r0 {
    @Override // t00.r0
    public t00.m a() {
        t00.m mVar = t00.n.f414320a;
        return t00.n.f414342w;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x006f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:19:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01a0  */
    @Override // t00.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(int r9, android.content.Context r10, org.json.JSONObject r11, c00.n3 r12, org.json.JSONObject r13) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t00.w.c(int, android.content.Context, org.json.JSONObject, c00.n3, org.json.JSONObject):void");
    }

    @Override // t00.r0
    public boolean g() {
        return false;
    }

    public final void h(org.json.JSONObject jSONObject, java.lang.String str, yz5.l lVar) {
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject != null) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.Iterator<java.lang.String> keys = optJSONObject.keys();
            kotlin.jvm.internal.o.f(keys, "keys(...)");
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                kotlin.jvm.internal.o.d(next);
                java.lang.String optString = optJSONObject.optString(next);
                kotlin.jvm.internal.o.f(optString, "optString(...)");
                linkedHashMap.put(next, optString);
            }
            if (!linkedHashMap.isEmpty()) {
                lVar.invoke(linkedHashMap);
            }
        }
    }
}

package qo4;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final qo4.c f365661a = new qo4.c();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f365662b = com.tencent.mm.sdk.platformtools.o4.M("MicroMsg.VideoCompositionExportConfig");

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0187, code lost:
    
        if (r10.optInt("key", -1) >= r1) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.l a(r45.h70 r14) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qo4.c.a(r45.h70):jz5.l");
    }

    public final org.json.JSONArray b() {
        java.lang.String u17 = f365662b.u("PARALLEL_COUNT_HISTORY_DATA_V2", "");
        if (android.text.TextUtils.isEmpty(u17)) {
            return new org.json.JSONArray();
        }
        try {
            return new org.json.JSONArray(u17);
        } catch (java.lang.Exception unused) {
            return new org.json.JSONArray();
        }
    }

    public final boolean c(r45.h70 compositionInfo) {
        kotlin.jvm.internal.o.g(compositionInfo, "compositionInfo");
        java.util.LinkedList linkedList = compositionInfo.f375897d;
        return (linkedList.size() == 1 && ((r45.ho6) linkedList.get(0)).f376336g - ((r45.ho6) linkedList.get(0)).f376335f >= 30000 && compositionInfo.f375904n.f374939e.size() == 0) ? false : true;
    }

    public final org.json.JSONObject d(org.json.JSONObject jSONObject, int i17) {
        org.json.JSONObject put = jSONObject.put("hit", i17);
        kotlin.jvm.internal.o.f(put, "put(...)");
        return put;
    }
}

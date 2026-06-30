package u61;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static java.util.LinkedList f424925b;

    /* renamed from: a, reason: collision with root package name */
    public static final u61.o f424924a = new u61.o();

    /* renamed from: c, reason: collision with root package name */
    public static final android.net.NetworkRequest.Builder f424926c = new android.net.NetworkRequest.Builder().addCapability(12).addTransportType(0);

    public static final void c(android.content.Context context, r45.gn4 mobileType, java.lang.String businessType, yz5.l onCallback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(mobileType, "mobileType");
        kotlin.jvm.internal.o.g(businessType, "businessType");
        kotlin.jvm.internal.o.g(onCallback, "onCallback");
        kotlinx.coroutines.l.d(v65.m.f433580a, kotlinx.coroutines.q1.f310568a, null, new u61.n(onCallback, context, mobileType, businessType, null), 2, null);
    }

    public final java.lang.String a(java.lang.String str) {
        return (!(str == null || str.length() == 0) && new org.json.JSONObject(str).optInt("result", -1) == 0) ? str : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x01e2 -> B:19:0x01e4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(android.content.Context r38, r45.gn4 r39, java.lang.String r40, kotlin.coroutines.Continuation r41) {
        /*
            Method dump skipped, instructions count: 723
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u61.o.b(android.content.Context, r45.gn4, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

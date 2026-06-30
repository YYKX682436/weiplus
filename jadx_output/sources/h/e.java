package h;

/* loaded from: classes13.dex */
public final class e extends h.b {
    @Override // h.b
    public android.content.Intent a(android.content.Context context, java.lang.Object obj) {
        java.lang.String input = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(input, "input");
        android.content.Intent putExtra = new android.content.Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new java.lang.String[]{input});
        kotlin.jvm.internal.o.f(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    @Override // h.b
    public h.a b(android.content.Context context, java.lang.Object obj) {
        java.lang.String input = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(input, "input");
        if (b3.l.checkSelfPermission(context, input) == 0) {
            return new h.a(java.lang.Boolean.TRUE);
        }
        return null;
    }

    @Override // h.b
    public java.lang.Object c(int i17, android.content.Intent intent) {
        boolean z17;
        if (intent == null || i17 != -1) {
            return java.lang.Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z18 = false;
        if (intArrayExtra != null) {
            int length = intArrayExtra.length;
            int i18 = 0;
            while (true) {
                if (i18 >= length) {
                    z17 = false;
                    break;
                }
                if (intArrayExtra[i18] == 0) {
                    z17 = true;
                    break;
                }
                i18++;
            }
            if (z17) {
                z18 = true;
            }
        }
        return java.lang.Boolean.valueOf(z18);
    }
}

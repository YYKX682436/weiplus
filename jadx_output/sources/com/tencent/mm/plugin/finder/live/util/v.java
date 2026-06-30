package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.util.v f115719a = new com.tencent.mm.plugin.finder.live.util.v();

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(3:2|3|(1:5)(1:24))|(9:7|8|9|10|(1:12)|(3:14|15|16)|19|15|16)|23|8|9|10|(0)|(0)|19|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037 A[Catch: Exception -> 0x003c, TRY_LEAVE, TryCatch #0 {Exception -> 0x003c, blocks: (B:10:0x002e, B:14:0x0037), top: B:9:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r9, org.json.JSONObject r10) {
        /*
            r8 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "safeGetString"
            java.lang.String r2 = "context"
            kotlin.jvm.internal.o.g(r9, r2)
            java.lang.String r2 = "necessaryParams"
            kotlin.jvm.internal.o.g(r10, r2)
            java.lang.String r2 = "bizUsername"
            r3 = 0
            r4 = 1
            r5 = 0
            boolean r6 = r10.has(r2)     // Catch: java.lang.Exception -> L23
            if (r6 != r4) goto L1b
            r6 = r4
            goto L1c
        L1b:
            r6 = r3
        L1c:
            if (r6 == 0) goto L2b
            java.lang.String r2 = r10.getString(r2)     // Catch: java.lang.Exception -> L23
            goto L2c
        L23:
            r2 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            com.tencent.mm.sdk.platformtools.Log.a(r1, r0, r2)
        L2b:
            r2 = r5
        L2c:
            java.lang.String r6 = "nickname"
            boolean r7 = r10.has(r6)     // Catch: java.lang.Exception -> L3c
            if (r7 != r4) goto L35
            r3 = r4
        L35:
            if (r3 == 0) goto L44
            java.lang.String r10 = r10.getString(r6)     // Catch: java.lang.Exception -> L3c
            goto L45
        L3c:
            r10 = move-exception
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            com.tencent.mm.sdk.platformtools.Log.a(r1, r0, r10)
        L44:
            r10 = r5
        L45:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "Contact_User"
            r0.putExtra(r1, r2)
            java.lang.String r1 = "Contact_Nick"
            r0.putExtra(r1, r10)
            java.lang.String r10 = "force_get_contact"
            r0.putExtra(r10, r4)
            java.lang.String r10 = "key_use_new_contact_profile"
            r0.putExtra(r10, r4)
            java.lang.String r10 = "profile"
            java.lang.String r1 = ".ui.ContactInfoUI"
            j45.l.j(r9, r10, r1, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.util.v.a(android.content.Context, org.json.JSONObject):void");
    }

    public final void b(android.content.Context context, org.json.JSONObject necessaryParams) {
        java.lang.String str;
        boolean z17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(necessaryParams, "necessaryParams");
        try {
            z17 = true;
            if (!necessaryParams.has("cardId")) {
                z17 = false;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", e17);
        }
        if (z17) {
            str = necessaryParams.getString("cardId");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.k2.class);
            intent.putExtra("key_card_id", str);
            intent.putExtra("key_card_ext", "");
            j45.l.j(context, "card", ".ui.CardDetailUI", intent, null);
        }
        str = null;
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.k2.class);
        intent2.putExtra("key_card_id", str);
        intent2.putExtra("key_card_ext", "");
        j45.l.j(context, "card", ".ui.CardDetailUI", intent2, null);
    }

    public final void c(android.content.Context context, org.json.JSONObject necessaryParams) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(necessaryParams, "necessaryParams");
        java.lang.String str = null;
        try {
            if (necessaryParams.has("topic")) {
                str = necessaryParams.getString("topic");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", e17);
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_topic_type", 1);
        intent.putExtra("key_topic_title", str);
        ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).hl(context, intent);
    }
}

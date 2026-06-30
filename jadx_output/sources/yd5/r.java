package yd5;

/* loaded from: classes9.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public static com.tencent.mm.storage.f9 f461148b = null;

    /* renamed from: c, reason: collision with root package name */
    public static long f461149c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static w21.u0 f461150d = null;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f461151e = "";

    /* renamed from: f, reason: collision with root package name */
    public static boolean f461152f;

    /* renamed from: a, reason: collision with root package name */
    public static final yd5.r f461147a = new yd5.r();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.List f461153g = new java.util.ArrayList();

    public final void a() {
        long j17;
        long j18;
        long longValue;
        com.tencent.mm.storage.f9 f9Var = f461148b;
        if (f9Var == null) {
            return;
        }
        java.util.List list = f461153g;
        float f17 = 1.0f;
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        arrayList.add(new jz5.l(java.lang.Float.valueOf(1.0f), java.lang.Long.valueOf(f461149c)));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("oper_user_type", java.lang.Integer.valueOf(f9Var.A0() > 0 ? 2 : 1));
        hashMap.put("msgid", java.lang.String.valueOf(f9Var.getMsgId()));
        hashMap.put("chat_type", java.lang.Integer.valueOf(com.tencent.mm.storage.z3.R4(f461151e) ? 2 : 1));
        w21.u0 u0Var = f461150d;
        long j19 = 0;
        hashMap.put("chat_voice_message_duration_total", java.lang.Long.valueOf(u0Var != null ? u0Var.f442480b : 0L));
        hashMap.put("chat_voice_msg_speed_origin_duration", java.lang.Long.valueOf(arrayList.isEmpty() ? f461149c : ((java.lang.Number) ((jz5.l) kz5.n0.X(list)).f302834e).longValue()));
        if (arrayList.isEmpty()) {
            j17 = 0;
        } else {
            java.util.Iterator it = arrayList.iterator();
            j17 = 0;
            long j27 = 0;
            while (it.hasNext()) {
                jz5.l lVar = (jz5.l) it.next();
                if (j27 > j19) {
                    j17 += ((java.lang.Number) lVar.f302834e).longValue() - j27;
                }
                if (((java.lang.Number) lVar.f302833d).floatValue() > 1.0f) {
                    j27 = ((java.lang.Number) lVar.f302834e).longValue();
                    j19 = 0;
                } else {
                    j19 = 0;
                    j27 = 0;
                }
            }
        }
        hashMap.put("chat_voice_msg_speed_up_duration", java.lang.Long.valueOf(j17));
        if (arrayList.size() < 2) {
            j18 = 0;
        } else {
            java.util.Iterator it6 = arrayList.iterator();
            j18 = 0;
            loop2: while (true) {
                while (it6.hasNext()) {
                    jz5.l lVar2 = (jz5.l) it6.next();
                    if (longValue > 0) {
                        j18 += ((java.lang.Number) lVar2.f302834e).longValue() - longValue;
                    }
                    longValue = (((java.lang.Number) lVar2.f302833d).floatValue() > 1.0f ? 1 : (((java.lang.Number) lVar2.f302833d).floatValue() == 1.0f ? 0 : -1)) == 0 ? ((java.lang.Number) lVar2.f302834e).longValue() : 0L;
                }
            }
        }
        hashMap.put("chat_voice_msg_speed_reset_duration", java.lang.Long.valueOf(j18));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("chat_voice_message_end", hashMap, 33749);
        if (f461152f) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("oper_user_type", java.lang.Integer.valueOf(f9Var.A0() > 0 ? 2 : 1));
            w21.u0 u0Var2 = f461150d;
            hashMap2.put("chat_voice_message_duration_total", java.lang.Long.valueOf(u0Var2 != null ? u0Var2.f442480b : 0L));
            hashMap2.put("msgid", java.lang.String.valueOf(f9Var.getMsgId()));
            hashMap2.put("chat_type", java.lang.Integer.valueOf(com.tencent.mm.storage.z3.R4(f461151e) ? 2 : 1));
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.Iterator it7 = arrayList.iterator();
            long j28 = 0;
            while (it7.hasNext()) {
                jz5.l lVar3 = (jz5.l) it7.next();
                if (!linkedHashMap.containsKey(java.lang.Float.valueOf(f17))) {
                    linkedHashMap.put(java.lang.Float.valueOf(f17), 0L);
                }
                java.lang.Float valueOf = java.lang.Float.valueOf(f17);
                java.lang.Object obj = linkedHashMap.get(java.lang.Float.valueOf(f17));
                kotlin.jvm.internal.o.d(obj);
                linkedHashMap.put(valueOf, java.lang.Long.valueOf(((java.lang.Number) obj).longValue() + (((java.lang.Number) lVar3.f302834e).longValue() - j28)));
                j28 = ((java.lang.Number) lVar3.f302834e).longValue();
                f17 = ((java.lang.Number) lVar3.f302833d).floatValue();
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(linkedHashMap.size());
            for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(((java.lang.Number) entry.getKey()).floatValue());
                sb6.append(':');
                sb6.append(((java.lang.Number) entry.getValue()).longValue());
                arrayList2.add(sb6.toString());
            }
            hashMap2.put("chat_voice_message_duration_played", kz5.n0.g0(arrayList2, "#", null, null, 0, null, null, 62, null));
            hashMap2.put("bg_play_trigger_type", 1);
            hashMap2.put("chat_username", f461151e);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("chat_voice_msg_bg_play", hashMap2, 33749);
        }
        f461149c = 0L;
        f461148b = null;
        f461150d = null;
        f461151e = "";
        f461152f = false;
        ((java.util.ArrayList) list).clear();
    }

    public final void b(java.lang.String str, java.lang.String str2, com.tencent.mm.storage.f9 f9Var, java.lang.String str3) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("msgid", java.lang.String.valueOf(f9Var.getMsgId()));
        hashMap.put("chat_type", java.lang.Integer.valueOf(com.tencent.mm.storage.z3.R4(str3) ? 2 : 1));
        hashMap.put("chat_username", str3);
        hashMap.put("oper_user_type", java.lang.Integer.valueOf(f9Var.A0() <= 0 ? 1 : 2));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(str, str2, hashMap, 33749);
    }

    public final void c(java.lang.String str, boolean z17, boolean z18) {
        com.tencent.mm.storage.f9 f9Var = f461148b;
        if (f9Var == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("oper_user_type", java.lang.Integer.valueOf(f9Var.A0() > 0 ? 2 : 1));
        hashMap.put("chat_voice_message_duration_played", java.lang.Long.valueOf(f461149c));
        w21.u0 u0Var = f461150d;
        hashMap.put("chat_voice_message_duration_total", java.lang.Long.valueOf(u0Var != null ? u0Var.f442480b : 0L));
        hashMap.put("msgid", java.lang.String.valueOf(f9Var.getMsgId()));
        hashMap.put("chat_type", java.lang.Integer.valueOf(com.tencent.mm.storage.z3.R4(f461151e) ? 2 : 1));
        hashMap.put("chat_name", f461151e);
        if (z17) {
            hashMap.put("bg_play_trigger_type", 1);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj(str, z18 ? "view_exp" : "view_clk", hashMap, 33749);
    }
}

package mx3;

/* loaded from: classes10.dex */
public final class b0 {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f332529b;

    /* renamed from: a, reason: collision with root package name */
    public static final mx3.b0 f332528a = new mx3.b0();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f332530c = new java.util.LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f332531d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f332532e = jz5.h.b(mx3.y.f332630d);

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f332533f = jz5.h.b(mx3.z.f332631d);

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.HashMap f332534g = new java.util.HashMap();

    public static java.util.Set b(mx3.b0 b0Var, java.lang.String str, boolean z17, java.util.Set set, int i17, java.lang.Object obj) {
        if ((i17 & 4) != 0) {
            set = null;
        }
        jz5.g gVar = f332532e;
        if (z17) {
            b0Var.getClass();
            return ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).getStringSet(str + "called", set);
        }
        b0Var.getClass();
        return ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).getStringSet(str + "calling", set);
    }

    public static final void g(java.lang.String username, java.lang.String ringtoneInfo) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(ringtoneInfo, "ringtoneInfo");
        f332534g.put(username, ringtoneInfo);
        ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) f332533f).getValue()).putString(username, ringtoneInfo);
    }

    public final java.lang.String a(java.util.Set set) {
        java.lang.String str = null;
        if (set == null) {
            return null;
        }
        java.util.Iterator it = set.iterator();
        long j17 = 0;
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            long j18 = f332528a.f(str2).f332628b;
            if (j17 <= j18) {
                str = str2;
                j17 = j18;
            }
        }
        return str;
    }

    public final java.lang.String[] c() {
        java.lang.Character ch6;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_remind_reveicer_update_ringtone_wording, "", true);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
            try {
                cl0.g gVar = new cl0.g(Zi);
                java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
                com.tencent.mars.xlog.Log.i("MicroMsg.QuickRingtoneHelper", "getXSettingCallingRingtoneString, langCode:%s", d17);
                java.lang.String optString = gVar.optString(d17);
                kotlin.jvm.internal.o.d(optString);
                int i17 = 0;
                while (true) {
                    if (i17 >= optString.length()) {
                        ch6 = null;
                        break;
                    }
                    char charAt = optString.charAt(i17);
                    if (charAt == 65509) {
                        ch6 = java.lang.Character.valueOf(charAt);
                        break;
                    }
                    i17++;
                }
                if (ch6 == null) {
                    return null;
                }
                ch6.charValue();
                return new java.lang.String[]{optString.subSequence(0, r26.n0.K(optString, (char) 65509, 0, false, 6, null)).toString(), optString.subSequence(r26.n0.K(optString, (char) 65509, 0, false, 6, null) + 1, optString.length()).toString()};
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.QuickRingtoneHelper", e17, "getMultitalkNavpopWording error", new java.lang.Object[0]);
            }
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493474kd1);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493473kd0);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return new java.lang.String[]{string, string2};
    }

    public final java.lang.String[] d() {
        java.lang.Character ch6;
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_remind_caller_set_ringtone_wording, "", true);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
            try {
                cl0.g gVar = new cl0.g(Zi);
                java.lang.String d17 = com.tencent.mm.sdk.platformtools.m2.d();
                com.tencent.mars.xlog.Log.i("MicroMsg.QuickRingtoneHelper", "getXSettingCallingRingtoneString, langCode:%s", d17);
                java.lang.String optString = gVar.optString(d17);
                kotlin.jvm.internal.o.d(optString);
                int i17 = 0;
                while (true) {
                    if (i17 >= optString.length()) {
                        ch6 = null;
                        break;
                    }
                    char charAt = optString.charAt(i17);
                    if (charAt == 65509) {
                        ch6 = java.lang.Character.valueOf(charAt);
                        break;
                    }
                    i17++;
                }
                if (ch6 == null) {
                    return null;
                }
                ch6.charValue();
                return new java.lang.String[]{optString.subSequence(0, r26.n0.K(optString, (char) 65509, 0, false, 6, null)).toString(), optString.subSequence(r26.n0.K(optString, (char) 65509, 0, false, 6, null) + 1, optString.length()).toString()};
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.QuickRingtoneHelper", e17, "getMultitalkNavpopWording error", new java.lang.Object[0]);
            }
        }
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493475kd2);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.kcz);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return new java.lang.String[]{string, string2};
    }

    public final void e(com.tencent.mm.storage.f9 msgInfo, java.lang.String userName, java.lang.String feedId) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        kotlin.jvm.internal.o.g(userName, "userName");
        kotlin.jvm.internal.o.g(feedId, "feedId");
        if (f332529b) {
            java.util.Set set = f332530c;
            if (set.contains(java.lang.Long.valueOf(msgInfo.getMsgId()))) {
                return;
            }
            set.add(java.lang.Long.valueOf(msgInfo.getMsgId()));
            ((java.util.ArrayList) f332531d).add(msgInfo);
        }
    }

    public final mx3.x f(java.lang.String str) {
        mx3.x xVar = new mx3.x();
        cl0.g gVar = new cl0.g(str);
        xVar.f332627a = gVar.getString("ringtoneId");
        xVar.f332628b = gVar.getLong("tick");
        xVar.f332629c = gVar.getBoolean("linkToSetting");
        return xVar;
    }

    public final void h(java.lang.String str, boolean z17, java.util.Set set) {
        jz5.g gVar = f332532e;
        if (z17) {
            ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).putStringSet(str + "called", set);
            return;
        }
        ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) gVar).getValue()).putStringSet(str + "calling", set);
    }
}

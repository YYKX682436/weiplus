package lp3;

@j95.b
/* loaded from: classes5.dex */
public class r extends i95.w implements mp3.n {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f320304d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public lp3.o f320305e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f320306f = null;

    public final lp3.o Ai() {
        if (this.f320305e == null) {
            synchronized (this) {
                if (this.f320305e == null) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(gm0.j1.u().h() + "patmsg/");
                    sb6.append("pat_recv_record");
                    this.f320305e = new lp3.o(sb6.toString());
                }
            }
        }
        return this.f320305e;
    }

    public r45.m55 Bi(long j17) {
        requireAccountInitialized();
        synchronized (this.f320306f) {
            java.util.Iterator it = this.f320306f.iterator();
            while (it.hasNext()) {
                r45.m55 m55Var = (r45.m55) it.next();
                r45.l55 l55Var = m55Var.f380156e;
                if (l55Var != null && l55Var.f379157i == j17) {
                    return m55Var;
                }
            }
            return null;
        }
    }

    public boolean Di() {
        int b17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("DisableSendPat", 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginPatMsg", "disable sendPat %d", java.lang.Integer.valueOf(b17));
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return b17 == 0;
    }

    public boolean Ni() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_revoke_pat_msg_enable, 1) == 1;
    }

    public mp3.p Ri(r45.l55 l55Var, java.lang.String str) {
        java.lang.String str2;
        if (l55Var == null) {
            return new mp3.p();
        }
        java.lang.String str3 = l55Var.f379152d;
        java.lang.String str4 = l55Var.f379153e;
        java.lang.String str5 = l55Var.f379154f;
        java.util.HashMap hashMap = (java.util.HashMap) this.f320304d;
        mp3.p pVar = (mp3.p) hashMap.get(str5);
        if (pVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PluginPatMsg", "find %s (%s) in cache", str5, pVar);
            return pVar;
        }
        mp3.p pVar2 = new mp3.p();
        com.tencent.mars.xlog.Log.i("MicroMsg.PluginPatMsg", "parseDisplayTemplate realtime templateStr:%s ", str5);
        boolean z17 = (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("SendPatUserShowBitVal", 2) & 2) != 0;
        java.util.regex.Matcher matcher = tg3.v1.f419224a.matcher(str5);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (matcher.find()) {
            try {
                java.lang.String group = matcher.group(0);
                java.lang.String substring = group.substring(2, group.length() - 1);
                com.tencent.mars.xlog.Log.i("MicroMsg.SysMsgTemplateHelper", "parse template, group:%s,value:%s", group, substring);
                arrayList.add(new tg3.u1(group, substring));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SysMsgTemplateHelper", e17, "parseParams error!", new java.lang.Object[0]);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        java.lang.String str6 = str5;
        while (it.hasNext()) {
            tg3.u1 u1Var = (tg3.u1) it.next();
            if (!android.text.TextUtils.isEmpty(u1Var.f419221b)) {
                java.lang.String str7 = u1Var.f419221b;
                boolean endsWith = str7.endsWith("@textstatusicon");
                java.lang.String str8 = u1Var.f419220a;
                if (!endsWith) {
                    java.lang.String f17 = c01.a2.f(str7, str);
                    int indexOf = str6.indexOf(str8);
                    ((java.util.ArrayList) pVar2.f330461b).add(android.util.Pair.create(java.lang.Integer.valueOf(indexOf), java.lang.Integer.valueOf(indexOf + f17.length())));
                    ((java.util.ArrayList) pVar2.f330462c).add(str7);
                    str6 = str6.replace(str8, f17);
                } else if (z17) {
                    java.lang.String replace = str7.replace("@textstatusicon", "");
                    boolean equals = android.text.TextUtils.equals(replace, "fromusername");
                    java.util.List list = pVar2.f330463d;
                    if (equals) {
                        boolean aj6 = ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).aj(str3);
                        str2 = aj6 ? "\u200b" : "";
                        int indexOf2 = str6.indexOf(str8);
                        if (aj6) {
                            ((java.util.LinkedList) list).add(new mp3.o(indexOf2, str2.length() + indexOf2, str3));
                        }
                        str6 = str6.replace(str8, str2);
                    } else if (android.text.TextUtils.equals(replace, "pattedusername")) {
                        boolean aj7 = ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).aj(str4);
                        str2 = aj7 ? "\u200b" : "";
                        int indexOf3 = str6.indexOf(str8);
                        if (aj7) {
                            ((java.util.LinkedList) list).add(new mp3.o(indexOf3, str2.length() + indexOf3, str4));
                        }
                        str6 = str6.replace(str8, str2);
                    } else {
                        str6 = str6.replace(str8, "");
                    }
                }
            }
        }
        pVar2.f330460a = str6;
        hashMap.put(str5, pVar2);
        return pVar2;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        Ai();
        java.util.LinkedList b17 = this.f320305e.b();
        this.f320306f = b17;
        if (b17 == null) {
            this.f320306f = new java.util.LinkedList();
        }
    }

    public void wi(long j17, r45.l55 l55Var) {
        requireAccountInitialized();
        synchronized (this.f320306f) {
            r45.m55 m55Var = new r45.m55();
            m55Var.f380155d = j17;
            m55Var.f380156e = l55Var;
            this.f320306f.addFirst(m55Var);
        }
        ((ku5.t0) ku5.t0.f312615d).h(new lp3.q(this), "sync_pat_recv_record_thread");
    }
}

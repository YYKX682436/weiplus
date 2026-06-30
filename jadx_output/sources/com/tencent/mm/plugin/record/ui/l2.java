package com.tencent.mm.plugin.record.ui;

/* loaded from: classes5.dex */
public class l2 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.regex.Pattern f155438h = java.util.regex.Pattern.compile("[a-zA-z]");

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.regex.Pattern f155439i = java.util.regex.Pattern.compile("[一-龥]");

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.regex.Pattern f155440j = java.util.regex.Pattern.compile("[\\p{P}\\s]");

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.regex.Pattern f155441k = java.util.regex.Pattern.compile("[0-9]");

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f155442a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.BaseAdapter f155443b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.record.ui.a f155444c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f155445d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest f155446e = null;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f155447f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f155448g;

    public l2(android.content.Context context, android.widget.BaseAdapter baseAdapter, com.tencent.mm.plugin.record.ui.a aVar) {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.plugin.record.ui.TranslateHelper$2 translateHelper$2 = new com.tencent.mm.plugin.record.ui.TranslateHelper$2(this, a0Var);
        this.f155447f = translateHelper$2;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent>(a0Var) { // from class: com.tencent.mm.plugin.record.ui.TranslateHelper$3
            {
                this.__eventId = -348375692;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent changeTranslateLanguageEvent) {
                int D1;
                com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent changeTranslateLanguageEvent2 = changeTranslateLanguageEvent;
                com.tencent.mm.plugin.record.ui.l2 l2Var = com.tencent.mm.plugin.record.ui.l2.this;
                com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest settingsTranslateLanguageRequest = l2Var.f155446e;
                java.lang.String str = settingsTranslateLanguageRequest == null ? null : settingsTranslateLanguageRequest.f67822e;
                if (settingsTranslateLanguageRequest == null) {
                    D1 = -1;
                } else {
                    java.util.Map map = settingsTranslateLanguageRequest.f67823f;
                    D1 = com.tencent.mm.sdk.platformtools.t8.D1(map == null ? null : (java.lang.String) map.get("TranslateHelper.SettingsRequestExtKey.MsgPosition"), 0);
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.TranslateHelper", "changeTransLangListener, eventSessionId: " + changeTranslateLanguageEvent2.f54035g.f8502a + ", requestMsgId: " + str + ", requestMsgPosition: " + D1);
                if (str != null && android.text.TextUtils.equals(str, changeTranslateLanguageEvent2.f54035g.f8502a)) {
                    l2Var.f155446e = null;
                    l2Var.f(D1, true);
                }
                return false;
            }
        };
        this.f155448g = iListener;
        this.f155442a = context;
        this.f155443b = baseAdapter;
        this.f155444c = aVar;
        translateHelper$2.alive();
        iListener.alive();
    }

    public static int b(java.lang.String str) {
        int i17 = 0;
        int i18 = 0;
        while (i17 < str.length()) {
            int i19 = i17 + 1;
            if (f155439i.matcher(str.substring(i17, i19)).find()) {
                i18++;
            }
            i17 = i19;
        }
        return i18;
    }

    public static boolean c(java.lang.String str) {
        boolean z17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            str = str.substring(indexOf + 1);
        }
        java.lang.String replaceAll = f155441k.matcher(f155440j.matcher(str).replaceAll("")).replaceAll("");
        int length = replaceAll.length();
        if (length == 0) {
            return false;
        }
        java.lang.String c17 = com.tencent.mm.sdk.platformtools.m2.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
        if (c17 == null) {
            c17 = com.tencent.mm.sdk.platformtools.m2.d();
        }
        if (!c17.equals("zh_CN")) {
            return true;
        }
        o13.r rVar = o13.s.f342255a;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(replaceAll)) {
            for (char c18 : replaceAll.toCharArray()) {
                if (o13.s.a(c18) && !com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) o13.s.f342265k.get(java.lang.String.valueOf(c18)))) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        return z17 || ((float) b(replaceAll)) / ((float) length) < 1.0f;
    }

    public static boolean d(java.lang.String str) {
        if (c(str)) {
            return true;
        }
        return j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepaireConfigTransKeep()) == 1;
    }

    public bt3.f3 a(int i17) {
        java.util.Iterator it = this.f155444c.f155343b.f24279d.iterator();
        while (it.hasNext()) {
            bt3.f3 f3Var = (bt3.f3) it.next();
            if (i17 == f3Var.f24264d) {
                return f3Var;
            }
        }
        bt3.f3 f3Var2 = new bt3.f3();
        f3Var2.f24264d = i17;
        f3Var2.f24265e = 0;
        this.f155444c.f155343b.f24279d.add(f3Var2);
        return f3Var2;
    }

    public byte[] e() {
        bt3.g3 g3Var;
        java.util.LinkedList linkedList;
        this.f155447f.dead();
        this.f155448g.dead();
        bt3.g3 g3Var2 = new bt3.g3();
        com.tencent.mm.plugin.record.ui.a aVar = this.f155444c;
        if (aVar != null && (g3Var = aVar.f155343b) != null && (linkedList = g3Var.f24279d) != null) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                bt3.f3 f3Var = (bt3.f3) it.next();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(f3Var.f24266f)) {
                    g3Var2.f24279d.add(f3Var);
                }
            }
        }
        this.f155443b = null;
        this.f155444c = null;
        this.f155442a = null;
        try {
            return g3Var2.toByteArray();
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    public void f(int i17, boolean z17) {
        bt3.f3 a17 = a(i17);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(a17.f24266f) && !z17) {
            a17.f24265e = 2;
            this.f155443b.notifyDataSetChanged();
            return;
        }
        if (i17 >= this.f155444c.f155342a.size()) {
            return;
        }
        com.tencent.mm.autogen.events.TranslateMessageEvent translateMessageEvent = new com.tencent.mm.autogen.events.TranslateMessageEvent();
        am.hz hzVar = translateMessageEvent.f54902g;
        hzVar.getClass();
        hzVar.f6880c = "" + i17;
        hzVar.f6878a = ((r45.gp0) this.f155444c.f155342a.get(i17)).f375408f;
        hzVar.f6879b = com.tencent.mm.sdk.platformtools.m2.c(this.f155442a);
        com.tencent.mm.protobuf.g gVar = a17.f24268h;
        hzVar.f6884g = gVar != null ? gVar.f192156a : null;
        hzVar.f6881d = 4;
        translateMessageEvent.e();
        a17.f24265e = 1;
        this.f155443b.notifyDataSetChanged();
        this.f155445d = true;
    }
}

package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.k0.class)
/* loaded from: classes9.dex */
public class g9 extends com.tencent.mm.ui.chatting.component.a implements sb5.k0 {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f199084e;

    /* renamed from: m, reason: collision with root package name */
    public int f199089m;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Set f199091o;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f199085f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f199086g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f199087h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f199088i = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public boolean f199090n = false;

    public g9() {
        new java.util.HashMap();
        this.f199091o = new java.util.HashSet();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        java.util.Map map;
        if (s0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingServiceNotifyComponent", "onChattingExitAnimEnd");
            this.f198580d.f460717l.removeOptionMenu(4);
            this.f198580d.f460717l.removeOptionMenu(5);
            int count = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f198580d.f460708c.a(sb5.z.class))).getCount();
            for (int i17 = count - this.f199089m; i17 < count; i17++) {
                com.tencent.mm.storage.f9 item = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f198580d.f460708c.a(sb5.z.class))).getItem(i17);
                if (item != null && (map = this.f199085f) != null) {
                    if (((java.util.HashMap) map).containsKey(java.lang.Long.valueOf(item.getMsgId()))) {
                        t0(1, item);
                    }
                }
            }
            java.util.Map map2 = this.f199085f;
            if (map2 != null) {
                ((java.util.HashMap) map2).clear();
            }
            java.util.Map map3 = this.f199087h;
            if (map3 != null) {
                ((java.util.HashMap) map3).clear();
            }
            java.util.Map map4 = this.f199088i;
            if (map4 != null) {
                ((java.util.HashMap) map4).clear();
            }
            java.util.Set set = this.f199091o;
            if (set != null) {
                ((java.util.HashSet) set).clear();
            }
            java.util.Map map5 = this.f199086g;
            if (map5 != null) {
                ((java.util.HashMap) map5).clear();
            }
            if (this.f199090n || r0()) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingServiceNotifyComponent", "check record");
            st0.e v17 = c01.d9.b().v();
            if (v17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingServiceNotifyComponent", "get message notify storage return null");
            } else {
                ((ku5.t0) ku5.t0.f312615d).a(new com.tencent.mm.ui.chatting.component.f9(this, v17));
            }
            this.f199090n = true;
        }
    }

    @Override // yn.d
    public void N(int i17, int i18, android.content.Intent intent) {
        if (r0() && i17 == 100 && intent != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingServiceNotifyComponent", "receive data from subscribe msg");
            com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData subscribeMsgSettingData = (com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData) intent.getParcelableExtra("key_biz_data");
            if (subscribeMsgSettingData != null) {
                o31.m.f342681a.b(this.f199084e, subscribeMsgSettingData, new com.tencent.mm.ui.zh(this.f198580d.g(), this.f199084e));
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        this.f199084e = this.f198580d.f460717l.getStringExtra("key_notify_message_real_username");
        if (r0() || s0()) {
            this.f199089m = 0;
        }
    }

    @Override // yn.d
    public void i0(android.view.View view, int i17, int i18, int i19, int i27) {
        if (s0()) {
            this.f199089m = java.lang.Math.max(this.f199089m, i19 - i17);
        }
    }

    public final boolean m0(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.f9 f9Var2) {
        long msgId = f9Var.getMsgId();
        long msgId2 = f9Var2.getMsgId();
        java.lang.String j17 = f9Var.j();
        java.lang.String j18 = f9Var2.j();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(j17) && !com.tencent.mm.sdk.platformtools.t8.K0(j18)) {
            tt0.c a17 = tt0.c.a(j17);
            tt0.c a18 = tt0.c.a(j18);
            if (com.tencent.mm.sdk.platformtools.t8.K0(a17.f421795j) || com.tencent.mm.sdk.platformtools.t8.K0(a18.f421795j) || !a17.f421795j.equals(a18.f421795j)) {
                return false;
            }
            java.lang.String str = a17.f421787b;
            if (str == null) {
                str = "";
            }
            if (str.equals(a18.f421787b)) {
                return (msgId2 > msgId ? 1 : (msgId2 == msgId ? 0 : -1)) > 0;
            }
            return false;
        }
        return false;
    }

    public long n0(long j17) {
        java.lang.Long l17;
        if (!s0()) {
            return -1L;
        }
        java.lang.Long l18 = (java.lang.Long) ((java.util.HashMap) this.f199085f).get(java.lang.Long.valueOf(j17));
        if (l18 == null || (l17 = (java.lang.Long) ((java.util.HashMap) this.f199086g).get(l18)) == null || l17.longValue() != j17) {
            return -1L;
        }
        return l18.longValue();
    }

    public java.util.List o0(long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!s0()) {
            return arrayList;
        }
        java.util.Set set = null;
        if (s0()) {
            long n07 = n0(j17);
            if (n07 > 0) {
                set = p0(n07);
            }
        }
        if (set == null) {
            return arrayList;
        }
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) ((java.util.HashMap) this.f199088i).get((java.lang.Long) it.next());
            if (f9Var != null) {
                arrayList.add(f9Var);
            }
        }
        return arrayList;
    }

    public java.util.Set p0(long j17) {
        if (!s0()) {
            return null;
        }
        return (java.util.Set) ((java.util.HashMap) this.f199087h).get(java.lang.Long.valueOf(j17));
    }

    public boolean q0(long j17) {
        if (s0()) {
            return ((java.util.HashMap) this.f199088i).get(java.lang.Long.valueOf(j17)) != null;
        }
        return false;
    }

    public boolean r0() {
        return (com.tencent.mm.sdk.platformtools.t8.K0(this.f198580d.x()) || !com.tencent.mm.storage.z3.S4(this.f198580d.x()) || com.tencent.mm.sdk.platformtools.t8.K0(this.f199084e)) ? false : true;
    }

    public boolean s0() {
        java.lang.String a17 = j62.e.g().a("clicfg_wcpay_message_folder_android", "", false, false);
        if (!((com.tencent.mm.sdk.platformtools.t8.K0(a17) || com.tencent.mm.sdk.platformtools.t8.P(a17, 0) == 0) ? false : true)) {
            return false;
        }
        java.lang.String x17 = this.f198580d.x();
        if (com.tencent.mm.sdk.platformtools.t8.K0(x17)) {
            return false;
        }
        return com.tencent.mm.storage.z3.S4(x17);
    }

    public void t0(int i17, com.tencent.mm.storage.f9 f9Var) {
        if (s0()) {
            long n07 = n0(f9Var.getMsgId());
            java.util.Map map = this.f199087h;
            int size = ((java.util.HashMap) map).get(java.lang.Long.valueOf(n07)) == null ? 0 : ((java.util.Set) ((java.util.HashMap) map).get(java.lang.Long.valueOf(n07))).size();
            if (n07 < 0) {
                return;
            }
            tt0.c a17 = tt0.c.a(f9Var.j());
            int i18 = a17.f421792g;
            int i19 = i18 != 2 ? i18 != 3 ? 0 : 3 : 2;
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[6];
            objArr[0] = java.lang.Integer.valueOf(i17);
            objArr[1] = a17.f421787b;
            objArr[2] = a17.f421789d;
            objArr[3] = java.lang.Integer.valueOf(i19);
            objArr[4] = java.lang.Integer.valueOf(size);
            objArr[5] = java.lang.Integer.valueOf((a17.f421786a != 1 || android.text.TextUtils.isEmpty(a17.f421790e)) ? 1 : 2);
            g0Var.d(22906, objArr);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        if (s0()) {
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.ui.chatting.component.e9 e9Var = new com.tencent.mm.ui.chatting.component.e9(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(e9Var, 128L, false);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        if (s0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingServiceNotifyComponent", "onChattingEnterAnimStart");
        }
    }
}

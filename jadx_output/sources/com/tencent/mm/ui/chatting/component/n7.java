package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.g0.class)
/* loaded from: classes9.dex */
public class n7 extends com.tencent.mm.ui.chatting.component.a implements sb5.g0 {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f199549e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Map f199550f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.Map f199551g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f199552h;

    /* renamed from: m, reason: collision with root package name */
    public int f199554m;

    /* renamed from: p, reason: collision with root package name */
    public int f199557p;

    /* renamed from: r, reason: collision with root package name */
    public sb5.x1 f199559r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.component.ig f199560s;

    /* renamed from: t, reason: collision with root package name */
    public sb5.z1 f199561t;

    /* renamed from: v, reason: collision with root package name */
    public db5.d5 f199563v;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f199553i = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f199555n = false;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f199556o = new java.util.HashMap();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Set f199558q = new java.util.HashSet();

    /* renamed from: u, reason: collision with root package name */
    public int f199562u = 0;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.ui.bc f199564w = new com.tencent.mm.ui.chatting.component.o7(this);

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        java.util.Map map;
        ((java.util.HashSet) this.f199558q).clear();
        if (u0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingServiceNotifyComponent", "onChattingExitAnimEnd");
            this.f198580d.f460717l.removeOptionMenu(4);
            this.f198580d.f460717l.removeOptionMenu(5);
            int count = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f198580d.f460708c.a(sb5.z.class))).getCount();
            for (int i17 = count - this.f199554m; i17 < count; i17++) {
                com.tencent.mm.storage.f9 item = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f198580d.f460708c.a(sb5.z.class))).getItem(i17);
                if (item != null && (map = this.f199550f) != null && map.containsKey(java.lang.Long.valueOf(item.getMsgId()))) {
                    v0(1, item);
                }
            }
            java.util.Map map2 = this.f199550f;
            if (map2 != null) {
                map2.clear();
            }
            this.f199550f = null;
            java.util.Map map3 = this.f199551g;
            if (map3 != null) {
                map3.clear();
            }
            this.f199551g = null;
            java.util.List list = this.f199552h;
            if (list != null) {
                list.clear();
            }
            this.f199552h = null;
            synchronized ("MicroMsg.ChattingServiceNotifyComponent") {
                java.util.List list2 = this.f199553i;
                if (list2 != null) {
                    list2.clear();
                }
                this.f199553i = null;
            }
            if (!this.f199555n && !t0()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingServiceNotifyComponent", "check record");
                st0.e v17 = c01.d9.b().v();
                if (v17 == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ChattingServiceNotifyComponent", "get message notify storage return null");
                } else {
                    ((ku5.t0) ku5.t0.f312615d).a(new com.tencent.mm.ui.chatting.component.r7(this, v17));
                }
                this.f199555n = true;
            }
            ((java.util.Vector) com.tencent.mm.ui.chatting.viewitems.kk.f204350a).clear();
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        db5.d5 d5Var = this.f199563v;
        if (d5Var != null) {
            d5Var.dismiss();
        }
    }

    @Override // yn.d
    public void N(int i17, int i18, android.content.Intent intent) {
        if (t0() && i17 == 100 && intent != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingServiceNotifyComponent", "receive data from subscribe msg");
            com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData subscribeMsgSettingData = (com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData) intent.getParcelableExtra("key_biz_data");
            if (subscribeMsgSettingData != null) {
                o31.m.f342681a.b(this.f199549e, subscribeMsgSettingData, new com.tencent.mm.ui.zh(this.f198580d.g(), this.f199549e));
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        this.f199549e = this.f198580d.f460717l.getStringExtra("key_notify_message_real_username");
        this.f199562u = this.f198580d.f460717l.getIntExtra("container_enter_scene", 0);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f199557p = (int) (currentTimeMillis / 1000);
        android.os.Bundle arguments = this.f198580d.f460717l.getArguments();
        if (arguments != null) {
            java.lang.String string = arguments.getString("service_notify_session_id");
            if (!android.text.TextUtils.isEmpty(string)) {
                te5.v1.f418758b = string;
                if (!t0() || u0()) {
                    this.f199554m = 0;
                }
                return;
            }
        }
        te5.v1.f418758b = gm0.j1.b().j() + '_' + currentTimeMillis;
        if (t0()) {
        }
        this.f199554m = 0;
    }

    @Override // yn.d
    public void i0(android.view.View view, int i17, int i18, int i19, int i27) {
        if (u0()) {
            this.f199554m = java.lang.Math.max(this.f199554m, i19 - i17);
        }
    }

    public final boolean m0(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.storage.f9 f9Var2) {
        java.util.List list = this.f199553i;
        if (list == null || list.isEmpty()) {
            return false;
        }
        java.util.List list2 = this.f199553i;
        long msgId = ((com.tencent.mm.storage.f9) list2.get(list2.size() - 1)).getMsgId();
        long msgId2 = f9Var.getMsgId();
        long msgId3 = f9Var2.getMsgId();
        java.lang.String j17 = f9Var.j();
        java.lang.String j18 = f9Var2.j();
        if (com.tencent.mm.sdk.platformtools.t8.K0(j17) || com.tencent.mm.sdk.platformtools.t8.K0(j18)) {
            return false;
        }
        tt0.c a17 = tt0.c.a(j17);
        tt0.c a18 = tt0.c.a(j18);
        java.lang.String str = a17.f421787b;
        if (str == null) {
            str = "";
        }
        if (!str.equals(a18.f421787b)) {
            return false;
        }
        java.lang.String str2 = a17.f421788c;
        return (str2 != null ? str2 : "").equals(a18.f421788c) && msgId2 >= msgId && msgId3 > msgId2;
    }

    public sb5.x1 n0() {
        if (!te5.s1.f418747a.a()) {
            return null;
        }
        if (this.f199559r == null) {
            this.f199559r = new com.tencent.mm.ui.chatting.component.m7();
        }
        return this.f199559r;
    }

    public com.tencent.mm.ui.chatting.component.ig o0() {
        if (this.f199560s == null) {
            this.f199560s = new com.tencent.mm.ui.chatting.component.t7();
        }
        return this.f199560s;
    }

    public long p0(long j17) {
        if (!u0()) {
            return -1L;
        }
        r0();
        java.lang.Long l17 = (java.lang.Long) this.f199550f.get(java.lang.Long.valueOf(j17));
        if (l17 == null) {
            return -1L;
        }
        return l17.longValue();
    }

    public java.util.Set q0(long j17) {
        if (!u0()) {
            return null;
        }
        r0();
        return (java.util.Set) this.f199551g.get(java.lang.Long.valueOf(j17));
    }

    public final void r0() {
        int min;
        if (this.f199550f == null || this.f199551g == null || this.f199552h == null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            synchronized ("MicroMsg.ChattingServiceNotifyComponent") {
                if (this.f199550f == null || this.f199551g == null || this.f199552h == null) {
                    this.f199550f = new java.util.HashMap();
                    this.f199551g = new java.util.HashMap();
                    this.f199552h = new java.util.ArrayList();
                    com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(this.f198580d.x());
                    if (p17 != null && p17.d1() > 0 && (min = java.lang.Math.min(p17.d1(), 100)) > 0) {
                        this.f199553i = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().y5(this.f198580d.x(), min);
                    }
                    java.util.List list = this.f199553i;
                    if (list != null && !list.isEmpty()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingServiceNotifyComponent", "unread msg count: %d", java.lang.Integer.valueOf(this.f199553i.size()));
                        java.util.HashMap hashMap = new java.util.HashMap();
                        long j17 = 0;
                        com.tencent.mm.storage.f9 f9Var = null;
                        java.util.HashSet hashSet = null;
                        int i17 = 0;
                        boolean z17 = false;
                        while (i17 < java.lang.Math.min(this.f199553i.size(), 200)) {
                            com.tencent.mm.storage.f9 f9Var2 = (com.tencent.mm.storage.f9) this.f199553i.get(i17);
                            int i18 = i17 + 1;
                            com.tencent.mm.storage.f9 f9Var3 = i18 < this.f199553i.size() ? (com.tencent.mm.storage.f9) this.f199553i.get(i18) : null;
                            if (f9Var3 != null) {
                                if (m0(f9Var3, f9Var2)) {
                                    if (!z17) {
                                        j17 = f9Var2.getMsgId();
                                        hashSet = new java.util.HashSet();
                                        z17 = true;
                                    }
                                    hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(f9Var3.getMsgId()));
                                    hashSet.add(java.lang.Long.valueOf(f9Var3.getMsgId()));
                                    hashSet.add(java.lang.Long.valueOf(j17));
                                    if (hashSet.size() >= 10) {
                                        this.f199551g.put(java.lang.Long.valueOf(f9Var3.getMsgId()), hashSet);
                                        hashSet = null;
                                        i17 = i18;
                                        f9Var = f9Var3;
                                        z17 = false;
                                    } else {
                                        f9Var = f9Var2;
                                    }
                                    if (!this.f199552h.contains(java.lang.Long.valueOf(f9Var2.getMsgId()))) {
                                        this.f199552h.add(java.lang.Long.valueOf(f9Var2.getMsgId()));
                                    }
                                    if (!this.f199552h.contains(java.lang.Long.valueOf(f9Var3.getMsgId()))) {
                                        this.f199552h.add(java.lang.Long.valueOf(f9Var3.getMsgId()));
                                    }
                                } else {
                                    if (hashSet != null) {
                                        this.f199551g.put(java.lang.Long.valueOf(f9Var2.getMsgId()), hashSet);
                                    }
                                    hashSet = null;
                                    f9Var = f9Var2;
                                    z17 = false;
                                }
                            } else if (f9Var != null) {
                                if (m0(f9Var2, f9Var) && z17) {
                                    hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(f9Var2.getMsgId()));
                                    if (hashSet == null) {
                                        hashSet = new java.util.HashSet();
                                    }
                                    this.f199551g.put(java.lang.Long.valueOf(f9Var2.getMsgId()), hashSet);
                                    hashSet.add(java.lang.Long.valueOf(f9Var2.getMsgId()));
                                    hashSet.add(java.lang.Long.valueOf(j17));
                                    if (!this.f199552h.contains(java.lang.Long.valueOf(f9Var2.getMsgId()))) {
                                        this.f199552h.add(java.lang.Long.valueOf(f9Var2.getMsgId()));
                                    }
                                }
                                z17 = false;
                            }
                            i17++;
                        }
                        this.f199550f.putAll(hashMap);
                        hashMap.clear();
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingServiceNotifyComponent", "initMessageGroupInfo cost: %dms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingServiceNotifyComponent", "end to head msg id size: %d, group by info size: %d, msg in group total size: %d", java.lang.Integer.valueOf(this.f199550f.size()), java.lang.Integer.valueOf(this.f199551g.size()), java.lang.Integer.valueOf(this.f199552h.size()));
                    }
                }
            }
        }
    }

    public boolean s0(long j17) {
        if (!u0()) {
            return false;
        }
        r0();
        return this.f199552h.contains(java.lang.Long.valueOf(j17));
    }

    public boolean t0() {
        return (com.tencent.mm.sdk.platformtools.t8.K0(this.f198580d.x()) || !com.tencent.mm.storage.z3.j4(this.f198580d.x()) || com.tencent.mm.sdk.platformtools.t8.K0(this.f199549e)) ? false : true;
    }

    public boolean u0() {
        java.lang.String x17 = this.f198580d.x();
        if (com.tencent.mm.sdk.platformtools.t8.K0(x17)) {
            return false;
        }
        return com.tencent.mm.storage.z3.j4(x17);
    }

    public void v0(int i17, com.tencent.mm.storage.f9 f9Var) {
        if (u0()) {
            long p07 = p0(f9Var.getMsgId());
            int size = this.f199551g.get(java.lang.Long.valueOf(p07)) == null ? 0 : ((java.util.Set) this.f199551g.get(java.lang.Long.valueOf(p07))).size();
            if (p07 < 0) {
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

    public final void w0(int i17, int i18, int i19, android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        if (this.f198580d.f460717l.findMenuInfo(i17) == null) {
            this.f198580d.f460717l.addIconOptionMenu(i17, i18, i19, onMenuItemClickListener);
        } else {
            this.f198580d.f460717l.updateOptionMenu(i17, i18, i19, onMenuItemClickListener);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        if (u0()) {
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.ui.chatting.component.p7 p7Var = new com.tencent.mm.ui.chatting.component.p7(this);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(p7Var, 128L, false);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        sb5.z1 z1Var;
        if (u0()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingServiceNotifyComponent", "onChattingEnterAnimStart");
            if (te5.s1.f418747a.a()) {
                if (this.f199561t == null) {
                    this.f199561t = new com.tencent.mm.ui.chatting.component.uk();
                }
                z1Var = this.f199561t;
            } else {
                z1Var = null;
            }
            if (z1Var != null) {
                yb5.d dVar = this.f198580d;
                com.tencent.mm.ui.chatting.component.uk ukVar = (com.tencent.mm.ui.chatting.component.uk) z1Var;
                ukVar.f200082a = dVar.f460717l.getStringExtra("key_notify_message_real_username");
                ukVar.f200083b = dVar.f460717l.getStringExtra("key_notify_message_title");
            }
            r0();
        }
    }
}

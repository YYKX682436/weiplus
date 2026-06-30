package com.tencent.mm.plugin.notification.base;

/* loaded from: classes15.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.notification.base.k f152443a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.notification.ui.a f152444b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f152445c;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f152446d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f152447e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f152448f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f152449g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f152450h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f152451i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f152452j;

    public j() {
        this.f152443a = null;
        this.f152444b = null;
        this.f152445c = false;
        this.f152446d = null;
        this.f152447e = null;
        this.f152448f = null;
        this.f152449g = null;
        this.f152451i = null;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f152452j = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.UpdateFailedMsgIdEvent>(a0Var) { // from class: com.tencent.mm.plugin.notification.base.AbstractSendMsgFailNotification$1
            {
                this.__eventId = -1487136588;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.UpdateFailedMsgIdEvent updateFailedMsgIdEvent) {
                am.vz vzVar = updateFailedMsgIdEvent.f54916g;
                com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = new com.tencent.mm.plugin.msg.MsgIdTalker(vzVar.f8228a, vzVar.f8230c);
                com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker2 = new com.tencent.mm.plugin.msg.MsgIdTalker(vzVar.f8229b, vzVar.f8231d);
                com.tencent.mm.plugin.notification.base.j jVar = com.tencent.mm.plugin.notification.base.j.this;
                jVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.AbstractSendMsgFailNotification", "updateMsgIdInMsgList, oldMsgId:%s, newMsgId:%s", msgIdTalker.toString(), msgIdTalker2.toString());
                if (!jVar.f152443a.f152453a.contains(msgIdTalker)) {
                    return false;
                }
                com.tencent.mm.plugin.notification.base.k kVar = jVar.f152443a;
                int indexOf = kVar.f152453a.indexOf(msgIdTalker);
                if (indexOf == -1) {
                    return false;
                }
                kVar.f152453a.set(indexOf, msgIdTalker2);
                return false;
            }
        };
        this.f152443a = new com.tencent.mm.plugin.notification.base.k();
        com.tencent.mm.plugin.notification.ui.a aVar = new com.tencent.mm.plugin.notification.ui.a(l());
        this.f152444b = aVar;
        this.f152445c = false;
        this.f152446d = com.tencent.mm.sdk.platformtools.x2.f193071a;
        this.f152447e = new java.util.ArrayList();
        this.f152448f = new java.util.ArrayList();
        this.f152449g = new java.util.ArrayList();
        aVar.f152462e = new com.tencent.mm.plugin.notification.base.c(this);
        aVar.f152463f = new com.tencent.mm.plugin.notification.base.d(this);
        aVar.f152464g = new com.tencent.mm.plugin.notification.base.e(this);
        this.f152451i = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.notification.base.f(this), true);
    }

    public void a() {
        java.lang.String str;
        com.tencent.mm.plugin.notification.base.k kVar = this.f152443a;
        if (kVar == null || kVar.b() == 0) {
            int l17 = l();
            po3.e eVar = null;
            if (l17 == 1) {
                str = po3.f.a() + "/normalMsg";
            } else if (l17 == 2) {
                str = po3.f.a() + "/snsMsg";
            } else {
                str = null;
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FailMsgFileCache", "extractFromDisk error, cannot find filename");
            } else {
                try {
                    java.lang.String M = com.tencent.mm.vfs.w6.M(str);
                    po3.e eVar2 = new po3.e();
                    eVar2.a(M);
                    eVar = eVar2;
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FailMsgFileCache", e17, "", new java.lang.Object[0]);
                    e17.toString();
                }
            }
            if (eVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AbstractSendMsgFailNotification", "resetNotificationAfterCrash, cacheObj is null");
                return;
            }
            if (this.f152451i == null) {
                this.f152451i = new com.tencent.mm.sdk.platformtools.b4(android.os.Looper.getMainLooper(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.plugin.notification.base.f(this), true);
            }
            int i17 = eVar.f357324b;
            java.util.ArrayList arrayList = eVar.f357325c;
            boolean isEmpty = arrayList.isEmpty();
            java.util.ArrayList arrayList2 = this.f152448f;
            java.util.ArrayList arrayList3 = this.f152447e;
            com.tencent.mm.plugin.notification.base.k kVar2 = eVar.f357323a;
            java.util.ArrayList arrayList4 = eVar.f357326d;
            if (isEmpty && arrayList4.isEmpty() && i17 == 0) {
                com.tencent.mm.plugin.notification.base.k kVar3 = this.f152443a;
                kVar3.f152453a.clear();
                kVar3.f152454b = 0;
                this.f152443a = kVar2;
                arrayList3.clear();
                arrayList2.clear();
                x();
                return;
            }
            if (arrayList.size() + arrayList4.size() >= kVar2.b()) {
                u();
                return;
            }
            com.tencent.mm.plugin.notification.base.k kVar4 = this.f152443a;
            kVar4.f152453a.clear();
            kVar4.f152454b = 0;
            this.f152443a = kVar2;
            kVar2.f152454b = i17;
            arrayList3.clear();
            arrayList3.addAll(arrayList);
            arrayList2.clear();
            arrayList2.addAll(arrayList4);
            z();
        }
    }

    public abstract boolean b(java.lang.String str, long j17);

    public java.lang.String c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        for (int i17 = 0; i17 < this.f152443a.b(); i17++) {
            sb6.append(((com.tencent.mm.plugin.msg.MsgIdTalker) this.f152443a.f152453a.get(i17)).toString() + ", ");
        }
        return sb6.toString();
    }

    public void d() {
        java.lang.String str;
        int i17;
        java.lang.String str2;
        com.tencent.mm.plugin.notification.base.k kVar = this.f152443a;
        int i18 = kVar.f152454b;
        java.util.ArrayList arrayList = this.f152447e;
        java.util.ArrayList arrayList2 = this.f152448f;
        new java.util.ArrayList();
        new java.util.ArrayList();
        new java.util.ArrayList();
        int l17 = l();
        if (l17 == 1) {
            str = po3.f.a() + "/normalMsg";
        } else if (l17 == 2) {
            str = po3.f.a() + "/snsMsg";
        } else {
            str = null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FailMsgFileCache", "flushToDisk error, cannot find filename");
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            for (int i19 = 0; i19 < kVar.b(); i19++) {
                com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = (com.tencent.mm.plugin.msg.MsgIdTalker) kVar.f152453a.get(i19);
                jSONArray.put(msgIdTalker.f149480d + "|" + msgIdTalker.a());
            }
            kVar.b();
            jSONObject.put("msg_list", jSONArray);
            jSONObject.put("current_send_index", i18);
            org.json.JSONArray jSONArray2 = new org.json.JSONArray();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker2 = (com.tencent.mm.plugin.msg.MsgIdTalker) it.next();
                jSONArray2.put(msgIdTalker2.f149480d + "|" + msgIdTalker2.a());
            }
            arrayList.size();
            jSONObject.put("success_msg_list", jSONArray2);
            org.json.JSONArray jSONArray3 = new org.json.JSONArray();
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker3 = (com.tencent.mm.plugin.msg.MsgIdTalker) it6.next();
                jSONArray3.put(msgIdTalker3.f149480d + "|" + msgIdTalker3.a());
            }
            arrayList2.size();
            jSONObject.put("fail_msg_list", jSONArray3);
            str2 = jSONObject.toString();
            i17 = 0;
        } catch (org.json.JSONException e17) {
            i17 = 0;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FailMsgFileCache", e17, "", new java.lang.Object[0]);
            str2 = null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        com.tencent.mm.vfs.w6.S(str, str2.getBytes(), i17, str2.length());
    }

    public abstract java.util.ArrayList e(java.lang.Object obj);

    public abstract java.lang.String f(int i17);

    public abstract long g(java.lang.Object obj);

    public abstract com.tencent.mm.plugin.msg.MsgIdTalker h(java.lang.Object obj);

    public abstract java.lang.String i(int i17, int i18, int i19);

    public abstract java.lang.String j(int i17, int i18, int i19);

    public abstract java.lang.String k(int i17, int i18);

    public abstract int l();

    public void m() {
        this.f152443a.b();
        if (this.f152443a.b() > 0) {
            com.tencent.mm.plugin.notification.base.k kVar = this.f152443a;
            kVar.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = kVar.f152453a.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = (com.tencent.mm.plugin.msg.MsgIdTalker) it.next();
                arrayList.add(new com.tencent.mm.plugin.msg.MsgIdTalker(msgIdTalker.f149480d, msgIdTalker.a()));
            }
            n(arrayList);
        }
    }

    public abstract void n(java.util.ArrayList arrayList);

    public void o() {
    }

    public abstract void p();

    public void q(java.lang.Object obj) {
        if (obj == null) {
            return;
        }
        g(obj);
        c();
        if (!this.f152445c) {
            java.util.ArrayList arrayList = this.f152449g;
            if (arrayList.contains(h(obj))) {
                arrayList.remove(h(obj));
                return;
            }
            java.util.ArrayList e17 = e(obj);
            if (e17 == null || e17.size() <= 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AbstractSendMsgFailNotification", "showNotificationAfterSendFail, cannot get history fail msg");
                return;
            }
            w();
            com.tencent.mm.plugin.notification.base.k kVar = this.f152443a;
            kVar.getClass();
            if (!e17.isEmpty()) {
                kVar.f152453a.addAll(e17);
            }
            d();
            com.tencent.mars.xlog.Log.i("MicroMsg.AbstractSendMsgFailNotification", "showNotificationAfterSendFail, msgList.size:%d, msgList:%s", java.lang.Integer.valueOf(this.f152443a.b()), c());
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11426, java.lang.Integer.valueOf(l()));
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.notification.base.g(this), 1000L);
            return;
        }
        com.tencent.mm.plugin.notification.base.k kVar2 = this.f152443a;
        boolean contains = kVar2.f152453a.contains(h(obj));
        java.util.ArrayList arrayList2 = this.f152448f;
        if (contains && !arrayList2.contains(h(obj))) {
            arrayList2.add(h(obj));
        }
        com.tencent.mm.plugin.notification.base.k kVar3 = this.f152443a;
        if (!kVar3.f152453a.contains(h(obj))) {
            com.tencent.mm.plugin.notification.base.k kVar4 = this.f152443a;
            com.tencent.mm.plugin.msg.MsgIdTalker h17 = h(obj);
            kVar4.getClass();
            long j17 = h17.f149480d;
            kVar4.f152453a.size();
            kVar4.f152453a.add(h17);
        }
        z();
        java.util.ArrayList arrayList3 = this.f152447e;
        arrayList3.size();
        arrayList2.size();
        if (arrayList3.size() + arrayList2.size() >= this.f152443a.b()) {
            u();
            return;
        }
        com.tencent.mm.plugin.msg.MsgIdTalker a17 = this.f152443a.a();
        if (a17.f149480d == -1) {
            com.tencent.mars.xlog.Log.e("TAG", "resend error, next msg id is -1");
        } else {
            d();
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.notification.base.h(this, a17), 200L);
        }
    }

    public void r(java.lang.Object obj) {
        g(obj);
        c();
        com.tencent.mm.plugin.notification.base.k kVar = this.f152443a;
        if (kVar.f152453a.contains(h(obj))) {
            com.tencent.mm.plugin.msg.MsgIdTalker h17 = h(obj);
            java.util.ArrayList arrayList = this.f152449g;
            boolean contains = arrayList.contains(h17);
            java.util.ArrayList arrayList2 = this.f152448f;
            if (contains && arrayList2.contains(h17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AbstractSendMsgFailNotification", "receive send msg success event from a timout message, remvoe it from the fail list");
                arrayList.remove(h17);
                arrayList2.remove(h17);
            }
            if (!this.f152445c) {
                com.tencent.mm.plugin.notification.base.k kVar2 = this.f152443a;
                kVar2.f152453a.remove(h(obj));
                int b17 = this.f152443a.b();
                com.tencent.mm.plugin.notification.ui.a aVar = this.f152444b;
                if (b17 != 0) {
                    aVar.e(f(this.f152443a.b()));
                    return;
                }
                aVar.a();
                w();
                po3.f.b(l());
                return;
            }
            java.util.ArrayList arrayList3 = this.f152447e;
            arrayList3.add(h17);
            z();
            arrayList3.size();
            arrayList2.size();
            if (arrayList3.size() + arrayList2.size() >= this.f152443a.b()) {
                u();
                return;
            }
            com.tencent.mm.plugin.msg.MsgIdTalker a17 = this.f152443a.a();
            if (a17.f149480d == -1) {
                com.tencent.mars.xlog.Log.e("TAG", "resend error, next msg id is -1");
                return;
            }
            a17.toString();
            d();
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.notification.base.h(this, a17), 200L);
        }
    }

    public final void s() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < this.f152443a.b(); i17++) {
            com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = (com.tencent.mm.plugin.msg.MsgIdTalker) this.f152443a.f152453a.get(i17);
            if (!b(msgIdTalker.a(), msgIdTalker.f149480d)) {
                arrayList.add(msgIdTalker);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f152443a.f152453a.remove((com.tencent.mm.plugin.msg.MsgIdTalker) it.next());
        }
    }

    public void t() {
        this.f152443a.b();
        this.f152445c = true;
        com.tencent.mm.plugin.notification.ui.a aVar = this.f152444b;
        aVar.getClass();
        aVar.f152459b = new z2.k0(aVar.f152460c, n25.a.b());
        aVar.c();
        aVar.d();
        aVar.f152459b.h(2, true);
        aVar.d();
        aVar.e(k(this.f152443a.b(), 0));
        this.f152443a.f152454b = 0;
        y();
        com.tencent.mm.sdk.event.IListener iListener = this.f152452j;
        iListener.dead();
        iListener.alive();
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.notification.base.h(this, this.f152443a.a()), 200L);
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f152451i;
        if (b4Var != null) {
            b4Var.c(300000L, 300000L);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AbstractSendMsgFailNotification", "startCheckMsgExistTimer error, timer is null");
        }
    }

    public final void u() {
        this.f152445c = false;
        this.f152443a.b();
        java.util.ArrayList arrayList = this.f152448f;
        arrayList.size();
        java.util.ArrayList arrayList2 = this.f152447e;
        arrayList2.size();
        this.f152443a.b();
        arrayList2.size();
        arrayList.size();
        s();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = (com.tencent.mm.plugin.msg.MsgIdTalker) it.next();
            if (!b(msgIdTalker.a(), msgIdTalker.f149480d)) {
                arrayList3.add(msgIdTalker);
            }
        }
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            arrayList2.remove((com.tencent.mm.plugin.msg.MsgIdTalker) it6.next());
        }
        arrayList3.clear();
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker2 = (com.tencent.mm.plugin.msg.MsgIdTalker) it7.next();
            if (!b(msgIdTalker2.a(), msgIdTalker2.f149480d)) {
                arrayList3.add(msgIdTalker2);
            }
        }
        java.util.Iterator it8 = arrayList3.iterator();
        while (it8.hasNext()) {
            arrayList.remove((com.tencent.mm.plugin.msg.MsgIdTalker) it8.next());
        }
        this.f152443a.b();
        arrayList2.size();
        arrayList.size();
        if (arrayList.isEmpty()) {
            po3.f.b(l());
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11425, java.lang.Integer.valueOf(l()), 0, java.lang.Integer.valueOf(arrayList2.size()), java.lang.Integer.valueOf(arrayList.size()));
        com.tencent.mm.plugin.notification.ui.a aVar = this.f152444b;
        aVar.f152459b.h(2, false);
        aVar.d();
        aVar.f152466i = f(this.f152443a.b());
        aVar.e(i(this.f152443a.b(), arrayList2.size(), arrayList.size()));
        aVar.f152470m = false;
        if (!arrayList.isEmpty()) {
            aVar.f152459b = new z2.k0(aVar.f152460c, n25.a.b());
            aVar.b();
            aVar.c();
            aVar.d();
            this.f152443a.f152454b = 0;
            if (!arrayList2.isEmpty()) {
                java.util.Iterator it9 = arrayList2.iterator();
                while (it9.hasNext()) {
                    this.f152443a.f152453a.remove((com.tencent.mm.plugin.msg.MsgIdTalker) it9.next());
                }
            }
            arrayList2.clear();
            arrayList.clear();
            d();
        }
        com.tencent.mm.autogen.events.NotificationSendFailMsgFinishEvent notificationSendFailMsgFinishEvent = new com.tencent.mm.autogen.events.NotificationSendFailMsgFinishEvent();
        notificationSendFailMsgFinishEvent.f54536g.f6842a = l();
        notificationSendFailMsgFinishEvent.e();
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f152451i;
        if (b4Var != null) {
            b4Var.d();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AbstractSendMsgFailNotification", "stopCheckMsgExistTimer error, timer is null");
        }
        y();
        this.f152452j.dead();
        o();
    }

    public abstract void v(java.lang.String str, long j17);

    public final void w() {
        com.tencent.mm.plugin.notification.base.k kVar = this.f152443a;
        kVar.f152453a.clear();
        kVar.f152454b = 0;
        this.f152445c = false;
        this.f152447e.clear();
        this.f152448f.clear();
        y();
    }

    public final void x() {
        po3.p.wi().getClass();
        java.lang.String f17 = f(this.f152443a.b());
        com.tencent.mm.plugin.notification.ui.a aVar = this.f152444b;
        aVar.f152466i = f17;
        aVar.f152459b = new z2.k0(aVar.f152460c, n25.a.b());
        aVar.b();
        aVar.c();
        po3.p.wi().getClass();
        boolean z17 = aVar.f152469l;
        com.tencent.mm.sdk.event.IListener iListener = this.f152452j;
        if (!z17) {
            aVar.f152465h = f(this.f152443a.b());
            aVar.f152459b.h(2, false);
            aVar.d();
            aVar.f152470m = false;
            aVar.d();
            iListener.dead();
            iListener.alive();
            return;
        }
        if (!z17) {
            po3.p.wi().getClass();
            return;
        }
        aVar.f152459b.h(2, false);
        aVar.d();
        aVar.f152470m = false;
        aVar.e(f(this.f152443a.b()));
        iListener.dead();
        iListener.alive();
    }

    public final void y() {
        java.util.ArrayList arrayList = this.f152450h;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.sdk.platformtools.b4) it.next()).d();
        }
        arrayList.clear();
        this.f152449g.clear();
    }

    public final void z() {
        java.lang.String f17 = f(this.f152443a.b());
        com.tencent.mm.plugin.notification.ui.a aVar = this.f152444b;
        aVar.f152466i = f17;
        java.util.ArrayList arrayList = this.f152448f;
        boolean isEmpty = arrayList.isEmpty();
        java.util.ArrayList arrayList2 = this.f152447e;
        if (isEmpty) {
            aVar.e(k(this.f152443a.b(), arrayList2.size() + arrayList.size()));
        } else {
            aVar.e(j(this.f152443a.b(), arrayList2.size() + arrayList.size(), arrayList.size()));
        }
    }
}

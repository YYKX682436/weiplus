package po3;

/* loaded from: classes9.dex */
public class k extends com.tencent.mm.plugin.notification.base.j {
    public static boolean A(java.lang.String str) {
        return !(com.tencent.mm.storage.z3.G4(str) || com.tencent.mm.storage.z3.s4(str)) || com.tencent.mm.storage.z3.H3(str) || com.tencent.mm.storage.z3.J4(str);
    }

    @Override // com.tencent.mm.plugin.notification.base.j
    public boolean b(java.lang.String str, long j17) {
        return pt0.f0.Li(str, j17).getMsgId() != 0;
    }

    @Override // com.tencent.mm.plugin.notification.base.j
    public java.util.ArrayList e(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) obj;
        if (f9Var == null) {
            return null;
        }
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), f9Var, true);
        final com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        final java.lang.String str = com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE;
        if (cj6.Da(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE)) {
            arrayList = new java.util.ArrayList(ot0.c3.l().e("getAllNeedResendMsg", new yz5.a(str) { // from class: com.tencent.mm.storage.g9$$j4
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    return new java.util.ArrayList(ot0.z2.f348822a.s(com.tencent.mm.storage.g9.this.f193989r, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE));
                }
            }, new yz5.a(str) { // from class: com.tencent.mm.storage.g9$$k4
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    com.tencent.mm.storage.g9 g9Var = com.tencent.mm.storage.g9.this;
                    g9Var.getClass();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    android.database.Cursor D = g9Var.f193989r.D(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, null, "createTime>=? AND status=? AND isSend=?", new java.lang.String[]{java.lang.String.valueOf(java.lang.System.currentTimeMillis() - 172800000), java.lang.String.valueOf(5), java.lang.String.valueOf(1)}, null, null, "createTime ASC", 2);
                    while (D.moveToNext()) {
                        com.tencent.mm.storage.f9 f9Var2 = new com.tencent.mm.storage.f9();
                        f9Var2.convertFrom(D);
                        if (((!((f9Var2.F & 32) > 0)) & true) && !com.tencent.mm.storage.z3.G4(f9Var2.Q0()) && !com.tencent.mm.storage.z3.s4(f9Var2.Q0()) && !com.tencent.mm.storage.z3.H3(f9Var2.Q0()) && !com.tencent.mm.storage.z3.J4(f9Var2.Q0())) {
                            arrayList2.add(f9Var2);
                        }
                    }
                    D.close();
                    return new java.util.ArrayList(arrayList2);
                }
            }));
        } else if (cj6.Pb(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE)) {
            arrayList = ot0.z2.f348822a.s(cj6.f193989r, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
        } else {
            arrayList = new java.util.ArrayList();
            android.database.Cursor D = cj6.f193989r.D(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, null, "createTime>=? AND status=? AND isSend=?", new java.lang.String[]{java.lang.String.valueOf(java.lang.System.currentTimeMillis() - 172800000), java.lang.String.valueOf(5), java.lang.String.valueOf(1)}, null, null, "createTime ASC", 2);
            while (D.moveToNext()) {
                com.tencent.mm.storage.f9 f9Var2 = new com.tencent.mm.storage.f9();
                f9Var2.convertFrom(D);
                if (((!((f9Var2.F & 32) > 0)) & true) && !com.tencent.mm.storage.z3.G4(f9Var2.Q0()) && !com.tencent.mm.storage.z3.s4(f9Var2.Q0()) && !com.tencent.mm.storage.z3.H3(f9Var2.Q0()) && !com.tencent.mm.storage.z3.J4(f9Var2.Q0())) {
                    arrayList.add(f9Var2);
                }
            }
            D.close();
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.storage.f9 f9Var3 = (com.tencent.mm.storage.f9) it.next();
            arrayList2.add(new com.tencent.mm.plugin.msg.MsgIdTalker(f9Var3.getMsgId(), f9Var3.Q0()));
        }
        return arrayList2;
    }

    @Override // com.tencent.mm.plugin.notification.base.j
    public java.lang.String f(int i17) {
        return this.f152446d.getString(com.tencent.mm.R.string.hac, java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.plugin.notification.base.j
    public long g(java.lang.Object obj) {
        return ((com.tencent.mm.storage.f9) obj).getMsgId();
    }

    @Override // com.tencent.mm.plugin.notification.base.j
    public com.tencent.mm.plugin.msg.MsgIdTalker h(java.lang.Object obj) {
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) obj;
        return new com.tencent.mm.plugin.msg.MsgIdTalker(f9Var.getMsgId(), f9Var.Q0());
    }

    @Override // com.tencent.mm.plugin.notification.base.j
    public java.lang.String i(int i17, int i18, int i19) {
        android.content.Context context = this.f152446d;
        return i19 <= 0 ? context.getString(com.tencent.mm.R.string.hbi, java.lang.Integer.valueOf(i18)) : context.getString(com.tencent.mm.R.string.hbh, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    @Override // com.tencent.mm.plugin.notification.base.j
    public java.lang.String j(int i17, int i18, int i19) {
        return this.f152446d.getString(com.tencent.mm.R.string.hbl, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19));
    }

    @Override // com.tencent.mm.plugin.notification.base.j
    public java.lang.String k(int i17, int i18) {
        return this.f152446d.getString(com.tencent.mm.R.string.hbk, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.plugin.notification.base.j
    public int l() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.notification.base.j
    public void n(java.util.ArrayList arrayList) {
        gm0.j1.i();
        if (!gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SendNormalMsgFailNotificaiton", "omitAllFailMsgImpl account no initialized");
            return;
        }
        com.tencent.mm.storage.g9 g9Var = (com.tencent.mm.storage.g9) c01.d9.b().u();
        l75.k0 k0Var = g9Var.f193989r;
        long b17 = k0Var.b();
        try {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = (com.tencent.mm.plugin.msg.MsgIdTalker) it.next();
                java.lang.String a17 = msgIdTalker.a();
                long j17 = msgIdTalker.f149480d;
                com.tencent.mm.storage.f9 Li = pt0.f0.Li(a17, j17);
                Li.l1(Li.F | 32);
                msgIdTalker.toString();
                g9Var.lb(j17, Li, true);
            }
        } finally {
            k0Var.w(java.lang.Long.valueOf(b17));
        }
    }

    @Override // com.tencent.mm.plugin.notification.base.j
    public void p() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SendNormalMsgFailNotificaiton", "onNotificationClick, mMsgList.size:%d", java.lang.Integer.valueOf(this.f152443a.b()));
        if (!gm0.j1.b().m()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SendNormalMsgFailNotificaiton", "account not ready.");
            return;
        }
        int b17 = this.f152443a.b();
        android.content.Context context = this.f152446d;
        if (b17 > 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            intent.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
            intent.putExtra("From_fail_notify", true);
            j45.l.u(context, "com.tencent.mm.ui.LauncherUI", intent, null);
            return;
        }
        if (this.f152443a.b() == 1) {
            com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = (com.tencent.mm.plugin.msg.MsgIdTalker) this.f152443a.f152453a.get(0);
            java.lang.String Q0 = pt0.f0.Li(msgIdTalker.a(), msgIdTalker.f149480d).Q0();
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Main_User", Q0);
            intent2.putExtra("From_fail_notify", true);
            intent2.addFlags(67108864);
            intent2.addFlags(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING);
            j45.l.u(context, "com.tencent.mm.ui.LauncherUI", intent2, null);
        }
    }

    @Override // com.tencent.mm.plugin.notification.base.j
    public void v(java.lang.String str, long j17) {
        com.tencent.mm.sdk.platformtools.u3.h(new po3.j(this, j17, pt0.f0.Li(str, j17)));
    }
}

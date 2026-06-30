package hr1;

/* loaded from: classes11.dex */
public final class i extends l75.n0 implements l75.q0, hr1.t {

    /* renamed from: e, reason: collision with root package name */
    public static final hr1.g f283349e = new hr1.g(null);

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f283350f;

    /* renamed from: g, reason: collision with root package name */
    public static final hr1.f f283351g;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f283352d;

    static {
        l75.e0 e0Var = hr1.e.f283344y0;
        f283350f = new java.lang.String[]{l75.n0.getCreateSQLs(hr1.e.f283344y0, "BizFansConversation")};
        f283351g = new hr1.f();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l75.k0 db6) {
        super(db6, hr1.e.f283344y0, "BizFansConversation", dm.e1.D);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = hr1.e.f283344y0;
        this.f283352d = db6;
    }

    public static void y0(hr1.i iVar, java.lang.String selfBiz, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f419870d;
            selfBiz = jr1.j.a(((ox.r) d0Var).Bi(1).c());
        }
        iVar.getClass();
        kotlin.jvm.internal.o.g(selfBiz, "selfBiz");
        com.tencent.mars.xlog.Log.i("BizFans.ConversationStorage", "[clearAllUnreadCount] selfBiz=".concat(selfBiz));
        ((ku5.t0) ku5.t0.f312615d).q(new hr1.h(iVar, selfBiz));
    }

    public final int D0(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
        tk.s[] sVarArr = tk.s.f419870d;
        java.lang.String a17 = jr1.j.a(((ox.r) d0Var).Bi(1).c());
        p75.n0 n0Var = dm.e1.f236517w;
        p75.d UNREADCOUNT = dm.e1.f236520z;
        kotlin.jvm.internal.o.f(UNREADCOUNT, "UNREADCOUNT");
        p75.i0 h17 = n0Var.h(UNREADCOUNT);
        h17.f352657d = dm.e1.f236518x.j(sessionId).c(dm.e1.f236519y.j(a17));
        h17.f352656c = "BizFans.ConversationStorage";
        int m17 = h17.a().m(this.f283352d);
        com.tencent.mars.xlog.Log.i("BizFans.ConversationStorage", "[getUnreadCount] sessionId=" + sessionId + " selfBiz=" + a17 + ' ' + m17);
        return m17;
    }

    public final java.util.List J0(java.lang.String selfBiz, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(selfBiz, "selfBiz");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        p75.i0 i27 = dm.e1.f236517w.i();
        i27.f352657d = dm.e1.f236519y.j(selfBiz).c(dm.e1.C.i(java.lang.Integer.valueOf(i17)));
        i27.f352659f = kz5.c0.i(dm.e1.B.u(), dm.e1.A.u());
        i27.c(i19, i18);
        i27.f352656c = "BizFans.ConversationStorage";
        p75.l0 a17 = i27.a();
        android.database.Cursor B = this.f283352d.B(a17.f352636a, a17.f352637b);
        while (B.moveToNext()) {
            try {
                hr1.e eVar = new hr1.e(f283351g);
                eVar.convertFrom(B);
                eVar.u0();
                linkedList.add(eVar);
            } finally {
            }
        }
        vz5.b.a(B, null);
        com.tencent.mars.xlog.Log.i("BizFans.ConversationStorage", "[queryByGreet] biz=" + selfBiz + " isGreet=" + i17 + " size=" + linkedList.size());
        return linkedList;
    }

    public final void L0(hr1.e eVar) {
        if (eVar == null) {
            return;
        }
        java.lang.String str = eVar.field_talker;
        if (str == null || str.length() == 0) {
            str = eVar.field_sessionId;
        }
        if (kotlin.jvm.internal.o.b(str, "bizfansnofiticationholder@bizfansmsg")) {
            return;
        }
        if (str == null || str.length() == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("BizFans.ConversationStorage", "[updateUnreadByTalker] talker=" + str);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().Mb(str);
    }

    @Override // hr1.t
    public boolean m(java.lang.String sessionId, boolean z17) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        boolean z18 = false;
        if (sessionId.length() == 0) {
            return false;
        }
        hr1.e z07 = z0(sessionId);
        int i17 = z07.field_unReadCount;
        z07.field_unReadCount = 0;
        z07.field_readStatus = 1;
        if (i17 != 0) {
            z18 = update(z07.systemRowid, z07, false);
            doNotify(z07.field_sessionId, 5, z07);
        }
        if (z17) {
            L0(z07);
        }
        com.tencent.mars.xlog.Log.i("BizFans.ConversationStorage", "[clearUnreadCount] ret=" + z18 + ' ' + i17 + " => " + z07.field_unReadCount + " sessionId=" + sessionId);
        return z18;
    }

    @Override // hr1.t
    public hr1.e n(java.lang.String selfBiz) {
        kotlin.jvm.internal.o.g(selfBiz, "selfBiz");
        android.database.Cursor B = this.f283352d.B("SELECT *, rowid FROM BizFansConversation WHERE selfBiz = ? AND isGreetSession = 1 ORDER BY updateTime DESC LIMIT 1", new java.lang.String[]{selfBiz});
        try {
            if (B.moveToFirst()) {
                hr1.e eVar = new hr1.e(f283351g);
                eVar.convertFrom(B);
                eVar.u0();
                vz5.b.a(B, null);
                return eVar;
            }
            vz5.b.a(B, null);
            com.tencent.mars.xlog.Log.i("BizFans.ConversationStorage", "[getLatestGreetConv] biz=" + selfBiz + " found=null");
            return null;
        } finally {
        }
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        java.lang.Object obj = w0Var != null ? w0Var.f316976d : null;
        if (!(obj instanceof hr1.e)) {
            obj = null;
        }
        if (obj != null) {
            hr1.e eVar = (hr1.e) obj;
            if (kotlin.jvm.internal.o.b(eVar.field_sessionId, "bizfansnofiticationholder@bizfansmsg")) {
                return;
            }
            jr1.i iVar = jr1.i.f301360a;
            if (!iVar.a(eVar.field_selfBiz, 0)) {
                com.tencent.mars.xlog.Log.i("BizFans.ConversationStorage", "[onNotifyChange] not self biz，msgBiz=" + eVar.field_selfBiz + ", loginBiz=" + iVar.c(0));
                return;
            }
            if ((w0Var != null ? w0Var.f316976d : null) instanceof hr1.e) {
                int i17 = w0Var.f316974b;
                if (i17 == 1 || i17 == 2 || i17 == 5 || i17 == 6) {
                    rk.e.a(((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).wi(), null, 0, false, 7, null);
                } else {
                    if (i17 != 8) {
                        return;
                    }
                    rk.e.a(((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).wi(), java.lang.Boolean.TRUE, 0, false, 6, null);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008a, code lost:
    
        if (r7.p(r2, r3, "sessionId = ? AND selfBiz = ?", r4) > 0) goto L25;
     */
    @Override // l75.n0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean replace(hr1.e r10, boolean r11) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[replace] "
            r0.<init>(r1)
            r1 = 0
            if (r10 == 0) goto Lf
            java.lang.String r2 = r10.toString()
            goto L10
        Lf:
            r2 = r1
        L10:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "BizFans.ConversationStorage"
            com.tencent.mars.xlog.Log.i(r2, r0)
            r0 = 0
            if (r10 != 0) goto L20
            return r0
        L20:
            android.content.ContentValues r3 = r10.convertTo()
            java.lang.String r4 = r10.field_sessionId
            java.lang.String r5 = "field_sessionId"
            kotlin.jvm.internal.o.f(r4, r5)
            android.os.SystemClock.uptimeMillis()
            java.lang.Class<rm.d0> r5 = rm.d0.class
            i95.m r5 = i95.n0.c(r5)
            rm.d0 r5 = (rm.d0) r5
            tk.s[] r6 = tk.s.f419870d
            ox.r r5 = (ox.r) r5
            r6 = 1
            com.tencent.wechat.iam.biz.z0 r5 = r5.Bi(r6)
            java.lang.String r5 = r5.c()
            java.lang.String r5 = jr1.j.a(r5)
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            java.lang.String r5 = "select *, rowid from BizFansConversation where sessionId = ? AND selfBiz = ?"
            l75.k0 r7 = r9.f283352d
            android.database.Cursor r4 = r7.B(r5, r4)
            int r5 = r4.getCount()     // Catch: java.lang.Throwable -> Le4
            if (r5 <= 0) goto L5c
            r5 = r6
            goto L5d
        L5c:
            r5 = r0
        L5d:
            vz5.b.a(r4, r1)
            java.lang.String r1 = ""
            if (r5 == 0) goto L8d
            java.lang.String r2 = r9.getTableName()
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            java.lang.String r8 = r10.field_sessionId
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            r4[r0] = r5
            java.lang.String r5 = r10.field_selfBiz
            if (r5 != 0) goto L80
            goto L81
        L80:
            r1 = r5
        L81:
            r4[r6] = r1
            java.lang.String r1 = "sessionId = ? AND selfBiz = ?"
            int r1 = r7.p(r2, r3, r1, r4)
            if (r1 <= 0) goto Lda
            goto L93
        L8d:
            boolean r4 = super.insertNotify(r10, r0)
            if (r4 == 0) goto L95
        L93:
            r0 = r6
            goto Lda
        L95:
            java.lang.String r4 = r9.getTableName()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            java.lang.String r1 = r10.field_sessionId
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.lang.String r5 = "sessionId = ?"
            int r1 = r7.p(r4, r3, r5, r1)
            if (r1 <= 0) goto Lb5
            r0 = r6
        Lb5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "[replace] insert failed, fallback update by sessionId, ret="
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r3 = " sessionId="
            r1.append(r3)
            java.lang.String r3 = r10.field_sessionId
            r1.append(r3)
            java.lang.String r3 = " selfBiz="
            r1.append(r3)
            java.lang.String r3 = r10.field_selfBiz
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r2, r1)
        Lda:
            if (r0 == 0) goto Le3
            if (r11 == 0) goto Le3
            java.lang.String r11 = r10.field_sessionId
            r9.doNotify(r11, r6, r10)
        Le3:
            return r0
        Le4:
            r10 = move-exception
            throw r10     // Catch: java.lang.Throwable -> Le6
        Le6:
            r11 = move-exception
            vz5.b.a(r4, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: hr1.i.replace(hr1.e, boolean):boolean");
    }

    @Override // hr1.t
    public int y(java.lang.String selfBiz) {
        kotlin.jvm.internal.o.g(selfBiz, "selfBiz");
        android.database.Cursor B = this.f283352d.B("SELECT SUM(unReadCount) FROM BizFansConversation WHERE selfBiz = ? AND isGreetSession = 1", new java.lang.String[]{selfBiz});
        try {
            int i17 = B.moveToFirst() ? B.getInt(0) : 0;
            vz5.b.a(B, null);
            com.tencent.mars.xlog.Log.i("BizFans.ConversationStorage", "[getGreetUnreadCount] biz=" + selfBiz + " count=" + i17);
            return i17;
        } finally {
        }
    }

    public hr1.e z0(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        android.os.SystemClock.uptimeMillis();
        rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
        tk.s[] sVarArr = tk.s.f419870d;
        android.database.Cursor B = this.f283352d.B("select *, rowid from BizFansConversation where sessionId = ? AND selfBiz = ?", new java.lang.String[]{sessionId, jr1.j.a(((ox.r) d0Var).Bi(1).c())});
        hr1.e eVar = new hr1.e(f283351g);
        eVar.field_sessionId = sessionId;
        if (B != null) {
            try {
                if (B.moveToFirst()) {
                    eVar.convertFrom(B);
                }
                vz5.b.a(B, null);
            } finally {
            }
        }
        return eVar;
    }
}

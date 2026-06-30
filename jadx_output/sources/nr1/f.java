package nr1;

/* loaded from: classes11.dex */
public final class f extends l75.n0 implements l75.q0, hr1.t {

    /* renamed from: e, reason: collision with root package name */
    public static final nr1.d f339140e = new nr1.d(null);

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f339141f;

    /* renamed from: g, reason: collision with root package name */
    public static final p75.n0 f339142g;

    /* renamed from: h, reason: collision with root package name */
    public static final p75.d f339143h;

    /* renamed from: i, reason: collision with root package name */
    public static final p75.d f339144i;

    /* renamed from: m, reason: collision with root package name */
    public static final p75.d f339145m;

    /* renamed from: n, reason: collision with root package name */
    public static final p75.d f339146n;

    /* renamed from: o, reason: collision with root package name */
    public static final nr1.c f339147o;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f339148d;

    static {
        l75.e0 e0Var = hr1.e.f283344y0;
        f339141f = new java.lang.String[]{l75.n0.getCreateSQLs(hr1.e.f283344y0, "BizPhotoFansConversation")};
        f339142g = new p75.n0("BizPhotoFansConversation");
        f339143h = new p75.d("selfBiz", "string", "BizPhotoFansConversation", "");
        f339144i = new p75.d(dm.i4.COL_UPDATETIME, "long", "BizPhotoFansConversation", "");
        f339145m = new p75.d("placedFlag", "long", "BizPhotoFansConversation", "");
        f339146n = new p75.d("isGreetSession", "int", "BizPhotoFansConversation", "");
        f339147o = new nr1.c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l75.k0 db6) {
        super(db6, hr1.e.f283344y0, "BizPhotoFansConversation", dm.e1.D);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = hr1.e.f283344y0;
        this.f339148d = db6;
    }

    public final int D0(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
        tk.s[] sVarArr = tk.s.f419870d;
        java.lang.String c17 = jr1.j.c(((ox.r) d0Var).Bi(2).c());
        android.database.Cursor B = this.f339148d.B("SELECT unReadCount \nFROM BizPhotoFansConversation \nWHERE sessionId = ?\nAND selfBiz = ?", new java.lang.String[]{sessionId, c17});
        if (B != null) {
            try {
                r2 = B.moveToFirst() ? B.getInt(0) : 0;
                vz5.b.a(B, null);
            } finally {
            }
        }
        com.tencent.mars.xlog.Log.i("BizPhotoFans.ConversationStorage", "[getUnreadCount] sessionId=" + sessionId + " selfBiz=" + c17 + " count=" + r2);
        return r2;
    }

    public final java.util.List J0(java.lang.String selfBiz, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(selfBiz, "selfBiz");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        p75.i0 i27 = f339142g.i();
        i27.f352657d = f339143h.j(selfBiz).c(f339146n.i(java.lang.Integer.valueOf(i17)));
        i27.f352659f = kz5.c0.i(f339145m.u(), f339144i.u());
        i27.c(i19, i18);
        i27.f352656c = "BizPhotoFans.ConversationStorage";
        p75.l0 a17 = i27.a();
        android.database.Cursor B = this.f339148d.B(a17.f352636a, a17.f352637b);
        while (B.moveToNext()) {
            try {
                hr1.e eVar = new hr1.e(f339147o);
                eVar.convertFrom(B);
                eVar.u0();
                linkedList.add(eVar);
            } finally {
            }
        }
        vz5.b.a(B, null);
        com.tencent.mars.xlog.Log.i("BizPhotoFans.ConversationStorage", "[queryByGreet] biz=" + selfBiz + " isGreet=" + i17 + " size=" + linkedList.size());
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
        if (kotlin.jvm.internal.o.b(str, "bizphotofansnofiticationholder@picfansmsg")) {
            return;
        }
        if (str == null || str.length() == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.i("BizPhotoFans.ConversationStorage", "[updateUnreadByTalker] talker=" + str);
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
        com.tencent.mars.xlog.Log.i("BizPhotoFans.ConversationStorage", "[clearUnreadCount] ret=" + z18 + ' ' + i17 + " => " + z07.field_unReadCount + " sessionId=" + sessionId);
        return z18;
    }

    @Override // hr1.t
    public hr1.e n(java.lang.String selfBiz) {
        kotlin.jvm.internal.o.g(selfBiz, "selfBiz");
        android.database.Cursor B = this.f339148d.B("SELECT *, rowid FROM BizPhotoFansConversation WHERE selfBiz = ? AND isGreetSession = 1 ORDER BY updateTime DESC LIMIT 1", new java.lang.String[]{selfBiz});
        try {
            if (B.moveToFirst()) {
                hr1.e eVar = new hr1.e(f339147o);
                eVar.convertFrom(B);
                eVar.u0();
                vz5.b.a(B, null);
                return eVar;
            }
            vz5.b.a(B, null);
            com.tencent.mars.xlog.Log.i("BizPhotoFans.ConversationStorage", "[getLatestGreetConv] biz=" + selfBiz + " found=null");
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
            if (kotlin.jvm.internal.o.b(eVar.field_sessionId, "bizphotofansnofiticationholder@picfansmsg")) {
                return;
            }
            jr1.i iVar = jr1.i.f301360a;
            if (!iVar.a(eVar.field_selfBiz, 5)) {
                com.tencent.mars.xlog.Log.i("BizPhotoFans.ConversationStorage", "[onNotifyChange] msgBiz=" + eVar.field_selfBiz + ", loginBiz=" + iVar.c(5));
                return;
            }
            if ((w0Var != null ? w0Var.f316976d : null) instanceof hr1.e) {
                int i17 = w0Var.f316974b;
                if (i17 == 1 || i17 == 2) {
                    rk.e.a(((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).wi(), null, 5, true, 1, null);
                    return;
                }
                if (i17 == 5 || i17 == 6) {
                    rk.e.a(((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).wi(), null, 5, false, 5, null);
                } else {
                    if (i17 != 8) {
                        return;
                    }
                    rk.e.a(((gr1.n) ((rk.g) i95.n0.c(rk.g.class))).wi(), java.lang.Boolean.TRUE, 5, false, 4, null);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008a, code lost:
    
        if (r7.p(r2, r3, "sessionId = ? AND selfBiz = ?", r4) > 0) goto L26;
     */
    @Override // l75.n0
    /* renamed from: v */
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
            java.lang.String r2 = "BizPhotoFans.ConversationStorage"
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
            r6 = 2
            com.tencent.wechat.iam.biz.z0 r5 = r5.Bi(r6)
            java.lang.String r5 = r5.c()
            java.lang.String r5 = jr1.j.c(r5)
            java.lang.String[] r4 = new java.lang.String[]{r4, r5}
            java.lang.String r5 = "select *, rowid from BizPhotoFansConversation where sessionId = ? AND selfBiz = ?"
            l75.k0 r7 = r9.f339148d
            android.database.Cursor r4 = r7.B(r5, r4)
            int r5 = r4.getCount()     // Catch: java.lang.Throwable -> Le4
            r8 = 1
            if (r5 <= 0) goto L5d
            r5 = r8
            goto L5e
        L5d:
            r5 = r0
        L5e:
            vz5.b.a(r4, r1)
            java.lang.String r1 = ""
            if (r5 == 0) goto L8d
            java.lang.String r2 = r9.getTableName()
            java.lang.String[] r4 = new java.lang.String[r6]
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r1)
            java.lang.String r6 = r10.field_sessionId
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4[r0] = r5
            java.lang.String r5 = r10.field_selfBiz
            if (r5 != 0) goto L80
            goto L81
        L80:
            r1 = r5
        L81:
            r4[r8] = r1
            java.lang.String r1 = "sessionId = ? AND selfBiz = ?"
            int r1 = r7.p(r2, r3, r1, r4)
            if (r1 <= 0) goto Lda
            goto L93
        L8d:
            boolean r4 = super.insertNotify(r10, r0)
            if (r4 == 0) goto L95
        L93:
            r0 = r8
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
            r0 = r8
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
            r9.doNotify(r11, r8, r10)
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
        throw new UnsupportedOperationException("Method not decompiled: nr1.f.replace(hr1.e, boolean):boolean");
    }

    @Override // hr1.t
    public int y(java.lang.String selfBiz) {
        kotlin.jvm.internal.o.g(selfBiz, "selfBiz");
        android.database.Cursor B = this.f339148d.B("SELECT SUM(unReadCount) FROM BizPhotoFansConversation WHERE selfBiz = ? AND isGreetSession = 1", new java.lang.String[]{selfBiz});
        try {
            int i17 = B.moveToFirst() ? B.getInt(0) : 0;
            vz5.b.a(B, null);
            com.tencent.mars.xlog.Log.i("BizPhotoFans.ConversationStorage", "[getGreetUnreadCount] biz=" + selfBiz + " count=" + i17);
            return i17;
        } finally {
        }
    }

    public final void y0(java.lang.String selfBiz) {
        kotlin.jvm.internal.o.g(selfBiz, "selfBiz");
        com.tencent.mars.xlog.Log.i("BizPhotoFans.ConversationStorage", "[clearAllUnreadCount] selfBiz=".concat(selfBiz));
        ((ku5.t0) ku5.t0.f312615d).q(new nr1.e(this, selfBiz));
    }

    public hr1.e z0(java.lang.String sessionId) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
        tk.s[] sVarArr = tk.s.f419870d;
        android.database.Cursor B = this.f339148d.B("select *, rowid from BizPhotoFansConversation where sessionId = ? AND selfBiz = ?", new java.lang.String[]{sessionId, jr1.j.c(((ox.r) d0Var).Bi(2).c())});
        hr1.e eVar = new hr1.e(f339147o);
        eVar.field_sessionId = sessionId;
        if (B != null) {
            try {
                if (B.moveToFirst()) {
                    eVar.convertFrom(B);
                    eVar.u0();
                }
                vz5.b.a(B, null);
            } finally {
            }
        }
        return eVar;
    }
}

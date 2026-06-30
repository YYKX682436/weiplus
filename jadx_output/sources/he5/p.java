package he5;

/* loaded from: classes9.dex */
public final class p implements he5.t {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f280968a;

    /* renamed from: b, reason: collision with root package name */
    public final int f280969b;

    /* renamed from: c, reason: collision with root package name */
    public final int f280970c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f280971d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f280972e;

    /* renamed from: f, reason: collision with root package name */
    public android.database.Cursor f280973f;

    /* renamed from: g, reason: collision with root package name */
    public final long f280974g;

    public p(java.lang.String talker, int i17, int i18, java.lang.String templateId, boolean z17) {
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(templateId, "templateId");
        this.f280968a = talker;
        this.f280969b = i17;
        this.f280970c = i18;
        this.f280971d = templateId;
        this.f280972e = z17;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f280974g = java.lang.System.currentTimeMillis() - 31536000000L;
    }

    @Override // he5.t
    public int a() {
        return this.f280970c;
    }

    @Override // he5.t
    public void b(java.util.List list, he5.s success) {
        kotlin.jvm.internal.o.g(success, "success");
        android.database.Cursor cursor = this.f280973f;
        if (cursor == null) {
            kotlin.jvm.internal.o.o("cursor");
            throw null;
        }
        try {
            if (cursor == null) {
                kotlin.jvm.internal.o.o("cursor");
                throw null;
            }
            cursor.moveToFirst();
            while (true) {
                android.database.Cursor cursor2 = this.f280973f;
                if (cursor2 == null) {
                    kotlin.jvm.internal.o.o("cursor");
                    throw null;
                }
                if (cursor2.isAfterLast()) {
                    vz5.b.a(cursor, null);
                    ((hd5.f) success).a();
                    return;
                }
                com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                android.database.Cursor cursor3 = this.f280973f;
                if (cursor3 == null) {
                    kotlin.jvm.internal.o.o("cursor");
                    throw null;
                }
                f9Var.convertFrom(cursor3);
                if (e(f9Var) && list != null) {
                    list.add(f9Var);
                }
                android.database.Cursor cursor4 = this.f280973f;
                if (cursor4 == null) {
                    kotlin.jvm.internal.o.o("cursor");
                    throw null;
                }
                cursor4.moveToNext();
            }
        } finally {
        }
    }

    @Override // he5.t
    public void c(hd5.o oVar) {
        xg3.m0 u17 = c01.d9.b().u();
        android.database.Cursor M4 = ((com.tencent.mm.storage.g9) u17).M4(this.f280968a, this.f280969b, this.f280974g);
        kotlin.jvm.internal.o.f(M4, "getInitCursor(...)");
        this.f280973f = M4;
        if (oVar != null) {
            oVar.next();
        }
    }

    @Override // he5.t
    public void close() {
        android.database.Cursor cursor = this.f280973f;
        if (cursor != null) {
            cursor.close();
        } else {
            kotlin.jvm.internal.o.o("cursor");
            throw null;
        }
    }

    @Override // he5.t
    public long d() {
        return 0L;
    }

    public final boolean e(com.tencent.mm.storage.f9 f9Var) {
        java.util.Map d17;
        int i17;
        if (!f9Var.a3()) {
            return false;
        }
        ot0.q v17 = ot0.q.v(f9Var.j());
        if (kotlin.jvm.internal.o.b(v17 != null ? v17.H0 : null, this.f280971d)) {
            return true;
        }
        if (this.f280972e && (d17 = com.tencent.mm.sdk.platformtools.aa.d(f9Var.j(), "msg", null)) != null && d17.size() != 0) {
            java.lang.String str = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.new_tmpl_type");
            if (str == null) {
                str = "-1";
            }
            try {
                i17 = java.lang.Integer.parseInt(str);
            } catch (java.lang.NumberFormatException unused) {
                i17 = -1;
            }
            if (com.tencent.mm.sdk.platformtools.t8.o1(java.lang.Integer.valueOf(i17), -1) == 7) {
                return true;
            }
            java.lang.String str2 = (java.lang.String) d17.get(".msg.appmsg.mmreader.template_detail.template_ext.voip_call_info.im_room_id");
            if (str2 == null) {
                str2 = "";
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                return true;
            }
        }
        return false;
    }
}

package v61;

/* loaded from: classes5.dex */
public final class v0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f433483d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v61.w0 f433484e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(java.lang.String str, v61.w0 w0Var) {
        super(0);
        this.f433483d = str;
        this.f433484e = w0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.database.Cursor B;
        final com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
        final java.lang.String str = this.f433483d;
        final java.lang.String str2 = "unavailable_account_tip";
        final java.lang.String X8 = cj6.X8(str);
        if (cj6.Da(X8)) {
            final int i17 = 570425393;
            final int i18 = 570425393;
            B = ot0.c3.l().c("getCursorByFilter", new yz5.a() { // from class: com.tencent.mm.storage.g9$$w5
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    return ot0.z2.f348822a.Q(com.tencent.mm.storage.g9.this.f193989r, X8, str, str2, i17);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$x5
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    com.tencent.mm.storage.g9 g9Var = com.tencent.mm.storage.g9.this;
                    g9Var.getClass();
                    return g9Var.f193989r.B(("SELECT * FROM " + X8 + " WHERE" + g9Var.Z8(str) + "AND content LIKE '%" + str2 + "%' AND type = " + i18) + " ORDER BY createTime DESC", null);
                }
            });
        } else if (cj6.Pb(X8)) {
            B = ot0.z2.f348822a.Q(cj6.f193989r, X8, str, "unavailable_account_tip", 570425393);
        } else {
            B = cj6.f193989r.B(("SELECT * FROM " + X8 + " WHERE" + cj6.Z8(str) + "AND content LIKE '%unavailable_account_tip%' AND type = 570425393") + " ORDER BY createTime DESC", null);
        }
        if (B != null) {
            java.lang.String str3 = this.f433483d;
            v61.w0 w0Var = this.f433484e;
            try {
                if (!B.moveToFirst()) {
                    com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
                    f9Var.j1(2);
                    f9Var.u1(str3);
                    f9Var.r1(4);
                    f9Var.d1(w0Var.wi());
                    f9Var.o1(0L);
                    f9Var.e1(c01.w9.m(str3, c01.id.c() / 1000));
                    f9Var.setType(570425393);
                    com.tencent.mars.xlog.Log.i("MicroMsg.UnAvailableAccountService", "checkOrInsertUnAvailableSysMsg msgId:" + c01.w9.x(f9Var));
                }
                vz5.b.a(B, null);
            } finally {
            }
        }
        return jz5.f0.f302826a;
    }
}

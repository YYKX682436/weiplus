package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class uo implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f200094d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.vo f200095e;

    public uo(com.tencent.mm.ui.chatting.component.vo voVar, long j17) {
        this.f200095e = voVar;
        this.f200094d = j17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18;
        com.tencent.mm.storage.f9 h27 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).h2(((com.tencent.mm.booter.notification.x) c01.d9.f()).f63516b, this.f200094d);
        if (h27 != null && h27.getMsgId() > 0) {
            com.tencent.mm.ui.chatting.component.vo voVar = this.f200095e;
            int M0 = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) voVar.f200143a.f198580d.f460708c.a(sb5.z.class))).M0();
            int count = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) voVar.f200143a.f198580d.f460708c.a(sb5.z.class))).getCount();
            xg3.m0 u17 = c01.d9.b().u();
            final java.lang.String str = ((com.tencent.mm.booter.notification.x) c01.d9.f()).f63516b;
            final long j17 = this.f200094d;
            final int i19 = M0 - count;
            final com.tencent.mm.storage.g9 g9Var = (com.tencent.mm.storage.g9) u17;
            final java.lang.String X8 = g9Var.X8(str);
            if (g9Var.Da(X8)) {
                i18 = ot0.c3.l().d("getPositionByCreateTime", new yz5.a() { // from class: com.tencent.mm.storage.g9$$a0
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        return java.lang.Integer.valueOf(ot0.z2.f348822a.i1(com.tencent.mm.storage.g9.this.f193989r, X8, str, j17, i19));
                    }
                }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$b0
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        com.tencent.mm.storage.g9 g9Var2 = com.tencent.mm.storage.g9.this;
                        g9Var2.getClass();
                        android.database.Cursor B = g9Var2.f193989r.B("SELECT * FROM " + X8 + " WHERE" + g9Var2.Z8(str) + "AND createTime < " + j17 + " ORDER BY createTime ASC LIMIT -1 OFFSET " + i19, null);
                        int count2 = B.getCount();
                        B.close();
                        return java.lang.Integer.valueOf(count2);
                    }
                });
            } else if (g9Var.Pb(X8)) {
                i18 = ot0.z2.f348822a.i1(g9Var.f193989r, X8, str, j17, i19);
            } else {
                android.database.Cursor B = g9Var.f193989r.B("SELECT * FROM " + X8 + " WHERE" + g9Var.Z8(str) + "AND createTime < " + j17 + " ORDER BY createTime ASC LIMIT -1 OFFSET " + i19, null);
                int count2 = B.getCount();
                B.close();
                i18 = count2;
            }
            if (i18 >= 0 && count > i18) {
                voVar.f200143a.f198580d.T(i18, false, false, 0);
            }
        }
    }
}

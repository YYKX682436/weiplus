package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public class d7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198926d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f198927e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f198928f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f198929g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.f7 f198930h;

    public d7(com.tencent.mm.ui.chatting.component.f7 f7Var, java.lang.String str, int i17, int i18, int i19, int i27) {
        this.f198930h = f7Var;
        this.f198926d = str;
        this.f198927e = i17;
        this.f198928f = i19;
        this.f198929g = i27;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        long j18;
        java.lang.Class cls;
        int i17;
        java.lang.String str;
        android.database.Cursor B;
        int i18;
        java.lang.String str2 = this.f198926d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        int wi6 = ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str2);
        xg3.m0 u17 = c01.d9.b().u();
        final java.lang.String str3 = this.f198926d;
        com.tencent.mm.ui.chatting.component.f7 f7Var = this.f198930h;
        long j19 = f7Var.f199025r;
        long j27 = f7Var.f199026s;
        final com.tencent.mm.storage.g9 g9Var = (com.tencent.mm.storage.g9) u17;
        g9Var.getClass();
        if (j27 < j19) {
            j18 = j19;
            j17 = j27;
        } else {
            j17 = j19;
            j18 = j27;
        }
        final java.lang.String X8 = g9Var.X8(str3);
        if (g9Var.Da(X8)) {
            cls = qy.i.class;
            i17 = wi6;
            str = null;
            final long j28 = j18;
            final long j29 = j17;
            final long j37 = j17;
            B = ot0.c3.l().c("getCursorInTimeLimit", new yz5.a() { // from class: com.tencent.mm.storage.g9$$i7
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    return ot0.z2.f348822a.S(com.tencent.mm.storage.g9.this.f193989r, X8, str3, j29, j28);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$j7
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    com.tencent.mm.storage.g9 g9Var2 = com.tencent.mm.storage.g9.this;
                    g9Var2.getClass();
                    return g9Var2.f193989r.B("SELECT * FROM " + X8 + " WHERE" + g9Var2.Z8(str3) + "AND createTime >= " + j37 + " AND createTime <= " + j28, null);
                }
            });
        } else {
            cls = qy.i.class;
            i17 = wi6;
            str = null;
            long j38 = j18;
            long j39 = j17;
            if (g9Var.Pb(X8)) {
                B = ot0.z2.f348822a.S(g9Var.f193989r, X8, str3, j39, j38);
            } else {
                B = g9Var.f193989r.B("SELECT * FROM " + X8 + " WHERE" + g9Var.Z8(str3) + "AND createTime >= " + j39 + " AND createTime <= " + j38, null);
            }
        }
        int i19 = 0;
        if (B == null || !B.moveToFirst()) {
            i18 = 0;
        } else {
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            int i27 = 0;
            do {
                f9Var.convertFrom(B);
                if (f9Var.A0() == 1) {
                    i27++;
                } else {
                    i19++;
                }
            } while (B.moveToNext());
            i18 = i19;
            i19 = i27;
        }
        if (B != null) {
            B.close();
        }
        long j47 = f7Var.f199026s;
        long j48 = f7Var.f199025r;
        int i28 = f7Var.f199027t;
        int i29 = f7Var.f199027t;
        f7Var.f198580d.r();
        int i37 = f7Var.f199029v;
        java.lang.String str4 = f7Var.f199030w;
        com.tencent.mm.autogen.mmdata.rpt.MuteRoomStayTimeStruct muteRoomStayTimeStruct = new com.tencent.mm.autogen.mmdata.rpt.MuteRoomStayTimeStruct();
        muteRoomStayTimeStruct.f59435d = muteRoomStayTimeStruct.b("ChatRoomID", str2, true);
        muteRoomStayTimeStruct.f59436e = f7Var.f199026s - f7Var.f199025r;
        muteRoomStayTimeStruct.f59437f = i17;
        int i38 = f7Var.f199027t;
        muteRoomStayTimeStruct.f59438g = i18 + i38;
        muteRoomStayTimeStruct.f59439h = i19;
        muteRoomStayTimeStruct.f59440i = i38;
        muteRoomStayTimeStruct.f59441j = this.f198927e;
        muteRoomStayTimeStruct.f59442k = this.f198929g;
        muteRoomStayTimeStruct.f59443l = muteRoomStayTimeStruct.b("SessionId", f7Var.f198580d.r(), true);
        muteRoomStayTimeStruct.f59444m = f7Var.f199016f;
        muteRoomStayTimeStruct.f59445n = this.f198928f;
        muteRoomStayTimeStruct.f59446o = f7Var.f199029v;
        ((py.a) ((qy.i) i95.n0.c(cls))).getClass();
        muteRoomStayTimeStruct.f59447p = c01.v1.y(str2) ? 1L : 0L;
        java.lang.String str5 = f7Var.f199030w;
        muteRoomStayTimeStruct.f59449r = muteRoomStayTimeStruct.b("RedWord", str5 != null ? str5.replace(",", ";") : str, true);
        muteRoomStayTimeStruct.k();
    }
}

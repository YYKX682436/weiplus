package mm2;

/* loaded from: classes3.dex */
public final class e1 extends mm2.e {
    public boolean A;
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData B;
    public com.tencent.mm.protobuf.g C;
    public java.lang.String D;
    public final kotlinx.coroutines.flow.j2 E;
    public final kotlinx.coroutines.flow.j2 F;
    public java.util.LinkedList G;
    public long H;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f328979f;

    /* renamed from: g, reason: collision with root package name */
    public r45.v74 f328980g;

    /* renamed from: h, reason: collision with root package name */
    public long f328981h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Integer f328982i;

    /* renamed from: m, reason: collision with root package name */
    public long f328983m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f328984n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f328985o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData f328986p;

    /* renamed from: q, reason: collision with root package name */
    public r45.ma4 f328987q;

    /* renamed from: r, reason: collision with root package name */
    public r45.nw1 f328988r;

    /* renamed from: s, reason: collision with root package name */
    public r45.q12 f328989s;

    /* renamed from: t, reason: collision with root package name */
    public kn0.i f328990t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObjectDesc f328991u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f328992v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f328993w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f328994x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f328995y;

    /* renamed from: z, reason: collision with root package name */
    public r45.oa4 f328996z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f328979f = "LiveCoreSlice@" + hashCode();
        this.f328986p = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.f328987q = new r45.ma4();
        r45.nw1 nw1Var = new r45.nw1();
        nw1Var.set(2, 1);
        this.f328988r = nw1Var;
        this.f328992v = "";
        this.f328993w = "";
        this.f328994x = "";
        this.f328995y = "";
        this.B = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.D = "";
        this.E = kotlinx.coroutines.flow.i3.a(r45.aa0.CREATELIVEPAGEMODE_DEFAULT_MODE);
        this.F = kotlinx.coroutines.flow.i3.a(java.lang.Boolean.FALSE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x01f5, code lost:
    
        if (r7.getInteger(6) == 0) goto L98;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[LOOP:0: B:35:0x011a->B:113:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0156 A[EDGE_INSN: B:50:0x0156->B:51:0x0156 BREAK  A[LOOP:0: B:35:0x011a->B:113:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0203  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N6() {
        /*
            Method dump skipped, instructions count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.e1.N6():void");
    }

    public final kotlinx.coroutines.flow.j2 O6() {
        return this.E;
    }

    public final byte[] P6() {
        return this.f328985o;
    }

    public final r45.nw1 Q6() {
        return this.f328988r;
    }

    public final int R6() {
        r45.q12 q12Var = this.f328989s;
        if (q12Var != null) {
            return q12Var.getInteger(0);
        }
        return 0;
    }

    public final r45.q12 S6() {
        return this.f328989s;
    }

    public final r45.ma4 T6() {
        return this.f328987q;
    }

    public final int U6() {
        r45.q12 q12Var = this.f328989s;
        if (q12Var != null) {
            return q12Var.getInteger(1);
        }
        return 0;
    }

    public final java.lang.String V6() {
        return this.f328992v;
    }

    public final long W6() {
        return this.f328983m;
    }

    public final java.lang.String X6() {
        return "objectId:" + pm0.v.u(this.f328983m) + " nicknameOption:" + this.f328994x + " liveInfo:" + this.f328988r.getLong(0) + ' ' + this.f328988r.getLong(19);
    }

    public final boolean Y6() {
        return ((kotlinx.coroutines.flow.h3) this.E).getValue() == r45.aa0.CREATELIVEPAGEMODE_CHAT_INTERACTION_MODE;
    }

    public final boolean Z6() {
        if (!g7()) {
            return false;
        }
        r45.q12 q12Var = this.f328989s;
        return q12Var != null && q12Var.getInteger(1) == 16;
    }

    public final boolean a7() {
        return ((mm2.c1) business(mm2.c1.class)).f328778a5;
    }

    public final boolean b7() {
        if (!g7()) {
            return false;
        }
        r45.q12 q12Var = this.f328989s;
        return q12Var != null && q12Var.getInteger(1) == 8;
    }

    public final boolean c7() {
        if (!g7()) {
            return false;
        }
        r45.q12 q12Var = this.f328989s;
        return q12Var != null && q12Var.getInteger(1) == 2;
    }

    public final boolean d7() {
        r45.q12 q12Var = this.f328989s;
        return q12Var != null && q12Var.getInteger(0) == 1;
    }

    public final boolean e7() {
        return g7();
    }

    public final boolean f7() {
        return this.f328988r.getInteger(12) == 1 && this.f328988r.getInteger(75) == 6;
    }

    public final boolean g7() {
        r45.q12 q12Var = this.f328989s;
        return q12Var != null && q12Var.getInteger(0) == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h7(r45.ma4 r10, r45.nw1 r11, com.tencent.mm.protobuf.g r12) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.e1.h7(r45.ma4, r45.nw1, com.tencent.mm.protobuf.g):void");
    }

    public final void i7(long j17) {
        this.H = j17;
    }

    public final void k7(com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc) {
        this.f328991u = finderObjectDesc;
    }

    public final void l7(byte[] bArr) {
        java.lang.Boolean bool;
        this.f328985o = bArr;
        com.tencent.mars.xlog.Log.i(this.f328979f, "liveCookies has change");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cookie is Empty: ");
        if (bArr != null) {
            bool = java.lang.Boolean.valueOf(bArr.length == 0);
        } else {
            bool = null;
        }
        sb6.append(bool);
        sb6.append(", ");
        sb6.append(bArr != null ? bArr.hashCode() : 0);
        sb6.append(" , ");
        sb6.append(this);
        com.tencent.mars.xlog.Log.i("ken_debug", sb6.toString());
        com.tencent.mm.sdk.platformtools.Log.c("ken_debug", "", new java.lang.Object[0]);
    }

    public final void m7(r45.nw1 value) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.protobuf.g byteString;
        kotlin.jvm.internal.o.g(value, "value");
        this.f328988r = value;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#liveInfo set (");
        sb6.append(value.hashCode());
        sb6.append(")liveId:");
        sb6.append(value.getLong(0));
        sb6.append(", liveStatus:");
        sb6.append(value.getInteger(2));
        sb6.append(" live_flag=");
        sb6.append(value.getInteger(37));
        sb6.append(" purchase_info.charge_flag=");
        r45.o52 o52Var = (r45.o52) value.getCustom(28);
        sb6.append(o52Var != null ? java.lang.Integer.valueOf(o52Var.getInteger(0)) : null);
        sb6.append(" purchase_info.payment_buff.size=");
        r45.o52 o52Var2 = (r45.o52) value.getCustom(28);
        sb6.append((o52Var2 == null || (byteString = o52Var2.getByteString(6)) == null) ? null : java.lang.Integer.valueOf(byteString.f192156a.length));
        sb6.append(" biz_info.username=");
        r45.gw0 gw0Var = (r45.gw0) value.getCustom(40);
        sb6.append(gw0Var != null ? gw0Var.getString(1) : null);
        sb6.append(" newOnlineInfo=");
        r45.o94 o94Var = (r45.o94) value.getCustom(73);
        sb6.append(o94Var != null ? o94Var.toJSON() : null);
        sb6.append(" liveInfo=");
        sb6.append(cm2.a.f43328a.y(value));
        com.tencent.mars.xlog.Log.i(this.f328979f, sb6.toString());
        this.f328986p.postValue(java.lang.Integer.valueOf(value.getInteger(37)));
        if (pm0.v.z(value.getInteger(37), 64)) {
            ya2.b2 b17 = ya2.h.f460484a.b(((mm2.c1) business(mm2.c1.class)).f328852o);
            r45.gw0 gw0Var2 = (r45.gw0) value.getCustom(40);
            if (gw0Var2 == null || (str = gw0Var2.getString(1)) == null) {
                str = "";
            }
            r45.gw0 gw0Var3 = (r45.gw0) value.getCustom(40);
            if (gw0Var3 == null || (str2 = gw0Var3.getString(0)) == null) {
                str2 = "";
            }
            java.lang.String u07 = b17 != null ? b17.u0() : "";
            mm2.d dVar = (mm2.d) business(mm2.d.class);
            r45.gw0 gw0Var4 = (r45.gw0) value.getCustom(40);
            java.lang.String string = gw0Var4 != null ? gw0Var4.getString(1) : null;
            dVar.O6(true ^ (string == null || string.length() == 0));
            mm2.d dVar2 = (mm2.d) business(mm2.d.class);
            r45.gw0 gw0Var5 = (r45.gw0) value.getCustom(40);
            dVar2.P6(str, str2, u07, gw0Var5 != null ? gw0Var5.getInteger(2) : 0);
        }
        mm2.g0 g0Var = (mm2.g0) business(mm2.g0.class);
        r45.o52 o52Var3 = (r45.o52) value.getCustom(28);
        g0Var.f329063g = o52Var3 != null ? o52Var3.getByteString(6) : null;
        ((mm2.g0) business(mm2.g0.class)).V6("liveCoreSlice", (r45.td2) value.getCustom(27));
        com.tencent.mm.app.MMCrashReportContents.E.e(java.lang.Long.valueOf(value.getLong(0)));
        com.tencent.mm.app.MMBugReportContents.f53230k.f53730t.e(java.lang.Long.valueOf(value.getLong(0)));
    }

    public final void n7(r45.q12 q12Var) {
        this.f328989s = q12Var;
        kz2.b bVar = kz2.b.f313858a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("set liveModeInfo ");
        r45.q12 q12Var2 = this.f328989s;
        sb6.append(q12Var2 != null ? pm0.b0.g(q12Var2) : null);
        bVar.d(this.f328979f, sb6.toString());
    }

    public final void o7(kn0.i iVar) {
        this.f328990t = iVar;
        kz2.b.f313858a.d(this.f328979f, "set liveRoomModel " + iVar);
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        com.tencent.mars.xlog.Log.i(this.f328979f, "coreSlice Clear");
        this.f328981h = 0L;
        q7(0L);
        this.f328984n = null;
        m7(new r45.nw1());
        this.f328987q = new r45.ma4();
        l7(null);
        o7(null);
        this.f328991u = null;
        this.f328992v = "";
        this.f328994x = "";
        r7("");
        p7(null);
        this.A = false;
    }

    public final void p7(r45.oa4 oa4Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("------videoParams------\n");
        if (oa4Var != null) {
            sb6.append("defaultVideoParams = :[encResEnum:" + oa4Var.f382076d + ", capFps:" + oa4Var.f382078f + ", encBR:" + oa4Var.f382079g + ", encBR_Min:" + oa4Var.f382086q + "]\n");
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("mic_big_9_16 = :[encResEnum:");
            r45.mz6 mz6Var = oa4Var.B;
            sb7.append(mz6Var != null ? java.lang.Integer.valueOf(mz6Var.f380956d) : null);
            sb7.append(", capFps:");
            r45.mz6 mz6Var2 = oa4Var.B;
            sb7.append(mz6Var2 != null ? java.lang.Integer.valueOf(mz6Var2.f380957e) : null);
            sb7.append(", encBR:");
            r45.mz6 mz6Var3 = oa4Var.B;
            sb7.append(mz6Var3 != null ? java.lang.Integer.valueOf(mz6Var3.f380958f) : null);
            sb7.append(", encBR_Min:");
            r45.mz6 mz6Var4 = oa4Var.B;
            sb7.append(mz6Var4 != null ? java.lang.Integer.valueOf(mz6Var4.f380959g) : null);
            sb7.append("]\n");
            sb6.append(sb7.toString());
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("mic_middle_9_16 = :[encResEnum:");
            r45.mz6 mz6Var5 = oa4Var.C;
            sb8.append(mz6Var5 != null ? java.lang.Integer.valueOf(mz6Var5.f380956d) : null);
            sb8.append(", capFps:");
            r45.mz6 mz6Var6 = oa4Var.C;
            sb8.append(mz6Var6 != null ? java.lang.Integer.valueOf(mz6Var6.f380957e) : null);
            sb8.append(", encBR:");
            r45.mz6 mz6Var7 = oa4Var.C;
            sb8.append(mz6Var7 != null ? java.lang.Integer.valueOf(mz6Var7.f380958f) : null);
            sb8.append(", encBR_Min:");
            r45.mz6 mz6Var8 = oa4Var.C;
            sb8.append(mz6Var8 != null ? java.lang.Integer.valueOf(mz6Var8.f380959g) : null);
            sb8.append("]\n");
            sb6.append(sb8.toString());
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder("mic_small_9_16 = :[encResEnum:");
            r45.mz6 mz6Var9 = oa4Var.D;
            sb9.append(mz6Var9 != null ? java.lang.Integer.valueOf(mz6Var9.f380956d) : null);
            sb9.append(", capFps:");
            r45.mz6 mz6Var10 = oa4Var.D;
            sb9.append(mz6Var10 != null ? java.lang.Integer.valueOf(mz6Var10.f380957e) : null);
            sb9.append(", encBR:");
            r45.mz6 mz6Var11 = oa4Var.D;
            sb9.append(mz6Var11 != null ? java.lang.Integer.valueOf(mz6Var11.f380958f) : null);
            sb9.append(", encBR_Min:");
            r45.mz6 mz6Var12 = oa4Var.D;
            sb9.append(mz6Var12 != null ? java.lang.Integer.valueOf(mz6Var12.f380959g) : null);
            sb9.append("]\n");
            sb6.append(sb9.toString());
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder("mic_middle_1_1 = :[encResEnum:");
            r45.mz6 mz6Var13 = oa4Var.E;
            sb10.append(mz6Var13 != null ? java.lang.Integer.valueOf(mz6Var13.f380956d) : null);
            sb10.append(", capFps:");
            r45.mz6 mz6Var14 = oa4Var.E;
            sb10.append(mz6Var14 != null ? java.lang.Integer.valueOf(mz6Var14.f380957e) : null);
            sb10.append(", encBR:");
            r45.mz6 mz6Var15 = oa4Var.E;
            sb10.append(mz6Var15 != null ? java.lang.Integer.valueOf(mz6Var15.f380958f) : null);
            sb10.append(", encBR_Min:");
            r45.mz6 mz6Var16 = oa4Var.E;
            sb10.append(mz6Var16 != null ? java.lang.Integer.valueOf(mz6Var16.f380959g) : null);
            sb10.append("]\n");
            sb6.append(sb10.toString());
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder("mic_small_1_1 = :[encResEnum:");
            r45.mz6 mz6Var17 = oa4Var.F;
            sb11.append(mz6Var17 != null ? java.lang.Integer.valueOf(mz6Var17.f380956d) : null);
            sb11.append(", capFps:");
            r45.mz6 mz6Var18 = oa4Var.F;
            sb11.append(mz6Var18 != null ? java.lang.Integer.valueOf(mz6Var18.f380957e) : null);
            sb11.append(", encBR:");
            r45.mz6 mz6Var19 = oa4Var.F;
            sb11.append(mz6Var19 != null ? java.lang.Integer.valueOf(mz6Var19.f380958f) : null);
            sb11.append(", encBR_Min:");
            r45.mz6 mz6Var20 = oa4Var.F;
            sb11.append(mz6Var20 != null ? java.lang.Integer.valueOf(mz6Var20.f380959g) : null);
            sb11.append("]\n");
            sb6.append(sb11.toString());
            sb6.append("clip_20_21 = " + oa4Var.H + ",switch_2k = " + oa4Var.G);
        }
        sb6.append("------videoParams------");
        com.tencent.mars.xlog.Log.i(this.f328979f, sb6.toString());
        this.f328996z = oa4Var;
    }

    public final void q7(long j17) {
        this.f328983m = j17;
        if (j17 <= 0) {
            com.tencent.mm.sdk.platformtools.Log.c(this.f328979f, "may be invalid", new java.lang.Object[0]);
        }
    }

    public final void r7(java.lang.String value) {
        kotlin.jvm.internal.o.g(value, "value");
        com.tencent.mars.xlog.Log.i(this.f328979f, "write uniqueId to:".concat(value));
        this.f328995y = value;
    }

    public final void s7() {
        if ((!r26.n0.N(this.D)) && t7()) {
            com.tencent.mars.xlog.Log.i(this.f328979f, "newOnlineInfo: online member panel is open. Force online count str to " + this.D);
            r45.o94 o94Var = (r45.o94) this.f328988r.getCustom(73);
            if (o94Var == null) {
                return;
            }
            o94Var.set(0, this.D);
        }
    }

    public final boolean t7() {
        ae2.in inVar = ae2.in.f3688a;
        jz5.g gVar = ae2.in.Z2;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() == -1) {
            r45.o94 o94Var = (r45.o94) this.f328988r.getCustom(73);
            if (o94Var != null && o94Var.getBoolean(2)) {
                return true;
            }
        } else if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() != 0) {
            return true;
        }
        return false;
    }
}

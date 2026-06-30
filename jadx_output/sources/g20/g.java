package g20;

@j95.b
/* loaded from: classes8.dex */
public final class g extends i95.w implements c00.x3 {

    /* renamed from: f, reason: collision with root package name */
    public boolean f267775f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Boolean f267776g;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f267773d = "";

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f267774e = jz5.h.b(g20.e.f267768d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f267777h = jz5.h.b(g20.d.f267767d);

    public f10.c Ai() {
        ((h00.m) ((c00.t3) i95.n0.c(c00.t3.class))).getClass();
        if (!((java.lang.Boolean) ((jz5.n) h00.h.f277821b).getValue()).booleanValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsOrderService", "getOrderAndCardEntranceInfo use finder logic");
            return wi();
        }
        h00.a aVar = h00.a.f277808a;
        aVar.getClass();
        bw5.c6 c6Var = (bw5.c6) h00.a.f277810c.b(aVar, h00.a.f277809b[0]);
        kotlin.jvm.internal.o.d(c6Var);
        if (Ni(c6Var)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsOrderService", "getOrderAndCardEntranceInfo use new logic, but info null, fallback to finder logic");
            return wi();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsOrderService", "getOrderAndCardEntranceInfo use new logic,showType:" + c6Var.f25937d + ",titleType:" + c6Var.f25941h);
        return new f10.c(c6Var.f25937d, c6Var.f25942i[4] ? c6Var.f25940g : "", c6Var.f25939f, c6Var.f25941h);
    }

    public final x02.h Bi() {
        return (x02.h) ((jz5.n) this.f267777h).getValue();
    }

    public java.lang.String Di(int i17) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsOrderService", "getTitleWithType titleType:" + i17);
        switch (i17) {
            case 1:
                java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.okv);
                kotlin.jvm.internal.o.d(string);
                return string;
            case 2:
                java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.p_4);
                kotlin.jvm.internal.o.d(string2);
                return string2;
            case 3:
                java.lang.String string3 = context.getResources().getString(com.tencent.mm.R.string.p_5);
                kotlin.jvm.internal.o.d(string3);
                return string3;
            case 4:
                java.lang.String string4 = context.getResources().getString(com.tencent.mm.R.string.p_6);
                kotlin.jvm.internal.o.d(string4);
                return string4;
            case 5:
                java.lang.String string5 = context.getResources().getString(com.tencent.mm.R.string.phq);
                kotlin.jvm.internal.o.d(string5);
                return string5;
            case 6:
                java.lang.String string6 = context.getResources().getString(com.tencent.mm.R.string.php);
                kotlin.jvm.internal.o.d(string6);
                return string6;
            default:
                java.lang.String string7 = context.getResources().getString(com.tencent.mm.R.string.isr);
                kotlin.jvm.internal.o.d(string7);
                return string7;
        }
    }

    public final boolean Ni(bw5.c6 c6Var) {
        if (c6Var.f25937d != 2) {
            return false;
        }
        return c6Var.b() == null || c6Var.b().f() == null || (com.tencent.mm.sdk.platformtools.t8.K0(c6Var.b().f().getAppid()) && com.tencent.mm.sdk.platformtools.t8.K0(c6Var.b().f().b()));
    }

    public boolean Ri() {
        return Ai().f258545a == 2;
    }

    public final int Ui(android.content.Context context) {
        r45.vt vtVar = ((oh3.q) ((p90.j) i95.n0.c(p90.j.class))).f345456i;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = vtVar.f388512e;
        if (finderJumpInfo != null) {
            new java.util.HashMap().put(ya.b.SOURCE, 1);
            r45.l34 l34Var = new r45.l34();
            l34Var.set(6, java.lang.Boolean.TRUE);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            kotlin.jvm.internal.o.g(context, "context");
            xc2.y2 y2Var = xc2.y2.f453343a;
            xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
            p0Var.f453238c = l34Var;
            xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        }
        return vtVar.f388512e != null ? 2 : 1;
    }

    public boolean Vi() {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ecs_order_and_card_data_manager_switch_android, 0) == 1;
        boolean Ri = Ri();
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsOrderService", "nativeDataManagerSwitchOn " + z17 + " isOrderAndCardEntrance:" + Ri);
        return Ri && z17;
    }

    public void Zi(bw5.n9 preloadTiming, android.os.Bundle bundle) {
        r45.ez2 D0;
        com.tencent.mm.protobuf.g byteString;
        kotlin.jvm.internal.o.g(preloadTiming, "preloadTiming");
        if (Vi()) {
            if (this.f267775f) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EcsOrderService", "not preload for preloadTiming:" + preloadTiming + " when weapp running!");
                return;
            }
            com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0("Card.Entrance.Right");
            java.lang.String str = L0 != null ? L0.field_tips_uuid : null;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            if (L0 != null && (D0 = L0.D0()) != null && (byteString = D0.getByteString(4)) != null) {
                try {
                    str2 = new org.json.JSONObject(byteString.i()).optString("general_reddot_digest");
                    kotlin.jvm.internal.o.f(str2, "optString(...)");
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.EcsOrderService", e17.getMessage());
                    byte[] encode = android.util.Base64.encode(byteString.g(), 2);
                    kotlin.jvm.internal.o.f(encode, "encode(...)");
                    java.nio.charset.Charset UTF_8 = java.nio.charset.StandardCharsets.UTF_8;
                    kotlin.jvm.internal.o.f(UTF_8, "UTF_8");
                    str2 = new java.lang.String(encode, UTF_8);
                }
            }
            ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) this.f267774e).getValue()).post(new g20.f(this, preloadTiming, str, str2));
            if (preloadTiming == bw5.n9.SHOP_ENTRANCE_CLICK) {
                aj(true);
            }
        }
    }

    public final void aj(boolean z17) {
        if (this.f267775f != z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsOrderService", "orderAndCardWeAppClick from " + this.f267775f + " to " + z17);
        }
        this.f267775f = z17;
    }

    public boolean bj() {
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ecs_order_and_card_touch_preload_switch_android, 0) == 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsOrderService", "touchPreloadSwitchOn:" + z17);
        return z17;
    }

    public final f10.c wi() {
        r45.vt vtVar = ((oh3.q) ((p90.j) i95.n0.c(p90.j.class))).f345456i;
        int i17 = vtVar.f388511d;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = vtVar.f388512e;
        return new f10.c(i17, finderJumpInfo != null ? finderJumpInfo.getIcon_url() : null, vtVar.f388513f, 0);
    }
}

package j00;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final j00.d f296739a = new j00.d();

    public final void a(int i17, int i18, boolean z17, bw5.x7 jumpInfo, org.json.JSONObject extraData, long j17) {
        bw5.s8 c17;
        java.util.LinkedList<bw5.l7> linkedList;
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        kotlin.jvm.internal.o.g(extraData, "extraData");
        java.util.LinkedList linkedList2 = jumpInfo.b().f30097d;
        int i19 = 0;
        if (!(linkedList2 == null || linkedList2.isEmpty())) {
            if (!z17 && (linkedList = jumpInfo.b().f30097d) != null) {
                for (bw5.l7 l7Var : linkedList) {
                    java.lang.String str = l7Var.f29673g[1] ? l7Var.f29670d : "";
                    if (str != null && r26.i0.y(str, "mmecpreload_14", false)) {
                        boolean[] zArr = l7Var.f29673g;
                        java.lang.String str2 = zArr[1] ? l7Var.f29670d : "";
                        if (!(str2 == null || str2.length() == 0)) {
                            str2 = str2 + '_' + (i17 == 0 ? 1 : i17);
                        }
                        l7Var.f29670d = str2;
                        zArr[1] = true;
                    }
                }
            }
            if (z17) {
                c17 = n00.g.f333821a.b().b();
                kotlin.jvm.internal.o.f(c17, "getGroupEntrance(...)");
            } else {
                c17 = n00.g.f333821a.b().c();
                kotlin.jvm.internal.o.f(c17, "getSingleEntrance(...)");
            }
            if ((c17.f32856t & ((long) i18)) > 0) {
                com.tencent.mars.xlog.Log.i("EcsGiftPreloadHelper", "on gift button preload " + i18);
                bw5.d6 d6Var = new bw5.d6();
                boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(extraData.toString());
                boolean[] zArr2 = d6Var.f26339f;
                if (!K0) {
                    d6Var.f26338e = com.tencent.mm.protobuf.g.c(extraData.toString());
                    zArr2[2] = true;
                }
                if (i18 == 1) {
                    i19 = 1;
                } else if (i18 == 2) {
                    i19 = 2;
                }
                d6Var.f26337d = i19;
                zArr2[1] = true;
                if (j17 > 0 && i18 == 2) {
                    ((b00.q2) ((c00.b4) i95.n0.c(c00.b4.class))).wi("EcsGiftPreloadCost", (int) (android.os.SystemClock.elapsedRealtime() - j17), "0");
                }
                y02.p0 a17 = y02.r0.f458626d.a();
                if (a17 != null) {
                    bw5.m7 b17 = jumpInfo.b();
                    kotlin.jvm.internal.o.f(b17, "getCgiPreloadInfo(...)");
                    ((y02.r0) a17).e(b17, d6Var);
                }
            }
        }
    }

    public final org.json.JSONObject b(c00.j3 sender, boolean z17, int i17, java.lang.String str) {
        kotlin.jvm.internal.o.g(sender, "sender");
        if (!z17) {
            i17 = 1;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String str2 = sender.f36993b.f36967a;
        if (str2 == null) {
            str2 = "";
        }
        jSONObject.put("group_name", str2);
        jSONObject.put("group_uv", i17);
        jSONObject.put("chat_type", z17 ? 1 : 0);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        jSONObject.put("ecs_svr_ticket", str);
        jSONObject.put("general_recommend_scene", z17 ? 1004 : 1001);
        return jSONObject;
    }
}

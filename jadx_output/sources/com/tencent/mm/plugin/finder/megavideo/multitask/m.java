package com.tencent.mm.plugin.finder.megavideo.multitask;

/* loaded from: classes10.dex */
public final class m {
    public m(kotlin.jvm.internal.i iVar) {
    }

    public final void a(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, r45.fr4 fr4Var, boolean z17, android.app.Activity activity) {
        kotlin.jvm.internal.o.g(multiTaskInfo, "multiTaskInfo");
        android.os.Bundle bundle = new android.os.Bundle();
        if (fr4Var != null) {
            r45.w60 w60Var = new r45.w60();
            w60Var.set(3, bm5.f1.a());
            w60Var.set(0, fr4Var);
            w60Var.set(2, java.lang.Boolean.valueOf(!z17));
            if (activity != null) {
                r45.kr4 kr4Var = (r45.kr4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).wi(activity, 5);
                w60Var.set(1, kr4Var != null ? kr4Var.getString(0) : null);
            }
            bundle.putByteArray("key_multi_task_common_info", w60Var.toByteArray());
            r5 = jz5.f0.f302826a;
        }
        if (r5 == null) {
            r45.w60 w60Var2 = new r45.w60();
            w60Var2.set(3, bm5.f1.a());
            w60Var2.set(2, java.lang.Boolean.valueOf(!z17));
            bundle.putByteArray("key_multi_task_common_info", w60Var2.toByteArray());
        }
        bundle.putBoolean("megavideo_openFormMultiTask", z17);
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            b(multiTaskInfo, bundle, z17, activity);
        } else {
            bundle.putParcelable("multiTaskInfo", multiTaskInfo);
            com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.plugin.finder.megavideo.multitask.j.class);
        }
    }

    public final void b(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, android.os.Bundle bundle, boolean z17, android.app.Activity activity) {
        int i17;
        bw5.up upVar = new bw5.up();
        try {
            upVar.parseFrom(multiTaskInfo.field_data);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MegaVideoMultiTaskHelper", "FinderLongVideoStarContext parse fail", th6);
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        int i18 = qg3.g1.f362820d;
        java.lang.String UR_BC6E = urgen.ur_54A4.UR_6075.UR_BC6E();
        bw5.id0 id0Var = new bw5.id0();
        id0Var.f(UR_BC6E);
        id0Var.f28546n = upVar.f34014d;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        android.util.ArrayMap arrayMap = id0Var.f28558z;
        arrayMap.put(100, bool);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = "";
        android.content.Intent intent = new android.content.Intent();
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).mj(4, intent);
        id0Var.d(0);
        if (z17) {
            h0Var.f310123d = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(18, 2, 0, intent);
            intent.putExtra("key_extra_info", "{\"feedid\":" + multiTaskInfo.field_id + '}');
            com.tencent.mm.plugin.multitask.l0 l0Var = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
            java.lang.String field_id = multiTaskInfo.field_id;
            kotlin.jvm.internal.o.f(field_id, "field_id");
            int Di = ((com.tencent.mm.plugin.multitask.p1) l0Var).Di(field_id, multiTaskInfo.field_type);
            com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
            r45.qt2 qt2Var = new r45.qt2();
            qt2Var.set(1, (java.lang.String) h0Var.f310123d);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("feedid", multiTaskInfo.field_id);
            jSONObject.put("feed_index", Di + 1);
            jSONObject.put("import_time", multiTaskInfo.field_createTime);
            com.tencent.mm.plugin.finder.report.b6.d(b6Var, qt2Var, "float_feed", 1, jSONObject, false, null, 48, null);
            i17 = 0;
        } else {
            i17 = 0;
            h0Var.f310123d = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(17, 2, 0, intent);
        }
        hc2.e0.a(intent, i17, null, 3, null);
        bundle.putAll(intent.getExtras());
        long Z = pm0.v.Z(upVar.hasFieldNumber(31) ? upVar.f34016f : "");
        int e17 = (int) (cu2.x.f222449a.e("", "", Z) * 1000);
        if (e17 <= 0) {
            e17 = upVar.f34015e;
        }
        id0Var.g(e17);
        android.content.Context context = activity != null ? activity : com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(Z);
        if (((h17 == null || !h17.isUrlValid()) ? i17 : 1) != 0) {
            bw5.zc0 zc0Var = new bw5.zc0();
            zc0Var.d(new bw5.yr().parseFrom(h17.getFeedObject().toByteArray()));
            id0Var.e(zc0Var);
        } else {
            bw5.ad0 ad0Var = new bw5.ad0();
            java.lang.String str = upVar.hasFieldNumber(33) ? upVar.f34018h : "";
            kotlin.jvm.internal.o.f(str, "getFeedSessionBuffer(...)");
            int i19 = str.length() > 0 ? 1 : i17;
            boolean[] zArr = ad0Var.f25142h;
            if (i19 != 0) {
                ad0Var.f25140f = upVar.hasFieldNumber(33) ? upVar.f34018h : "";
                zArr[3] = true;
            }
            ad0Var.f25138d = upVar.hasFieldNumber(31) ? upVar.f34016f : "";
            zArr[1] = true;
            ad0Var.f25139e = upVar.hasFieldNumber(32) ? upVar.f34017g : "";
            zArr[2] = true;
            id0Var.f28548p = ad0Var;
            arrayMap.put(102, bool);
        }
        java.lang.String str2 = upVar.hasFieldNumber(54) ? upVar.f34022o : "";
        kotlin.jvm.internal.o.f(str2, "getChannelIdStr(...)");
        if (str2.length() > 0) {
            i17 = 1;
        }
        if (i17 != 0) {
            bw5.wc0 wc0Var = new bw5.wc0();
            wc0Var.f34650n = upVar.hasFieldNumber(54) ? upVar.f34022o : "";
            boolean[] zArr2 = wc0Var.f34655s;
            zArr2[8] = true;
            wc0Var.f34648i = upVar.f34021n;
            zArr2[6] = true;
            wc0Var.f34646g = upVar.f34020m;
            zArr2[4] = true;
            wc0Var.f34643d = upVar.hasFieldNumber(51) ? upVar.f34019i : "";
            zArr2[1] = true;
            wc0Var.f34645f = upVar.hasFieldNumber(55) ? upVar.f34023p : "";
            zArr2[3] = true;
            if (id0Var.b() != null && id0Var.b().f35938g[1]) {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(id0Var.b());
                wc0Var.f34644e = linkedList;
                zArr2[2] = true;
            }
            id0Var.f28550r = wc0Var;
            arrayMap.put(202, bool);
        } else {
            id0Var.f28543h = 40;
            arrayMap.put(50, bool);
        }
        byte[] byteArray = id0Var.toByteArray();
        kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        linkedHashMap.put("open_params", byteArray);
        d75.b.g(new com.tencent.mm.plugin.finder.megavideo.multitask.k(context, linkedHashMap, bundle, h0Var));
    }
}

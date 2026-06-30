package com.tencent.mm.plugin.finder.megavideo.multitask;

/* loaded from: classes8.dex */
public final class c {
    public c(kotlin.jvm.internal.i iVar) {
    }

    public final android.os.Bundle a(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo, boolean z17) {
        jz5.f0 f0Var;
        r45.yj4 yj4Var = new r45.yj4();
        try {
            yj4Var.parseFrom(multiTaskInfo.field_data);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("FinderVideoMultiTaskHelper", "MegaVideoFloatBallInfo parse fail", th6);
        }
        android.content.Intent intent = new android.content.Intent();
        java.util.LinkedList list = yj4Var.getList(6);
        kotlin.jvm.internal.o.f(list, "getCacheNewVideoList(...)");
        if (kz5.n0.a0(list, yj4Var.getInteger(2)) == null) {
            com.tencent.mars.xlog.Log.e("FinderVideoMultiTaskHelper", "onTaskBarItemClicked: currVideoPos item is null pos = " + yj4Var.getInteger(2));
            yj4Var.set(2, 0);
        }
        yj4Var.set(0, multiTaskInfo.field_id);
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list2 = yj4Var.getList(6);
        kotlin.jvm.internal.o.f(list2, "getCacheNewVideoList(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
        for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list2) {
            com.tencent.mm.plugin.finder.storage.h90 h90Var = com.tencent.mm.plugin.finder.storage.FinderItem.Companion;
            kotlin.jvm.internal.o.d(finderObject);
            arrayList.add(cu2.u.f222441a.p(h90Var.a(finderObject, 1)));
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) kz5.n0.a0(arrayList, yj4Var.getInteger(2));
        java.util.List c17 = baseFinderFeed != null ? kz5.b0.c(baseFinderFeed) : new java.util.LinkedList();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) kz5.n0.Z(c17);
        if (baseFinderFeed2 != null) {
            com.tencent.mars.xlog.Log.i("FinderVideoMultiTaskHelper", "handleClickMultiTask: case1, enter feed id=" + pm0.v.u(baseFinderFeed2.getFeedObject().getId()) + ", isFromMultiTask=" + z17);
            if (yj4Var.getLong(7) > c01.id.c()) {
                com.tencent.mars.xlog.Log.i("FinderVideoMultiTaskHelper", "handleClickMultiTask: had valid cache feed");
                hc2.e0.b(intent, yj4Var.getInteger(2), c17, yj4Var.getByteString(4), null);
                if (z17) {
                    bu2.j jVar = bu2.j.f24534a;
                    com.tencent.mm.plugin.finder.storage.FinderItem feedObject = baseFinderFeed2.getFeedObject();
                    bu2.i iVar = bu2.i.f24521b;
                    jVar.o(feedObject, bu2.i.f24531l);
                }
            }
            intent.putExtra("KEY_CACHE_OBJECT_ID", baseFinderFeed2.getFeedObject().getId());
            intent.putExtra("KEY_CACHE_OBJECT_NONCE_ID", baseFinderFeed2.getFeedObject().getObjectNonceId());
            if (z17) {
                intent.putExtra("feed_object_id", baseFinderFeed2.getFeedObject().getId());
                intent.putExtra("feed_object_nonceId", baseFinderFeed2.getFeedObject().getObjectNonceId());
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("FinderVideoMultiTaskHelper", "handleClickMultiTask: case2 enter feed id=" + pm0.v.u(yj4Var.getLong(9)) + ", isFromMultiTask=" + z17);
            intent.putExtra("KEY_CACHE_OBJECT_ID", yj4Var.getLong(9));
            if (z17) {
                intent.putExtra("feed_object_id", yj4Var.getLong(9));
            }
        }
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).mj(4, intent);
        intent.putExtra("KEY_ROUTER_UI", 0);
        intent.putExtra("KEY_FLOAT_BALL_INFO", yj4Var.toByteArray());
        intent.putExtra("KEY_VIDEO_START_PLAY_TIME_MS", yj4Var.getInteger(3) * 1000);
        ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).getClass();
        intent.putExtra("KEY_VIDEO_THUMB_LOCAL_PATH", com.tencent.mm.plugin.multitask.u0.f150506a.c(multiTaskInfo));
        if (z17) {
            java.lang.String Bj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(18, 2, 25, intent);
            intent.putExtra("key_extra_info", "{\"feedid\":" + multiTaskInfo.field_id + '}');
            com.tencent.mm.plugin.multitask.l0 l0Var = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
            java.lang.String field_id = multiTaskInfo.field_id;
            kotlin.jvm.internal.o.f(field_id, "field_id");
            int Di = ((com.tencent.mm.plugin.multitask.p1) l0Var).Di(field_id, multiTaskInfo.field_type);
            com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
            r45.qt2 qt2Var = new r45.qt2();
            qt2Var.set(1, Bj);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("feedid", multiTaskInfo.field_id);
            jSONObject.put("feed_index", Di + 1);
            jSONObject.put("import_time", multiTaskInfo.field_createTime);
            com.tencent.mm.plugin.finder.report.b6.d(b6Var, qt2Var, "float_feed", 1, jSONObject, false, null, 48, null);
        } else {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(17, 2, 4, intent);
        }
        hc2.e0.a(intent, 0, null, 3, null);
        return intent.getExtras();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:
    
        if (r2.putExtra("key_multi_task_common_info", r3.toByteArray()) == null) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v11, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(com.tencent.mm.plugin.multitask.model.MultiTaskInfo r9, r45.fr4 r10, boolean r11, android.app.Activity r12) {
        /*
            r8 = this;
            java.lang.String r0 = "multiTaskInfo"
            kotlin.jvm.internal.o.g(r9, r0)
            boolean r1 = com.tencent.mm.sdk.platformtools.x2.n()
            if (r1 == 0) goto L10
            android.os.Bundle r9 = r8.a(r9, r11)
            goto L2e
        L10:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r1.putParcelable(r0, r9)
            java.lang.String r9 = "isFromMultiTask"
            r1.putBoolean(r9, r11)
            java.lang.String r9 = com.tencent.mm.sdk.platformtools.w9.f193053a
            java.lang.Class<com.tencent.mm.plugin.finder.megavideo.multitask.a> r0 = com.tencent.mm.plugin.finder.megavideo.multitask.a.class
            android.os.Parcelable r9 = com.tencent.mm.ipcinvoker.d0.f(r9, r1, r0)
            android.os.Bundle r9 = (android.os.Bundle) r9
            if (r9 != 0) goto L2e
            android.os.Bundle r9 = new android.os.Bundle
            r9.<init>()
        L2e:
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            if (r9 == 0) goto L38
            r2.putExtras(r9)
        L38:
            java.lang.String r9 = "key_multi_task_common_info"
            r0 = 2
            r1 = 3
            r7 = 0
            if (r10 == 0) goto L80
            r45.w60 r3 = new r45.w60
            r3.<init>()
            java.lang.String r4 = bm5.f1.a()
            r3.set(r1, r4)
            r3.set(r7, r10)
            r10 = r11 ^ 1
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r3.set(r0, r10)
            if (r12 == 0) goto L76
            java.lang.Class<nd0.e> r10 = nd0.e.class
            i95.m r10 = i95.n0.c(r10)
            nd0.e r10 = (nd0.e) r10
            r4 = 5
            md0.e r10 = (md0.e) r10
            com.tencent.mm.protobuf.f r10 = r10.wi(r12, r4)
            r45.kr4 r10 = (r45.kr4) r10
            if (r10 == 0) goto L71
            java.lang.String r10 = r10.getString(r7)
            goto L72
        L71:
            r10 = 0
        L72:
            r4 = 1
            r3.set(r4, r10)
        L76:
            byte[] r10 = r3.toByteArray()
            android.content.Intent r10 = r2.putExtra(r9, r10)
            if (r10 != 0) goto L9c
        L80:
            r45.w60 r10 = new r45.w60
            r10.<init>()
            java.lang.String r3 = bm5.f1.a()
            r10.set(r1, r3)
            r1 = r11 ^ 1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r10.set(r0, r1)
            byte[] r10 = r10.toByteArray()
            r2.putExtra(r9, r10)
        L9c:
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            r2.addFlags(r9)
            java.lang.Class<com.tencent.mm.plugin.finder.assist.i0> r9 = com.tencent.mm.plugin.finder.assist.i0.class
            if (r11 == 0) goto Lb8
            i95.m r9 = i95.n0.c(r9)
            com.tencent.mm.plugin.finder.assist.i0 r9 = (com.tencent.mm.plugin.finder.assist.i0) r9
            if (r12 == 0) goto Laf
            r10 = r12
            goto Lb1
        Laf:
            android.content.Context r10 = com.tencent.mm.sdk.platformtools.x2.f193071a
        Lb1:
            kotlin.jvm.internal.o.d(r10)
            r9.uk(r10, r2, r7)
            goto Ld6
        Lb8:
            i95.m r9 = i95.n0.c(r9)
            java.lang.String r10 = "getService(...)"
            kotlin.jvm.internal.o.f(r9, r10)
            r0 = r9
            com.tencent.mm.plugin.finder.assist.i0 r0 = (com.tencent.mm.plugin.finder.assist.i0) r0
            if (r12 == 0) goto Lc8
            r1 = r12
            goto Lcb
        Lc8:
            android.content.Context r9 = com.tencent.mm.sdk.platformtools.x2.f193071a
            r1 = r9
        Lcb:
            kotlin.jvm.internal.o.d(r1)
            r3 = 0
            r4 = 0
            r5 = 12
            r6 = 0
            com.tencent.mm.plugin.finder.assist.i0.Ak(r0, r1, r2, r3, r4, r5, r6)
        Ld6:
            if (r11 == 0) goto Ldd
            if (r12 == 0) goto Ldd
            r12.overridePendingTransition(r7, r7)
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.megavideo.multitask.c.b(com.tencent.mm.plugin.multitask.model.MultiTaskInfo, r45.fr4, boolean, android.app.Activity):void");
    }
}

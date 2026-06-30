package ee0;

@j95.b
/* loaded from: classes4.dex */
public class v4 extends i95.w implements fe0.o4 {
    public java.lang.String Ai(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLocalid", "com.tencent.mm.feature.sns.SnsUtilService");
        com.tencent.mm.plugin.sns.storage.SnsInfo a17 = com.tencent.mm.plugin.sns.storage.l1.a(com.tencent.mm.plugin.sns.storage.w2.j("sns_table_", new java.math.BigInteger(str).longValue()));
        if (a17 != null) {
            java.lang.String localid = a17.getLocalid();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalid", "com.tencent.mm.feature.sns.SnsUtilService");
            return localid;
        }
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.e("MicroMsg.SnsUtilService", "getLocalid, snsid = %s", str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalid", "com.tencent.mm.feature.sns.SnsUtilService");
        return null;
    }

    public java.lang.String Bi(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAuthor", "com.tencent.mm.feature.sns.SnsUtilService");
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str);
        if (k17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAuthor", "com.tencent.mm.feature.sns.SnsUtilService");
            return "";
        }
        java.lang.String str2 = k17.field_userName;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAuthor", "com.tencent.mm.feature.sns.SnsUtilService");
        return str2;
    }

    public java.lang.String Di(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsPublishId", "com.tencent.mm.feature.sns.SnsUtilService");
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str);
        if (k17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsPublishId", "com.tencent.mm.feature.sns.SnsUtilService");
            return "";
        }
        android.os.Vibrator vibrator = ca4.z0.f40068a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeSnsPublishId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        java.lang.String str2 = "sns_" + ca4.z0.t0(k17.field_snsId);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeSnsPublishId", "com.tencent.mm.plugin.sns.data.SnsUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsPublishId", "com.tencent.mm.feature.sns.SnsUtilService");
        return str2;
    }

    public void Ni(android.content.Context context, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        java.lang.String str;
        java.lang.String str2;
        r45.ek4 ek4Var;
        r45.kv2 kv2Var;
        r45.kv2 kv2Var2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("gotoFinderShareFeedPage", "com.tencent.mm.feature.sns.SnsUtilService");
        if (!com.tencent.mm.sdk.platformtools.f9.MomentChannels.k(context, null)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("gotoFinderShareFeedPage", "com.tencent.mm.feature.sns.SnsUtilService");
            return;
        }
        r45.a90 a90Var = timeLineObject.ContentObj;
        ya2.e1 e1Var = ya2.e1.f460472a;
        if (a90Var == null || (kv2Var2 = a90Var.f369844o) == null) {
            str = "gotoFinderShareFeedPage";
            str2 = "com.tencent.mm.feature.sns.SnsUtilService";
            if (a90Var != null && (ek4Var = a90Var.f369849t) != null) {
                long F0 = ca4.z0.F0(ek4Var.getString(0));
                if (F0 != 0) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("report_scene", 3);
                    intent.putExtra("from_user", timeLineObject.UserName);
                    intent.putExtra("feed_object_id", F0);
                    intent.putExtra("feed_object_nonceId", timeLineObject.ContentObj.f369849t.getString(7));
                    intent.putExtra("business_type", 1);
                    intent.putExtra("key_from_user_name", timeLineObject.UserName);
                    intent.putExtra("key_ec_source", timeLineObject.ContentObj.f369844o.getString(24));
                    intent.putExtra("tab_type", 5);
                    intent.putExtra("KEY_FINDER_SNS_ID", Ai(timeLineObject.Id));
                    intent.putExtra("KEY_FINDER_SHARE_SUC_TIME", timeLineObject.CreateTime);
                    intent.putExtra("key_finder_teen_mode_check", ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ck());
                    intent.putExtra("key_finder_teen_mode_scene", 3);
                    intent.putExtra("key_finder_teen_mode_user_name", timeLineObject.ContentObj.f369849t.getString(2));
                    intent.putExtra("key_finder_teen_mode_user_id", timeLineObject.ContentObj.f369849t.getString(1));
                    vr2.f fVar = (vr2.f) ((zy2.eb) i95.n0.c(zy2.eb.class));
                    if (fVar.wi() && fVar.Ai() && (kv2Var = timeLineObject.ContentObj.f369844o) != null) {
                        intent.putExtra("KEY_OBJECT_ID", pm0.v.Z(kv2Var.getString(0)));
                        intent.putExtra("KEY_OBJECT_NONCE_ID", timeLineObject.ContentObj.f369844o.getString(8));
                        intent.putExtra("FROM_SCENE_KEY", 6);
                        intent.putExtra("KEY_FINDER_JUMP_HOT_TAB", true);
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 2, 20, intent);
                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                        e1Var.C(context, intent);
                    } else {
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 2, 53, intent);
                        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                        e1Var.A(context, intent, false);
                    }
                }
            }
        } else {
            str = "gotoFinderShareFeedPage";
            str2 = "com.tencent.mm.feature.sns.SnsUtilService";
            long F02 = ca4.z0.F0(kv2Var2.getString(0));
            long j17 = timeLineObject.ContentObj.f369844o.getLong(9);
            if (F02 != 0 || j17 != 0) {
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("report_scene", 3);
                intent2.putExtra("from_user", timeLineObject.UserName);
                intent2.putExtra("feed_object_id", F02);
                intent2.putExtra("feed_object_nonceId", timeLineObject.ContentObj.f369844o.getString(8));
                intent2.putExtra("business_type", 0);
                intent2.putExtra("finder_user_name", timeLineObject.ContentObj.f369844o.getString(1));
                intent2.putExtra("key_from_user_name", timeLineObject.UserName);
                intent2.putExtra("key_ec_source", timeLineObject.ContentObj.f369844o.getString(24));
                intent2.putExtra("tab_type", 5);
                intent2.putExtra("feed_local_id", j17);
                intent2.putExtra("KEY_FINDER_SNS_ID", Ai(timeLineObject.Id));
                intent2.putExtra("KEY_FINDER_SHARE_SUC_TIME", timeLineObject.CreateTime);
                intent2.putExtra("KEY_AUTHORIZATION_CONTENT", ot0.q.u(com.tencent.mm.plugin.sns.ui.kw.x(timeLineObject.ContentObj.f369844o), null, null));
                intent2.putExtra("KEY_FINDER_FORWARD_SOURCE", timeLineObject.ContentObj.f369844o.getString(22));
                intent2.putExtra("key_finder_teen_mode_check", ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ck());
                intent2.putExtra("key_finder_teen_mode_scene", 3);
                intent2.putExtra("key_finder_teen_mode_user_name", ca4.z0.z(timeLineObject.ContentObj.f369844o));
                intent2.putExtra("key_finder_teen_mode_user_id", timeLineObject.ContentObj.f369844o.getString(1));
                java.lang.String Ai = ((b00.u) ((c00.c3) i95.n0.c(c00.c3.class))).Ai(timeLineObject.Id, timeLineObject.CreateTime);
                r45.md5 md5Var = new r45.md5();
                md5Var.set(0, java.lang.Long.valueOf(F02));
                ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Cj(intent2, Ai, md5Var);
                ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Cj(intent2, Ai, md5Var);
                if (F02 == 0 && j17 != 0) {
                    intent2.putExtra("key_posting_scene", true);
                }
                if ((timeLineObject.ContentObj.f369844o.getInteger(25) & 4) > 0) {
                    intent2.putExtra("member_username", timeLineObject.ContentObj.f369844o.getString(1));
                }
                intent2.putExtra("key_source_comment_scene", timeLineObject.ContentObj.f369844o.getInteger(29));
                vr2.f fVar2 = (vr2.f) ((zy2.eb) i95.n0.c(zy2.eb.class));
                if (fVar2.wi() && fVar2.Ai()) {
                    intent2.putExtra("KEY_OBJECT_ID", pm0.v.Z(timeLineObject.ContentObj.f369844o.getString(0)));
                    intent2.putExtra("KEY_OBJECT_NONCE_ID", timeLineObject.ContentObj.f369844o.getString(8));
                    intent2.putExtra("FROM_SCENE_KEY", 6);
                    intent2.putExtra("KEY_FINDER_JUMP_HOT_TAB", true);
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 2, 20, intent2);
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    e1Var.C(context, intent2);
                } else {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Bj(4, 2, 38, intent2);
                    ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                    e1Var.A(context, intent2, true);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, str2);
    }

    public java.lang.String wi() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkSnsPostSessionId", "com.tencent.mm.feature.sns.SnsUtilService");
        java.lang.String l17 = ca4.z0.l();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkSnsPostSessionId", "com.tencent.mm.feature.sns.SnsUtilService");
        return l17;
    }
}

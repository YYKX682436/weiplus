package h73;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final h73.a f279484a = new h73.a();

    public final com.tencent.mm.plugin.handoff.model.HandOff a(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        long j17;
        com.tencent.mm.plugin.handoff.model.HandOff handOffMP;
        java.lang.String str;
        com.tencent.mm.plugin.handoff.model.HandOff handOff;
        java.lang.String str2;
        java.lang.String string;
        kotlin.jvm.internal.o.g(multiTaskInfo, "<this>");
        try {
            r45.lr4 lr4Var = multiTaskInfo.field_showData;
            java.lang.String string2 = lr4Var != null ? lr4Var.getString(5) : null;
            java.lang.String str3 = "";
            if (string2 == null) {
                string2 = "";
            }
            r45.lr4 lr4Var2 = multiTaskInfo.field_showData;
            java.lang.String string3 = lr4Var2 != null ? lr4Var2.getString(1) : null;
            java.lang.String str4 = string3 == null ? "" : string3;
            r45.lr4 lr4Var3 = multiTaskInfo.field_showData;
            java.lang.String string4 = lr4Var3 != null ? lr4Var3.getString(0) : null;
            java.lang.String str5 = string4 == null ? "" : string4;
            long j18 = multiTaskInfo.field_createTime;
            int i17 = multiTaskInfo.field_type;
            if (i17 != 1) {
                if (i17 != 2) {
                    if (i17 == 4) {
                        handOff = com.tencent.mm.plugin.handoff.model.HandOffFile.Companion.c(multiTaskInfo);
                        str = "field_id";
                        j17 = j18;
                    } else if (i17 != 26) {
                        str = "field_id";
                        j17 = j18;
                        handOff = null;
                    }
                }
                r45.k97 k97Var = new r45.k97();
                k97Var.parseFrom(multiTaskInfo.field_data);
                if (r26.n0.N(str5)) {
                    java.lang.String string5 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ndg);
                    kotlin.jvm.internal.o.f(string5, "getString(...)");
                    str2 = string5;
                } else {
                    str2 = str5;
                }
                java.lang.String string6 = k97Var.getString(2);
                if (string6 == null || r26.n0.N(string6)) {
                    string = k97Var.getString(1);
                    if (string == null) {
                        java.lang.String field_id = multiTaskInfo.field_id;
                        kotlin.jvm.internal.o.f(field_id, "field_id");
                        j17 = j18;
                        com.tencent.mm.plugin.handoff.model.HandOffURL handOffURL = new com.tencent.mm.plugin.handoff.model.HandOffURL(str4, str3, string2, 2, null, null, field_id, str2, 48, null);
                        handOffURL.setNickname(str5);
                        handOff = handOffURL;
                        str = "field_id";
                    }
                    str3 = string;
                    java.lang.String field_id2 = multiTaskInfo.field_id;
                    kotlin.jvm.internal.o.f(field_id2, "field_id");
                    j17 = j18;
                    com.tencent.mm.plugin.handoff.model.HandOffURL handOffURL2 = new com.tencent.mm.plugin.handoff.model.HandOffURL(str4, str3, string2, 2, null, null, field_id2, str2, 48, null);
                    handOffURL2.setNickname(str5);
                    handOff = handOffURL2;
                    str = "field_id";
                } else {
                    string = k97Var.getString(2);
                    if (string == null) {
                        java.lang.String field_id22 = multiTaskInfo.field_id;
                        kotlin.jvm.internal.o.f(field_id22, "field_id");
                        j17 = j18;
                        com.tencent.mm.plugin.handoff.model.HandOffURL handOffURL22 = new com.tencent.mm.plugin.handoff.model.HandOffURL(str4, str3, string2, 2, null, null, field_id22, str2, 48, null);
                        handOffURL22.setNickname(str5);
                        handOff = handOffURL22;
                        str = "field_id";
                    }
                    str3 = string;
                    java.lang.String field_id222 = multiTaskInfo.field_id;
                    kotlin.jvm.internal.o.f(field_id222, "field_id");
                    j17 = j18;
                    com.tencent.mm.plugin.handoff.model.HandOffURL handOffURL222 = new com.tencent.mm.plugin.handoff.model.HandOffURL(str4, str3, string2, 2, null, null, field_id222, str2, 48, null);
                    handOffURL222.setNickname(str5);
                    handOff = handOffURL222;
                    str = "field_id";
                }
            } else {
                j17 = j18;
                r45.n8 n8Var = new r45.n8();
                n8Var.parseFrom(multiTaskInfo.field_data);
                if (n8Var.getInteger(3) == 4) {
                    java.lang.String string7 = n8Var.getString(0);
                    if (string7 == null) {
                        string7 = "";
                    }
                    java.lang.String string8 = n8Var.getString(1);
                    java.lang.String str6 = string8 == null ? "" : string8;
                    java.lang.String field_id3 = multiTaskInfo.field_id;
                    kotlin.jvm.internal.o.f(field_id3, "field_id");
                    str = "field_id";
                    handOffMP = new com.tencent.mm.plugin.handoff.model.HandOffMG(string2, str5, string7, "", str6, 2, null, null, field_id3, 192, null);
                } else {
                    java.lang.String string9 = n8Var.getString(0);
                    if (string9 == null) {
                        string9 = "";
                    }
                    java.lang.String string10 = n8Var.getString(1);
                    java.lang.String str7 = string10 == null ? "" : string10;
                    java.lang.String field_id4 = multiTaskInfo.field_id;
                    kotlin.jvm.internal.o.f(field_id4, "field_id");
                    str = "field_id";
                    handOffMP = new com.tencent.mm.plugin.handoff.model.HandOffMP(string2, str5, string9, "", str7, 2, null, null, field_id4, 192, null);
                }
                handOff = handOffMP;
            }
            if (handOff == null) {
                return null;
            }
            java.lang.String str8 = multiTaskInfo.field_id;
            kotlin.jvm.internal.o.f(str8, str);
            handOff.setKey(str8);
            handOff.setCreateTime(j17);
            return handOff;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BallHelper", "parse multiTaskInfo[id:" + multiTaskInfo.field_id + ", type:" + multiTaskInfo.field_type + "] fail:" + e17.getLocalizedMessage());
            return null;
        }
    }
}

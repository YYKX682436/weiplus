package e73;

/* loaded from: classes12.dex */
public final class d {
    public d(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.handoff.model.HandOffFile a(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        long j17;
        long j18;
        long j19;
        kotlin.jvm.internal.o.g(ballInfo, "ballInfo");
        java.lang.String g17 = ballInfo.g("handoff#fullPath", "");
        java.lang.String g18 = ballInfo.g("handoff#fileType", "");
        java.lang.String g19 = ballInfo.g("handoff#title", "");
        java.lang.String g27 = ballInfo.g("handoff#md5", "");
        synchronized (ballInfo) {
            j17 = ballInfo.i("handoff#size") ? ballInfo.G.getLong("handoff#size", 0L) : 0L;
        }
        int f17 = ballInfo.f("handoff#source", 0);
        java.lang.String g28 = ballInfo.g("handoff#svrId", "");
        java.lang.String g29 = ballInfo.g("handoff#extId", "");
        java.lang.String g37 = ballInfo.g("handoff#cdnURL", "");
        java.lang.String g38 = ballInfo.g("handoff#aesKey", "");
        java.lang.String g39 = ballInfo.g("handoff#authKey", "");
        int f18 = ballInfo.f("handoff#fileStatus", 0);
        java.lang.String g47 = ballInfo.g("handoff#appId", "");
        int f19 = ballInfo.f("handoff#sdkVersion", 0);
        java.lang.String g48 = ballInfo.g("handoff#KmediaId", "");
        synchronized (ballInfo) {
            if (ballInfo.i("handoff#KUploadedSize")) {
                j18 = j17;
                j19 = ballInfo.G.getLong("handoff#KUploadedSize", 0L);
            } else {
                j18 = j17;
                j19 = 0;
            }
        }
        java.lang.String g49 = ballInfo.g("handoff#from", "");
        java.lang.String g57 = ballInfo.g("handoff#to", "");
        java.lang.String g58 = ballInfo.g("handoff#key", "");
        kotlin.jvm.internal.o.d(g17);
        kotlin.jvm.internal.o.d(g18);
        kotlin.jvm.internal.o.d(g19);
        kotlin.jvm.internal.o.d(g27);
        kotlin.jvm.internal.o.d(g28);
        kotlin.jvm.internal.o.d(g29);
        kotlin.jvm.internal.o.d(g37);
        kotlin.jvm.internal.o.d(g38);
        kotlin.jvm.internal.o.d(g39);
        kotlin.jvm.internal.o.d(g47);
        kotlin.jvm.internal.o.d(g48);
        kotlin.jvm.internal.o.d(g49);
        kotlin.jvm.internal.o.d(g57);
        kotlin.jvm.internal.o.d(g58);
        return new com.tencent.mm.plugin.handoff.model.HandOffFile(g17, g18, g19, g27, j18, f17, g28, g29, g37, g38, g39, f18, g47, f19, g48, j19, 2, g49, g57, g58);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.plugin.handoff.model.HandOffFile b(r45.gp0 r28, java.lang.String r29, com.tencent.mm.storage.f9 r30, java.lang.String r31) {
        /*
            Method dump skipped, instructions count: 190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e73.d.b(r45.gp0, java.lang.String, com.tencent.mm.storage.f9, java.lang.String):com.tencent.mm.plugin.handoff.model.HandOffFile");
    }

    public final com.tencent.mm.plugin.handoff.model.HandOffFile c(com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        if (multiTaskInfo == null) {
            return null;
        }
        r45.lr4 v07 = multiTaskInfo.v0();
        r45.qs0 qs0Var = new r45.qs0();
        qs0Var.parseFrom(multiTaskInfo.field_data);
        java.lang.String string = qs0Var.getString(1);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str = string == null ? "" : string;
        java.lang.String string2 = qs0Var.getString(2);
        java.lang.String str2 = string2 == null ? "" : string2;
        java.lang.String string3 = v07.getString(1);
        java.lang.String str3 = string3 == null ? "" : string3;
        java.lang.String string4 = qs0Var.getString(15);
        java.lang.String str4 = string4 == null ? "" : string4;
        long j17 = qs0Var.getLong(29);
        int integer = qs0Var.getInteger(16);
        java.lang.String string5 = qs0Var.getString(17);
        java.lang.String str5 = string5 == null ? "" : string5;
        java.lang.String string6 = qs0Var.getString(18);
        java.lang.String str6 = string6 == null ? "" : string6;
        java.lang.String string7 = qs0Var.getString(19);
        java.lang.String str7 = string7 == null ? "" : string7;
        java.lang.String string8 = qs0Var.getString(20);
        java.lang.String str8 = string8 == null ? "" : string8;
        java.lang.String string9 = qs0Var.getString(21);
        java.lang.String str9 = string9 == null ? "" : string9;
        int integer2 = qs0Var.getInteger(22);
        java.lang.String string10 = qs0Var.getString(23);
        java.lang.String str10 = string10 == null ? "" : string10;
        int integer3 = qs0Var.getInteger(24);
        java.lang.String string11 = qs0Var.getString(25);
        java.lang.String str11 = string11 == null ? "" : string11;
        long j18 = qs0Var.getLong(26);
        java.lang.String string12 = qs0Var.getString(27);
        java.lang.String str12 = string12 == null ? "" : string12;
        java.lang.String string13 = qs0Var.getString(28);
        java.lang.String str13 = string13 == null ? "" : string13;
        java.lang.String str14 = multiTaskInfo.field_id;
        return new com.tencent.mm.plugin.handoff.model.HandOffFile(str, str2, str3, str4, j17, integer, str5, str6, str7, str8, str9, integer2, str10, integer3, str11, j18, 2, str12, str13, str14 == null ? "" : str14);
    }
}

package nf4;

/* loaded from: classes4.dex */
public final class j extends dm.z7 {
    public static final l75.e0 M = dm.z7.initAutoDBInfo(nf4.j.class);
    public static final java.lang.String N = "rowid";
    public static final java.lang.String P = "serverStoryNameIndex";
    public static final java.lang.String Q = "serverStoryNameTimeIndex";
    public static final java.lang.String R = "serverStoryUsernameCreateTimeIndex";
    public int L;

    public j() {
        new java.util.ArrayList();
        new java.util.ArrayList();
    }

    public final void A0(int i17) {
        int i18 = this.field_itemStoryFlag;
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        this.field_itemStoryFlag = (~i17) & i18;
    }

    public final boolean D0(r45.lf6 contentObj) {
        kotlin.jvm.internal.o.g(contentObj, "contentObj");
        try {
            this.field_content = contentObj.toByteArray();
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.StoryInfo", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public final void F0(boolean z17) {
        int i17;
        if (z17) {
            int i18 = this.field_localFlag;
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            i17 = i18 | 16;
        } else {
            int i19 = this.field_localFlag;
            java.util.regex.Pattern pattern2 = pm0.v.f356802a;
            i17 = i19 & (-17);
        }
        this.field_localFlag = i17;
    }

    public final void G0(r45.lf6 timeline) {
        kotlin.jvm.internal.o.g(timeline, "timeline");
        try {
            this.field_content = timeline.toByteArray();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.StoryInfo", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // dm.z7, l75.f0
    public void convertFrom(android.database.Cursor cu6) {
        int i17;
        kotlin.jvm.internal.o.g(cu6, "cu");
        super.convertFrom(cu6);
        df4.a aVar = df4.b.f232038a;
        try {
            i17 = java.lang.Integer.parseInt(android.text.format.DateFormat.format(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.jld), this.field_createTime * 1000).toString());
        } catch (java.lang.NumberFormatException e17) {
            df4.a aVar2 = df4.b.f232038a;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.StoryTimeUtil", e17, "NumberFormatException", new java.lang.Object[0]);
            i17 = 0;
        }
        this.L = i17;
    }

    @Override // dm.z7, l75.f0
    public l75.e0 getDBInfo() {
        l75.e0 info = M;
        kotlin.jvm.internal.o.f(info, "info");
        return info;
    }

    public final void t0(int i17) {
        int i18 = this.field_itemStoryFlag;
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        this.field_itemStoryFlag = i17 | i18;
    }

    public final boolean u0() {
        return pm0.v.z(this.field_itemStoryFlag, 8);
    }

    public final r45.ye6 v0() {
        r45.ye6 ye6Var = new r45.ye6();
        if (this.field_postBuf == null) {
            return ye6Var;
        }
        try {
            com.tencent.mm.protobuf.f parseFrom = new r45.ye6().parseFrom(this.field_postBuf);
            kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryMediaPostInfo");
            return (r45.ye6) parseFrom;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.StoryInfo", "error get StoryMediaPostInfo " + this.field_storyID);
            return new r45.ye6();
        }
    }

    public final boolean w0() {
        return pm0.v.z(this.field_localFlag, 16);
    }

    public final r45.lf6 y0() {
        if (this.field_content == null) {
            r45.lf6 lf6Var = new r45.lf6();
            r45.oe6 oe6Var = new r45.oe6();
            r45.tl5 tl5Var = new r45.tl5();
            tl5Var.f386553e = 0.0f;
            tl5Var.f386552d = 0.0f;
            lf6Var.f379431g = tl5Var;
            lf6Var.f379432h = oe6Var;
            lf6Var.f379428d = "";
            lf6Var.f379430f = 0;
            return lf6Var;
        }
        try {
            com.tencent.mm.protobuf.f parseFrom = new r45.lf6().parseFrom(this.field_content);
            kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StoryTimelineObject");
            return (r45.lf6) parseFrom;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.StoryInfo", "error get storyinfo timeline!");
            r45.lf6 lf6Var2 = new r45.lf6();
            r45.oe6 oe6Var2 = new r45.oe6();
            r45.tl5 tl5Var2 = new r45.tl5();
            tl5Var2.f386553e = 0.0f;
            tl5Var2.f386552d = 0.0f;
            lf6Var2.f379431g = tl5Var2;
            lf6Var2.f379432h = oe6Var2;
            lf6Var2.f379428d = "";
            lf6Var2.f379430f = 0;
            return lf6Var2;
        }
    }

    public final boolean z0() {
        int i17 = this.field_createTime;
        int e17 = c01.id.e();
        ef4.n.f252460a.a();
        return i17 <= e17 - 86400;
    }
}

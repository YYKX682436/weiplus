package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class FavUrlTask extends com.tencent.mm.plugin.appbrand.ipc.MainProcessTask {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.webview.luggage.FavUrlTask> CREATOR = new com.tencent.mm.plugin.webview.luggage.m();

    /* renamed from: f, reason: collision with root package name */
    public int f182116f;

    /* renamed from: g, reason: collision with root package name */
    public android.os.Bundle f182117g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f182118h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f182119i;

    /* renamed from: m, reason: collision with root package name */
    public int f182120m;

    /* renamed from: n, reason: collision with root package name */
    public int f182121n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f182122o;

    public /* synthetic */ FavUrlTask(android.os.Parcel parcel, com.tencent.mm.plugin.webview.luggage.m mVar) {
        this(parcel);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void v(android.os.Parcel parcel) {
        this.f182116f = parcel.readInt();
        this.f182117g = parcel.readBundle();
        this.f182118h = parcel.readByte() == 1;
        this.f182119i = parcel.readByte() == 1;
        this.f182120m = parcel.readInt();
        this.f182121n = parcel.readInt();
        this.f182122o = parcel.readByte() == 1;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f182116f);
        parcel.writeBundle(this.f182117g);
        parcel.writeByte(this.f182118h ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f182119i ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f182120m);
        parcel.writeInt(this.f182121n);
        parcel.writeByte(this.f182122o ? (byte) 1 : (byte) 0);
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.MainProcessTask
    public void z() {
        boolean z17;
        int i17 = this.f182116f;
        if (i17 != 1) {
            if (i17 == 2) {
                com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
                favoriteOperationEvent.f54243g.f8528a = 35;
                favoriteOperationEvent.e();
                return;
            }
            if (i17 == 3) {
                j45.l.g("favorite");
                this.f182122o = true;
                return;
            }
            if (i17 != 4) {
                return;
            }
            com.tencent.mm.autogen.events.DeleteFavoriteEvent deleteFavoriteEvent = new com.tencent.mm.autogen.events.DeleteFavoriteEvent();
            long j17 = this.f182117g.getLong("fav_local_id", -1L);
            am.w3 w3Var = deleteFavoriteEvent.f54084g;
            w3Var.f8258a = j17;
            w3Var.f8260c = 11;
            deleteFavoriteEvent.e();
            java.lang.Long valueOf = java.lang.Long.valueOf(w3Var.f8258a);
            am.x3 x3Var = deleteFavoriteEvent.f54085h;
            com.tencent.mars.xlog.Log.i("MicroMsg.FavUrlTask", "do del fav web url, local id %d, result %B", valueOf, java.lang.Boolean.valueOf(x3Var.f8343a));
            this.f182119i = x3Var.f8343a;
            return;
        }
        android.os.Bundle bundle = this.f182117g;
        if (bundle == null) {
            return;
        }
        long j18 = bundle.getLong("msg_id", Long.MIN_VALUE);
        java.lang.String string = this.f182117g.getString("msg_talker");
        java.lang.String string2 = this.f182117g.getString("sns_local_id");
        int i18 = this.f182117g.getInt("news_svr_id", 0);
        java.lang.String string3 = this.f182117g.getString("news_svr_tweetid");
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        am.c4 c4Var = doFavoriteEvent.f54090g;
        if (Long.MIN_VALUE != j18) {
            c4Var.f6321g = this.f182117g.getInt("message_index", 0);
            ((com.tencent.mm.pluginsdk.model.b2) ((o72.c5) i95.n0.c(o72.c5.class))).getClass();
            z17 = com.tencent.mm.pluginsdk.model.a2.i(doFavoriteEvent, j18, string);
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
            com.tencent.mm.autogen.events.SnsfillEventInfoEvent snsfillEventInfoEvent = new com.tencent.mm.autogen.events.SnsfillEventInfoEvent();
            am.kx kxVar = snsfillEventInfoEvent.f54854g;
            kxVar.f7188b = string2;
            kxVar.f7189c = doFavoriteEvent;
            kxVar.f7187a = this.f182117g.getString("rawUrl");
            snsfillEventInfoEvent.e();
            z17 = snsfillEventInfoEvent.f54855h.f7277a;
        } else {
            if (i18 == 0) {
                this.f182118h = true;
                return;
            }
            com.tencent.mm.autogen.events.ReaderAppOperationEvent readerAppOperationEvent = new com.tencent.mm.autogen.events.ReaderAppOperationEvent();
            am.np npVar = readerAppOperationEvent.f54646g;
            npVar.f7441a = 3;
            npVar.f7442b = doFavoriteEvent;
            npVar.f7443c = i18;
            npVar.f7444d = string3;
            readerAppOperationEvent.e();
            z17 = readerAppOperationEvent.f54647h.f7571a;
        }
        if (z17) {
            java.lang.String string4 = this.f182117g.getString("prePublishId");
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (string4 == null) {
                string4 = "";
            }
            java.lang.String a17 = c01.n2.a(string4);
            c01.l2 c17 = c01.n2.d().c(a17, true);
            c17.i("sendAppMsgScene", 2);
            c17.i("preChatName", this.f182117g.getString("preChatName"));
            c17.i("preMsgIndex", java.lang.Integer.valueOf(this.f182117g.getInt("preMsgIndex")));
            c17.i("prePublishId", string4);
            c17.i("preUsername", this.f182117g.getString("preUsername"));
            c17.i("getA8KeyScene", this.f182117g.getString("getA8KeyScene"));
            c17.i("referUrl", this.f182117g.getString("referUrl"));
            android.os.Bundle bundle2 = this.f182117g.getBundle("jsapiargs");
            if (bundle2 != null) {
                c17.i("adExtStr", bundle2.getString("key_snsad_statextstr"));
            }
            c4Var.f6322h = a17;
            doFavoriteEvent.e();
        } else {
            if (c4Var.f6326l == 0) {
                c4Var.f6326l = com.tencent.mm.R.string.cak;
            }
            doFavoriteEvent.e();
        }
        this.f182120m = doFavoriteEvent.f54091h.f6433a;
    }

    public FavUrlTask() {
    }

    private FavUrlTask(android.os.Parcel parcel) {
        v(parcel);
    }
}

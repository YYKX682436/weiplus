package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class GameTabData2 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2> CREATOR = new com.tencent.mm.plugin.game.ui.chat_tab.k0();

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f141150i = "{\n        \"TabList\": [\n            {\n                \"Key\": \"home\",\n                \"Title\": \"首页\",\n                \"IconUrl\": \"https://mmgame.qpic.cn/image/4f72b9a4850edcba7ff71688b17233b8224fcc357e2357c9c09f74efc5fbb32c\",\n                \"SelectedIconUrl\": \"https://mmgame.qpic.cn/image/783ef37d09913c102b1647db4eefdce9823ed1351b850fcaf30650eec844cf82\",\n                \"DarkModeIconUrl\": \"https://mmgame.qpic.cn/image/b18f15fb59987306a116b4c04929e10cfe08da24ba2d3467043ae3b0a68cc598\",\n                \"DarkModeSelectedIconUrl\": \"https://mmgame.qpic.cn/image/783ef37d09913c102b1647db4eefdce9823ed1351b850fcaf30650eec844cf82\",\n                \"Type\": 2,\n                \"JumpUrl\": \"https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy) + "/cgi-bin/h5/static/contentcenter/feeds.html?wechat_pkgid=contentcenter_feeds&abt=59&ssid=901\"\n            },\n            {\n                \"Key\": \"gameindex\",\n                \"Title\": \"游戏\",\n                \"IconUrl\": \"https://mmgame.qpic.cn/image/3379a7e14dacfc6c9eea1cc3bce1abc681634348b2d10cb741402f0a7afe1b99\",\n                \"SelectedIconUrl\": \"https://mmgame.qpic.cn/image/d517ee0b80e2025c8e84c4247275ff9b52e8729c661b49556dc20cfbf717ef5a\",\n                \"DarkModeIconUrl\": \"https://mmgame.qpic.cn/image/e257a6c0d7dd13a2ec717ec5d370871f8624fed7fcf8bd0c9d3a29dee6d01d97\",\n                \"DarkModeSelectedIconUrl\": \"https://mmgame.qpic.cn/image/d517ee0b80e2025c8e84c4247275ff9b52e8729c661b49556dc20cfbf717ef5a\",\n                \"Type\": 2,\n                \"JumpUrl\": \"https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy) + "/cgi-bin/h5/static/contentcenter/game.html?wechat_pkgid=contentcenter_game&ssid=901\"\n            },\n            {\n                \"Key\": \"community\",\n                \"Title\": \"游戏圈\",\n                \"IconUrl\": \"https://mmgame.qpic.cn/image/090cb63e719dd5dee494f493d4dc7c767293046c8c37c3d620f3c426a4292806\",\n                \"SelectedIconUrl\": \"https://mmgame.qpic.cn/image/d78d45d5a0ff85d3fa7ef3012301b21e899408c71c9039ed0b7f32884033e329\",\n                \"DarkModeIconUrl\": \"https://mmgame.qpic.cn/image/3eea6be7fecf862137602860126a710860466bcb39f19a51d89664147c71aa3d\",\n                \"DarkModeSelectedIconUrl\": \"https://mmgame.qpic.cn/image/d78d45d5a0ff85d3fa7ef3012301b21e899408c71c9039ed0b7f32884033e329\",\n                \"Type\": 2,\n                \"JumpUrl\": \"https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy) + "/cgi-bin/h5/static/appcenter/community.html?wechat_pkgid=appcenter_community&ssid=901\"\n            },\n            {\n                \"Key\": \"chat\",\n                \"Title\": \"消息\",\n                \"IconUrl\": \"https://mmgame.qpic.cn/image/70b7e084e27150c4e606618d72b3afd1c474039fead8dadabf5a3438159d3cd5\",\n                \"SelectedIconUrl\": \"https://mmgame.qpic.cn/image/52ed44d8619a56364c712245b5426e4aed54091754fc174503f9114fb98d3256\",\n                \"DarkModeIconUrl\": \"https://mmgame.qpic.cn/image/6c4e9abf2c66d9b10e7a8a446a7285c89d0e577a6183eb222708d0cb9fc33bf3\",\n                \"DarkModeSelectedIconUrl\": \"https://mmgame.qpic.cn/image/52ed44d8619a56364c712245b5426e4aed54091754fc174503f9114fb98d3256\",\n                \"Type\": 1\n            }\n        ],\n        \"DefaultTab\": {\n            \"Key\": \"home\"\n        }\n    }";

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.game.ui.chat_tab.l0 f141151d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f141152e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f141153f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f141154g;

    /* renamed from: h, reason: collision with root package name */
    public m53.i3 f141155h;

    public GameTabData2() {
        this.f141151d = new com.tencent.mm.plugin.game.ui.chat_tab.l0(this);
    }

    public static boolean c(com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 gameTabData2, m53.l5 l5Var) {
        java.lang.String str;
        if (l5Var != null) {
            java.util.LinkedList linkedList = l5Var.f323883d;
            if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                gameTabData2.f141155h = l5Var.f323887h;
                gameTabData2.f141153f = l5Var.f323885f;
                gameTabData2.f141154g = l5Var.f323886g;
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem tabItem = new com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem((m53.r5) it.next());
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(tabItem.f141156d)) {
                        gameTabData2.f141151d.put(tabItem.f141156d, tabItem);
                    }
                }
                if (gameTabData2.f141151d.size() == 0) {
                    return false;
                }
                m53.n5 n5Var = l5Var.f323884e;
                java.lang.String str2 = "";
                if (n5Var == null || (str = n5Var.f323930d) == null) {
                    str = "";
                }
                if (gameTabData2.f141151d.containsKey(str)) {
                    gameTabData2.f141152e = str;
                    return true;
                }
                try {
                    str2 = (java.lang.String) ((java.util.Map.Entry) gameTabData2.f141151d.entrySet().iterator().next()).getKey();
                } catch (java.lang.Exception unused) {
                }
                gameTabData2.f141152e = str2;
                return true;
            }
        }
        return false;
    }

    public static boolean d(com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 gameTabData2, org.json.JSONObject jSONObject) {
        try {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray("TabList");
            for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem tabItem = new com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem(jSONArray.optJSONObject(i17));
                if (!com.tencent.mm.sdk.platformtools.t8.K0(tabItem.f141156d)) {
                    gameTabData2.f141151d.put(tabItem.f141156d, tabItem);
                }
            }
            if (gameTabData2.f141151d.size() != 0) {
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("DefaultTab");
                java.lang.String str = "";
                java.lang.String optString = optJSONObject != null ? optJSONObject.optString("Key") : "";
                if (gameTabData2.f141151d.containsKey(optString)) {
                    gameTabData2.f141152e = optString;
                    return true;
                }
                try {
                    str = (java.lang.String) ((java.util.Map.Entry) gameTabData2.f141151d.entrySet().iterator().next()).getKey();
                } catch (java.lang.Exception unused) {
                }
                gameTabData2.f141152e = str;
                return true;
            }
        } catch (org.json.JSONException unused2) {
        }
        return false;
    }

    public java.util.List a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mm.plugin.game.ui.chat_tab.l0 l0Var = this.f141151d;
        if (l0Var != null) {
            arrayList.addAll(l0Var.values());
        }
        return arrayList;
    }

    public java.lang.String b() {
        for (V v17 : this.f141151d.values()) {
            if (v17.f141166q == 1) {
                return v17.f141156d;
            }
        }
        return "";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public java.lang.String e() {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        for (V v17 : this.f141151d.values()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("Key", v17.f141156d);
                jSONObject.put("Title", v17.f141157e);
                jSONObject.put("JumpUrl", v17.f141167r);
                java.lang.String str = this.f141152e;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "";
                }
                if (str.equalsIgnoreCase(v17.f141156d)) {
                    jSONObject.put("isDefaultTab", 1);
                } else {
                    jSONObject.put("isDefaultTab", 0);
                }
            } catch (org.json.JSONException unused) {
            }
            jSONArray.put(jSONObject);
        }
        return jSONArray.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f141151d.size());
        java.util.Iterator it = this.f141151d.entrySet().iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((android.os.Parcelable) ((java.util.Map.Entry) it.next()).getValue(), i17);
        }
        parcel.writeString(this.f141152e);
        parcel.writeString(this.f141153f);
        parcel.writeString(this.f141154g);
        try {
            m53.i3 i3Var = this.f141155h;
            if (i3Var != null) {
                byte[] byteArray = i3Var.toByteArray();
                if (byteArray == null || byteArray.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(byteArray.length);
                    parcel.writeByteArray(byteArray);
                }
            } else {
                parcel.writeInt(0);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    /* loaded from: classes8.dex */
    public static class TabItemWeapp implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItemWeapp> CREATOR = new com.tencent.mm.plugin.game.ui.chat_tab.p0();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f141183d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f141184e;

        public TabItemWeapp(m53.p5 p5Var) {
            if (p5Var == null) {
                return;
            }
            this.f141183d = p5Var.f323967d;
            this.f141184e = p5Var.f323968e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f141183d);
            parcel.writeString(this.f141184e);
        }

        public TabItemWeapp(org.json.JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.f141183d = jSONObject.optString("AppId");
            this.f141184e = jSONObject.optString("Path");
        }

        public TabItemWeapp(android.os.Parcel parcel, com.tencent.mm.plugin.game.ui.chat_tab.k0 k0Var) {
            this.f141183d = parcel.readString();
            this.f141184e = parcel.readString();
        }
    }

    public GameTabData2(android.os.Parcel parcel, com.tencent.mm.plugin.game.ui.chat_tab.k0 k0Var) {
        int readInt = parcel.readInt();
        if (this.f141151d == null) {
            this.f141151d = new com.tencent.mm.plugin.game.ui.chat_tab.l0(this);
        }
        for (int i17 = 0; i17 < readInt; i17++) {
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem tabItem = (com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem) parcel.readParcelable(com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem.class.getClassLoader());
            if (tabItem != null) {
                this.f141151d.put(tabItem.f141156d, tabItem);
            }
        }
        this.f141152e = parcel.readString();
        this.f141153f = parcel.readString();
        this.f141154g = parcel.readString();
        try {
            int readInt2 = parcel.readInt();
            if (readInt2 > 0) {
                this.f141155h = new m53.i3();
                byte[] bArr = new byte[readInt2];
                parcel.readByteArray(bArr);
                this.f141155h.parseFrom(bArr);
            }
        } catch (java.lang.Exception e17) {
            this.f141155h = null;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.GameTabData2", e17, "parse jsApiResponse exception", new java.lang.Object[0]);
        }
    }

    /* loaded from: classes8.dex */
    public static class TabItemReport implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItemReport> CREATOR = new com.tencent.mm.plugin.game.ui.chat_tab.o0();

        /* renamed from: d, reason: collision with root package name */
        public int f141180d;

        /* renamed from: e, reason: collision with root package name */
        public int f141181e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f141182f;

        public TabItemReport(m53.q5 q5Var) {
            if (q5Var == null) {
                return;
            }
            this.f141180d = q5Var.f323991d;
            this.f141181e = q5Var.f323992e;
            this.f141182f = q5Var.f323993f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f141180d);
            parcel.writeInt(this.f141181e);
            parcel.writeString(this.f141182f);
        }

        public TabItemReport(org.json.JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.f141180d = jSONObject.optInt("AreaId");
            this.f141181e = jSONObject.optInt("PositionId");
            this.f141182f = jSONObject.optString("ExternInfo");
        }

        public TabItemReport(android.os.Parcel parcel, com.tencent.mm.plugin.game.ui.chat_tab.k0 k0Var) {
            this.f141180d = parcel.readInt();
            this.f141181e = parcel.readInt();
            this.f141182f = parcel.readString();
        }
    }

    /* loaded from: classes8.dex */
    public static class TabItemLiteApp implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItemLiteApp> CREATOR = new com.tencent.mm.plugin.game.ui.chat_tab.n0();

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f141176d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f141177e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f141178f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f141179g;

        public TabItemLiteApp(m53.o5 o5Var) {
            if (o5Var == null) {
                return;
            }
            this.f141176d = o5Var.f323946d;
            this.f141177e = o5Var.f323947e;
            this.f141178f = o5Var.f323948f;
            this.f141179g = o5Var.f323949g;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f141176d);
            parcel.writeString(this.f141177e);
            parcel.writeString(this.f141178f);
            parcel.writeString(this.f141179g);
        }

        public TabItemLiteApp(org.json.JSONObject jSONObject) {
            if (jSONObject == null) {
                return;
            }
            this.f141176d = jSONObject.optString("AppId");
            this.f141177e = jSONObject.optString("Path");
            this.f141178f = jSONObject.optString("Query");
            this.f141179g = jSONObject.optString("PkgId");
        }

        public TabItemLiteApp(android.os.Parcel parcel, com.tencent.mm.plugin.game.ui.chat_tab.k0 k0Var) {
            this.f141176d = parcel.readString();
            this.f141177e = parcel.readString();
            this.f141178f = parcel.readString();
            this.f141179g = parcel.readString();
        }
    }

    /* loaded from: classes8.dex */
    public static class TabItem implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem> CREATOR = new com.tencent.mm.plugin.game.ui.chat_tab.m0();
        public int A;
        public int B;
        public boolean C;
        public int D;
        public boolean E;
        public java.util.List F;
        public boolean G;

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f141156d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f141157e;

        /* renamed from: f, reason: collision with root package name */
        public java.lang.String f141158f;

        /* renamed from: g, reason: collision with root package name */
        public java.lang.String f141159g;

        /* renamed from: h, reason: collision with root package name */
        public java.lang.String f141160h;

        /* renamed from: i, reason: collision with root package name */
        public java.lang.String f141161i;

        /* renamed from: m, reason: collision with root package name */
        public java.lang.String f141162m;

        /* renamed from: n, reason: collision with root package name */
        public java.lang.String f141163n;

        /* renamed from: o, reason: collision with root package name */
        public java.lang.String f141164o;

        /* renamed from: p, reason: collision with root package name */
        public java.lang.String f141165p;

        /* renamed from: q, reason: collision with root package name */
        public int f141166q;

        /* renamed from: r, reason: collision with root package name */
        public java.lang.String f141167r;

        /* renamed from: s, reason: collision with root package name */
        public com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItemWeapp f141168s;

        /* renamed from: t, reason: collision with root package name */
        public com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItemReport f141169t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f141170u;

        /* renamed from: v, reason: collision with root package name */
        public int f141171v;

        /* renamed from: w, reason: collision with root package name */
        public boolean f141172w;

        /* renamed from: x, reason: collision with root package name */
        public int f141173x;

        /* renamed from: y, reason: collision with root package name */
        public com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItemLiteApp f141174y;

        /* renamed from: z, reason: collision with root package name */
        public java.lang.String f141175z;

        public TabItem(m53.r5 r5Var) {
            com.tencent.mm.plugin.game.model.LocalJumpInfo localJumpInfo;
            this.B = 0;
            this.C = false;
            this.D = 0;
            this.E = false;
            this.G = false;
            if (r5Var == null) {
                return;
            }
            this.f141156d = r5Var.f324014d;
            this.f141157e = r5Var.f324015e;
            this.f141158f = r5Var.f324016f;
            this.f141159g = r5Var.f324017g;
            this.f141160h = r5Var.f324018h;
            this.f141161i = r5Var.f324019i;
            this.f141162m = r5Var.f324020m;
            this.f141163n = r5Var.f324021n;
            this.f141164o = r5Var.f324022o;
            this.f141165p = r5Var.f324023p;
            this.f141166q = r5Var.f324024q;
            this.f141167r = r5Var.f324025r;
            this.f141168s = new com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItemWeapp(r5Var.f324026s);
            this.f141169t = new com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItemReport(r5Var.f324027t);
            this.f141170u = r5Var.f324028u;
            this.f141171v = r5Var.f324029v;
            this.f141172w = r5Var.f324032y;
            this.f141173x = r5Var.f324033z;
            this.f141174y = new com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItemLiteApp(r5Var.A);
            java.util.LinkedList linkedList = r5Var.f324031x;
            com.tencent.mm.plugin.game.model.WeAppJumpInfo weAppJumpInfo = null;
            if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
                this.F = null;
            } else {
                this.F = new java.util.ArrayList();
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    m53.m5 m5Var = (m53.m5) it.next();
                    java.util.List list = this.F;
                    kotlin.jvm.internal.o.g(m5Var, "<this>");
                    java.lang.String str = m5Var.f323906d;
                    java.lang.String str2 = m5Var.f323912m;
                    java.lang.String str3 = m5Var.f323908f;
                    m53.p3 p3Var = m5Var.f323911i;
                    if (p3Var != null) {
                        int i17 = p3Var.f323962d;
                        java.lang.String str4 = p3Var.f323963e;
                        m53.c6 c6Var = p3Var.f323964f;
                        com.tencent.mm.plugin.game.model.WeAppJumpInfo weAppJumpInfo2 = c6Var != null ? new com.tencent.mm.plugin.game.model.WeAppJumpInfo(c6Var.f323607d, c6Var.f323608e) : weAppJumpInfo;
                        m53.f3 f3Var = p3Var.f323965g;
                        localJumpInfo = new com.tencent.mm.plugin.game.model.LocalJumpInfo(i17, str4, weAppJumpInfo2, f3Var != null ? new com.tencent.mm.plugin.game.model.LocalHalfScreen(f3Var.f323676d, f3Var.f323677e, f3Var.f323678f) : null);
                    } else {
                        localJumpInfo = null;
                    }
                    list.add(new com.tencent.mm.plugin.game.model.LocalTabCornerSetting(str, str2, str3, localJumpInfo));
                    weAppJumpInfo = null;
                }
            }
            this.G = r5Var.B;
            a();
        }

        public final void a() {
            int i17 = this.f141166q;
            if (i17 == 1) {
                java.lang.Long valueOf = java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.r1((java.lang.Long) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_GAME_CHAT_ROOM_ENABLE_LONG, 0L)));
                com.tencent.mars.xlog.Log.i("MicroMsg.GameTabData2", "forceChatRoomEnable:%b", java.lang.Boolean.valueOf(valueOf.longValue() != 0 && java.lang.Math.abs(com.tencent.mm.sdk.platformtools.t8.H1(valueOf.longValue())) < 172800));
                this.f141175z = com.tencent.mm.plugin.game.ui.chat_tab.ChatRoomTabUI.class.getName();
                this.E = true;
                return;
            }
            if (i17 != 2) {
                if (i17 != 4) {
                    this.f141175z = "";
                    return;
                } else {
                    this.f141175z = com.tencent.mm.plugin.game.ui.LiteAppGameTabUI.class.getName();
                    return;
                }
            }
            if (com.tencent.mm.pluginsdk.model.g4.a()) {
                this.f141175z = com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI.class.getName();
            } else {
                this.f141175z = com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI.class.getName();
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            com.tencent.mm.plugin.game.model.LocalTabCornerSetting[] localTabCornerSettingArr;
            parcel.writeString(this.f141156d);
            parcel.writeString(this.f141157e);
            parcel.writeString(this.f141158f);
            parcel.writeString(this.f141159g);
            parcel.writeString(this.f141160h);
            parcel.writeString(this.f141161i);
            parcel.writeString(this.f141162m);
            parcel.writeString(this.f141163n);
            parcel.writeString(this.f141164o);
            parcel.writeString(this.f141165p);
            parcel.writeInt(this.f141166q);
            parcel.writeString(this.f141167r);
            parcel.writeParcelable(this.f141168s, i17);
            parcel.writeParcelable(this.f141169t, i17);
            parcel.writeByte(this.f141170u ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f141171v);
            parcel.writeByte(this.f141172w ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f141173x);
            parcel.writeParcelable(this.f141174y, i17);
            parcel.writeString(this.f141175z);
            parcel.writeInt(this.A);
            parcel.writeByte(this.E ? (byte) 1 : (byte) 0);
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                parcel.writeParcelableList(this.F, i17);
            } else {
                if (com.tencent.mm.sdk.platformtools.t8.L0(this.F)) {
                    localTabCornerSettingArr = null;
                } else {
                    localTabCornerSettingArr = new com.tencent.mm.plugin.game.model.LocalTabCornerSetting[this.F.size()];
                    this.F.toArray(localTabCornerSettingArr);
                }
                parcel.writeParcelableArray(localTabCornerSettingArr, i17);
            }
            parcel.writeByte(this.G ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.C ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.D);
        }

        public TabItem(org.json.JSONObject jSONObject) {
            this.B = 0;
            this.C = false;
            this.D = 0;
            this.E = false;
            this.G = false;
            if (jSONObject == null) {
                return;
            }
            this.f141156d = jSONObject.optString("Key");
            this.f141157e = jSONObject.optString("Title");
            this.f141158f = jSONObject.optString("TitleColor");
            this.f141159g = jSONObject.optString("SelectedTitleColor");
            this.f141160h = jSONObject.optString("DarkModeTitleColor");
            this.f141161i = jSONObject.optString("DarkModeSelectedTitleColor");
            this.f141162m = jSONObject.optString("IconUrl");
            this.f141163n = jSONObject.optString("SelectedIconUrl");
            this.f141164o = jSONObject.optString("DarkModeIconUrl");
            this.f141165p = jSONObject.optString("DarkModeSelectedIconUrl");
            this.f141166q = jSONObject.optInt("Type");
            this.f141167r = jSONObject.optString("JumpUrl");
            this.f141168s = new com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItemWeapp(jSONObject.optJSONObject("JumpWeapp"));
            this.f141169t = new com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItemReport(jSONObject.optJSONObject("Report"));
            this.f141170u = false;
            this.f141171v = 2;
            this.f141172w = false;
            this.f141173x = 2;
            this.f141174y = new com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItemLiteApp(jSONObject.optJSONObject("JumpLiteapp"));
            this.G = jSONObject.optBoolean("downloadIconDisabled");
            a();
        }

        public TabItem(android.os.Parcel parcel, com.tencent.mm.plugin.game.ui.chat_tab.k0 k0Var) {
            this.B = 0;
            this.C = false;
            this.D = 0;
            this.E = false;
            this.G = false;
            this.f141156d = parcel.readString();
            this.f141157e = parcel.readString();
            this.f141158f = parcel.readString();
            this.f141159g = parcel.readString();
            this.f141160h = parcel.readString();
            this.f141161i = parcel.readString();
            this.f141162m = parcel.readString();
            this.f141163n = parcel.readString();
            this.f141164o = parcel.readString();
            this.f141165p = parcel.readString();
            this.f141166q = parcel.readInt();
            this.f141167r = parcel.readString();
            this.f141168s = (com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItemWeapp) parcel.readParcelable(com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItemWeapp.class.getClassLoader());
            this.f141169t = (com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItemReport) parcel.readParcelable(com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItemReport.class.getClassLoader());
            this.f141170u = parcel.readByte() != 0;
            this.f141171v = parcel.readInt();
            this.f141172w = parcel.readByte() != 0;
            this.f141173x = parcel.readInt();
            this.f141174y = (com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItemLiteApp) parcel.readParcelable(com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItemLiteApp.class.getClassLoader());
            this.f141175z = parcel.readString();
            this.A = parcel.readInt();
            this.E = parcel.readByte() != 0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.F = arrayList;
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                parcel.readParcelableList(arrayList, com.tencent.mm.plugin.game.model.LocalTabCornerSetting.class.getClassLoader());
            } else {
                android.os.Parcelable[] readParcelableArray = parcel.readParcelableArray(com.tencent.mm.plugin.game.model.LocalTabCornerSetting.class.getClassLoader());
                if (readParcelableArray != null && readParcelableArray.length > 0) {
                    for (com.tencent.mm.plugin.game.model.LocalTabCornerSetting localTabCornerSetting : (com.tencent.mm.plugin.game.model.LocalTabCornerSetting[]) java.util.Arrays.copyOf(readParcelableArray, readParcelableArray.length, com.tencent.mm.plugin.game.model.LocalTabCornerSetting[].class)) {
                        this.F.add(localTabCornerSetting);
                    }
                }
            }
            this.G = parcel.readByte() != 0;
            this.C = parcel.readByte() != 0;
            this.D = parcel.readInt();
        }
    }
}

package nd2;

/* loaded from: classes10.dex */
public final class o implements io.flutter.plugin.platform.PlatformView {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f336448d;

    /* renamed from: e, reason: collision with root package name */
    public final long f336449e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.pigeon.live_cdn_player.LiveCDNPlayerEventCallback f336450f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f336451g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.FrameLayout f336452h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f336453i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView f336454m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.storage.FinderItem f336455n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f336456o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f336457p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f336458q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f336459r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f336460s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f336461t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f336462u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f336463v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f336464w;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public o(android.content.Context context, long j17, java.lang.Object obj, com.tencent.pigeon.live_cdn_player.LiveCDNPlayerEventCallback eventCallback) {
        ?? r66;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(eventCallback, "eventCallback");
        this.f336448d = context;
        this.f336449e = j17;
        this.f336450f = eventCallback;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.eis, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f336451g = inflate;
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.m7j);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f336452h = (android.widget.FrameLayout) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.cl6);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f336453i = (android.widget.ImageView) findViewById2;
        this.f336460s = true;
        this.f336462u = true;
        if (obj instanceof java.util.Map) {
            java.util.Map map = (java.util.Map) obj;
            java.lang.Object obj2 = map.get("commentScene");
            java.lang.Number number = obj2 instanceof java.lang.Number ? (java.lang.Number) obj2 : null;
            if (number != null) {
                number.intValue();
            }
            java.lang.Object obj3 = map.get(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
            java.lang.Number number2 = obj3 instanceof java.lang.Number ? (java.lang.Number) obj3 : null;
            if (number2 != null) {
                number2.intValue();
            }
            java.lang.Object obj4 = map.get("showCover");
            java.lang.Boolean bool = obj4 instanceof java.lang.Boolean ? (java.lang.Boolean) obj4 : null;
            this.f336460s = bool != null ? bool.booleanValue() : true;
            java.lang.Object obj5 = map.get("coverImgUrl");
            this.f336461t = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
            java.lang.Object obj6 = map.get("finderObjectData");
            byte[] bArr = obj6 instanceof byte[] ? (byte[]) obj6 : null;
            if (bArr != null) {
                try {
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) new com.tencent.mm.protocal.protobuf.FinderObject().parseFrom(bArr);
                    this.f336455n = finderObject != null ? com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0) : null;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MMLiveCDNPlayerContainer", "parse FinderObjectDataSource error: " + e17.getMessage());
                }
            } else {
                java.lang.Object obj7 = map.get("finderExportId");
                java.lang.String str = obj7 instanceof java.lang.String ? (java.lang.String) obj7 : null;
                if ((str == null || str.length() == 0) == true) {
                    com.tencent.mars.xlog.Log.i("MMLiveCDNPlayerContainer", "parse ExportDataSource: finderExportId is empty");
                } else {
                    this.f336457p = str;
                    java.lang.Object obj8 = map.get("feedObjectId");
                    this.f336458q = obj8 instanceof java.lang.String ? (java.lang.String) obj8 : null;
                    java.lang.Object obj9 = map.get("finderObjectNonceId");
                    this.f336459r = obj9 instanceof java.lang.String ? (java.lang.String) obj9 : null;
                    java.lang.Object obj10 = map.get("finderLiveExportObjectForJoinLiveBase64");
                    java.lang.String str2 = obj10 instanceof java.lang.String ? (java.lang.String) obj10 : null;
                    if ((str2 == null || str2.length() == 0) == true) {
                        this.f336455n = a(str, this.f336458q, this.f336459r);
                    } else {
                        try {
                            byte[] decode = android.util.Base64.decode(str2, 0);
                            r45.sp1 sp1Var = new r45.sp1();
                            sp1Var.parseFrom(decode);
                            this.f336455n = b(sp1Var);
                            this.f336456o = sp1Var.getString(7);
                            r66 = true;
                        } catch (java.lang.Exception e18) {
                            com.tencent.mars.xlog.Log.e("MMLiveCDNPlayerContainer", "parseLiveExportObjectBase64 error: " + e18.getMessage());
                            r66 = false;
                        }
                        if (r66 == false) {
                            this.f336455n = a(str, this.f336458q, this.f336459r);
                        }
                    }
                }
            }
        }
        this.f336453i.setVisibility(this.f336460s ? 0 : 8);
        if (this.f336460s) {
            java.lang.String str3 = this.f336461t;
            if ((str3 == null || str3.length() == 0) != true) {
                java.lang.String str4 = this.f336461t;
                kotlin.jvm.internal.o.d(str4);
                f(str4);
                return;
            }
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f336455n;
            if (finderItem != null) {
                r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(finderItem.getLiveMediaList());
                if (mb4Var == null) {
                    com.tencent.mars.xlog.Log.e("MMLiveCDNPlayerContainer", "liveMediaList is empty");
                    return;
                }
                java.lang.String string = mb4Var.getString(16);
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                string = string == null ? "" : string;
                java.lang.String string2 = mb4Var.getString(20);
                java.lang.String concat = string.concat(string2 == null ? "" : string2);
                if (com.tencent.mm.sdk.platformtools.t8.K0(concat)) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(mb4Var.getString(1));
                    java.lang.String string3 = mb4Var.getString(19);
                    sb6.append(string3 != null ? string3 : "");
                    concat = sb6.toString();
                }
                if (concat.length() == 0) {
                    com.tencent.mars.xlog.Log.e("MMLiveCDNPlayerContainer", "setCover coverUrl is empty");
                } else {
                    f(concat);
                }
            }
        }
    }

    public static /* synthetic */ void e(nd2.o oVar, java.lang.String str, java.lang.Double d17, java.lang.Double d18, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            d17 = null;
        }
        if ((i17 & 4) != 0) {
            d18 = null;
        }
        oVar.d(str, d17, d18);
    }

    public final com.tencent.mm.plugin.finder.storage.FinderItem a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.Long j17;
        try {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
            this.f336457p = str;
            finderObject.setId((str2 == null || (j17 = r26.h0.j(str2)) == null) ? 0L : j17.longValue());
            finderObject.setObjectNonceId(str3);
            finderObject.setLiveInfo(new r45.nw1());
            return com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MMLiveCDNPlayerContainer", "buildFinderItemFromExportId error: " + e17.getMessage());
            return null;
        }
    }

    public final com.tencent.mm.plugin.finder.storage.FinderItem b(r45.sp1 sp1Var) {
        try {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
            finderObject.setId(sp1Var.getLong(0));
            finderObject.setObjectNonceId(sp1Var.getString(4));
            r45.nw1 nw1Var = new r45.nw1();
            nw1Var.set(3, sp1Var.getString(7));
            nw1Var.set(0, java.lang.Long.valueOf(sp1Var.getLong(1)));
            finderObject.setLiveInfo(nw1Var);
            return com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MMLiveCDNPlayerContainer", "buildFinderItemFromLiveExportObject error: " + e17.getMessage());
            return null;
        }
    }

    public final void c() {
        com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = this.f336454m;
        if (nearbyLivePreviewView != null) {
            this.f336452h.removeView(nearbyLivePreviewView);
            nearbyLivePreviewView.release();
            nearbyLivePreviewView.r("completelyQuit");
            mn0.b0 b0Var = nearbyLivePreviewView.player;
            if (b0Var != null) {
                ((mn0.y) b0Var).w();
            }
        }
        this.f336454m = null;
    }

    public final void d(java.lang.String str, java.lang.Double d17, java.lang.Double d18) {
        pm0.v.X(new nd2.i(this, new com.tencent.pigeon.live_cdn_player.LiveCDNPlayerEvent(java.lang.Long.valueOf(this.f336449e), str, null, d17, d18, null, null, null, 228, null)));
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        com.tencent.mars.xlog.Log.i("MMLiveCDNPlayerContainer", "dispose viewId=" + this.f336449e);
        com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = this.f336454m;
        if (nearbyLivePreviewView != null) {
            nearbyLivePreviewView.stop();
        }
        c();
    }

    public final void f(java.lang.String str) {
        if (str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MMLiveCDNPlayerContainer", "setCoverFromUrl coverUrl is empty");
        } else {
            mn2.g1 g1Var = mn2.g1.f329975a;
            g1Var.e().c(new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128355e), this.f336453i, g1Var.h(mn2.f1.f329953d));
        }
    }

    public final void g(java.lang.String str) {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem;
        com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView = this.f336454m;
        if (nearbyLivePreviewView != null && nearbyLivePreviewView.isPlaying()) {
            com.tencent.mars.xlog.Log.i("MMLiveCDNPlayerContainer", "startPlayInternal playerView is playing");
            return;
        }
        if (str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MMLiveCDNPlayerContainer", "startPlayInternal url is empty");
            return;
        }
        com.tencent.mars.xlog.Log.i("MMLiveCDNPlayerContainer", "startPlayInternal url=" + str);
        c();
        if (this.f336454m == null && (finderItem = this.f336455n) != null) {
            com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView2 = new com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView(this.f336448d, 1);
            nearbyLivePreviewView2.setTag("nearby-live-preview-view-tag");
            nearbyLivePreviewView2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
            this.f336454m = nearbyLivePreviewView2;
            gp2.a aVar = new gp2.a(str, new so2.h1(finderItem), false);
            com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView3 = this.f336454m;
            if (nearbyLivePreviewView3 != null) {
                nearbyLivePreviewView3.setMediaSource(aVar);
            }
            this.f336452h.addView(this.f336454m);
        }
        com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView4 = this.f336454m;
        if (nearbyLivePreviewView4 != null) {
            nearbyLivePreviewView4.setMute(this.f336462u);
        }
        com.tencent.mm.plugin.finder.nearby.live.view.NearbyLivePreviewView nearbyLivePreviewView5 = this.f336454m;
        if (nearbyLivePreviewView5 != null) {
            ws5.f.j(nearbyLivePreviewView5, new nd2.j(this), new nd2.k(this), new nd2.l(this), null, new nd2.m(this), new nd2.n(this), 8, null);
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public android.view.View getView() {
        return this.f336451g;
    }
}

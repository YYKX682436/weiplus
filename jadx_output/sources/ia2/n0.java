package ia2;

/* loaded from: classes2.dex */
public final class n0 implements io.flutter.embedding.engine.plugins.FlutterPlugin, com.tencent.pigeon.finder.POINativeAPI {

    /* renamed from: d, reason: collision with root package name */
    public final int f289953d;

    /* renamed from: e, reason: collision with root package name */
    public final int f289954e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.pigeon.finder.POIFlutterAPI f289955f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.pigeon.finder.POIFlutterDataReport f289956g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f289957h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.ref.WeakReference f289958i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.ref.WeakReference f289959m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader f289960n;

    /* renamed from: o, reason: collision with root package name */
    public long f289961o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.Map f289962p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f289963q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f289964r;

    /* renamed from: s, reason: collision with root package name */
    public r45.f96 f289965s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f289966t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.Map f289967u;

    /* renamed from: v, reason: collision with root package name */
    public final ia2.j0 f289968v;

    public n0(int i17, int i18, androidx.appcompat.app.AppCompatActivity context, ia2.o0 delegate) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(delegate, "delegate");
        this.f289953d = i17;
        this.f289954e = i18;
        this.f289957h = true;
        this.f289962p = new java.util.LinkedHashMap();
        this.f289963q = new java.util.LinkedHashMap();
        this.f289966t = "";
        this.f289967u = new java.util.LinkedHashMap();
        this.f289958i = new java.lang.ref.WeakReference(context);
        this.f289959m = new java.lang.ref.WeakReference(delegate);
        this.f289968v = new ia2.j0(this);
    }

    public final java.lang.String a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("ref_commenscene", this.f289954e);
        jSONObject.put("ref_json", jSONObject2);
        java.lang.String jSONObject3 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        return jSONObject3;
    }

    public final com.tencent.pigeon.finder.POIStreamUpdateData b(int i17, int i18, com.tencent.mm.plugin.finder.feed.model.internal.IResponse iResponse, boolean z17) {
        java.lang.Iterable<so2.j5> incrementList;
        com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader finderPoiFeedLoader = (com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader) ((java.util.LinkedHashMap) this.f289962p).get(e(i17, i18));
        if (z17) {
            if (finderPoiFeedLoader != null) {
                incrementList = finderPoiFeedLoader.getDataList();
            }
            incrementList = null;
        } else {
            if (iResponse != null) {
                incrementList = iResponse.getIncrementList();
            }
            incrementList = null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (incrementList != null) {
            for (so2.j5 j5Var : incrementList) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var : null;
                if (baseFinderFeed != null) {
                    com.tencent.mm.protocal.protobuf.FinderObject feedObject = baseFinderFeed.getFeedObject().getFeedObject();
                    com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
                    finderObject.setId(feedObject.getId());
                    finderObject.setNickname(feedObject.getNickname());
                    finderObject.setUsername(feedObject.getUsername());
                    finderObject.setObjectNonceId(feedObject.getObjectNonceId());
                    finderObject.setObject_extend(feedObject.getObject_extend());
                    finderObject.setObjectDesc(feedObject.getObjectDesc());
                    finderObject.setLiveInfo(feedObject.getLiveInfo());
                    finderObject.setContact(feedObject.getContact());
                    finderObject.setLikeCount(feedObject.getLikeCount());
                    finderObject.setFavCount(feedObject.getFavCount());
                    finderObject.setFavFlag(feedObject.getFavFlag());
                    arrayList.add(finderObject.toByteArray());
                }
            }
        }
        com.tencent.mars.xlog.Log.i("FinderPOIPlugin", "generateUpdateData: " + this.f289964r + ' ' + z17);
        java.lang.Object response = iResponse != null ? iResponse.getResponse() : null;
        r45.zo2 zo2Var = response instanceof r45.zo2 ? (r45.zo2) response : null;
        r45.xo2 xo2Var = zo2Var != null ? (r45.xo2) zo2Var.getCustom(15) : null;
        if (xo2Var == null && z17) {
            if ((finderPoiFeedLoader != null ? finderPoiFeedLoader.f107542o : null) != null) {
                xo2Var = new r45.xo2();
                xo2Var.set(1, finderPoiFeedLoader.f107543p);
                java.lang.Integer num = finderPoiFeedLoader.f107542o;
                xo2Var.set(0, java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
            }
        }
        return new com.tencent.pigeon.finder.POIStreamUpdateData(arrayList, xo2Var != null ? xo2Var.toByteArray() : null, (zo2Var != null ? zo2Var.getInteger(14) : 0) > 0, z17, zo2Var != null ? zo2Var.getInteger(16) : 0);
    }

    public final r45.qt2 c() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) this.f289958i.get();
        if (appCompatActivity == null) {
            return null;
        }
        return ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).wi(appCompatActivity);
    }

    @Override // com.tencent.pigeon.finder.POINativeAPI
    public void callNativeShowMoreMenuPanel() {
        z80.s0 s0Var;
        ia2.o0 o0Var = (ia2.o0) this.f289959m.get();
        if (o0Var != null) {
            com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity = (com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) o0Var;
            z80.n0 n0Var = (z80.n0) i95.n0.c(z80.n0.class);
            java.lang.ref.WeakReference weakReference = finderFlutterPOIActivity.f101781u;
            android.app.Activity context = weakReference != null ? (androidx.fragment.app.FragmentActivity) weakReference.get() : null;
            if (context == null) {
                context = finderFlutterPOIActivity.getContainerActivity();
            }
            ia2.e eVar = new ia2.e(finderFlutterPOIActivity);
            y80.n1 n1Var = (y80.n1) n0Var;
            n1Var.getClass();
            kotlin.jvm.internal.o.g(context, "context");
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) context, 0, false);
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            java.lang.Integer num = finderFlutterPOIActivity.E1;
            int intValue = num != null ? num.intValue() : 0;
            com.tencent.mm.plugin.location.model.LocationInfo locationInfo = eVar.f289916a;
            if ((intValue == 6 || intValue == 8 || intValue == 11) && ia2.e0.a(locationInfo)) {
                linkedHashSet.add(new z80.v0(z80.u0.f470678e, true));
            } else {
                linkedHashSet.add(new z80.v0(z80.u0.f470677d, com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity.d7(finderFlutterPOIActivity)));
            }
            java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
            java.lang.Integer num2 = finderFlutterPOIActivity.E1;
            int intValue2 = num2 != null ? num2.intValue() : 0;
            linkedHashSet2.add(new z80.v0(z80.u0.f470679f, false));
            if (intValue2 != 4 && !com.tencent.mm.sdk.platformtools.t8.K0(locationInfo.f144589h) && !ia2.e0.a(locationInfo)) {
                linkedHashSet2.add(new z80.v0(z80.u0.f470680g, com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity.d7(finderFlutterPOIActivity)));
            }
            z80.s0 s0Var2 = new z80.s0(linkedHashSet, linkedHashSet2, eVar.f289916a, (com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity.d7(finderFlutterPOIActivity) || ia2.e0.a(locationInfo)) ? false : true, new ia2.c(eVar), new ia2.d(eVar));
            if (s0Var2.f470672d) {
                ((com.tencent.mm.pluginsdk.forward.m) ((o25.y1) i95.n0.c(o25.y1.class))).getClass();
                s0Var = s0Var2;
                new com.tencent.mm.pluginsdk.forward.m().Di(context, k0Var, 1, null, new y80.h1(s0Var2.f470671c, context, s0Var2, n1Var));
            } else {
                s0Var = s0Var2;
            }
            k0Var.f211872n = new y80.i1(s0Var, n1Var);
            k0Var.f211881s = new y80.j1(n1Var, context, s0Var);
            k0Var.f211874o = new y80.k1(s0Var, n1Var);
            k0Var.f211884v = new y80.l1(n1Var, context, s0Var);
            k0Var.v();
        }
    }

    public final long d(long j17, long j18, long j19, long j27) {
        com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader g17 = g((int) j19, (int) j27);
        if (j18 <= 0) {
            return j17;
        }
        java.lang.Integer num = g17.f107542o;
        int intValue = num != null ? num.intValue() : 0;
        long j28 = j17 + intValue;
        return g17.getDataList().get(intValue) instanceof so2.l4 ? j28 + 1 : j28;
    }

    public final java.lang.String e(int i17, int i18) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(i17);
        sb6.append('_');
        sb6.append(i18);
        return sb6.toString();
    }

    public final void f(java.lang.String str, int i17) {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) this.f289958i.get();
        if (appCompatActivity == null) {
            return;
        }
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
        yw.h1.f466332a.s(new com.tencent.pigeon.biz_base.BizArticleInfo(null, null, null, null, 332L, java.lang.Long.valueOf(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT), str, java.lang.Long.valueOf(i17), null, null, null, null, null, null, null, null, null, null, 261903, null), appCompatActivity);
    }

    public final com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader g(int i17, int i18) {
        r45.bp2 bp2Var;
        java.util.LinkedList list;
        java.lang.String e17 = e(i17, i18);
        java.util.Map map = this.f289962p;
        com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader finderPoiFeedLoader = (com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader) ((java.util.LinkedHashMap) map).get(e17);
        if (finderPoiFeedLoader == null) {
            finderPoiFeedLoader = new com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader(c());
            finderPoiFeedLoader.onAlive();
            com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader finderPoiFeedLoader2 = this.f289960n;
            if (finderPoiFeedLoader2 != null) {
                int i19 = 0;
                r45.ap2 ap2Var = (finderPoiFeedLoader2 == null || (bp2Var = finderPoiFeedLoader2.f107546s) == null || (list = bp2Var.getList(0)) == null) ? null : (r45.ap2) list.get(i17);
                finderPoiFeedLoader.f107538h = ap2Var != null ? ap2Var.getInteger(0) : 0;
                finderPoiFeedLoader.f107539i = i17;
                finderPoiFeedLoader.setLastBuffer(null);
                com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader finderPoiFeedLoader3 = this.f289960n;
                kotlin.jvm.internal.o.d(finderPoiFeedLoader3);
                finderPoiFeedLoader.f107535e = finderPoiFeedLoader3.f107535e;
                com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader finderPoiFeedLoader4 = this.f289960n;
                kotlin.jvm.internal.o.d(finderPoiFeedLoader4);
                finderPoiFeedLoader.f107541n = finderPoiFeedLoader4.f107541n;
                com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader finderPoiFeedLoader5 = this.f289960n;
                finderPoiFeedLoader.f107536f = finderPoiFeedLoader5 != null ? finderPoiFeedLoader5.f107536f : null;
                finderPoiFeedLoader.f107537g = finderPoiFeedLoader5 != null ? finderPoiFeedLoader5.f107537g : null;
                if (ap2Var != null && i18 < ap2Var.getList(2).size()) {
                    i19 = ((r45.vo2) ap2Var.getList(2).get(i18)).getInteger(0);
                }
                finderPoiFeedLoader.f107540m = i19;
            }
            map.put(e17, finderPoiFeedLoader);
        }
        return finderPoiFeedLoader;
    }

    @Override // com.tencent.pigeon.finder.POINativeAPI
    public com.tencent.pigeon.finder.POIUserLocationInfo getUserLocationInfoFromNativeMap() {
        ia2.o0 o0Var = (ia2.o0) this.f289959m.get();
        if (o0Var == null) {
            return null;
        }
        yz5.a aVar = ((com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) o0Var).S;
        com.tencent.mm.plugin.location.model.LocationInfo locationInfo = aVar != null ? (com.tencent.mm.plugin.location.model.LocationInfo) aVar.invoke() : null;
        if (locationInfo == null || !locationInfo.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderFlutterPOIActivity", "getUserLocationFromMap: not Valid");
            return null;
        }
        com.tencent.pigeon.finder.POIUserLocationInfo pOIUserLocationInfo = new com.tencent.pigeon.finder.POIUserLocationInfo(locationInfo.f144587f, locationInfo.f144586e, 0.0d, 0.0d);
        pOIUserLocationInfo.getLatitude();
        pOIUserLocationInfo.getLongitude();
        return pOIUserLocationInfo;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(r45.f96 r20, zy2.o9 r21, long r22, java.lang.Integer r24, int r25, java.lang.String r26, yz5.p r27, yz5.a r28) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ia2.n0.h(r45.f96, zy2.o9, long, java.lang.Integer, int, java.lang.String, yz5.p, yz5.a):void");
    }

    @Override // com.tencent.pigeon.finder.POINativeAPI
    public void makePhoneCall(java.lang.String phoneNumber) {
        kotlin.jvm.internal.o.g(phoneNumber, "phoneNumber");
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) this.f289958i.get();
        if (appCompatActivity == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.autogen.events.ShowPhoneMenuEvent showPhoneMenuEvent = new com.tencent.mm.autogen.events.ShowPhoneMenuEvent();
        am.ru ruVar = showPhoneMenuEvent.f54783g;
        ruVar.f7843a = appCompatActivity;
        ruVar.f7844b = phoneNumber;
        ruVar.f7846d = bundle;
        showPhoneMenuEvent.e();
    }

    @Override // com.tencent.pigeon.finder.POINativeAPI
    public void onAddressEntranceTap() {
        com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity;
        gx2.q qVar;
        ia2.o0 o0Var = (ia2.o0) this.f289959m.get();
        if (o0Var == null || (qVar = (finderFlutterPOIActivity = (com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) o0Var).f101776J) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.view.drawer.FinderDraggableLayout.b(qVar, true, null, false, new ia2.j(finderFlutterPOIActivity), 6, null);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.finder.POINativeAPI.Companion companion = com.tencent.pigeon.finder.POINativeAPI.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.finder.POINativeAPI.Companion.setUp$default(companion, binaryMessenger, this, null, 4, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger2 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger2, "getBinaryMessenger(...)");
        this.f289955f = new com.tencent.pigeon.finder.POIFlutterAPI(binaryMessenger2, null, 2, null);
        io.flutter.plugin.common.BinaryMessenger binaryMessenger3 = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger3, "getBinaryMessenger(...)");
        this.f289956g = new com.tencent.pigeon.finder.POIFlutterDataReport(binaryMessenger3, null, 2, null);
    }

    @Override // com.tencent.pigeon.finder.POINativeAPI
    public void onChangeFavoriteState(boolean z17) {
        android.content.Intent intent;
        ia2.o0 o0Var = (ia2.o0) this.f289959m.get();
        if (o0Var != null) {
            com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity = (com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) o0Var;
            finderFlutterPOIActivity.A = z17;
            finderFlutterPOIActivity.B = ((com.tencent.mm.plugin.fav.ui.la) ((o72.a5) i95.n0.c(o72.a5.class))).wi(finderFlutterPOIActivity.k7());
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderFlutterPOIActivity", "doFavorite favId=" + finderFlutterPOIActivity.B + ", isFavorite=" + finderFlutterPOIActivity.A);
            if (!finderFlutterPOIActivity.A) {
                com.tencent.mm.autogen.events.DeleteFavoriteEvent deleteFavoriteEvent = new com.tencent.mm.autogen.events.DeleteFavoriteEvent();
                int i17 = finderFlutterPOIActivity.B;
                am.w3 w3Var = deleteFavoriteEvent.f54084g;
                w3Var.f8259b = i17;
                w3Var.f8260c = 9;
                w3Var.f8261d = "";
                deleteFavoriteEvent.e();
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("kfavorite", true);
            r45.f96 f96Var = finderFlutterPOIActivity.f101784x;
            if (f96Var != null) {
                java.lang.String string = f96Var.getString(3);
                intent2.putExtra("kPoiName", string != null ? string : "");
                intent2.putExtra("kwebmap_slat", f96Var.getFloat(1));
                intent2.putExtra("kwebmap_lng", f96Var.getFloat(0));
                intent2.putExtra("Kwebmap_locaion", f96Var.getString(4));
                intent2.putExtra("kPoiid", f96Var.getString(5));
                intent2.putExtra("KIsFromPoiList", f96Var.getBoolean(16));
                intent2.putExtra("KPoiCategoryTips", f96Var.getString(17));
                intent2.putExtra("kPoiBusinessHour", f96Var.getString(18));
                intent2.putExtra("KPoiPhone", f96Var.getString(19));
                intent2.putExtra("KPoiPriceTips", f96Var.getFloat(20));
            }
            androidx.appcompat.app.AppCompatActivity context = finderFlutterPOIActivity.getContext();
            if (context != null && (intent = context.getIntent()) != null) {
                java.lang.String stringExtra = intent.getStringExtra("kBuildingID");
                if (stringExtra != null) {
                    intent2.putExtra("kBuildingID", stringExtra);
                }
                java.lang.String stringExtra2 = intent.getStringExtra("kFloorName");
                if (stringExtra2 != null) {
                    intent2.putExtra("kFloorName", stringExtra2);
                }
                java.lang.String stringExtra3 = intent.getStringExtra("kRemark");
                if (stringExtra3 != null) {
                    intent2.putExtra("kRemark", stringExtra3);
                }
            }
            com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
            ((com.tencent.mm.pluginsdk.model.b2) ((o72.c5) i95.n0.c(o72.c5.class))).getClass();
            com.tencent.mm.pluginsdk.model.a2.l(doFavoriteEvent, intent2);
            am.c4 c4Var = doFavoriteEvent.f54090g;
            r45.bq0 bq0Var = c4Var.f6315a;
            r45.jq0 jq0Var = bq0Var != null ? bq0Var.f370962d : null;
            if (jq0Var != null) {
                jq0Var.i(finderFlutterPOIActivity.k7());
            }
            c4Var.f6323i = finderFlutterPOIActivity.getContext();
            c4Var.f6327m = 42;
            doFavoriteEvent.e();
        }
    }

    @Override // com.tencent.pigeon.finder.POINativeAPI
    public void onChangeScrollState(boolean z17) {
        this.f289957h = z17;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding binding) {
        kotlin.jvm.internal.o.g(binding, "binding");
        com.tencent.pigeon.finder.POINativeAPI.Companion companion = com.tencent.pigeon.finder.POINativeAPI.INSTANCE;
        io.flutter.plugin.common.BinaryMessenger binaryMessenger = binding.getBinaryMessenger();
        kotlin.jvm.internal.o.f(binaryMessenger, "getBinaryMessenger(...)");
        com.tencent.pigeon.finder.POINativeAPI.Companion.setUp$default(companion, binaryMessenger, null, null, 4, null);
        this.f289955f = null;
        this.f289956g = null;
    }

    @Override // com.tencent.pigeon.finder.POINativeAPI
    public void onETATap(java.lang.String weAppId, java.lang.String weAppUrl) {
        kotlin.jvm.internal.o.g(weAppId, "weAppId");
        kotlin.jvm.internal.o.g(weAppUrl, "weAppUrl");
        ia2.o0 o0Var = (ia2.o0) this.f289959m.get();
        if (o0Var != null) {
            z80.r0 r0Var = new z80.r0(weAppId, weAppUrl, 1146);
            z80.l0 l0Var = (z80.l0) i95.n0.c(z80.l0.class);
            androidx.appcompat.app.AppCompatActivity context = ((com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) o0Var).getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((y80.a1) l0Var).wi(context, r0Var);
        }
    }

    @Override // com.tencent.pigeon.finder.POINativeAPI
    public void onFeedExpose(long j17, long j18, long j19, long j27, boolean z17, double d17, double d18, double d19, double d27) {
        com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader finderPoiFeedLoader;
        long j28;
        long j29;
        com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader g17 = g((int) j19, (int) j27);
        long d28 = d(j17, j18, j19, j27);
        if (d28 >= g17.getDataList().size()) {
            com.tencent.mars.xlog.Log.e("FinderPOIPlugin", "onFeedExpose - indexInTotalList:" + d28 + " is out of range:" + g17.getDataList().size());
            return;
        }
        int i17 = (int) d28;
        java.lang.Object obj = g17.getDataList().get(i17);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        if (baseFinderFeed == null) {
            com.tencent.mars.xlog.Log.e("FinderPOIPlugin", "cannot get feed at indexInTotalList: " + d28 + ", sectionIndex: " + j18 + ", tabIndex: " + j19);
            return;
        }
        java.util.Map map = this.f289963q;
        if (z17) {
            finderPoiFeedLoader = g17;
        } else {
            finderPoiFeedLoader = g17;
            map.put(java.lang.Long.valueOf(baseFinderFeed.getItemId()), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        ia2.r0[] r0VarArr = ia2.r0.f289976d;
        int i18 = z17 ? 0 : 1;
        com.tencent.mars.xlog.Log.i("FinderPOIPlugin", "reportFlowExpose, itemIndex: " + j17 + ", sectionIndex: " + j18 + ", indexInTotalList:" + d28 + " tabIndex: " + j19 + ", isEnd: " + z17);
        if (z17) {
            java.lang.Long l17 = (java.lang.Long) ((java.util.LinkedHashMap) map).get(java.lang.Long.valueOf(baseFinderFeed.getItemId()));
            if (l17 == null) {
                com.tencent.mars.xlog.Log.e("FinderPOIPlugin", "feed at itemIndex: " + j17 + ", sectionIndex: " + j18 + ", indexInTotalList:" + d28 + " tabIndex: " + j19 + " has no expose timestamp!");
                return;
            }
            j28 = l17.longValue();
            map.remove(java.lang.Long.valueOf(baseFinderFeed.getItemId()));
            j29 = java.lang.System.currentTimeMillis();
        } else {
            j28 = 0;
            j29 = 0;
        }
        r45.qt2 c17 = c();
        if (c17 == null) {
            return;
        }
        com.tencent.mm.plugin.finder.report.f5 f5Var = new com.tencent.mm.plugin.finder.report.f5(baseFinderFeed.getItemId(), j28, baseFinderFeed.getFeedObject());
        f5Var.f125031i = j29;
        f5Var.f125029g = new in5.v0((int) d17, (int) d19, (int) d27);
        com.tencent.mm.plugin.finder.report.r0.f125279q.d(c17, f5Var, baseFinderFeed.getUdfKv(), !z17);
        r45.ni4 ni4Var = new r45.ni4();
        ni4Var.set(0, java.lang.Long.valueOf(baseFinderFeed.getItemId()));
        ni4Var.set(6, java.lang.Integer.valueOf(i17));
        ni4Var.set(4, ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(baseFinderFeed.getItemId(), null, c17.getInteger(5)));
        ni4Var.set(11, java.lang.Integer.valueOf(i18));
        ni4Var.set(5, java.lang.Integer.valueOf((int) (j29 - j28)));
        so2.h3 h3Var = so2.h3.f410392d;
        h3Var.f(ni4Var, c17.getInteger(5), c17.getInteger(7));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(ni4Var);
        h3Var.d(linkedList);
        java.lang.Object obj2 = finderPoiFeedLoader.getDataList().get(i17);
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = obj2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj2 : null;
        if (baseFinderFeed2 == null || !zl2.q4.f473933a.C(baseFinderFeed2)) {
            return;
        }
        i95.m c18 = i95.n0.c(zy2.zb.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        zy2.zb.E9((zy2.zb) c18, baseFinderFeed2, ml2.x1.f328202f, java.lang.String.valueOf(this.f289953d), a(), null, 0, 48, null);
    }

    @Override // com.tencent.pigeon.finder.POINativeAPI
    public void onFeedTap(long j17, long j18, long j19, long j27, java.lang.String visibleCellsInfoJSON) {
        java.lang.String str;
        so2.j5 j5Var;
        java.lang.String str2;
        int i17;
        com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader finderPoiFeedLoader;
        com.tencent.mm.plugin.finder.report.l0 l0Var;
        java.lang.String str3;
        r45.jq4 jq4Var;
        int i18;
        com.tencent.mm.plugin.finder.report.l0 l0Var2;
        so2.j5 j5Var2;
        java.lang.String str4;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        java.lang.String nickName;
        kotlin.jvm.internal.o.g(visibleCellsInfoJSON, "visibleCellsInfoJSON");
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) this.f289958i.get();
        if (appCompatActivity == null) {
            return;
        }
        com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader g17 = g((int) j19, (int) j27);
        long d17 = d(j17, j18, j19, j27);
        if (d17 >= g17.getDataList().size()) {
            com.tencent.mars.xlog.Log.e("FinderPOIPlugin", "indexInTotalList:" + d17 + " is out of range");
            return;
        }
        int i19 = (int) d17;
        so2.j5 j5Var3 = (so2.j5) g17.getDataList().get(i19);
        if (!(j5Var3 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed)) {
            com.tencent.mars.xlog.Log.e("FinderPOIPlugin", "feed is not a BaseFinderFeed");
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderPOIPlugin", "onFeedTap, itemIndex: " + j17 + ", sectionIndex: " + j18 + ", indexInTotalList:" + d17 + ", tabIndex: " + j19);
        r45.qt2 c17 = c();
        com.tencent.mm.plugin.finder.report.l0 l0Var3 = com.tencent.mm.plugin.finder.report.l0.f125109a;
        if (c17 != null) {
            i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var3;
            str = "getService(...)";
            str2 = "FinderPOIPlugin";
            i17 = i19;
            finderPoiFeedLoader = g17;
            com.tencent.mm.plugin.finder.report.o3.wj((com.tencent.mm.plugin.finder.report.o3) c18, c17, baseFinderFeed.getFeedObject().getId(), baseFinderFeed.w(), null, 0, null, 0L, visibleCellsInfoJSON, 120, null);
            l0Var = l0Var3;
            j5Var = j5Var3;
            l0Var.b(c17, j5Var, 18);
        } else {
            str = "getService(...)";
            j5Var = j5Var3;
            str2 = "FinderPOIPlugin";
            i17 = i19;
            finderPoiFeedLoader = g17;
            l0Var = l0Var3;
        }
        boolean z17 = ((java.lang.Number) ae2.in.f3688a.s().r()).intValue() == 1 && !((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).zk();
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
        boolean C = zl2.q4.f473933a.C(baseFinderFeed2);
        int i27 = this.f289953d;
        r9 = null;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = null;
        str3 = "";
        if (!C || z17) {
            r45.dm2 object_extend = baseFinderFeed2.getFeedObject().getFeedObject().getObject_extend();
            if (object_extend != null && (jq4Var = (r45.jq4) object_extend.getCustom(54)) != null) {
                java.lang.String string = jq4Var.getString(0);
                f(string != null ? string : "", jq4Var.getInteger(1));
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader finderPoiFeedLoader2 = finderPoiFeedLoader;
            r45.f96 f96Var = finderPoiFeedLoader2.f107535e;
            intent.putExtra("key_location", f96Var != null ? f96Var.toByteArray() : null);
            intent.putExtra("key_from_type", zy2.o9.f477516d);
            intent.putExtra("key_from_scene", finderPoiFeedLoader2.f107537g);
            intent.putExtra("key_tab_id", finderPoiFeedLoader2.f107538h);
            intent.putExtra("key_enable_mixed_timeline_with_liveroom", z17);
            java.lang.String stringExtra = intent.getStringExtra("key_extra_info");
            str3 = stringExtra != null ? stringExtra : "";
            org.json.JSONObject jSONObject = str3.length() > 0 ? new org.json.JSONObject(str3) : new org.json.JSONObject();
            jSONObject.put("ref_commentscene", i27);
            java.lang.String jSONObject2 = jSONObject.toString();
            kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
            intent.putExtra("key_extra_info", r26.i0.t(jSONObject2, ",", ";", false));
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader.saveCache$default(finderPoiFeedLoader2, intent, i17, null, 4, null);
            if (!((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Jk()) {
                ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).Xk(appCompatActivity, intent);
                return;
            }
            wd0.q1 q1Var = (wd0.q1) i95.n0.c(wd0.q1.class);
            ia2.f0 f0Var = new ia2.f0(appCompatActivity, intent);
            ((vd0.j2) q1Var).getClass();
            v24.o0.h(appCompatActivity, 34359738368L, null, f0Var, 3);
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(baseFinderFeed2.getFeedObject().getUserName(), xy2.c.e(appCompatActivity))) {
            i95.m c19 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
            java.lang.String str5 = str;
            kotlin.jvm.internal.o.f(c19, str5);
            c61.ub ubVar = (c61.ub) c19;
            long id6 = baseFinderFeed2.getFeedObject().getId();
            java.lang.String objectNonceId = baseFinderFeed2.getFeedObject().getObjectNonceId();
            r45.nw1 liveInfo = baseFinderFeed2.getFeedObject().getLiveInfo();
            if (liveInfo == null) {
                liveInfo = new r45.nw1();
            }
            str4 = str5;
            i18 = i27;
            l0Var2 = l0Var;
            j5Var2 = j5Var;
            c61.ub.Rf(ubVar, appCompatActivity, id6, objectNonceId, liveInfo, null, null, null, null, baseFinderFeed2.g0(), null, null, 1776, null);
        } else {
            i18 = i27;
            l0Var2 = l0Var;
            j5Var2 = j5Var;
            str4 = str;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(j5Var2);
            android.content.Intent intent2 = new android.content.Intent();
            jz5.l Ai = ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ai(arrayList, j5Var2);
            java.util.List list = (java.util.List) Ai.f302833d;
            int intValue = ((java.lang.Number) Ai.f302834e).intValue();
            r45.wk0 wk0Var = new r45.wk0();
            wk0Var.set(0, "");
            wk0Var.set(1, "");
            wk0Var.set(2, java.lang.Boolean.FALSE);
            wk0Var.set(3, -1);
            wk0Var.set(4, -1);
            wk0Var.set(5, 1);
            r45.y74 y74Var = new r45.y74();
            y74Var.set(1, java.lang.Integer.valueOf(i18));
            boolean z18 = j5Var2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = z18 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2 : null;
            if (baseFinderFeed3 != null && (feedObject2 = baseFinderFeed3.getFeedObject()) != null && (nickName = feedObject2.getNickName()) != null) {
                str3 = nickName;
            }
            y74Var.set(2, str3);
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed4 = z18 ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2 : null;
            if (baseFinderFeed4 != null && (feedObject = baseFinderFeed4.getFeedObject()) != null) {
                finderObject = feedObject.getFeedObject();
            }
            y74Var.set(5, finderObject);
            wk0Var.set(6, y74Var);
            java.lang.String a17 = a();
            i95.m c27 = i95.n0.c(zy2.zb.class);
            kotlin.jvm.internal.o.f(c27, str4);
            zy2.zb.s3((zy2.zb) c27, (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2, -1L, ml2.x1.f328207n, java.lang.String.valueOf(i18), a17, null, 32, null);
            intent2.putExtra("key_chnl_extra", a17);
            ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ni(appCompatActivity, intent2, list, intValue, wk0Var, null);
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        i95.m c28 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c28, str4);
        com.tencent.mm.plugin.finder.report.o3.wj((com.tencent.mm.plugin.finder.report.o3) c28, V6, j5Var2.getItemId(), ((com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var2).w(), null, 0, null, 0L, visibleCellsInfoJSON, 120, null);
        l0Var2.b(V6, j5Var2, 18);
        com.tencent.mars.xlog.Log.i(str2, "onGridItemClick return for live feed, commentScene:" + i18);
    }

    @Override // com.tencent.pigeon.finder.POINativeAPI
    public void onFlutterUIParamUpdate(long j17, double d17) {
        ia2.o0 o0Var = (ia2.o0) this.f289959m.get();
        if (o0Var != null) {
            com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity = (com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) o0Var;
            com.tencent.mars.xlog.Log.i("MicroMsg.FinderFlutterPOIActivity", "onFlutterUIParamUpdate: " + j17 + ", " + d17);
            long raw = (long) com.tencent.pigeon.finder.POINativeParamKey.HEAD_VIEW_HEIGHT_ON_SHRINK.getRaw();
            kotlinx.coroutines.y0 y0Var = finderFlutterPOIActivity.f101779p1;
            if (j17 == raw) {
                if (finderFlutterPOIActivity.D) {
                    return;
                }
                ia2.k kVar = new ia2.k(finderFlutterPOIActivity, d17);
                kotlinx.coroutines.r2 r2Var = finderFlutterPOIActivity.f101786x1;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                finderFlutterPOIActivity.f101786x1 = kotlinx.coroutines.l.d(y0Var, null, null, new ia2.d0(finderFlutterPOIActivity, d17, kVar, null), 3, null);
                return;
            }
            if (j17 != com.tencent.pigeon.finder.POINativeParamKey.HEAD_VIEW_HEIGHT_ON_EXPAND.getRaw() || finderFlutterPOIActivity.C) {
                return;
            }
            ia2.l lVar = new ia2.l(finderFlutterPOIActivity, d17);
            kotlinx.coroutines.r2 r2Var2 = finderFlutterPOIActivity.f101789y1;
            if (r2Var2 != null) {
                kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
            }
            finderFlutterPOIActivity.f101789y1 = kotlinx.coroutines.l.d(y0Var, null, null, new ia2.c0(finderFlutterPOIActivity, d17, lVar, null), 3, null);
        }
    }

    @Override // com.tencent.pigeon.finder.POINativeAPI
    public void onForwardButtonTap() {
    }

    @Override // com.tencent.pigeon.finder.POINativeAPI
    public void onMpFeedTap(long j17, long j18) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        android.content.Context context = (androidx.appcompat.app.AppCompatActivity) this.f289958i.get();
        if (context == null) {
            return;
        }
        int i17 = (int) j18;
        bw5.sf sfVar = i17 != 0 ? i17 != 1 ? i17 != 2 ? null : bw5.sf.FinderFeedTabTypeCount : bw5.sf.FinderFeedTabTypeLatest : bw5.sf.FinderFeedTabTypeRecommend;
        if (sfVar == null) {
            return;
        }
        java.util.Map map = this.f289967u;
        if (map.size() > j18) {
            java.util.List list = (java.util.List) ((java.util.LinkedHashMap) map).get(sfVar);
            if (list == null || list.size() <= j17) {
                com.tencent.mars.xlog.Log.e("FinderPOIPlugin", "onFeedTapItemIndex not found");
                return;
            }
            bw5.li0 li0Var = (bw5.li0) list.get((int) j17);
            boolean z17 = li0Var.f29797f[2];
            bw5.dr drVar = bw5.dr.FinderMpFeedTypeEntry;
            if ((z17 ? li0Var.f29796e : drVar) != drVar) {
                if (z17) {
                    drVar = li0Var.f29796e;
                }
                if (drVar == bw5.dr.FinderMpFeedTypeNewPublished) {
                    com.tencent.mars.xlog.Log.i("FinderPOIPlugin", "onFeedTapItemIndex new published");
                    str = li0Var.f29797f[1] ? li0Var.f29795d : "";
                    kotlin.jvm.internal.o.f(str, "getFeedUrl(...)");
                    f(str, 0);
                    return;
                }
                return;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            tk.t tVar = tk.u.f419871e;
            jSONObject.put("mpPublishAction", 2);
            jSONObject.put("publishScene", "poi");
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, wc1.o.CTRL_INDEX);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            r45.f96 f96Var = this.f289965s;
            if (f96Var == null || (str2 = f96Var.getString(3)) == null) {
                str2 = "";
            }
            jSONObject4.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, str2);
            r45.f96 f96Var2 = this.f289965s;
            if (f96Var2 == null || (str3 = f96Var2.getString(4)) == null) {
                str3 = "";
            }
            jSONObject4.put("address", str3);
            r45.f96 f96Var3 = this.f289965s;
            jSONObject4.put("longitude", f96Var3 != null ? java.lang.Float.valueOf(f96Var3.getFloat(0)) : "");
            r45.f96 f96Var4 = this.f289965s;
            jSONObject4.put("latitude", f96Var4 != null ? java.lang.Float.valueOf(f96Var4.getFloat(1)) : "");
            r45.f96 f96Var5 = this.f289965s;
            java.lang.String string = f96Var5 != null ? f96Var5.getString(5) : null;
            str = string != null ? string : "";
            this.f289966t = str;
            if (r26.i0.y(str, "nearby_", false)) {
                com.tencent.mars.xlog.Log.i("FinderPOIPlugin", "onFeedTapItemIndex nearby address.");
                r26.i0.x(this.f289966t, "nearby_", "qqmap_", false, 4, null);
                this.f289966t = r26.i0.x(this.f289966t, "nearby_", "qqmap_", false, 4, null);
            } else if (r26.i0.A(this.f289966t, "UgcPoiEx_", false, 2, null)) {
                com.tencent.mars.xlog.Log.i("FinderPOIPlugin", "onFeedTapItemIndex self defined address.");
                this.f289966t = r26.i0.x(this.f289966t, "UgcPoiEx_", "qqmap_", false, 4, null);
            }
            jSONObject4.put("poiid", this.f289966t);
            jSONObject3.put("poiInfo", jSONObject4);
            jSONObject2.put("nativeExtraData", jSONObject3);
            jSONObject.put("weAppParam", jSONObject2);
            tk.q qVar = (tk.q) i95.n0.c(tk.q.class);
            if (qVar != null) {
                ((ox.o) qVar).Di(context, jSONObject, null, new ia2.g0(this));
            }
        }
    }

    @Override // com.tencent.pigeon.finder.POINativeAPI
    public void onNavigateButtonTap() {
        ia2.o0 o0Var = (ia2.o0) this.f289959m.get();
        if (o0Var != null) {
            com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity = (com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) o0Var;
            kotlinx.coroutines.l.d(finderFlutterPOIActivity.f101779p1, null, null, new ia2.m(finderFlutterPOIActivity, null), 3, null);
        }
    }

    @Override // com.tencent.pigeon.finder.POINativeAPI
    public void onRequestPOIStream(long j17, long j18, boolean z17, yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        com.tencent.mm.plugin.finder.feed.model.FinderPoiFeedLoader g17 = g((int) j17, (int) j18);
        java.lang.String str = z17 ? "FirstPage" : "NextPage";
        if (g17.f107545r) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            callback.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new com.tencent.pigeon.finder.FlutterError("POIStream" + str + "Error", "isRequesting", null, 4, null)))));
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderPOIPlugin", "POIStream - start requesting " + str + ". tabIndex:" + j17 + ", filterIndex:" + j18);
        ia2.j0 j0Var = this.f289968v;
        g17.unregisterFetchDoneListener(j0Var);
        g17.registerFetchDoneListener(j0Var);
        g17.registerFetchDoneListener(new ia2.i0(callback, str, g17));
        if (z17) {
            g17.requestRefresh();
        } else {
            g17.requestLoadMore(true);
        }
    }

    @Override // com.tencent.pigeon.finder.POINativeAPI
    public void onTakeCarButtonTap() {
        com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity finderFlutterPOIActivity;
        r45.f96 f96Var;
        ia2.o0 o0Var = (ia2.o0) this.f289959m.get();
        if (o0Var == null || (f96Var = (finderFlutterPOIActivity = (com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) o0Var).f101784x) == null) {
            return;
        }
        java.lang.String string = f96Var.getString(5);
        if (string == null) {
            string = "";
        }
        java.lang.String string2 = f96Var.getString(3);
        if (string2 == null) {
            string2 = "";
        }
        boolean z17 = f96Var.getBoolean(16);
        float f17 = f96Var.getFloat(0);
        float f18 = f96Var.getFloat(1);
        boolean z18 = finderFlutterPOIActivity.f101777l1;
        z80.o0 o0Var2 = (z80.o0) i95.n0.c(z80.o0.class);
        androidx.appcompat.app.AppCompatActivity context = finderFlutterPOIActivity.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        y80.r1 r1Var = (y80.r1) o0Var2;
        r1Var.getClass();
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
        java.lang.String str = r1Var.f459929d;
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e(str, "jumpTakeCar: failed");
        } else {
            r45.aq aqVar = new r45.aq();
            aqVar.f370182e = "wx65cc950f42e8fff1";
            aqVar.f370184g = "";
            aqVar.f370181d = "gh_ad64296dc8bd@app";
            aqVar.f370186i = "modules/aggretakecar/pages/tripdetail/tripdetail.html?from=locationnew";
            com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
            l81.b1 b1Var = new l81.b1();
            b1Var.f317014b = aqVar.f370182e;
            b1Var.f317012a = aqVar.f370181d;
            b1Var.f317016c = 0;
            b1Var.f317018d = aqVar.f370187m;
            b1Var.f317022f = aqVar.f370186i;
            b1Var.f317032k = 1146;
            l81.d1 d1Var = new l81.d1();
            d1Var.f317052d = f18;
            d1Var.f317053e = f17;
            d1Var.f317057i = c01.id.a();
            d1Var.f317055g = "";
            d1Var.f317056h = "";
            d1Var.f317054f = string2;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string) && z17 && !z18) {
                d1Var.f317058m = string;
            }
            com.tencent.mars.xlog.Log.i(str, "openAppBrand,versionType：%s extra data: %s. poiId:%s isFromPoiList:%s", 0, d1Var.a(), string, java.lang.Boolean.valueOf(z17));
            b1Var.f317028i = d1Var;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12809, 20, b1Var.f317014b, "", string);
            ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).bj(context, b1Var);
        }
        yz5.a aVar = finderFlutterPOIActivity.R;
        if (aVar != null) {
        }
    }

    @Override // com.tencent.pigeon.finder.POINativeAPI
    public void onWaServiceTap(java.lang.String weAppId, java.lang.String weAppUrl) {
        kotlin.jvm.internal.o.g(weAppId, "weAppId");
        kotlin.jvm.internal.o.g(weAppUrl, "weAppUrl");
        ia2.o0 o0Var = (ia2.o0) this.f289959m.get();
        if (o0Var != null) {
            z80.r0 r0Var = new z80.r0(weAppId, weAppUrl, 1430);
            z80.l0 l0Var = (z80.l0) i95.n0.c(z80.l0.class);
            androidx.appcompat.app.AppCompatActivity context = ((com.tencent.mm.plugin.finder.activity.poi.flutter.FinderFlutterPOIActivity) o0Var).getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((y80.a1) l0Var).wi(context, r0Var);
        }
    }

    @Override // com.tencent.pigeon.finder.POINativeAPI
    public void showSuccessToast(java.lang.String msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) this.f289958i.get();
        if (appCompatActivity == null) {
            return;
        }
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(appCompatActivity);
        e4Var.f211776c = msg;
        e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
        e4Var.c();
    }

    @Override // com.tencent.pigeon.finder.POINativeAPI
    public void showTextToast(java.lang.String message) {
        kotlin.jvm.internal.o.g(message, "message");
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) this.f289958i.get();
        if (appCompatActivity == null) {
            return;
        }
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(appCompatActivity);
        e4Var.f211776c = message;
        e4Var.c();
    }

    @Override // com.tencent.pigeon.finder.POINativeAPI
    public void showTipsDialog(java.lang.String message, java.lang.String btnWording) {
        kotlin.jvm.internal.o.g(message, "message");
        kotlin.jvm.internal.o.g(btnWording, "btnWording");
        androidx.appcompat.app.AppCompatActivity appCompatActivity = (androidx.appcompat.app.AppCompatActivity) this.f289958i.get();
        if (appCompatActivity == null) {
            return;
        }
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(appCompatActivity);
        u1Var.g(message);
        u1Var.n(btnWording);
        u1Var.l(ia2.m0.f289951a);
        u1Var.q(false);
    }
}

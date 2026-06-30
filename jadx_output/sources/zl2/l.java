package zl2;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a */
    public static final zl2.l f473865a = new zl2.l();

    public static /* synthetic */ com.tencent.mm.live.api.LiveConfig c(zl2.l lVar, com.tencent.mm.protocal.protobuf.FinderObject finderObject, int i17, boolean z17, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            i17 = 1;
        }
        if ((i18 & 4) != 0) {
            z17 = false;
        }
        return lVar.b(finderObject, i17, z17);
    }

    public final dk2.x4 a(r45.wk0 wk0Var) {
        kotlin.jvm.internal.o.g(wk0Var, "<this>");
        dk2.x4 x4Var = new dk2.x4();
        r45.y74 y74Var = (r45.y74) wk0Var.getCustom(6);
        x4Var.f234319m = wk0Var.getInteger(4);
        x4Var.f234320n = wk0Var.getInteger(5);
        x4Var.f234316j = wk0Var.getInteger(3);
        x4Var.f234323q = wk0Var.getString(0);
        if (y74Var != null) {
            x4Var.f234317k = y74Var.getInteger(1);
            x4Var.f234322p = (r45.kd1) y74Var.getCustom(4);
            x4Var.f234324r = (com.tencent.mm.protocal.protobuf.FinderObject) y74Var.getCustom(5);
            x4Var.f234325s = (r45.gy0) y74Var.getCustom(6);
            x4Var.f234326t = y74Var.getInteger(0);
            x4Var.f234329w = (r45.q92) y74Var.getCustom(7);
            java.lang.String string = y74Var.getString(2);
            if (string == null) {
                string = "";
            }
            x4Var.f234331y = string;
            java.lang.String string2 = y74Var.getString(3);
            x4Var.f234332z = string2 != null ? string2 : "";
        }
        x4Var.B = (r45.ta4) wk0Var.getCustom(7);
        return x4Var;
    }

    public final com.tencent.mm.live.api.LiveConfig b(com.tencent.mm.protocal.protobuf.FinderObject obj, int i17, boolean z17) {
        java.lang.String str;
        int i18;
        java.lang.String str2;
        r45.cl2 cl2Var;
        r45.cl2 cl2Var2;
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media;
        r45.nw1 liveInfo;
        r45.ma4 ma4Var;
        r45.q82 q82Var;
        r45.nw1 liveInfo2;
        kotlin.jvm.internal.o.g(obj, "obj");
        r45.nw1 liveInfo3 = obj.getLiveInfo();
        boolean z18 = liveInfo3 != null && liveInfo3.getInteger(2) == 1;
        if (!z18 || (liveInfo2 = obj.getLiveInfo()) == null || (str = liveInfo2.getString(3)) == null) {
            str = "";
        }
        if (z18) {
            r45.nw1 liveInfo4 = obj.getLiveInfo();
            i18 = (liveInfo4 == null || (q82Var = (r45.q82) liveInfo4.getCustom(9)) == null) ? 1 : q82Var.getInteger(0);
        } else {
            i18 = 0;
        }
        byte[] byteArray = (!z18 || (liveInfo = obj.getLiveInfo()) == null || (ma4Var = (r45.ma4) liveInfo.getCustom(23)) == null) ? null : ma4Var.toByteArray();
        if (!z18) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("convertToLiveConfig liveId:");
            r45.nw1 liveInfo5 = obj.getLiveInfo();
            sb6.append(liveInfo5 != null ? java.lang.Long.valueOf(liveInfo5.getLong(0)) : null);
            sb6.append(",liveStatus:");
            com.tencent.mm.protocal.protobuf.FinderContact contact = obj.getContact();
            sb6.append(contact != null ? java.lang.Integer.valueOf(contact.getLiveStatus()) : null);
            sb6.append(" nickname:");
            sb6.append(obj.getNickname());
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveDataTransferUtil", sb6.toString());
        }
        en0.g gVar = new en0.g();
        com.tencent.mm.plugin.finder.assist.w0 w0Var = com.tencent.mm.plugin.finder.assist.w0.f102642a;
        gVar.f255246a = i17;
        r45.nw1 liveInfo6 = obj.getLiveInfo();
        gVar.f255248c = liveInfo6 != null ? liveInfo6.getLong(0) : 0L;
        gVar.f255262q = obj.getObjectNonceId();
        gVar.f255256k = obj.getId();
        gVar.f255251f = obj.getUsername();
        zl2.q4 q4Var = zl2.q4.f473933a;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc = obj.getObjectDesc();
        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia = (objectDesc == null || (media = objectDesc.getMedia()) == null) ? null : (com.tencent.mm.protocal.protobuf.FinderMedia) kz5.n0.Z(media);
        if (finderMedia != null) {
            java.lang.String thumbUrl = finderMedia.getThumbUrl();
            boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (thumbUrl == null) {
                thumbUrl = "";
            }
            java.lang.String thumb_url_token = finderMedia.getThumb_url_token();
            if (thumb_url_token == null) {
                thumb_url_token = "";
            }
            str2 = thumbUrl.concat(thumb_url_token);
        } else {
            str2 = "";
        }
        gVar.f255250e = str2;
        com.tencent.mm.protocal.protobuf.FinderObjectDesc objectDesc2 = obj.getObjectDesc();
        gVar.f255257l = objectDesc2 != null ? objectDesc2.getDescription() : null;
        gVar.f255268w = obj.getSessionBuffer();
        gVar.f255254i = str;
        gVar.f255255j = i18;
        gVar.f255270y = java.lang.Boolean.valueOf(z17).booleanValue();
        gVar.A = obj.getNickname();
        r45.nw1 liveInfo7 = obj.getLiveInfo();
        gVar.B = liveInfo7 != null ? liveInfo7.getLong(32) : 0L;
        gVar.C = byteArray;
        r45.nw1 liveInfo8 = obj.getLiveInfo();
        gVar.E = liveInfo8 != null ? liveInfo8.getInteger(42) : 0;
        r45.nw1 liveInfo9 = obj.getLiveInfo();
        gVar.f255245J = liveInfo9 != null ? cm2.a.i(cm2.a.f43328a, liveInfo9, "convertToLiveConfig", false, 2, null) : "";
        r45.nw1 liveInfo10 = obj.getLiveInfo();
        w0Var.a(gVar, "convertToLiveConfig", liveInfo10 != null ? (r45.rp1) liveInfo10.getCustom(45) : null);
        gVar.K = obj.getAdFlag();
        r45.dm2 object_extend = obj.getObject_extend();
        gVar.L = java.lang.Boolean.valueOf((object_extend == null || (cl2Var2 = (r45.cl2) object_extend.getCustom(4)) == null) ? false : cl2Var2.getBoolean(14)).booleanValue();
        r45.dm2 object_extend2 = obj.getObject_extend();
        gVar.M = (object_extend2 == null || (cl2Var = (r45.cl2) object_extend2.getCustom(4)) == null) ? 0 : cl2Var.getInteger(13);
        com.tencent.mm.live.api.LiveConfig a17 = gVar.a();
        r45.v74 v74Var = new r45.v74();
        v74Var.set(0, obj);
        v74Var.set(1, obj.getLiveInfo());
        a17.f68546p0 = v74Var;
        kz2.b.f313858a.d("Finder.FinderLiveDataTransferUtil", "convertToLiveConfig " + a17);
        return a17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    public final jz5.l d(java.util.ArrayList data, so2.j5 clickFeed, boolean z17) {
        r45.nw1 liveInfo;
        r45.nw1 liveInfo2;
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(clickFeed, "clickFeed");
        ?? arrayList = new java.util.ArrayList();
        java.util.Iterator it = data.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            so2.j5 j5Var = (so2.j5) it.next();
            if (j5Var instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                if (zl2.q4.f473933a.C(baseFinderFeed)) {
                    com.tencent.mm.plugin.finder.storage.FinderItem feedObject = baseFinderFeed.getFeedObject();
                    if ((feedObject == null || (liveInfo2 = feedObject.getLiveInfo()) == null || liveInfo2.getInteger(2) != 2) ? false : true) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("convertToVisitorLiveData feed:");
                        sb6.append(j5Var.getItemId());
                        sb6.append(",is click feed:");
                        sb6.append(j5Var.getItemId() == clickFeed.getItemId());
                        sb6.append(",nickname:");
                        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) j5Var;
                        ya2.b2 contact = baseFinderFeed2.getContact();
                        java.lang.Integer num = null;
                        sb6.append(contact != null ? contact.w0() : null);
                        sb6.append(",live status:");
                        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2 = baseFinderFeed2.getFeedObject();
                        if (feedObject2 != null && (liveInfo = feedObject2.getLiveInfo()) != null) {
                            num = java.lang.Integer.valueOf(liveInfo.getInteger(2));
                        }
                        sb6.append(num);
                        sb6.append('!');
                        com.tencent.mars.xlog.Log.i("Finder.FinderLiveDataTransferUtil", sb6.toString());
                        if (j5Var.getItemId() == clickFeed.getItemId()) {
                            arrayList.add(j5Var);
                        }
                    } else {
                        arrayList.add(j5Var);
                    }
                }
            }
        }
        int indexOf = arrayList.indexOf(clickFeed);
        int i17 = indexOf >= 0 ? indexOf : 0;
        if (z17 && indexOf >= 0) {
            arrayList = arrayList.subList(0, indexOf + 1);
        }
        kotlin.jvm.internal.o.d(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((com.tencent.mm.plugin.finder.model.BaseFinderFeed) it6.next()).getFeedObject().getFeedObject());
        }
        return new jz5.l(arrayList2, java.lang.Integer.valueOf(i17));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(dk2.x4 r16, int r17, long r18, android.content.Intent r20) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zl2.l.e(dk2.x4, int, long, android.content.Intent):void");
    }

    public final void f(r45.wk0 wk0Var) {
        java.util.LinkedList list;
        kotlin.jvm.internal.o.g(wk0Var, "<this>");
        r45.ta4 ta4Var = (r45.ta4) wk0Var.getCustom(7);
        if (ta4Var == null || (list = ta4Var.getList(20)) == null) {
            return;
        }
        r45.qa4 qa4Var = new r45.qa4();
        qa4Var.set(0, "EnterLive");
        qa4Var.set(1, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        list.add(qa4Var);
    }

    public final void g(r45.wk0 wk0Var, java.lang.String tag) {
        r45.gy0 gy0Var;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        kotlin.jvm.internal.o.g(wk0Var, "<this>");
        kotlin.jvm.internal.o.g(tag, "tag");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveDataTransferUtil", "EnterLiveParams.logInfo " + tag + ", contextId:" + wk0Var.getString(0) + ", clickTabContextId:" + wk0Var.getString(1) + ", needAnim:" + wk0Var.getBoolean(2) + ", tabType:" + wk0Var.getInteger(3) + ", secondaryDeviceFlag:" + wk0Var.getInteger(4) + ", pullMoreType:" + wk0Var.getInteger(5));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("EnterLiveParams.logInfo ");
        sb6.append(tag);
        sb6.append(", bundleParams enterScene:");
        r45.y74 y74Var = (r45.y74) wk0Var.getCustom(6);
        sb6.append(y74Var != null ? java.lang.Integer.valueOf(y74Var.getInteger(0)) : null);
        sb6.append(",commentScene:");
        r45.y74 y74Var2 = (r45.y74) wk0Var.getCustom(6);
        sb6.append(y74Var2 != null ? java.lang.Integer.valueOf(y74Var2.getInteger(1)) : null);
        sb6.append(",nicknameOption:");
        r45.y74 y74Var3 = (r45.y74) wk0Var.getCustom(6);
        sb6.append(y74Var3 != null ? y74Var3.getString(2) : null);
        sb6.append(",lbsTabTipsInfo:");
        r45.y74 y74Var4 = (r45.y74) wk0Var.getCustom(6);
        sb6.append(y74Var4 != null ? (r45.kd1) y74Var4.getCustom(4) : null);
        sb6.append(",targetFeedObject:");
        r45.y74 y74Var5 = (r45.y74) wk0Var.getCustom(6);
        sb6.append(pm0.v.u((y74Var5 == null || (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) y74Var5.getCustom(5)) == null) ? 0L : finderObject.getId()));
        sb6.append(",byPassInfo:");
        r45.y74 y74Var6 = (r45.y74) wk0Var.getCustom(6);
        sb6.append((y74Var6 == null || (gy0Var = (r45.gy0) y74Var6.getCustom(6)) == null) ? null : java.lang.Integer.valueOf(gy0Var.getInteger(0)));
        sb6.append(", squareExtraInfo:");
        r45.y74 y74Var7 = (r45.y74) wk0Var.getCustom(6);
        sb6.append(y74Var7 != null ? (r45.q92) y74Var7.getCustom(7) : null);
        sb6.append(", redPacketId:");
        r45.y74 y74Var8 = (r45.y74) wk0Var.getCustom(6);
        sb6.append(y74Var8 != null ? y74Var8.getString(8) : null);
        sb6.append(", ");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveDataTransferUtil", sb6.toString());
    }
}

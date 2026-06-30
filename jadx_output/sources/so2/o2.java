package so2;

/* loaded from: classes2.dex */
public final class o2 {

    /* renamed from: f, reason: collision with root package name */
    public static final so2.k2 f410517f = new so2.k2(null);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f410518g = jz5.h.b(so2.j2.f410440d);

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f410519a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f410520b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f410521c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f410522d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f410523e = new java.util.concurrent.ConcurrentHashMap();

    public o2(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a(long j17) {
        java.lang.String str = (java.lang.String) this.f410519a.get(java.lang.Long.valueOf(j17));
        return str == null ? "" : str;
    }

    public final so2.i2 b(long j17, java.lang.String commentScene) {
        kotlin.jvm.internal.o.g(commentScene, "commentScene");
        so2.i2 i2Var = (so2.i2) this.f410520b.get(j17 + '#' + commentScene);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getComReportData] feedId: ");
        sb6.append(j17);
        sb6.append(", commentScene: ");
        sb6.append(commentScene);
        sb6.append(", iconType: ");
        sb6.append(i2Var != null ? i2Var.f410421a : null);
        com.tencent.mars.xlog.Log.i("FinderLiveJumpReportManager", sb6.toString());
        return i2Var;
    }

    public final java.lang.String c(long j17, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(j17);
        sb6.append('#');
        sb6.append(i17);
        return sb6.toString();
    }

    public final void d(com.tencent.mm.protocal.protobuf.FinderObject finderObject, com.tencent.mm.protocal.protobuf.FinderJumpInfo jumpInfo) {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.String str;
        org.json.JSONObject jSONObject;
        java.lang.String necessary_params;
        java.lang.String str2;
        org.json.JSONObject jSONObject2;
        java.lang.String necessary_params2;
        com.tencent.mm.protobuf.g necessary_params_bytes;
        com.tencent.mm.protobuf.g necessary_params_bytes2;
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        java.util.LinkedList<r45.wf6> style = jumpInfo.getStyle();
        kotlin.jvm.internal.o.f(style, "getStyle(...)");
        java.util.Iterator<T> it = style.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.wf6) obj).getInteger(2) == 16) {
                    break;
                }
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        r45.z84 z84Var = wf6Var != null ? (r45.z84) wf6Var.getCustom(23) : null;
        java.util.LinkedList<r45.wf6> style2 = jumpInfo.getStyle();
        kotlin.jvm.internal.o.f(style2, "getStyle(...)");
        java.util.Iterator<T> it6 = style2.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj2 = null;
                break;
            } else {
                obj2 = it6.next();
                if (((r45.wf6) obj2).getInteger(2) == 14) {
                    break;
                }
            }
        }
        r45.wf6 wf6Var2 = (r45.wf6) obj2;
        r45.x94 x94Var = wf6Var2 != null ? (r45.x94) wf6Var2.getCustom(22) : null;
        java.util.LinkedList<r45.wf6> style3 = jumpInfo.getStyle();
        kotlin.jvm.internal.o.f(style3, "getStyle(...)");
        java.util.Iterator<T> it7 = style3.iterator();
        while (true) {
            if (!it7.hasNext()) {
                obj3 = null;
                break;
            } else {
                obj3 = it7.next();
                if (((r45.wf6) obj3).getInteger(2) == 24) {
                    break;
                }
            }
        }
        java.lang.String str3 = "{}";
        if (obj3 != null) {
            com.tencent.mars.xlog.Log.i("FinderLiveJumpReportManager", "getNecessaryParamsChnlExtra: isDynamicCarouselCard");
            com.tencent.mm.protocal.protobuf.NativeInfo native_info = jumpInfo.getNative_info();
            if (native_info != null && native_info.getNative_type() == 34) {
                com.tencent.mars.xlog.Log.i("FinderLiveJumpReportManager", "isDynamicCarouselCard reservation");
                com.tencent.mm.protocal.protobuf.NativeInfo native_info2 = jumpInfo.getNative_info();
                if (((native_info2 == null || (necessary_params_bytes2 = native_info2.getNecessary_params_bytes()) == null) ? 0 : necessary_params_bytes2.f192156a.length) > 0) {
                    r45.vc1 vc1Var = new r45.vc1();
                    com.tencent.mm.protocal.protobuf.NativeInfo native_info3 = jumpInfo.getNative_info();
                    byte[] g17 = (native_info3 == null || (necessary_params_bytes = native_info3.getNecessary_params_bytes()) == null) ? null : necessary_params_bytes.g();
                    if (g17 != null) {
                        try {
                            vc1Var.parseFrom(g17);
                        } catch (java.lang.Exception e17) {
                            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                        }
                    }
                    com.tencent.mars.xlog.Log.i("FinderLiveJumpReportManager", "getNecessaryParamsChnlExtra: isDynamicCarouselCard reservation chnlExtra: " + vc1Var.getString(1));
                    str = vc1Var.getString(1);
                }
                str = null;
            } else {
                com.tencent.mm.protocal.protobuf.NativeInfo native_info4 = jumpInfo.getNative_info();
                if (native_info4 != null && native_info4.getNative_type() == 14) {
                    com.tencent.mars.xlog.Log.i("FinderLiveJumpReportManager", "getNecessaryParamsChnlExtra: isDynamicCarouselCard living");
                    try {
                        com.tencent.mm.protocal.protobuf.NativeInfo native_info5 = jumpInfo.getNative_info();
                        if (native_info5 != null && (necessary_params2 = native_info5.getNecessary_params()) != null) {
                            str3 = necessary_params2;
                        }
                        jSONObject2 = new org.json.JSONObject(str3);
                        try {
                        } catch (java.lang.Exception e18) {
                            com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", e18);
                        }
                    } catch (java.lang.Exception e19) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("FinderLiveJumpReportManager", e19, "", new java.lang.Object[0]);
                    }
                    if (jSONObject2.has("byp_report_chnl_extra")) {
                        str = jSONObject2.getString("byp_report_chnl_extra");
                        com.tencent.mars.xlog.Log.i("FinderLiveJumpReportManager", "getNecessaryParamsChnlExtra: isDynamicCarouselCard reservation chnlExtra: " + str);
                    }
                    str = null;
                    com.tencent.mars.xlog.Log.i("FinderLiveJumpReportManager", "getNecessaryParamsChnlExtra: isDynamicCarouselCard reservation chnlExtra: " + str);
                }
                str = null;
            }
        } else {
            com.tencent.mm.protocal.protobuf.NativeInfo native_info6 = jumpInfo.getNative_info();
            if (native_info6 != null && native_info6.getNative_type() == 14) {
                try {
                    com.tencent.mm.protocal.protobuf.NativeInfo native_info7 = jumpInfo.getNative_info();
                    if (native_info7 != null && (necessary_params = native_info7.getNecessary_params()) != null) {
                        str3 = necessary_params;
                    }
                    jSONObject = new org.json.JSONObject(str3);
                    try {
                    } catch (java.lang.Exception e27) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", e27);
                    }
                } catch (java.lang.Exception e28) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("FinderLiveJumpReportManager", e28, "", new java.lang.Object[0]);
                }
                if (jSONObject.has("byp_report_chnl_extra")) {
                    str = jSONObject.getString("byp_report_chnl_extra");
                    com.tencent.mars.xlog.Log.i("FinderLiveJumpReportManager", "getNecessaryParamsChnlExtra: living chnlExtra: " + str);
                }
                str = null;
                com.tencent.mars.xlog.Log.i("FinderLiveJumpReportManager", "getNecessaryParamsChnlExtra: living chnlExtra: " + str);
            }
            str = null;
        }
        if (z84Var == null || (str2 = z84Var.getString(4)) == null) {
            java.lang.String string = x94Var != null ? x94Var.getString(1) : null;
            str2 = string == null ? str : string;
        }
        if (str2 != null) {
            this.f410519a.put(java.lang.Long.valueOf(finderObject.getId()), str2);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveJumpReportManager", "handleAdReportBuffer: id=" + pm0.v.u(finderObject.getId()) + ", buffer=" + str2 + ", livingStyle=" + z84Var + ", liveNoticeStyle=" + x94Var + ", necessaryParamsChnlExtra=" + str);
        if (z84Var != null) {
            r45.nw1 nw1Var = new r45.nw1();
            nw1Var.set(0, java.lang.Long.valueOf(z84Var.getLong(3)));
            finderObject.setLiveInfo(nw1Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String e(long r11, java.lang.String r13) {
        /*
            r10 = this;
            java.lang.String r0 = r10.a(r11)
            int r1 = r0.length()
            r2 = 0
            r3 = 1
            if (r1 <= 0) goto Le
            r1 = r3
            goto Lf
        Le:
            r1 = r2
        Lf:
            if (r1 == 0) goto La6
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            long r4 = r11.longValue()
            r6 = 0
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 == 0) goto L21
            r12 = r3
            goto L22
        L21:
            r12 = r2
        L22:
            r1 = 0
            if (r12 == 0) goto L26
            goto L27
        L26:
            r11 = r1
        L27:
            java.lang.String r12 = "{}"
            if (r11 == 0) goto L6f
            long r4 = r11.longValue()
            if (r13 == 0) goto L3e
            int r11 = r13.length()
            if (r11 <= 0) goto L39
            r11 = r3
            goto L3a
        L39:
            r11 = r2
        L3a:
            if (r11 != r3) goto L3e
            r11 = r3
            goto L3f
        L3e:
            r11 = r2
        L3f:
            if (r11 == 0) goto L42
            goto L43
        L42:
            r13 = r1
        L43:
            if (r13 == 0) goto L4b
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>(r13)
            goto L50
        L4b:
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>(r12)
        L50:
            java.lang.String r13 = "from_feed_id"
            boolean r8 = r11.isNull(r13)
            if (r8 != 0) goto L64
            java.lang.String r8 = r11.optString(r13)
            long r8 = com.tencent.mm.sdk.platformtools.t8.q0(r8, r6)
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 != 0) goto L6b
        L64:
            java.lang.String r4 = pm0.v.u(r4)
            r11.put(r13, r4)
        L6b:
            java.lang.String r13 = r11.toString()
        L6f:
            int r11 = r0.length()
            if (r11 != 0) goto L77
            r11 = r3
            goto L78
        L77:
            r11 = r2
        L78:
            r11 = r11 ^ r3
            if (r11 == 0) goto L7c
            goto L7d
        L7c:
            r0 = r1
        L7d:
            if (r0 == 0) goto La6
            if (r13 == 0) goto L8d
            int r11 = r13.length()
            if (r11 <= 0) goto L89
            r11 = r3
            goto L8a
        L89:
            r11 = r2
        L8a:
            if (r11 != r3) goto L8d
            r2 = r3
        L8d:
            if (r2 == 0) goto L90
            r1 = r13
        L90:
            if (r1 == 0) goto L98
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>(r1)
            goto L9d
        L98:
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>(r12)
        L9d:
            java.lang.String r12 = "feed_ad_report_info"
            r11.put(r12, r0)
            java.lang.String r13 = r11.toString()
        La6:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: so2.o2.e(long, java.lang.String):java.lang.String");
    }

    public final java.lang.String f(int i17, java.lang.String str) {
        boolean z17 = false;
        if (str != null) {
            if (str.length() > 0) {
                z17 = true;
            }
        }
        if (!z17) {
            str = null;
        }
        org.json.JSONObject jSONObject = str != null ? new org.json.JSONObject(str) : new org.json.JSONObject("{}");
        jSONObject.put("icon_type", i17);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        return jSONObject2;
    }

    public final void g(long j17, int i17, so2.h2 iconType) {
        kotlin.jvm.internal.o.g(iconType, "iconType");
        com.tencent.mars.xlog.Log.i("FinderLiveJumpReportManager", "[putIconType] feedId: " + j17 + ", commentScene: " + i17 + ", iconType: " + iconType);
        java.lang.String c17 = c(j17, i17);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f410520b;
        so2.i2 i2Var = (so2.i2) concurrentHashMap.get(c17);
        if (i2Var == null) {
            i2Var = new so2.i2();
        }
        i2Var.f410421a = iconType;
        concurrentHashMap.put(c17, i2Var);
    }

    public final void h(int i17, java.lang.String key, so2.m2 m2Var, so2.l2 l2Var, android.view.View view) {
        kotlin.jvm.internal.o.g(key, "key");
        if (i17 == 0) {
            if (view != null) {
                view.post(new so2.n2(this, key));
                return;
            }
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f410523e;
        if (i17 == 1) {
            com.tencent.mars.xlog.Log.i("FinderLiveJumpReportManager", "[tryCheckExposeReport] resume, key: " + key + '}');
            this.f410521c.put(key, m2Var);
            concurrentHashMap.put(key, 1);
            return;
        }
        if (i17 != 2) {
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveJumpReportManager", "[tryCheckExposeReport] pageSelected, key: " + key + '}');
        this.f410522d.put(key, l2Var);
        concurrentHashMap.put(key, 2);
    }
}

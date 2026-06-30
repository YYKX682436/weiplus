package sc2;

/* loaded from: classes2.dex */
public final class v6 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final in5.s0 f406309d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.model.BaseFinderFeed f406310e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f406311f;

    /* renamed from: g, reason: collision with root package name */
    public final long f406312g;

    /* renamed from: h, reason: collision with root package name */
    public xc2.c1 f406313h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ sc2.r7 f406314i;

    public v6(sc2.r7 r7Var, in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, java.lang.String source, long j17, xc2.c1 c1Var, int i17, kotlin.jvm.internal.i iVar) {
        j17 = (i17 & 8) != 0 ? 0L : j17;
        c1Var = (i17 & 16) != 0 ? null : c1Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(source, "source");
        this.f406314i = r7Var;
        this.f406309d = holder;
        this.f406310e = feed;
        this.f406311f = source;
        this.f406312g = j17;
        this.f406313h = c1Var;
        holder.itemView.getContext();
    }

    public final void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("Finder.BaseAdFeedJumperUIC", "[" + str + "] feedId=" + str2 + ' ' + str3);
    }

    public final void b(long j17, java.lang.String str, int i17, java.util.Set set) {
        boolean z17;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        com.tencent.mm.protobuf.g necessary_params_bytes;
        com.tencent.mm.protobuf.g necessary_params_bytes2;
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.e6 hk6 = com.tencent.mm.plugin.finder.report.o3.hk((com.tencent.mm.plugin.finder.report.o3) c17, j17, str, i17, null, 8, null);
        r45.fl2 fl2Var = hk6 != null ? hk6.f125012a : null;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (set != null) {
            java.util.Iterator it = set.iterator();
            str2 = "";
            while (it.hasNext()) {
                while (true) {
                    str3 = str2;
                    for (com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo : ((xc2.t) it.next()).f453302d) {
                        java.util.LinkedList<r45.wf6> style = finderJumpInfo.getStyle();
                        if (style != null) {
                            java.lang.String str6 = "";
                            str5 = str6;
                            for (r45.wf6 wf6Var : style) {
                                if (str5.length() > 0) {
                                    str5 = str5 + '#';
                                }
                                java.lang.String str7 = str6.length() > 0 ? str6 + '#' : str6;
                                str5 = str5 + wf6Var.getInteger(2);
                                str6 = str7 + wf6Var.getInteger(1);
                            }
                            str4 = str6;
                        } else {
                            str4 = "";
                            str5 = str4;
                        }
                        try {
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            jSONObject2.put("business_type", finderJumpInfo.getBusiness_type());
                            jSONObject2.put("showPosition", str4);
                            jSONObject2.put("showStyle", str5);
                            if (str3.length() > 0) {
                                str3 = str3 + '#';
                            }
                            if (finderJumpInfo.getBusiness_type() == 124) {
                                com.tencent.mm.protocal.protobuf.NativeInfo native_info = finderJumpInfo.getNative_info();
                                if (native_info != null && native_info.getNative_type() == 59) {
                                    r45.dq2 dq2Var = new r45.dq2();
                                    com.tencent.mm.protocal.protobuf.NativeInfo native_info2 = finderJumpInfo.getNative_info();
                                    if (((native_info2 == null || (necessary_params_bytes2 = native_info2.getNecessary_params_bytes()) == null) ? 0 : necessary_params_bytes2.f192156a.length) > 0) {
                                        com.tencent.mm.protocal.protobuf.NativeInfo native_info3 = finderJumpInfo.getNative_info();
                                        byte[] g17 = (native_info3 == null || (necessary_params_bytes = native_info3.getNecessary_params_bytes()) == null) ? null : necessary_params_bytes.g();
                                        if (g17 != null) {
                                            try {
                                                dq2Var.parseFrom(g17);
                                            } catch (java.lang.Exception e17) {
                                                com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                                            }
                                        }
                                    }
                                    jSONObject.put("cluster_id", pm0.v.u(dq2Var.getLong(2)));
                                    jSONObject.put("cluster_name", dq2Var.getString(0));
                                    jSONObject2.put("cluster_info", jSONObject.toString());
                                }
                            }
                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                            sb6.append(str3);
                            java.lang.String jSONObject3 = jSONObject2.toString();
                            kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
                            try {
                                sb6.append(r26.i0.t(jSONObject3, ",", ";", false));
                                str2 = sb6.toString();
                                break;
                            } catch (org.json.JSONException e18) {
                                e = e18;
                                com.tencent.mars.xlog.Log.e("Finder.BaseAdFeedJumperUIC", e.getMessage());
                            }
                        } catch (org.json.JSONException e19) {
                            e = e19;
                            com.tencent.mars.xlog.Log.e("Finder.BaseAdFeedJumperUIC", e.getMessage());
                        }
                    }
                }
                str2 = str3;
            }
            z17 = false;
        } else {
            z17 = false;
            str2 = "";
        }
        if (fl2Var != null) {
            java.lang.String string = fl2Var.getString(5);
            java.lang.String str8 = string != null ? string : "";
            try {
                org.json.JSONObject jSONObject4 = str8.length() == 0 ? true : z17 ? new org.json.JSONObject() : new org.json.JSONObject(str8);
                jSONObject4.put("jump_info", str2);
                jSONObject4.put("cluster_info", jSONObject.toString());
                fl2Var.set(5, jSONObject4.toString());
            } catch (org.json.JSONException e27) {
                com.tencent.mars.xlog.Log.e("Finder.BaseAdFeedJumperUIC", e27.getMessage());
            }
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof sc2.v6) {
            return kotlin.jvm.internal.o.b(this.f406309d.itemView, ((sc2.v6) obj).f406309d.itemView);
        }
        return false;
    }

    public int hashCode() {
        return this.f406309d.itemView.hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:409:0x0bba, code lost:
    
        if (((r1 == null || !r1.f406177a) ? r42 : 1) == 0) goto L377;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:276:0x07a6  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0b60  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0b89  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0bd7  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0bec  */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v41, types: [java.lang.Object] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // androidx.lifecycle.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onChanged(java.lang.Object r57) {
        /*
            Method dump skipped, instructions count: 3223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.v6.onChanged(java.lang.Object):void");
    }

    public java.lang.String toString() {
        return sc2.v6.class.getSimpleName() + '#' + pm0.v.u(this.f406310e.getItemId());
    }
}

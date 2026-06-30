package kn0;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f309534a;

    /* renamed from: b, reason: collision with root package name */
    public long f309535b;

    /* renamed from: c, reason: collision with root package name */
    public int f309536c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f309537d;

    /* renamed from: e, reason: collision with root package name */
    public long f309538e;

    /* renamed from: f, reason: collision with root package name */
    public long f309539f;

    /* renamed from: g, reason: collision with root package name */
    public kn0.a f309540g;

    /* renamed from: h, reason: collision with root package name */
    public int f309541h;

    /* renamed from: i, reason: collision with root package name */
    public int f309542i;

    /* renamed from: j, reason: collision with root package name */
    public int f309543j;

    /* renamed from: k, reason: collision with root package name */
    public java.util.HashMap f309544k;

    /* renamed from: l, reason: collision with root package name */
    public int f309545l;

    /* renamed from: m, reason: collision with root package name */
    public final long f309546m;

    /* renamed from: n, reason: collision with root package name */
    public int f309547n;

    /* renamed from: o, reason: collision with root package name */
    public r45.ka4 f309548o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f309549p;

    /* renamed from: q, reason: collision with root package name */
    public long f309550q;

    /* renamed from: r, reason: collision with root package name */
    public long f309551r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f309552s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f309553t;

    public g(java.lang.String str, long j17, int i17, java.lang.String str2, long j18, long j19, kn0.a aVar, int i18, int i19, int i27, java.util.HashMap hashMap, int i28, long j27, int i29, r45.ka4 ka4Var, java.lang.String str3, long j28, long j29, boolean z17, int i37, kotlin.jvm.internal.i iVar) {
        int i38;
        java.lang.String nickName;
        java.lang.String liveName = (i37 & 1) != 0 ? "" : str;
        long j37 = (i37 & 2) != 0 ? -1L : j17;
        int i39 = (i37 & 4) != 0 ? 0 : i17;
        java.lang.String str4 = (i37 & 8) != 0 ? "" : str2;
        long j38 = (i37 & 16) != 0 ? -1L : j18;
        long j39 = (i37 & 32) == 0 ? j19 : -1L;
        kn0.a cdnSwitchMode = (i37 & 64) != 0 ? kn0.a.f309494e : aVar;
        int i47 = (i37 & 128) != 0 ? 0 : i18;
        int i48 = (i37 & 256) != 0 ? 0 : i19;
        int i49 = (i37 & 512) != 0 ? -1 : i27;
        java.util.HashMap cdnUrlMap = (i37 & 1024) != 0 ? new java.util.LinkedHashMap() : hashMap;
        int i57 = i49;
        int i58 = (i37 & 2048) != 0 ? 0 : i28;
        long currentTimeMillis = (i37 & 4096) != 0 ? java.lang.System.currentTimeMillis() : j27;
        int i59 = (i37 & 8192) != 0 ? 0 : i29;
        r45.ka4 channelParams = (i37 & 16384) != 0 ? new r45.ka4() : ka4Var;
        if ((i37 & 32768) != 0) {
            i38 = i48;
            nickName = "";
        } else {
            i38 = i48;
            nickName = str3;
        }
        long j47 = (i37 & 65536) != 0 ? 0L : j28;
        long j48 = (i37 & 131072) != 0 ? 0L : j29;
        boolean z18 = (i37 & 262144) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(liveName, "liveName");
        kotlin.jvm.internal.o.g(cdnSwitchMode, "cdnSwitchMode");
        kotlin.jvm.internal.o.g(cdnUrlMap, "cdnUrlMap");
        kotlin.jvm.internal.o.g(channelParams, "channelParams");
        kotlin.jvm.internal.o.g(nickName, "nickName");
        this.f309534a = liveName;
        this.f309535b = j37;
        this.f309536c = i39;
        this.f309537d = str4;
        this.f309538e = j38;
        this.f309539f = j39;
        this.f309540g = cdnSwitchMode;
        this.f309541h = i47;
        this.f309542i = i38;
        this.f309543j = i57;
        this.f309544k = cdnUrlMap;
        this.f309545l = i58;
        this.f309546m = currentTimeMillis;
        this.f309547n = i59;
        this.f309548o = channelParams;
        this.f309549p = nickName;
        this.f309550q = j47;
        this.f309551r = j48;
        this.f309552s = z18;
        this.f309553t = "LiveRoomInfo_" + hashCode();
    }

    public final int a() {
        if (b()) {
            return this.f309543j;
        }
        kn0.r g17 = g(this.f309541h);
        if (g17 != null) {
            return g17.f309597b;
        }
        return 0;
    }

    public final boolean b() {
        java.lang.Object obj;
        int i17 = this.f309543j;
        if (i17 < 0) {
            return false;
        }
        java.util.Collection values = this.f309544k.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((kn0.r) obj).f309597b == i17) {
                break;
            }
        }
        return ((kn0.r) obj) != null;
    }

    public final java.lang.String c(int i17) {
        java.lang.String str;
        java.lang.String str2;
        int i18 = this.f309545l;
        java.lang.Object obj = null;
        java.lang.String str3 = this.f309553t;
        if (i18 != 1) {
            com.tencent.mars.xlog.Log.i(str3, "getCdnBackUrl cdnQualityTag:" + i17 + ", liveInfo:" + this.f309544k.get(java.lang.Integer.valueOf(i17)) + ", cdnQualitySvrcfg:" + this.f309541h + ",cdnCustomerSwitchCfg:" + this.f309543j);
            kn0.r rVar = (kn0.r) this.f309544k.get(java.lang.Integer.valueOf(i17));
            if (rVar != null && (str = rVar.f309599d) != null) {
                return str;
            }
            kn0.r rVar2 = (kn0.r) this.f309544k.get(0);
            if (rVar2 != null) {
                return rVar2.f309599d;
            }
            return null;
        }
        com.tencent.mars.xlog.Log.i(str3, "getCdnBackUrl cdnQualityTag:" + i17 + ", liveInfo:" + this.f309544k.get(java.lang.Integer.valueOf(i17)) + ", cdnQualitySvrcfg:" + this.f309541h + ",cdnCustomerSwitchCfg:" + this.f309543j);
        java.util.LinkedList cdn_trans_info = this.f309548o.f378540m;
        kotlin.jvm.internal.o.f(cdn_trans_info, "cdn_trans_info");
        java.util.Iterator it = cdn_trans_info.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((r45.gv) next).f375544o == 1) {
                obj = next;
                break;
            }
        }
        r45.gv gvVar = (r45.gv) obj;
        return (gvVar == null || (str2 = gvVar.f375545p) == null) ? "" : str2;
    }

    public final int d(int i17) {
        kn0.r rVar = (kn0.r) this.f309544k.get(java.lang.Integer.valueOf(i17));
        if (rVar == null && (rVar = (kn0.r) this.f309544k.get(0)) == null) {
            return 0;
        }
        return rVar.f309597b;
    }

    public final java.lang.String e(int i17) {
        java.lang.String str;
        java.util.LinkedList linkedList;
        java.lang.Object obj;
        java.lang.String str2;
        java.lang.String str3;
        int i18 = this.f309545l;
        java.lang.String str4 = this.f309553t;
        java.lang.Object obj2 = null;
        if (i18 == 1) {
            com.tencent.mars.xlog.Log.i(str4, "getCdnUrl cdnQualityTag:" + i17 + ", liveInfo:" + this.f309544k.get(java.lang.Integer.valueOf(i17)) + ", cdnQualitySvrcfg:" + this.f309541h + ",cdnCustomerSwitchCfg:" + this.f309543j);
            java.util.LinkedList cdn_trans_info = this.f309548o.f378540m;
            kotlin.jvm.internal.o.f(cdn_trans_info, "cdn_trans_info");
            java.util.Iterator it = cdn_trans_info.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((r45.gv) next).f375544o == 1) {
                    obj2 = next;
                    break;
                }
            }
            r45.gv gvVar = (r45.gv) obj2;
            return (gvVar == null || (str3 = gvVar.f375537e) == null) ? "" : str3;
        }
        java.util.Set keySet = this.f309544k.keySet();
        kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
        int b07 = kz5.n0.b0(keySet, java.lang.Integer.valueOf(i17));
        r45.ah5 ah5Var = this.f309548o.f378545p1;
        if (ah5Var != null && (linkedList = ah5Var.f370013d) != null) {
            java.util.Iterator it6 = linkedList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it6.next();
                if (((r45.bh5) obj).f370767d == b07) {
                    break;
                }
            }
            r45.bh5 bh5Var = (r45.bh5) obj;
            if (bh5Var != null) {
                com.tencent.mars.xlog.Log.i(str4, "getCdnUrl cdnQualityTag:" + i17 + " urlIndex: " + b07 + " blockFlag: " + bh5Var.f370768e);
                if (bh5Var.f370768e == 1) {
                    return c(i17);
                }
                kn0.r rVar = (kn0.r) this.f309544k.get(java.lang.Integer.valueOf(i17));
                if (rVar != null && (str2 = rVar.f309596a) != null) {
                    return str2;
                }
                kn0.r rVar2 = (kn0.r) this.f309544k.get(0);
                if (rVar2 != null) {
                    return rVar2.f309596a;
                }
                return null;
            }
        }
        com.tencent.mars.xlog.Log.i(str4, "getCdnUrl cdnQualityTag:" + i17 + ", liveInfo:" + this.f309544k.get(java.lang.Integer.valueOf(i17)) + ", cdnQualitySvrcfg:" + this.f309541h + ",cdnCustomerSwitchCfg:" + this.f309543j);
        kn0.r rVar3 = (kn0.r) this.f309544k.get(java.lang.Integer.valueOf(i17));
        if (rVar3 != null && (str = rVar3.f309596a) != null) {
            return str;
        }
        kn0.r rVar4 = (kn0.r) this.f309544k.get(0);
        if (rVar4 != null) {
            return rVar4.f309596a;
        }
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn0.g)) {
            return false;
        }
        kn0.g gVar = (kn0.g) obj;
        return kotlin.jvm.internal.o.b(this.f309534a, gVar.f309534a) && this.f309535b == gVar.f309535b && this.f309536c == gVar.f309536c && kotlin.jvm.internal.o.b(this.f309537d, gVar.f309537d) && this.f309538e == gVar.f309538e && this.f309539f == gVar.f309539f && this.f309540g == gVar.f309540g && this.f309541h == gVar.f309541h && this.f309542i == gVar.f309542i && this.f309543j == gVar.f309543j && kotlin.jvm.internal.o.b(this.f309544k, gVar.f309544k) && this.f309545l == gVar.f309545l && this.f309546m == gVar.f309546m && this.f309547n == gVar.f309547n && kotlin.jvm.internal.o.b(this.f309548o, gVar.f309548o) && kotlin.jvm.internal.o.b(this.f309549p, gVar.f309549p) && this.f309550q == gVar.f309550q && this.f309551r == gVar.f309551r && this.f309552s == gVar.f309552s;
    }

    public final r45.gv f(int i17) {
        java.lang.Object obj;
        java.util.LinkedList cdn_trans_info = this.f309548o.f378540m;
        kotlin.jvm.internal.o.f(cdn_trans_info, "cdn_trans_info");
        java.util.Iterator it = cdn_trans_info.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.gv) obj).f375538f == i17) {
                break;
            }
        }
        return (r45.gv) obj;
    }

    public final kn0.r g(int i17) {
        com.tencent.mars.xlog.Log.i(this.f309553t, "getLiveVideoInfo cdnQualityTag:" + i17 + ", liveInfo:" + this.f309544k.get(java.lang.Integer.valueOf(i17)) + ", cdnQualitySvrcfg:" + this.f309541h + ",cdnCustomerSwitchCfg:" + this.f309543j);
        return (kn0.r) this.f309544k.get(java.lang.Integer.valueOf(i17));
    }

    public final int h() {
        return this.f309547n;
    }

    public int hashCode() {
        int hashCode = ((((this.f309534a.hashCode() * 31) + java.lang.Long.hashCode(this.f309535b)) * 31) + java.lang.Integer.hashCode(this.f309536c)) * 31;
        java.lang.String str = this.f309537d;
        return ((((((((((((((((((((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Long.hashCode(this.f309538e)) * 31) + java.lang.Long.hashCode(this.f309539f)) * 31) + this.f309540g.hashCode()) * 31) + java.lang.Integer.hashCode(this.f309541h)) * 31) + java.lang.Integer.hashCode(this.f309542i)) * 31) + java.lang.Integer.hashCode(this.f309543j)) * 31) + this.f309544k.hashCode()) * 31) + java.lang.Integer.hashCode(this.f309545l)) * 31) + java.lang.Long.hashCode(this.f309546m)) * 31) + java.lang.Integer.hashCode(this.f309547n)) * 31) + this.f309548o.hashCode()) * 31) + this.f309549p.hashCode()) * 31) + java.lang.Long.hashCode(this.f309550q)) * 31) + java.lang.Long.hashCode(this.f309551r)) * 31) + java.lang.Boolean.hashCode(this.f309552s);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r3.f309597b != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
    
        r7 = ko0.t.f309903a;
        r7 = com.tencent.mm.sdk.platformtools.z.f193105a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(int r7) {
        /*
            r6 = this;
            java.util.HashMap r0 = r6.f309544k
            java.util.Collection r0 = r0.values()
            java.lang.String r1 = "<get-values>(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L13:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L47
            java.lang.Object r3 = r0.next()
            if (r2 < 0) goto L42
            kn0.r r3 = (kn0.r) r3
            int r4 = r3.f309597b
            if (r4 != r7) goto L3b
            java.lang.String r4 = r3.f309598c
            r5 = 1
            if (r4 == 0) goto L33
            int r4 = r4.length()
            if (r4 != 0) goto L31
            goto L33
        L31:
            r4 = r1
            goto L34
        L33:
            r4 = r5
        L34:
            if (r4 != 0) goto L3b
            int r3 = r3.f309597b
            if (r3 == 0) goto L3b
            goto L3c
        L3b:
            r5 = r1
        L3c:
            if (r5 == 0) goto L3f
            goto L48
        L3f:
            int r2 = r2 + 1
            goto L13
        L42:
            kz5.c0.p()
            r7 = 0
            throw r7
        L47:
            r2 = -1
        L48:
            ko0.t r7 = ko0.t.f309903a
            java.lang.String r7 = com.tencent.mm.sdk.platformtools.z.f193105a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kn0.g.i(int):int");
    }

    public java.lang.String toString() {
        return "LiveRoomInfo(liveName=" + this.f309534a + ", liveId=" + this.f309535b + ", audienceMode=" + this.f309536c + ", anchorUserId=" + this.f309537d + ", appId=" + this.f309538e + ", bizId=" + this.f309539f + ", cdnSwitchMode=" + this.f309540g + ", cdnQualitySvrcfg=" + this.f309541h + ", cdnH265BackCfg=" + this.f309542i + ", cdnCustomerSwitchLevel=" + this.f309543j + ", cdnUrlMap=" + this.f309544k + ", cdnAudioMode=" + this.f309545l + ", startTime=" + this.f309546m + ", seiMode=" + this.f309547n + ", channelParams=" + this.f309548o + ", nickName=" + this.f309549p + ", useTXLivePlayerCustomRender=" + this.f309550q + ", customRenderInfo=" + this.f309551r + ", enableP2P=" + this.f309552s + ')';
    }
}

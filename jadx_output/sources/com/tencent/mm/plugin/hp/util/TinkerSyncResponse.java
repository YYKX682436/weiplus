package com.tencent.mm.plugin.hp.util;

/* loaded from: classes11.dex */
public class TinkerSyncResponse implements oq1.n, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.hp.util.TinkerSyncResponse> CREATOR = new c83.b();
    public final java.lang.String A;
    public int B;
    public int C;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f142408d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f142409e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Integer f142410f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Integer f142411g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f142412h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f142413i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f142414m;

    /* renamed from: n, reason: collision with root package name */
    public final int f142415n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f142416o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f142417p;

    /* renamed from: q, reason: collision with root package name */
    public final int f142418q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f142419r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f142420s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f142421t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f142422u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f142423v;

    /* renamed from: w, reason: collision with root package name */
    public final long f142424w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f142425x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f142426y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f142427z;

    public TinkerSyncResponse(r45.j35 j35Var) {
        this.f142409e = new java.util.HashMap();
        this.f142423v = true;
        this.f142424w = 0L;
        this.f142425x = true;
        this.f142426y = true;
        this.f142427z = true;
        if (j35Var == null) {
            this.f142408d = 1;
            this.f142412h = "";
            this.f142413i = "";
            this.f142410f = -1;
            this.f142411g = -1;
            this.f142414m = "";
            this.f142415n = 0;
            this.f142416o = "";
            this.f142417p = "";
            this.f142418q = 0;
            this.f142419r = "";
            this.f142420s = "";
            this.f142421t = "";
            this.f142422u = "";
            return;
        }
        r45.bs5 bs5Var = j35Var.f377538i;
        if (bs5Var != null) {
            this.f142413i = bs5Var.f371025d;
            this.f142412h = bs5Var.f371027f;
            this.f142415n = bs5Var.f371032n;
        } else {
            this.f142413i = "";
            this.f142412h = "";
            this.f142415n = 0;
        }
        this.f142408d = java.lang.Integer.valueOf(j35Var.f377534e);
        this.f142411g = java.lang.Integer.valueOf(j35Var.f377537h);
        java.util.LinkedList linkedList = j35Var.f377535f;
        if (linkedList != null && !linkedList.isEmpty()) {
            int size = linkedList.size();
            for (int i17 = 0; i17 < size; i17++) {
                r45.i35 i35Var = (r45.i35) linkedList.get(i17);
                java.util.LinkedList linkedList2 = i35Var.f376702e;
                if (linkedList2 != null && !linkedList2.isEmpty()) {
                    this.f142409e.put(java.lang.Integer.valueOf(i35Var.f376701d), i35Var.f376702e);
                }
            }
        }
        this.f142410f = java.lang.Integer.valueOf(j35Var.f377536g);
        this.f142414m = j35Var.f377533d;
        java.util.LinkedList linkedList3 = j35Var.f377540n;
        if (linkedList3 != null && !linkedList3.isEmpty()) {
            java.util.Iterator it = linkedList3.iterator();
            while (it.hasNext()) {
                r45.h35 h35Var = (r45.h35) it.next();
                if (h35Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(h35Var.f375806d)) {
                    if (h35Var.f375806d.equalsIgnoreCase("newApkMd5")) {
                        this.f142416o = h35Var.f375807e;
                    } else if (h35Var.f375806d.equalsIgnoreCase("oldApkMd5")) {
                        this.f142417p = h35Var.f375807e;
                    } else if (h35Var.f375806d.equalsIgnoreCase(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.VERSIONCODE)) {
                        this.f142418q = com.tencent.mm.sdk.platformtools.t8.D1(h35Var.f375807e, 0);
                    } else if (h35Var.f375806d.equalsIgnoreCase("clientVersion")) {
                        this.f142419r = h35Var.f375807e;
                    } else if (h35Var.f375806d.equalsIgnoreCase("alphaTitle")) {
                        java.lang.String str = h35Var.f375807e;
                        this.f142420s = !com.tencent.mm.sdk.platformtools.t8.K0(str) ? new java.lang.String(android.util.Base64.decode(str, 0)) : "";
                    } else if (h35Var.f375806d.equalsIgnoreCase("alphaContent")) {
                        java.lang.String str2 = h35Var.f375807e;
                        this.f142421t = !com.tencent.mm.sdk.platformtools.t8.K0(str2) ? new java.lang.String(android.util.Base64.decode(str2, 0)) : "";
                    } else if (h35Var.f375806d.equalsIgnoreCase("alphaUrl")) {
                        this.f142422u = h35Var.f375807e;
                    } else if (h35Var.f375806d.equalsIgnoreCase("isShowNotification")) {
                        this.f142425x = com.tencent.mm.sdk.platformtools.t8.D1(h35Var.f375807e, 1) == 1;
                    } else if (h35Var.f375806d.equalsIgnoreCase("isShowRedot")) {
                        this.f142426y = com.tencent.mm.sdk.platformtools.t8.D1(h35Var.f375807e, 1) == 1;
                    } else if (h35Var.f375806d.equalsIgnoreCase("isShowDialog")) {
                        this.f142427z = com.tencent.mm.sdk.platformtools.t8.D1(h35Var.f375807e, 0) == 1;
                    } else if (h35Var.f375806d.equalsIgnoreCase("showDialogMaxTimes")) {
                        this.C = com.tencent.mm.sdk.platformtools.t8.D1(h35Var.f375807e, 1);
                    } else if (h35Var.f375806d.equalsIgnoreCase("showDialogIntervalTime")) {
                        this.B = com.tencent.mm.sdk.platformtools.t8.D1(h35Var.f375807e, 6);
                    }
                }
            }
            return;
        }
        this.f142416o = "";
        this.f142417p = "";
        this.f142418q = 0;
        this.f142419r = "";
        this.f142420s = "";
        this.f142421t = "";
        this.f142422u = "";
        this.f142426y = true;
        this.f142427z = false;
        this.f142425x = true;
        this.C = 1;
        this.B = 6;
    }

    public boolean a() {
        java.lang.Integer num = this.f142408d;
        if (num.intValue() > 4 || num.intValue() < 1) {
            com.tencent.mars.xlog.Log.e("Tinker.TinkerSyncResponse", "responseState: %d must between %d and %d", num, 1, 4);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 24L, 1L, false);
            return false;
        }
        if (i()) {
            if (android.text.TextUtils.isEmpty(this.f142414m)) {
                com.tencent.mars.xlog.Log.e("Tinker.TinkerSyncResponse", "sync response patchId should not be null");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 25L, 1L, false);
                return false;
            }
            if (android.text.TextUtils.isEmpty(this.f142412h)) {
                com.tencent.mars.xlog.Log.e("Tinker.TinkerSyncResponse", "sync response cdnUrl should not be null");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 26L, 1L, false);
                return false;
            }
            if (android.text.TextUtils.isEmpty(this.f142413i)) {
                com.tencent.mars.xlog.Log.e("Tinker.TinkerSyncResponse", "sync response fileMd5 should not be null");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(614L, 27L, 1L, false);
                return false;
            }
        }
        return true;
    }

    public java.lang.String b() {
        java.util.HashMap hashMap = this.f142409e;
        return hashMap != null && !hashMap.isEmpty() && hashMap.containsKey(4) ? d(hashMap, 4) : "";
    }

    public int c() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String str = this.f142419r;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = com.tencent.mm.sdk.platformtools.z.f193111g;
        com.tencent.mars.xlog.Log.i("Tinker.TinkerSyncResponse", "clientVersion %s currentVersion %s", objArr);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f142419r)) {
            try {
                return java.lang.Integer.decode(this.f142419r).intValue();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Tinker.TinkerSyncResponse", e17, "getClientVersionCode", new java.lang.Object[0]);
            }
        }
        return 0;
    }

    public final java.lang.String d(java.util.HashMap hashMap, int i17) {
        java.util.LinkedList linkedList;
        java.lang.String str = "";
        if (hashMap != null && !hashMap.isEmpty() && (linkedList = (java.util.LinkedList) hashMap.get(java.lang.Integer.valueOf(i17))) != null && !linkedList.isEmpty()) {
            int size = linkedList.size();
            for (int i18 = 0; i18 < size; i18++) {
                r45.br4 br4Var = (r45.br4) linkedList.get(i18);
                if (br4Var.f371006d.equalsIgnoreCase("default")) {
                    str = new java.lang.String(android.util.Base64.decode(br4Var.f371007e, 0));
                } else if (br4Var.f371006d.equalsIgnoreCase(com.tencent.mm.sdk.platformtools.m2.d())) {
                    return new java.lang.String(android.util.Base64.decode(br4Var.f371007e, 0));
                }
            }
        }
        return str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f142410f.intValue();
    }

    public boolean f() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        java.lang.String str = this.f142419r;
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        objArr[1] = com.tencent.mm.sdk.platformtools.z.f193111g;
        com.tencent.mars.xlog.Log.i("Tinker.TinkerSyncResponse", "clientVersion %s currentVersion %s", objArr);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f142419r)) {
            try {
                return (java.lang.Integer.decode(this.f142419r).intValue() & (-256)) < (java.lang.Integer.decode(com.tencent.mm.sdk.platformtools.z.f193111g).intValue() & (-256));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Tinker.TinkerSyncResponse", e17, "isLowerClientVersion", new java.lang.Object[0]);
            }
        }
        return false;
    }

    public boolean g() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (!com.tencent.mars.comm.NetStatusUtil.isConnected(context)) {
            return false;
        }
        java.lang.Integer num = this.f142411g;
        if (num.intValue() != 1 && num.intValue() == 3) {
            return com.tencent.mars.comm.NetStatusUtil.isWifi(context);
        }
        return true;
    }

    public boolean h() {
        return this.f142408d.intValue() == 3;
    }

    public boolean i() {
        java.lang.Integer num = this.f142408d;
        return num.intValue() == 2 || num.intValue() == 4;
    }

    public java.lang.String toString() {
        return "\nutils packageType:" + this.f142410f + "\nisAuto:" + this.f142423v + "\nresponseState:" + this.f142408d + "\ncdnUrl:" + this.f142412h + "\nfileMd5:" + this.f142413i + "\nnetworkType:" + this.f142411g + "\npatchId:" + this.f142414m + "\nisShowNotification:" + this.f142425x + "\nisShowDialog:" + this.f142427z + "\nisShowRedot:" + this.f142426y + "\nnewApkMd5:" + this.f142416o + "\noldApkMd5:" + this.f142417p + "\nclientVersion:" + this.f142419r + "\ngetClientVersionCode:" + c();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeValue(this.f142408d);
        parcel.writeSerializable(this.f142409e);
        parcel.writeValue(this.f142410f);
        parcel.writeValue(this.f142411g);
        parcel.writeString(this.f142412h);
        parcel.writeString(this.f142413i);
        parcel.writeString(this.f142414m);
        parcel.writeInt(this.f142415n);
        parcel.writeString(this.f142416o);
        parcel.writeString(this.f142417p);
        parcel.writeInt(this.f142418q);
        parcel.writeString(this.f142419r);
        parcel.writeString(this.f142420s);
        parcel.writeString(this.f142421t);
        parcel.writeString(this.f142422u);
        parcel.writeByte(this.f142423v ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f142424w);
        parcel.writeByte(this.f142425x ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f142426y ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f142427z ? (byte) 1 : (byte) 0);
        parcel.writeString(this.A);
        parcel.writeInt(this.B);
        parcel.writeInt(this.C);
    }

    public TinkerSyncResponse(android.os.Parcel parcel) {
        this.f142409e = new java.util.HashMap();
        this.f142423v = true;
        this.f142424w = 0L;
        this.f142425x = true;
        this.f142426y = true;
        this.f142427z = true;
        this.f142408d = (java.lang.Integer) parcel.readValue(java.lang.Integer.class.getClassLoader());
        this.f142409e = (java.util.HashMap) parcel.readSerializable();
        this.f142410f = (java.lang.Integer) parcel.readValue(java.lang.Integer.class.getClassLoader());
        this.f142411g = (java.lang.Integer) parcel.readValue(java.lang.Integer.class.getClassLoader());
        this.f142412h = parcel.readString();
        this.f142413i = parcel.readString();
        this.f142414m = parcel.readString();
        this.f142415n = parcel.readInt();
        this.f142416o = parcel.readString();
        this.f142417p = parcel.readString();
        this.f142418q = parcel.readInt();
        this.f142419r = parcel.readString();
        this.f142420s = parcel.readString();
        this.f142421t = parcel.readString();
        this.f142422u = parcel.readString();
        this.f142423v = parcel.readByte() != 0;
        this.f142424w = parcel.readLong();
        this.f142425x = parcel.readByte() != 0;
        this.f142426y = parcel.readByte() != 0;
        this.f142427z = parcel.readByte() != 0;
        this.A = parcel.readString();
        this.B = parcel.readInt();
        this.C = parcel.readInt();
    }
}

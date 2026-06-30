package com.tencent.mm.ui.report;

/* loaded from: classes9.dex */
public class KV17560Reporter implements android.os.Parcelable {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f209612d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.report.j0 f209613e;

    /* renamed from: f, reason: collision with root package name */
    public int f209614f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f209615g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f209616h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.report.h0 f209617i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.WeakHashMap f209611m = new java.util.WeakHashMap(4);
    public static final android.os.Parcelable.Creator<com.tencent.mm.ui.report.KV17560Reporter> CREATOR = new com.tencent.mm.ui.report.g0();

    public KV17560Reporter() {
        this.f209613e = com.tencent.mm.ui.report.j0.Unknown;
        this.f209617i = com.tencent.mm.ui.report.h0.Unknown;
    }

    public static synchronized com.tencent.mm.ui.report.KV17560Reporter c(android.app.Activity activity) {
        synchronized (com.tencent.mm.ui.report.KV17560Reporter.class) {
            if (activity == null) {
                return new com.tencent.mm.ui.report.KV17560Reporter() { // from class: com.tencent.mm.ui.report.KV17560Reporter.2
                    @Override // com.tencent.mm.ui.report.KV17560Reporter
                    public void b(com.tencent.mm.ui.report.i0 i0Var) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.KV17560Reporter", "[!] report with OpType %s was ignored since contextAnchor was null.", i0Var);
                    }
                };
            }
            com.tencent.mm.ui.report.KV17560Reporter kV17560Reporter = (com.tencent.mm.ui.report.KV17560Reporter) f209611m.get(activity);
            if (kV17560Reporter != null) {
                return kV17560Reporter;
            }
            android.content.Intent intent = activity.getIntent();
            com.tencent.mm.ui.report.KV17560Reporter kV17560Reporter2 = null;
            if (intent != null) {
                try {
                    kV17560Reporter2 = (com.tencent.mm.ui.report.KV17560Reporter) intent.getParcelableExtra("KV17560Reporter_Data");
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.KV17560Reporter", th6, "[-] fail to deserialize.", new java.lang.Object[0]);
                }
            }
            if (kV17560Reporter2 == null) {
                kV17560Reporter2 = new com.tencent.mm.ui.report.KV17560Reporter();
            }
            f209611m.put(activity, kV17560Reporter2);
            return kV17560Reporter2;
        }
    }

    public void a(android.content.Intent intent) {
        try {
            intent.putExtra("KV17560Reporter_Data", this);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.KV17560Reporter", th6, "[-] fail to serialize.", new java.lang.Object[0]);
        }
    }

    public void b(com.tencent.mm.ui.report.i0 i0Var) {
        if (i0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.KV17560Reporter", "[!] opType is null, skip report.");
            return;
        }
        com.tencent.mm.ui.report.h0 h0Var = this.f209617i;
        if (h0Var == null || h0Var == com.tencent.mm.ui.report.h0.Unknown) {
            com.tencent.mars.xlog.Log.w("MicroMsg.KV17560Reporter", "[!] mediaType is null or unknown, skip report.");
            return;
        }
        com.tencent.mm.ui.report.j0 j0Var = this.f209613e;
        if (j0Var == null || j0Var == com.tencent.mm.ui.report.j0.Unknown) {
            com.tencent.mars.xlog.Log.w("MicroMsg.KV17560Reporter", "[!] scene is null or unknown, skip report.");
            return;
        }
        if (android.text.TextUtils.isEmpty(this.f209612d)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.KV17560Reporter", "[!] chatname is null or empty, skip report.");
            return;
        }
        if (android.text.TextUtils.isEmpty(this.f209615g)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.KV17560Reporter", "[!] enter session id is null or empty, skip report.");
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[7];
        objArr[0] = java.lang.Integer.valueOf(i0Var.f209672d);
        objArr[1] = java.lang.Integer.valueOf(this.f209617i.f209652d);
        objArr[2] = java.lang.Integer.valueOf(this.f209613e.f209683d);
        java.lang.String str = this.f209612d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        objArr[4] = this.f209616h;
        objArr[5] = java.lang.Integer.valueOf(this.f209614f);
        java.lang.String str2 = this.f209615g;
        objArr[6] = str2 != null ? str2 : "";
        g0Var.d(17560, objArr);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f209612d);
        com.tencent.mm.ui.report.j0 j0Var = this.f209613e;
        parcel.writeInt(j0Var != null ? j0Var.f209683d : 0);
        parcel.writeInt(this.f209614f);
        parcel.writeString(this.f209615g);
        parcel.writeString(this.f209616h);
        com.tencent.mm.ui.report.h0 h0Var = this.f209617i;
        parcel.writeInt(h0Var != null ? h0Var.f209652d : 0);
    }

    public KV17560Reporter(java.lang.String str, com.tencent.mm.ui.report.j0 j0Var, int i17, java.lang.String str2, java.lang.String str3, com.tencent.mm.ui.report.h0 h0Var, com.tencent.mm.ui.report.g0 g0Var) {
        this.f209612d = str;
        this.f209613e = j0Var;
        this.f209614f = i17;
        this.f209615g = str2;
        this.f209616h = str3;
        this.f209617i = h0Var;
    }
}

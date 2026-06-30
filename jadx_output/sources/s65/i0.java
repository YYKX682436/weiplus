package s65;

/* loaded from: classes11.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f403468a;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f403470c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f403471d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f403472e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f403473f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f403474g;

    /* renamed from: h, reason: collision with root package name */
    public final int f403475h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f403476i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f403477j;

    /* renamed from: k, reason: collision with root package name */
    public final int f403478k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f403479l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f403480m;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f403469b = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final boolean f403481n = true;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f403482o = true;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f403483p = true;

    public i0(r45.j35 j35Var) {
        if (j35Var == null) {
            this.f403468a = 1;
            this.f403472e = "";
            this.f403473f = "";
            this.f403470c = -1;
            this.f403471d = -1;
            this.f403474g = "";
            this.f403475h = 0;
            this.f403476i = "";
            this.f403477j = "";
            this.f403478k = 0;
            this.f403479l = "";
            this.f403480m = "";
            return;
        }
        r45.bs5 bs5Var = j35Var.f377538i;
        if (bs5Var != null) {
            this.f403473f = bs5Var.f371025d;
            this.f403472e = bs5Var.f371027f;
            this.f403475h = bs5Var.f371032n;
        } else {
            this.f403473f = "";
            this.f403472e = "";
            this.f403475h = 0;
        }
        this.f403468a = java.lang.Integer.valueOf(j35Var.f377534e);
        this.f403471d = java.lang.Integer.valueOf(j35Var.f377537h);
        java.util.LinkedList linkedList = j35Var.f377535f;
        if (linkedList != null && !linkedList.isEmpty()) {
            int size = linkedList.size();
            for (int i17 = 0; i17 < size; i17++) {
                r45.i35 i35Var = (r45.i35) linkedList.get(i17);
                java.util.LinkedList linkedList2 = i35Var.f376702e;
                if (linkedList2 != null && !linkedList2.isEmpty()) {
                    this.f403469b.put(java.lang.Integer.valueOf(i35Var.f376701d), i35Var.f376702e);
                }
            }
        }
        this.f403470c = java.lang.Integer.valueOf(j35Var.f377536g);
        this.f403474g = j35Var.f377533d;
        java.util.LinkedList linkedList3 = j35Var.f377540n;
        if (linkedList3 == null || linkedList3.isEmpty()) {
            this.f403476i = "";
            this.f403477j = "";
            this.f403478k = 0;
            this.f403479l = "";
            this.f403480m = "";
            return;
        }
        java.util.Iterator it = linkedList3.iterator();
        while (it.hasNext()) {
            r45.h35 h35Var = (r45.h35) it.next();
            if (h35Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(h35Var.f375806d)) {
                if (h35Var.f375806d.equalsIgnoreCase("newApkMd5")) {
                    this.f403476i = h35Var.f375807e;
                } else if (h35Var.f375806d.equalsIgnoreCase("oldApkMd5")) {
                    this.f403477j = h35Var.f375807e;
                } else if (h35Var.f375806d.equalsIgnoreCase(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.VERSIONCODE)) {
                    this.f403478k = com.tencent.mm.sdk.platformtools.t8.D1(h35Var.f375807e, 0);
                } else if (h35Var.f375806d.equalsIgnoreCase("clientVersion")) {
                    this.f403479l = h35Var.f375807e;
                } else if (h35Var.f375806d.equalsIgnoreCase("alphaTitle")) {
                    java.lang.String str = h35Var.f375807e;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        new java.lang.String(android.util.Base64.decode(str, 0));
                    }
                } else if (h35Var.f375806d.equalsIgnoreCase("alphaContent")) {
                    java.lang.String str2 = h35Var.f375807e;
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                        new java.lang.String(android.util.Base64.decode(str2, 0));
                    }
                } else if (h35Var.f375806d.equalsIgnoreCase("alphaUrl")) {
                    this.f403480m = h35Var.f375807e;
                }
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\nupdater, packageType:");
        sb6.append(this.f403470c);
        sb6.append("\nresponseState:");
        sb6.append(this.f403468a);
        sb6.append("\ncdnUrl:");
        sb6.append(this.f403472e);
        sb6.append("\nfileMd5:");
        sb6.append(this.f403473f);
        sb6.append("\nnetworkType:");
        sb6.append(this.f403471d);
        sb6.append("\npatchId:");
        sb6.append(this.f403474g);
        sb6.append("\nisShowNotification:");
        sb6.append(this.f403481n);
        sb6.append("\nisShowDialog:");
        sb6.append(this.f403483p);
        sb6.append("\nisShowRedot:");
        sb6.append(this.f403482o);
        sb6.append("\nnewApkMd5:");
        sb6.append(this.f403476i);
        sb6.append("\noldApkMd5:");
        sb6.append(this.f403477j);
        sb6.append("\nclientVersion:");
        java.lang.String str = this.f403479l;
        sb6.append(str);
        sb6.append("\ngetClientVersionCode:");
        java.lang.Object[] objArr = new java.lang.Object[2];
        int i17 = 0;
        objArr[0] = str == null ? "" : str;
        objArr[1] = com.tencent.mm.sdk.platformtools.z.f193111g;
        com.tencent.mars.xlog.Log.i("Tinker.TinkerSyncResponse", "clientVersion %s currentVersion %s", objArr);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                i17 = java.lang.Integer.decode(str).intValue();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("Tinker.TinkerSyncResponse", e17, "getClientVersionCode", new java.lang.Object[0]);
            }
        }
        sb6.append(i17);
        return sb6.toString();
    }
}

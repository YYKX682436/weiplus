package o23;

/* loaded from: classes10.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public int f342427a;

    /* renamed from: b, reason: collision with root package name */
    public int f342428b;

    /* renamed from: c, reason: collision with root package name */
    public int f342429c;

    /* renamed from: d, reason: collision with root package name */
    public int f342430d;

    /* renamed from: e, reason: collision with root package name */
    public int f342431e;

    /* renamed from: f, reason: collision with root package name */
    public int f342432f;

    /* renamed from: g, reason: collision with root package name */
    public int f342433g;

    /* renamed from: h, reason: collision with root package name */
    public int f342434h;

    /* renamed from: i, reason: collision with root package name */
    public int f342435i;

    /* renamed from: j, reason: collision with root package name */
    public int f342436j;

    /* renamed from: k, reason: collision with root package name */
    public int f342437k;

    /* renamed from: l, reason: collision with root package name */
    public int f342438l;

    /* renamed from: m, reason: collision with root package name */
    public int f342439m;

    /* renamed from: n, reason: collision with root package name */
    public int f342440n;

    /* renamed from: o, reason: collision with root package name */
    public int f342441o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f342442p;

    /* renamed from: q, reason: collision with root package name */
    public long f342443q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f342444r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f342445s = false;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f342446t = "";

    /* renamed from: u, reason: collision with root package name */
    public final java.util.List f342447u = new java.util.ArrayList(9);

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f342448v = new java.util.ArrayList(9);

    /* renamed from: w, reason: collision with root package name */
    public final java.util.List f342449w = new java.util.ArrayList(9);

    /* renamed from: x, reason: collision with root package name */
    public final java.util.List f342450x = new java.util.ArrayList(9);

    /* renamed from: y, reason: collision with root package name */
    public final java.util.List f342451y = new java.util.ArrayList(9);

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashMap f342452z = new java.util.HashMap(9);
    public final java.util.Set A = new java.util.HashSet();
    public final java.lang.ThreadLocal B = new o23.k(this);
    public boolean C = false;
    public o23.l D = new o23.l();

    public n(o23.k kVar) {
    }

    public void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryReporter", "path: %s.", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        ((java.util.ArrayList) this.f342447u).remove(str);
        ((java.util.ArrayList) this.f342448v).remove(str);
        ((java.util.ArrayList) this.f342449w).remove(str);
        ((java.util.ArrayList) this.f342450x).remove(str);
        ((java.util.ArrayList) this.f342451y).remove(str);
        this.f342452z.remove(str);
        ((java.util.HashSet) this.A).remove(str);
    }

    public void b() {
        java.util.List list = this.f342447u;
        this.f342431e = ((java.util.ArrayList) list).size();
        java.util.List list2 = this.f342448v;
        this.f342432f = ((java.util.ArrayList) list2).size();
        java.util.List list3 = this.f342449w;
        this.f342433g = ((java.util.ArrayList) list3).size();
        java.util.List list4 = this.f342450x;
        this.f342434h = ((java.util.ArrayList) list4).size();
        java.util.List list5 = this.f342451y;
        this.f342435i = ((java.util.ArrayList) list5).size();
        long max = java.lang.Math.max(c01.id.c() - this.f342443q, 0L);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.HashMap hashMap = this.f342452z;
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            sb6.append(((java.util.Map.Entry) it.next()).getValue());
            sb6.append("|");
        }
        com.tencent.mm.autogen.mmdata.rpt.GalleryOpeReportStruct galleryOpeReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GalleryOpeReportStruct();
        galleryOpeReportStruct.f58270d = this.f342427a;
        galleryOpeReportStruct.f58271e = this.f342428b;
        galleryOpeReportStruct.f58272f = this.f342429c;
        galleryOpeReportStruct.f58273g = this.f342430d;
        galleryOpeReportStruct.f58274h = this.f342431e;
        galleryOpeReportStruct.f58275i = this.f342432f;
        galleryOpeReportStruct.f58276j = this.f342433g;
        galleryOpeReportStruct.f58277k = this.f342434h;
        galleryOpeReportStruct.f58278l = this.f342435i;
        galleryOpeReportStruct.f58279m = galleryOpeReportStruct.b("sendMediaPoi", sb6.toString(), true);
        galleryOpeReportStruct.f58280n = this.f342436j;
        galleryOpeReportStruct.f58281o = this.f342437k;
        galleryOpeReportStruct.f58282p = this.f342440n;
        galleryOpeReportStruct.f58283q = this.f342441o;
        galleryOpeReportStruct.f58284r = galleryOpeReportStruct.b("SendSessionID", this.f342442p, true);
        galleryOpeReportStruct.f58287u = max;
        galleryOpeReportStruct.f58285s = this.f342438l;
        galleryOpeReportStruct.f58286t = this.f342439m;
        galleryOpeReportStruct.f58290x = this.C ? 1 : 0;
        galleryOpeReportStruct.f58288v = this.f342444r ? 1L : 0L;
        galleryOpeReportStruct.f58291y = galleryOpeReportStruct.b("FinalSelectedImageCountDetail", this.f342446t, true);
        if (this.f342445s) {
            galleryOpeReportStruct.B = galleryOpeReportStruct.b("QuickSendActionCount", this.D.b(), true);
            this.D.b();
        } else {
            galleryOpeReportStruct.A = galleryOpeReportStruct.b("BigPhotoActionCount", this.D.b(), true);
            this.D.b();
        }
        galleryOpeReportStruct.k();
        if (com.tencent.mars.xlog.Log.isDebug()) {
            galleryOpeReportStruct.n().replace(com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ");
        }
        this.f342427a = 0;
        this.f342428b = 0;
        this.f342429c = 0;
        this.f342430d = 0;
        this.f342431e = 0;
        this.f342432f = 0;
        this.f342433g = 0;
        this.f342434h = 0;
        this.f342435i = 0;
        this.f342436j = 0;
        this.f342437k = 0;
        this.f342440n = 0;
        this.f342441o = 0;
        this.f342442p = "";
        this.C = false;
        this.f342444r = false;
        ((java.util.ArrayList) list).clear();
        ((java.util.ArrayList) list2).clear();
        ((java.util.ArrayList) list3).clear();
        ((java.util.ArrayList) list4).clear();
        ((java.util.ArrayList) list5).clear();
        this.f342446t = "";
        this.D = new o23.l();
        hashMap.clear();
        ((java.util.HashSet) this.A).clear();
        this.f342445s = false;
    }

    public void c(java.lang.String str, int i17, int i18) {
        if (i17 < 0 || i17 > 4) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GalleryReporter", "type error, %d.", java.lang.Integer.valueOf(i17));
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GalleryReporter", "path is invalid!");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryReporter", "type: %d, path: %s.", java.lang.Integer.valueOf(i17), str);
        java.util.List list = this.f342447u;
        boolean contains = ((java.util.ArrayList) list).contains(str);
        java.util.Set set = this.A;
        java.util.HashMap hashMap = this.f342452z;
        boolean z17 = true;
        if (contains) {
            ((java.util.ArrayList) list).remove(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.GalleryReporter", "sendCountFromSearchUnOCRList, remove.");
        } else {
            java.util.List list2 = this.f342448v;
            if (((java.util.ArrayList) list2).contains(str)) {
                ((java.util.ArrayList) list2).remove(str);
                com.tencent.mars.xlog.Log.i("MicroMsg.GalleryReporter", "sendCountFromSearchOCRList, remove.");
            } else {
                java.util.List list3 = this.f342449w;
                if (((java.util.ArrayList) list3).contains(str)) {
                    ((java.util.ArrayList) list3).remove(str);
                    com.tencent.mars.xlog.Log.i("MicroMsg.GalleryReporter", "sendCountFromClassifyList, remove.");
                } else {
                    java.util.List list4 = this.f342450x;
                    if (((java.util.ArrayList) list4).contains(str)) {
                        ((java.util.ArrayList) list4).remove(str);
                        com.tencent.mars.xlog.Log.i("MicroMsg.GalleryReporter", "sendCountFromDefaultList, remove.");
                    } else {
                        java.util.List list5 = this.f342451y;
                        if (((java.util.ArrayList) list5).contains(str)) {
                            ((java.util.ArrayList) list5).remove(str);
                            com.tencent.mars.xlog.Log.i("MicroMsg.GalleryReporter", "sendCountFromOtherList, remove.");
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.GalleryReporter", "add!!!");
                            if (i17 == 0) {
                                ((java.util.ArrayList) list).add(str);
                            } else if (i17 == 1) {
                                ((java.util.ArrayList) list2).add(str);
                            } else if (i17 == 2) {
                                ((java.util.ArrayList) list3).add(str);
                            } else if (i17 == 3) {
                                ((java.util.ArrayList) list4).add(str);
                            } else if (i17 == 4) {
                                ((java.util.ArrayList) list5).add(str);
                            }
                            hashMap.put(str, java.lang.Integer.valueOf(i18));
                            if (((java.lang.Boolean) this.B.get()).booleanValue()) {
                                ((java.util.HashSet) set).add(str);
                            }
                            z17 = false;
                        }
                    }
                }
            }
        }
        if (z17) {
            hashMap.remove(str);
            ((java.util.HashSet) set).remove(str);
        }
    }
}

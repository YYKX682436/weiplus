package ql0;

/* loaded from: classes13.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ql0.l f364464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f364465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364466f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f364467g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364468h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f364469i;

    public g(ql0.l lVar, boolean z17, java.lang.String str, java.lang.Boolean bool, java.lang.Float f17, java.lang.String str2, java.lang.String str3) {
        this.f364464d = lVar;
        this.f364465e = z17;
        this.f364466f = str;
        this.f364467g = f17;
        this.f364468h = str2;
        this.f364469i = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ql0.l lVar = this.f364464d;
        java.lang.String str = lVar.f364493d;
        boolean z17 = this.f364465e;
        java.lang.String str2 = this.f364466f;
        java.lang.String str3 = this.f364468h;
        if (!z17 || android.text.TextUtils.isEmpty(str2)) {
            com.tencent.mars.xlog.Log.e(str, "red dot id null");
            tl0.b.f420197d.z0(2);
        } else {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = str2;
            objArr[1] = str3 == null ? "" : str3;
            java.lang.String str4 = this.f364469i;
            objArr[2] = str4 == null ? "" : str4;
            com.tencent.mars.xlog.Log.i(str, "click reddotId:%s anchorId:%s title:%s", objArr);
            ul0.c cVar = tl0.b.f420196c;
            if (cVar == null) {
                com.tencent.mars.xlog.Log.e(str, "db null?");
            } else if (kl0.a.b()) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                calendar.setTime(new java.util.Date(currentTimeMillis));
                int i17 = calendar.get(7);
                int i18 = calendar.get(11);
                dm.n7 n7Var = new dm.n7();
                n7Var.field_reddotId = str2 == null ? "" : str2;
                n7Var.field_anchorId = str3 == null ? "" : str3;
                if (str4 == null) {
                    str4 = "";
                }
                n7Var.field_title = str4;
                n7Var.field_timestamp = currentTimeMillis;
                n7Var.field_dayOfWeek = i17;
                n7Var.field_hourOfDay = i18;
                n7Var.field_action = 2;
                if (!cVar.z0(n7Var)) {
                    cVar.D0(n7Var);
                }
                com.tencent.mars.xlog.Log.i(str, "save BaseLiveHomeRedDotEvent " + str2);
                em0.b.b("LiveHomeRedDot", 501);
                hl0.e eVar = new hl0.e("LiveHomeRedDot", str2);
                eVar.f282060h = java.lang.System.currentTimeMillis();
                eVar.a();
                if (!android.text.TextUtils.isEmpty(str2)) {
                    lVar.wi(str2 != null ? str2 : "", true);
                }
            }
        }
        if (wm.a.a()) {
            lVar.getClass();
            ((vm.b) ((xs.x0) i95.n0.c(xs.x0.class))).requireAccountInitialized();
            if (!z17) {
                new com.tencent.wechat.aff.cara.CaraCppLiveCellProphet().reportThatCellConsume(java.util.Optional.of(java.lang.Boolean.TRUE));
                new com.tencent.wechat.aff.cara.CaraCppLiveFeatureCenter().reportThatCellConsume();
            } else {
                new com.tencent.wechat.aff.cara.CaraCppLiveReddotProphet().reportThatReddotConsume(str2, java.util.Optional.of(java.lang.Boolean.TRUE));
                com.tencent.wechat.aff.cara.CaraCppLiveFeatureCenter caraCppLiveFeatureCenter = new com.tencent.wechat.aff.cara.CaraCppLiveFeatureCenter();
                java.lang.Float f17 = this.f364467g;
                caraCppLiveFeatureCenter.reportThatReddotConsume(str2, str3, java.util.Optional.of(java.lang.Float.valueOf(f17 != null ? f17.floatValue() : 0.0f)));
            }
        }
    }
}

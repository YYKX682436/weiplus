package vd2;

/* loaded from: classes2.dex */
public final class q3 implements ss5.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f435864a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435865b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435866c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435867d;

    public q3(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f435864a = j17;
        this.f435865b = str;
        this.f435866c = str2;
        this.f435867d = str3;
    }

    @Override // ss5.d0
    public void c(com.tencent.mm.modelbase.f it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) it.f70618d).getCustom(2);
        if (it.f70615a != 0 || it.f70616b != 0 || finderObject == null) {
            vd2.t3 t3Var = vd2.t3.f435921a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpLiveUIAndDoAction failed. ");
            sb6.append(it.f70615a);
            sb6.append(", ");
            sb6.append(it.f70616b);
            sb6.append(", ");
            sb6.append(finderObject == null);
            com.tencent.mars.xlog.Log.w("Finder.FinderUtilApi", sb6.toString());
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.e3z);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            if (it.f70616b == -4036) {
                string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.exw);
                kotlin.jvm.internal.o.f(string, "getString(...)");
            }
            db5.t7.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, string, 0).show();
            return;
        }
        vd2.t3 t3Var2 = vd2.t3.f435921a;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("jumpLiveUIAndDoAction liveId: ");
        r45.nw1 liveInfo = finderObject.getLiveInfo();
        sb7.append(liveInfo != null ? liveInfo.getLong(0) : this.f435864a);
        sb7.append(", username:");
        java.lang.String username = finderObject.getUsername();
        if (username == null && (username = this.f435865b) == null) {
            username = "";
        }
        sb7.append(username);
        com.tencent.mars.xlog.Log.i("Finder.FinderUtilApi", sb7.toString());
        bu2.j jVar = bu2.j.f24534a;
        com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 0);
        bu2.i iVar = bu2.i.f24521b;
        jVar.n(a17, bu2.i.f24531l);
        java.lang.String str = this.f435866c;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[4];
        java.lang.String str2 = this.f435867d;
        if (str2 == null) {
            str2 = "";
        }
        objArr[0] = str2;
        objArr[1] = str;
        objArr[2] = java.lang.Long.valueOf(finderObject.getId());
        objArr[3] = "";
        g0Var.d(21140, objArr);
    }
}

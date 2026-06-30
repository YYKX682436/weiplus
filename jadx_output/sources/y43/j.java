package y43;

/* loaded from: classes2.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o33.d f459351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f459352e;

    public j(o33.d dVar, java.lang.String str) {
        this.f459351d = dVar;
        this.f459352e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.LinkedList<o33.g> url_lite_conf_list = this.f459351d.f342731d;
        kotlin.jvm.internal.o.f(url_lite_conf_list, "url_lite_conf_list");
        for (o33.g gVar : url_lite_conf_list) {
            y43.e eVar = new y43.e();
            eVar.field_url = this.f459352e;
            o33.e eVar2 = gVar.f342743f;
            eVar.field_appid = eVar2 != null ? eVar2.f342732d : null;
            eVar.field_path = eVar2 != null ? eVar2.f342733e : null;
            eVar.field_expire_duration = eVar2 != null ? eVar2.f342734f : 0;
            eVar.field_refresh_duration = eVar2 != null ? eVar2.f342735g : 0;
            eVar.field_wepkg_id = eVar2 != null ? eVar2.f342736h : null;
            eVar.field_updateTime = java.lang.System.currentTimeMillis();
            eVar.field_hasLiteConf = gVar.f342742e;
            o33.e eVar3 = gVar.f342743f;
            java.lang.String str = eVar3 != null ? eVar3.f342736h : null;
            if (!(str == null || str.length() == 0)) {
                java.lang.String[] strArr = new java.lang.String[1];
                o33.e eVar4 = gVar.f342743f;
                strArr[0] = eVar4 != null ? eVar4.f342736h : null;
                com.tencent.mm.plugin.wepkg.version.f.a(kz5.c0.d(strArr), 4);
            }
            ((y43.f) i95.n0.c(y43.f.class)).i5(eVar);
        }
    }
}

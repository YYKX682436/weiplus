package zx5;

/* loaded from: classes13.dex */
public class b0 extends by5.u0 {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f477216f = "0";

    /* renamed from: g, reason: collision with root package name */
    public yx5.b f477217g;

    @Override // by5.u0
    public java.lang.Object d(java.lang.Object[] objArr) {
        java.util.HashMap[] hashMapArr = (java.util.HashMap[]) objArr;
        if (hashMapArr != null && hashMapArr.length > 0) {
            java.util.HashMap hashMap = hashMapArr[0];
            if (hashMap != null) {
                java.lang.String str = (java.lang.String) hashMap.get("UpdaterCheckType");
                this.f477216f = str;
                if (str == null) {
                    this.f477216f = "0";
                } else if (str.equals("1")) {
                    zx5.p.Z().T();
                } else if (this.f477216f.equals("2")) {
                    zx5.p.Z().T();
                    by5.s0.d(93L, 1);
                } else if (this.f477216f.equals("3")) {
                    zx5.p.Z().i().f36570i = true;
                    by5.s0.d(94L, 1);
                }
            }
            by5.c4.f("XWebRuntimeUpdateChecker", "initConfigs, notifyType:" + this.f477216f + " [0:timer/1:notify/2:force/4:embed/5:config/7:auto]");
        }
        return k() ? 1 : 0;
    }

    @Override // by5.u0
    public void g(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        if (num.intValue() != 1) {
            by5.c4.f("XWebRuntimeUpdateChecker", "fetch config failed, result: " + num);
            zx5.i0.a();
            return;
        }
        zx5.r rVar = new zx5.r();
        rVar.f477257a = by5.e4.a();
        rVar.f477258b = org.xwalk.core.XWalkEnvironment.f347970c.getDir("xwalkconfig", 0).getAbsolutePath() + java.io.File.separator + "updateConfig.xml";
        by5.c4.f("XWebRuntimeUpdateChecker", "fetchConfig start, url:" + rVar.f477257a + ", path:" + rVar.f477258b);
        zx5.u.k(rVar, new zx5.y(this));
    }

    @Override // by5.u0
    public void h() {
        by5.c4.f("XWebRuntimeUpdater", "notifyUpdateStart");
        zx5.i0.d("start", 0, 0);
        yu5.c.b(new zx5.d0());
    }

    public boolean k() {
        if (!by5.y.b()) {
            by5.c4.f("XWebRuntimeUpdateChecker", "checkNeedFetchConfig, false because no network");
            return false;
        }
        if (!(2000 <= org.xwalk.core.XWalkEnvironment.h()) && !zx5.p.Z().x()) {
            by5.c4.f("XWebRuntimeUpdateChecker", "checkNeedFetchConfig, true because no scheduler and no availableVersion");
            return true;
        }
        if (zx5.p.Z().b() && !zx5.j0.b()) {
            by5.c4.f("XWebRuntimeUpdateChecker", "checkNeedFetchConfig, true because not in updating process and need fetch config");
            return true;
        }
        if (!zx5.p.Z().M()) {
            return false;
        }
        by5.c4.f("XWebRuntimeUpdateChecker", "checkNeedFetchConfig, true because force update");
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:8|(1:10)(2:78|(1:80)(3:81|(1:83)(1:294)|(1:85)(11:86|(1:(3:284|285|(1:287)(2:288|(1:293)(1:292)))(5:88|(1:283)(6:92|93|94|95|(2:97|98)(8:100|(3:102|(1:104)(1:278)|(8:108|(3:110|(2:131|132)(6:114|115|116|117|118|(2:120|121)(1:123))|122)|133|134|(2:135|(7:137|138|139|(3:267|268|269)(13:141|(1:143)|144|145|146|147|148|149|150|151|(3:152|153|(3:155|(3:245|246|247)(6:157|158|159|(4:161|162|163|(1:171))|242|243)|244)(1:248))|249|250)|251|(2:178|179)(2:181|(2:183|184)(1:185))|180)(2:276|277))|(1:187)(7:190|191|192|(5:195|(2:231|232)(4:197|(1:199)(1:230)|200|(2:227|228)(2:202|(4:204|205|(1:207)(0)|208)(1:226)))|229|208|193)|233|234|(3:210|(1:212)(2:217|(1:219)(2:220|(1:222)(2:223|(1:225))))|(2:214|215)))|188|189))|279|134|(3:135|(0)(0)|180)|(0)(0)|188|189)|99)|282|(0)(0)|99))|216|12|13|14|(1:16)(1:75)|(1:18)|(1:21)(2:70|(1:72)(1:73))|22|(1:24)(2:26|(2:28|29)(2:30|(2:36|(3:38|(1:40)(1:(3:64|(1:66)|67)(6:48|(1:50)(1:63)|51|(3:53|(1:57)(1:61)|(2:59|60))|62|60))|(1:44)(2:42|43))(2:68|69))(2:34|35))))))|11|12|13|14|(0)(0)|(0)|(0)(0)|22|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x04b8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x04b9, code lost:
    
        by5.c4.f("XWebRuntimeInstaller", "reportForUpdateRuntimeFromProvider, report error:" + r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x048f A[Catch: all -> 0x04b8, TryCatch #7 {all -> 0x04b8, blocks: (B:14:0x0439, B:16:0x048f, B:18:0x049e, B:75:0x0498), top: B:13:0x0439 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x049e A[Catch: all -> 0x04b8, TRY_LEAVE, TryCatch #7 {all -> 0x04b8, blocks: (B:14:0x0439, B:16:0x048f, B:18:0x049e, B:75:0x0498), top: B:13:0x0439 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0501 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x02da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0498 A[Catch: all -> 0x04b8, TryCatch #7 {all -> 0x04b8, blocks: (B:14:0x0439, B:16:0x048f, B:18:0x049e, B:75:0x0498), top: B:13:0x0439 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(zx5.p r33) {
        /*
            Method dump skipped, instructions count: 1510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zx5.b0.l(zx5.p):void");
    }
}

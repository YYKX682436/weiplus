package lm1;

/* loaded from: classes7.dex */
public final class b extends ig1.a {
    @Override // ig1.a
    public ye1.d a(int i17, int i18) {
        ye1.d a17;
        if (-10000 >= i17) {
            int i19 = i17 + com.tencent.tinker.loader.shareutil.ShareConstants.ERROR_LOAD_GET_INTENT_FAIL;
            if (i19 != -10001) {
                if (i19 != 1200) {
                    if (i19 != 1300) {
                        if (i19 != 1210) {
                            if (i19 != 1211) {
                                if (i19 != 1220) {
                                    if (i19 != 1221) {
                                        if (i19 != 1230) {
                                            if (i19 != 1231) {
                                                switch (i19) {
                                                    case 1100:
                                                    case 1102:
                                                    case 1103:
                                                        a17 = ye1.d.f461184f;
                                                        break;
                                                    case 1101:
                                                        a17 = ye1.d.f461183e;
                                                        break;
                                                    default:
                                                        a17 = ye1.d.f461190o;
                                                        break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        a17 = ye1.d.f461187i;
                    } else {
                        a17 = ye1.d.f461188m;
                    }
                }
                a17 = ye1.d.f461186h;
            } else {
                a17 = ye1.d.f461189n;
            }
        } else {
            a17 = super.a(i17, i18);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoProfileReport", "fromErrorInfo, errorWhat: " + i17 + ", errorExtra: " + i18 + ", errorType: " + a17);
        return a17;
    }

    @Override // ig1.a
    public boolean b(ye1.e eVar) {
        return eVar != null && 3 == eVar.getPlayerType();
    }
}

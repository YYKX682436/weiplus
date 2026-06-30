package ze2;

/* loaded from: classes3.dex */
public final class d implements we2.c0 {
    @Override // we2.c0
    public boolean a(we2.c cgiResp) {
        int i17;
        kotlin.jvm.internal.o.g(cgiResp, "cgiResp");
        int i18 = cgiResp.f445219b;
        if ((i18 == 4 && cgiResp.f445218a == -100020) || (i17 = cgiResp.f445218a) == -200001) {
            return false;
        }
        if (i18 == 0 && i17 == 0) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("LiveMsgRespErrCodeInterceptor", "doGetLiveMsg errCode:" + cgiResp.f445218a);
        return false;
    }
}

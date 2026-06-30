package com.tencent.xweb;

/* loaded from: classes13.dex */
public abstract class k1 {
    public static boolean a(java.lang.String str) {
        if (com.tencent.xweb.WebView.x0()) {
            return y4.n.a(str);
        }
        if (com.tencent.xweb.WebView.y0() && com.tencent.xweb.WebView.f220193q) {
            return str.equals("PROXY_OVERRIDE") ? org.xwalk.core.XWalkEnvironment.o() && org.xwalk.core.XWalkEnvironment.f(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_STREAM_SWITCH_SUCC) : str.equals(org.chromium.support_lib_boundary.util.Features.PROXY_OVERRIDE_REVERSE_BYPASS) && org.xwalk.core.XWalkEnvironment.o() && org.xwalk.core.XWalkEnvironment.f(2016);
        }
        return false;
    }
}

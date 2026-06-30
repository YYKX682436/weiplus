package org.chromium.net.apihelpers;

/* loaded from: classes16.dex */
public final /* synthetic */ class RedirectHandlers$$a implements org.chromium.net.apihelpers.RedirectHandler {
    @Override // org.chromium.net.apihelpers.RedirectHandler
    public final boolean shouldFollowRedirect(org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.String str) {
        boolean lambda$neverFollow$0;
        lambda$neverFollow$0 = org.chromium.net.apihelpers.RedirectHandlers.lambda$neverFollow$0(urlResponseInfo, str);
        return lambda$neverFollow$0;
    }
}

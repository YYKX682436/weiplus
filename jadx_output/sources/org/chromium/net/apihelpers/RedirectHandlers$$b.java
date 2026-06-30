package org.chromium.net.apihelpers;

/* loaded from: classes16.dex */
public final /* synthetic */ class RedirectHandlers$$b implements org.chromium.net.apihelpers.RedirectHandler {
    @Override // org.chromium.net.apihelpers.RedirectHandler
    public final boolean shouldFollowRedirect(org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.String str) {
        boolean lambda$alwaysFollow$1;
        lambda$alwaysFollow$1 = org.chromium.net.apihelpers.RedirectHandlers.lambda$alwaysFollow$1(urlResponseInfo, str);
        return lambda$alwaysFollow$1;
    }
}

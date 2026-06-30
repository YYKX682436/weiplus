package org.chromium.net.apihelpers;

/* loaded from: classes16.dex */
public class RedirectHandlers {
    private RedirectHandlers() {
    }

    public static org.chromium.net.apihelpers.RedirectHandler alwaysFollow() {
        return new org.chromium.net.apihelpers.RedirectHandlers$$b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$alwaysFollow$1(org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.String str) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$neverFollow$0(org.chromium.net.UrlResponseInfo urlResponseInfo, java.lang.String str) {
        return false;
    }

    public static org.chromium.net.apihelpers.RedirectHandler neverFollow() {
        return new org.chromium.net.apihelpers.RedirectHandlers$$a();
    }
}

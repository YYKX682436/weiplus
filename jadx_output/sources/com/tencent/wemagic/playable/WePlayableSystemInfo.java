package com.tencent.wemagic.playable;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u001a\u001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u0014\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J!\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0019H\u0082 R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/tencent/wemagic/playable/WePlayableSystemInfo;", "", "<init>", "()V", "TAG", "", "flushSystemInfoByPlayableId", "", "container", "Landroid/view/ViewGroup;", "playableId", "fromPixel", "", "", "context", "Landroid/content/Context;", "getDevicePixelRatio", "", "getOrientation", "getDarkMode", "getFontSize", "flushSystemInfo", "info", "Lcom/tencent/wemagic/playable/WePlayableSystemInfo$GetSystemInfoResult;", "safeArea", "Lcom/tencent/wemagic/playable/WePlayableSystemInfo$SafeArea;", "SafeArea", "GetSystemInfoResult", "playable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WePlayableSystemInfo {

    /* loaded from: classes.dex */
    public static final class GetSystemInfoResult {
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.tencent.wemagic.playable.WePlayableSystemInfo.GetSystemInfoResult)) {
                return false;
            }
            ((com.tencent.wemagic.playable.WePlayableSystemInfo.GetSystemInfoResult) obj).getClass();
            return kotlin.jvm.internal.o.b(null, null) && kotlin.jvm.internal.o.b(null, null);
        }

        public int hashCode() {
            java.lang.Integer.hashCode(0);
            java.lang.Integer.hashCode(0);
            java.lang.Integer.hashCode(0);
            java.lang.Integer.hashCode(0);
            throw null;
        }

        public java.lang.String toString() {
            return "GetSystemInfoResult(screenWidth=0, screenHeight=0, windowWidth=0, windowHeight=0, deviceOrientation=null, safeArea=null)";
        }
    }

    /* loaded from: classes.dex */
    public static final class SafeArea {
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.tencent.wemagic.playable.WePlayableSystemInfo.SafeArea)) {
                return false;
            }
            ((com.tencent.wemagic.playable.WePlayableSystemInfo.SafeArea) obj).getClass();
            return true;
        }

        public int hashCode() {
            return (((((((((java.lang.Integer.hashCode(0) * 31) + java.lang.Integer.hashCode(0)) * 31) + java.lang.Integer.hashCode(0)) * 31) + java.lang.Integer.hashCode(0)) * 31) + java.lang.Integer.hashCode(0)) * 31) + java.lang.Integer.hashCode(0);
        }

        public java.lang.String toString() {
            return "SafeArea(top=0, bottom=0, left=0, right=0, width=0, height=0)";
        }
    }

    private final native void flushSystemInfo(com.tencent.wemagic.playable.WePlayableSystemInfo.GetSystemInfoResult info, java.lang.String playableId, com.tencent.wemagic.playable.WePlayableSystemInfo.SafeArea safeArea);
}

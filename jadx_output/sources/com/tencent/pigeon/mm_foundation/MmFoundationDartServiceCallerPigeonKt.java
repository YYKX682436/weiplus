package com.tencent.pigeon.mm_foundation;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0004"}, d2 = {"createConnectionError", "Lcom/tencent/pigeon/mm_foundation/FlutterError;", "channelName", "", "mm_auto_gen_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MmFoundationDartServiceCallerPigeonKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final com.tencent.pigeon.mm_foundation.FlutterError createConnectionError(java.lang.String str) {
        return new com.tencent.pigeon.mm_foundation.FlutterError("channel-error", "Unable to establish connection on channel: '" + str + "'.", "");
    }
}

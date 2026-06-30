package com.tencent.mm.ui.tools;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/ui/tools/ShareFileResultReceiver;", "Landroid/support/v4/os/ResultReceiver;", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ShareFileResultReceiver extends android.support.v4.os.ResultReceiver {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f210149g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareFileResultReceiver(android.os.Handler handler, java.lang.String filePath) {
        super(handler);
        kotlin.jvm.internal.o.g(handler, "handler");
        kotlin.jvm.internal.o.g(filePath, "filePath");
        this.f210149g = filePath;
    }

    @Override // android.support.v4.os.ResultReceiver
    public void a(int i17, android.os.Bundle bundle) {
        if (i17 != -1) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.String str = this.f210149g;
            com.tencent.mars.xlog.Log.i("MicroMsg.ShareImgUI", "resultCode: %s, delete file %s", valueOf, str);
            com.tencent.mm.vfs.w6.h(str);
        }
    }
}

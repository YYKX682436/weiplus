package com.tencent.wechat.aff.common;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/os/Handler;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ThreadHelper$Companion$mainThreadHandle$2 extends kotlin.jvm.internal.q implements yz5.a {
    public static final com.tencent.wechat.aff.common.ThreadHelper$Companion$mainThreadHandle$2 INSTANCE = new com.tencent.wechat.aff.common.ThreadHelper$Companion$mainThreadHandle$2();

    public ThreadHelper$Companion$mainThreadHandle$2() {
        super(0);
    }

    @Override // yz5.a
    public final android.os.Handler invoke() {
        return new android.os.Handler(android.os.Looper.getMainLooper());
    }
}

package pc;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.cloud.component.common.ai.utils.SimplePool f353201a;

    public final void a(byte[] bArr) {
        com.tencent.cloud.component.common.ai.utils.SimplePool simplePool = this.f353201a;
        if (simplePool == null) {
            return;
        }
        try {
            simplePool.release(bArr);
        } catch (java.lang.Exception unused) {
        }
    }
}

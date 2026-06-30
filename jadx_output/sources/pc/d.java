package pc;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.cloud.component.common.ai.utils.SimplePool f353203a;

    public final void a(byte[] bArr) {
        synchronized (pc.d.class) {
            com.tencent.cloud.component.common.ai.utils.SimplePool simplePool = this.f353203a;
            if (simplePool == null) {
                return;
            }
            try {
                simplePool.release(bArr);
            } catch (java.lang.Exception unused) {
            }
        }
    }
}

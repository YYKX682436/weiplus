package q01;

/* loaded from: classes12.dex */
public final class i extends e75.i {
    public void a(int i17, androidx.lifecycle.y lifecycleOwner, java.lang.String threadTag, q01.e observer) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        kotlin.jvm.internal.o.g(threadTag, "threadTag");
        kotlin.jvm.internal.o.g(observer, "observer");
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        synchronized (this.f249980a) {
            java.util.HashMap hashMap = this.f249980a;
            java.lang.Object obj = hashMap.get(valueOf);
            if (obj == null) {
                obj = new e75.h(this, valueOf);
                hashMap.put(valueOf, obj);
            }
            ((e75.h) obj).observe(lifecycleOwner, threadTag, observer);
        }
        com.tencent.mm.sdk.platformtools.k2.b(observer);
    }
}

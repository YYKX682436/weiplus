package zx5;

/* loaded from: classes13.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f477248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f477249e;

    public k0(android.content.Context context, java.util.HashMap hashMap) {
        this.f477248d = context;
        this.f477249e = hashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        zx5.n0.b(this.f477248d, this.f477249e);
    }
}

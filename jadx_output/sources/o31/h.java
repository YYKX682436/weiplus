package o31;

/* loaded from: classes7.dex */
public final class h extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.util.CompatProcessTask f342674d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.msgsubscription.util.CompatProcessTask compatProcessTask) {
        super(0);
        this.f342674d = compatProcessTask;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(android.os.Process.myPid());
        sb6.append('_');
        sb6.append(this.f342674d.hashCode());
        return sb6.toString();
    }
}

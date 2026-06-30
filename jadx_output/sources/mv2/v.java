package mv2;

/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f331663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f331664e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(long j17, boolean z17) {
        super(0);
        this.f331663d = j17;
        this.f331664e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (gm0.j1.a()) {
            java.util.Iterator it = mv2.f0.f331565e.iterator();
            while (it.hasNext()) {
                ((mv2.w0) it.next()).onPostNotify(this.f331663d, this.f331664e);
            }
        } else {
            com.tencent.mars.xlog.Log.e("LogPost.FinderPostManager", "is invalid to notifyEventPost");
        }
        return jz5.f0.f302826a;
    }
}

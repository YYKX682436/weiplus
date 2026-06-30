package kf4;

/* loaded from: classes4.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f307479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f307480e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f307481f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f307482g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(long j17, boolean z17, java.lang.String str, java.lang.String str2) {
        super(0);
        this.f307479d = j17;
        this.f307480e = z17;
        this.f307481f = str;
        this.f307482g = str2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nf4.l i17 = ef4.w.f252468t.i();
        long j17 = this.f307479d;
        i17.L0(j17);
        kf4.o oVar = kf4.o.f307484d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("new comment in ");
        sb6.append(j17);
        sb6.append(", isUnread:");
        sb6.append(this.f307480e);
        sb6.append(", storyOwner:");
        java.lang.String str = this.f307481f;
        sb6.append(str);
        sb6.append(", fromUser:");
        sb6.append(this.f307482g);
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactSyncFetcher", sb6.toString());
        bf4.b bVar = bf4.b.f19696b;
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactSyncFetcher", "filterStory false");
        android.support.v4.media.f.a(kf4.o.f307486f.get(str));
        return jz5.f0.f302826a;
    }
}

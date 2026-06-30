package f00;

/* loaded from: classes3.dex */
public final class g implements ss5.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f258308a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f258309b;

    public g(android.content.Intent intent, java.lang.String str) {
        this.f258308a = intent;
        this.f258309b = str;
    }

    @Override // ss5.d0
    public void b(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
        r45.md5 md5Var = new r45.md5();
        r45.nw1 liveInfo = finderObject.getLiveInfo();
        md5Var.set(1, java.lang.Long.valueOf(liveInfo != null ? liveInfo.getLong(0) : 0L));
        ((com.tencent.mm.feature.finder.live.v4) w0Var).Cj(this.f258308a, this.f258309b, md5Var);
    }
}

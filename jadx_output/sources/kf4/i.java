package kf4;

/* loaded from: classes4.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.w0 f307477d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l75.w0 w0Var) {
        super(0);
        this.f307477d = w0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        l75.w0 w0Var = this.f307477d;
        java.lang.Object obj = w0Var.f316976d;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryInfo");
        java.lang.String str = ((nf4.j) obj).field_userName;
        java.lang.Object obj2 = w0Var.f316976d;
        kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryInfo");
        long j17 = ((nf4.j) obj2).field_storyID;
        kf4.o oVar = kf4.o.f307484d;
        com.tencent.mars.xlog.Log.i("MicroMsg.ContactSyncFetcher", "[StoryInfo] onNotifyChange: " + str + ' ' + j17);
        android.support.v4.media.f.a(kf4.o.f307486f.get(str));
        kf4.o.b(kf4.o.f307484d);
        pm0.v.X(kf4.h.f307476d);
        return jz5.f0.f302826a;
    }
}

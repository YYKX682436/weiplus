package so3;

/* loaded from: classes8.dex */
public final class a implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ so3.c f410743a;

    public a(so3.c cVar) {
        this.f410743a = cVar;
    }

    @Override // c01.o8
    public final void a(java.lang.String username, boolean z17) {
        kotlin.jvm.internal.o.g(username, "username");
        this.f410743a.getClass();
        so3.c cVar = this.f410743a;
        synchronized ("MicroMsg.CoverSubscribeNotifyMsgInterceptor") {
            cVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.CoverSubscribeNotifyMsgInterceptor", "sync contact finished, username: " + username + ", succ: " + z17);
            cVar.f410746d.remove(username);
        }
    }
}

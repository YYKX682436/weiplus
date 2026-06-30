package ur1;

/* loaded from: classes7.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f430363d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ur1.s f430364e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f430365f;

    public o(int i17, ur1.s sVar, java.lang.String str) {
        this.f430363d = i17;
        this.f430364e = sVar;
        this.f430365f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ur1.s sVar = this.f430364e;
        int i17 = this.f430363d;
        if (i17 != 3) {
            com.tencent.mm.vfs.w6.f(sVar.Ri(i17, this.f430365f));
            return;
        }
        com.tencent.mm.vfs.w6.f(ur1.s.f430372d);
        sVar.Di().remove("article_draft_key");
        sVar.Di().remove("picture_draft_key");
    }
}

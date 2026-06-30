package oz;

/* loaded from: classes12.dex */
public final class n implements oz.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oz.s f350173a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oz.b f350174b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.msg.MsgIdTalker f350175c;

    public n(oz.s sVar, oz.b bVar, com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker) {
        this.f350173a = sVar;
        this.f350174b = bVar;
        this.f350175c = msgIdTalker;
    }

    @Override // oz.g
    public void onResult(int i17) {
        oz.s.Zi(this.f350173a, i17, this.f350174b, this.f350175c);
    }
}

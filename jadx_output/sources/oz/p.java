package oz;

/* loaded from: classes12.dex */
public final class p implements oz.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oz.s f350179a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oz.b f350180b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.msg.MsgIdTalker f350181c;

    public p(oz.s sVar, oz.b bVar, com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker) {
        this.f350179a = sVar;
        this.f350180b = bVar;
        this.f350181c = msgIdTalker;
    }

    @Override // oz.g
    public void onResult(int i17) {
        oz.s.Zi(this.f350179a, i17, this.f350180b, this.f350181c);
    }
}

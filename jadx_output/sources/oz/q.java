package oz;

/* loaded from: classes12.dex */
public final class q implements oz.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oz.s f350182a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oz.b f350183b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.msg.MsgIdTalker f350184c;

    public q(oz.s sVar, oz.b bVar, com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker) {
        this.f350182a = sVar;
        this.f350183b = bVar;
        this.f350184c = msgIdTalker;
    }

    @Override // oz.g
    public void onResult(int i17) {
        oz.s.Zi(this.f350182a, i17, this.f350183b, this.f350184c);
    }
}

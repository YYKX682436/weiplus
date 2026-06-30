package oz;

/* loaded from: classes12.dex */
public final class o implements oz.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ oz.s f350176a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ oz.b f350177b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.msg.MsgIdTalker f350178c;

    public o(oz.s sVar, oz.b bVar, com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker) {
        this.f350176a = sVar;
        this.f350177b = bVar;
        this.f350178c = msgIdTalker;
    }

    @Override // oz.g
    public void onResult(int i17) {
        oz.s.Zi(this.f350176a, i17, this.f350177b, this.f350178c);
    }
}

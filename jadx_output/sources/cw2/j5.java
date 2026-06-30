package cw2;

/* loaded from: classes10.dex */
public final class j5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mu3.b f223784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t85.j f223785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout f223786f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(mu3.b bVar, t85.j jVar, com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout finderRecordPluginLayout) {
        super(0);
        this.f223784d = bVar;
        this.f223785e = jVar;
        this.f223786f = finderRecordPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mu3.b bVar = this.f223784d;
        p05.l4 l4Var = bVar.f331398v;
        t85.j jVar = this.f223785e;
        if (l4Var != null) {
            l4Var.i(jVar);
        }
        if (jVar != null) {
            pm0.v.V(2000L, new cw2.i5(bVar, this.f223786f));
        }
        return jz5.f0.f302826a;
    }
}

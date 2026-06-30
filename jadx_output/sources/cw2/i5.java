package cw2;

/* loaded from: classes10.dex */
public final class i5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mu3.b f223768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout f223769e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(mu3.b bVar, com.tencent.mm.plugin.finder.video.FinderRecordPluginLayout finderRecordPluginLayout) {
        super(0);
        this.f223768d = bVar;
        this.f223769e = finderRecordPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        p05.l4 l4Var = this.f223768d.f331398v;
        if (kotlin.jvm.internal.o.b(l4Var != null ? java.lang.Boolean.valueOf(l4Var.f350610w) : null, java.lang.Boolean.FALSE)) {
            dp.a.makeText(this.f223769e.f130625h.getContext(), com.tencent.mm.R.string.hu9, 0).show();
        }
        return jz5.f0.f302826a;
    }
}

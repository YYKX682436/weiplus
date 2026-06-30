package w22;

/* loaded from: classes10.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u22.b f442572d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u22.b bVar) {
        super(0);
        this.f442572d = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.feature.sight.api.o oVar = (com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class);
        java.lang.String str = this.f442572d.f423976c;
        ((be0.e) oVar).getClass();
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str, true);
        if (d17 != null) {
            com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.c(34, 1);
            com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter.c(35, d17.f162382a);
        }
        return jz5.f0.f302826a;
    }
}

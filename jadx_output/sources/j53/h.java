package j53;

/* loaded from: classes10.dex */
public class h implements com.tencent.mm.ui.tools.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.background.GameFakeVideoUI f297812a;

    public h(com.tencent.mm.plugin.game.media.background.GameFakeVideoUI gameFakeVideoUI) {
        this.f297812a = gameFakeVideoUI;
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void a() {
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationEnd() {
        new com.tencent.mm.sdk.platformtools.n3().post(new j53.g(this));
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationStart() {
    }
}

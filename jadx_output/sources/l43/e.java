package l43;

/* loaded from: classes8.dex */
public class e extends com.tencent.mm.sdk.event.n {
    public e() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mars.xlog.Log.i("ManualLoginListener", "manual force login");
        com.tencent.mm.plugin.game.commlib.j.a().b(true, 4);
        return false;
    }
}

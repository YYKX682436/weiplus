package p53;

/* loaded from: classes8.dex */
public class e implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f352056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f352057e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.tab.GameTabBridgeUI f352058f;

    public e(com.tencent.mm.plugin.game.ui.tab.GameTabBridgeUI gameTabBridgeUI, long j17, android.content.Intent intent) {
        this.f352058f = gameTabBridgeUI;
        this.f352056d = j17;
        this.f352057e = intent;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.sdk.platformtools.u3.h(new p53.d(this));
    }
}

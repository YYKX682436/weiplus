package os3;

/* loaded from: classes8.dex */
public class x3 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ReadMailUI f348250d;

    public x3(com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI) {
        this.f348250d = readMailUI;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCInteger iPCInteger = (com.tencent.mm.ipcinvoker.type.IPCInteger) obj;
        com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI = this.f348250d;
        if (readMailUI.isFinishing() || readMailUI.isDestroyed()) {
            return;
        }
        readMailUI.L = iPCInteger.f68404d;
        com.tencent.mm.sdk.platformtools.u3.h(new os3.w3(this));
    }
}

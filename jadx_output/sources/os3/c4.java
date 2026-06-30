package os3;

/* loaded from: classes8.dex */
public class c4 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ReadMailUI f348055d;

    public c4(com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI) {
        this.f348055d = readMailUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.x2.f193072b;
        com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI = this.f348055d;
        com.tencent.mm.ipcinvoker.d0.d(str, new com.tencent.mm.ipcinvoker.type.IPCLong(readMailUI.E), js3.d.class, new os3.e4(readMailUI));
        return true;
    }
}

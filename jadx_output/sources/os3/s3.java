package os3;

/* loaded from: classes8.dex */
public class s3 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ReadMailUI f348197d;

    public s3(com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI) {
        this.f348197d = readMailUI;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI = this.f348197d;
        if (readMailUI.isFinishing() || readMailUI.isDestroyed()) {
            return;
        }
        com.tencent.mm.sdk.platformtools.u3.h(new os3.r3(this, bundle));
    }
}

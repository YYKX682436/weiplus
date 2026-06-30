package os3;

/* loaded from: classes8.dex */
public class j4 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ReadMailUI f348128d;

    public j4(com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI) {
        this.f348128d = readMailUI;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI = this.f348128d;
        if (readMailUI.isFinishing() || readMailUI.isDestroyed()) {
            return;
        }
        java.lang.String string = bundle.getString("mail_id");
        if (readMailUI.f154927f.f311626a.equals(string)) {
            com.tencent.mm.sdk.platformtools.u3.h(new os3.h4(this, bundle, string));
        }
    }
}

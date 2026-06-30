package os3;

/* loaded from: classes8.dex */
public class e4 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ReadMailUI f348070d;

    public e4(com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI) {
        this.f348070d = readMailUI;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (bundle == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new os3.d4(this, bundle));
    }
}

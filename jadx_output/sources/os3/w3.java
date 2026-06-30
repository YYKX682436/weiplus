package os3;

/* loaded from: classes8.dex */
public class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os3.x3 f348243d;

    public w3(os3.x3 x3Var) {
        this.f348243d = x3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI = this.f348243d.f348250d;
        java.lang.String str = com.tencent.mm.plugin.qqmail.ui.ReadMailUI.N;
        readMailUI.W6();
    }
}

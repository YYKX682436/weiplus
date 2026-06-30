package os3;

/* loaded from: classes8.dex */
public class z2 extends hs3.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.MailWebViewUI f348263a;

    public z2(com.tencent.mm.plugin.qqmail.ui.MailWebViewUI mailWebViewUI) {
        this.f348263a = mailWebViewUI;
    }

    @Override // hs3.j
    public void b(int i17, java.lang.String str) {
        this.f348263a.f154911f.post(new os3.y2(this, str));
    }

    @Override // hs3.j
    public void d(java.lang.String str, java.util.Map map) {
        this.f348263a.f154911f.post(new os3.x2(this, str));
    }
}

package m14;

/* loaded from: classes11.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m14.j f322877d;

    public i(m14.j jVar) {
        this.f322877d = jVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14553, 5, 3, "");
        m14.j jVar = this.f322877d;
        jVar.f322878d.f322870b.show();
        m14.f fVar = jVar.f322878d;
        fVar.f322871c = false;
        fVar.f322872d = new com.tencent.wcdb.support.CancellationSignal();
        m14.f fVar2 = jVar.f322878d;
        fVar2.getClass();
        ((ku5.t0) ku5.t0.f312615d).b(new m14.f$$a(fVar2), "doResetChatHistory");
    }
}

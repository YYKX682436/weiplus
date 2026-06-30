package m14;

/* loaded from: classes11.dex */
public class j implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m14.f f322878d;

    public j(m14.f fVar) {
        this.f322878d = fVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingChattingResetHelper", "Clean all messages confirmed.");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(14553, 5, 2, "");
        g0Var.idkeyStat(324L, 0L, 1L, false);
        m14.f fVar = this.f322878d;
        fVar.f322871c = false;
        fVar.f322872d = new com.tencent.wcdb.support.CancellationSignal();
        android.content.Context context = fVar.f322869a;
        fVar.f322870b = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), fVar.f322869a.getString(com.tencent.mm.R.string.f490604zq), true, true, new m14.g(this));
        java.util.ArrayList Ai = ((ng0.o) ((og0.n) i95.n0.c(og0.n.class))).Ai();
        if (Ai == null || Ai.size() <= 0) {
            ((ku5.t0) ku5.t0.f312615d).b(new m14.f$$a(fVar), "doResetChatHistory");
        } else {
            fVar.f322870b.dismiss();
            android.content.Context context2 = fVar.f322869a;
            db5.e1.L(context2, false, context2.getString(com.tencent.mm.R.string.kkb, java.lang.Integer.valueOf(Ai.size())), null, fVar.f322869a.getString(com.tencent.mm.R.string.fs8), fVar.f322869a.getString(com.tencent.mm.R.string.b98), new m14.h(this, Ai), new m14.i(this), -1, com.tencent.mm.R.color.f478622ch);
        }
    }
}

package p61;

/* loaded from: classes11.dex */
public class h5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p61.j5 f352285d;

    public h5(p61.j5 j5Var) {
        this.f352285d = j5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        gm0.j1.d().g(new n61.e(""));
        p61.j5 j5Var = this.f352285d;
        com.tencent.mm.plugin.account.bind.ui.StartUnbindQQ startUnbindQQ = j5Var.f352298d;
        startUnbindQQ.f73095g = db5.e1.Q(startUnbindQQ, startUnbindQQ.getString(com.tencent.mm.R.string.f490573yv), j5Var.f352298d.getString(com.tencent.mm.R.string.f493013io0), true, true, null);
    }
}

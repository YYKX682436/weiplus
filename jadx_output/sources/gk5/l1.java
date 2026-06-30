package gk5;

/* loaded from: classes.dex */
public final class l1 implements tg3.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gk5.m1 f272686a;

    public l1(gk5.m1 m1Var) {
        this.f272686a = m1Var;
    }

    @Override // tg3.x0
    public final void a(int i17, int i18, java.util.List resultList, byte[] bArr) {
        kotlin.jvm.internal.o.g(resultList, "resultList");
        gk5.m1 m1Var = this.f272686a;
        androidx.appcompat.app.AppCompatActivity activity = m1Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        cj5.o oVar = (cj5.o) pf5.z.f353948a.a(activity).a(cj5.o.class);
        com.tencent.mm.ui.widget.dialog.f4 f4Var = oVar.f42205d;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        oVar.f42205d = null;
        com.tencent.mars.xlog.Log.i("SendToWeWorkUIC", "onCallback() called with: errorType = [" + i17 + "], errorCode = [" + i18 + "], resultList = [" + resultList + ']');
        if (i17 == 0 && i18 == 0) {
            return;
        }
        db5.t7.g(m1Var.getActivity(), m1Var.getString(com.tencent.mm.R.string.h0a));
    }
}

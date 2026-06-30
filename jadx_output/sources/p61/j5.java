package p61;

/* loaded from: classes11.dex */
public class j5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.bind.ui.StartUnbindQQ f352298d;

    public j5(com.tencent.mm.plugin.account.bind.ui.StartUnbindQQ startUnbindQQ) {
        this.f352298d = startUnbindQQ;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/StartUnbindQQ$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.account.bind.ui.StartUnbindQQ startUnbindQQ = this.f352298d;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = startUnbindQQ.f73094f;
        if (j0Var == null) {
            startUnbindQQ.f73094f = db5.e1.u(startUnbindQQ, startUnbindQQ.getString(com.tencent.mm.R.string.inz), null, new p61.h5(this), new p61.i5(this));
        } else {
            j0Var.show();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/StartUnbindQQ$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

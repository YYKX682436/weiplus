package k14;

/* loaded from: classes.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f303328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f303329e;

    public f(kotlinx.coroutines.q qVar, com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f303328d = qVar;
        this.f303329e = z2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/model/ApplyForPhoneNumberUtil$showDialog$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        kotlinx.coroutines.q qVar = this.f303328d;
        if (!((kotlinx.coroutines.r) qVar).o()) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        }
        this.f303329e.B();
        yj0.a.h(this, "com/tencent/mm/plugin/setting/model/ApplyForPhoneNumberUtil$showDialog$2$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

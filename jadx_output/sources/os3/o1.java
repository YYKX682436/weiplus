package os3;

/* loaded from: classes8.dex */
public class o1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ks3.v0 f348163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ os3.v1 f348164e;

    public o1(os3.v1 v1Var, ks3.v0 v0Var) {
        this.f348164e = v1Var;
        this.f348163d = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/qqmail/ui/FileUploadHelper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ks3.v0 v0Var = this.f348163d;
        v0Var.f311759h = this.f348164e.c(v0Var.f311755d);
        yj0.a.h(this, "com/tencent/mm/plugin/qqmail/ui/FileUploadHelper$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

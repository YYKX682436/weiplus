package rn1;

/* loaded from: classes12.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn1.a0 f397617d;

    public h(rn1.a0 a0Var) {
        this.f397617d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        db5.e1.l(this.f397617d.f397612a, com.tencent.mm.R.string.f490688aa3, com.tencent.mm.R.string.f490687aa2, com.tencent.mm.R.string.aba, com.tencent.mm.R.string.f490680a72, false, new rn1.g(this), null, com.tencent.mm.R.color.f478703ek);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

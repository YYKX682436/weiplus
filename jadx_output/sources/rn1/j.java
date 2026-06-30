package rn1;

/* loaded from: classes12.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn1.a0 f397618d;

    public j(rn1.a0 a0Var) {
        this.f397618d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        db5.e1.l(this.f397618d.f397612a, com.tencent.mm.R.string.f490690aa5, com.tencent.mm.R.string.f490689aa4, com.tencent.mm.R.string.abb, com.tencent.mm.R.string.f490680a72, false, new rn1.i(this), null, com.tencent.mm.R.color.f478703ek);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/backuppcui/BackupPcUI$3$13", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

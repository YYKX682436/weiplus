package nn1;

/* loaded from: classes12.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f338642d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nn1.a f338643e;

    public b(nn1.a aVar, int i17) {
        this.f338643e = aVar;
        this.f338642d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nn1.a aVar = this.f338643e;
        java.util.HashSet hashSet = aVar.f338637e;
        int i17 = this.f338642d;
        if (hashSet.contains(java.lang.Integer.valueOf(i17))) {
            aVar.f338637e.remove(java.lang.Integer.valueOf(i17));
        } else {
            aVar.f338637e.add(java.lang.Integer.valueOf(i17));
        }
        aVar.notifyDataSetChanged();
        aVar.f338636d.d7(aVar.f338637e);
        yj0.a.h(this, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

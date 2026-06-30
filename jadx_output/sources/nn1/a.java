package nn1;

/* loaded from: classes12.dex */
public class a extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI f338636d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f338637e = new java.util.HashSet();

    /* renamed from: f, reason: collision with root package name */
    public xn1.d f338638f;

    /* renamed from: g, reason: collision with root package name */
    public int f338639g;

    public a(com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI backupMoveChooseUI) {
        this.f338636d = backupMoveChooseUI;
    }

    public java.util.LinkedList a() {
        return this.f338638f.b();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        a();
        return a().size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (kn1.i) a().get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return -1L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(final int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        nn1.c cVar;
        java.lang.String e17;
        com.tencent.mm.plugin.backup.backupmoveui.BackupMoveChooseUI backupMoveChooseUI = this.f338636d;
        if (view == null) {
            view = backupMoveChooseUI.getLayoutInflater().inflate(com.tencent.mm.R.layout.f488173je, viewGroup, false);
            cVar = new nn1.c(this);
            cVar.f338644a = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.a_4);
            cVar.f338645b = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.odf);
            cVar.f338646c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.cut);
            cVar.f338647d = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.mie);
            cVar.f338648e = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.mif);
            cVar.f338649f = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.imb);
            view.setTag(cVar);
        } else {
            cVar = (nn1.c) view.getTag();
        }
        view.setOnClickListener(new android.view.View.OnClickListener() { // from class: nn1.a$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                nn1.a aVar = nn1.a.this;
                aVar.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int i18 = i17;
                arrayList.add(java.lang.Integer.valueOf(i18));
                arrayList.add(view2);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(i18));
                arrayList2.add(view2);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", aVar, array2);
                java.util.HashSet hashSet = aVar.f338637e;
                if (hashSet.contains(java.lang.Integer.valueOf(i18))) {
                    hashSet.remove(java.lang.Integer.valueOf(i18));
                } else {
                    hashSet.add(java.lang.Integer.valueOf(i18));
                }
                aVar.notifyDataSetChanged();
                aVar.f338636d.d7(hashSet);
                yj0.a.h(aVar, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(aVar, "com/tencent/mm/plugin/backup/backupmoveui/BackupMoveChooseAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        if (i17 >= getCount()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupMoveChooseAdapter", "getView error, position:%d, count:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(getCount()));
            return view;
        }
        kn1.i iVar = (kn1.i) a().get(i17);
        cVar.f338648e.setOnClickListener(new nn1.b(this, i17));
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(cVar.f338644a, iVar.f309625d, null);
        if (backupMoveChooseUI.F) {
            long j17 = iVar.f309628g;
            if (j17 >= 0) {
                if (this.f338639g == 1) {
                    cVar.f338646c.setText(kn1.k.v((float) iVar.f309627f[1]));
                } else {
                    cVar.f338646c.setText(kn1.k.v((float) j17));
                }
                cVar.f338646c.setVisibility(0);
                cVar.f338649f.setVisibility(8);
            } else {
                cVar.f338646c.setVisibility(8);
                cVar.f338649f.setVisibility(0);
            }
        } else {
            cVar.f338646c.setVisibility(8);
            cVar.f338649f.setVisibility(8);
        }
        if (com.tencent.mm.storage.z3.R4(iVar.f309625d)) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str = iVar.f309625d;
            ((sg3.a) v0Var).getClass();
            e17 = c01.a2.f(str, str);
        } else {
            tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str2 = iVar.f309625d;
            ((sg3.a) v0Var2).getClass();
            e17 = c01.a2.e(str2);
        }
        android.widget.TextView textView = cVar.f338645b;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        if (e17 == null) {
            e17 = "群聊";
        }
        float textSize = cVar.f338645b.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(backupMoveChooseUI, e17, textSize));
        if (this.f338637e.contains(java.lang.Integer.valueOf(i17))) {
            cVar.f338647d.setChecked(true);
        } else {
            cVar.f338647d.setChecked(false);
        }
        return view;
    }
}

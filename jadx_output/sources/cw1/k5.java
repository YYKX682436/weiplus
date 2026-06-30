package cw1;

/* loaded from: classes12.dex */
public final class k5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw1.l5 f223086d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog f223087e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cw1.n5 f223088f;

    public k5(cw1.l5 l5Var, com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog cleanFilterDialog, cw1.n5 n5Var) {
        this.f223086d = l5Var;
        this.f223087e = cleanFilterDialog;
        this.f223088f = n5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        long[] jArr;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$Adapter$ItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        cw1.l5 l5Var = this.f223086d;
        cw1.o5 o5Var = (cw1.o5) l5Var.f223105e.f223181d.get(l5Var.getAdapterPosition());
        int adapterPosition = l5Var.getAdapterPosition();
        int i17 = o5Var.f223203c;
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog cleanFilterDialog = this.f223087e;
        if (i17 == cleanFilterDialog.f95770q && o5Var.f223204d == cleanFilterDialog.f95771r) {
            boolean z17 = o5Var.f223205e;
            com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(cleanFilterDialog.getContext());
            android.view.View inflate = android.view.LayoutInflater.from(cleanFilterDialog.getContext()).inflate(com.tencent.mm.R.layout.f488172jc, (android.view.ViewGroup) null);
            android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.abp);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.abk);
            android.widget.TextView[] textViewArr = {inflate.findViewById(com.tencent.mm.R.id.abm), inflate.findViewById(com.tencent.mm.R.id.ab8)};
            long[] jArr2 = cleanFilterDialog.f95769p;
            if (jArr2 != null) {
                jArr = java.util.Arrays.copyOf(jArr2, jArr2.length);
                kotlin.jvm.internal.o.f(jArr, "copyOf(...)");
            } else {
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                calendar.set(com.tencent.rtmp.TXLiveConstants.PLAY_EVT_CHANGE_ROTATION, 0, 21, 0, 0, 0);
                calendar.clear(14);
                jArr = new long[]{calendar.getTimeInMillis(), java.lang.System.currentTimeMillis()};
            }
            y1Var.f212037s = new cw1.y5(y1Var);
            inflate.findViewById(com.tencent.mm.R.id.f483758bz2).setOnClickListener(new cw1.z5(y1Var));
            cw1.c6 c6Var = new cw1.c6(textViewArr, cleanFilterDialog, jArr, button, textView);
            textViewArr[0].setOnClickListener(c6Var);
            textViewArr[1].setOnClickListener(c6Var);
            button.setOnClickListener(new cw1.a6(y1Var, cleanFilterDialog, z17, jArr, adapterPosition));
            com.tencent.mm.plugin.clean.ui.fileindexui.CleanFilterDialog.c(jArr, textViewArr, cleanFilterDialog, button, textView);
            y1Var.k(inflate);
            y1Var.s();
        } else {
            this.f223088f.x(adapterPosition);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$Adapter$ItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

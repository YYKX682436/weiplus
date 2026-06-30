package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.EditHintView f214189d;

    public i(com.tencent.mm.wallet_core.ui.EditHintView editHintView) {
        this.f214189d = editHintView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wallet_core/ui/EditHintView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.wallet_core.ui.EditHintView editHintView = this.f214189d;
        if (editHintView.f214074h.getVisibility() == 0) {
            if (!editHintView.f214086w || com.tencent.mm.sdk.platformtools.t8.K0(editHintView.getText())) {
                int i19 = editHintView.f214082s;
                if (i19 != 1) {
                    if (i19 == 3) {
                        editHintView.getContext();
                        i17 = c01.z1.I() ? com.tencent.mm.R.layout.d7v : com.tencent.mm.R.layout.d68;
                        editHintView.getContext();
                        i18 = c01.z1.I() ? com.tencent.mm.R.string.khy : com.tencent.mm.R.string.khv;
                    } else if (i19 == 4) {
                        editHintView.getContext();
                        i17 = c01.z1.I() ? com.tencent.mm.R.layout.a3i : com.tencent.mm.R.layout.a3h;
                        i18 = com.tencent.mm.R.string.f491032bn0;
                    } else if (i19 == 9) {
                        i17 = com.tencent.mm.R.layout.d7w;
                        i18 = com.tencent.mm.R.string.kix;
                    } else if (i19 != 10) {
                        i17 = -1;
                        i18 = -1;
                    } else {
                        i17 = com.tencent.mm.R.layout.d77;
                        i18 = com.tencent.mm.R.string.kio;
                    }
                    if (i17 != -1) {
                        if (editHintView.D == null) {
                            android.content.Context context = editHintView.getContext();
                            editHintView.D = db5.e1.w(context, editHintView.getResources().getString(i18), editHintView.getResources().getString(com.tencent.mm.R.string.kmf), ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(i17, (android.view.ViewGroup) null), new com.tencent.mm.wallet_core.ui.j(editHintView));
                        }
                        editHintView.D.show();
                    }
                }
            } else {
                editHintView.f214073g.ClearInput();
            }
        }
        yj0.a.h(this, "com/tencent/mm/wallet_core/ui/EditHintView$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

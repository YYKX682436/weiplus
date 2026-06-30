package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes.dex */
public final class n1 extends kr3.j {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // kr3.j
    public boolean a7() {
        return false;
    }

    @Override // kr3.j
    public android.view.View c7(java.lang.String username, com.tencent.mm.storage.z3 contact) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(contact, "contact");
        java.util.List k17 = com.tencent.mm.plugin.profile.n2.f153540a.k(contact, getIntent());
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, 0, 0, i65.a.f(linearLayout.getContext(), com.tencent.mm.R.dimen.anl));
        java.util.ArrayList arrayList = (java.util.ArrayList) k17;
        if (true ^ arrayList.isEmpty()) {
            android.view.View view = new android.view.View(getContext());
            view.setBackgroundColor(i65.a.d(view.getContext(), com.tencent.mm.R.color.FG_3));
            linearLayout.addView(view, -1, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479641bg));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PhonePreviewUI", "phone list size: " + arrayList.size());
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.e3i, (android.view.ViewGroup) null);
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.sys)).setText(str);
            inflate.findViewById(com.tencent.mm.R.id.syr).setOnClickListener(new com.tencent.mm.plugin.profile.ui.mod.components.l1(str, this));
            inflate.findViewById(com.tencent.mm.R.id.syq).setOnClickListener(new com.tencent.mm.plugin.profile.ui.mod.components.m1(str, this));
            linearLayout.addView(inflate);
        }
        return linearLayout;
    }

    @Override // kr3.j
    public int l7() {
        return com.tencent.mm.R.string.gxv;
    }

    @Override // kr3.j, com.tencent.mm.ui.component.UIComponent
    public boolean onClickDialogSpaceOnHalfScreenMode() {
        Y6();
        return false;
    }
}

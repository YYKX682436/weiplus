package j93;

/* loaded from: classes11.dex */
public final class s0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j93.x0 f298492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f298493b;

    public s0(j93.x0 x0Var, java.lang.String str) {
        this.f298492a = x0Var;
        this.f298493b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar == null) {
            return null;
        }
        ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436684m, vg3.b.f436646f, vg3.c.f436670y, fVar.f70616b, null, 16, null));
        int i17 = fVar.f70615a;
        j93.x0 x0Var = this.f298492a;
        if (i17 != 0 || fVar.f70616b != 0) {
            androidx.appcompat.app.AppCompatActivity context = x0Var.getActivity();
            com.tencent.mm.ui.widget.dialog.f4 f4Var = x0Var.f298533f;
            java.lang.String string = x0Var.getActivity().getString(com.tencent.mm.R.string.mba);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            kotlin.jvm.internal.o.g(context, "context");
            if (f4Var != null) {
                com.tencent.mm.ui.widget.dialog.e4 e4Var = f4Var.f211791d;
                e4Var.getClass();
                e4Var.f211776c = string;
                e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
                e4Var.e();
                return fVar;
            }
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var2.f211776c = string;
            e4Var2.b(com.tencent.mm.R.raw.icons_filled_info);
            e4Var2.c();
            return fVar;
        }
        androidx.appcompat.app.AppCompatActivity context2 = x0Var.getActivity();
        com.tencent.mm.ui.widget.dialog.f4 f4Var2 = x0Var.f298533f;
        java.lang.String string2 = x0Var.getActivity().getString(com.tencent.mm.R.string.mb_);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        kotlin.jvm.internal.o.g(context2, "context");
        if (f4Var2 != null) {
            com.tencent.mm.ui.widget.dialog.e4 e4Var3 = f4Var2.f211791d;
            e4Var3.getClass();
            e4Var3.f211776c = string2;
            e4Var3.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var3.e();
        } else {
            int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var4 = new com.tencent.mm.ui.widget.dialog.e4(context2);
            e4Var4.f211776c = string2;
            e4Var4.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var4.c();
        }
        java.lang.String str = x0Var.f298531d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doInsertOrUpdateLabel() called with: id = ");
        java.lang.String str2 = this.f298493b;
        sb6.append(str2);
        sb6.append(", name = ");
        sb6.append(str);
        sb6.append(", isNewLabel = false");
        com.tencent.mars.xlog.Log.i("MicroMsg.ReNameLabelDialogUIC", sb6.toString());
        java.lang.Integer h17 = r26.h0.h(str2);
        if (h17 != null) {
            com.tencent.mm.storage.d4 n17 = b93.r.wi().n1(str2);
            if (n17 == null) {
                n17 = new com.tencent.mm.storage.d4();
            }
            n17.field_labelID = h17.intValue();
            n17.field_labelName = str;
            n17.field_labelPYFull = x51.k.a(str);
            n17.field_labelPYShort = x51.k.b(str);
            b93.r.wi().update(n17, "labelID");
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ReNameLabelDialogUIC", "id is not integer type: ".concat(str2));
        }
        x0Var.getIntent().putExtra("label_name", x0Var.f298531d);
        com.tencent.mm.view.recyclerview.WxRecyclerView k17 = ((em.l2) ((jz5.n) x0Var.f298532e).getValue()).k();
        kotlin.jvm.internal.o.f(k17, "getSelectContactRv(...)");
        com.tencent.mm.plugin.mvvmlist.MvvmList a17 = xm3.u0.a(k17);
        java.lang.String str3 = x0Var.f298531d + '(' + ((a17 == null || (arrayList = a17.f152065o) == null) ? 0 : arrayList.size()) + ')';
        androidx.appcompat.app.AppCompatActivity activity = x0Var.getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity == null) {
            return fVar;
        }
        mMActivity.setMMTitle(str3);
        return fVar;
    }
}

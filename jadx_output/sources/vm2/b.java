package vm2;

/* loaded from: classes3.dex */
public final class b extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.aps;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        java.lang.String string;
        vm2.d item = (vm2.d) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.tencent.mm.R.id.grn);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.grl);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.grc);
        r45.kv1 a17 = vm2.d.f438087f.a(item);
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d e17 = g1Var.e();
        java.lang.String str2 = "";
        if (a17 == null || (str = a17.getString(2)) == null) {
            str = "";
        }
        mn2.q3 q3Var = new mn2.q3(str, com.tencent.mm.plugin.finder.storage.y90.f128356f);
        kotlin.jvm.internal.o.d(imageView);
        e17.c(q3Var, imageView, g1Var.h(mn2.f1.f329954e));
        r45.yp1 yp1Var = item.f438088d;
        java.lang.String string2 = yp1Var.getString(1);
        if (string2 == null) {
            string2 = "";
        }
        textView.setText(string2);
        if (!((yp1Var.getInteger(3) & 2) > 0)) {
            textView2.setText("");
            return;
        }
        r45.qa0 qa0Var = item.f438089e;
        if (qa0Var != null && (string = qa0Var.getString(2)) != null) {
            str2 = string;
        }
        if (str2.length() == 0) {
            str2 = holder.f293121e.getString(com.tencent.mm.R.string.ddk);
            kotlin.jvm.internal.o.f(str2, "getString(...)");
        }
        textView2.setText(str2);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}

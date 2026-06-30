package dv2;

/* loaded from: classes2.dex */
public final class h1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dv2.j1 f243864d;

    public h1(dv2.j1 j1Var) {
        this.f243864d = j1Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.util.List<com.tencent.mm.plugin.finder.viewmodel.component.lz> list = (java.util.List) obj;
        dv2.j1 j1Var = this.f243864d;
        j1Var.f243878h.clear();
        j1Var.f243878h.addAll(list);
        java.util.ArrayList arrayList = j1Var.f243877g;
        arrayList.clear();
        for (com.tencent.mm.plugin.finder.viewmodel.component.lz lzVar : list) {
            java.lang.String str = lzVar.f135100d;
            if (str == null) {
                str = "";
            }
            ya2.b2 b17 = ya2.h.f460484a.b(str);
            if (b17 == null) {
                b17 = new ya2.b2(str);
                java.lang.String str2 = lzVar.f135097a;
                if (str2 == null) {
                    str2 = "";
                }
                b17.field_nickname = str2;
                java.lang.String str3 = lzVar.f135098b;
                b17.field_avatarUrl = str3 != null ? str3 : "";
            }
            arrayList.add(new so2.v1(b17));
        }
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = j1Var.f243879i;
        if (wxRecyclerAdapter == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        wxRecyclerAdapter.notifyDataSetChanged();
        if (list.isEmpty()) {
            android.widget.TextView textView = j1Var.f243876f;
            if (textView == null) {
                kotlin.jvm.internal.o.o("emptyTip");
                throw null;
            }
            textView.setText(j1Var.getContext().getString(com.tencent.mm.R.string.p4z));
            android.widget.TextView textView2 = j1Var.f243876f;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("emptyTip");
                throw null;
            }
            textView2.setVisibility(0);
        } else {
            android.widget.TextView textView3 = j1Var.f243876f;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("emptyTip");
                throw null;
            }
            textView3.setVisibility(8);
        }
        return jz5.f0.f302826a;
    }
}

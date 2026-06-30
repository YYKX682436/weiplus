package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes9.dex */
public final class r1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.s1 f117352d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.tencent.mm.plugin.finder.live.viewmodel.s1 s1Var) {
        super(0);
        this.f117352d = s1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.viewmodel.s1 s1Var = this.f117352d;
        boolean z17 = true;
        if (!s1Var.f117380o.isEmpty()) {
            java.util.List K0 = kz5.n0.K0(s1Var.f117380o, 8);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(K0, 10));
            java.util.Iterator it = K0.iterator();
            while (it.hasNext()) {
                arrayList.add(new cm2.k((r45.c73) it.next()));
            }
            bm2.c cVar = s1Var.f117381p;
            cVar.getClass();
            java.util.ArrayList arrayList2 = cVar.f21803d;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            cVar.notifyDataSetChanged();
            android.widget.EditText editText = s1Var.f117378m;
            if (editText == null) {
                kotlin.jvm.internal.o.o("editText");
                throw null;
            }
            android.text.Editable text = editText.getText();
            java.lang.String obj = text != null ? text.toString() : null;
            if (obj != null && obj.length() != 0) {
                z17 = false;
            }
            if (z17 && cVar.getItemCount() > 0) {
                android.widget.LinearLayout linearLayout = s1Var.f117376h;
                if (linearLayout == null) {
                    kotlin.jvm.internal.o.o("container");
                    throw null;
                }
                linearLayout.setVisibility(0);
            }
        }
        return jz5.f0.f302826a;
    }
}

package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class np extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.pp f119196d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np(com.tencent.mm.plugin.finder.live.widget.pp ppVar) {
        super(0);
        this.f119196d = ppVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.ArrayList arrayList;
        com.tencent.mm.plugin.finder.live.widget.pp ppVar = this.f119196d;
        ppVar.f119400f.clear();
        java.util.ArrayList arrayList2 = ppVar.f119401g;
        synchronized (arrayList2) {
            arrayList = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(new vi2.d((r45.xn1) it.next()));
            }
        }
        ppVar.f119400f.addAll(arrayList);
        androidx.recyclerview.widget.f2 adapter = ppVar.f119398d.getAdapter();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
        if (ppVar.f119400f.size() > 0) {
            int size = ppVar.f119400f.size();
            android.view.ViewGroup viewGroup = ppVar.f119396b;
            if (size > 0) {
                viewGroup.setVisibility(0);
            } else {
                viewGroup.setVisibility(8);
            }
            ppVar.f119397c.c();
        } else {
            ppVar.f119396b.setVisibility(8);
            ppVar.f119397c.d();
        }
        android.view.ViewGroup viewGroup2 = ppVar.f119396b;
        java.lang.String string = viewGroup2.getContext().getString(com.tencent.mm.R.string.f491468m32);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String string2 = viewGroup2.getContext().getString(com.tencent.mm.R.string.f491467m31, string);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        android.text.SpannableString spannableString = new android.text.SpannableString(string2);
        int L = r26.n0.L(string2, string, 0, false, 6, null);
        if (L >= 0 && string.length() + L <= string2.length()) {
            spannableString.setSpan(new com.tencent.mm.plugin.finder.live.widget.lp(ppVar), L, string.length() + L, 33);
        }
        android.widget.TextView textView = ppVar.f119399e;
        textView.setText(spannableString);
        textView.setHighlightColor(viewGroup2.getContext().getResources().getColor(android.R.color.transparent));
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        ym5.a1.h(textView, new com.tencent.mm.plugin.finder.live.widget.mp());
        return jz5.f0.f302826a;
    }
}

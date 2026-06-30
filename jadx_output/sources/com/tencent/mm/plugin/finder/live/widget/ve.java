package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ve extends com.tencent.mm.plugin.finder.live.widget.g {

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f120064h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderLiveDarkModePicker f120065i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve(android.content.Context context) {
        super(context, false, null, false, 14, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.diq;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        android.content.Context context;
        kotlin.jvm.internal.o.g(rootView, "rootView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 1; i17 < 21; i17++) {
            arrayList.add(java.lang.String.valueOf(i17));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            context = this.f118381d;
            if (!hasNext) {
                break;
            } else {
                arrayList2.add(context.getString(com.tencent.mm.R.string.ltz, (java.lang.String) it.next()));
            }
        }
        java.lang.String[] strArr = (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) rootView.findViewById(com.tencent.mm.R.id.qlk);
        com.tencent.mm.plugin.finder.view.FinderLiveDarkModePicker finderLiveDarkModePicker = new com.tencent.mm.plugin.finder.view.FinderLiveDarkModePicker(context);
        this.f120065i = finderLiveDarkModePicker;
        finderLiveDarkModePicker.setOptionsArray(strArr);
        viewGroup.removeAllViews();
        com.tencent.mm.plugin.finder.view.FinderLiveDarkModePicker finderLiveDarkModePicker2 = this.f120065i;
        if (finderLiveDarkModePicker2 == null) {
            kotlin.jvm.internal.o.o("picker");
            throw null;
        }
        viewGroup.addView(finderLiveDarkModePicker2.getView(), new android.view.ViewGroup.LayoutParams(-1, -1));
        rootView.findViewById(com.tencent.mm.R.id.b5i).setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.te(this));
        rootView.findViewById(com.tencent.mm.R.id.c9z).setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.ue(this));
    }
}

package com.tencent.mm.plugin.finder.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderHalfContactFinderItem;", "Landroid/widget/FrameLayout;", "", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, "Ljz5/f0;", "setTitle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderHalfContactFinderItem extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f131117d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f131118e;

    /* renamed from: f, reason: collision with root package name */
    public r45.nw6 f131119f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderHalfContactFinderItem(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131117d = "";
        this.f131118e = new java.util.LinkedList();
        a();
    }

    public final void a() {
        java.lang.Object systemService = getContext().getSystemService("layout_inflater");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        ((android.view.LayoutInflater) systemService).inflate(com.tencent.mm.R.layout.f489163bj0, (android.view.ViewGroup) this, true);
        java.util.List list = this.f131118e;
        list.clear();
        list.add(findViewById(com.tencent.mm.R.id.h9p));
        list.add(findViewById(com.tencent.mm.R.id.h9q));
        list.add(findViewById(com.tencent.mm.R.id.h9r));
        list.add(findViewById(com.tencent.mm.R.id.h9s));
    }

    public final void b(r45.nw6 nw6Var) {
        java.lang.String str;
        r45.so2 so2Var;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        this.f131119f = nw6Var;
        c();
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.fuv);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.e_c);
        r45.nw6 nw6Var2 = this.f131119f;
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo = null;
        textView.setText((nw6Var2 == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) nw6Var2.getCustom(0)) == null) ? null : finderContact2.getNickname());
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.m1 m1Var = ya2.m1.f460511a;
        kotlin.jvm.internal.o.d(imageView);
        r45.nw6 nw6Var3 = this.f131119f;
        if (nw6Var3 != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) nw6Var3.getCustom(0)) != null) {
            finderAuthInfo = finderContact.getAuthInfo();
        }
        m1Var.c(imageView, finderAuthInfo, 1);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.rgl);
        r45.nw6 nw6Var4 = this.f131119f;
        if (nw6Var4 == null || (so2Var = (r45.so2) nw6Var4.getCustom(8)) == null || (str = so2Var.getString(0)) == null) {
            str = "";
        }
        if (textView2 != null) {
            textView2.setVisibility(str.length() == 0 ? 8 : 0);
            textView2.setText(str);
        }
    }

    public final void c() {
        java.util.List<android.widget.ImageView> list = this.f131118e;
        for (android.widget.ImageView imageView : list) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        }
        r45.nw6 nw6Var = this.f131119f;
        if (nw6Var != null) {
            int size = nw6Var.getList(2).size();
            for (int i17 = 0; i17 < size && i17 < ((java.util.LinkedList) list).size(); i17++) {
                android.widget.ImageView imageView2 = (android.widget.ImageView) ((java.util.LinkedList) list).get(i17);
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                }
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                com.tencent.mm.plugin.finder.assist.d8.f102092a.d(nw6Var.getList(2).get(i17), imageView2);
            }
        }
    }

    public final void setTitle(java.lang.String title) {
        kotlin.jvm.internal.o.g(title, "title");
        this.f131117d = title;
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f482920rt);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f131117d)) {
            textView.setText("");
        } else {
            textView.setText(this.f131117d);
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479649bo);
            textView.setLayoutParams(layoutParams);
        }
        c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FinderHalfContactFinderItem(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f131117d = "";
        this.f131118e = new java.util.LinkedList();
        a();
    }
}

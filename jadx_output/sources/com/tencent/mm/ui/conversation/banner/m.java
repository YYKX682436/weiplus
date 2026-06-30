package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes5.dex */
public class m extends s35.b {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f207549m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f207550n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f207551o;

    public m(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17) {
        super(context);
        this.f207549m = null;
        this.f207550n = null;
        this.f207551o = false;
        this.f207549m = str;
        this.f207550n = str2;
        this.f207551o = z17;
        f();
    }

    @Override // s35.b
    public void a() {
    }

    @Override // s35.b
    public int b() {
        return -1;
    }

    @Override // s35.b
    public android.view.View e(android.content.Context context, int i17, android.view.ViewGroup viewGroup) {
        return l(c01.d9.b().o().c(this.f207549m, "showtype"), context, viewGroup);
    }

    @Override // s35.b
    public void h(android.view.View view) {
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bqk);
        e01.f o17 = c01.d9.b().o();
        java.lang.String str = this.f207549m;
        java.lang.String c17 = o17.c(str, "wording");
        java.lang.String c18 = c01.d9.b().o().c(this.f207550n, "wording");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
            textView.setText(c17);
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(c18)) {
            textView.setText(c18);
        }
        java.lang.String c19 = c01.d9.b().o().c(str, "linkname");
        final java.lang.String c27 = c01.d9.b().o().c(str, "linksrc");
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bqj);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(c19)) {
            textView2.setText(c19);
        }
        android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.conversation.banner.m$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                com.tencent.mm.ui.conversation.banner.m mVar = com.tencent.mm.ui.conversation.banner.m.this;
                mVar.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.String str2 = c27;
                arrayList.add(str2);
                arrayList.add(view2);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/ui/conversation/banner/ChattingSecurityBanner", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", mVar, array);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(str2);
                arrayList2.add(view2);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/ui/conversation/banner/ChattingSecurityBanner", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", mVar, array2);
                android.content.Intent intent = new android.content.Intent();
                java.lang.String str3 = mVar.f207549m;
                intent.putExtra("k_username", str3);
                int i17 = mVar.f207551o ? 36 : 39;
                intent.putExtra("showShare", false);
                if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    intent.putExtra("rawUrl", java.lang.String.format(com.tencent.mm.ui.n2.f209398a, java.lang.Integer.valueOf(i17)));
                } else {
                    intent.putExtra("rawUrl", str2);
                }
                intent.putExtra("geta8key_username", str3);
                intent.putExtra("geta8key_scene", 103);
                java.lang.ref.WeakReference weakReference = mVar.f402842g;
                if (weakReference.get() != null) {
                    j45.l.j((android.content.Context) weakReference.get(), "webview", ".ui.tools.WebViewUI", intent, null);
                }
                yj0.a.h(mVar, "com/tencent/mm/ui/conversation/banner/ChattingSecurityBanner", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(mVar, "com/tencent/mm/ui/conversation/banner/ChattingSecurityBanner", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        };
        if ("2".equals(c01.d9.b().o().c(str, "showtype"))) {
            view.setOnClickListener(onClickListener);
        } else {
            textView2.setOnClickListener(onClickListener);
            ((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bqi)).setOnClickListener(new com.tencent.mm.ui.conversation.banner.n(this));
        }
    }

    public android.view.View l(java.lang.String str, android.content.Context context, android.view.ViewGroup viewGroup) {
        return "2".equals(str) ? android.view.View.inflate(context, com.tencent.mm.R.layout.f488590y0, viewGroup) : android.view.View.inflate(context, com.tencent.mm.R.layout.f488589xz, viewGroup);
    }

    public void m() {
    }
}

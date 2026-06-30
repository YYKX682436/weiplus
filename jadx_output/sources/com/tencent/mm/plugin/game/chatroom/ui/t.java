package com.tencent.mm.plugin.game.chatroom.ui;

/* loaded from: classes5.dex */
public final class t extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f138858d;

    /* renamed from: e, reason: collision with root package name */
    public final long f138859e;

    /* renamed from: f, reason: collision with root package name */
    public final long f138860f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f138861g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.game.chatroom.ui.s f138862h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f138863i;

    public t(java.lang.String chatroomName, long j17, long j18) {
        kotlin.jvm.internal.o.g(chatroomName, "chatroomName");
        this.f138858d = chatroomName;
        this.f138859e = j17;
        this.f138860f = j18;
        this.f138861g = new java.util.ArrayList();
        this.f138863i = new java.util.HashMap();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f138861g).size();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b6  */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r23, int r24) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.chatroom.ui.t.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.bgz, (android.view.ViewGroup) null, false);
        int i18 = com.tencent.mm.R.id.f485043gc3;
        android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.f485043gc3);
        if (textView != null) {
            i18 = com.tencent.mm.R.id.hke;
            com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = (com.tencent.mm.ui.widget.MMRoundCornerImageView) x4.b.a(inflate, com.tencent.mm.R.id.hke);
            if (mMRoundCornerImageView != null) {
                i18 = com.tencent.mm.R.id.hyq;
                android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) x4.b.a(inflate, com.tencent.mm.R.id.hyq);
                if (relativeLayout != null) {
                    i18 = com.tencent.mm.R.id.okz;
                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.okz);
                    if (textView2 != null) {
                        i18 = com.tencent.mm.R.id.oog;
                        android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.oog);
                        if (textView3 != null) {
                            i18 = com.tencent.mm.R.id.oqm;
                            android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.oqm);
                            if (textView4 != null) {
                                return new com.tencent.mm.plugin.game.chatroom.ui.v(new x33.f((android.widget.RelativeLayout) inflate, textView, mMRoundCornerImageView, relativeLayout, textView2, textView3, textView4), this.f138858d, this.f138859e, this.f138860f);
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i18)));
    }

    public final void x(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "list");
        java.util.List a17 = e43.e.f249361a.a(list);
        java.util.List list2 = this.f138861g;
        ((java.util.ArrayList) list2).clear();
        ((java.util.ArrayList) list2).addAll(a17);
        this.f138863i.clear();
        notifyDataSetChanged();
    }
}

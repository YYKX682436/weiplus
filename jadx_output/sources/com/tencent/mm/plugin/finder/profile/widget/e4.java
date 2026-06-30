package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class e4 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f124528d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f124529e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f124530f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f124531g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s4 f124532h;

    public e4(com.tencent.mm.plugin.finder.profile.widget.s4 s4Var, java.lang.String username, boolean z17, android.content.Context context, boolean z18, boolean z19, int i17, kotlin.jvm.internal.i iVar) {
        z19 = (i17 & 16) != 0 ? false : z19;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(context, "context");
        this.f124532h = s4Var;
        this.f124528d = username;
        this.f124529e = z17;
        this.f124530f = context;
        this.f124531g = z19;
    }

    public static final void x(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.finder.profile.widget.e4 e4Var, com.tencent.mm.plugin.finder.profile.widget.s4 s4Var, com.tencent.mm.plugin.finder.profile.widget.n3 n3Var, int i17) {
        int i18 = !c0Var.f310112d ? 1 : 2;
        com.tencent.mars.xlog.Log.i("FinderMoreLiveNoticeListWidget", "CgiFinderAudienceReserveLiveNotification do op=" + i18);
        az2.j Ni = ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).Ni(e4Var.f124528d, 2, i18, null, 0, 0L);
        android.content.Context context = e4Var.f124530f;
        Ni.t(context, context.getResources().getString(com.tencent.mm.R.string.f9y), 500L);
        Ni.l().K(new com.tencent.mm.plugin.finder.profile.widget.b4(s4Var, i18, e4Var, n3Var, i17));
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) this.f124532h.f124760n).size() + (y() ? 1 : 0);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return (y() && i17 == 0) ? 0 : 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0362  */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r56, int r57) {
        /*
            Method dump skipped, instructions count: 1621
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.profile.widget.e4.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f124530f).inflate(com.tencent.mm.R.layout.b6v, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new com.tencent.mm.plugin.finder.profile.widget.n3(this, inflate);
    }

    public final boolean y() {
        r45.fw4 fw4Var;
        if (this.f124531g) {
            return false;
        }
        com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = this.f124532h;
        boolean z17 = this.f124529e;
        if (z17) {
            r45.c32 c32Var = s4Var.f124765s;
            if ((c32Var != null ? c32Var.getInteger(0) : 0) > 0) {
                return true;
            }
        }
        if (!z17) {
            r45.c32 c32Var2 = s4Var.f124765s;
            if ((c32Var2 == null || (fw4Var = (r45.fw4) c32Var2.getCustom(1)) == null) ? false : fw4Var.getBoolean(0)) {
                return true;
            }
        }
        return false;
    }

    public final void z(com.tencent.mm.plugin.finder.profile.widget.n3 n3Var, int i17) {
        r45.fw4 fw4Var;
        r45.fw4 fw4Var2;
        java.lang.String str = null;
        str = null;
        boolean z17 = false;
        com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = this.f124532h;
        boolean z18 = this.f124529e;
        if (z18) {
            r45.c32 c32Var = s4Var.f124765s;
            n3Var.f124643u.setText(this.f124530f.getResources().getString(com.tencent.mm.R.string.o0i, c32Var != null ? java.lang.Integer.valueOf(c32Var.getInteger(0)) : null));
        } else {
            android.widget.TextView textView = n3Var.f124643u;
            r45.c32 c32Var2 = s4Var.f124765s;
            if (c32Var2 != null && (fw4Var = (r45.fw4) c32Var2.getCustom(1)) != null) {
                str = fw4Var.getString(1);
            }
            textView.setText(str);
        }
        android.widget.TextView textView2 = n3Var.f124644v;
        kotlin.jvm.internal.o.g(textView2, "<this>");
        com.tencent.mm.ui.fk.a(textView2);
        int i18 = (y() && i17 == 0 && !z18) ? 0 : 8;
        android.widget.TextView textView3 = n3Var.f124644v;
        textView3.setVisibility(i18);
        r45.c32 c32Var3 = s4Var.f124765s;
        if (c32Var3 != null && (fw4Var2 = (r45.fw4) c32Var3.getCustom(1)) != null) {
            z17 = fw4Var2.getBoolean(2);
        }
        if (z17) {
            textView3.setText(com.tencent.mm.R.string.nkl);
        } else {
            textView3.setText(com.tencent.mm.R.string.nkj);
        }
    }
}

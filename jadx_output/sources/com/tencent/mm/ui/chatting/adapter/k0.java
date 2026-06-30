package com.tencent.mm.ui.chatting.adapter;

/* loaded from: classes9.dex */
public class k0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: f, reason: collision with root package name */
    public static com.tencent.mm.ui.chatting.adapter.i0 f198430f;

    /* renamed from: g, reason: collision with root package name */
    public static com.tencent.mm.ui.chatting.adapter.j0 f198431g;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f198432d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f198433e;

    public k0(android.content.Context context, com.tencent.mm.ui.chatting.adapter.j0 j0Var) {
        f198431g = j0Var;
        this.f198432d = context;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        java.util.ArrayList arrayList;
        com.tencent.mm.ui.chatting.adapter.j0 j0Var = f198431g;
        int size = (j0Var == null || (arrayList = ((com.tencent.mm.ui.chatting.presenter.y) j0Var).f202546i) == null) ? 0 : arrayList.size();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(f198431g == null);
        objArr[1] = java.lang.Integer.valueOf(size);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryListAdapter", " null == mIDetail?%s getItemCount:%s", objArr);
        return size;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((com.tencent.mm.ui.chatting.presenter.y) f198431g).h(i17).a();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        int itemViewType = getItemViewType(i17);
        com.tencent.mm.ui.chatting.adapter.f0 h17 = ((com.tencent.mm.ui.chatting.presenter.y) f198431g).h(i17);
        android.content.Context context = this.f198432d;
        if (itemViewType == Integer.MAX_VALUE) {
            com.tencent.mm.ui.chatting.adapter.f0 h18 = ((com.tencent.mm.ui.chatting.presenter.y) f198431g).h(i17 + 1);
            if (i17 != getItemCount() - 1) {
                if (com.tencent.mm.ui.gridviewheaders.a.e().a(new java.util.Date(h18.f198408a)) == com.tencent.mm.ui.gridviewheaders.a.e().a(new java.util.Date(h17.f198408a))) {
                    com.tencent.mm.ui.chatting.adapter.h0 h0Var = (com.tencent.mm.ui.chatting.adapter.h0) k3Var;
                    h0Var.f198419d.setVisibility(0);
                    h0Var.f198419d.setText(com.tencent.mm.ui.gridviewheaders.a.e().d(new java.util.Date(h17.f198408a), context));
                    f198431g.d(k3Var, i17, itemViewType);
                    return;
                }
            }
            ((com.tencent.mm.ui.chatting.adapter.h0) k3Var).f198419d.setVisibility(8);
            return;
        }
        if (itemViewType == 2147483646) {
            return;
        }
        com.tencent.mm.ui.chatting.adapter.e0 e0Var = (com.tencent.mm.ui.chatting.adapter.e0) k3Var;
        e0Var.f198405h.setTag(java.lang.Integer.valueOf(i17));
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(e0Var.f198401d, h17.f198412e, null);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(this.f198433e);
        java.lang.String str = h17.f198415h;
        java.lang.String str2 = h17.f198414g;
        if (K0) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    str = h17.f198413f;
                }
            }
            str = str2;
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str = h17.f198413f;
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(h17.f198413f) && h17.f198413f.contains(this.f198433e)) {
                str = str + "(" + h17.f198413f + ")";
            }
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.contains(this.f198433e)) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(h17.f198413f) && h17.f198413f.contains(this.f198433e)) {
                str = str2 + "(" + h17.f198413f + ")";
            }
            str = str2;
        } else {
            str = str2 + "(" + str + ")";
        }
        android.widget.TextView textView = e0Var.f198402e;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, str, textSize));
        e0Var.f198403f.setText(com.tencent.mm.plugin.fav.ui.w6.c(context, h17.f198408a));
        java.lang.String str3 = h17.f198410c;
        android.widget.TextView textView2 = e0Var.f198404g;
        textView2.setText(str3);
        f198431g.f(e0Var, i17, itemViewType);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f198433e)) {
            return;
        }
        e0Var.i(textView, this.f198433e);
        e0Var.i(textView2, this.f198433e);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        if (i17 != Integer.MAX_VALUE) {
            return i17 == 2147483646 ? new com.tencent.mm.ui.chatting.adapter.b0(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.bcc, viewGroup, false)) : f198431g.c(viewGroup, i17);
        }
        androidx.recyclerview.widget.k3 e17 = f198431g.e(viewGroup, i17);
        return e17 == null ? new com.tencent.mm.ui.chatting.adapter.h0(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.bdj, viewGroup, false)) : e17;
    }
}

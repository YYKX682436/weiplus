package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class d9 extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.ImageView f203776b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f203777c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f203778d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f203779e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f203780f;

    public com.tencent.mm.ui.chatting.viewitems.d9 a(android.view.View view, boolean z17) {
        super.create(view);
        this.f203776b = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.gns);
        this.f203777c = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.gnv);
        this.f203778d = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.gnu);
        this.f203779e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.gnw);
        this.userTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.brc);
        if (z17) {
            this.uploadingPB = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.ott);
            this.f203780f = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.bqz);
        }
        return this;
    }
}

package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class xq extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.LinearLayout f206006b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.br f206007c = new com.tencent.mm.ui.chatting.viewitems.br();

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.as f206008d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.as f206009e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.cr f206010f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.as f206011g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f206012h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f206013i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.viewitems.f f206014j;

    public xq() {
        com.tencent.mm.ui.chatting.viewitems.as asVar = new com.tencent.mm.ui.chatting.viewitems.as(false);
        this.f206008d = asVar;
        this.f206009e = new com.tencent.mm.ui.chatting.viewitems.as(true);
        this.f206010f = new com.tencent.mm.ui.chatting.viewitems.cr();
        this.f206011g = asVar;
        this.f206014j = new com.tencent.mm.ui.chatting.viewitems.f();
    }

    public com.tencent.mm.ui.chatting.viewitems.g0 a(android.view.View view) {
        this.checkBox = (android.widget.CheckBox) view.findViewById(com.tencent.mm.R.id.bkf);
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        this.userTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.brc);
        this.avatarIV = (com.tencent.mm.ui.chatting.view.ChattingAvatarImageView) view.findViewById(com.tencent.mm.R.id.f483642bk1);
        this.timeTV = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483696br1);
        this.f206006b = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.bkn);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.bn8);
        com.tencent.mm.ui.chatting.viewitems.br brVar = this.f206007c;
        brVar.f203503a = findViewById;
        brVar.f203504b = view.findViewById(com.tencent.mm.R.id.f485217gy2);
        brVar.f203507e = (android.widget.TextView) brVar.f203503a.findViewById(com.tencent.mm.R.id.obc);
        brVar.f203509g = (android.widget.LinearLayout) brVar.f203503a.findViewById(com.tencent.mm.R.id.f484097d03);
        brVar.f203508f = this.f206006b.findViewById(com.tencent.mm.R.id.bn7);
        brVar.f203510h = this.f206006b.findViewById(com.tencent.mm.R.id.mmw);
        brVar.f203505c = view.findViewById(com.tencent.mm.R.id.jrz);
        brVar.f203506d = view.findViewById(com.tencent.mm.R.id.f485982js0);
        brVar.f203511i = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.qom);
        this.f206008d.f203407a = view.findViewById(com.tencent.mm.R.id.bn6);
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.bn9);
        com.tencent.mm.ui.chatting.viewitems.as asVar = this.f206009e;
        asVar.f203407a = findViewById2;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.f483669i33);
        com.tencent.mm.ui.chatting.viewitems.cr crVar = this.f206010f;
        crVar.f203747a = findViewById3;
        com.tencent.mm.ui.chatting.viewitems.as asVar2 = this.f206008d;
        com.tencent.mm.ui.chatting.viewitems.f fVar = this.f206014j;
        asVar2.a(fVar);
        asVar.a(fVar);
        crVar.f203748b = (android.widget.TextView) ((android.view.ViewGroup) crVar.f203747a).findViewById(com.tencent.mm.R.id.gos);
        this.f206012h = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f483667bn4);
        this.f206013i = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483668i32);
        return this;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.g0
    public android.view.View getMainContainerView() {
        return this.f206006b;
    }
}

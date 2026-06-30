package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class e3 extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView f203842b;

    public final com.tencent.mm.ui.chatting.viewitems.e3 a(android.view.View view, boolean z17) {
        if (view == null) {
            return this;
        }
        super.create(view);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.spw);
        this.f203842b = findViewById instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView ? (com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingAskShareMvvmView) findViewById : null;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.bqx);
        this.stateIV = findViewById2 instanceof android.widget.ImageView ? (android.widget.ImageView) findViewById2 : null;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.bkf);
        kotlin.jvm.internal.o.e(findViewById3, "null cannot be cast to non-null type android.widget.CheckBox");
        this.checkBox = (android.widget.CheckBox) findViewById3;
        android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.bpa);
        kotlin.jvm.internal.o.e(findViewById4, "null cannot be cast to non-null type android.view.View");
        this.maskView = findViewById4;
        android.view.View findViewById5 = view.findViewById(com.tencent.mm.R.id.brc);
        this.userTV = findViewById5 instanceof android.widget.TextView ? (android.widget.TextView) findViewById5 : null;
        return this;
    }
}

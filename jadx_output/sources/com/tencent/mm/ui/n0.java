package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class n0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f209390d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f209391e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f209392f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f209393g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f209394h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.AllRemindMsgUI f209395i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.ui.AllRemindMsgUI allRemindMsgUI, android.view.View view) {
        super(view);
        this.f209395i = allRemindMsgUI;
        this.f209390d = view;
        this.f209391e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc);
        this.f209392f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o8y);
        this.f209393g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kbf);
        this.f209394h = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.a9m);
        view.setOnClickListener(new com.tencent.mm.ui.i0(this, allRemindMsgUI));
        view.setOnTouchListener(new com.tencent.mm.ui.j0(this, allRemindMsgUI));
        view.setOnLongClickListener(new com.tencent.mm.ui.m0(this, allRemindMsgUI));
    }
}

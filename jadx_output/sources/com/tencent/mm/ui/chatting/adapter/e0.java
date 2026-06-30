package com.tencent.mm.ui.chatting.adapter;

/* loaded from: classes9.dex */
public abstract class e0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f198401d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f198402e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f198403f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f198404g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f198405h;

    public e0(android.view.View view) {
        super(view);
        this.f198405h = view;
        this.f198401d = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.dte);
        this.f198402e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.dvd);
        this.f198403f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.dwo);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.dwp);
        this.f198404g = textView;
        textView.setSingleLine(false);
        textView.setMaxLines(2);
        view.setOnClickListener(new com.tencent.mm.ui.chatting.adapter.c0(this));
        view.setOnLongClickListener(new com.tencent.mm.ui.chatting.adapter.d0(this));
    }

    public void i(android.widget.TextView textView, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        textView.setText(o13.q.c(textView.getContext(), textView.getText(), str));
    }
}

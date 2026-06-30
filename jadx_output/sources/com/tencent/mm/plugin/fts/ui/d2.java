package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes3.dex */
public class d2 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f138039d;

    public d2(com.tencent.mm.plugin.fts.ui.FTSChattingConvUI fTSChattingConvUI, android.view.View view) {
        super(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc);
        this.f138039d = textView;
        textView.setOnClickListener(fTSChattingConvUI);
    }
}

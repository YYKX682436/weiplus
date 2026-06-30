package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes3.dex */
public class i3 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f138077d;

    public i3(com.tencent.mm.plugin.fts.ui.FTSServiceNotifyUI fTSServiceNotifyUI, android.view.View view) {
        super(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.obc);
        this.f138077d = textView;
        textView.setTextSize(17.0f);
        textView.setOnClickListener(fTSServiceNotifyUI);
    }
}

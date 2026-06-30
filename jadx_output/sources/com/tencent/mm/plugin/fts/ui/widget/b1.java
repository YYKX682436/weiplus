package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes15.dex */
public class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f138246a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.fts.ui.widget.a1 f138247b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f138248c = false;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl f138249d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f138250e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ProgressBar f138251f;

    /* renamed from: g, reason: collision with root package name */
    public long f138252g;

    /* renamed from: h, reason: collision with root package name */
    public long f138253h;

    /* renamed from: i, reason: collision with root package name */
    public long f138254i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.Toast f138255j;

    public b1(android.content.Context context, com.tencent.mm.plugin.fts.ui.widget.FTSVoiceInputLayoutImpl fTSVoiceInputLayoutImpl, android.widget.TextView textView, android.widget.ProgressBar progressBar) {
        com.tencent.mm.plugin.fts.ui.widget.y0 y0Var = new com.tencent.mm.plugin.fts.ui.widget.y0(this);
        com.tencent.mm.plugin.fts.ui.widget.z0 z0Var = new com.tencent.mm.plugin.fts.ui.widget.z0(this);
        this.f138246a = (com.tencent.mm.ui.MMActivity) context;
        this.f138249d = fTSVoiceInputLayoutImpl;
        this.f138250e = textView;
        this.f138251f = progressBar;
        fTSVoiceInputLayoutImpl.setFTSVoiceDetectListener(y0Var);
        fTSVoiceInputLayoutImpl.setLongClickLisnter(z0Var);
    }
}

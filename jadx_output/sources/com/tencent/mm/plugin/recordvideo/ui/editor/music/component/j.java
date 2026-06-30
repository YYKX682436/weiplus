package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f156261a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.y1 f156262b;

    /* renamed from: c, reason: collision with root package name */
    public long f156263c;

    /* renamed from: d, reason: collision with root package name */
    public long f156264d;

    /* renamed from: e, reason: collision with root package name */
    public long f156265e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.recordvideo.ui.editor.music.component.MusicClipRangeBarView f156266f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f156267g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f156268h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.l f156269i;

    /* renamed from: j, reason: collision with root package name */
    public final yz5.l f156270j;

    /* renamed from: k, reason: collision with root package name */
    public yz5.p f156271k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f156272l;

    public j(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f156261a = context;
        this.f156270j = new com.tencent.mm.plugin.recordvideo.ui.editor.music.component.g(this);
    }

    public final void a() {
        android.widget.TextView textView = this.f156267g;
        xv3.b bVar = xv3.b.f457430a;
        if (textView != null) {
            textView.setText(bVar.a((int) (this.f156264d / 1000)));
        }
        android.widget.TextView textView2 = this.f156268h;
        if (textView2 == null) {
            return;
        }
        textView2.setText(bVar.a((int) ((this.f156265e - this.f156264d) / 1000)));
    }
}

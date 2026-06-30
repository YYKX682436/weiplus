package fr5;

/* loaded from: classes15.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f265950a;

    /* renamed from: b, reason: collision with root package name */
    public final long f265951b;

    /* renamed from: c, reason: collision with root package name */
    public final zq5.e f265952c;

    /* renamed from: d, reason: collision with root package name */
    public final long f265953d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f265954e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f265955f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.OverScroller f265956g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Runnable f265957h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f265958i;

    public h(android.view.View view, long j17, zq5.e eVar, long j18, yz5.l onUpdateValue, yz5.a onEnd, kotlin.jvm.internal.i iVar) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(onUpdateValue, "onUpdateValue");
        kotlin.jvm.internal.o.g(onEnd, "onEnd");
        this.f265950a = view;
        this.f265951b = j17;
        this.f265952c = eVar;
        this.f265953d = j18;
        this.f265954e = onUpdateValue;
        this.f265955f = onEnd;
        this.f265956g = new android.widget.OverScroller(view.getContext());
        this.f265957h = new fr5.g(this);
    }
}

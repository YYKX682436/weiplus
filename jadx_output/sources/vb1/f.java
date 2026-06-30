package vb1;

/* loaded from: classes7.dex */
public class f implements h91.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f434477a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f434478b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vb1.g f434479c;

    public f(vb1.g gVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f434479c = gVar;
        this.f434477a = lVar;
        this.f434478b = i17;
    }

    @Override // h91.a
    public void a(com.tencent.mm.plugin.appbrand.canvas.widget.DrawCanvasArg drawCanvasArg) {
        this.f434477a.a(this.f434478b, this.f434479c.o("ok"));
    }
}

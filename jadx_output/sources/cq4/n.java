package cq4;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f221473h = {-1, -16777216, -707825, -17592, -16535286, -15172610, -7054596};

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder f221474a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f221475b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f221476c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f221477d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f221478e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f221479f;

    /* renamed from: g, reason: collision with root package name */
    public cq4.f f221480g;

    public n(com.tencent.mm.plugin.recordvideo.ui.editor.EditorPanelHolder holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        this.f221474a = holder;
        this.f221475b = jz5.h.b(new cq4.l(this));
        this.f221476c = jz5.h.b(new cq4.k(this));
        this.f221477d = jz5.h.b(new cq4.m(this));
        this.f221478e = jz5.h.b(new cq4.j(this));
    }

    public final com.tencent.mm.plugin.recordvideo.ui.editor.view.TextColorSelector a() {
        return (com.tencent.mm.plugin.recordvideo.ui.editor.view.TextColorSelector) ((jz5.n) this.f221476c).getValue();
    }

    public final android.view.View b() {
        return (android.view.View) ((jz5.n) this.f221475b).getValue();
    }
}

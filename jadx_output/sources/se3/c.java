package se3;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView f406913a;

    public c(com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView frameSetView) {
        kotlin.jvm.internal.o.g(frameSetView, "frameSetView");
        this.f406913a = frameSetView;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof se3.c) && kotlin.jvm.internal.o.b(this.f406913a, ((se3.c) obj).f406913a);
    }

    public int hashCode() {
        return this.f406913a.hashCode();
    }

    public java.lang.String toString() {
        return "InitEvent(frameSetView=" + this.f406913a + ')';
    }
}

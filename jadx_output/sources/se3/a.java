package se3;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView f406910a;

    public a(com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView frameSetView) {
        kotlin.jvm.internal.o.g(frameSetView, "frameSetView");
        this.f406910a = frameSetView;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof se3.a) && kotlin.jvm.internal.o.b(this.f406910a, ((se3.a) obj).f406910a);
    }

    public int hashCode() {
        return this.f406910a.hashCode();
    }

    public java.lang.String toString() {
        return "BindEvent(frameSetView=" + this.f406910a + ')';
    }
}

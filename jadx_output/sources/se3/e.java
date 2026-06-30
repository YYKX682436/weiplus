package se3;

/* loaded from: classes7.dex */
public final class e extends androidx.lifecycle.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f406914d = kotlinx.coroutines.flow.r2.b(0, 0, null, 7, null);

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.j0 f406915e = new androidx.lifecycle.j0();

    public final java.lang.Object N6(com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView magicBrushSclDemoView, kotlin.coroutines.Continuation continuation) {
        java.lang.Object emit = ((kotlinx.coroutines.flow.q2) this.f406914d).emit(new se3.a(magicBrushSclDemoView), continuation);
        return emit == pz5.a.f359186d ? emit : jz5.f0.f302826a;
    }

    public final java.lang.Object O6(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        java.lang.Object emit = ((kotlinx.coroutines.flow.q2) this.f406914d).emit(new se3.b(str, str2), continuation);
        return emit == pz5.a.f359186d ? emit : jz5.f0.f302826a;
    }

    public final java.lang.Object P6(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        java.lang.Object emit = ((kotlinx.coroutines.flow.q2) this.f406914d).emit(new se3.h(str), continuation);
        return emit == pz5.a.f359186d ? emit : jz5.f0.f302826a;
    }
}

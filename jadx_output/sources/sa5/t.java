package sa5;

/* loaded from: classes14.dex */
public final class t extends sa5.e {
    public t(float f17, float f18, sa5.v vVar, int i17, kotlin.jvm.internal.i iVar) {
        float f19 = (i17 & 1) != 0 ? 0.0f : f17;
        float f27 = (i17 & 2) != 0 ? 0.0f : f18;
        sa5.v scaleType = (i17 & 4) != 0 ? sa5.r.f405369a : vVar;
        kotlin.jvm.internal.o.g(scaleType, "scaleType");
        this.f405349b = new sa5.p(f19, f27, null, scaleType, 4, null);
    }
}

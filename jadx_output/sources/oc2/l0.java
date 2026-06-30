package oc2;

/* loaded from: classes8.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public oc2.w f344219a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f344220b;

    /* renamed from: c, reason: collision with root package name */
    public final int f344221c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f344222d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f344223e;

    public l0(oc2.w renderNodeType, boolean z17, int i17, boolean z18, boolean z19) {
        kotlin.jvm.internal.o.g(renderNodeType, "renderNodeType");
        this.f344219a = renderNodeType;
        this.f344220b = z17;
        this.f344221c = i17;
        this.f344222d = z18;
        if (z19) {
            return;
        }
        com.tencent.mars.xlog.Log.i("Finder.RenderContext", "[init] renderNodeType=" + this.f344219a + ",isClientThumbnail=" + this.f344220b + ",maxWidth=" + i17 + ",dropOverSizeRedDot=" + z18);
    }

    public static oc2.l0 a(oc2.l0 l0Var, boolean z17, int i17, boolean z18, int i18, java.lang.Object obj) {
        if ((i18 & 1) != 0) {
            z17 = l0Var.f344220b;
        }
        boolean z19 = z17;
        if ((i18 & 2) != 0) {
            i17 = l0Var.f344221c;
        }
        int i19 = i17;
        if ((i18 & 4) != 0) {
            z18 = l0Var.f344222d;
        }
        oc2.l0 l0Var2 = new oc2.l0(l0Var.f344219a, z19, i19, z18, true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[copy] origin[");
        sb6.append(l0Var.f344219a);
        sb6.append(',');
        sb6.append(l0Var.f344220b);
        sb6.append(',');
        sb6.append(l0Var.f344221c);
        sb6.append(',');
        sb6.append(l0Var.f344222d);
        sb6.append("] new[");
        sb6.append(l0Var2.f344219a);
        sb6.append(',');
        sb6.append(l0Var2.f344220b);
        sb6.append(',');
        int i27 = l0Var2.f344221c;
        sb6.append(i27);
        sb6.append(',');
        sb6.append(l0Var2.f344222d);
        sb6.append(']');
        java.lang.String sb7 = sb6.toString();
        if (com.tencent.mm.plugin.finder.extension.reddot.render.RenderView.H) {
            com.tencent.mm.sdk.platformtools.Log.c("Finder.RenderContext", sb7, new java.lang.Object[0]);
        } else {
            com.tencent.mars.xlog.Log.i("Finder.RenderContext", sb7);
        }
        if (i27 <= 0) {
            pm0.z.b(xy2.b.f458155b, "RenderContext_maxWidth_less_than_0", false, null, null, false, false, new oc2.k0(sb7), 60, null);
        }
        return l0Var2;
    }

    public java.lang.String toString() {
        return "renderNodeType=" + this.f344219a + ",isClientThumbnail=" + this.f344220b + ",maxWidth=" + this.f344221c + ",dropOverSizeRedDot=" + this.f344222d + ",isCalculate=" + this.f344223e;
    }
}

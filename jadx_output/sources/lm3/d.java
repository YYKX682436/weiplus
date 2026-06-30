package lm3;

/* loaded from: classes10.dex */
public final class d extends in5.r {

    /* renamed from: h, reason: collision with root package name */
    public static final lm3.a f319478h = new lm3.a(null);

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.mv.ui.uic.d3 f319479e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f319480f;

    /* renamed from: g, reason: collision with root package name */
    public final int f319481g;

    public d(com.tencent.mm.plugin.mv.ui.uic.e3 sizeResolver, com.tencent.mm.plugin.mv.ui.uic.d3 actionCallback) {
        int b17;
        kotlin.jvm.internal.o.g(sizeResolver, "sizeResolver");
        kotlin.jvm.internal.o.g(actionCallback, "actionCallback");
        this.f319479e = actionCallback;
        this.f319480f = "MicroMsg.MusicMVVideoItemConverter";
        com.tencent.mm.plugin.mv.ui.uic.h3 h3Var = (com.tencent.mm.plugin.mv.ui.uic.h3) sizeResolver;
        int i17 = h3Var.f151158a;
        if (i17 == 0) {
            i17 = i65.a.B(h3Var.f151159b.getActivity());
            b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 70);
        } else {
            b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 70);
        }
        this.f319481g = i17 - (b17 * 2);
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.c5c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (r13 == true) goto L8;
     */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r9, in5.c r10, int r11, int r12, boolean r13, java.util.List r14) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lm3.d.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.tencent.mm.R.id.k1n);
        linearLayout.getLayoutParams().width = this.f319481g;
        linearLayout.getLayoutParams().height = -1;
    }
}

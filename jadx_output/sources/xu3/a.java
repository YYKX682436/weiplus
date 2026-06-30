package xu3;

/* loaded from: classes5.dex */
public final class a extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.d3f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c9, code lost:
    
        if ((r8 != null && r8.getInteger(2) == 1) != false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0144  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r5, in5.c r6, int r7, int r8, boolean r9, java.util.List r10) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xu3.a.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        int i18 = recyclerView.getContext().getResources().getDisplayMetrics().widthPixels;
        android.view.View view = holder.itemView;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i18 / 3;
        view.setLayoutParams(layoutParams);
    }

    public final void n(in5.s0 s0Var, xu3.b bVar) {
        if (bVar.f457253f) {
            s0Var.w(com.tencent.mm.R.id.kda, 8);
            s0Var.w(com.tencent.mm.R.id.d07, 0);
            s0Var.w(com.tencent.mm.R.id.mjg, 8);
            s0Var.w(com.tencent.mm.R.id.a7t, 8);
            s0Var.w(com.tencent.mm.R.id.a6p, 8);
            s0Var.w(com.tencent.mm.R.id.f486040jz2, 8);
            s0Var.w(com.tencent.mm.R.id.g4t, 8);
            return;
        }
        if (!bVar.f457252e) {
            s0Var.w(com.tencent.mm.R.id.kda, 0);
            s0Var.w(com.tencent.mm.R.id.d07, 8);
            s0Var.w(com.tencent.mm.R.id.mjg, 8);
            s0Var.w(com.tencent.mm.R.id.a7t, 8);
            s0Var.w(com.tencent.mm.R.id.f486040jz2, 0);
            s0Var.w(com.tencent.mm.R.id.a6p, 8);
            s0Var.w(com.tencent.mm.R.id.g4t, 0);
            return;
        }
        s0Var.w(com.tencent.mm.R.id.kda, 8);
        s0Var.w(com.tencent.mm.R.id.d07, 8);
        s0Var.w(com.tencent.mm.R.id.mjg, 0);
        s0Var.w(com.tencent.mm.R.id.a7t, 0);
        s0Var.w(com.tencent.mm.R.id.f486040jz2, 8);
        s0Var.w(com.tencent.mm.R.id.a6p, 0);
        s0Var.w(com.tencent.mm.R.id.g4t, 8);
        com.tencent.mm.plugin.recordvideo.ui.editor.RoundCornerAudioWaveView roundCornerAudioWaveView = (com.tencent.mm.plugin.recordvideo.ui.editor.RoundCornerAudioWaveView) s0Var.p(com.tencent.mm.R.id.a7t);
        roundCornerAudioWaveView.setColor(i65.a.d(s0Var.f293121e, com.tencent.mm.R.color.BW_BG_100));
        roundCornerAudioWaveView.setShow(true);
    }
}

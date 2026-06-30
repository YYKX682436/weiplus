package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes10.dex */
public class a1 extends in5.r {

    /* renamed from: f, reason: collision with root package name */
    public static final int f121562f = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 80);

    /* renamed from: g, reason: collision with root package name */
    public static final int f121563g = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 108);

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.Map f121564h = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f121565e;

    public a1(boolean z17) {
        this.f121565e = z17;
    }

    @Override // in5.r
    public int e() {
        return this.f121565e ? com.tencent.mm.R.layout.f489224dv2 : com.tencent.mm.R.layout.c6r;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x011f, code lost:
    
        if (r3 != null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0153, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014e, code lost:
    
        r3 = r3.getHeadUrl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014c, code lost:
    
        if (r3 != null) goto L95;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016e  */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v29 */
    /* JADX WARN: Type inference failed for: r10v30 */
    /* JADX WARN: Type inference failed for: r10v31 */
    /* JADX WARN: Type inference failed for: r10v35 */
    /* JADX WARN: Type inference failed for: r10v36 */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v20 */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r24, in5.c r25, int r26, int r27, boolean r28, java.util.List r29) {
        /*
            Method dump skipped, instructions count: 1022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a1.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        android.widget.TextView textView;
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        if (!this.f121565e || (textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.rqu)) == null) {
            return;
        }
        com.tencent.mm.ui.fk.a(textView);
    }

    public final void n(int i17, android.widget.ImageView imageView, vp2.n nVar) {
        com.tencent.mars.xlog.Log.i("Finder.HeadLivingConvert", "#renderToBlurBg nickName=" + nVar.getFeedObject().getNickName() + " load with url onProcessBitmap: color=" + i17);
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.z0 z0Var = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.z0(i17 | (-16777216));
        android.graphics.drawable.PaintDrawable paintDrawable = new android.graphics.drawable.PaintDrawable();
        paintDrawable.setShape(new android.graphics.drawable.shapes.RectShape());
        paintDrawable.setShaderFactory(z0Var);
        imageView.setBackground(paintDrawable);
        imageView.setVisibility(0);
    }
}

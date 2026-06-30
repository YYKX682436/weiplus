package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes9.dex */
public class g0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout f145859e;

    public g0(com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout) {
        this.f145859e = envelopeAppBarLayout;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.bu_;
    }

    @Override // in5.r
    public void h(in5.s0 s0Var, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.luckymoney.story.h0 h0Var = (com.tencent.mm.plugin.luckymoney.story.h0) s0Var.f293125i;
        r45.re6 re6Var = h0Var.f145875d;
        int i19 = re6Var.f384774d;
        com.tencent.mm.plugin.luckymoney.story.EnvelopeAppBarLayout envelopeAppBarLayout = this.f145859e;
        if (i19 == 1) {
            android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.j09);
            imageView.setTag(com.tencent.mm.R.id.nwn, "1");
            imageView.setImportantForAccessibility(1);
            imageView.setImageBitmap(null);
            android.view.View p17 = s0Var.p(com.tencent.mm.R.id.j0a);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$StoryConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$StoryDetailConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$StoryConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$StoryDetailConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            s0Var.p(com.tencent.mm.R.id.j0a).setTag(com.tencent.mm.R.id.j1c, re6Var.f384775e);
            ((com.tencent.mm.plugin.luckymoney.model.w2) ((gb3.j) i95.n0.c(gb3.j.class))).nj(imageView, re6Var.f384775e, re6Var.f384776f, envelopeAppBarLayout.F1, envelopeAppBarLayout.f145780l1, envelopeAppBarLayout.f145793y0, false, 40, new com.tencent.mm.plugin.luckymoney.story.e0(this, s0Var, re6Var), h0Var.f145878g, 4, h0Var.f145879h);
            s0Var.w(com.tencent.mm.R.id.j0c, 8);
            return;
        }
        android.view.View p18 = s0Var.p(com.tencent.mm.R.id.j0a);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$StoryConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$StoryDetailConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$StoryConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$StoryDetailConvertData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        h0Var.a();
        new android.widget.FrameLayout.LayoutParams(h0Var.f145876e, h0Var.f145877f).gravity = 17;
        s0Var.w(com.tencent.mm.R.id.j7k, 4);
        s0Var.w(com.tencent.mm.R.id.j0d, 8);
        android.widget.ImageView imageView2 = (android.widget.ImageView) s0Var.p(com.tencent.mm.R.id.j09);
        imageView2.setTag(com.tencent.mm.R.id.nwn, "2");
        imageView2.setImportantForAccessibility(2);
        imageView2.setImageBitmap(null);
        ((com.tencent.mm.plugin.luckymoney.model.w2) ((gb3.j) i95.n0.c(gb3.j.class))).nj(imageView2, re6Var.f384779i, re6Var.f384780m, envelopeAppBarLayout.F1, envelopeAppBarLayout.f145780l1, envelopeAppBarLayout.f145793y0, false, 0, null, h0Var.f145878g, 5, h0Var.f145879h);
        s0Var.w(com.tencent.mm.R.id.j0c, 0);
        java.lang.String a17 = com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager.a(re6Var.f384775e);
        java.lang.String str = "MMVideo_" + re6Var.f384775e.hashCode();
        boolean z18 = com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager.b().getInt(str, 0) == 1;
        if (com.tencent.mm.vfs.w6.j(a17) || z18) {
            return;
        }
        if (com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager.c(h0Var.f145878g, h0Var.f145880i)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeAppBarLayout", "[static luckymoney resource] has local video");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.EnvelopeAppBarLayout", "preload video");
            com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryVideoManager.g(str, a17, re6Var.f384775e, re6Var.f384776f, true, null, new com.tencent.mm.plugin.luckymoney.story.f0(this));
        }
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 s0Var, int i17) {
    }
}

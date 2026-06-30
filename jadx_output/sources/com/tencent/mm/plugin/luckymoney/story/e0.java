package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes3.dex */
public class e0 implements gb3.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f145847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.re6 f145848b;

    public e0(com.tencent.mm.plugin.luckymoney.story.g0 g0Var, in5.s0 s0Var, r45.re6 re6Var) {
        this.f145847a = s0Var;
        this.f145848b = re6Var;
    }

    @Override // gb3.i
    public void onComplete(boolean z17) {
        if (z17) {
            in5.s0 s0Var = this.f145847a;
            java.lang.String str = (java.lang.String) s0Var.p(com.tencent.mm.R.id.j0a).getTag(com.tencent.mm.R.id.j1c);
            if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !str.equals(this.f145848b.f384775e)) {
                return;
            }
            android.view.View p17 = s0Var.p(com.tencent.mm.R.id.j0a);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$StoryConvert$1", "onComplete", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$StoryConvert$1", "onComplete", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}

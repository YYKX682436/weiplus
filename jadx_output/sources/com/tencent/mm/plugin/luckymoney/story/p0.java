package com.tencent.mm.plugin.luckymoney.story;

/* loaded from: classes4.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.story.q0 f145900d;

    public p0(com.tencent.mm.plugin.luckymoney.story.q0 q0Var) {
        this.f145900d = q0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.luckymoney.story.q0 q0Var = this.f145900d;
        android.widget.ProgressBar progressBar = q0Var.f145902d.f145839s;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        android.view.View findViewById = q0Var.f145902d.f145833m.findViewById(com.tencent.mm.R.id.f487563p06);
        if (findViewById != null) {
            android.view.View view = (android.view.View) findViewById.getParent();
            view.setFocusable(false);
            ((android.view.View) view.getParent()).setFocusable(false);
        }
        if (q0Var.f145902d.f145833m.getParent() != null) {
            ((android.view.ViewGroup) q0Var.f145902d.f145833m.getParent()).bringToFront();
        }
        com.tencent.mm.plugin.luckymoney.story.b1 b1Var = q0Var.f145902d;
        if (b1Var.f145826f || !q0Var.f145903e.f145805g) {
            return;
        }
        b1Var.f145837q.setVisibility(0);
    }
}

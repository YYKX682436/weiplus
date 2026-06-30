package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.h4 f151473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f151474e;

    public u3(com.tencent.mm.plugin.mv.ui.uic.h4 h4Var, int i17, int i18) {
        this.f151473d = h4Var;
        this.f151474e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.mv.ui.uic.h4 h4Var = this.f151473d;
        androidx.recyclerview.widget.k3 p07 = h4Var.S6().p0(h4Var.f151169p);
        if (p07 == null) {
            return;
        }
        ((android.widget.TextView) p07.itemView.findViewById(com.tencent.mm.R.id.k1k)).setText(((fm3.q) h4Var.f151161e.get(h4Var.f151169p)).c(this.f151474e));
    }
}

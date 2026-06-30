package com.tencent.mm.plugin.mv.ui.shake;

/* loaded from: classes11.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f150954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew f150955e;

    public n(com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew musicMainUINew) {
        this.f150955e = musicMainUINew;
        this.f150954d = musicMainUINew.f150904g.intValue();
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f150954d + 100;
        this.f150954d = i17;
        com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew musicMainUINew = this.f150955e;
        if (i17 >= musicMainUINew.f150918x) {
            wu5.c cVar = musicMainUINew.A;
            if (cVar != null) {
                cVar.cancel(true);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.mv.ui.shake.a0 a0Var = musicMainUINew.f150903f;
        if (a0Var != null) {
            pm0.v.X(new com.tencent.mm.plugin.mv.ui.shake.x(a0Var, i17));
        }
    }
}

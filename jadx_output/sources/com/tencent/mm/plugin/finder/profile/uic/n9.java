package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class n9 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.z9 f124004a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f124005b;

    public n9(com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var, com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        this.f124004a = z9Var;
        this.f124005b = obVar;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = this.f124004a;
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = z9Var.f105329c;
            r45.f03 f03Var = z9Var.f105328b;
            if (jbVar == null || f03Var == null) {
                return;
            }
            com.tencent.mm.plugin.finder.report.x2.i(com.tencent.mm.plugin.finder.report.x2.f125429a, "3", jbVar, f03Var, 1, this.f124005b.getContextObj(), 0, null, 0, 0, 480, null);
        }
    }
}

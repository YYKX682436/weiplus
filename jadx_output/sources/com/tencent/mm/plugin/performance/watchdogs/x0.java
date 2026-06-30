package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes12.dex */
public class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f153151a;

    public x0(java.util.Map map) {
        this.f153151a = map;
    }

    public void a(com.tencent.mm.plugin.performance.watchdogs.a1 a1Var) {
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("-?[0-9]\\d*");
        com.tencent.mm.plugin.performance.watchdogs.a1 a1Var2 = (com.tencent.mm.plugin.performance.watchdogs.a1) this.f153151a.get(java.lang.Long.valueOf(a1Var.f153005b));
        if (a1Var2 == null) {
            a1Var.f153004a = compile.matcher(a1Var.f153004a).replaceAll("?");
            return;
        }
        a1Var.f153004a = compile.matcher(a1Var2.f153004a).replaceAll("?") + "J";
        a1Var.f153006c = a1Var2.f153006c;
    }
}

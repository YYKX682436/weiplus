package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class xl implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f130031a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lb2.j f130032b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f130033c;

    public xl(java.util.HashSet hashSet, lb2.j jVar, in5.s0 s0Var) {
        this.f130031a = hashSet;
        this.f130032b = jVar;
        this.f130033c = s0Var;
    }

    @Override // db5.d1
    public final void a(int i17, int i18) {
        in5.s0 s0Var = this.f130033c;
        lb2.j jVar = this.f130032b;
        java.util.HashSet hashSet = this.f130031a;
        if (i18 == -1) {
            hashSet.remove(jVar.f317749d);
            com.tencent.mm.sdk.platformtools.o4.R("finder_debug_settings_fav").putStringSet("fav_1", hashSet);
            db5.t7.makeText(s0Var.f293121e, "已取消收藏", 0).show();
        } else {
            if (i18 != 1) {
                return;
            }
            hashSet.add(jVar.f317749d);
            com.tencent.mm.sdk.platformtools.o4.R("finder_debug_settings_fav").putStringSet("fav_1", hashSet);
            db5.t7.makeText(s0Var.f293121e, "已收藏", 0).show();
        }
    }
}

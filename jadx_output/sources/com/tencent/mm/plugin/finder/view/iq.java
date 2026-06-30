package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class iq {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f132402a;

    /* renamed from: b, reason: collision with root package name */
    public final dk2.zf f132403b;

    /* renamed from: c, reason: collision with root package name */
    public final db5.g4 f132404c;

    public iq(com.tencent.mm.plugin.finder.view.hq roleType, boolean z17, gk2.e buContext, dk2.zf msg, db5.g4 menu) {
        kotlin.jvm.internal.o.g(roleType, "roleType");
        kotlin.jvm.internal.o.g(buContext, "buContext");
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(menu, "menu");
        this.f132402a = z17;
        this.f132403b = msg;
        this.f132404c = menu;
    }

    public final void a() {
        if (this.f132402a && !this.f132403b.l() && this.f132404c.findItem(172) == null) {
            this.f132404c.i(172, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.oso), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a18), com.tencent.mm.R.raw.dot_3_filled, com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.a18));
        }
    }
}

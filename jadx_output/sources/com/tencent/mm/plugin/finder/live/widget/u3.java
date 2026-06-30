package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class u3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f119932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.b4 f119933e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f119934f;

    public u3(kotlin.jvm.internal.c0 c0Var, com.tencent.mm.plugin.finder.live.widget.b4 b4Var, android.widget.TextView textView) {
        this.f119932d = c0Var;
        this.f119933e = b4Var;
        this.f119934f = textView;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            com.tencent.mm.plugin.finder.live.widget.w3.a(this.f119932d, this.f119933e, this.f119934f);
        }
    }
}

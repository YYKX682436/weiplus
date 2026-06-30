package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class z4 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.d5 f117570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.r5 f117571e;

    public z4(com.tencent.mm.plugin.finder.live.viewmodel.d5 d5Var, com.tencent.mm.plugin.finder.live.viewmodel.r5 r5Var) {
        this.f117570d = d5Var;
        this.f117571e = r5Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f117570d.f117032i = false;
        this.f117571e.f117363r = null;
    }
}

package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class v8 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f124291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f124292e;

    public v8(com.tencent.mm.plugin.finder.profile.uic.ob obVar, ya2.b2 b2Var) {
        this.f124291d = obVar;
        this.f124292e = b2Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f124291d;
        android.widget.TextView f76 = obVar.f7();
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = obVar.f124064i.getContext();
        java.lang.String z07 = this.f124292e.z0();
        ((ke0.e) xVar).getClass();
        f76.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(context, z07));
    }
}

package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class ol extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.pl f132796d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol(com.tencent.mm.plugin.finder.view.pl plVar) {
        super(0);
        this.f132796d = plVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.view.pl plVar = this.f132796d;
        com.tencent.mm.ui.widget.dialog.a4 a4Var = new com.tencent.mm.ui.widget.dialog.a4(plVar.f132848a, com.tencent.mm.R.style.f494073xn);
        android.content.Context context = plVar.f132848a;
        a4Var.setContentView(plVar.f132850c, new android.widget.FrameLayout.LayoutParams(context.getResources().getConfiguration().orientation == 2 ? com.tencent.mm.ui.bh.a(context).f197136b : com.tencent.mm.ui.bh.a(context).f197135a, -2));
        return a4Var;
    }
}

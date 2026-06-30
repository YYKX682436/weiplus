package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes.dex */
public final class h40 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.f50 f134578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f134579e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f134580f;

    public h40(com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var, android.widget.TextView textView, android.widget.ImageView imageView) {
        this.f134578d = f50Var;
        this.f134579e = textView;
        this.f134580f = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.viewmodel.component.f50 f50Var = this.f134578d;
        if (f50Var.findViewById(com.tencent.mm.R.id.g28) == null) {
            return;
        }
        android.widget.TextView finderNickname = this.f134579e;
        kotlin.jvm.internal.o.f(finderNickname, "$finderNickname");
        float measuredWidth = ((pm0.v.t(r0)[0] - pm0.v.t(finderNickname)[0]) - this.f134580f.getMeasuredWidth()) - f50Var.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
        if (finderNickname.getMeasuredWidth() > measuredWidth) {
            android.view.ViewGroup.LayoutParams layoutParams = finderNickname.getLayoutParams();
            layoutParams.width = (int) measuredWidth;
            finderNickname.setLayoutParams(layoutParams);
        }
    }
}

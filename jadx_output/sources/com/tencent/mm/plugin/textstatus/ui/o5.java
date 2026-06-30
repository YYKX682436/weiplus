package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class o5 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDetailActivity f174144d;

    public o5(com.tencent.mm.plugin.textstatus.ui.TextStatusDetailActivity textStatusDetailActivity) {
        this.f174144d = textStatusDetailActivity;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        com.tencent.mm.plugin.textstatus.ui.TextStatusDetailActivity textStatusDetailActivity = this.f174144d;
        g4Var.d(com.tencent.mm.R.id.jgi, textStatusDetailActivity.getResources().getColor(com.tencent.mm.R.color.f478532ac), textStatusDetailActivity.getString(com.tencent.mm.R.string.guu));
    }
}

package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class p5 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDetailActivity f174168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f174169e;

    public p5(com.tencent.mm.plugin.textstatus.ui.TextStatusDetailActivity textStatusDetailActivity, java.lang.String str) {
        this.f174168d = textStatusDetailActivity;
        this.f174169e = str;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == com.tencent.mm.R.id.jgi) {
            com.tencent.mm.plugin.textstatus.ui.TextStatusDetailActivity textStatusDetailActivity = this.f174168d;
            textStatusDetailActivity.f173512p = db5.e1.Q(textStatusDetailActivity.getContext(), textStatusDetailActivity.getResources().getString(com.tencent.mm.R.string.f493362jv5), textStatusDetailActivity.getResources().getString(com.tencent.mm.R.string.f493362jv5), false, false, null);
            ej4.a aVar = new ej4.a(this.f174169e, 2);
            gm0.j1.d().a(5967, textStatusDetailActivity);
            gm0.j1.d().g(aVar);
            qj4.s sVar = qj4.s.f363958a;
            androidx.appcompat.app.AppCompatActivity context = textStatusDetailActivity.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            qj4.s.m(sVar, context, 43L, null, null, 0L, 0L, 0L, 0L, null, null, 0L, 2044, null);
        }
    }
}

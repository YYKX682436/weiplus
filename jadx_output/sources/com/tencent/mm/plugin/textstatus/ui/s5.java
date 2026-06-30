package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class s5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusDetailActivity f174282d;

    public s5(com.tencent.mm.plugin.textstatus.ui.TextStatusDetailActivity textStatusDetailActivity) {
        this.f174282d = textStatusDetailActivity;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.textstatus.ui.TextStatusDetailActivity textStatusDetailActivity = this.f174282d;
        androidx.appcompat.app.AppCompatActivity context = textStatusDetailActivity.getContext();
        android.view.LayoutInflater.from(context);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) context, 1, false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        new java.util.ArrayList();
        com.tencent.mm.plugin.textstatus.ui.o5 o5Var = new com.tencent.mm.plugin.textstatus.ui.o5(textStatusDetailActivity);
        com.tencent.mm.plugin.textstatus.ui.p5 p5Var = new com.tencent.mm.plugin.textstatus.ui.p5(textStatusDetailActivity, ((mj4.k) textStatusDetailActivity.U6()).l());
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            db5.h4 h4Var = (db5.h4) ((android.view.MenuItem) it6.next());
            h4Var.f228381y = null;
            h4Var.f228382z = null;
        }
        arrayList.clear();
        db5.g4 g4Var = new db5.g4(context);
        o5Var.onCreateMMMenu(g4Var);
        if (g4Var.z()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
        } else {
            k0Var.f211872n = o5Var;
            k0Var.f211881s = p5Var;
            k0Var.f211854d = null;
            k0Var.G = null;
            k0Var.v();
        }
        return true;
    }
}

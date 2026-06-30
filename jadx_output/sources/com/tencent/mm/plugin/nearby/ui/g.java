package com.tencent.mm.plugin.nearby.ui;

/* loaded from: classes11.dex */
public class g implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.nearby.ui.l f152139d;

    public g(com.tencent.mm.plugin.nearby.ui.l lVar) {
        this.f152139d = lVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        an3.f fVar = new an3.f(2, 0.0f, 0.0f, 0, 0, "", "");
        com.tencent.mm.plugin.nearby.ui.l lVar = this.f152139d;
        lVar.f152160h = fVar;
        gm0.j1.d().g(lVar.f152160h);
        android.content.Context context = lVar.f152157e;
        lVar.f152159g = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), lVar.f152157e.getString(com.tencent.mm.R.string.h5z), true, true, new com.tencent.mm.plugin.nearby.ui.f(this));
    }
}

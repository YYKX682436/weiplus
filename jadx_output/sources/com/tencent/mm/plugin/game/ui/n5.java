package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class n5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f141676d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f141677e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.game.model.b f141678f;

    /* renamed from: g, reason: collision with root package name */
    public int f141679g;

    public n5(android.content.Context context, java.lang.String str) {
        this.f141676d = context;
        this.f141677e = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/ui/GamePreemptiveCliclListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (!(view.getTag() instanceof com.tencent.mm.plugin.game.model.b)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GamePreemptiveCliclListener", "No GameAppInfo");
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GamePreemptiveCliclListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f141678f = (com.tencent.mm.plugin.game.model.b) view.getTag();
        com.tencent.mars.xlog.Log.i("MicroMsg.GamePreemptiveCliclListener", "Clicked appid = " + this.f141678f.field_appId);
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = this.f141678f.field_appId;
        ((kt.c) i0Var).getClass();
        android.content.Context context = this.f141676d;
        if (!com.tencent.mm.pluginsdk.model.app.w.r(context, str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.GamePreemptiveCliclListener", "get preemptive url:[%s]", this.f141677e);
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.f141677e)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GamePreemptiveCliclListener", "null or nill preemptive url");
            } else {
                r53.f.u(context, this.f141677e);
                android.content.Context context2 = this.f141676d;
                com.tencent.mm.plugin.game.model.b bVar = this.f141678f;
                com.tencent.mm.game.report.l.g(context2, bVar.f140212o2, bVar.f140213p2, bVar.f140214q2, 11, bVar.field_appId, this.f141679g, bVar.f140210m2, bVar.f140221x2);
            }
            yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GamePreemptiveCliclListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.plugin.game.model.b bVar2 = this.f141678f;
        java.lang.String str2 = bVar2.field_appId;
        java.lang.String str3 = bVar2.field_packageName;
        java.lang.String str4 = bVar2.field_openId;
        com.tencent.mm.plugin.game.model.f.j(context, str2);
        android.content.Context context3 = this.f141676d;
        com.tencent.mm.plugin.game.model.b bVar3 = this.f141678f;
        com.tencent.mm.game.report.l.g(context3, bVar3.f140212o2, bVar3.f140213p2, bVar3.f140214q2, 3, bVar3.field_appId, this.f141679g, bVar3.f140210m2, bVar3.f140221x2);
        yj0.a.h(this, "com/tencent/mm/plugin/game/ui/GamePreemptiveCliclListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

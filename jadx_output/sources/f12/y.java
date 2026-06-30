package f12;

/* loaded from: classes4.dex */
public final class y implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity f258676a;

    public y(com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity) {
        this.f258676a = springLuckyEggActivity;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            b12.k kVar = b12.k.f17060a;
            com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity = this.f258676a;
            int i17 = com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity.f97437o;
            uq.n nVar = (uq.n) springLuckyEggActivity.X6().f258627q.getValue();
            kVar.d(23, nVar != null ? nVar.f430173u : 0L);
            com.tencent.mm.plugin.eggspring.ui.SpringLuckyEggActivity springLuckyEggActivity2 = this.f258676a;
            db5.t7.h(springLuckyEggActivity2, springLuckyEggActivity2.getString(com.tencent.mm.R.string.bsw));
            this.f258676a.finish();
            g12.a aVar = g12.a.f267568a;
            java.lang.String str2 = (java.lang.String) ((jz5.n) this.f258676a.f97444m).getValue();
            if (str2 == null) {
                return;
            }
            java.util.LinkedList linkedList = g12.a.f267569b;
            synchronized (linkedList) {
                linkedList.add(str2);
            }
            aVar.a();
        }
    }
}

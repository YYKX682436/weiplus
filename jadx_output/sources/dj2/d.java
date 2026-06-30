package dj2;

/* loaded from: classes10.dex */
public final class d extends dj2.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context, pluginAbility, service);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // hn5.c
    public void f() {
        super.f();
        this.f232897d.J();
    }

    @Override // dj2.b, hn5.c
    public void g(int i17, android.view.View view) {
        int i18;
        kotlin.jvm.internal.o.g(view, "view");
        super.g(i17, view);
        if (view instanceof sj2.i) {
            sj2.i iVar = (sj2.i) view;
            xh2.a b17 = b(i17);
            boolean z17 = this.f232901h;
            int width = this.f232900g.width();
            int i19 = 2;
            java.util.LinkedList<xh2.a> linkedList = this.f232899f;
            if (width > 0 && this.f232900g.height() > 0) {
                for (xh2.a aVar : linkedList) {
                    if (aVar.f454521b.f454555g == 2) {
                        int width2 = this.f232900g.width();
                        xh2.i iVar2 = aVar.f454521b;
                        float f17 = width2;
                        float f18 = iVar2.f282609a * f17;
                        float f19 = iVar2.f282611c * f17;
                        float f27 = (f17 - f18) - f19;
                        com.tencent.mars.xlog.Log.i("MicFocusRatioAdapter", "getRightOffestSize margin: " + f27 + " windowWidth:" + f19 + " left: " + f18);
                        i18 = (int) (f19 + f27);
                        break;
                    }
                }
            }
            i18 = 0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (this.f232900g.width() > 0 && this.f232900g.height() > 0) {
                int width3 = this.f232900g.width();
                int height = this.f232900g.height();
                java.util.Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    xh2.i iVar3 = ((xh2.a) it.next()).f454521b;
                    if (iVar3.f454555g == i19) {
                        float f28 = width3;
                        float f29 = iVar3.f282609a * f28;
                        float f37 = height;
                        float f38 = iVar3.f282610b * f37;
                        arrayList.add(new android.graphics.RectF(f29, f38, (iVar3.f282611c * f28) + f29, (iVar3.f282612d * f37) + f38));
                        i19 = 2;
                    }
                }
            }
            iVar.setBindMicData(b17);
            iVar.f408386J = z17;
            iVar.K = i18;
            iVar.setBindLinkMicUser(b17.f454520a);
            iVar.L = arrayList;
            iVar.M = b17.f454521b.f454555g == 1;
            iVar.setCurWidgetMode(pm2.a.f356855h);
            iVar.Y();
            iVar.b0(iVar.M);
        }
    }

    @Override // dj2.b
    public android.view.View h(xh2.a data, int i17) {
        kotlin.jvm.internal.o.g(data, "data");
        lj2.x0 x0Var = this.f232897d;
        lj2.v0 v0Var = this.f232896c;
        android.content.Context context = this.f232895b;
        return i17 != 1 ? i17 != 2 ? (i17 == 3 || i17 == 7) ? new sj2.f(context, v0Var, x0Var) : new android.view.View(context) : new sj2.l(context, v0Var, x0Var) : new sj2.h(context, v0Var, x0Var);
    }

    @Override // dj2.b
    public java.lang.String l() {
        return "MicFocusRatioAdapter";
    }
}

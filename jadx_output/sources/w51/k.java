package w51;

/* loaded from: classes15.dex */
public class k implements q51.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w51.n f442985a;

    public k(w51.n nVar) {
        this.f442985a = nVar;
    }

    @Override // q51.b
    public void onItemSelected(int i17) {
        int i18;
        w51.n nVar = this.f442985a;
        int i19 = nVar.f442999k + i17;
        if (nVar.f443011w) {
            i19--;
        }
        int i27 = i19;
        int intValue = ((java.lang.Integer) nVar.f442991c.getAdapter().getItem(nVar.f442991c.getCurrentItem())).intValue();
        nVar.f443009u = i27;
        if (nVar.f443011w && i17 == -1) {
            nVar.f442991c.e(0);
            nVar.f442992d.e(0);
            nVar.f442991c.invalidate();
            nVar.f442992d.invalidate();
        } else {
            if (nVar.B) {
                nVar.f442991c.e(b3.l.getColor(nVar.A, com.tencent.mm.R.color.BW_0_Alpha_0_9));
                nVar.f442992d.e(b3.l.getColor(nVar.A, com.tencent.mm.R.color.BW_0_Alpha_0_9));
                nVar.f442991c.invalidate();
                nVar.f442992d.invalidate();
            }
            int currentItem = nVar.f442991c.getCurrentItem();
            int i28 = nVar.f442999k;
            int i29 = nVar.f443000l;
            if (i28 == i29) {
                nVar.f442991c.setAdapter(new o51.d(nVar.f443001m, nVar.f443002n, new o51.b(nVar.A)));
                if (currentItem > nVar.f442991c.getAdapter().getItemsCount() - 1) {
                    currentItem = nVar.f442991c.getAdapter().getItemsCount() - 1;
                    nVar.f442991c.setCurrentItem(currentItem);
                }
                w51.n nVar2 = this.f442985a;
                int i37 = nVar2.f443001m;
                int i38 = currentItem + i37;
                int i39 = nVar2.f443002n;
                if (i37 == i39) {
                    w51.n.a(nVar2, i27, i38, nVar2.f443003o, nVar2.f443004p, nVar2.f443013y, nVar2.f443014z);
                } else if (i38 == i37) {
                    w51.n.a(nVar2, i27, i38, nVar2.f443003o, 31, nVar2.f443013y, nVar2.f443014z);
                } else if (i38 == i39) {
                    w51.n.a(nVar2, i27, i38, 1, nVar2.f443004p, nVar2.f443013y, nVar2.f443014z);
                } else {
                    w51.n.a(nVar2, i27, i38, 1, 31, nVar2.f443013y, nVar2.f443014z);
                }
            } else if (i27 == i28) {
                nVar.f442991c.setAdapter(new o51.d(nVar.f443001m, 12, new o51.b(nVar.A)));
                int i47 = nVar.f443001m;
                if (intValue <= i47) {
                    nVar.f442991c.setCurrentItem(0);
                    i18 = nVar.f443001m;
                } else {
                    nVar.f442991c.setCurrentItem(intValue - i47);
                    i18 = intValue;
                }
                w51.n nVar3 = this.f442985a;
                if (i18 == nVar3.f443001m) {
                    w51.n.a(nVar3, i27, i18, nVar3.f443003o, 31, nVar3.f443013y, nVar3.f443014z);
                } else {
                    w51.n.a(nVar3, i27, i18, 1, 31, nVar3.f443013y, nVar3.f443014z);
                }
            } else if (i27 == i29) {
                nVar.f442991c.setAdapter(new o51.d(1, nVar.f443002n, new o51.b(nVar.A)));
                if (currentItem > nVar.f442991c.getAdapter().getItemsCount() - 1) {
                    currentItem = nVar.f442991c.getAdapter().getItemsCount() - 1;
                    nVar.f442991c.setCurrentItem(currentItem);
                }
                int i48 = nVar.f443002n;
                if (intValue >= i48) {
                    nVar.f442991c.setCurrentItem(i48 - 1);
                } else {
                    nVar.f442991c.setCurrentItem(intValue - 1);
                }
                int i49 = currentItem + 1;
                w51.n nVar4 = this.f442985a;
                if (i49 == nVar4.f443002n) {
                    w51.n.a(nVar4, i27, i49, 1, nVar4.f443004p, nVar4.f443013y, nVar4.f443014z);
                } else {
                    w51.n.a(nVar4, i27, i49, 1, 31, nVar4.f443013y, nVar4.f443014z);
                }
            } else {
                nVar.f442991c.setAdapter(new o51.d(1, 12, new o51.b(nVar.A)));
                nVar.f442991c.setCurrentItem(intValue - 1);
                w51.n nVar5 = this.f442985a;
                w51.n.a(nVar5, i27, nVar5.f442991c.getCurrentItem() + 1, 1, 31, nVar.f443013y, nVar.f443014z);
            }
        }
        v51.a aVar = nVar.f443012x;
        if (aVar != null) {
            ((w51.f) aVar).a();
        }
    }
}

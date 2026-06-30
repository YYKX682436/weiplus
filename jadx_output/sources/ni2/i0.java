package ni2;

/* loaded from: classes10.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.k0 f337328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f337329e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ni2.k0 k0Var, android.content.Context context) {
        super(2);
        this.f337328d = k0Var;
        this.f337329e = context;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        android.widget.TextView textView;
        km2.q qVar;
        km2.q qVar2;
        xh2.i iVar;
        xh2.i iVar2;
        xh2.i iVar3;
        int intValue = ((java.lang.Number) obj).intValue();
        ij2.c item = (ij2.c) obj2;
        kotlin.jvm.internal.o.g(item, "item");
        ni2.k0 k0Var = this.f337328d;
        java.lang.Object obj3 = item;
        for (java.util.Map.Entry entry : k0Var.f337352m.entrySet()) {
            if (((java.lang.Number) entry.getKey()).intValue() != intValue) {
                if (((ij2.c) entry.getValue()).f291693c == ij2.b.f291689e) {
                    obj3 = entry.getValue();
                } else {
                    ((ij2.c) entry.getValue()).b(false);
                }
            }
        }
        boolean b17 = kotlin.jvm.internal.o.b(obj3, item);
        java.util.HashMap hashMap = k0Var.f337353n;
        if (!b17) {
            ij2.c cVar = (ij2.c) obj3;
            xh2.a aVar = cVar.f291696f;
            int i17 = (aVar == null || (iVar3 = aVar.f454521b) == null) ? 0 : iVar3.f454553e;
            if (aVar != null) {
                xh2.a aVar2 = item.f291696f;
                hashMap.put(java.lang.Integer.valueOf((aVar2 == null || (iVar2 = aVar2.f454521b) == null) ? 0 : iVar2.f454553e), aVar);
                xh2.i iVar4 = aVar.f454521b;
                xh2.a aVar3 = item.f291696f;
                iVar4.f454553e = (aVar3 == null || (iVar = aVar3.f454521b) == null) ? 0 : iVar.f454553e;
            }
            xh2.a aVar4 = item.f291696f;
            if (aVar4 != null) {
                hashMap.put(java.lang.Integer.valueOf(i17), aVar4);
                aVar4.f454521b.f454553e = i17;
            }
            xh2.a aVar5 = item.f291696f;
            item.a(cVar.f291696f);
            cVar.a(aVar5);
            item.b(false);
            cVar.b(false);
        }
        java.lang.String str = "";
        if (item.f291693c == ij2.b.f291689e) {
            xh2.a aVar6 = item.f291696f;
            if (((aVar6 == null || (qVar2 = aVar6.f454520a) == null) ? "" : zl2.r4.D0(zl2.r4.f473950a, qVar2.f309172c, qVar2.f309173d, false, 4, null)).length() > 0) {
                android.content.Context context = this.f337329e;
                android.content.res.Resources resources = context.getResources();
                xh2.a aVar7 = item.f291696f;
                if (aVar7 != null && (qVar = aVar7.f454520a) != null) {
                    str = zl2.r4.D0(zl2.r4.f473950a, qVar.f309172c, qVar.f309173d, false, 4, null);
                }
                java.lang.String string = resources.getString(com.tencent.mm.R.string.m0y, str);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.m0z);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                k0Var.x(string, string2);
            } else {
                k0Var.x("", "");
            }
        } else {
            k0Var.x("", "");
        }
        java.util.Set entrySet = k0Var.f337354o.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        java.util.Iterator it = entrySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
            xh2.a aVar8 = (xh2.a) hashMap.get(entry2.getKey());
            if (!kotlin.jvm.internal.o.b(aVar8 != null ? aVar8.b() : null, ((xh2.a) entry2.getValue()).b())) {
                z17 = true;
                break;
            }
        }
        android.view.View view = k0Var.f118383f;
        if (z17) {
            textView = view instanceof android.widget.TextView ? (android.widget.TextView) view : null;
            if (textView != null) {
                textView.setEnabled(true);
                textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.aaz));
            }
        } else {
            textView = view instanceof android.widget.TextView ? (android.widget.TextView) view : null;
            if (textView != null) {
                textView.setEnabled(false);
                textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
            }
        }
        return jz5.f0.f302826a;
    }
}

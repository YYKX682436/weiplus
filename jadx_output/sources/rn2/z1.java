package rn2;

/* loaded from: classes15.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rn2.t2 f397934d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(rn2.t2 t2Var) {
        super(0);
        this.f397934d = t2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.LinkedList] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1, types: [rn2.l0] */
    @Override // yz5.a
    public java.lang.Object invoke() {
        rn2.w wVar;
        ?? linkedList;
        r45.gz1 gz1Var;
        android.text.Editable text;
        rn2.t2 t2Var = this.f397934d;
        rn2.f fVar = t2Var.f397854f;
        if (fVar != null) {
            android.widget.EditText editText = t2Var.C;
            rn2.c1 c1Var = (rn2.c1) fVar;
            c1Var.f397671n = com.tencent.mm.sdk.platformtools.t8.D1((editText == null || (text = editText.getText()) == null) ? null : text.toString(), 0);
            c1Var.g(c1Var.f397668h, true);
        }
        rn2.f fVar2 = t2Var.f397854f;
        if (((fVar2 == null || (gz1Var = ((rn2.c1) fVar2).f397683z) == null || gz1Var.getInteger(0) != 2) ? false : true) && (wVar = t2Var.W) != null) {
            r45.gz1 gz1Var2 = fVar2 != null ? ((rn2.c1) fVar2).f397683z : null;
            java.util.LinkedList m17 = fVar2 != null ? ((rn2.c1) fVar2).m() : null;
            java.lang.String str = wVar.f397903b;
            if (gz1Var2 == null) {
                com.tencent.mars.xlog.Log.e(str, "updateWinnerCnt but prizeMethod is null");
            } else if (gz1Var2.getInteger(0) != 2) {
                com.tencent.mars.xlog.Log.e(str, "updateWinnerCnt but prize_type:" + gz1Var2.getInteger(0) + " is error!");
            } else {
                if (m17 != null) {
                    linkedList = new java.util.ArrayList();
                    for (java.lang.Object obj : m17) {
                        if (((rn2.y2) obj).f397926a) {
                            linkedList.add(obj);
                        }
                    }
                } else {
                    linkedList = new java.util.LinkedList();
                }
                rn2.t2 t2Var2 = wVar.f397902a;
                rn2.f fVar3 = t2Var2.f397854f;
                int i17 = fVar3 != null ? ((rn2.c1) fVar3).f397671n : 0;
                ?? r86 = rn2.l0.f397792a;
                r45.vd4 vd4Var = (r45.vd4) gz1Var2.getCustom(2);
                int c17 = r86.c(vd4Var != null ? java.lang.Integer.valueOf(vd4Var.getInteger(0)) : null, i17, linkedList);
                java.util.Iterator it = linkedList.iterator();
                int i18 = 0;
                while (it.hasNext()) {
                    i18 += ((rn2.y2) it.next()).f397928c.getInteger(1);
                }
                android.widget.TextView textView = t2Var2.f397877y1;
                if (textView != null) {
                    textView.setText(java.lang.String.valueOf(c17));
                }
                r45.vd4 vd4Var2 = (r45.vd4) gz1Var2.getCustom(2);
                if (vd4Var2 != null && vd4Var2.getInteger(0) == 1) {
                    boolean z17 = i18 < i17;
                    java.lang.String string = t2Var2.f397853e.getResources().getString(com.tencent.mm.R.string.liz);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    t2Var2.v(z17, string);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}

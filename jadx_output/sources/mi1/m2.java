package mi1;

/* loaded from: classes7.dex */
public class m2 extends java.util.LinkedList {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi1.t2 f326630d;

    public m2(mi1.t2 t2Var) {
        this.f326630d = t2Var;
    }

    @Override // java.util.LinkedList, java.util.AbstractCollection, java.util.Collection, java.util.List, java.util.Deque
    public boolean remove(java.lang.Object obj) {
        boolean remove = super.remove(obj);
        com.tencent.mars.xlog.Log.e("MicroMsg.StackedBlinkingCapsuleBarPart", "resetBlinkState");
        mi1.t2 t2Var = this.f326630d;
        mi1.n2 n2Var = (mi1.n2) t2Var.f326693d.peekFirst();
        if (n2Var == null || n2Var.f326640m != 1) {
            java.lang.CharSequence charSequence = n2Var == null ? null : n2Var.f326635e;
            mi1.g gVar = (mi1.g) t2Var;
            boolean p17 = gVar.p();
            mi1.w0 w0Var = gVar.f326556f;
            if (!p17) {
                w0Var.b(charSequence);
            }
            android.graphics.drawable.Drawable drawable = n2Var != null ? n2Var.f326634d : null;
            gVar.f326557g = drawable;
            if (!gVar.p()) {
                w0Var.c(drawable);
            }
            int i17 = n2Var == null ? Integer.MIN_VALUE : n2Var.f326639i;
            gVar.f326558h = i17;
            if (!gVar.p()) {
                w0Var.f(i17, false);
            }
        } else {
            mi1.g gVar2 = (mi1.g) t2Var;
            boolean p18 = gVar2.p();
            mi1.w0 w0Var2 = gVar2.f326556f;
            if (!p18) {
                w0Var2.i(false);
            }
            if (n2Var.f326638h != null) {
                int i18 = n2Var.f326639i;
                gVar2.f326558h = i18;
                if (!gVar2.p()) {
                    w0Var2.f(i18, true);
                }
                java.util.Map map = n2Var.f326638h;
                gVar2.f326559i = ((mi1.a) map.get("key_type")).ordinal();
                if (!gVar2.p()) {
                    w0Var2.e(map);
                }
                long longValue = ((java.lang.Long) n2Var.f326638h.get("key_show_duration")).longValue();
                mi1.n2$$c n2__c = new mi1.n2$$c(n2Var);
                n2Var.f326641n = n2__c;
                com.tencent.mm.sdk.platformtools.u3.i(n2__c, longValue);
            }
        }
        return remove;
    }
}

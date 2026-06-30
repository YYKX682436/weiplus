package s82;

/* loaded from: classes9.dex */
public class d implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s82.c f404752a;

    public d(s82.c cVar) {
        this.f404752a = cVar;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        if (compoundButton.getTag() == null) {
            return;
        }
        o72.r2 r2Var = (o72.r2) compoundButton.getTag();
        s82.c cVar = this.f404752a;
        if (z17) {
            o72.r2 F = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(r2Var.field_localId);
            if (r2Var.B1) {
                r2Var.C1 = F;
                ((java.util.TreeMap) cVar.f404740d.f404766d).put(r2Var.D1, r2Var);
            } else {
                ((java.util.TreeMap) cVar.f404740d.f404766d).put(com.tencent.mm.sdk.platformtools.t8.f1(java.lang.Long.valueOf(r2Var.field_localId)), F);
            }
        } else if (r2Var.B1) {
            ((java.util.TreeMap) cVar.f404740d.f404766d).remove(r2Var.D1);
        } else {
            ((java.util.TreeMap) cVar.f404740d.f404766d).remove(com.tencent.mm.sdk.platformtools.t8.f1(java.lang.Long.valueOf(r2Var.field_localId)));
        }
        s82.h hVar = cVar.f404740d.f404767e;
        if (hVar != null) {
            hVar.F4(r2Var.field_localId, z17);
        }
    }
}

package ot;

/* loaded from: classes12.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt.h f348339d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(tt.h hVar, tt.i iVar) {
        super(0);
        this.f348339d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.record.ui.RecordMsgDetailUI recordMsgDetailUI;
        r45.ul5 ul5Var;
        java.util.LinkedList linkedList;
        jz5.g gVar = ot.w.f348340m;
        java.util.Iterator it = kz5.n0.S0((java.util.HashSet) ((jz5.n) ot.w.f348340m).getValue()).iterator();
        while (it.hasNext()) {
            tt.j jVar = (tt.j) ((java.lang.ref.WeakReference) it.next()).get();
            if (jVar != null && (ul5Var = (recordMsgDetailUI = ((com.tencent.mm.plugin.record.ui.RecordMsgDetailUI$$b) jVar).f155283a).f155277v) != null && (linkedList = ul5Var.f387465f) != null) {
                java.util.Iterator it6 = linkedList.iterator();
                while (it6.hasNext()) {
                    r45.gp0 gp0Var = (r45.gp0) it6.next();
                    s15.h hVar = this.f348339d.f421766c;
                    if (hVar.getString(hVar.f303422d + 3).equals(gp0Var.T)) {
                        com.tencent.mm.plugin.record.ui.h0 h0Var = recordMsgDetailUI.f155267n;
                        h0Var.f155401g.post(h0Var.f155414w);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}

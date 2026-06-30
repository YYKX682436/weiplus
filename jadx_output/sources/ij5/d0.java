package ij5;

/* loaded from: classes.dex */
public final class d0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f291761d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f291762e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f291763f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f291764g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f291765h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f291761d = jz5.h.b(ij5.x.f291814d);
        this.f291762e = new java.util.ArrayList();
        this.f291763f = jz5.h.b(new ij5.c0(this));
        this.f291764g = jz5.h.b(new ij5.z(activity));
        this.f291765h = jz5.h.b(new ij5.w(this));
    }

    public static final em.l2 T6(ij5.d0 d0Var) {
        return (em.l2) ((jz5.n) d0Var.f291763f).getValue();
    }

    public final void U6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectChatroomConversationSearchUIC", "stopSearch");
        java.util.ArrayList arrayList = this.f291762e;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
        }
        arrayList.clear();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(getActivity(), new ij5.y(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        java.util.ArrayList arrayList = this.f291762e;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
        }
        arrayList.clear();
    }
}

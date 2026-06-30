package j93;

/* loaded from: classes.dex */
public final class w1 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f298527d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f298528e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f298529f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f298530g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f298527d = jz5.h.b(j93.q1.f298483d);
        this.f298528e = new java.util.ArrayList();
        this.f298529f = jz5.h.b(new j93.u1(this));
        this.f298530g = jz5.h.b(new j93.v1(this));
    }

    public static final em.l2 T6(j93.w1 w1Var) {
        return (em.l2) ((jz5.n) w1Var.f298529f).getValue();
    }

    public final void U6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactChatRoomMemberSearchUIC", "stopSearch");
        java.util.ArrayList arrayList = this.f298528e;
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
            Q6.L2(getActivity(), new j93.r1(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        java.util.ArrayList arrayList = this.f298528e;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
        }
        arrayList.clear();
    }
}

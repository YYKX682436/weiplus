package dj5;

/* loaded from: classes.dex */
public final class m extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f233080d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f233081e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f233082f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f233083g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f233084h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f233085i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f233080d = jz5.h.b(dj5.g.f233068d);
        this.f233081e = new java.util.ArrayList();
        this.f233082f = jz5.h.b(new dj5.l(this));
        this.f233083g = jz5.h.b(new dj5.f(this));
        this.f233084h = jz5.h.b(new dj5.e(this));
        this.f233085i = jz5.h.b(new dj5.i(this));
    }

    public static final em.l2 T6(dj5.m mVar) {
        return (em.l2) ((jz5.n) mVar.f233082f).getValue();
    }

    public final void U6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactChatRoomMemberSearchUIC", "stopSearch");
        java.util.ArrayList arrayList = this.f233081e;
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
            Q6.L2(getActivity(), new dj5.h(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        java.util.ArrayList arrayList = this.f233081e;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni((p13.c) it.next());
        }
        arrayList.clear();
    }
}

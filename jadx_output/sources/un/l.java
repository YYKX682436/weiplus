package un;

/* loaded from: classes3.dex */
public final class l extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f429304d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f429305e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f429304d = jz5.h.b(new un.j(this));
        this.f429305e = jz5.h.b(new un.k(this));
    }

    public final java.lang.String O6() {
        return (java.lang.String) ((jz5.n) this.f429304d).getValue();
    }

    public final java.lang.String P6() {
        return (java.lang.String) ((jz5.n) this.f429305e).getValue();
    }

    public final void Q6() {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_exp", getActivity(), kz5.c1.k(new jz5.l("view_id", "still_notify_setting_cell"), new jz5.l("chat_name", O6()), new jz5.l("chatroom_info_sid", P6())), 34574);
    }

    public final void R6(boolean z17, un.i type) {
        kotlin.jvm.internal.o.g(type, "type");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("chat_name", O6());
        lVarArr[1] = new jz5.l("switch_status_after", z17 ? "1" : "0");
        lVarArr[2] = new jz5.l("group_setting_swtich_type", type.f429288d);
        lVarArr[3] = new jz5.l("chatroom_info_sid", P6());
        ((cy1.a) rVar).Ej("group_setting_switch_update", kz5.c1.k(lVarArr), 34574);
    }
}

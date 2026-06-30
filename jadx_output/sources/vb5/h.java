package vb5;

/* loaded from: classes5.dex */
public final class h implements androidx.recyclerview.widget.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vb5.l f434847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f434848b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.List f434849c;

    public h(vb5.l lVar, java.util.List list, java.util.List list2) {
        this.f434847a = lVar;
        this.f434848b = list;
        this.f434849c = list2;
    }

    @Override // androidx.recyclerview.widget.r1
    public void a(int i17, int i18, java.lang.Object obj) {
        java.lang.String str = this.f434847a.f434856e;
        java.util.Objects.toString(obj);
    }

    @Override // androidx.recyclerview.widget.r1
    public void b(int i17, int i18) {
        java.lang.String str = this.f434847a.f434856e;
        int i19 = i18 + i17;
        while (i17 < i19) {
            java.util.List list = this.f434848b;
            if (list.size() > i17) {
                xj5.a data = (xj5.a) list.get(i17);
                kotlin.jvm.internal.o.g(data, "data");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("group_msg_set_top_create", null, data.b(), 26356);
            }
            i17++;
        }
    }

    @Override // androidx.recyclerview.widget.r1
    public void c(int i17, int i18) {
        xj5.a aVar;
        int i19;
        java.lang.String str = this.f434847a.f434856e;
        int i27 = i18 + i17;
        while (i17 < i27) {
            java.util.List list = this.f434849c;
            if (list.size() > i17 && (i19 = (aVar = (xj5.a) list.get(i17)).f454897e) != -1) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("group_msg_set_top_detach", null, kz5.c1.m(kz5.b1.e(new jz5.l("group_bar_close_scene", java.lang.Integer.valueOf(i19))), aVar.b()), 26356);
            }
            i17++;
        }
    }

    @Override // androidx.recyclerview.widget.r1
    public void d(int i17, int i18) {
        java.lang.String str = this.f434847a.f434856e;
    }
}

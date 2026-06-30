package vp2;

/* loaded from: classes2.dex */
public final class e0 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.oa2 f438917d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.fa2 f438918e;

    public e0(r45.oa2 notice, r45.fa2 container) {
        kotlin.jvm.internal.o.g(notice, "notice");
        kotlin.jvm.internal.o.g(container, "container");
        this.f438917d = notice;
        this.f438918e = container;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (obj instanceof vp2.e0) {
            r45.h32 h32Var = (r45.h32) ((vp2.e0) obj).f438917d.getCustom(0);
            java.lang.String string = h32Var != null ? h32Var.getString(4) : null;
            r45.h32 h32Var2 = (r45.h32) this.f438917d.getCustom(0);
            if (kotlin.jvm.internal.o.b(string, h32Var2 != null ? h32Var2.getString(4) : null)) {
                return 0;
            }
        }
        return -1;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 5;
    }
}

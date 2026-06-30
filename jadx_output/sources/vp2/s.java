package vp2;

/* loaded from: classes2.dex */
public final class s implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.pw1 f438954d;

    public s(r45.pw1 entryInfo, r45.fa2 container) {
        kotlin.jvm.internal.o.g(entryInfo, "entryInfo");
        kotlin.jvm.internal.o.g(container, "container");
        this.f438954d = entryInfo;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (obj instanceof vp2.s) {
            r45.pw1 pw1Var = this.f438954d;
            int integer = pw1Var.getInteger(0);
            r45.pw1 pw1Var2 = ((vp2.s) obj).f438954d;
            if (integer == pw1Var2.getInteger(0) && kotlin.jvm.internal.o.b(pw1Var2.getString(1), pw1Var.getString(1)) && kotlin.jvm.internal.o.b(pw1Var2.getString(2), pw1Var.getString(2))) {
                return 0;
            }
        }
        return -1;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f438954d.getInteger(0);
    }

    @Override // in5.c
    public int h() {
        return 17;
    }
}

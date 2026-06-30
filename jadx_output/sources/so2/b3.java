package so2;

/* loaded from: classes3.dex */
public final class b3 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.zy1 f410268d;

    public b3(r45.zy1 winnerInfo) {
        kotlin.jvm.internal.o.g(winnerInfo, "winnerInfo");
        this.f410268d = winnerInfo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        r45.zy1 zy1Var = obj instanceof r45.zy1 ? (r45.zy1) obj : null;
        if (zy1Var == null) {
            return -1;
        }
        java.lang.String string = zy1Var.getString(0);
        r45.zy1 zy1Var2 = this.f410268d;
        return (kotlin.jvm.internal.o.b(string, zy1Var2.getString(0)) && kotlin.jvm.internal.o.b(zy1Var.getString(1), zy1Var2.getString(1))) ? 0 : -1;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return so2.b3.class.hashCode();
    }
}

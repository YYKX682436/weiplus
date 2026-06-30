package so2;

/* loaded from: classes2.dex */
public final class m4 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.ao5 f410481d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f410482e;

    public m4(r45.ao5 info) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f410481d = info;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return -1;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return so2.m4.class.getName().hashCode();
    }
}

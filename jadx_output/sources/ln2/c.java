package ln2;

/* loaded from: classes10.dex */
public final class c implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.b04 f319877d;

    public c(r45.b04 wishType) {
        kotlin.jvm.internal.o.g(wishType, "wishType");
        this.f319877d = wishType;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        ln2.c cVar = obj instanceof ln2.c ? (ln2.c) obj : null;
        return (cVar == null || !com.tencent.mm.sdk.platformtools.t8.C0(cVar.f319877d, this.f319877d)) ? -1 : 0;
    }

    @Override // in5.c
    public long getItemId() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return so2.u2.class.hashCode();
    }
}

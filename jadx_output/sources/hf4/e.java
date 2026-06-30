package hf4;

/* loaded from: classes4.dex */
public final class e implements ip0.c {

    /* renamed from: d, reason: collision with root package name */
    public final r45.xe6 f281224d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f281225e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.storage.s7 f281226f;

    public e(r45.xe6 mediaObj, java.lang.String str, com.tencent.mm.storage.s7 fromscene) {
        kotlin.jvm.internal.o.g(mediaObj, "mediaObj");
        kotlin.jvm.internal.o.g(fromscene, "fromscene");
        this.f281224d = mediaObj;
        this.f281225e = str;
        this.f281226f = fromscene;
    }

    @Override // ip0.c
    public java.lang.String n() {
        r45.xe6 xe6Var = this.f281224d;
        java.lang.String str = xe6Var.f390025h;
        boolean z17 = str == null || str.length() == 0;
        com.tencent.mm.storage.s7 s7Var = this.f281226f;
        if (z17) {
            return xe6Var.f390021d + '_' + s7Var.f195312a;
        }
        return xe6Var.f390025h + '_' + s7Var.f195312a;
    }
}

package k31;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final k31.a f303822a;

    public b(k31.a aVar) {
        this.f303822a = aVar;
    }

    public final void a(java.lang.String bizUsername, java.util.List toSaveList, boolean z17, boolean z18, boolean z19) {
        kotlin.jvm.internal.o.g(bizUsername, "bizUsername");
        kotlin.jvm.internal.o.g(toSaveList, "toSaveList");
        k31.a aVar = this.f303822a;
        if (aVar == null) {
            return;
        }
        k31.o.f303850a.b(aVar, new l31.b0(bizUsername, toSaveList, z17, z18, z19, aVar, null, 64, null));
    }
}

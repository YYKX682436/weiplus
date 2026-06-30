package r16;

/* loaded from: classes16.dex */
public final class y extends f26.b2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r16.z f368683i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(boolean z17, boolean z18, r16.z zVar, g26.j jVar, g26.l lVar) {
        super(z17, z18, true, zVar, jVar, lVar);
        this.f368683i = zVar;
    }

    @Override // f26.b2
    public boolean b(i26.i subType, i26.i superType) {
        kotlin.jvm.internal.o.g(subType, "subType");
        kotlin.jvm.internal.o.g(superType, "superType");
        if (!(subType instanceof f26.o0)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (superType instanceof f26.o0) {
            return ((java.lang.Boolean) this.f368683i.f368688e.invoke(subType, superType)).booleanValue();
        }
        throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
    }
}

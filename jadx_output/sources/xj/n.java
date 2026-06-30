package xj;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final wj.r0 f454761a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Intent f454762b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f454763c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f454764d;

    public n(wj.r0 launchAppShowType, android.content.Intent intent, android.content.Context context, java.util.Map map) {
        kotlin.jvm.internal.o.g(launchAppShowType, "launchAppShowType");
        this.f454761a = launchAppShowType;
        this.f454762b = intent;
        this.f454763c = context;
        this.f454764d = map;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xj.n)) {
            return false;
        }
        xj.n nVar = (xj.n) obj;
        return this.f454761a == nVar.f454761a && kotlin.jvm.internal.o.b(this.f454762b, nVar.f454762b) && kotlin.jvm.internal.o.b(this.f454763c, nVar.f454763c) && kotlin.jvm.internal.o.b(this.f454764d, nVar.f454764d);
    }

    public int hashCode() {
        int hashCode = this.f454761a.hashCode() * 31;
        android.content.Intent intent = this.f454762b;
        int hashCode2 = (hashCode + (intent == null ? 0 : intent.hashCode())) * 31;
        android.content.Context context = this.f454763c;
        int hashCode3 = (hashCode2 + (context == null ? 0 : context.hashCode())) * 31;
        java.util.Map map = this.f454764d;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "MagicAdOpenArgs(launchAppShowType=" + this.f454761a + ", extIntent=" + this.f454762b + ", context=" + this.f454763c + ", schemeUrlQuery=" + this.f454764d + ')';
    }

    public /* synthetic */ n(wj.r0 r0Var, android.content.Intent intent, android.content.Context context, java.util.Map map, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? wj.r0.f446499e : r0Var, (i17 & 2) != 0 ? null : intent, (i17 & 4) != 0 ? null : context, (i17 & 8) != 0 ? null : map);
    }
}

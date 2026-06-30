package l31;

/* loaded from: classes9.dex */
public final class b0 extends l31.b {

    /* renamed from: e, reason: collision with root package name */
    public final k31.a f315317e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f315318f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f315319g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f315320h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f315321i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.lang.String username, java.util.List toSaveList, boolean z17, boolean z18, boolean z19, k31.a aVar, e31.l lVar, int i17, kotlin.jvm.internal.i iVar) {
        super(username);
        aVar = (i17 & 32) != 0 ? null : aVar;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(toSaveList, "toSaveList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f315318f = arrayList;
        this.f315317e = aVar;
        arrayList.addAll(toSaveList);
        this.f315319g = z17;
        this.f315320h = z18;
        this.f315321i = z19;
    }

    @Override // l31.u
    public void run() {
        l31.a0 a0Var = new l31.a0(this);
        if (com.tencent.mm.sdk.platformtools.u3.e()) {
            a0Var.invoke();
        } else {
            com.tencent.mm.sdk.platformtools.u3.h(new l31.z(a0Var));
        }
    }
}
